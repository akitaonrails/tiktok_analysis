package X;

import android.os.Handler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.security.SecureRandom;
import java.util.LinkedList;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0m7I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383900m7I {
    public static final SecureRandom LJIJJ = new SecureRandom();
    public final String LIZ;
    public int LIZIZ;
    public float LIZJ;
    public int LIZLLL;
    public float LJ;
    public float LJFF;
    public long LJI;
    public double LJII;
    public int LJIIIIZZ;
    public double LJIIIZ;
    public long LJIIJ;
    public int LJIIJJI;
    public final Aweme LJIIL;
    public Integer LJIILJJIL;
    public Integer LJIIZILJ;
    public boolean LJIJ;
    public final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(399));
    public final C01GW LJIILL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(400));
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1075));
    public final C01GW LJIJI = C452501pT.LIZ(EnumC452301pR.NONE, new AwS565S0100000_21(this, 1074));

    public final LinkedList<Long> LIZ() {
        return (LinkedList) this.LJIILIIL.getValue();
    }

    public final void LIZIZ() {
        if (this.LJI <= 0) {
            return;
        }
        this.LJI = 0L;
        this.LJIIJJI = 0;
        this.LJII = 0.0d;
        this.LJIIIIZZ = 0;
        this.LJIILJJIL = null;
        this.LJIIJ = 0L;
        this.LJIIIZ = 0.0d;
        this.LJIIZILJ = null;
        this.LJIJ = false;
        ((Handler) this.LJIILL.getValue()).removeCallbacksAndMessages(null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("-Draw: Times=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(" Cost=");
        sbLIZ.append((long) this.LJII);
        sbLIZ.append("\n-Compute: Times=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(" Cost=");
        sbLIZ.append((long) this.LJIIIZ);
        sbLIZ.append("\n-showCount=");
        sbLIZ.append(this.LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1383900m7I(String str, C1383870m7F c1383870m7F) {
        this.LIZ = str;
        this.LJIIL = c1383870m7F.LIZ;
    }
}
