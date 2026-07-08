package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.060z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15395060z {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(C0Y8T c0y8t) {
        Map<String, String> ext;
        String str;
        C0Y8Y coreInfo = c0y8t.getCoreInfo();
        if (coreInfo != null && (ext = coreInfo.getExt()) != null && (str = ext.get("a:bot_replied_creator_uid")) != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(C869590Y9l c869590Y9l) {
        String str;
        Map<String, String> ext = c869590Y9l.getExt();
        String str2 = null;
        if (ext != null) {
            str = ext.get("a:bot_type");
        } else {
            str = null;
        }
        Map<String, String> ext2 = c869590Y9l.getExt();
        if (ext2 != null) {
            str2 = ext2.get("a:reply_type");
        }
        if (Intrinsics.LJFF(str, "smart_reply") && Intrinsics.LJFF(str2, "auto_reply")) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(C0Y8T c0y8t) {
        Map<String, String> ext;
        String str;
        C0Y8Y coreInfo = c0y8t.getCoreInfo();
        if (coreInfo != null && (ext = coreInfo.getExt()) != null && (str = ext.get("a:bot_replied_creator_uid")) != null) {
            return Intrinsics.LJFF(str, C461720I8s.LIZIZ());
        }
        return false;
    }
}
