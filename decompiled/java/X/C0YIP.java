package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YIP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YIP implements InterfaceC871850YId {
    public final C0YEM LIZ;
    public int LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public final Function0<Long> LJ;
    public final C01GW LJFF;

    @Override // X.InterfaceC871850YId
    public final void reset() {
        this.LIZIZ = 0;
        this.LIZJ = 0L;
        this.LIZLLL = 0L;
    }

    public final C871840YIc LIZJ() {
        return (C871840YIc) this.LJFF.getValue();
    }

    @Override // X.InterfaceC871850YId
    public final boolean LIZ() {
        if (LIZJ().LIZIZ <= 0 || this.LIZIZ < LIZJ().LIZIZ) {
            return false;
        }
        int i = LIZJ().LIZJ * LSPassThroughRecordSizeConfig.DEFAULT;
        if (i <= 0 || this.LJ.invoke().longValue() - this.LIZLLL <= i) {
            C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "WSFailureDetector", "shouldDiscardWS return true", 4);
            return true;
        }
        reset();
        return false;
    }

    @Override // X.InterfaceC871850YId
    public final void LIZIZ() {
        if (LIZJ().LIZIZ > 0) {
            int i = LIZJ().LIZ * LSPassThroughRecordSizeConfig.DEFAULT;
            long jLongValue = this.LJ.invoke().longValue();
            if (this.LIZIZ == 0) {
                this.LIZJ = jLongValue;
            } else if (i > 0 && this.LJ.invoke().longValue() - this.LIZJ > i) {
                this.LIZIZ = 0;
                this.LIZJ = jLongValue;
            }
            if (this.LIZIZ < LIZJ().LIZIZ) {
                int i2 = this.LIZIZ + 1;
                this.LIZIZ = i2;
                if (i2 >= LIZJ().LIZIZ) {
                    this.LIZLLL = jLongValue;
                    this.LIZ.LJIILJJIL().LIZJ();
                }
            }
        }
    }

    public C0YIP(C0YEM c0yem) {
        C0N31 c0n31 = new C0N31();
        this.LIZ = c0yem;
        this.LIZIZ = 0;
        this.LIZJ = 0L;
        this.LIZLLL = 0L;
        this.LJ = c0n31;
        this.LJFF = C452501pT.LIZIZ(new C0YIR(this));
    }
}
