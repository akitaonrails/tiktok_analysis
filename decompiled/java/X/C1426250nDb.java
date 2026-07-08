package X;

import com.bytedance.als.h0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nDb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1426250nDb {
    public final h0<Pair<String, Integer>> LIZ = new h0<>(new Pair("", 0));

    public final void LIZ(String str, int i) {
        if (i >= 0 && i < 3) {
            String string = a0.LJLIIIL(str).toString();
            if (Intrinsics.LJFF(string, this.LIZ.LIZJ().getFirst())) {
                return;
            }
            this.LIZ.LJII(new Pair<>(string, Integer.valueOf(i)));
        }
    }
}
