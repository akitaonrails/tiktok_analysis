package X;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0sil, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637770sil {
    public static final HashMap<String, C1637780sim> LIZ = new HashMap<>();

    public static C1637780sim LIZ(Context context, String str) {
        HashMap<String, C1637780sim> map = LIZ;
        C1637780sim c1637780sim = map.get(str);
        if (c1637780sim == null) {
            C1637780sim c1637780sim2 = new C1637780sim(C786410Ut5.N3(context), str);
            map.put(str, c1637780sim2);
            return c1637780sim2;
        }
        return c1637780sim;
    }
}
