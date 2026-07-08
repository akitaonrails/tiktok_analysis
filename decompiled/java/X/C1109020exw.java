package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.PinMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0exw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1109020exw {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final long LIZ;
    public User LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public AbstractC1136060ffY LJFF;
    public PinMessage LJI;
    public long LJII;
    public EnumC1108030ewL LJIIIIZZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PinBizModel(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pinUser=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isUnderReview=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isRejected=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasUnpinPermission=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", pinMessage=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", timeLeft=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", unPinReason=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long LIZ() {
        long j = this.LJII;
        if (j > 0) {
            return (long) Math.ceil(j / 1000.0d);
        }
        return -1L;
    }

    public C1109020exw(long j) {
        EnumC1108030ewL enumC1108030ewL = EnumC1108030ewL.NULL;
        this.LIZ = j;
        this.LIZIZ = null;
        this.LIZJ = false;
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = 0L;
        this.LJIIIIZZ = enumC1108030ewL;
    }

    public final boolean equals(Object obj) {
        Long lValueOf;
        if (obj != this) {
            if (obj instanceof C1109020exw) {
                PinMessage pinMessage = this.LJI;
                Long lValueOf2 = null;
                if (pinMessage != null) {
                    lValueOf = Long.valueOf(pinMessage.pinId);
                } else {
                    lValueOf = null;
                }
                PinMessage pinMessage2 = ((C1109020exw) obj).LJI;
                if (pinMessage2 != null) {
                    lValueOf2 = Long.valueOf(pinMessage2.pinId);
                }
                if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
