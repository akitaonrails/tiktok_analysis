package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0C5x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308110C5x implements InterfaceC307670C4f {
    public final Keva LIZ;

    @Override // X.InterfaceC307670C4f
    public final Set<String> LJ() {
        Set<String> allKey;
        try {
            allKey = this.LIZ.getAllKey();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            allKey = null;
            sbLIZ.append((String) null);
            C0C46.LIZIZ("DataStorageProvider", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
        return allKey == null ? new LinkedHashSet() : allKey;
    }

    @Override // X.InterfaceC307670C4f
    public final void clear() {
        try {
            this.LIZ.clear();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append((String) null);
            C0C46.LIZIZ("DataStorageProvider", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
    }

    @Override // X.InterfaceC307670C4f
    public final Map<String, ?> getAll() {
        Map<String, ?> all;
        try {
            all = this.LIZ.getAll();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            all = null;
            sbLIZ.append((String) null);
            C0C46.LIZIZ("DataStorageProvider", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
        return all == null ? new HashMap() : all;
    }

    @Override // X.InterfaceC307670C4f
    public final String getName() {
        return this.LIZ.name();
    }

    @Override // X.InterfaceC307670C4f
    public final void load() {
        this.LIZ.name();
    }

    public C308110C5x(Keva keva) {
        this.LIZ = keva;
    }

    @Override // X.InterfaceC307670C4f
    public final void LIZ(String str) {
        try {
            this.LIZ.erase(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append(str);
            C0C46.LIZIZ("DataStorageProvider", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
    }

    @Override // X.InterfaceC307670C4f
    public final boolean LJIIIZ(String str) {
        return !contains(str);
    }

    @Override // X.InterfaceC307670C4f
    public final boolean contains(String str) {
        Boolean boolValueOf;
        try {
            boolValueOf = Boolean.valueOf(this.LIZ.contains(str));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append(str);
            C0C46.LIZIZ("DataStorageProvider", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
            boolValueOf = null;
        }
        return Intrinsics.LJFF(boolValueOf, Boolean.TRUE);
    }

    @Override // X.InterfaceC307670C4f
    public final void LIZIZ(String str, String str2) {
        try {
            if (str2 != null) {
                this.LIZ.storeString(str, str2);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("value is null, key: ");
            sbLIZ.append(str);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cause: ");
            sbLIZ2.append(th);
            sbLIZ2.append("--message: ");
            sbLIZ2.append(str);
            C0C46.LIZIZ("DataStorageProvider", new Throwable(C2188811AlT.LIZIZ(sbLIZ2), th));
        }
    }

    @Override // X.InterfaceC307670C4f
    public final void LIZJ(String str, int i) {
        try {
            this.LIZ.storeInt(str, i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append(str);
            C0C46.LIZIZ("DataStorageProvider", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
    }

    @Override // X.InterfaceC307670C4f
    public final void LIZLLL(String str, boolean z) {
        try {
            this.LIZ.storeBoolean(str, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append(str);
            C0C46.LIZIZ("DataStorageProvider", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
    }

    @Override // X.InterfaceC307670C4f
    public final void LJFF(String str, double d) {
        try {
            this.LIZ.storeDouble(str, d);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append(str);
            C0C46.LIZIZ("DataStorageProvider", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
    }

    @Override // X.InterfaceC307670C4f
    public final String[] LJI(String str, String[] strArr) {
        try {
            return this.LIZ.getStringArray(str, strArr);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append(str);
            C0C46.LIZIZ("DataStorageProvider", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
            return null;
        }
    }

    @Override // X.InterfaceC307670C4f
    public final void LJII(String str, String[] strArr) {
        try {
            if (strArr != null) {
                this.LIZ.storeStringArray(str, strArr);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("value is null, key: ");
            sbLIZ.append(str);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cause: ");
            sbLIZ2.append(th);
            sbLIZ2.append("--message: ");
            sbLIZ2.append(str);
            C0C46.LIZIZ("DataStorageProvider", new Throwable(C2188811AlT.LIZIZ(sbLIZ2), th));
        }
    }

    @Override // X.InterfaceC307670C4f
    public final void LJIIIIZZ(String str, long j) {
        try {
            this.LIZ.storeLong(str, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append(str);
            C0C46.LIZIZ("DataStorageProvider", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
    }

    @Override // X.InterfaceC307670C4f
    public final void LJIIJ(String str, float f) {
        try {
            this.LIZ.storeFloat(str, f);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append(str);
            C0C46.LIZIZ("DataStorageProvider", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
    }

    @Override // X.InterfaceC307670C4f
    public final boolean getBoolean(String str, boolean z) {
        try {
            Boolean boolValueOf = Boolean.valueOf(this.LIZ.getBoolean(str, z));
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append(str);
            C0C46.LIZIZ("DataStorageProvider", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
        return z;
    }

    @Override // X.InterfaceC307670C4f
    public final double getDouble(String str, double d) {
        try {
            Double dValueOf = Double.valueOf(this.LIZ.getDouble(str, d));
            if (dValueOf != null) {
                return dValueOf.doubleValue();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append(str);
            C0C46.LIZIZ("DataStorageProvider", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
        return d;
    }

    @Override // X.InterfaceC307670C4f
    public final float getFloat(String str, float f) {
        try {
            Float fValueOf = Float.valueOf(this.LIZ.getFloat(str, f));
            if (fValueOf != null) {
                return fValueOf.floatValue();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append(str);
            C0C46.LIZIZ("DataStorageProvider", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
        return f;
    }

    @Override // X.InterfaceC307670C4f
    public final int getInt(String str, int i) {
        try {
            Integer numValueOf = Integer.valueOf(this.LIZ.getInt(str, i));
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append(str);
            C0C46.LIZIZ("DataStorageProvider", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
        return i;
    }

    @Override // X.InterfaceC307670C4f
    public final long getLong(String str, long j) {
        try {
            Long lValueOf = Long.valueOf(this.LIZ.getLong(str, j));
            if (lValueOf != null) {
                return lValueOf.longValue();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append(str);
            C0C46.LIZIZ("DataStorageProvider", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
        return j;
    }

    @Override // X.InterfaceC307670C4f
    public final String getString(String str, String str2) {
        try {
            return this.LIZ.getString(str, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append(str);
            C0C46.LIZIZ("DataStorageProvider", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
            return null;
        }
    }
}
