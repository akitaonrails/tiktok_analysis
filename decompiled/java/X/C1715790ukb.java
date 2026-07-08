package X;

import java.security.KeyPair;
import java.util.UUID;

/* JADX INFO: renamed from: X.0ukb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715790ukb {
    public static String LIZ(KeyPair keyPair) {
        return C13LN.LJZL(64, UUID.nameUUIDFromBytes(keyPair.getPublic().getEncoded()).toString());
    }

    public static C20121713oF LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pipo_vc_bio_");
        sbLIZ.append(str);
        return new C20121713oF(C2188811AlT.LIZIZ(sbLIZ));
    }
}
