package X;

import android.view.Choreographer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.08GC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C08GC {
    public final int LIZ;
    public final C08GH LIZIZ;
    public final Choreographer LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public long LJFF;

    public void LIZ() {
    }

    public final void LIZIZ(long j, int i) {
        C08GH c08gh = this.LIZIZ;
        int i2 = this.LIZ;
        c08gh.getClass();
        C08GF c08gfLIZ = C08GF.LIZ();
        if (!((ArrayList) c08gfLIZ.LIZJ).isEmpty()) {
            Iterator it2 = ((ArrayList) c08gfLIZ.LIZJ).iterator();
            while (it2.hasNext()) {
                ((C08GE) it2.next()).LIZ();
            }
        }
    }

    public C08GC(int i, Choreographer choreographer, C08GH c08gh) {
        this.LIZ = i;
        this.LIZIZ = c08gh;
        this.LIZJ = choreographer;
    }
}
