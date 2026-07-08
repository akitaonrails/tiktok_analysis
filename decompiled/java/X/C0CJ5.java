package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0CJ5, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CJ5 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C0CJ5(String str) {
        this.LIZ = str;
        String str2 = (String) ListProtector.get(a0.LJJLIIIJILLIZJL(str, new String[]{"/"}, 0, 6), r1.size() - 1);
        this.LIZJ = (String) ListProtector.get(a0.LJJLIIIJILLIZJL(str2, new String[]{"-"}, 0, 6), 0);
        this.LIZIZ = str2;
    }
}
