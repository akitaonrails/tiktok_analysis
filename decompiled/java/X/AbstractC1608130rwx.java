package X;

import Y.ARunnableS13S0310000_24;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rwx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1608130rwx {
    public final C19EG LIZ;
    public final View LIZIZ;
    public final ViewGroup LIZJ;
    public final SafeHandler LJI;
    public final Stack<View> LIZLLL = new Stack<>();
    public final Map<String, InterfaceC1565710qqX> LJ = new HashMap();
    public final Map<InterfaceC1565710qqX, View> LJFF = new HashMap();
    public final long LJII = 200;
    public final long LJIIIIZZ = 300;

    public abstract int LIZ();

    public abstract Aweme LIZIZ();

    public abstract Fragment LIZJ();

    public abstract String LIZLLL();

    public abstract void LJIIIIZZ(long j, String str, boolean z);

    public final void LJIIIZ() {
        boolean z;
        Stack<View> stack = this.LIZLLL;
        if ((stack instanceof Collection) && stack.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it2 = stack.iterator();
            while (it2.hasNext()) {
                if (!(it2.next() instanceof C1213660hgi)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (z) {
            C2180521AVm.LIZLLL(this.LIZIZ, 8, C1AV3.LIZ(1, "Feed", null, "immersive"));
            C786410Ut5.LJLZ(0, this.LIZJ);
        } else if (this.LIZLLL.empty()) {
            C786410Ut5.LJLLLLLL(0, this.LIZIZ);
            C786410Ut5.LJLZ(8, this.LIZJ);
        } else {
            C786410Ut5.LJLLLLLL(0, this.LIZIZ);
            C786410Ut5.LJLZ(0, this.LIZJ);
        }
    }

    public final void LJII() {
        C622680Oba.LIZLLL(this);
        if (((Boolean) C504701xt.LIZ.getValue()).booleanValue()) {
            this.LJI.destroy();
        }
        Iterator it2 = ((HashMap) this.LJ).entrySet().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1565710qqX) ((Map.Entry) it2.next()).getValue()).LIZ();
        }
    }

    public static boolean LJI(C1597406Ng c1597406Ng) {
        Boolean bool;
        Map<String, Object> map;
        Object obj = null;
        if (c1597406Ng != null && (map = c1597406Ng.LIZIZ) != null) {
            obj = map.get("operate_top_bar");
        }
        if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        Boolean bool;
        EnumC1608140rwy enumC1608140rwy;
        if (c737030Svd.LJIILLIIL != System.identityHashCode(this.LIZ)) {
            return;
        }
        int i = c737030Svd.LIZ;
        if (i != 73) {
            if (i != 76) {
                if (i != 83) {
                    if (i == 103) {
                        LJ(c737030Svd, EnumC1608140rwy.AD_PLAYABLE);
                        return;
                    }
                    return;
                } else {
                    if (!C0COM.LIZIZ()) {
                        return;
                    }
                    if (Intrinsics.LJFF(c737030Svd.LJ, "paid_series_detail_page")) {
                        enumC1608140rwy = EnumC1608140rwy.MINI_DRAMA_CLEAR_MODE;
                    } else {
                        enumC1608140rwy = EnumC1608140rwy.CLEAR_MODE;
                    }
                    LJ(c737030Svd, enumC1608140rwy);
                    return;
                }
            }
            if (!C305280Bxu.LIZ()) {
                return;
            }
            LJ(c737030Svd, EnumC1608140rwy.EDGE_SPEEDUP);
            return;
        }
        Object obj = c737030Svd.LIZIZ;
        if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
            return;
        }
        if (bool.booleanValue()) {
            C786410Ut5.LJLLLLLL(0, this.LIZIZ);
            C786410Ut5.LJLZ(8, this.LIZJ);
        } else {
            C786410Ut5.LJLLLLLL(8, this.LIZIZ);
            C786410Ut5.LJLZ(0, this.LIZJ);
        }
    }

    public final void LJ(C737030Svd c737030Svd, EnumC1608140rwy enumC1608140rwy) {
        InterfaceC1565710qqX c1610320s0U;
        String typeName = enumC1608140rwy.getTypeName();
        boolean z = true;
        if (((HashMap) this.LJ).containsKey(typeName)) {
            c1610320s0U = (InterfaceC1565710qqX) ((HashMap) this.LJ).get(typeName);
            if (c1610320s0U == null) {
                return;
            }
        } else {
            int i = C1608150rwz.LIZ[enumC1608140rwy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return;
                            }
                            Object objLJIIJJI = C0SFC.LIZIZ.LJIIJJI();
                            if (!(objLJIIJJI instanceof InterfaceC1565710qqX) || (c1610320s0U = (InterfaceC1565710qqX) objLJIIJJI) == null) {
                                return;
                            }
                        } else {
                            c1610320s0U = new InterfaceC1565710qqX() { // from class: X.0SuP
                                public final C01GW LL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(285));
                                public FrameLayout LLILLJJLI;

                                @Override // X.InterfaceC1565710qqX
                                public final void LIZ() {
                                }

                                @Override // X.InterfaceC1565710qqX
                                public final EnumC1565700qqW LIZJ(C737030Svd c737030Svd2) {
                                    return C1565680qqU.LIZ(c737030Svd2);
                                }

                                @Override // X.InterfaceC1565710qqX
                                public final View LIZLLL(C19EG c19eg, ViewGroup viewGroup) {
                                    FrameLayout frameLayout = new FrameLayout(c19eg);
                                    this.LLILLJJLI = frameLayout;
                                    return frameLayout;
                                }

                                @Override // X.InterfaceC1565710qqX
                                public final void LIZIZ(C737030Svd c737030Svd2, Aweme aweme, boolean z2, Fragment fragment) {
                                    Activity activityLIZIZ;
                                    IFeedService iFeedServiceLIZIZ;
                                    InterfaceC1008930cMV interfaceC1008930cMVLIZJ;
                                    IAnoleManager iAnoleManagerRi;
                                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                                    if (abstractC1387200mCcLIZIZ != null) {
                                        activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
                                    } else {
                                        activityLIZIZ = null;
                                    }
                                    String str = c737030Svd2.LJ;
                                    ICommerceService iCommerceService = (ICommerceService) this.LL.getValue();
                                    if (iCommerceService != null && (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) != null && (interfaceC1008930cMVLIZJ = iFeedServiceLIZIZ.LIZJ(activityLIZIZ, aweme, str, true)) != null && (iAnoleManagerRi = interfaceC1008930cMVLIZJ.Ri()) != null) {
                                        if (z2) {
                                            FrameLayout frameLayout = this.LLILLJJLI;
                                            EnumC696280RSw enumC696280RSw = EnumC696280RSw.TT_PLAYABLE_SECONDARY_PAGE;
                                            iAnoleManagerRi.mount(frameLayout, enumC696280RSw.getSlotName(), null);
                                            iAnoleManagerRi.LJIJI(enumC696280RSw.getSlotName());
                                            return;
                                        }
                                        EnumC696280RSw enumC696280RSw2 = EnumC696280RSw.TT_PLAYABLE_SECONDARY_PAGE;
                                        iAnoleManagerRi.LJIIIIZZ(enumC696280RSw2.getSlotName());
                                        iAnoleManagerRi.LJIIJJI(enumC696280RSw2.getSlotName());
                                    }
                                }
                            };
                        }
                    } else {
                        c1610320s0U = new C1565660qqS();
                    }
                } else {
                    c1610320s0U = new InterfaceC1565710qqX() { // from class: X.0SuJ
                        public C421520Gfu LL;
                        public InterfaceC736220SuK LLILLJJLI;

                        @Override // X.InterfaceC1565710qqX
                        public final void LIZ() {
                        }

                        @Override // X.InterfaceC1565710qqX
                        public final EnumC1565700qqW LIZJ(C737030Svd c737030Svd2) {
                            return C1565680qqU.LIZ(c737030Svd2);
                        }

                        @Override // X.InterfaceC1565710qqX
                        public final View LIZLLL(C19EG c19eg, ViewGroup viewGroup) {
                            View viewTd = C786410Ut5.Td(C786410Ut5.ne(c19eg), R.layout.b68, viewGroup, false);
                            C786410Ut5.W5(viewTd, new FrameLayout.LayoutParams(-1, -1));
                            if (C300710BqX.LIZ()) {
                                this.LLILLJJLI = (InterfaceC736220SuK) viewTd.findViewById(R.id.cdy);
                            }
                            this.LL = (C421520Gfu) viewTd.findViewById(R.id.cdx);
                            return viewTd;
                        }

                        @Override // X.InterfaceC1565710qqX
                        public final void LIZIZ(C737030Svd c737030Svd2, Aweme aweme, boolean z2, Fragment fragment) {
                            C1597406Ng c1597406Ng;
                            Map<String, Object> map;
                            Boolean bool;
                            C421520Gfu c421520Gfu;
                            InterfaceC736220SuK interfaceC736220SuK;
                            InterfaceC736220SuK interfaceC736220SuK2;
                            float fFloatValue;
                            if (C300710BqX.LIZ()) {
                                Object obj = c737030Svd2.LIZIZ;
                                Float f = null;
                                if ((obj instanceof C1597406Ng) && (c1597406Ng = (C1597406Ng) obj) != null && (map = c1597406Ng.LIZIZ) != null) {
                                    Object obj2 = map.get("start");
                                    if (!(obj2 instanceof Boolean)) {
                                        obj2 = null;
                                    }
                                    Object obj3 = map.get("pull_down");
                                    if (!(obj3 instanceof Boolean)) {
                                        obj3 = null;
                                    }
                                    Object obj4 = map.get("need_guide");
                                    if (obj4 instanceof Boolean) {
                                        bool = (Boolean) obj4;
                                    } else {
                                        bool = null;
                                    }
                                    Object obj5 = map.get("current_speed");
                                    if (obj5 instanceof Float) {
                                        f = (Float) obj5;
                                    }
                                    C421520Gfu c421520Gfu2 = this.LL;
                                    boolean zBooleanValue = false;
                                    if ((c421520Gfu2 == null || c421520Gfu2.getVisibility() != 8) && (c421520Gfu = this.LL) != null) {
                                        int visibility = c421520Gfu.getVisibility();
                                        c421520Gfu.setVisibility(8);
                                        C1602160rnK.LIZIZ(visibility, 8, c421520Gfu);
                                    }
                                    Boolean bool2 = Boolean.TRUE;
                                    if (Intrinsics.LJFF(obj2, bool2)) {
                                        InterfaceC736220SuK interfaceC736220SuK3 = this.LLILLJJLI;
                                        if (interfaceC736220SuK3 != null) {
                                            if (bool != null) {
                                                zBooleanValue = bool.booleanValue();
                                            }
                                            if (f != null) {
                                                fFloatValue = f.floatValue();
                                            } else {
                                                fFloatValue = 1.0f;
                                            }
                                            interfaceC736220SuK3.LIZJ(fFloatValue, zBooleanValue);
                                        }
                                    } else if (Intrinsics.LJFF(obj2, Boolean.FALSE) && (interfaceC736220SuK = this.LLILLJJLI) != null) {
                                        interfaceC736220SuK.LJJL();
                                    }
                                    if (Intrinsics.LJFF(obj3, bool2)) {
                                        InterfaceC736220SuK interfaceC736220SuK4 = this.LLILLJJLI;
                                        if (interfaceC736220SuK4 != null) {
                                            interfaceC736220SuK4.LIZ();
                                            return;
                                        }
                                        return;
                                    }
                                    if (!Intrinsics.LJFF(obj3, Boolean.FALSE) || (interfaceC736220SuK2 = this.LLILLJJLI) == null) {
                                        return;
                                    }
                                    interfaceC736220SuK2.LIZIZ();
                                    return;
                                }
                                return;
                            }
                            C421520Gfu c421520Gfu3 = this.LL;
                            if (z2) {
                                if (c421520Gfu3 != null) {
                                    c421520Gfu3.LIZJ();
                                }
                            } else {
                                if (c421520Gfu3 == null) {
                                    return;
                                }
                                c421520Gfu3.LIZLLL();
                            }
                        }
                    };
                }
            } else {
                c1610320s0U = new C1610320s0U(this.LIZ);
            }
            Map<String, InterfaceC1565710qqX> map = this.LJ;
            View viewLIZLLL = c1610320s0U.LIZLLL(this.LIZ, this.LIZJ);
            if (viewLIZLLL == null) {
                final C19EG c19eg = this.LIZ;
                viewLIZLLL = new View(c19eg) { // from class: X.0hgi
                };
            }
            ((HashMap) this.LJFF).put(c1610320s0U, viewLIZLLL);
            ((HashMap) map).put(typeName, c1610320s0U);
        }
        EnumC1565700qqW enumC1565700qqWLIZJ = c1610320s0U.LIZJ(c737030Svd);
        if (enumC1565700qqWLIZJ == EnumC1565700qqW.NONE) {
            return;
        }
        if (enumC1565700qqWLIZJ != EnumC1565700qqW.IN) {
            z = false;
        }
        if (enumC1608140rwy != EnumC1608140rwy.CLEAR_MODE && enumC1608140rwy != EnumC1608140rwy.MINI_DRAMA_CLEAR_MODE) {
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            if (!C586380MzE.LIZ().LIZIZ(c737030Svd.LJ)) {
                this.LJI.post(new ARunnableS13S0310000_24(this, c737030Svd, c1610320s0U, z, 3));
                return;
            }
        }
        LJFF(c737030Svd, c1610320s0U, z);
        Aweme awemeLIZIZ = LIZIZ();
        if (awemeLIZIZ == null) {
            return;
        }
        c1610320s0U.LIZIZ(c737030Svd, awemeLIZIZ, z, LIZJ());
    }

    public AbstractC1608130rwx(C19EG c19eg, View view, ViewGroup viewGroup) {
        this.LIZ = c19eg;
        this.LIZIZ = view;
        this.LIZJ = viewGroup;
        this.LJI = new SafeHandler(IMainSAFLifecycleKt.requireSAFExpLifecycleOwner(view, true, (C19EG) null));
        C622680Oba.LIZJ(this);
        C786410Ut5.K7(viewGroup, new View.OnClickListener() { // from class: X.0btQ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
            }
        });
    }

    public final void LJFF(C737030Svd c737030Svd, InterfaceC1565710qqX interfaceC1565710qqX, boolean z) {
        long j;
        long j2;
        View view = (View) ((HashMap) this.LJFF).get(interfaceC1565710qqX);
        if (view == null) {
            return;
        }
        this.LIZJ.getLayoutParams().height = LIZ();
        C1597406Ng c1597406Ng = null;
        if (z) {
            if (this.LIZLLL.contains(view)) {
                this.LIZLLL.remove(view);
                C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
                String strLIZLLL = LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Try push a view already in the stack; controller: ");
                sbLIZ.append(interfaceC1565710qqX);
                sbLIZ.append("; event: ");
                sbLIZ.append(c737030Svd);
                c2276411E8h.LIZJ("common_feed", 5, strLIZLLL, C2188811AlT.LIZIZ(sbLIZ));
            }
            if (this.LIZLLL.empty()) {
                Object obj = c737030Svd.LIZIZ;
                if (obj instanceof C1597406Ng) {
                    c1597406Ng = (C1597406Ng) obj;
                }
                if (LJI(c1597406Ng)) {
                    if (c737030Svd.LIZ == 83) {
                        j2 = 0;
                    } else {
                        j2 = this.LJII;
                    }
                    LJIIIIZZ(j2, c737030Svd.LJ, false);
                }
            }
            this.LIZLLL.push(view);
            if (!(view instanceof C1213660hgi)) {
                C786410Ut5.LJJJJI(this.LIZJ);
                this.LIZJ.addView(view);
            }
            LJIIIZ();
            return;
        }
        if (this.LIZLLL.empty()) {
            return;
        }
        View viewLastElement = this.LIZLLL.lastElement();
        if (Intrinsics.LJFF(viewLastElement, view)) {
            View viewPop = this.LIZLLL.pop();
            if (!Intrinsics.LJFF(viewLastElement, viewPop) || (!(viewLastElement instanceof C1213660hgi) && !Intrinsics.LJFF(viewLastElement, this.LIZJ.getChildAt(0)))) {
                C2276411E8h c2276411E8h2 = C2276411E8h.LIZIZ;
                String strLIZLLL2 = LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("something wrong with view stack management!!! controller: ");
                sbLIZ2.append(interfaceC1565710qqX);
                sbLIZ2.append("; topView: ");
                sbLIZ2.append(viewLastElement);
                sbLIZ2.append("; popView: ");
                sbLIZ2.append(viewPop);
                sbLIZ2.append("; containerShownView: ");
                sbLIZ2.append(this.LIZJ.getChildAt(0));
                sbLIZ2.append("; map: ");
                sbLIZ2.append(this.LJFF);
                c2276411E8h2.LIZJ("common_feed", 6, strLIZLLL2, C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (this.LIZLLL.empty()) {
                C786410Ut5.LJJJJI(this.LIZJ);
                Object obj2 = c737030Svd.LIZIZ;
                if (obj2 instanceof C1597406Ng) {
                    c1597406Ng = (C1597406Ng) obj2;
                }
                if (LJI(c1597406Ng)) {
                    if (c737030Svd.LIZ == 83) {
                        j = this.LJIIIIZZ;
                    } else {
                        j = this.LJII;
                    }
                    LJIIIIZZ(j, c737030Svd.LJ, true);
                }
            } else {
                View viewLastElement2 = this.LIZLLL.lastElement();
                if (!(viewLastElement2 instanceof C1213660hgi)) {
                    C786410Ut5.LJJJJI(this.LIZJ);
                    this.LIZJ.addView(viewLastElement2);
                }
            }
            LJIIIZ();
            return;
        }
        if (this.LIZLLL.contains(view)) {
            C2276411E8h c2276411E8h3 = C2276411E8h.LIZIZ;
            String strLIZLLL3 = LIZLLL();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Try pop a view not on the top but in the stack; controller: ");
            sbLIZ3.append(interfaceC1565710qqX);
            sbLIZ3.append("; event: ");
            sbLIZ3.append(c737030Svd);
            c2276411E8h3.LIZJ("common_feed", 5, strLIZLLL3, C2188811AlT.LIZIZ(sbLIZ3));
            this.LIZLLL.remove(view);
            return;
        }
        C2276411E8h c2276411E8h4 = C2276411E8h.LIZIZ;
        String strLIZLLL4 = LIZLLL();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Try pop a view not in the stack; controller: ");
        sbLIZ4.append(interfaceC1565710qqX);
        sbLIZ4.append("; event: ");
        sbLIZ4.append(c737030Svd);
        c2276411E8h4.LIZJ("common_feed", 5, strLIZLLL4, C2188811AlT.LIZIZ(sbLIZ4));
    }
}
