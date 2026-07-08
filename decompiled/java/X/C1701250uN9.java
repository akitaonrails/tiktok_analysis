package X;

import Y.ARunnableS0S1210100_26;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uN9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701250uN9 {
    public static ExecutorService LJII;
    public static final C1701250uN9 LIZ = new C1701250uN9();
    public static final Map<String, Bundle> LIZIZ = new ConcurrentHashMap();
    public static final Map<Context, String> LIZJ = new WeakHashMap();
    public static final Map<Context, String> LIZLLL = new WeakHashMap();
    public static final Map<Context, Boolean> LJ = new WeakHashMap();
    public static final C1701210uN5 LJFF = new C1701210uN5();
    public static final List<Runnable> LJI = new ArrayList();
    public static CountDownLatch LJIIIIZZ = new CountDownLatch(1);
    public static int LJIIIZ = 512000;
    public static Function0<Boolean> LJIIJ = new C1701260uNA();

    public static void LIZ(C1701250uN9 c1701250uN9, Fragment fragment) {
        c1701250uN9.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LargeTransaction: clear fragment memory bundles for ");
        sbLIZ.append(fragment);
        C786840Utm.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            try {
                String string = arguments.getString("bytedance_tiktok_infra_fragment_bundle_uuid");
                if (string != null && string.length() != 0) {
                    ((ConcurrentHashMap) LIZIZ).remove(string);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LIZIZ(Fragment fragment, Bundle bundle, Function1 function1) {
        int iLIZIZ = C838400Wuk.LIZIZ(bundle);
        int i = LJIIIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LargeTransaction setArguments, ");
        sbLIZ.append(fragment.getClass().getSimpleName());
        sbLIZ.append(" bundle size: ");
        sbLIZ.append(iLIZIZ);
        sbLIZ.append(", threshold: ");
        sbLIZ.append(i);
        C786840Utm.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (iLIZIZ >= i) {
            String string = UUID.randomUUID().toString();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("LargeTransaction setArguments uuid: ");
            sbLIZ2.append(string);
            C786840Utm.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            ((ConcurrentHashMap) LIZIZ).put(string, bundle);
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJJI("bytedance_tiktok_infra_fragment_bundle_uuid", string, bundle2);
            function1.invoke(bundle2);
            LIZJ(string, bundle, true, new ARunnableS112S0100000_12(bundle2, 363));
            return;
        }
        function1.invoke(bundle);
    }

    public static void LIZJ(String str, Bundle bundle, boolean z, Runnable runnable) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length == 0) {
            return;
        }
        ARunnableS0S1210100_26 aRunnableS0S1210100_26 = new ARunnableS0S1210100_26(str, System.currentTimeMillis(), runnable, bArrMarshall, z, 1);
        if (LJIIIIZZ.getCount() == 0) {
            LJIIIIZZ = new CountDownLatch(1);
        }
        ((ArrayList) LJI).add(aRunnableS0S1210100_26);
        ExecutorService executorService = LJII;
        if (executorService == null) {
            executorService = null;
        }
        executorService.execute(aRunnableS0S1210100_26);
        if (!LJIIJ.invoke().booleanValue()) {
            return;
        }
        try {
            LJIIIIZZ.await(2000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
