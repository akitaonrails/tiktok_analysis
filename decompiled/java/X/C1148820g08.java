package X;

import com.bytedance.android.livesdk.model.message.GiftMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g08, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1148820g08 {
    public final GiftMessage LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final long LJI;
    public final long LJII;
    public final long LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1148820g08)) {
            return false;
        }
        C1148820g08 c1148820g08 = (C1148820g08) obj;
        return Intrinsics.LJFF(this.LIZ, c1148820g08.LIZ) && this.LIZIZ == c1148820g08.LIZIZ && this.LIZJ == c1148820g08.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1148820g08.LIZLLL) && this.LJ == c1148820g08.LJ && this.LJFF == c1148820g08.LJFF && this.LJI == c1148820g08.LJI && this.LJII == c1148820g08.LJII && this.LJIIIIZZ == c1148820g08.LJIIIIZZ;
    }

    public final int hashCode() {
        GiftMessage giftMessage = this.LIZ;
        return ((((((((((((((((giftMessage == null ? 0 : giftMessage.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + C786410Ut5.Y2(this.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftQueueDebugMessage(giftMessage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", target=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", currentProcess=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", signature=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isLocal=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", totalAmount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", receiveMs=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", enterQueueMs=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", outOfQueueMs=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1148820g08(GiftMessage giftMessage, int i, int i2, String str, boolean z, int i3, long j, long j2, long j3) {
        this.LIZ = giftMessage;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str;
        this.LJ = z;
        this.LJFF = i3;
        this.LJI = j;
        this.LJII = j2;
        this.LJIIIIZZ = j3;
    }
}
