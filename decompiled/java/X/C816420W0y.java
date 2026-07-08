package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0W0y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816420W0y implements C0W11 {
    public final C0W10 LIZ;
    public final ExecutorService LIZIZ;
    public final Function0<Boolean> LIZJ;
    public final List<Runnable> LIZLLL = new ArrayList();
    public CountDownLatch LJ = new CountDownLatch(1);

    @Override // X.C0W11
    public final void LIZIZ() {
        this.LIZ.clearPreviousDiskBundle();
    }

    public static String LIZLLL(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0W11
    public final Map<Class<Object>, Object> LIZ(String str, String str2) throws ClassNotFoundException {
        byte[] bArrLIZJ;
        String strLIZLLL = LIZLLL(str, str2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZLLL(str, str2));
        sbLIZ.append("_verifyKey");
        if (!this.LIZ.LIZLLL(C2188811AlT.LIZIZ(sbLIZ)) || (bArrLIZJ = this.LIZ.LIZJ(strLIZLLL)) == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArrLIZJ, 0, bArrLIZJ.length);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(C816420W0y.class.getClassLoader());
        parcelObtain.recycle();
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (bundle.size() == 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str3 : bundle.keySet()) {
            Class<?> cls = Class.forName(str3);
            Parcelable parcelable = bundle.getParcelable(str3);
            if (parcelable != null) {
                map.put(cls, parcelable);
            }
        }
        return map;
    }

    public C816420W0y(C1519820peW c1519820peW, ExecutorService executorService, AFwS200S0000000_13 aFwS200S0000000_13) {
        this.LIZ = c1519820peW;
        this.LIZIZ = executorService;
        this.LIZJ = aFwS200S0000000_13;
    }

    @Override // X.C0W11
    public final void LIZJ(String str, String str2, List<? extends Pair<? extends Class<?>, ? extends Object>> list) {
        for (Pair<? extends Class<?>, ? extends Object> pair : list) {
            if (pair.getSecond() != null && !(pair.getSecond() instanceof Parcelable)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(pair.getFirst());
                sbLIZ.append(" is not Parcelable");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        Bundle bundle = new Bundle();
        for (Pair<? extends Class<?>, ? extends Object> pair2 : list) {
            if (pair2.getSecond() != null) {
                C786410Ut5.LJJIJL(bundle, pair2.getFirst().getName(), (Parcelable) pair2.getSecond());
            }
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        final byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        final String strLIZLLL = LIZLLL(str, str2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(LIZLLL(str, str2));
        sbLIZ2.append("_verifyKey");
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Runnable runnable = new Runnable() { // from class: X.0W0z
            public final void LIZ() {
                C816420W0y c816420W0y = this;
                String str3 = strLIZIZ;
                String str4 = strLIZLLL;
                byte[] bArr = bArrMarshall;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                c816420W0y.LIZ.LIZ(str3, false);
                c816420W0y.LIZ.LIZIZ(str4, bArr);
                c816420W0y.LIZ.LIZ(str3, true);
                long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("BundlePersistenceManager write disk finish uuid: ");
                sbLIZ3.append(strLIZLLL);
                sbLIZ3.append(", execute cost ");
                sbLIZ3.append(jCurrentTimeMillis4);
                sbLIZ3.append(" ms, actual execute cost ");
                sbLIZ3.append(jCurrentTimeMillis3);
                sbLIZ3.append(" ms");
                C2188811AlT.LIZIZ(sbLIZ3);
                ((ArrayList) this.LIZLLL).remove(this);
                if (((ArrayList) this.LIZLLL).isEmpty()) {
                    this.LJ.countDown();
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BundlePersistenceManager@a3af.update$runnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BundlePersistenceManager@a3af.update$runnable$1");
            }
        };
        if (this.LJ.getCount() == 0) {
            this.LJ = new CountDownLatch(1);
        }
        ((ArrayList) this.LIZLLL).add(runnable);
        this.LIZIZ.execute(runnable);
        if (!this.LIZJ.invoke().booleanValue()) {
            return;
        }
        try {
            this.LJ.await(2000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
