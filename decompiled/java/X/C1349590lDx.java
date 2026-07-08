package X;

import android.app.Activity;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardVMAbility;

/* JADX INFO: renamed from: X.0lDx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349590lDx {
    public static long LJIIL;
    public static long LJIILIIL;
    public static final /* synthetic */ int LJIILJJIL = 0;
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final C1349600lDy LJIIJ;
    public final C1349620lE0 LJIIJJI;

    public final void LJ() {
        if (this.LIZJ != 0) {
            this.LIZLLL += SystemClock.elapsedRealtime() - this.LIZJ;
            this.LIZJ = 0L;
        }
    }

    public final void LJFF() {
        this.LIZ = 0L;
        this.LIZIZ = 0L;
        this.LIZLLL = 0L;
        this.LIZJ = 0L;
        this.LJ = 0L;
        this.LJFF = 0L;
        this.LJI = 0L;
        this.LJII = 0L;
    }

    public final long LIZ() {
        long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.LIZ) - this.LIZLLL;
        long j = 0;
        if (jElapsedRealtime >= 0) {
            if (jElapsedRealtime < 43200000) {
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("calculateDuration duration = ");
            sbLIZ.append(j);
            C2188811AlT.LIZIZ(sbLIZ);
            return j;
        }
        jElapsedRealtime = 0;
        j = jElapsedRealtime;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("calculateDuration duration = ");
        sbLIZ2.append(j);
        C2188811AlT.LIZIZ(sbLIZ2);
        return j;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0lE0] */
    public C1349590lDx(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentPageDurationCalculator ");
        sbLIZ.append(str);
        this.LJIIIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LJIIJ = new C1349600lDy(this);
        this.LJIIJJI = new InterfaceC1346530l91() { // from class: X.0lE0
            @Override // X.InterfaceC1346530l91
            public final void onDismiss() {
                C1349590lDx c1349590lDx = this.LIZ;
                if (c1349590lDx.LJI > 0) {
                    c1349590lDx.LJII += SystemClock.elapsedRealtime() - this.LIZ.LJI;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("keyboardShowTotalTime =  ");
                    sbLIZ2.append(this.LIZ.LJII);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            }

            @Override // X.InterfaceC1346530l91
            public final void onShow() {
                this.LIZ.LJI = SystemClock.elapsedRealtime();
            }
        };
    }

    public final long LIZIZ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("calculateValidDuration oldDuration = ");
        sbLIZ.append(j);
        sbLIZ.append(" longPressPageShowTotalTime = ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(" keyboardShowTotalTime = ");
        sbLIZ.append(this.LJII);
        C2188811AlT.LIZIZ(sbLIZ);
        long j2 = (j - this.LJFF) - this.LJII;
        if (j2 < 0 || j2 > 43200000 || j2 >= 43200000) {
            return 0L;
        }
        return j2;
    }

    public final void LJI(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startCalculate preStartCostTime = ");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZIZ = j;
        this.LIZ = SystemClock.elapsedRealtime();
    }

    public final void LIZJ(Fragment fragment, InterfaceC665370Q7z interfaceC665370Q7z) {
        IKeyboardVMAbility iKeyboardVMAbilityLJIIIIZZ;
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && C1388190mED.LIZ(activityLIZIZ) != null && fragment != null) {
            FragmentManager fragmentManagerLJ = C1345700l7g.LJ(fragment);
            if (fragmentManagerLJ != null) {
                fragmentManagerLJ.LLIILZL(this.LJIIJ);
            }
            this.LJIIIIZZ = false;
        }
        if (interfaceC665370Q7z != null && (iKeyboardVMAbilityLJIIIIZZ = C1345760l7m.LJIIIIZZ(fragment, interfaceC665370Q7z)) != null) {
            iKeyboardVMAbilityLJIIIIZZ.tP1(this.LJIIJJI);
        }
    }

    public final void LIZLLL(boolean z, InterfaceC665370Q7z interfaceC665370Q7z, Fragment fragment, boolean z2) {
        IKeyboardVMAbility iKeyboardVMAbilityLJIIIIZZ;
        Activity activityLIZIZ;
        IKeyboardVMAbility iKeyboardVMAbilityLJIIIIZZ2;
        Activity activityLIZIZ2;
        IKeyboardVMAbility iKeyboardVMAbilityLJIIIIZZ3;
        IKeyboardVMAbility iKeyboardVMAbilityLJIIIIZZ4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageVisibleChange showPage = ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (z2) {
            if (fragment == null || !fragment.isAdded()) {
                return;
            }
            if (z) {
                FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                C1349600lDy c1349600lDy = this.LJIIJ;
                c1349600lDy.LL = interfaceC665370Q7z;
                childFragmentManager.LJZL(c1349600lDy, false);
                this.LJIIIIZZ = true;
                if (interfaceC665370Q7z != null && (iKeyboardVMAbilityLJIIIIZZ4 = C1345760l7m.LJIIIIZZ(fragment, interfaceC665370Q7z)) != null) {
                    iKeyboardVMAbilityLJIIIIZZ4.Qu0(this.LJIIJJI);
                    return;
                }
                return;
            }
            fragment.getChildFragmentManager().LLIILZL(this.LJIIJ);
            this.LJIIIIZZ = false;
            if (interfaceC665370Q7z == null || (iKeyboardVMAbilityLJIIIIZZ3 = C1345760l7m.LJIIIIZZ(fragment, interfaceC665370Q7z)) == null) {
                return;
            }
            iKeyboardVMAbilityLJIIIIZZ3.tP1(this.LJIIJJI);
            return;
        }
        if (z) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ2 = abstractC1387200mCcLIZIZ.LIZIZ()) != null && C1388190mED.LIZ(activityLIZIZ2) != null && fragment != null && !this.LJIIIIZZ) {
                FragmentManager fragmentManagerLJ = C1345700l7g.LJ(fragment);
                if (fragmentManagerLJ != null) {
                    C1349600lDy c1349600lDy2 = this.LJIIJ;
                    c1349600lDy2.LL = interfaceC665370Q7z;
                    fragmentManagerLJ.LJZL(c1349600lDy2, false);
                }
                this.LJIIIIZZ = true;
            }
            if (interfaceC665370Q7z != null && (iKeyboardVMAbilityLJIIIIZZ2 = C1345760l7m.LJIIIIZZ(fragment, interfaceC665370Q7z)) != null) {
                iKeyboardVMAbilityLJIIIIZZ2.Qu0(this.LJIIJJI);
                return;
            }
            return;
        }
        AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ2 != null && (activityLIZIZ = abstractC1387200mCcLIZIZ2.LIZIZ()) != null && C1388190mED.LIZ(activityLIZIZ) != null && fragment != null) {
            FragmentManager fragmentManagerLJ2 = C1345700l7g.LJ(fragment);
            if (fragmentManagerLJ2 != null) {
                fragmentManagerLJ2.LLIILZL(this.LJIIJ);
            }
            this.LJIIIIZZ = false;
        }
        if (interfaceC665370Q7z == null || (iKeyboardVMAbilityLJIIIIZZ = C1345760l7m.LJIIIIZZ(fragment, interfaceC665370Q7z)) == null) {
            return;
        }
        iKeyboardVMAbilityLJIIIIZZ.tP1(this.LJIIJJI);
    }
}
