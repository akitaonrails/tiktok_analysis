package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0plh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524270plh {
    public static final /* synthetic */ int LIZLLL = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final String LIZ() {
        String str = this.LIZ;
        if (str != null && !a0.LJJJIL(str)) {
            return this.LIZ;
        }
        String str2 = this.LIZIZ;
        return (str2 == null || a0.LJJJIL(str2)) ? this.LIZJ : this.LIZIZ;
    }

    public C1524270plh(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        new ConcurrentHashMap();
    }
}
