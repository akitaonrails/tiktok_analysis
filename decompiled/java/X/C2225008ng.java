package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.08ng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2225008ng implements InterfaceC803370VfL {
    public final C0VSV LIZ;

    @Override // X.InterfaceC803370VfL
    public final void flush() {
        C0VSV c0vsv = this.LIZ;
        if (c0vsv != null) {
            try {
                c0vsv.flush();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC803370VfL
    public final void release() {
        C0VSV c0vsv = this.LIZ;
        if (c0vsv != null) {
            try {
                c0vsv.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public C2225008ng(String str) {
        C0VSV c0vsv;
        try {
            c0vsv = new C0VSV(new C0VSJ(str));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            c0vsv = null;
        }
        this.LIZ = c0vsv;
    }

    @Override // X.InterfaceC803370VfL
    public final void LIZ(String str) {
        C0VSV c0vsv = this.LIZ;
        if (c0vsv != null) {
            try {
                c0vsv.write(str.getBytes());
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC803370VfL
    public final void LIZIZ(int i) {
        LIZ(Integer.toString(i));
    }

    @Override // X.InterfaceC803370VfL
    public final void LIZJ(long j) {
        LIZ(Long.toString(j));
    }

    @Override // X.InterfaceC803370VfL
    public final void LIZLLL(char[] cArr, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(cArr);
        LIZ(sb.toString());
    }
}
