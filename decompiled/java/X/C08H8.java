package X;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;

/* JADX INFO: renamed from: X.08H8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08H8 {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Parcel parcelObtain = null;
        try {
            try {
                parcelObtain = Parcel.obtain();
                parcelObtain.writeBundle(bundle);
                int iDataSize = parcelObtain.dataSize();
                parcelObtain.recycle();
                PrintStream printStream = System.out;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FeedTransactionTooLargeMonitor fragments size=");
                sbLIZ.append(iDataSize);
                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("FeedTransactionTooLargeMonitor fragments outState=");
                sbLIZ2.append(bundle);
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (parcelObtain == null) {
                    return;
                }
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (parcelObtain != null) {
                parcelObtain.recycle();
            }
            throw th;
        }
    }
}
