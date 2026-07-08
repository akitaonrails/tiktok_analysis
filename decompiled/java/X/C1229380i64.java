package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.fangroup.fragment.FanGroupListFragment;
import com.ss.android.ugc.aweme.fangroup.model.GroupInfo;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupJoinResponseV2;
import com.ss.android.ugc.aweme.publicgroup.fragment.GroupListFragment;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS133S1100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0i64, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229380i64 implements InterfaceC1231480i9S {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    @Override // X.InterfaceC1231480i9S
    public final void LJ(Context context, C1228470i4b c1228470i4b) {
        C1227230i2b.LIZ(this.LIZ, this.LIZIZ, this.LIZJ, "create_public_group");
        C1228500i4e c1228500i4e = C1228500i4e.LIZIZ;
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        c1228500i4e.getClass();
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(C459080HzO.LJ());
        C786410Ut5.J4(dialogC1389620mGW);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1228510i4f(c1228470i4b, context, str, str2, dialogC1389620mGW, null), 3);
    }

    @Override // X.InterfaceC1231480i9S
    public final void LJFF(Context context, C1228470i4b c1228470i4b) {
        FragmentManager supportFragmentManager;
        int i;
        C1227230i2b.LIZ(this.LIZ, this.LIZIZ, this.LIZJ, "show_group_list");
        C1229370i63 c1229370i63 = GroupListFragment.LLJJI;
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        c1229370i63.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append('-');
        sbLIZ.append(UUID.randomUUID());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        GroupListFragment.LLJJIJI.put(strLIZIZ, c1228470i4b);
        if (!c1228470i4b.LIZIZ.LIZLLL) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("param_uuid", strLIZIZ, bundle);
                C786410Ut5.LJJJI("open_platform_biz_line", str, bundle);
                C786410Ut5.LJJJI("open_platform_biz_scene", str2, bundle);
                GroupListFragment groupListFragment = new GroupListFragment();
                groupListFragment.setArguments(bundle);
                Float f = c1228470i4b.LIZIZ.LJIJJLI.LJ;
                if (f != null) {
                    f.floatValue();
                    i = 1;
                } else {
                    i = 0;
                }
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJI = groupListFragment;
                tuxSheet.LLJLILLLLZIIL = false;
                c1390920mIc.LJIIIIZZ(i);
                C1228810i59 c1228810i59 = c1228470i4b.LIZIZ;
                c1390920mIc.LIZ.LLJJIJIIJIL = !c1228810i59.LJ;
                Integer numValueOf = Integer.valueOf(C1229360i62.LIZ(context, c1228810i59.LJIIIIZZ, c1228810i59.LJIJJLI.LJIIIIZZ));
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLJI = numValueOf;
                if (f != null) {
                    tuxSheet2.LLJLL = true;
                    c1390920mIc.LIZ.LLJJL = C814420VxA.LIZIZ(C1232370iAt.LIZLLL(context) * f.floatValue());
                }
                c1390920mIc.LIZ.show(supportFragmentManager, "GroupListFragment");
                return;
            }
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//im/public_group_list_inner");
        smartRouteBuildRoute.withParam("param_uuid", strLIZIZ);
        smartRouteBuildRoute.withParam("open_platform_biz_line", str);
        smartRouteBuildRoute.withParam("open_platform_biz_scene", str2);
        smartRouteBuildRoute.open();
    }

    public C1229380i64(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }

    @Override // X.InterfaceC1231480i9S
    public final void LIZIZ(Context context, C1230080i7C c1230080i7C, C1230090i7D c1230090i7D) {
        boolean z;
        boolean z2;
        Long lValueOf;
        C0Y8Y coreInfo;
        C1227230i2b.LIZ(this.LIZ, this.LIZIZ, this.LIZJ, "join_group_panel");
        final C1230060i7A c1230060i7A = new C1230060i7A(context, c1230080i7C, c1230090i7D, new C1230110i7F(null, 15), EnumC1230590i81.JOIN_GROUP_SCENE_BY_ACTIVE_ENTRANCE);
        if (!C461720I8s.LJ()) {
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                C0I0B.LJFF.LIZ();
                C1400340mXo.LJIIIZ(activityLIZ, "active_join_group");
            }
            InterfaceC1229620i6S interfaceC1229620i6S = c1230060i7A.LJIIJJI;
            if (interfaceC1229620i6S != null) {
                interfaceC1229620i6S.LIZ(null);
                return;
            }
            return;
        }
        C876340YZk c876340YZk = C876340YZk.LIZ;
        if (!((C876310YZh) C876340YZk.LIZ(c876340YZk)).LIZIZ()) {
            ((C876310YZh) C876340YZk.LIZ(c876340YZk)).LIZJ(EnumC883570YlP.GROUP_CHAT_RELATED);
        }
        if (C123100dR.LIZ(c1230060i7A.LJI)) {
            C0ZFW c0zfw = C0ZFW.LIZ;
            String str = c1230060i7A.LJI;
            Long lValueOf2 = Long.valueOf(C461720I8s.LIZJ());
            c0zfw.getClass();
            if (lValueOf2 != null) {
                C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(str);
                if (c0y8tLJIL != null && (coreInfo = c0y8tLJIL.getCoreInfo()) != null) {
                    lValueOf = Long.valueOf(coreInfo.getOwner());
                } else {
                    lValueOf = null;
                }
                if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                    InterfaceC1229620i6S interfaceC1229620i6S2 = c1230060i7A.LJIIJJI;
                    if (interfaceC1229620i6S2 != null) {
                        interfaceC1229620i6S2.LIZIZ(c1230060i7A.LJI);
                    }
                    C1230440i7m c1230440i7m = C1230440i7m.LIZJ;
                    C1229500i6G c1229500i6G = c1230060i7A.LJFF;
                    String str2 = c1230060i7A.LJI;
                    c1230440i7m.getClass();
                    C1230440i7m.LJ(context, c1229500i6G, str2);
                    return;
                }
            }
        }
        final DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
        final InterfaceC1229620i6S interfaceC1229620i6S3 = c1230060i7A.LJIIJJI;
        AbstractC1230100i7E abstractC1230100i7E = new AbstractC1230100i7E(interfaceC1229620i6S3) { // from class: X.0i6R
            @Override // X.AbstractC1230100i7E
            public final void LIZJ() {
                C786410Ut5.J4(dialogC1389620mGW);
            }

            @Override // X.AbstractC1230100i7E
            public final void LIZ(String str3, C0YMW c0ymw) {
                C786410Ut5.LJIIJ(dialogC1389620mGW);
                if (str3 != null) {
                    C1229780i6i.LIZ(c1230060i7A.LJIIIZ, str3);
                }
                InterfaceC1229620i6S interfaceC1229620i6S4 = c1230060i7A.LJIIJJI;
                if (interfaceC1229620i6S4 != null) {
                    interfaceC1229620i6S4.LIZ(c0ymw);
                }
            }

            @Override // X.AbstractC1230100i7E
            public final void LIZIZ(EnumC1229960i70 enumC1229960i70, GroupJoinResponseV2 groupJoinResponseV2) {
                C786410Ut5.LJIIJ(dialogC1389620mGW);
                int i = C1229600i6Q.LIZ[enumC1229960i70.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        c1230060i7A.LIZIZ(C1229780i6i.LIZLLL(groupJoinResponseV2.popupMeta));
                        return;
                    }
                    C1229780i6i.LIZ(c1230060i7A.LJIIIZ, C1383370m6R.LJIIJ(2131830202));
                    InterfaceC1229620i6S interfaceC1229620i6S4 = c1230060i7A.LJIIJJI;
                    if (interfaceC1229620i6S4 == null) {
                        return;
                    }
                    interfaceC1229620i6S4.LIZ(null);
                    return;
                }
                String strValueOf = String.valueOf(groupJoinResponseV2.popupMeta.groupInfo.convShortId);
                C913630Zsn c913630Zsn = C913630Zsn.LJIIJJI;
                C1230060i7A c1230060i7A2 = c1230060i7A;
                c913630Zsn.LJJIJL(c1230060i7A2.LIZ, C1229500i6G.LIZ(c1230060i7A2.LJFF), strValueOf, new AwS133S1100000_19(c1230060i7A, strValueOf, 24));
            }
        };
        if (c1230060i7A.LJ == EnumC1229960i70.IN_GROUP) {
            C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZJ(c1230060i7A.LJI, new C1266170j3P(c1230060i7A, 0));
            return;
        }
        C1229500i6G c1229500i6G2 = c1230060i7A.LJFF;
        C1229320i5y.LJ("active_join", c1229500i6G2.LIZ, c1229500i6G2.LIZIZ);
        if (c1230090i7D == null) {
            z = true;
        } else {
            z = false;
        }
        EnumC1229960i70 enumC1229960i70 = c1230060i7A.LJ;
        int[] iArr = C1229520i6I.LIZ;
        if (iArr[enumC1229960i70.ordinal()] == 1) {
            if (!c1230060i7A.LJIIIIZZ) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = c1230060i7A.LJIIJ;
        }
        if (!z || !z2) {
            C1229320i5y.LIZLLL(new C1229340i60(0, c1230060i7A.LJ.getValue(), C0ZBV.SUCCESS, 1));
        }
        int i = iArr[c1230060i7A.LJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        c1230060i7A.LIZ(null);
                        return;
                    } else {
                        c1230060i7A.LIZ(context.getString(2131830197));
                        return;
                    }
                }
                c1230060i7A.LIZ(context.getString(2131830202));
                return;
            }
            c1230060i7A.LIZ(null);
            return;
        }
        if (c1230060i7A.LJIIIIZZ) {
            c1230060i7A.LIZJ(abstractC1230100i7E);
        } else {
            c1230060i7A.LIZIZ(c1230060i7A.LIZIZ);
        }
    }

    @Override // X.InterfaceC1231480i9S
    public final void LIZLLL(Context context, C1228470i4b c1228470i4b, AbstractC1227390i2r abstractC1227390i2r) {
        C1227690i3L.LJIIJ(this.LIZ, this.LIZIZ, true);
        C1227230i2b.LIZ(this.LIZ, this.LIZIZ, this.LIZJ, "show_unified_group_creation_panel");
        C1228500i4e c1228500i4e = C1228500i4e.LIZIZ;
        C1228040i3u c1228040i3u = new C1228040i3u(this.LIZ, this.LIZIZ, this.LIZJ);
        c1228500i4e.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new AnonymousClass0204(CoroutineExceptionHandler.LJJLIL, 13))), null, null, new C1228480i4c(c1228470i4b, context, c1228040i3u, abstractC1227390i2r, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02e3  */
    @Override // X.InterfaceC1231480i9S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1229390i65 r36, X.C1229400i66 r37, X.InterfaceC863580XuG r38, X.DialogC1389620mGW r39) {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1229380i64.LIZ(X.0i65, X.0i66, X.0XuG, X.0mGW):void");
    }

    @Override // X.InterfaceC1231480i9S
    public final void LIZJ(Context context, String str, C1230910i8X c1230910i8X, Function1<? super GroupInfo, Unit> function1) {
        String str2 = FanGroupListFragment._pnsPageId;
        if (function1 != null) {
            FanGroupListFragment.LLIZ.add(function1);
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//im/fan_group_list");
        smartRouteBuildRoute.withParam("creator_uid", str);
        smartRouteBuildRoute.withParam("build_param", c1230910i8X);
        smartRouteBuildRoute.open();
    }

    public static final void LJI(int i, int i2, Fragment fragment, C1230910i8X c1230910i8X, String str) {
        C723850SaN.LIZ(fragment, false, null, new C500250Jjb(i2, i, fragment, c1230910i8X, str), 3);
    }
}
