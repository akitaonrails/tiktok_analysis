package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.dc.core.PORef;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NyF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C611250NyF implements InterfaceC610590NxB {
    public final Object LIZ = new Object();
    public volatile String LIZIZ = "";
    public final Object LIZJ = new Object();
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(7));
    public final Object LJ = new Object();
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(8));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(9));
    public final C611340NyO LJII = new Object() { // from class: X.0NyO
    };

    public final C603820NmG<String, Long> LJFF() {
        return (C603820NmG) this.LJFF.getValue();
    }

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
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI("StoryCollectionStoreService", "ensureAccountScope, user changed");
                this.LIZIZ = curUserId;
                synchronized (this.LJ) {
                    try {
                        LJFF().LJIIIZ(-1);
                    } finally {
                    }
                }
                synchronized (this.LIZJ) {
                    try {
                        ((C603820NmG) this.LIZLLL.getValue()).LJIIIZ(-1);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // X.InterfaceC610630NxF
    public final Object LIZJ(PORef pORef) {
        AbstractC610520Nx4 abstractC610520Nx4;
        String str = pORef.type;
        AbstractC610520Nx4 abstractC610520Nx42 = C610530Nx5.LIZJ;
        if (Intrinsics.LJFF(str, abstractC610520Nx42.LIZ)) {
            abstractC610520Nx4 = abstractC610520Nx42;
        } else {
            abstractC610520Nx4 = C610510Nx3.LIZJ;
            if (!Intrinsics.LJFF(str, abstractC610520Nx4.LIZ)) {
                abstractC610520Nx4 = null;
            }
        }
        return Boolean.valueOf(Intrinsics.LJFF(abstractC610520Nx4, abstractC610520Nx42));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    @Override // X.InterfaceC610630NxF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<com.ss.android.ugc.aweme.dc.core.PORef> r10, X.InterfaceC1364105Vn<? super java.util.List<X.C610660NxI<com.ss.android.ugc.aweme.feed.model.Aweme>>> r11) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C611250NyF.LIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b5  */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v6, types: [int] */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v0, types: [X.0NyF] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.StringBuilder] */
    @Override // X.InterfaceC610630NxF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.List<X.C610660NxI<com.ss.android.ugc.aweme.feed.model.Aweme>> r30, X.InterfaceC1364105Vn<? super kotlin.Unit> r31) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C611250NyF.LIZLLL(java.util.List, X.05Vn):java.lang.Object");
    }

    public final void LJIIIIZZ(List<C611290NyJ> list, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        if (z) {
            synchronized (this.LIZJ) {
                try {
                    for (C611290NyJ c611290NyJ : list) {
                        Long l = c611290NyJ.LIZIZ;
                        if (l != null) {
                            ((C603820NmG) this.LIZLLL.getValue()).LIZLLL(c611290NyJ.LIZ.LIZ, Long.valueOf(l.longValue()));
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        synchronized (this.LJ) {
            try {
                for (C611290NyJ c611290NyJ2 : list) {
                    LJFF().LIZLLL(c611290NyJ2.LIZ.LIZ, Long.valueOf(c611290NyJ2.LIZJ));
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    @Override // X.InterfaceC610590NxB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r10, com.ss.android.ugc.aweme.feed.model.story.UserStory r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C611250NyF.LIZIZ(java.lang.String, com.ss.android.ugc.aweme.feed.model.story.UserStory, X.05Vn):java.lang.Object");
    }

    public final boolean LJI(String str, long j, C611310NyL c611310NyL) {
        Long lLIZJ;
        synchronized (this.LJ) {
            try {
                lLIZJ = LJFF().LIZJ(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (lLIZJ != null && lLIZJ.longValue() == j) {
            return false;
        }
        return true;
    }

    public final boolean LJII(String str, Long l, C611310NyL c611310NyL) {
        Long l2;
        if (l == null) {
            return true;
        }
        synchronized (this.LIZJ) {
            try {
                l2 = (Long) ((C603820NmG) this.LIZLLL.getValue()).LIZJ(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (l2 == null || !Intrinsics.LJFF(l2, l)) {
            return true;
        }
        return false;
    }
}
