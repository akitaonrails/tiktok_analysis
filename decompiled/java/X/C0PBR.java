package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PBR, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PBR {
    public static C0PBQ LIZ;

    public static void LIZJ() {
        C0PG3 c0pg3;
        C0PBQ c0pbq = LIZ;
        if (c0pbq == null || (c0pg3 = c0pbq.LIZIZ) == C0PG3.REPORTED || c0pg3 == C0PG3.PLAYER_GET_CALLED) {
            return;
        }
        try {
            C09AE c09ae = c0pbq.LJ;
            Unit unit = null;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZ(InterfaceC648350Pbt interfaceC648350Pbt) {
        C0PG3 c0pg3;
        C0PBQ c0pbq;
        C0PBQ c0pbq2 = LIZ;
        C0PG3 c0pg32 = null;
        if (c0pbq2 != null) {
            c0pg3 = c0pbq2.LIZIZ;
        } else {
            c0pg3 = null;
        }
        if (c0pg3 == C0PG3.START_CALCULATE) {
            if (interfaceC648350Pbt instanceof ViewOnAttachStateChangeListenerC648030PbN) {
                C0PBQ c0pbq3 = LIZ;
                if (c0pbq3 != null) {
                    c0pbq3.LIZJ = interfaceC648350Pbt;
                }
                if (((ViewOnAttachStateChangeListenerC648030PbN) interfaceC648350Pbt).LLILZIL) {
                    if (c0pbq3 != null) {
                        c0pbq3.LIZIZ = C0PG3.CALL_RESULT_PERFORM_PLAY_BUT_LAZY;
                        return;
                    }
                    return;
                } else {
                    if (c0pbq3 == null) {
                        return;
                    }
                    c0pbq3.LIZIZ = C0PG3.CALL_RESULT_PERFORM_PLAY;
                    return;
                }
            }
            LIZJ();
            return;
        }
        C0PBQ c0pbq4 = LIZ;
        if (c0pbq4 != null) {
            c0pg32 = c0pbq4.LIZIZ;
        }
        if (c0pg32 != C0PG3.CALL_RESULT_PERFORM_PLAY_BUT_LAZY || (c0pbq = LIZ) == null) {
            return;
        }
        c0pbq.LIZIZ = C0PG3.LAZY_CALCULATE;
    }

    public static void LIZIZ(String str) {
        C0PBQ c0pbq = LIZ;
        if (c0pbq != null && !c0pbq.LJI) {
            String str2 = c0pbq.LJFF;
            if (str2 != null && !Intrinsics.LJFF(str2, str)) {
                c0pbq.LJI = true;
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01NJ(null), 2);
            } else {
                c0pbq.LJFF = str;
            }
        }
    }
}
