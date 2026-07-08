package X;

import X.C1119420fEi;
import Y.ARunnableS127S0100000_27;
import android.os.Looper;
import android.util.SparseLongArray;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0yA4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1846900yA4<T extends C1119420fEi> implements InterfaceC1846850y9z {
    public final DataChannel LIZ;
    public boolean LIZIZ;
    public T LIZJ;
    public T LIZLLL;
    public boolean LJI;
    public long LJII;
    public long LJIIIIZZ;
    public int LJ = 3600;
    public final BPEAHandler LJFF = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS127S0100000_27 LJIIIZ = new ARunnableS127S0100000_27(this, 62);

    public abstract boolean LJIIJJI();

    public abstract void LJIILIIL();

    public long LJIILL() {
        return 0L;
    }

    public final void LJIIJ() {
        T t = this.LIZJ;
        if (t == null) {
            return;
        }
        long jLIZJ = t.LIZLLL - C158B.LIZJ();
        if (C500260Jjc.LJIIZILJ(this.LIZ) && !this.LIZIZ && !C1846800y9u.LJIIL(this.LIZ) && LJIIJJI() && 10 <= jLIZJ && jLIZJ < this.LJ) {
            SparseLongArray sparseLongArray = C1810700xDg.LIZ;
            if (C1810700xDg.LJ(this.LIZ) == ((int) EnumC1118970fDz.RANK_SWITCH_STATUS_ON.getValue())) {
                LIZIZ(true);
            }
        }
        long jLIZJ2 = C158B.LIZJ();
        long j = t.LIZLLL;
        if (jLIZJ2 >= j) {
            t.LIZLLL = j + t.LJ;
        }
        ARunnableS127S0100000_27 aRunnableS127S0100000_27 = new ARunnableS127S0100000_27(this, 61);
        T t2 = this.LIZJ;
        if (t2 != null) {
            long j2 = t2.LIZLLL - jLIZJ2;
            long j3 = this.LJ;
            if (j2 >= j3) {
                C786410Ut5.LJLIIL((j2 - j3) * ((long) LSPassThroughRecordSizeConfig.DEFAULT), this.LJFF, aRunnableS127S0100000_27);
            } else if (j2 >= 0) {
                C786410Ut5.LJLIIL(((j2 + t2.LJ) - j3) * ((long) LSPassThroughRecordSizeConfig.DEFAULT), this.LJFF, aRunnableS127S0100000_27);
            }
        }
        LJIILIIL();
        LJIIL(jLIZJ2);
    }

    public final void LJIILLIIL() {
        if (this.LJI) {
            LJIILIIL();
            T t = this.LIZJ;
            if (t == null || this.LJIIIIZZ == t.LJI) {
                return;
            }
            this.LJFF.removeCallbacks(this.LJIIIZ);
            LJIIL(C158B.LIZJ());
        }
    }

    @Override // X.InterfaceC1846850y9z
    public final boolean LJIIIZ() {
        return this.LIZIZ;
    }

    public AbstractC1846900yA4(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // X.InterfaceC1846850y9z
    public final void LJII(boolean z) {
        this.LIZIZ = z;
    }

    public final void LJIIL(long j) {
        LJIILIIL();
        T t = this.LIZJ;
        if (t == null) {
            return;
        }
        long j2 = t.LJI;
        this.LJIIIIZZ = j2;
        long j3 = j2 - j;
        if (j3 >= 0) {
            C786410Ut5.LJLIIL(j3 * ((long) LSPassThroughRecordSizeConfig.DEFAULT), this.LJFF, this.LJIIIZ);
        }
    }

    public static long LJIILJJIL(C1119420fEi c1119420fEi, RankTypeV2 rankTypeV2, long j, long j2, boolean z) {
        C1846810y9v c1846810y9v = c1119420fEi.LJIIIIZZ;
        if (c1846810y9v != null && c1846810y9v.LIZ == 2) {
            return j2 + j;
        }
        if (z && c1846810y9v != null && c1846810y9v.LIZ == 1) {
            long jLIZJ = C158B.LIZJ();
            C1119210fEN.LIZ.getClass();
            return jLIZJ + C1119210fEN.LIZJ(rankTypeV2);
        }
        long j3 = c1119420fEi.LIZLLL;
        C1119210fEN.LIZ.getClass();
        return j3 + C1119210fEN.LIZJ(rankTypeV2);
    }
}
