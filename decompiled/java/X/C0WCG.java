package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0WCG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0WCG {
    public abstract Map<String, String> LIZIZ();

    public abstract Integer LIZJ();

    public abstract C0WCB LIZLLL();

    public abstract long LJ();

    public abstract String LJI();

    public abstract long LJII();

    public final C819250WBv LJIIIIZZ() {
        C819250WBv c819250WBv = new C819250WBv();
        c819250WBv.LIZLLL(LJI());
        c819250WBv.LIZIZ = LIZJ();
        c819250WBv.LIZJ(LIZLLL());
        c819250WBv.LIZLLL = Long.valueOf(LJ());
        c819250WBv.LJ = Long.valueOf(LJII());
        c819250WBv.LJFF = new HashMap(LIZIZ());
        return c819250WBv;
    }

    public final String LIZ(String str) {
        String str2 = LIZIZ().get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int LJFF(String str) {
        String str2 = LIZIZ().get(str);
        if (str2 == null) {
            return 0;
        }
        return CastIntegerProtector.valueOf(str2).intValue();
    }
}
