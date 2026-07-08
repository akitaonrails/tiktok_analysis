package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.dc.core.PORef;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ny1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C611110Ny1 implements InterfaceC610600NxC {
    public final Object LIZ = new Object();
    public volatile String LIZIZ = "";
    public final Object LIZJ = new Object();
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(6));
    public final C611190Ny9 LJ = new Object() { // from class: X.0Ny9
    };

    public final void LJ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (Intrinsics.LJFF(curUserId, this.LIZIZ)) {
            return;
        }
        synchronized (this.LIZ) {
            try {
                if (Intrinsics.LJFF(curUserId, this.LIZIZ)) {
                    return;
                }
                this.LIZIZ = curUserId;
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI("SkylightLiveStoreServiceImpl", "ensureAccountScope, user changed");
                synchronized (this.LIZJ) {
                    try {
                        ((C603820NmG) this.LIZLLL.getValue()).LJIIIZ(-1);
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // X.InterfaceC610630NxF
    public final Object LIZJ(PORef pORef) {
        String str = pORef.type;
        AbstractC610520Nx4 abstractC610520Nx4 = C610530Nx5.LIZJ;
        if (!Intrinsics.LJFF(str, abstractC610520Nx4.LIZ)) {
            abstractC610520Nx4 = C610510Nx3.LIZJ;
            if (!Intrinsics.LJFF(str, abstractC610520Nx4.LIZ)) {
                abstractC610520Nx4 = null;
            }
        }
        return Boolean.valueOf(Intrinsics.LJFF(abstractC610520Nx4, C610510Nx3.LIZJ));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    @Override // X.InterfaceC610630NxF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<com.ss.android.ugc.aweme.dc.core.PORef> r10, X.InterfaceC1364105Vn<? super java.util.List<X.C610660NxI<X.C610500Nx2>>> r11) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C611110Ny1.LIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6 A[SYNTHETIC] */
    @Override // X.InterfaceC610630NxF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.List<X.C610660NxI<X.C610500Nx2>> r24, X.InterfaceC1364105Vn<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C611110Ny1.LIZLLL(java.util.List, X.05Vn):java.lang.Object");
    }
}
