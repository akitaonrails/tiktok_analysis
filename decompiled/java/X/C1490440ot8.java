package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.diagnosis.IDiagnosisCallback;
import com.bytedance.ttnet.diagnosis.IDiagnosisRequest;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: renamed from: X.0ot8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490440ot8 implements IDiagnosisRequest {
    public IDiagnosisCallback LIZ;
    public final int LIZIZ;
    public final List<String> LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public String LJIIIIZZ;
    public InterfaceC1490450ot9 LJIIJ;
    public final C1490430ot7 LJIIIZ = new InterfaceC1490460otA() { // from class: X.0ot7
        @Override // X.InterfaceC1490460otA
        public final void LIZ(String str) {
            IDiagnosisCallback iDiagnosisCallback = this.LIZ.LIZ;
            if (iDiagnosisCallback != null) {
                iDiagnosisCallback.onDiagnosisComplete(str);
            }
        }
    };
    public boolean LJI = false;
    public boolean LJII = false;

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public final void cancel() {
        synchronized (this) {
            try {
                if (!this.LJI || this.LJII) {
                    return;
                }
                this.LJIIJ.cancel();
                this.LJII = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public final void setUserExtraInfo(String str) {
        synchronized (this) {
            try {
                this.LJIIIIZZ = str;
                doExtraCommand("extra_info", str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public final void start(IDiagnosisCallback iDiagnosisCallback) {
        synchronized (this) {
            try {
                if (this.LJI) {
                    return;
                }
                this.LIZ = iDiagnosisCallback;
                this.LJIIJ.start();
                this.LJI = true;
                String str = this.LJIIIIZZ;
                if (str != null && !str.isEmpty()) {
                    doExtraCommand("extra_info", this.LJIIIIZZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public final void doExtraCommand(String str, String str2) {
        synchronized (this) {
            try {
                if (!this.LJI) {
                    return;
                }
                this.LJIIJ.doExtraCommand(str, str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ot7] */
    public C1490440ot8(int i, List<String> list, int i2, int i3, int i4) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        this.LIZIZ = i;
        this.LIZJ = list;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = i4;
        if (this.LJIIJ == null) {
            try {
                Class<?> cls = Class.forName("org.chromium.diagnosis.CronetDiagnosisRequestImpl");
                if (cls != null) {
                    Class<?> cls2 = Integer.TYPE;
                    Object objNewInstance = cls.getDeclaredConstructor(InterfaceC1490460otA.class, cls2, List.class, cls2, cls2, cls2).newInstance(this.LJIIIZ, Integer.valueOf(this.LIZIZ), this.LIZJ, Integer.valueOf(this.LIZLLL), Integer.valueOf(this.LJ), Integer.valueOf(this.LJFF));
                    if (objNewInstance instanceof InterfaceC1490450ot9) {
                        this.LJIIJ = (InterfaceC1490450ot9) objNewInstance;
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            throw new ClassNotFoundException("org.chromium.diagnosis.CronetDiagnosisRequestImpl class not found");
        }
    }
}
