package X;

import android.os.Looper;
import android.util.JsonReader;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.StringReader;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C593360NPa {
    public static volatile boolean LIZ;

    public static void LIZ(final Function0 function0) {
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0MuE
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CommonUtils@8d94.asyncRunWhatever$1");
                try {
                    function0.invoke();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CommonUtils@8d94.asyncRunWhatever$1");
            }
        });
    }

    public static void LIZIZ(final Function0 function0) {
        if (Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3())) {
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0Mwe
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CommonUtils@8d94.asyncRunWhenOnMainThread$1");
                    try {
                        function0.invoke();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CommonUtils@8d94.asyncRunWhenOnMainThread$1");
                }
            });
        } else {
            function0.invoke();
        }
    }

    public static String LIZJ(String str) throws Throwable {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    if (Intrinsics.LJFF(jsonReader.nextName(), "rec_finish")) {
                        String strNextString = jsonReader.nextString();
                        C2107108Nh.LIZ(jsonReader, null);
                        return strNextString;
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                C2107108Nh.LIZ(jsonReader, null);
                return null;
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(jsonReader, th);
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = null;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static boolean LIZLLL(Number number, Number number2) {
        if (Math.abs(number.doubleValue() - number2.doubleValue()) < 1.0E-6d) {
            return true;
        }
        return false;
    }
}
