package X;

import java.net.URL;

/* JADX INFO: renamed from: X.0V4n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791870V4n {
    public static final String[] LIZ = new String[100];
    public static volatile int LIZIZ;

    public static void LIZ(String str) {
        if (LIZIZ >= 100) {
            synchronized (C791870V4n.class) {
                try {
                    if (LIZIZ >= 100) {
                        LIZIZ = 0;
                    }
                } finally {
                }
            }
        }
        try {
            URL url = new URL(str);
            String path = url.getPath();
            if (str.startsWith("https://")) {
                String[] strArr = LIZ;
                int i = LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("https://");
                sbLIZ.append(url.getHost());
                sbLIZ.append(path);
                strArr[i] = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                String[] strArr2 = LIZ;
                int i2 = LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("http://");
                sbLIZ2.append(url.getHost());
                sbLIZ2.append(path);
                strArr2[i2] = C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (C792400V6o.LJIIIIZZ()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("addSendUrl:");
                sbLIZ3.append(LIZ[LIZIZ]);
                C792910V8n.LIZ("NetworkUrlCache", C2188811AlT.LIZIZ(sbLIZ3));
            }
            synchronized (C791870V4n.class) {
                try {
                    LIZIZ++;
                } finally {
                }
            }
        } catch (Throwable th) {
        }
    }
}
