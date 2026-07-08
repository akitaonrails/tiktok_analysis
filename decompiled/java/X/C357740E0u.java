package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0E0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357740E0u {
    public static void LIZ(String str) {
        Keva keva = C357770E0x.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("server_rendering_consent_");
        sbLIZ.append(str);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }
}
