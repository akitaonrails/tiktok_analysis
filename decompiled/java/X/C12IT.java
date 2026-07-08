package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12IT, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12IT {
    public final C12I9 LIZ;
    public C12J7 LIZIZ;
    public InterfaceC19731812Ia LIZJ;
    public final C12JP LIZLLL;
    public final C12JD LJ;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ() {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12IT.LIZJ():boolean");
    }

    public final void LJ() {
        InterfaceC19731812Ia interfaceC19731812Ia = this.LIZJ;
        if (interfaceC19731812Ia != null) {
            interfaceC19731812Ia.LJII();
        }
        C12JP c12jp = this.LIZLLL;
        this.LIZ.Ae();
        InterfaceC19731912Ib interfaceC19731912Ib = c12jp.LIZ;
        if (interfaceC19731912Ib != null) {
            interfaceC19731912Ib.LJIIIZ("confirm");
        }
        C12IV c12iv = (C12IV) this.LJ.LIZ(C12IV.class);
        if (c12iv != null) {
            c12iv.LJIILIIL();
        }
    }

    public static final void LIZ(List<ComposerBeauty> list, C013C c013c) {
        ComposerBeauty composerBeauty;
        ComposerBeauty next;
        ArrayList<ComposerBeauty> arrayList = new ArrayList();
        for (ComposerBeauty composerBeauty2 : list) {
            ComposerBeauty composerBeauty3 = composerBeauty2;
            if (composerBeauty3.isCollectionType() && composerBeauty3.getEnable()) {
                arrayList.add(composerBeauty2);
            }
        }
        for (ComposerBeauty composerBeauty4 : arrayList) {
            List<ComposerBeauty> childList = composerBeauty4.getChildList();
            if (childList != null) {
                Iterator<ComposerBeauty> it2 = childList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.getExtra().getDefault()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                ComposerBeauty composerBeauty5 = next;
                if (composerBeauty5 != null) {
                    if (!composerBeauty5.getSelected()) {
                        c013c.element = false;
                    }
                }
            }
            List<ComposerBeauty> childList2 = composerBeauty4.getChildList();
            if (childList2 != null && (composerBeauty = (ComposerBeauty) C13LP.LJJJLL(childList2)) != null && !composerBeauty.getSelected()) {
                c013c.element = false;
            }
        }
    }

    public static final void LIZIZ(List<ComposerBeauty> list, C013C c013c) {
        ComposerBeauty next;
        Iterator<ComposerBeauty> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getExtra().getDefault()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        ComposerBeauty composerBeauty = next;
        if (composerBeauty != null) {
            if (!composerBeauty.getSelected()) {
                c013c.element = false;
            }
        } else {
            ComposerBeauty composerBeauty2 = (ComposerBeauty) C13LP.LJJJLL(list);
            if (composerBeauty2 == null || composerBeauty2.getSelected()) {
                return;
            }
            c013c.element = false;
        }
    }

    public static final void LJFF(ComposerBeauty composerBeauty, C12IT c12it) {
        boolean z;
        ComposerBeauty next;
        boolean z2;
        List<ComposerBeauty> childList = composerBeauty.getChildList();
        if (childList != null) {
            Iterator<ComposerBeauty> it2 = childList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    ComposerBeauty composerBeauty2 = next;
                    if (composerBeauty2.getExtra().getDefault() && composerBeauty2.getEnable()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ComposerBeauty composerBeauty3 = next;
            if (composerBeauty3 != null) {
                List<ComposerBeauty> childList2 = composerBeauty.getChildList();
                if (childList2 != null) {
                    for (ComposerBeauty composerBeauty4 : childList2) {
                        if (Intrinsics.LJFF(composerBeauty3, composerBeauty4) && composerBeauty4.getEnable()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        composerBeauty4.setSelected(z2);
                    }
                }
                if (composerBeauty3.getSelected()) {
                    c12it.LIZ.te(composerBeauty3);
                    c12it.LIZ.Re();
                    c12it.LIZ.jf(composerBeauty3);
                    C12IV c12iv = (C12IV) c12it.LJ.LIZ(C12IV.class);
                    if (c12iv != null) {
                        c12iv.LIZIZ(composerBeauty3);
                    }
                }
                c12it.LJIIJ(composerBeauty3, null);
                return;
            }
        }
        List<ComposerBeauty> childList3 = composerBeauty.getChildList();
        if (childList3 != null && (!childList3.isEmpty())) {
            ComposerBeauty composerBeauty5 = (ComposerBeauty) ListProtector.get(childList3, 0);
            List<ComposerBeauty> childList4 = composerBeauty.getChildList();
            if (childList4 != null) {
                for (ComposerBeauty composerBeauty6 : childList4) {
                    if (Intrinsics.LJFF(composerBeauty5, composerBeauty6) && composerBeauty6.getEnable()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    composerBeauty6.setSelected(z);
                }
            }
            if (composerBeauty5.getSelected()) {
                c12it.LIZ.te(composerBeauty5);
                c12it.LIZ.Re();
                c12it.LIZ.jf(composerBeauty5);
                C12IV c12iv2 = (C12IV) c12it.LJ.LIZ(C12IV.class);
                if (c12iv2 != null) {
                    c12iv2.LIZIZ(composerBeauty5);
                }
            }
            c12it.LJIIJ(composerBeauty5, null);
        }
    }

    public static final void LJI(ComposerBeauty composerBeauty, C12IT c12it) {
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (items != null && !items.isEmpty()) {
            for (ComposerBeautyExtraBeautify.ItemsBean itemsBean : items) {
                C12I4 c12i4LIZIZ = C12I3.LIZIZ(new C12I4(itemsBean.doubleDirection, itemsBean.max, itemsBean.min, itemsBean.value, 0, 0.0f, 1932));
                C12JN c12jn = (C12JN) c12it.LJ.LIZ(C12JN.class);
                int iIntValue = Integer.valueOf(c12i4LIZIZ.LJFF).intValue();
                if (c12jn != null) {
                    c12jn.LIZLLL(iIntValue);
                }
                composerBeauty.setProgressValue(iIntValue);
            }
        }
    }

    public static final void LJII(ComposerBeauty composerBeauty, Function1<? super ComposerBeauty, Unit> function1) {
        if (composerBeauty.isCollectionType()) {
            List<ComposerBeauty> childList = composerBeauty.getChildList();
            if (childList != null) {
                Iterator<ComposerBeauty> it2 = childList.iterator();
                while (it2.hasNext()) {
                    function1.invoke(it2.next());
                }
                return;
            }
            return;
        }
        function1.invoke(composerBeauty);
    }

    public static final void LJIIIIZZ(ComposerBeauty composerBeauty, C12IT c12it) {
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (items != null && !items.isEmpty()) {
            for (ComposerBeautyExtraBeautify.ItemsBean itemsBean : items) {
                c12it.LIZ.se(composerBeauty, itemsBean.tag, Integer.valueOf(itemsBean.value).floatValue());
            }
        }
    }

    public static final void LJIIIZ(ComposerBeauty composerBeauty, C12IT c12it) {
        boolean zIsCollectionType = composerBeauty.isCollectionType();
        if (zIsCollectionType) {
            List<ComposerBeauty> childList = composerBeauty.getChildList();
            if (childList != null) {
                Iterator<ComposerBeauty> it2 = childList.iterator();
                while (it2.hasNext()) {
                    LJIIIIZZ(it2.next(), c12it);
                }
                return;
            }
            return;
        }
        if (!zIsCollectionType) {
            LJIIIIZZ(composerBeauty, c12it);
            return;
        }
        throw new C1954807lC();
    }

    public final void LJIIJ(ComposerBeauty composerBeauty, Float f) {
        float fFloatValue;
        this.LIZ.ve(composerBeauty, new C19732112Id(this));
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (items != null && !items.isEmpty()) {
            for (ComposerBeautyExtraBeautify.ItemsBean itemsBean : items) {
                if (this.LIZ.Ye().LIZLLL(composerBeauty, false) && C12HP.LJ(composerBeauty)) {
                    if (f != null) {
                        fFloatValue = f.floatValue();
                    } else {
                        fFloatValue = Integer.valueOf(itemsBean.value).floatValue();
                    }
                    C12J7 c12j7 = this.LIZIZ;
                    if (c12j7 != null) {
                        c12j7.V(composerBeauty.getEffect().getUnzipPath(), itemsBean.tag, fFloatValue / 100.0f);
                    }
                }
            }
        }
    }

    public static void LIZLLL(C12IT c12it, ComposerBeauty composerBeauty, List list) {
        String categoryId;
        C19733412Iq c19733412IqLJIIIIZZ;
        ComposerBeauty composerBeautyLJIIIZ;
        C12IV c12iv = (C12IV) c12it.LJ.LIZ(C12IV.class);
        C12JN c12jn = (C12JN) c12it.LJ.LIZ(C12JN.class);
        Iterator it2 = list.iterator();
        while (true) {
            boolean z = false;
            if (!it2.hasNext()) {
                break;
            }
            ComposerBeauty composerBeauty2 = (ComposerBeauty) it2.next();
            if (Intrinsics.LJFF(composerBeauty, composerBeauty2) && composerBeauty.getEnable()) {
                z = true;
            }
            composerBeauty2.setSelected(z);
        }
        String categoryId2 = composerBeauty.getCategoryId();
        if (c12iv != null && (composerBeautyLJIIIZ = c12iv.LJIIIZ()) != null) {
            categoryId = composerBeautyLJIIIZ.getCategoryId();
        } else {
            categoryId = null;
        }
        if (Intrinsics.LJFF(categoryId2, categoryId)) {
            if (!composerBeauty.getExtra().isNone() && composerBeauty.getEnable()) {
                if (c12jn != null) {
                    c12jn.LIZIZ(true);
                }
            } else if (c12jn != null) {
                c12jn.LIZIZ(false);
            }
            if (c12iv != null) {
                c12iv.LJIIJ(composerBeauty);
            }
        }
        if (composerBeauty.getSelected()) {
            c12it.LIZ.hf(composerBeauty);
            c12it.LIZ.ze();
            c12it.LIZ.jf(composerBeauty);
            if (c12iv != null && (c19733412IqLJIIIIZZ = c12iv.LJIIIIZZ()) != null) {
                c19733412IqLJIIIIZZ.notifyDataSetChanged();
            }
        }
    }

    public C12IT(C12I9 c12i9, C12J7 c12j7, InterfaceC19731812Ia interfaceC19731812Ia, C12JP c12jp, C12JD c12jd) {
        this.LIZ = c12i9;
        this.LIZIZ = c12j7;
        this.LIZJ = interfaceC19731812Ia;
        this.LIZLLL = c12jp;
        this.LJ = c12jd;
    }
}
