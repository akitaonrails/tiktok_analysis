package X;

/* JADX INFO: renamed from: X.0oWD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1476230oWD implements InterfaceC1476310oWL {
    public static final int LIZ(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.contains(".m3u8?") || lowerCase.endsWith(".m3u8") || lowerCase.contains(".m3u?") || lowerCase.endsWith(".m3u")) {
            return 1;
        }
        if (!lowerCase.endsWith(".mpd") && !lowerCase.contains(".mpd?")) {
            return 0;
        }
        return 2;
    }
}
