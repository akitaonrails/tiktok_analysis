package X;

import Y.ACListenerS111S0200000_7;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Icj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470510Icj extends AbstractC21673619ry<C470520Ick> {
    public List<TranslatedRegion> LL;
    public final List<TranslatedRegion> LLILLJJLI;
    public List<TranslatedRegion> LLILZ;
    public Set<String> LLILZLL;
    public final C11PQ<Boolean> LLILLL = C11PQ.LJLLLLLL(Boolean.FALSE);
    public String LLILZIL = "";

    public final List<TranslatedRegion> LLLFZ() {
        List<TranslatedRegion> list = this.LL;
        ArrayList arrayList = new ArrayList();
        for (TranslatedRegion translatedRegion : list) {
            if (translatedRegion.selected) {
                arrayList.add(translatedRegion);
            }
        }
        return arrayList;
    }

    public final void LLLI() {
        TranslatedRegion next;
        List<TranslatedRegion> list = this.LLILLJJLI;
        ArrayList<TranslatedRegion> arrayList = new ArrayList();
        for (TranslatedRegion translatedRegion : list) {
            if (translatedRegion.selected) {
                arrayList.add(translatedRegion);
            }
        }
        for (TranslatedRegion translatedRegion2 : arrayList) {
            Iterator<TranslatedRegion> it2 = this.LL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.code, translatedRegion2.code)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TranslatedRegion translatedRegion3 = next;
            if (translatedRegion3 != null) {
                translatedRegion3.setSelected(true);
            }
        }
    }

    public final void LLLII() {
        List<TranslatedRegion> listLJLIL;
        Set<String> set = this.LLILZLL;
        if (set != null) {
            List<TranslatedRegion> list = this.LL;
            ArrayList arrayList = new ArrayList();
            for (TranslatedRegion translatedRegion : list) {
                if (set.contains(translatedRegion.code)) {
                    arrayList.add(translatedRegion);
                }
            }
            List<TranslatedRegion> list2 = this.LL;
            ArrayList arrayList2 = new ArrayList();
            for (TranslatedRegion translatedRegion2 : list2) {
                if (!set.contains(translatedRegion2.code)) {
                    arrayList2.add(translatedRegion2);
                }
            }
            listLJLIL = C13LP.LJLIL(arrayList2, arrayList);
        } else {
            listLJLIL = this.LL;
        }
        if (this.LLILZIL.length() != 0) {
            ArrayList arrayList3 = new ArrayList();
            for (TranslatedRegion translatedRegion3 : listLJLIL) {
                TranslatedRegion translatedRegion4 = translatedRegion3;
                if (a0.LJJIIZI(translatedRegion4.translation, this.LLILZIL, true) || a0.LJJIIZI(translatedRegion4.code, this.LLILZIL, true)) {
                    arrayList3.add(translatedRegion3);
                }
            }
            listLJLIL = arrayList3;
        }
        this.LLILZ = listLJLIL;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZ.size();
    }

    public final void LLLIIIIL(List<String> list) {
        Set<String> setLLIIJI = null;
        if (list != null && (!list.isEmpty())) {
            setLLIIJI = C13LP.LLIIJI(list);
        }
        this.LLILZLL = setLLIIJI;
        LLLII();
        notifyDataSetChanged();
    }

    public C470510Icj(C13BV c13bv, List list) {
        this.LL = c13bv;
        this.LLILLJJLI = list;
        this.LLILZ = this.LL;
        LLLI();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String strLIZIZ;
        int i2;
        C470520Ick c470520Ick = (C470520Ick) viewHolder;
        TranslatedRegion translatedRegion = (TranslatedRegion) ListProtector.get(this.LLILZ, i);
        TextView textView = c470520Ick.LL;
        if (a0.LJJJIL(translatedRegion.code)) {
            strLIZIZ = translatedRegion.translation;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(translatedRegion.translation);
            sbLIZ.append((char) 65288);
            sbLIZ.append(translatedRegion.code);
            sbLIZ.append((char) 65289);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        textView.setText(strLIZIZ);
        ImageView imageView = c470520Ick.LLILLJJLI;
        if (translatedRegion.selected) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJZI(i2, imageView);
        C786410Ut5.I7(new ACListenerS111S0200000_7(translatedRegion, this, 35), c470520Ick.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C470520Ick c470520Ick = new C470520Ick(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cw_, viewGroup, false));
        try {
            View view = c470520Ick.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c470520Ick.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c470520Ick.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C470520Ick.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c470520Ick.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c470520Ick.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C470520Ick.class.getName();
        return c470520Ick;
    }
}
