package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: renamed from: X.0C4X, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C4X implements C0C5C {
    public static final C0C4X LIZJ = new C0C4X();
    public final InterfaceC307670C4f LIZ;
    public Gson LIZIZ;

    public C0C4X() {
        InterfaceC307670C4f interfaceC307670C4fLJI = C0C58.LIZJ.LIZ.LJI();
        if (interfaceC307670C4fLJI instanceof C308110C5x) {
            this.LIZ = interfaceC307670C4fLJI;
        } else {
            this.LIZ = new C307660C4e(interfaceC307670C4fLJI);
        }
    }

    @Override // X.C0C5C
    public final String[] LJFF(String str) {
        return this.LIZ.LJI(str, null);
    }

    @Override // X.C0C5C
    public final boolean contains(String str) {
        return this.LIZ.contains(str);
    }

    @Override // X.C0C5C
    public final int LIZ(String str, int i) {
        return this.LIZ.getInt(str, i);
    }

    @Override // X.C0C5C
    public final String LIZIZ(String str, String str2) {
        return this.LIZ.getString(str, str2);
    }

    @Override // X.C0C5C
    public final boolean LIZJ(String str, boolean z) {
        return this.LIZ.getBoolean(str, z);
    }

    @Override // X.C0C5C
    public final float LIZLLL(String str, float f) {
        return this.LIZ.getFloat(str, f);
    }

    @Override // X.C0C5C
    public final long LJ(String str, long j) {
        return this.LIZ.getLong(str, j);
    }

    @Override // X.C0C5C
    public final double LJI(String str, double d) {
        return this.LIZ.getDouble(str, d);
    }

    @Override // X.C0C5C
    public final Object LJII(String str, Class cls) {
        try {
            if (this.LIZIZ == null) {
                this.LIZIZ = new Gson();
            }
            return this.LIZIZ.LJII(this.LIZ.getString(str, null), cls);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0C46.LIZIZ("HybridConfigCenterRepo", th);
            return null;
        }
    }
}
