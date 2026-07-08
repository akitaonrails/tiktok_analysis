package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageIntParam;
import com.ss.android.ugc.aweme.image.collage.model.CollageGroup;
import com.ss.android.ugc.aweme.image.collage.model.CollageIntProtocol;
import com.zhiliaoapp.musically.R;
import irm.AkS8S0201000_12;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0TM3, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TM3 extends AbstractC21673619ry<C0TM4> {
    public int LL = -1;
    public final List<C0TM6> LLILLJJLI;
    public Map<Integer, Integer> LLILLL;
    public Map<String, Integer> LLILZ;
    public C0TM5 LLILZIL;
    public int LLILZLL;
    public int LLIZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C0TM3() {
        List list = (List) C304460Bwa.LIZJ.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            List list2 = ((CollageGroup) it2.next()).collageList;
            list2 = list2 == null ? C13BV.INSTANCE : list2;
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                CollageIntParam collageIntParamLJIIIIZZ = C1454030nwP.LJIIIIZZ((CollageIntProtocol) it3.next());
                if (collageIntParamLJIIIIZZ != null) {
                    arrayList2.add(new C0TM6(collageIntParamLJIIIIZZ));
                }
            }
            C19719612Di.LJJI(arrayList2, arrayList);
        }
        this.LLILLJJLI = arrayList;
        this.LLILLL = C2097608Jq.LJ();
        this.LLILZ = C2097608Jq.LJ();
        this.LLILZLL = 2;
        this.LLIZ = 9;
        if (arrayList.isEmpty()) {
            this.LLILLL = C2097608Jq.LJ();
            this.LLILZ = C2097608Jq.LJ();
            notifyDataSetChanged();
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        int size = 0;
        for (CollageGroup collageGroup : (List) C304460Bwa.LIZJ.getValue()) {
            Integer num = collageGroup.imageCount;
            if (num != null) {
                linkedHashMap.put(Integer.valueOf(num.intValue()), Integer.valueOf(size));
                List<CollageIntProtocol> list3 = collageGroup.collageList;
                size += list3 != null ? list3.size() : 0;
            }
        }
        this.LLILLL = linkedHashMap;
        List<C0TM6> list4 = this.LLILLJJLI;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list4, 10));
        for (Object obj : (ArrayList) list4) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            arrayList3.add(new Pair(((C0TM6) obj).LIZ.getCollageId(), Integer.valueOf(i)));
            i = i2;
        }
        this.LLILZ = C2097608Jq.LJIILLIIL(arrayList3);
        notifyDataSetChanged();
        Integer num2 = (Integer) C13LP.LJJLL(linkedHashMap.keySet());
        this.LLILZLL = num2 != null ? num2.intValue() : 2;
        Integer num3 = (Integer) C13LP.LJJLIIIJLJLI(linkedHashMap.keySet());
        this.LLIZ = num3 != null ? num3.intValue() : 9;
    }

    public final void LLLFZ(int i) {
        if (i >= 0 && i < getItemCount()) {
            int i2 = this.LL;
            this.LL = i;
            if (i2 >= 0 && i2 < getItemCount()) {
                notifyItemChanged(i2);
            }
            notifyItemChanged(this.LL);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0TM4 c0tm4 = (C0TM4) viewHolder;
        C0TM6 c0tm6 = (C0TM6) ListProtector.get(this.LLILLJJLI, i);
        CollageIntParam collageIntParam = c0tm6.LIZ;
        c0tm4.LL.setColorRes(R.attr.a1h);
        c0tm4.LL.setPattern(collageIntParam);
        if (i == this.LL) {
            C0GSR c0gsr = c0tm4.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gsr);
            c0gsr.setAlpha(1.0f);
            View view = c0tm4.LLILLJJLI;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zj);
            view.setBackground(c384050F3z.LIZ(c0tm4.LLILLJJLI.getContext()));
        } else {
            C0GSR c0gsr2 = c0tm4.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gsr2);
            c0gsr2.setAlpha(0.6f);
            c0tm4.LLILLJJLI.setBackground(null);
        }
        C786410Ut5.I7(new AkS8S0201000_12(this, i, c0tm6, 0), c0tm4.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0TM4 c0tm4 = new C0TM4(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cwf, viewGroup, false));
        try {
            View view = c0tm4.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0tm4.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0tm4.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0TM4.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0tm4.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0tm4.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0TM4.class.getName();
        return c0tm4;
    }
}
