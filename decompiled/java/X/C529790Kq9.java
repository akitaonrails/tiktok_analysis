package X;

import android.content.Context;
import android.view.LayoutInflater;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0Kq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529790Kq9 {
    public static final ConcurrentLinkedQueue<C529750Kq5> LIZ = new ConcurrentLinkedQueue<>();
    public static int LIZIZ;

    public static void LIZ(int i, int i2, Context context) {
        if (i2 == 0 || (!LIZ.isEmpty())) {
            return;
        }
        LIZIZ = i2;
        System.currentTimeMillis();
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(context);
        for (int i3 = 0; i3 < i2; i3++) {
            C529750Kq5 c529750Kq5 = new C529750Kq5(C786410Ut5.Sd(i, layoutInflaterNe, null));
            c529750Kq5.itemView.setTag(Integer.valueOf(i));
            LIZ.add(c529750Kq5);
        }
    }
}
