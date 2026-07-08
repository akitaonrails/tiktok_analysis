package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: renamed from: X.0VUG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0VUG {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 176));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 175));

    public abstract C0VUA LIZIZ();

    public final C0VUJ LIZ() {
        C0VUM c0vum = (C0VUM) this.LJ.getValue();
        if (c0vum == null) {
            return C0VUJ.LIZLLL;
        }
        try {
            Object objNewInstance = c0vum.LIZIZ.newInstance(new Object[0]);
            C2204961BRm.a0(c0vum.LIZJ, null, new Object[]{objNewInstance}, new C0WZX("dzBzEgAjS8/YVFkiQFyJY1i1X88gd6XeEgrDr8p181E4kdK5paJlGYI2KTVTWnvGZLj8ZORBjHg=", null));
            return c0vum.LIZ.LIZ(objNewInstance);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C0VUJ.LIZLLL;
        }
    }

    public C0VUG(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
