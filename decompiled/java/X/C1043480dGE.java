package X;

/* JADX INFO: renamed from: X.0dGE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043480dGE {
    public static String LIZ(String str) {
        if (str.endsWith(".js")) {
            return "application/x-javascript";
        }
        if (str.endsWith(".json")) {
            return "application/json";
        }
        if (str.endsWith(".css")) {
            return "text/css";
        }
        if (str.endsWith(".html")) {
            return "text/html";
        }
        if (str.endsWith(".ico")) {
            return "image/x-icon";
        }
        if (!str.endsWith(".jpeg") && !str.endsWith(".jpg")) {
            if (str.endsWith(".png")) {
                return "image/png";
            }
            if (str.endsWith(".gif")) {
                return "image/gif";
            }
            if (str.endsWith(".woff")) {
                return "font/woff";
            }
            if (str.endsWith(".svg")) {
                return "image/svg+xml";
            }
            if (str.endsWith(".ttf")) {
                return "font/ttf";
            }
            return "";
        }
        return "image/jpeg";
    }
}
