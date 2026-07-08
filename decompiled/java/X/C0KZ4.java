package X;

import Y.AfS193S0100000_24;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Looper;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KZ4, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0KZ4 extends C0KZC {
    public long LIZ;

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(Context context) {
        super.onEnabled(context);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) throws Throwable {
        C11NZ c11nzLIZ;
        boolean zLJI = MethodIDManager.LJI(202368);
        super.onUpdate(context, appWidgetManager, iArr);
        if (context != null) {
            C519480KYw.LIZ.getClass();
            C519480KYw.LJIIJ(context);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ;
        C519480KYw.LIZ.getClass();
        if (jCurrentTimeMillis < 1800000000) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        this.LIZ = System.currentTimeMillis();
        if (1 == C519480KYw.LIZIZ()) {
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                c11nzLIZ = C11NZ.LJJJJZ(1).LJJJ(new InterfaceC1487280oo2() { // from class: X.0KZ5
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        return C0KZE.LIZ();
                    }
                }, false);
            } else {
                c11nzLIZ = C0KZE.LIZ();
            }
            c11nzLIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS193S0100000_24(context, 25));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
