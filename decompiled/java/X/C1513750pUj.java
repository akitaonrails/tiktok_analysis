package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0pUj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513750pUj {
    public static final Map<Integer, Drawable> LIZ = Collections.synchronizedMap(new LinkedHashMap());
    public static boolean LIZIZ;

    public static void LIZ(int i, Context context) {
        if (LIZIZ) {
            return;
        }
        C104100aN.LIZ().LJIILJJIL(new RunnableC1513740pUi(new C1513770pUl()), new C1513760pUk(context, i));
    }
}
