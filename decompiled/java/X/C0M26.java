package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.port.internal.draft.IDraftOrganizerPostTracker;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxPageViewModel;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS175S0101000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M26, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M26 implements C0M1L {
    public C0M22 LIZ;
    public C05JA LIZIZ;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public DraftBoxFragment LJIIIZ;
    public DraftBoxPageViewModel LJIIJ;
    public C561900M2a LJIIJJI;
    public C555490LqV LJIIL;
    public C561130Lzb LJIILIIL;
    public ComposeView LJIILJJIL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public final C05P0 LIZJ = C20028913Yh.LJI(C0M23.LIZ);
    public final C05P0 LIZLLL = C20028913Yh.LJI(C08CX.INSTANCE);
    public final C05P0 LJ = C20028913Yh.LJI(null);
    public String LJFF = "personal_homepage";
    public final C01GW LJIILL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(642));
    public final C19719212De LJIJI = new C19719212De(-621875630, new C581290Mr1(this, 1), true);

    @Override // X.C0M1L
    public final void LIZ(View view, DraftBoxPageViewModel draftBoxPageViewModel, InterfaceC561590M0v interfaceC561590M0v) {
    }

    public final Set<String> LJII() {
        return (Set) this.LIZLLL.getValue();
    }

    public final C0M24 LJIIIIZZ() {
        return (C0M24) this.LIZJ.getValue();
    }

    @Override // X.C0M1L
    public final void onDestroy() {
        ViewGroup viewGroup;
        ComposeView composeView = this.LJIILJJIL;
        if (composeView != null) {
            ViewParent parent = composeView.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(composeView, viewGroup);
            }
        }
        this.LJIILJJIL = null;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIIJJI = null;
        this.LJIIL = null;
        this.LJIILIIL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C0M28
            if (r0 == 0) goto L23
            r6 = r8
            X.0M28 r6 = (X.C0M28) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r3 = r6.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r6.LLILZ
            r5 = 0
            r0 = 1
            if (r1 == 0) goto L31
            if (r1 != r0) goto L29
            X.0M22 r4 = r6.LL
            goto L50
        L23:
            X.0M28 r6 = new X.0M28
            r6.<init>(r7, r8)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r3)
            X.0M22 r4 = r7.LIZ
            if (r4 != 0) goto L3e
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L3e:
            r6.LL = r4     // Catch: java.lang.Throwable -> L5b
            r6.LLILZ = r0     // Catch: java.lang.Throwable -> L5b
            X.1DFB r1 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> L5b
            X.0M1v r0 = new X.0M1v     // Catch: java.lang.Throwable -> L5b
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r3 = X.C23250099c.LJI(r6, r1, r0)     // Catch: java.lang.Throwable -> L5b
            if (r3 != r2) goto L53
            return r2
        L50:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L59
        L53:
            X.0M29 r3 = (X.C0M29) r3     // Catch: java.lang.Throwable -> L59
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L59
            goto L67
        L59:
            r0 = move-exception
            goto L5c
        L5b:
            r0 = move-exception
        L5c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L67:
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r3)
            if (r2 == 0) goto L74
            X.0MAY r1 = X.C0MAY.LIZIZ
            java.lang.String r0 = "DraftBoxOrganizer"
            X.C201955140j.LJIIJ(r1, r0, r2)
        L74:
            boolean r0 = X.C189200o6.m7isFailureimpl(r3)
            if (r0 != 0) goto L7b
            r5 = r3
        L7b:
            X.0M29 r5 = (X.C0M29) r5
            if (r5 != 0) goto L85
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L85:
            boolean r0 = LJIIIZ(r5, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M26.LJFF(X.05Vn):java.lang.Object");
    }

    public final void LJI(String str) {
        C05JA c05ja;
        DraftBoxFragment draftBoxFragment;
        if (this.LJIILLIIL) {
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("evaluateIntro[");
            sbLIZ.append(str);
            sbLIZ.append("]: skip — already evaluated this session");
            C201955140j.LIZLLL(c0may, "DraftBoxOrganizer", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_draft_management_use_popup", true, false)) {
            C0MAY c0may2 = C0MAY.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("evaluateIntro[");
            sbLIZ2.append(str);
            sbLIZ2.append("]: skip — intro sheet disabled by settings");
            C201955140j.LIZLLL(c0may2, "DraftBoxOrganizer", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        C0M22 c0m22 = this.LIZ;
        if (c0m22 == null || (c05ja = this.LIZIZ) == null || (draftBoxFragment = this.LJIIIZ) == null) {
            return;
        }
        if (!c05ja.LIZIZ()) {
            C0MAY c0may3 = C0MAY.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("evaluateIntro[");
            sbLIZ3.append(str);
            sbLIZ3.append("]: skip — guard.shouldShow=false");
            C201955140j.LIZLLL(c0may3, "DraftBoxOrganizer", C2188811AlT.LIZIZ(sbLIZ3));
            this.LJIILLIIL = true;
            return;
        }
        this.LJIILLIIL = true;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(draftBoxFragment.getViewLifecycleOwner()), null, null, new C561860M1w(str, this, c0m22, draftBoxFragment, null), 3);
    }

    public final void LJIIJ(C0M1D c0m1d) {
        if (!this.LJI) {
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyManageAction[");
            sbLIZ.append(c0m1d);
            sbLIZ.append("]: skip — window not open");
            C201955140j.LIZLLL(c0may, "DraftBoxOrganizer", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (this.LJII) {
            C0MAY c0may2 = C0MAY.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("notifyManageAction[");
            sbLIZ2.append(c0m1d);
            sbLIZ2.append("]: noop — already rewarded this session");
            C201955140j.LIZLLL(c0may2, "DraftBoxOrganizer", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        C05JA c05ja = this.LIZIZ;
        if (c05ja != null) {
            C05J9.LIZLLL(c05ja.LIZ);
        }
        this.LJII = true;
        IDraftOrganizerPostTracker iDraftOrganizerPostTracker = (IDraftOrganizerPostTracker) this.LJIILL.getValue();
        if (iDraftOrganizerPostTracker != null) {
            iDraftOrganizerPostTracker.LIZJ();
        }
        C0MAY c0may3 = C0MAY.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("notifyManageAction[");
        sbLIZ3.append(c0m1d);
        sbLIZ3.append("]: rewarded");
        C201955140j.LIZLLL(c0may3, "DraftBoxOrganizer", C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final void LJIILJJIL(C0M2B c0m2b) {
        if (this.LJIIIIZZ) {
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("punishOnceIfNeeded[");
            sbLIZ.append(c0m2b);
            sbLIZ.append("]: noop — already punished");
            C201955140j.LIZLLL(c0may, "DraftBoxOrganizer", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (this.LJII) {
            C0MAY c0may2 = C0MAY.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("punishOnceIfNeeded[");
            sbLIZ2.append(c0m2b);
            sbLIZ2.append("]: noop — already rewarded");
            C201955140j.LIZLLL(c0may2, "DraftBoxOrganizer", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        C05JA c05ja = this.LIZIZ;
        if (c05ja != null) {
            c05ja.LIZ();
        }
        this.LJIIIIZZ = true;
        C0MAY c0may3 = C0MAY.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("punishOnceIfNeeded[");
        sbLIZ3.append(c0m2b);
        sbLIZ3.append("]: punished");
        C201955140j.LIZLLL(c0may3, "DraftBoxOrganizer", C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final void LJIILLIIL(C0M24 c0m24) {
        ((C13FE) this.LIZJ).setValue(c0m24);
    }

    public static boolean LJIIIZ(C0M29 c0m29, C0M22 c0m22) {
        if (c0m22 instanceof C0M20) {
            C0M20 c0m20 = (C0M20) c0m22;
            if (c0m29.LIZ > c0m20.LIZ && c0m29.LIZIZ >= c0m20.LIZIZ) {
                return true;
            }
            return false;
        }
        if (c0m22 instanceof C561890M1z) {
            C561890M1z c561890M1z = (C561890M1z) c0m22;
            if (c0m29.LIZJ > c561890M1z.LIZ && c0m29.LIZLLL > c561890M1z.LIZIZ) {
                return true;
            }
            return false;
        }
        throw new C1954807lC();
    }

    public static String LJIILIIL(EnumC561670M1d enumC561670M1d, C0M22 c0m22) {
        int i = C561680M1e.LIZ[enumC561670M1d.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new C1954807lC();
            }
            return "size_desc";
        }
        if (c0m22 instanceof C0M20) {
            return "creation_date_asc";
        }
        if (!(c0m22 instanceof C561890M1z)) {
            throw new C1954807lC();
        }
        return "size_desc";
    }

    public final void LJ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(2017485750);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C0M24 c0m24LJIIIIZZ = LJIIIIZZ();
            if (c0m24LJIIIIZZ instanceof C0M23) {
                c13zcLJIIJ.LJJIIJZLJL(1773559514);
                c13zcLJIIJ.LJJJJL(false);
            } else if (c0m24LJIIIIZZ instanceof C561870M1x) {
                c13zcLJIIJ.LJJIIJZLJL(1773560713);
                LIZJ((C561870M1x) c0m24LJIIIIZZ, c13zcLJIIJ, (i2 << 3) & 112);
                c13zcLJIIJ.LJJJJL(false);
            } else if (c0m24LJIIIIZZ instanceof C561880M1y) {
                c13zcLJIIJ.LJJIIJZLJL(1773562410);
                LIZLLL((C561880M1y) c0m24LJIIIIZZ, c13zcLJIIJ, (i2 << 3) & 112);
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(1773558142);
                c13zcLJIIJ.LJJJJL(false);
                throw new C1954807lC();
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS175S0101000_8(this, i, 3);
        }
    }

    public static List LJIILL(List list, EnumC561670M1d enumC561670M1d, C0M22 c0m22) {
        int i = C561680M1e.LIZ[enumC561670M1d.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C561750M1l.LIZIZ(((long) C561710M1h.LIZ().topBannerSizeSectionMB) * 1024 * 1024, list);
            }
            throw new C1954807lC();
        }
        return C561750M1l.LIZ(list, c0m22);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C0M1R r25, X.InterfaceC1680500tpg r26, int r27) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M26.LIZIZ(X.0M1R, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C561870M1x r30, X.InterfaceC1680500tpg r31, int r32) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M26.LIZJ(X.0M1x, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C561880M1y r31, X.InterfaceC1680500tpg r32, int r33) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M26.LIZLLL(X.0M1y, X.0tpg, int):void");
    }

    public final void LJIIJJI(boolean z, String str, EnumC561670M1d enumC561670M1d) {
        C0M11 c0m11;
        C0M22 c0m22 = this.LIZ;
        DraftBoxFragment draftBoxFragment = this.LJIIIZ;
        String str2 = null;
        if (c0m22 != null && draftBoxFragment != null) {
            if (Intrinsics.LJFF(draftBoxFragment.dS().LLIZ.getValue(), Boolean.TRUE) && (c0m11 = draftBoxFragment.LLLF) != null) {
                c0m11.LIZIZ();
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(draftBoxFragment.getViewLifecycleOwner()), null, null, new C561650M1b(this, enumC561670M1d, c0m22, z, str, draftBoxFragment, null), 3);
            return;
        }
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sb = new StringBuilder("openManageSheet: skip — strategy=");
        sb.append(c0m22);
        sb.append(", fragment=");
        if (draftBoxFragment != null) {
            str2 = "set";
        }
        sb.append(str2);
        C201955140j.LIZLLL(c0may, "DraftBoxOrganizer", sb.toString());
    }
}
