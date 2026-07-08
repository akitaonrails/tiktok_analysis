package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06cS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1645806cS extends AbstractC1645706cR {
    public final EnumC454450Hrv LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1645806cS)) {
            return false;
        }
        C1645806cS c1645806cS = (C1645806cS) obj;
        return this.LIZIZ == c1645806cS.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1645806cS.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZIZ.hashCode() * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendSticker(messageType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stickerId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1645806cS(EnumC454450Hrv enumC454450Hrv, String str) {
        super("send_sticker");
        this.LIZIZ = enumC454450Hrv;
        this.LIZJ = str;
    }
}
