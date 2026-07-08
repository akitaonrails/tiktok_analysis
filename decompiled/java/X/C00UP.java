package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.CountdownForAllUser;

/* JADX INFO: renamed from: X.00UP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00UP implements InterfaceC951240arS<Object> {
    public final CountdownForAllUser LIZ;
    public final int LIZIZ;

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        Boolean boolValueOf;
        if (obj instanceof C00UP) {
            C00UP c00up = (C00UP) obj;
            CountdownForAllUser countdownForAllUser = c00up.LIZ;
            long j = countdownForAllUser.userId;
            CountdownForAllUser countdownForAllUser2 = this.LIZ;
            if (j == countdownForAllUser2.userId && Intrinsics.LJFF(countdownForAllUser.linkmicId, countdownForAllUser2.linkmicId)) {
                long j2 = countdownForAllUser.score;
                CountdownForAllUser countdownForAllUser3 = this.LIZ;
                if (j2 == countdownForAllUser3.score && countdownForAllUser.rank == countdownForAllUser3.rank && c00up.LIZIZ == this.LIZIZ) {
                    User.EnigmaInfo enigmaInfo = c00up.LIZ.enigmaInfo;
                    Boolean boolValueOf2 = null;
                    if (enigmaInfo != null) {
                        boolValueOf = Boolean.valueOf(enigmaInfo.isEnigmaMaskOn);
                    } else {
                        boolValueOf = null;
                    }
                    User.EnigmaInfo enigmaInfo2 = this.LIZ.enigmaInfo;
                    if (enigmaInfo2 != null) {
                        boolValueOf2 = Boolean.valueOf(enigmaInfo2.isEnigmaMaskOn);
                    }
                    if (Intrinsics.LJFF(boolValueOf, boolValueOf2)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C00UP;
    }

    public C00UP(CountdownForAllUser countdownForAllUser, int i) {
        this.LIZ = countdownForAllUser;
        this.LIZIZ = i;
    }
}
