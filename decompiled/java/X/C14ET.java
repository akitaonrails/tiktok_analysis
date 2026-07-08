package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.14ET, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14ET {
    public C14EQ LIZ;
    public C14EQ LIZIZ;

    public final synchronized C14EQ LIZIZ() {
        C14EQ c14eq;
        c14eq = this.LIZ;
        if (c14eq != null) {
            C14EQ c14eq2 = c14eq.LIZJ;
            this.LIZ = c14eq2;
            if (c14eq2 == null) {
                this.LIZIZ = null;
            }
        }
        return c14eq;
    }

    public final synchronized C14EQ LIZJ() {
        if (this.LIZ == null) {
            wait(LSPassThroughRecordSizeConfig.DEFAULT);
        }
        return LIZIZ();
    }

    public final synchronized void LIZ(C14EQ c14eq) {
        C14EQ c14eq2 = this.LIZIZ;
        if (c14eq2 != null) {
            c14eq2.LIZJ = c14eq;
            this.LIZIZ = c14eq;
        } else if (this.LIZ == null) {
            this.LIZIZ = c14eq;
            this.LIZ = c14eq;
        } else {
            throw new IllegalStateException("Head present, but no tail");
        }
        notifyAll();
    }
}
