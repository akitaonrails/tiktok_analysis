package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nBS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1424920nBS extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final C19EG LL;
    public final Scene LLILLJJLI;
    public final List<Float> LLILLL;
    public final Function0<Boolean> LLILZ;
    public final TemplateCategoryData LLILZIL;
    public final InterfaceC1424890nBP LLILZLL;
    public boolean LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public C1DRG LLJILJILJ;
    public List<Float> LLJILLL;
    public boolean LLJJI;
    public List<C1419590n2r> LLIZ = C13BV.INSTANCE;
    public boolean LLIZLLLIL = true;
    public final Map<Integer, C1425080nBi> LLJJ = new LinkedHashMap();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        if (this.LLIZ.isEmpty() && C1423570n9H.LIZJ(this.LLILZIL)) {
            return 0;
        }
        return this.LLIZLLLIL ? this.LLIZ.size() + (this.LLJI ? 1 : 0) : this.LLIZ.size() + 1;
    }

    public final C1419590n2r LLLFZ(int i) {
        return (C1419590n2r) C13LP.LJJJLZIJ(i, this.LLIZ);
    }

    public final int LLLI(C1419590n2r c1419590n2r) {
        Iterator<C1419590n2r> it2 = this.LLIZ.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (!Intrinsics.LJFF(it2.next().LIZ.getAsset_id(), c1419590n2r.LIZ.getAsset_id())) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (!this.LLIZLLLIL && i == getItemCount() - 1) {
            return 2;
        }
        if (this.LLJI && i == getItemCount() - 1) {
            return 3;
        }
        return i + 10;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C1425080nBi c1425080nBi;
        super.onViewRecycled(viewHolder);
        String str = null;
        if ((viewHolder instanceof C1425080nBi) && (c1425080nBi = (C1425080nBi) viewHolder) != null) {
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TemplateItemAdapter#onViewRecycled: ");
            CutsameDataItem cutsameDataItem = c1425080nBi.LLJJ;
            if (cutsameDataItem != null) {
                str = cutsameDataItem.title;
            }
            sbLIZ.append(str);
            C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
            c1425080nBi.V5(false);
            int i = -1;
            for (Map.Entry entry : ((LinkedHashMap) this.LLJJ).entrySet()) {
                int iIntValue = ((Number) entry.getKey()).intValue();
                if (Intrinsics.LJFF(entry.getValue(), c1425080nBi)) {
                    i = iIntValue;
                }
            }
            this.LLJJ.remove(Integer.valueOf(i));
        }
    }

    public final void LLLII(List<C1419590n2r> list, C1422890n8B c1422890n8B) {
        List<Float> list2;
        boolean z = c1422890n8B.LIZ;
        this.LLIZLLLIL = z;
        if (this.LLJJI && this.LLJI != z) {
            this.LLJI = z;
            notifyItemChanged(this.LLIZ.size());
        }
        this.LLJ = false;
        int i = c1422890n8B.LIZLLL;
        if (i >= 0 && i < list.size() && c1422890n8B.LIZLLL < this.LLIZ.size()) {
            int i2 = c1422890n8B.LIZLLL;
            int size = list.size() - i2;
            this.LLIZ = list;
            notifyItemRangeChanged(i2, size);
            return;
        }
        if (C1423860n9k.LIZ(list, this.LLIZ)) {
            int size2 = this.LLIZ.size();
            int size3 = list.size() - size2;
            this.LLIZ = list;
            notifyItemRangeChanged(size2, size3);
            return;
        }
        if (!C1423860n9k.LIZIZ(this.LLIZ, list)) {
            if (C1425070nBh.LIZJ.nextInt(2) == 0) {
                list2 = C1425070nBh.LIZ;
            } else {
                list2 = C1425070nBh.LIZIZ;
            }
            this.LLJILLL = list2;
            this.LLIZ = list;
            notifyDataSetChanged();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01dd  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(final androidx.recyclerview.widget.RecyclerView.ViewHolder r14, final int r15) {
        /*
            Method dump skipped, instruction units count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1424920nBS.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1424910nBR;
        int i2;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(C1425570nCV.LIZIZ.LJFF(this.LLILLJJLI.requireSceneContext()));
        if (i != 2) {
            if (i != 3) {
                boolean zBooleanValue = ((Boolean) C0BOL.LIZ.getValue()).booleanValue();
                C19EG c19eg = this.LL;
                Scene scene = this.LLILLJJLI;
                Function0<Boolean> function0 = this.LLILZ;
                if (zBooleanValue) {
                    i2 = R.layout.sq;
                } else {
                    i2 = R.layout.sp;
                }
                c1424910nBR = new C1425080nBi(c19eg, scene, function0, C786410Ut5.Td(layoutInflaterNe, i2, viewGroup, false));
            } else {
                c1424910nBR = new C1424910nBR(C786410Ut5.Td(layoutInflaterNe, R.layout.sm, viewGroup, false));
            }
        } else {
            final View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.sr, viewGroup, false);
            c1424910nBR = new RecyclerView.ViewHolder(viewTd) { // from class: X.0nBY
            };
        }
        try {
            View view = c1424910nBR.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1424910nBR.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1424910nBR.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1424910nBR.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1424910nBR.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1424910nBR.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1424910nBR.getClass().getName();
        return c1424910nBR;
    }

    public C1424920nBS(C19EG c19eg, Scene scene, List list, C1424870nBN c1424870nBN, TemplateCategoryData templateCategoryData, C1424880nBO c1424880nBO) {
        this.LL = c19eg;
        this.LLILLJJLI = scene;
        this.LLILLL = list;
        this.LLILZ = c1424870nBN;
        this.LLILZIL = templateCategoryData;
        this.LLILZLL = c1424880nBO;
        this.LLJILLL = list;
    }
}
