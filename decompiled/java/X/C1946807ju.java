package X;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.07ju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1946807ju {
    public static volatile String LIZ;
    public static volatile C603820NmG<String, List<Object>> LIZIZ = new C603820NmG<>(4);

    public static void LIZ(String str) {
        if (!TextUtils.isEmpty(str) && LIZIZ.LIZJ(str) == null) {
            LIZIZ.LIZLLL(str, new CopyOnWriteArrayList());
        }
    }
}
