package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uMw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701120uMw extends AbstractC1701050uMp {
    public static final Keva LJII = KevaImpl.getRepo("hybrid_settings", 1);
    public JSONObject LIZLLL;
    public long LJ;
    public final AtomicBoolean LJFF;
    public final AtomicBoolean LJI;

    @Override // X.AbstractC1701050uMp
    public final void LIZJ() {
        String strLJIIIIZZ = LJIIIIZZ(false);
        if (strLJIIIIZZ == null) {
            InterfaceC1701110uMv interfaceC1701110uMv = this.LIZIZ;
            if (interfaceC1701110uMv != null) {
                interfaceC1701110uMv.LIZ(null);
                return;
            }
            return;
        }
        InterfaceC1701110uMv interfaceC1701110uMv2 = this.LIZIZ;
        if (interfaceC1701110uMv2 != null) {
            interfaceC1701110uMv2.LIZ(new C1701090uMt(strLJIIIIZZ, this.LIZLLL));
        }
    }

    @Override // X.AbstractC1701050uMp
    public final JSONObject LIZ() {
        if (!this.LJFF.get() && !this.LJI.get() && this.LJ != LJI()) {
            C1700970uMh.LJIILIIL.LIZ(new Runnable() { // from class: X.0hbw
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SettingsKevaData@8255.tryUpdate$1");
                    try {
                        this.LL.LJIIIIZZ(true);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SettingsKevaData@8255.tryUpdate$1");
                }
            });
        }
        return this.LIZLLL;
    }

    public final long LJI() {
        Keva keva = LJII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("_version");
        return keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    public final String LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append('_');
        sbLIZ.append("LastFetchedTime");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1701120uMw(String str) {
        super(str);
        this.LIZLLL = new JSONObject();
        this.LJFF = new AtomicBoolean(false);
        this.LJI = new AtomicBoolean(false);
    }

    @Override // X.AbstractC1701050uMp
    public final void LIZLLL(C1701090uMt c1701090uMt) {
        InterfaceC1701110uMv interfaceC1701110uMv = this.LIZIZ;
        if (interfaceC1701110uMv != null) {
            interfaceC1701110uMv.LIZIZ(c1701090uMt);
        }
        this.LIZLLL = c1701090uMt.LIZ;
        LJII(this.LJ, c1701090uMt.LIZIZ);
    }

    @Override // X.AbstractC1701050uMp
    public final void LJ(Object obj) {
        if (obj instanceof Long) {
            LJII.storeLong(LJFF(), ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Boolean) {
            LJII.storeBoolean(LJFF(), ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            LJII.storeInt(LJFF(), ((Number) obj).intValue());
        } else if (obj instanceof Double) {
            LJII.storeDouble(LJFF(), ((Number) obj).doubleValue());
        } else {
            LJII.storeString(LJFF(), obj.toString());
        }
    }

    public final String LJIIIIZZ(boolean z) {
        JSONObject jSONObject;
        InterfaceC1701110uMv interfaceC1701110uMv;
        long jLJI = LJI();
        String str = null;
        if (this.LJ == jLJI || !this.LJFF.compareAndSet(false, true)) {
            return null;
        }
        if (this.LJI.get()) {
            this.LJFF.set(false);
            return null;
        }
        try {
            String stringJustDisk = LJII.getStringJustDisk(this.LIZ, "");
            try {
                jSONObject = new JSONObject(stringJustDisk);
                if (z && (interfaceC1701110uMv = this.LIZIZ) != null) {
                    interfaceC1701110uMv.LIZIZ(new C1701090uMt(stringJustDisk, jSONObject));
                }
                str = stringJustDisk;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1490740otc.LIZ.LIZ("update content failed when parsing string to json", EnumC1490770otf.E, "HybridSettings");
                jLJI = this.LJ;
                jSONObject = this.LIZLLL;
            }
            this.LIZLLL = jSONObject;
            this.LJ = jLJI;
            this.LJFF.set(false);
            return str;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LJFF.set(false);
            throw th2;
        }
    }

    @Override // X.AbstractC1701050uMp
    public final Object LIZIZ(Class cls, Object obj) {
        try {
            if (cls.isAssignableFrom(Long.TYPE)) {
                return Long.valueOf(LJII.getLong(LJFF(), ((Long) obj).longValue()));
            }
            if (cls.isAssignableFrom(Boolean.TYPE)) {
                return Boolean.valueOf(LJII.getBoolean(LJFF(), ((Boolean) obj).booleanValue()));
            }
            if (cls.isAssignableFrom(Integer.TYPE)) {
                return Integer.valueOf(LJII.getInt(LJFF(), ((Integer) obj).intValue()));
            }
            if (cls.isAssignableFrom(Double.TYPE)) {
                return Double.valueOf(LJII.getDouble(LJFF(), ((Double) obj).doubleValue()));
            }
            return LJII.getString(LJFF(), (String) obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return obj;
        }
    }

    public final void LJII(final long j, final String str) {
        if (this.LJ <= j && !this.LJI.get()) {
            C1700970uMh.LJIILIIL.LIZ(new Runnable() { // from class: X.0uMx
                public final void LIZ() {
                    C1701120uMw c1701120uMw = this.LL;
                    if (c1701120uMw.LJ > j || !c1701120uMw.LJI.compareAndSet(false, true)) {
                        return;
                    }
                    if (this.LL.LJFF.get()) {
                        this.LL.LJI.set(false);
                        C1701120uMw c1701120uMw2 = this.LL;
                        c1701120uMw2.LJII(c1701120uMw2.LJI(), str);
                        return;
                    }
                    Keva keva = C1701120uMw.LJII;
                    keva.storeStringJustDisk(this.LL.LIZ, str);
                    C1701120uMw c1701120uMw3 = this.LL;
                    long jLJI = c1701120uMw3.LJI() + 1;
                    c1701120uMw3.LJ = jLJI;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c1701120uMw3.LIZ);
                    sbLIZ.append("_version");
                    keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), jLJI);
                    this.LL.LJI.set(false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SettingsKevaData@8255.storeContent$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SettingsKevaData@8255.storeContent$1");
                }
            });
        }
    }
}
