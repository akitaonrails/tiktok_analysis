package X;

import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ukf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715830ukf {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final C1715110ujV<C1715260ujk> LIZJ;
    public final C1715110ujV<Boolean> LIZLLL;
    public final C1715110ujV<C1715260ujk> LJ;
    public final C1715110ujV<String> LJFF;
    public final C1715110ujV<C1715840ukg> LJI;
    public final C1715110ujV<Integer> LJII;
    public final boolean LJIIIIZZ;
    public final C1715110ujV<Boolean> LJIIIZ;
    public final WalletFlowDecision LJIIJ;

    public C1715830ukf() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1715830ukf)) {
            return false;
        }
        C1715830ukf c1715830ukf = (C1715830ukf) obj;
        return this.LIZ == c1715830ukf.LIZ && this.LIZIZ == c1715830ukf.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1715830ukf.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1715830ukf.LIZLLL) && Intrinsics.LJFF(this.LJ, c1715830ukf.LJ) && Intrinsics.LJFF(this.LJFF, c1715830ukf.LJFF) && Intrinsics.LJFF(this.LJI, c1715830ukf.LJI) && Intrinsics.LJFF(this.LJII, c1715830ukf.LJII) && this.LJIIIIZZ == c1715830ukf.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1715830ukf.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1715830ukf.LJIIJ);
    }

    public final int hashCode() {
        int iZ2 = ((((((((((((((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + this.LJIIIZ.hashCode()) * 31;
        WalletFlowDecision walletFlowDecision = this.LJIIJ;
        return iZ2 + (walletFlowDecision == null ? 0 : walletFlowDecision.hashCode());
    }

    public final String toString() {
        return "BiometricEnrollUiState(userConfirmed=" + this.LIZ + ", isLoading=" + this.LIZIZ + ", unrecoverableErrorPrompt=" + this.LIZJ + ", blockedByRiskControl=" + this.LIZLLL + ", actionRetryPrompt=" + this.LJ + ", actionErrorPrompt=" + this.LJFF + ", actionSignatureRequest=" + this.LJI + ", actionShowResultToast=" + this.LJII + ", enrollSucceeded=" + this.LJIIIIZZ + ", actionRetryAfterTimeout=" + this.LJIIIZ + ", dynamicFlowDecision=" + this.LJIIJ + ')';
    }

    public /* synthetic */ C1715830ukf(int i) {
        this(false, false, new C1715110ujV(null), new C1715110ujV(null), new C1715110ujV(null), new C1715110ujV(null), new C1715110ujV(null), new C1715110ujV(null), false, new C1715110ujV(null), null);
    }

    public C1715830ukf(boolean z, boolean z2, C1715110ujV<C1715260ujk> c1715110ujV, C1715110ujV<Boolean> c1715110ujV2, C1715110ujV<C1715260ujk> c1715110ujV3, C1715110ujV<String> c1715110ujV4, C1715110ujV<C1715840ukg> c1715110ujV5, C1715110ujV<Integer> c1715110ujV6, boolean z3, C1715110ujV<Boolean> c1715110ujV7, WalletFlowDecision walletFlowDecision) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = c1715110ujV;
        this.LIZLLL = c1715110ujV2;
        this.LJ = c1715110ujV3;
        this.LJFF = c1715110ujV4;
        this.LJI = c1715110ujV5;
        this.LJII = c1715110ujV6;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = c1715110ujV7;
        this.LJIIJ = walletFlowDecision;
    }

    public static C1715830ukf LIZ(C1715830ukf c1715830ukf, boolean z, boolean z2, C1715110ujV c1715110ujV, C1715110ujV c1715110ujV2, C1715110ujV c1715110ujV3, C1715110ujV c1715110ujV4, C1715110ujV c1715110ujV5, C1715110ujV c1715110ujV6, boolean z3, C1715110ujV c1715110ujV7, WalletFlowDecision walletFlowDecision, int i) {
        WalletFlowDecision walletFlowDecision2 = walletFlowDecision;
        C1715110ujV c1715110ujV8 = c1715110ujV7;
        boolean z4 = z3;
        C1715110ujV c1715110ujV9 = c1715110ujV6;
        C1715110ujV c1715110ujV10 = c1715110ujV5;
        C1715110ujV c1715110ujV11 = c1715110ujV4;
        C1715110ujV c1715110ujV12 = c1715110ujV3;
        C1715110ujV c1715110ujV13 = c1715110ujV2;
        C1715110ujV c1715110ujV14 = c1715110ujV;
        boolean z5 = z2;
        boolean z6 = z;
        if ((i & 1) != 0) {
            z6 = c1715830ukf.LIZ;
        }
        if ((i & 2) != 0) {
            z5 = c1715830ukf.LIZIZ;
        }
        if ((i & 4) != 0) {
            c1715110ujV14 = c1715830ukf.LIZJ;
        }
        if ((i & 8) != 0) {
            c1715110ujV13 = c1715830ukf.LIZLLL;
        }
        if ((i & 16) != 0) {
            c1715110ujV12 = c1715830ukf.LJ;
        }
        if ((i & 32) != 0) {
            c1715110ujV11 = c1715830ukf.LJFF;
        }
        if ((i & 64) != 0) {
            c1715110ujV10 = c1715830ukf.LJI;
        }
        if ((i & 128) != 0) {
            c1715110ujV9 = c1715830ukf.LJII;
        }
        if ((i & 256) != 0) {
            z4 = c1715830ukf.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            c1715110ujV8 = c1715830ukf.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            walletFlowDecision2 = c1715830ukf.LJIIJ;
        }
        c1715830ukf.getClass();
        return new C1715830ukf(z6, z5, c1715110ujV14, c1715110ujV13, c1715110ujV12, c1715110ujV11, c1715110ujV10, c1715110ujV9, z4, c1715110ujV8, walletFlowDecision2);
    }
}
