package X;

import java.util.Map;
import kotlin.jvm.internal.AwS27S1201000_9;

/* JADX INFO: renamed from: X.0NOA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NOA {
    public final String LIZ;
    public final C0NOB LIZIZ;

    public C0NOA(String str, C21175917tt c21175917tt) {
        this.LIZ = str;
        this.LIZIZ = c21175917tt;
    }

    public final void LIZ(String str, Map map, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        this.LIZIZ.LIZ(i, str, map);
        new AwS27S1201000_9(this, (C0NOA) i, (int) str, (String) map, (Map<String, ? extends Object>) 1);
    }
}
