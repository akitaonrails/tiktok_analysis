package X;

import android.app.Activity;
import com.bytedance.bpea.basics.Cert;
import java.util.Iterator;

/* JADX INFO: renamed from: X.142Z, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C142Z {
    public final Activity LIZ;
    public final Cert LIZIZ;
    public final String[] LIZJ;
    public String[] LIZLLL = new String[0];
    public final C142V LJ;
    public final InterfaceC201999142b LJFF;
    public final InterfaceC201999142b LJI;
    public final Runnable LJII;
    public final Runnable LJIIIIZZ;

    public final void LIZ() {
        this.LJ.LIZ(this.LIZJ);
        C201998142a c201998142a = C202001142d.LIZ;
        String[] strArr = this.LIZLLL;
        c201998142a.getClass();
        if (strArr != null) {
            for (String str : strArr) {
                Iterator<InterfaceC202000142c> it2 = c201998142a.LIZ(str).iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ();
                }
            }
        }
    }

    public final void LIZIZ(boolean z) {
        this.LJ.LIZJ(this.LIZJ);
        C201998142a c201998142a = C202001142d.LIZ;
        c201998142a.LIZJ(this.LIZJ);
        if (z) {
            this.LJIIIIZZ.run();
            c201998142a.LIZIZ(this.LIZLLL);
        }
    }

    public C142Z(Activity activity, Cert cert, String[] strArr, Runnable runnable, C142V c142v, InterfaceC201999142b interfaceC201999142b, Runnable runnable2, InterfaceC201999142b interfaceC201999142b2) {
        this.LIZ = activity;
        this.LIZIZ = cert;
        this.LIZJ = strArr;
        this.LJII = runnable;
        this.LJIIIIZZ = runnable2;
        this.LJ = c142v;
        this.LJFF = interfaceC201999142b;
        this.LJI = interfaceC201999142b2;
    }
}
