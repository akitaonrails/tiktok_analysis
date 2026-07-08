package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.0C4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C307870C4z implements C0C5C {
    public static final C307870C4z LIZJ = new C307870C4z();
    public final C01GW LIZ = C452501pT.LIZIZ(new C0C50());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C0C51());

    public final InterfaceC307670C4f LJIIIIZZ() {
        return (InterfaceC307670C4f) this.LIZ.getValue();
    }

    @Override // X.C0C5C
    public final String[] LJFF(String str) {
        return LJIIIIZZ().LJI(str, null);
    }

    @Override // X.C0C5C
    public final boolean contains(String str) {
        return LJIIIIZZ().contains(str);
    }

    @Override // X.C0C5C
    public final int LIZ(String str, int i) {
        return LJIIIIZZ().getInt(str, i);
    }

    @Override // X.C0C5C
    public final String LIZIZ(String str, String str2) {
        return LJIIIIZZ().getString(str, str2);
    }

    @Override // X.C0C5C
    public final boolean LIZJ(String str, boolean z) {
        return LJIIIIZZ().getBoolean(str, z);
    }

    @Override // X.C0C5C
    public final float LIZLLL(String str, float f) {
        return LJIIIIZZ().getFloat(str, f);
    }

    @Override // X.C0C5C
    public final long LJ(String str, long j) {
        return LJIIIIZZ().getLong(str, j);
    }

    @Override // X.C0C5C
    public final double LJI(String str, double d) {
        return LJIIIIZZ().getDouble(str, d);
    }

    @Override // X.C0C5C
    public final Object LJII(String str, Class<?> cls) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key:");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Object objFromJson = null;
        try {
            objFromJson = GsonProtectorUtils.fromJson((Gson) this.LIZIZ.getValue(), LJIIIIZZ().getString(str, null), (Type) cls);
            return objFromJson;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cause: ");
            sbLIZ2.append(th);
            sbLIZ2.append("--message: ");
            sbLIZ2.append(strLIZIZ);
            C0C46.LIZIZ("IConfigRepo", new Throwable(C2188811AlT.LIZIZ(sbLIZ2), th));
            return objFromJson;
        }
    }
}
