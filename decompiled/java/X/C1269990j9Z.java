package X;

import Y.ARunnableS120S0100000_20;
import android.graphics.Bitmap;
import android.os.Handler;
import com.ss.ttlivestreamer.core.buffer.k;

/* JADX INFO: renamed from: X.0j9Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1269990j9Z extends C1269960j9W {
    public final C1266350j3h LLILLL;
    public final C1269730j99 LLILZ;
    public Handler LLILZIL;
    public Bitmap LLILZLL;
    public int LLIZ;
    public k LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public final int LLJIJIL;
    public ARunnableS120S0100000_20 LLJILJIL;
    public boolean LLJILJILJ;
    public EnumC1267990j6L LLJILLL = EnumC1267990j6L.BITMAP;

    @Override // X.C1271610jCB
    public final void release() {
        Handler handler = this.LLILZIL;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 452));
        }
    }

    public C1269990j9Z(C1267500j5Y c1267500j5Y, C1266350j3h c1266350j3h, C1269730j99 c1269730j99) {
        Handler handlerLIZ;
        this.LLILLL = c1266350j3h;
        this.LLILZ = c1269730j99;
        this.LLJIJIL = 1;
        C1268700j7U c1268700j7U = (C1268700j7U) c1267500j5Y.LIZJ.getService(C1268700j7U.class);
        if (c1268700j7U != null) {
            handlerLIZ = c1268700j7U.LIZ();
        } else {
            handlerLIZ = null;
        }
        this.LLILZIL = handlerLIZ;
        this.LLJIJIL = c1267500j5Y.LIZ.LJIJJLI();
        this.LLJILJIL = new ARunnableS120S0100000_20(this, 451);
    }
}
