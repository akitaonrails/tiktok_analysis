package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Dcm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343140Dcm {
    public static final ConcurrentHashMap<Integer, String> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, C343160Dco> LIZIZ = new ConcurrentHashMap<>();

    static {
        C2214201BlK.LIZ().LJJIL(new InterfaceC19483011Ki() { // from class: X.0Dcn
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return obj instanceof C08B7;
            }
        }).LIZIZ(new InterfaceC626120Oh8<Activity>() { // from class: X.0Dcl
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(Activity activity) {
                C343140Dcm.LIZ.clear();
                C343140Dcm.LIZIZ.clear();
            }
        });
    }

    public static Integer LIZIZ() {
        C343160Dco c343160Dco = LIZIZ.get(Integer.valueOf(R.dimen.f608p2));
        if (c343160Dco != null) {
            return Integer.valueOf(c343160Dco.LIZIZ);
        }
        C343160Dco c343160DcoLJFF = LJFF(R.dimen.f608p2);
        if (c343160DcoLJFF != null) {
            return Integer.valueOf(c343160DcoLJFF.LIZIZ);
        }
        return null;
    }

    public static Float LIZ(int i) {
        C343160Dco c343160Dco = LIZIZ.get(Integer.valueOf(i));
        if (c343160Dco != null) {
            return Float.valueOf(c343160Dco.LIZ);
        }
        C343160Dco c343160DcoLJFF = LJFF(i);
        if (c343160DcoLJFF != null) {
            return Float.valueOf(c343160DcoLJFF.LIZ);
        }
        return null;
    }

    public static final String LIZJ(int i) {
        String string;
        ConcurrentHashMap<Integer, String> concurrentHashMap = LIZ;
        String str = concurrentHashMap.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        try {
            C844470XAv.LIZ.getClass();
            string = C844470XAv.LIZ().getString(i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            string = null;
        }
        if (string == null) {
            return null;
        }
        concurrentHashMap.put(Integer.valueOf(i), string);
        return string;
    }

    public static C343160Dco LJ(int i) {
        try {
            C844470XAv.LIZ.getClass();
            float dimension = C844470XAv.LIZ().getResources().getDimension(i);
            int dimensionPixelSize = C844470XAv.LIZ().getResources().getDimensionPixelSize(i);
            C844470XAv.LIZ().getResources().getDimensionPixelOffset(i);
            return new C343160Dco(dimension, dimensionPixelSize);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static C343160Dco LJFF(int i) {
        C343160Dco c343160DcoLJ = LJ(i);
        if (c343160DcoLJ == null) {
            return null;
        }
        LIZIZ.put(Integer.valueOf(i), c343160DcoLJ);
        return c343160DcoLJ;
    }

    public static final void LJI(List<Integer> list) {
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            try {
                C844470XAv.LIZ.getClass();
                String string = C844470XAv.LIZ().getString(iIntValue);
                if (string != null) {
                    LIZ.put(Integer.valueOf(iIntValue), string);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static final String LIZLLL(int i, Object... objArr) {
        ConcurrentHashMap<Integer, String> concurrentHashMap = LIZ;
        String str = concurrentHashMap.get(Integer.valueOf(i));
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (str != null) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            return C786410Ut5.j4(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
        try {
            concurrentHashMap.put(Integer.valueOf(i), contextLIZ.getString(i));
            String str2 = concurrentHashMap.get(Integer.valueOf(i));
            if (str2 != null) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArr, objArr.length);
                return C786410Ut5.j4(str2, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
