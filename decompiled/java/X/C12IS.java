package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12IS, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12IS {
    public final C12I9 LIZ;
    public C12J7 LIZIZ;
    public InterfaceC19731812Ia LIZJ;
    public final C12JD LIZLLL;
    public final C12JP LJ;
    public final HashMap<String, Float> LJFF = new HashMap<>();

    public final boolean LIZ() {
        InterfaceC19732212Ie interfaceC19732212Ie = (InterfaceC19732212Ie) this.LIZLLL.LIZ(InterfaceC19732212Ie.class);
        if (interfaceC19732212Ie != null) {
            return interfaceC19732212Ie.LIZIZ();
        }
        return false;
    }

    public final ComposerBeauty LIZIZ() {
        C12IV c12iv = (C12IV) this.LIZLLL.LIZ(C12IV.class);
        C12IV c12iv2 = (C12IV) this.LIZLLL.LIZ(C12IV.class);
        if (c12iv2 != null ? c12iv2.LIZLLL() : false) {
            if (c12iv != null) {
                return c12iv.LJIILJJIL();
            }
            return null;
        }
        if (c12iv != null) {
            return c12iv.LJIIIZ();
        }
        return null;
    }

    public final boolean LJ() {
        InterfaceC19732212Ie interfaceC19732212Ie = (InterfaceC19732212Ie) this.LIZLLL.LIZ(InterfaceC19732212Ie.class);
        if (interfaceC19732212Ie != null) {
            return interfaceC19732212Ie.LJ();
        }
        return true;
    }

    public static List LIZJ(ComposerBeauty composerBeauty) {
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (items != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(items, 10));
            Iterator<ComposerBeautyExtraBeautify.ItemsBean> it2 = items.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().tag);
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public static final void LJFF(int i, C12IS c12is, int i2, ComposerBeauty composerBeauty) {
        composerBeauty.setProgressValue(i);
        boolean zLIZLLL = c12is.LIZ.Ye().LIZLLL(composerBeauty, false);
        boolean zLJ = C12HP.LJ(composerBeauty);
        if (zLIZLLL && zLJ) {
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (items != null && !items.isEmpty()) {
                for (ComposerBeautyExtraBeautify.ItemsBean itemsBean : items) {
                    float fLIZ = C12I3.LIZ(new C12I4(itemsBean.doubleDirection, itemsBean.max, itemsBean.min, 0.0f, i, 0.0f, 1868));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(composerBeauty.getEffect().getUnzipPath());
                    sbLIZ.append(':');
                    sbLIZ.append(itemsBean.tag);
                    c12is.LJFF.put(C2188811AlT.LIZIZ(sbLIZ), Float.valueOf(fLIZ));
                    C12J7 c12j7 = c12is.LIZIZ;
                    if (c12j7 != null) {
                        c12j7.V(composerBeauty.getEffect().getUnzipPath(), itemsBean.tag, fLIZ / 100.0f);
                    }
                }
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("update composer error, beautyAvailable:");
        sbLIZ2.append(zLIZLLL);
        sbLIZ2.append(",canUpdateComposerNode:");
        sbLIZ2.append(zLJ);
        sbLIZ2.append(",effectId:");
        sbLIZ2.append(composerBeauty.getEffect().getEffectId());
        sbLIZ2.append(",name:");
        sbLIZ2.append(composerBeauty.getEffect().getName());
        sbLIZ2.append(",id:");
        sbLIZ2.append(composerBeauty.getEffect().getId());
        C19570511hX.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJI(int i, C19735912Jp c19735912Jp, HashMap map, ComposerBeauty composerBeauty) {
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (items != null && !items.isEmpty()) {
            Iterator<ComposerBeautyExtraBeautify.ItemsBean> it2 = items.iterator();
            while (it2.hasNext()) {
                LIZLLL(composerBeauty, it2.next(), c19735912Jp, i, composerBeauty);
            }
        }
    }

    public C12IS(C12JP c12jp, C12JD c12jd, C12I9 c12i9, C12J7 c12j7, InterfaceC19731812Ia interfaceC19731812Ia) {
        this.LIZ = c12i9;
        this.LIZIZ = c12j7;
        this.LIZJ = interfaceC19731812Ia;
        this.LIZLLL = c12jd;
        this.LJ = c12jp;
    }

    public final void LIZLLL(ComposerBeauty composerBeauty, ComposerBeautyExtraBeautify.ItemsBean itemsBean, C19735912Jp c19735912Jp, int i, ComposerBeauty composerBeauty2) {
        C12HU<BeautyComposerInfo> c12hu;
        boolean z = itemsBean.doubleDirection;
        c19735912Jp.getMaxPercent();
        float fLIZ = C12I3.LIZ(new C12I4(z, itemsBean.max, itemsBean.min, 0.0f, i, 0.0f, 1868));
        this.LIZ.se(composerBeauty2, itemsBean.tag, fLIZ);
        C12HU<BeautyComposerInfo> c12huUe = this.LIZ.ue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(composerBeauty.getEffect().getUnzipPath());
        sbLIZ.append(':');
        sbLIZ.append(itemsBean.tag);
        sbLIZ.append(':');
        float f = fLIZ / 100.0f;
        sbLIZ.append(f);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String extra = composerBeauty.getEffect().getExtra();
        String str = "";
        if (extra == null) {
            extra = "";
        }
        c12huUe.add(new BeautyComposerInfo(strLIZIZ, extra, composerBeauty.getEffect().getEffectId(), (String) null, 24));
        if (C12HP.LIZLLL(composerBeauty)) {
            this.LIZ.te(composerBeauty2);
            this.LIZ.Re();
        } else {
            this.LIZ.hf(composerBeauty2);
            this.LIZ.ze();
        }
        BeautyCategoryExtra categoryExtra = composerBeauty2.getCategoryExtra();
        if (categoryExtra != null && !Intrinsics.LJFF(categoryExtra.parentId, "null") && (c12hu = this.LIZ.Me().get(composerBeauty2.getCategoryExtra().categoryId)) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(composerBeauty.getEffect().getUnzipPath());
            sbLIZ2.append(':');
            sbLIZ2.append(itemsBean.tag);
            sbLIZ2.append(':');
            sbLIZ2.append(f);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            String extra2 = composerBeauty.getEffect().getExtra();
            if (extra2 != null) {
                str = extra2;
            }
            c12hu.add(new BeautyComposerInfo(strLIZIZ2, str, composerBeauty.getEffect().getEffectId(), (String) null, 24));
        }
    }
}
