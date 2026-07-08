package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ybc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877500Ybc {
    public static final C877500Ybc LIZ = new C877500Ybc();

    public static final EnumC877490Ybb LIZ(String str) {
        Map<String, String> ext;
        String str2;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ == null) {
            return EnumC877490Ybb.UNKNOWN;
        }
        C0Y8W settingInfo = c0y8tLIZ.getSettingInfo();
        if (settingInfo != null && (ext = settingInfo.getExt()) != null && (str2 = ext.get("a:conv_set_notification")) != null && C123100dR.LIZ(str2)) {
            EnumC877490Ybb.Companion.getClass();
            for (EnumC877490Ybb enumC877490Ybb : EnumC877490Ybb.values()) {
                if (Intrinsics.LJFF(enumC877490Ybb.getValue(), str2)) {
                    return enumC877490Ybb;
                }
            }
            EnumC877490Ybb enumC877490Ybb2 = EnumC877490Ybb.UNKNOWN;
            if (enumC877490Ybb2 != null) {
                return enumC877490Ybb2;
            }
        }
        C0Y8T c0y8tLIZ2 = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ2 == null) {
            return EnumC877490Ybb.UNKNOWN;
        }
        if (c0y8tLIZ2.isMute()) {
            return EnumC877490Ybb.MUTE;
        }
        if (C1229100i5c.LIZ.LJIIL(c0y8tLIZ2)) {
            return EnumC877490Ybb.HIGHLIGHTS;
        }
        return EnumC877490Ybb.ALL;
    }
}
