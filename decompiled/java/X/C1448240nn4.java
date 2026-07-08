package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.shortvideo.ui.component.u;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0nn4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448240nn4 {
    public final Effect LIZ;
    public final long LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final AtomicBoolean LJFF;
    public final AtomicBoolean LJI;

    public C1448240nn4(Effect effect) {
        long jElapsedRealtime;
        u.LLJLIL.getClass();
        if (C1448310nnB.LIZ()) {
            jElapsedRealtime = System.currentTimeMillis();
        } else {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.LIZ = effect;
        this.LIZIZ = jElapsedRealtime;
        this.LIZJ = 1;
        this.LJ = true;
        this.LJFF = new AtomicBoolean(false);
        this.LJI = new AtomicBoolean(false);
    }
}
