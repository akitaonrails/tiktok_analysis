package X;

import Y.ARunnableS134S0100000_34;
import android.os.Handler;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;

/* JADX INFO: renamed from: X.1BJF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BJF {
    public final Handler LIZ;
    public final GraphRequest LIZIZ;
    public final long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;

    public final void LIZ() {
        long j = this.LIZLLL;
        if (j > this.LJ) {
            C0WV8 c0wv8 = this.LIZIZ.LJFF;
            long j2 = this.LJFF;
            if (j2 <= 0 || !(c0wv8 instanceof InterfaceC2202971BJv)) {
                return;
            }
            Handler handler = this.LIZ;
            if (handler == null || Boolean.valueOf(C786410Ut5.LJJZZIII(handler, new ARunnableS134S0100000_34(c0wv8, j, j2, 82))) == null) {
                ((InterfaceC2202971BJv) c0wv8).LIZ();
            }
            this.LJ = this.LIZLLL;
        }
    }

    public C1BJF(Handler handler, GraphRequest graphRequest) {
        this.LIZ = handler;
        this.LIZIZ = graphRequest;
        C0W7K.LJFF();
        this.LIZJ = FacebookSdk.LJI.get();
    }
}
