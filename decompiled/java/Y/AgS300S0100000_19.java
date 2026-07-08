package Y;

import X.C0DOO;
import X.C1176850gjL;
import X.C1217250hmV;
import X.C1219950hqr;
import X.C1223260hwC;
import X.C1228420i4W;
import X.C1245860iWe;
import X.C1245880iWg;
import X.C1263080iyQ;
import X.C1389890mGx;
import X.C1390130mHL;
import X.C1390410mHn;
import X.C1749280vcc;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C197039127h;
import X.C19EG;
import X.C20684815ws;
import X.C2286608xc;
import X.C2344009Gk;
import X.C786410Ut5;
import X.EnumC1223310hwH;
import X.EnumC459420Hzw;
import X.InterfaceC1217240hmU;
import X.InterfaceC1364105Vn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC346701Wf;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupFragment;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupViewModel;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem;
import com.ss.android.ugc.profile.business.ur.school.schoollist.SchoolItemCell;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.assem.SelectorStatusAssem;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class AgS300S0100000_19 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            case 4:
                return emit$4(this, obj, interfaceC1364105Vn);
            case 5:
                return emit$5(this, obj, interfaceC1364105Vn);
            case 6:
                return emit$6(this, obj, interfaceC1364105Vn);
            case 7:
                return emit$7(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS300S0100000_19(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$0(Y.AgS300S0100000_19 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C1263360iys
            if (r0 == 0) goto L3b
            r4 = r7
            X.0iys r4 = (X.C1263360iys) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L41
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            X.0iyc r6 = (X.C1263200iyc) r6
            java.util.List<X.0ix3> r0 = r6.LJ
            if (r0 == 0) goto L22
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L3b:
            X.0iys r4 = new X.0iys
            r4.<init>(r5, r7)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS300S0100000_19.emit$0(Y.AgS300S0100000_19, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$1(AgS300S0100000_19 agS300S0100000_19, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1845940y8W c1845940y8WLJII;
        int iIntValue = ((Number) obj).intValue();
        ((FindSchoolFriendsPageContainerAssem) agS300S0100000_19.l0).LLLLIILLL = C2286608xc.LJ(iIntValue);
        if (iIntValue >= 100) {
            Context context = ((FindSchoolFriendsPageContainerAssem) agS300S0100000_19.l0).getContext();
            String string = null;
            if (context != null) {
                string = context.getString(2131828310, C1176850gjL.LIZ(1, ((FindSchoolFriendsPageContainerAssem) agS300S0100000_19.l0).LLLLIILLL, ""));
            }
            FindSchoolFriendsPageContainerAssem findSchoolFriendsPageContainerAssem = (FindSchoolFriendsPageContainerAssem) agS300S0100000_19.l0;
            C1846060y8i c1846060y8i = findSchoolFriendsPageContainerAssem.LLJL;
            if (c1846060y8i != null && (c1845940y8WLJII = c1846060y8i.LJII(findSchoolFriendsPageContainerAssem.up())) != null) {
                c1845940y8WLJII.LIZIZ(string);
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$2(AgS300S0100000_19 agS300S0100000_19, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1845940y8W c1845940y8WLJII;
        C1845940y8W c1845940y8WLJII2;
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue != EnumC459420Hzw.INITIAL.getValue()) {
            String string = null;
            if (iIntValue != EnumC459420Hzw.EMPTY.getValue() && iIntValue != EnumC459420Hzw.ERROR.getValue()) {
                ((FindSchoolFriendsPageContainerAssem) agS300S0100000_19.l0).LLLLIL = C2286608xc.LJ(iIntValue);
                Context context = ((FindSchoolFriendsPageContainerAssem) agS300S0100000_19.l0).getContext();
                if (context != null) {
                    string = context.getString(2131828311, C1176850gjL.LIZ(1, ((FindSchoolFriendsPageContainerAssem) agS300S0100000_19.l0).LLLLIL, ""));
                }
                FindSchoolFriendsPageContainerAssem findSchoolFriendsPageContainerAssem = (FindSchoolFriendsPageContainerAssem) agS300S0100000_19.l0;
                C1846060y8i c1846060y8i = findSchoolFriendsPageContainerAssem.LLJL;
                if (c1846060y8i != null && (c1845940y8WLJII2 = c1846060y8i.LJII(findSchoolFriendsPageContainerAssem.sp())) != null) {
                    c1845940y8WLJII2.LIZIZ(string);
                }
            } else {
                Context context2 = ((FindSchoolFriendsPageContainerAssem) agS300S0100000_19.l0).getContext();
                if (context2 != null) {
                    string = context2.getString(2131828312);
                }
                FindSchoolFriendsPageContainerAssem findSchoolFriendsPageContainerAssem2 = (FindSchoolFriendsPageContainerAssem) agS300S0100000_19.l0;
                C1846060y8i c1846060y8i2 = findSchoolFriendsPageContainerAssem2.LLJL;
                if (c1846060y8i2 != null && (c1845940y8WLJII = c1846060y8i2.LJII(findSchoolFriendsPageContainerAssem2.sp())) != null) {
                    c1845940y8WLJII.LIZIZ(string);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$3(AgS300S0100000_19 agS300S0100000_19, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (((Boolean) obj).booleanValue()) {
            AssemVMLazy assemVMLazy = ((SelectorStatusAssem) agS300S0100000_19.l0).LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SelectorStatusAssem.LLJI;
            if (((C1223260hwC) assemVMLazy.getValue().getState()).LL != EnumC1223310hwH.LOADING) {
                return Unit.LIZ;
            }
            C1390410mHn c1390410mHn = (C1390410mHn) ((SelectorStatusAssem) agS300S0100000_19.l0).LJJIJL().findViewWithTag("content_tab_loading_view");
            if (c1390410mHn == null) {
                return Unit.LIZ;
            }
            if (c1390410mHn.LLIZLLLIL) {
                return Unit.LIZ;
            }
            c1390410mHn.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object emit$4(AgS300S0100000_19 agS300S0100000_19, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1749280vcc c1749280vcc;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C197039127h c197039127h;
        C1228420i4W c1228420i4W;
        FanGroupChooseGroupViewModel fanGroupChooseGroupViewModel;
        int i;
        C1219950hqr c1219950hqr = (C1219950hqr) obj;
        FanGroupChooseGroupFragment fanGroupChooseGroupFragment = (FanGroupChooseGroupFragment) agS300S0100000_19.l0;
        C1390130mHL c1390130mHL = fanGroupChooseGroupFragment.LLJIJIL;
        if (c1390130mHL != null && (c1749280vcc = fanGroupChooseGroupFragment.LLJILJIL) != null && (viewOnAttachStateChangeListenerC20604515jv = fanGroupChooseGroupFragment.LLJI) != null && (c197039127h = fanGroupChooseGroupFragment.LLJILJILJ) != null && (c1228420i4W = fanGroupChooseGroupFragment.LLJILLL) != null && (fanGroupChooseGroupViewModel = fanGroupChooseGroupFragment.LLIZLLLIL) != null) {
            boolean z = false;
            if (c1219950hqr.LIZ) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLZ(c1390130mHL, i);
            if (c1219950hqr.LIZIZ) {
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
                C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv);
                C786410Ut5.l9(c1749280vcc, new ACListenerS154S0100000_19(fanGroupChooseGroupViewModel, 262));
            } else if (!c1219950hqr.LIZ && c1219950hqr.LIZJ) {
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
                C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv);
            } else {
                C786410Ut5.LLLZLZ(c1749280vcc, 8);
                C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jv);
                c1228420i4W.LLILZLL.LJIILL(c1219950hqr.LJ, null);
            }
            if (c1219950hqr.LJFF != null) {
                z = true;
            }
            c197039127h.setEnabled(z);
        }
        return Unit.LIZ;
    }

    public static final Object emit$5(AgS300S0100000_19 agS300S0100000_19, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String str = (String) obj;
        C19EG activity = ((FanGroupChooseGroupFragment) agS300S0100000_19.l0).getActivity();
        if (activity != null && str.length() != 0) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object emit$6(AgS300S0100000_19 agS300S0100000_19, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1245860iWe enterFrom;
        String str;
        InterfaceC1217240hmU interfaceC1217240hmUI5 = ((SchoolItemCell) agS300S0100000_19.l0).I5();
        if (interfaceC1217240hmUI5 != null && (enterFrom = interfaceC1217240hmUI5.getEnterFrom()) != null) {
            C1217250hmV item = ((SchoolItemCell) agS300S0100000_19.l0).getItem();
            if (item != null && (str = item.LLILLL) != null) {
                InterfaceC1217240hmU interfaceC1217240hmUI52 = ((SchoolItemCell) agS300S0100000_19.l0).I5();
                if (interfaceC1217240hmUI52 != null) {
                    boolean zBt0 = interfaceC1217240hmUI52.bt0();
                    if (Intrinsics.LJFF(str, obj)) {
                        C0DOO c0doo = C0DOO.LIZ;
                        int i = !zBt0 ? 1 : 0;
                        c0doo.getClass();
                        C1245880iWg c1245880iWg = C1245880iWg.LIZ;
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c1245880iWg.getClass();
                        C1245880iWg.LIZ(c2344009Gk, enterFrom);
                        C1245880iWg.LIZIZ(c2344009Gk, enterFrom);
                        c2344009Gk.LIZJ(i, "is_new_user");
                        C20684815ws.LJIILLIIL("show_school_search_result", c2344009Gk.LIZ);
                    }
                    return Unit.LIZ;
                }
                return Unit.LIZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public static final Object emit$7(AgS300S0100000_19 agS300S0100000_19, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((C1263080iyQ) agS300S0100000_19.l0).LJJI();
        return Unit.LIZ;
    }
}
