package X;

import com.bytedance.keva.Keva;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AFwS217S0000000_28;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zgG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1905300zgG {
    public static final C1905300zgG LIZ = new C1905300zgG();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(533));
    public static final AtomicInteger LIZJ = new AtomicInteger(-1);
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(534));
    public static final AtomicInteger LJ = new AtomicInteger(-1);
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(536));
    public static final AtomicLong LJI = new AtomicLong(-1);
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(535));

    public static Keva LIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static long LIZIZ() {
        AtomicLong atomicLong = LJI;
        if (atomicLong.get() == -1) {
            atomicLong.set(LIZ().getLong((String) LJII.getValue(), -2L));
        }
        return atomicLong.get();
    }

    public static boolean LIZJ() {
        AtomicInteger atomicInteger = LJ;
        if (atomicInteger.get() == -1) {
            atomicInteger.set(LIZ().getInt((String) LJFF.getValue(), 0));
        }
        return atomicInteger.get() == 1;
    }

    public static boolean LIZLLL() {
        AtomicInteger atomicInteger = LIZJ;
        if (atomicInteger.get() == -1) {
            atomicInteger.set(LIZ().getInt((String) LIZLLL.getValue(), 0));
        }
        return atomicInteger.get() == 1;
    }

    public static void LJ(int i, String str, String str2) {
        AtomicInteger atomicInteger = LJ;
        if (i == atomicInteger.get()) {
            return;
        }
        atomicInteger.set(i);
        LIZ().storeInt((String) LJFF.getValue(), i);
        if (i == 0) {
            LIZJ.set(1);
            LIZ().storeInt((String) LIZLLL.getValue(), 1);
        }
        if (C1905290zgF.LIZIZ() && (((Number) C1905290zgF.LIZ.getValue()).intValue() & 2) == 2) {
            C582130MsN.LIZ().LJ().getClass();
            C1482860ogu c1482860ogu = C1014030cUj.LIZ;
            c1482860ogu.getClass();
            c1482860ogu.LJJZZI(new C1485570olH(c1482860ogu, i));
        }
        C20684815ws.LJIJ("lite_mode_click", new JSONObject().put("open_type", str).put("close_type", str2));
    }
}
