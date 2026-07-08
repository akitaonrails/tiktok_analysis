package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12IX, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12IX implements C12JN {
    public final Context LIZ;
    public final View LIZIZ;
    public final C12J0 LIZJ;
    public final C12IS LIZLLL;
    public final LinearLayout LJ;
    public final C19735912Jp LJFF;
    public final C19735912Jp LJI;
    public final TextView LJII;
    public final TextView LJIIIIZZ;
    public final HashMap<C19735912Jp, ComposerBeautyExtraBeautify.ItemsBean> LJIIIZ = new HashMap<>();

    @Override // X.C12JN
    public final void LIZJ() {
        LJ(this.LJFF);
        LJ(this.LJI);
    }

    public final void LJFF() {
        ComposerBeautyExtraBeautify beautifyExtra;
        List<ComposerBeautyExtraBeautify.ItemsBean> items;
        C12IV c12iv = (C12IV) this.LIZLLL.LIZLLL.LIZ(C12IV.class);
        if (c12iv != null) {
            ComposerBeauty composerBeautyLJIILJJIL = c12iv.LIZLLL() ? c12iv.LJIILJJIL() : c12iv.LJIIIZ();
            if (composerBeautyLJIILJJIL == null || (beautifyExtra = composerBeautyLJIILJJIL.getBeautifyExtra()) == null || (items = beautifyExtra.getItems()) == null || items.size() != 2) {
                return;
            }
            this.LIZJ.getClass();
        }
    }

    @Override // X.C12JN
    public final void LIZIZ(boolean z) {
        if (z) {
            C786410Ut5.LJZL(0, this.LJ);
            LJFF();
            C19735912Jp c19735912Jp = this.LJI;
            int visibility = c19735912Jp.getVisibility();
            c19735912Jp.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c19735912Jp);
            return;
        }
        C786410Ut5.LJZL(8, this.LJ);
    }

    @Override // X.C12JN
    public final void LIZLLL(int i) {
        this.LJFF.setPercent(i);
    }

    public final void LJ(final C19735912Jp c19735912Jp) {
        C12JI c12ji = this.LIZJ.LJ;
        int iLIZ = C420650GeV.LIZ(this.LIZIZ.getResources(), c12ji.LIZ, this.LIZ.getTheme());
        int iLIZ2 = C420650GeV.LIZ(this.LIZIZ.getResources(), c12ji.LIZIZ, this.LIZ.getTheme());
        int iLIZ3 = C420650GeV.LIZ(this.LIZIZ.getResources(), R.color.ac4, this.LIZ.getTheme());
        c19735912Jp.LLJJIJIL = iLIZ;
        c19735912Jp.LLJJJ = iLIZ2;
        c19735912Jp.LLJJL = iLIZ3;
        c19735912Jp.LIZJ(false);
        c19735912Jp.setDefaultCircleConfig(R.color.ac4);
        c19735912Jp.setSuggestCircleColor(R.color.ac4);
        c19735912Jp.setBarHeight(C11VU.LIZIZ(c12ji.LIZJ, c19735912Jp.getContext()));
        c19735912Jp.setTextSize(TypedValue.applyDimension(2, c12ji.LIZLLL, c19735912Jp.getContext().getResources().getDisplayMetrics()));
        c19735912Jp.setBarPadding(C11VU.LIZIZ(11.0f, c19735912Jp.getContext()));
        c19735912Jp.setOnLevelChangeListener(new InterfaceC19736212Js() { // from class: X.12IW
            @Override // X.InterfaceC19736212Js
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC19736212Js
            public final void LIZLLL() {
                String str;
                InterfaceC19731812Ia interfaceC19731812Ia;
                C12IX c12ix = this.LIZ;
                C19735912Jp c19735912Jp2 = c19735912Jp;
                C12IS c12is = c12ix.LIZLLL;
                c12ix.LJFF();
                ComposerBeautyExtraBeautify.ItemsBean itemsBean = c12ix.LJIIIZ.get(c19735912Jp2);
                if (itemsBean == null || (str = itemsBean.tag) == null) {
                    str = "";
                }
                Collections.singletonList(str);
                ComposerBeauty composerBeautyLIZIZ = c12is.LIZIZ();
                if (composerBeautyLIZIZ != null && (interfaceC19731812Ia = c12is.LIZJ) != null) {
                    C12IS.LIZJ(composerBeautyLIZIZ);
                    interfaceC19731812Ia.LJIIJJI();
                }
                C12IX c12ix2 = this.LIZ;
                ComposerBeauty composerBeautyLIZIZ2 = c12ix2.LIZLLL.LIZIZ();
                if (composerBeautyLIZIZ2 != null) {
                    c12ix2.LIZ(composerBeautyLIZIZ2, true, false, false);
                }
            }

            @Override // X.InterfaceC19736212Js
            public final void LIZ(int i) {
                String str;
                C19733412Iq c19733412IqLJIIIIZZ;
                boolean z;
                C19733412Iq c19733412IqLJIIIIZZ2;
                ArrayList<ComposerBeauty> arrayList;
                C19733412Iq c19733412IqLJIIL;
                ArrayList<ComposerBeauty> arrayList2;
                InterfaceC19731812Ia interfaceC19731812Ia;
                C12IX c12ix = this.LIZ;
                C19735912Jp c19735912Jp2 = c19735912Jp;
                C12IS c12is = c12ix.LIZLLL;
                c12ix.LJFF();
                ComposerBeautyExtraBeautify.ItemsBean itemsBean = c12ix.LJIIIZ.get(c19735912Jp2);
                if (itemsBean == null || (str = itemsBean.tag) == null) {
                    str = "";
                }
                Collections.singletonList(str);
                ComposerBeauty composerBeautyLIZIZ = c12is.LIZIZ();
                if (composerBeautyLIZIZ != null && (interfaceC19731812Ia = c12is.LIZJ) != null) {
                    C12IS.LIZJ(composerBeautyLIZIZ);
                    interfaceC19731812Ia.LJFF(composerBeautyLIZIZ, i);
                }
                C12IX c12ix2 = this.LIZ;
                C12IS c12is2 = c12ix2.LIZLLL;
                C19735912Jp c19735912Jp3 = c19735912Jp;
                c12ix2.LJFF();
                HashMap<C19735912Jp, ComposerBeautyExtraBeautify.ItemsBean> map = this.LIZ.LJIIIZ;
                C12IV c12iv = (C12IV) c12is2.LIZLLL.LIZ(C12IV.class);
                if (c12iv != null) {
                    if (c12iv.LIZLLL()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ComposerBeauty composerBeauty = null;
                    if (z) {
                        if (c12iv != null && (c19733412IqLJIIL = c12iv.LJIIL()) != null && (arrayList2 = c19733412IqLJIIL.LLILZ) != null) {
                            Iterator<ComposerBeauty> it2 = arrayList2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ComposerBeauty next = it2.next();
                                if (Intrinsics.LJFF(next, c12iv.LJIILJJIL())) {
                                    composerBeauty = next;
                                    break;
                                }
                            }
                            ComposerBeauty composerBeauty2 = composerBeauty;
                            if (composerBeauty2 != null) {
                                c12is2.LJI(i, c19735912Jp3, map, composerBeauty2);
                                c12is2.LIZ.jf(composerBeauty2);
                                C12JP c12jp = c12is2.LJ;
                                c12is2.LIZ.Ae();
                                InterfaceC19731912Ib interfaceC19731912Ib = c12jp.LIZ;
                                if (interfaceC19731912Ib != null) {
                                    interfaceC19731912Ib.LJI();
                                }
                            }
                        }
                    } else if (c12iv != null && (c19733412IqLJIIIIZZ2 = c12iv.LJIIIIZZ()) != null && (arrayList = c19733412IqLJIIIIZZ2.LLILZ) != null) {
                        Iterator<ComposerBeauty> it3 = arrayList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            ComposerBeauty next2 = it3.next();
                            if (Intrinsics.LJFF(next2, c12iv.LJIIIZ())) {
                                composerBeauty = next2;
                                break;
                            }
                        }
                        ComposerBeauty composerBeauty3 = composerBeauty;
                        if (composerBeauty3 != null) {
                            c12is2.LJI(i, c19735912Jp3, map, composerBeauty3);
                            c12is2.LIZ.jf(composerBeauty3);
                            int iIndexOf = c12iv.LJIIIIZZ().LLILZ.indexOf(composerBeauty3);
                            if (iIndexOf >= 0 && iIndexOf < c12iv.LJIIIIZZ().LLILZ.size()) {
                                c12iv.LJIIIIZZ().LLLFZ(composerBeauty3);
                            }
                            C12JP c12jp2 = c12is2.LJ;
                            c12is2.LIZ.Ae();
                            InterfaceC19731912Ib interfaceC19731912Ib2 = c12jp2.LIZ;
                            if (interfaceC19731912Ib2 != null) {
                                interfaceC19731912Ib2.LJI();
                            }
                        }
                    }
                }
                InterfaceC19732212Ie interfaceC19732212Ie = (InterfaceC19732212Ie) c12is2.LIZLLL.LIZ(InterfaceC19732212Ie.class);
                if (interfaceC19732212Ie != null) {
                    interfaceC19732212Ie.LIZ();
                }
                C12JF c12jf = (C12JF) c12is2.LIZLLL.LIZ(C12JF.class);
                if (c12jf != null) {
                    c12jf.LIZ();
                }
                if (c12iv != null && (c19733412IqLJIIIIZZ = c12iv.LJIIIIZZ()) != null) {
                    c12iv.LIZ();
                    for (C19734412Ja c19734412Ja : (ArrayList) c19733412IqLJIIIIZZ.LLILLL) {
                        if (c19734412Ja instanceof C19734512Jb) {
                            ((C19734512Jb) c19734412Ja).LIZIZ = false;
                        }
                    }
                    c19733412IqLJIIIIZZ.notifyDataSetChanged();
                }
            }

            @Override // X.InterfaceC19736212Js
            public final void LIZJ(int i) {
                String str;
                boolean z;
                C19733412Iq c19733412IqLJIIIIZZ;
                ArrayList<ComposerBeauty> arrayList;
                C19733412Iq c19733412IqLJIIL;
                ArrayList<ComposerBeauty> arrayList2;
                InterfaceC19731812Ia interfaceC19731812Ia;
                C12IX c12ix = this.LIZ;
                C19735912Jp c19735912Jp2 = c19735912Jp;
                C12JI c12ji2 = c12ix.LIZJ.LJ;
                int percent = c19735912Jp2.getPercent();
                c12ji2.getClass();
                C12IX c12ix2 = this.LIZ;
                C19735912Jp c19735912Jp3 = c19735912Jp;
                C12IS c12is = c12ix2.LIZLLL;
                ComposerBeautyExtraBeautify.ItemsBean itemsBean = c12ix2.LJIIIZ.get(c19735912Jp3);
                if (itemsBean == null || (str = itemsBean.tag) == null) {
                    str = "";
                }
                Collections.singletonList(str);
                if (c12is.LIZIZ() != null && (interfaceC19731812Ia = c12is.LIZJ) != null) {
                    interfaceC19731812Ia.r3();
                }
                C12IS c12is2 = this.LIZ.LIZLLL;
                int maxPercent = c19735912Jp.getMaxPercent();
                C12IV c12iv = (C12IV) c12is2.LIZLLL.LIZ(C12IV.class);
                if (c12iv != null) {
                    if (c12iv.LIZLLL()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ComposerBeauty composerBeauty = null;
                    if (z) {
                        if (c12iv != null && (c19733412IqLJIIL = c12iv.LJIIL()) != null && (arrayList2 = c19733412IqLJIIL.LLILZ) != null) {
                            Iterator<ComposerBeauty> it2 = arrayList2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ComposerBeauty next = it2.next();
                                if (Intrinsics.LJFF(next, c12iv.LJIILJJIL())) {
                                    composerBeauty = next;
                                    break;
                                }
                            }
                            ComposerBeauty composerBeauty2 = composerBeauty;
                            if (composerBeauty2 != null) {
                                C12IS.LJFF(percent, c12is2, maxPercent, composerBeauty2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (c12iv == null || (c19733412IqLJIIIIZZ = c12iv.LJIIIIZZ()) == null || (arrayList = c19733412IqLJIIIIZZ.LLILZ) == null) {
                        return;
                    }
                    Iterator<ComposerBeauty> it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        ComposerBeauty next2 = it3.next();
                        if (Intrinsics.LJFF(next2, c12iv.LJIIIZ())) {
                            composerBeauty = next2;
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty3 = composerBeauty;
                    if (composerBeauty3 == null) {
                        return;
                    }
                    C12IS.LJFF(percent, c12is2, maxPercent, composerBeauty3);
                }
            }
        });
    }

    public C12IX(Context context, View view, C12J0 c12j0, C12IS c12is) {
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = c12j0;
        this.LIZLLL = c12is;
        this.LJ = (LinearLayout) view.findViewById(R.id.tnv);
        this.LJFF = (C19735912Jp) view.findViewById(R.id.q67);
        this.LJI = (C19735912Jp) view.findViewById(R.id.q68);
        this.LJII = (TextView) view.findViewById(R.id.tv_seek_bar_title_first);
        this.LJIIIIZZ = (TextView) view.findViewById(R.id.tv_seek_bar_title_second);
    }

    @Override // X.C12JN
    public final void LIZ(ComposerBeauty composerBeauty, boolean z, boolean z2, boolean z3) {
        ComposerBeautyExtraBeautify.ItemsBean itemsBean;
        if (z) {
            if (composerBeauty.isBeautyMode()) {
                this.LIZLLL.LIZ.Ue();
            } else {
                final C12IS c12is = this.LIZLLL;
                c12is.LIZ.ve(composerBeauty, new InterfaceC19729612He() { // from class: X.12Ic
                    @Override // X.InterfaceC19729612He
                    public final void LIZIZ(List list) {
                        C12J7 c12j7;
                        if ((!c12is.LIZ() || c12is.LJ()) && (c12j7 = c12is.LIZIZ) != null) {
                            c12j7.LIZIZ(list);
                        }
                    }

                    @Override // X.InterfaceC19729612He
                    public final void LIZ(List list, List list2) {
                        C12J7 c12j7;
                        if ((!c12is.LIZ() || c12is.LJ()) && (c12j7 = c12is.LIZIZ) != null) {
                            c12j7.LIZ(list, list2);
                        }
                    }
                });
            }
        }
        if (z2) {
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (items != null && (!items.isEmpty())) {
                C12I4 c12i4LIZIZ = C12I3.LIZIZ(new C12I4(((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).doubleDirection, ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).max, ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).min, this.LIZLLL.LIZ.gf(composerBeauty, ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).tag, ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).value), 0, 0.0f, 1932));
                if (((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).doubleDirection) {
                    this.LJFF.LIZ(50, -50);
                } else {
                    this.LJFF.LIZ(100, 0);
                }
                this.LJFF.setPercent(c12i4LIZIZ.LJFF);
                this.LIZJ.getClass();
                C786410Ut5.LLIL(this.LJII, 8);
                C786410Ut5.LLIL(this.LJIIIIZZ, 8);
                List<ComposerBeautyExtraBeautify.ItemsBean> items2 = composerBeauty.getBeautifyExtra().getItems();
                if (items2 != null && (itemsBean = (ComposerBeautyExtraBeautify.ItemsBean) C13LP.LJJJJZI(items2)) != null) {
                    C19735912Jp c19735912Jp = this.LJFF;
                    C12I4 c12i4LIZIZ2 = C12I3.LIZIZ(new C12I4(itemsBean.doubleDirection, itemsBean.max, itemsBean.min, itemsBean.value, 0, 0.0f, 1932));
                    boolean z4 = itemsBean.doubleDirection;
                    int i = c12i4LIZIZ2.LJFF;
                    if (!z4 && i == 0) {
                        c19735912Jp.setNeedShowSuggestCircle(false);
                    } else {
                        c19735912Jp.setNeedShowSuggestCircle(true);
                    }
                    c19735912Jp.setSuggestPercent(c12i4LIZIZ2.LJFF);
                }
            }
            LJFF();
        }
    }
}
