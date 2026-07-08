package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.io.File;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.08uT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2267108uT {
    public final /* synthetic */ C2287408xk LIZ;

    public C2267108uT(C2287408xk c2287408xk) {
        this.LIZ = c2287408xk;
    }

    public final String LIZ(C2287508xl c2287508xl) {
        c2287508xl.LIZJ.getClass();
        return (String) this.LIZ.LIZIZ.getValue();
    }

    public static C0VSJ LIZIZ(Bitmap bitmap, String str, String str2, Function1 function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(File.separator);
        sbLIZ.append(str);
        sbLIZ.append(".jpg");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C0VSJ c0vsj = new C0VSJ(strLIZIZ);
        C476901tP.LIZJ(bitmap, str2, c0vsj.getName(), false);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        if (function1 != null) {
            function1.invoke(strLIZIZ);
        }
        return c0vsj;
    }
}
