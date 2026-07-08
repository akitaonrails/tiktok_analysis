package X;

import android.util.LruCache;
import java.util.List;

/* JADX INFO: renamed from: X.0pg6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1520800pg6 {
    public static final C1520610pfn LIZIZ = new C1520610pfn("__hybrid_default", "default_bid");
    public static final C1520850pgB LIZJ;
    public final String LIZ;

    public abstract C1520610pfn LIZJ(List<String> list, EnumC1520910pgH enumC1520910pgH, boolean z);

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0pgB] */
    static {
        final int iMaxMemory = (((int) Runtime.getRuntime().maxMemory()) / 1024) / 8;
        LIZJ = new LruCache<String, String>(iMaxMemory) { // from class: X.0pgB
            @Override // android.util.LruCache
            public final int sizeOf(String str, String str2) {
                String str3 = str;
                String str4 = str2;
                int length = 0;
                if (str3 == null) {
                    return 0;
                }
                int length2 = str3.length();
                if (str4 != null) {
                    length = str4.length();
                }
                return length + length2;
            }
        };
    }

    public AbstractC1520800pg6(String str) {
        this.LIZ = str;
    }

    public final String LIZIZ(String str) {
        if (str != null && str.length() != 0) {
            C1520850pgB c1520850pgB = LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZ);
            sbLIZ.append(':');
            sbLIZ.append(str);
            return c1520850pgB.get(C2188811AlT.LIZIZ(sbLIZ));
        }
        return null;
    }

    public final void LIZ(String str, String str2) {
        if (str != null && str.length() != 0) {
            C1520850pgB c1520850pgB = LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZ);
            sbLIZ.append(':');
            sbLIZ.append(str);
            c1520850pgB.put(C2188811AlT.LIZIZ(sbLIZ), str2);
        }
    }
}
