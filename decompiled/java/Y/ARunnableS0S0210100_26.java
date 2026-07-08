package Y;

import X.C1054004Ag;
import X.C1054104Ah;
import X.C1066230dqv;
import X.C13LP;
import X.C1765290w2R;
import X.C1765300w2S;
import X.C1C7U;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.opt.HeaderDisplayImageOpt;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS0S0210100_26 implements Runnable {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        boolean zLJFF;
        List<String> urls;
        C1765290w2R c1765290w2R = (C1765290w2R) this.l0;
        boolean z = this.z2;
        Image image = (Image) this.l1;
        String str = (image == null || (urls = image.getUrls()) == null) ? null : (String) C13LP.LJJJLL(urls);
        long jElapsedRealtime = this.j3;
        long j = jElapsedRealtime - ((C1765290w2R) this.l0).LJII;
        c1765290w2R.getClass();
        try {
            zLJFF = Intrinsics.LJFF(UriProtector.parse(str).getPath(), UriProtector.parse(HeaderDisplayImageOpt.LIZJ).getPath());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLJFF = false;
        }
        C1054004Ag c1054004Ag = c1765290w2R.LIZ.LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            boolean z2 = c1765290w2R.LIZIZ;
            float f = c1765290w2R.LIZJ;
            float f2 = c1765290w2R.LIZLLL;
            boolean z3 = c1765290w2R.LJFF;
            boolean z4 = c1765290w2R.LJI;
            c1054004Ag.LJJII = 1;
            if (jElapsedRealtime == 0) {
                jElapsedRealtime = SystemClock.elapsedRealtime();
            }
            new C1066230dqv(f, f2, c1054004Ag.LJJII, jElapsedRealtime - c1054004Ag.LJIJJLI, j, z2, z, z3, z4, zLJFF).LIZJ(c1054004Ag.LIZIZ);
        }
    }

    public final void LIZ$1() {
        boolean zLJFF;
        List<String> urls;
        C1765300w2S c1765300w2S = (C1765300w2S) this.l0;
        boolean z = this.z2;
        Image image = (Image) this.l1;
        String str = (image == null || (urls = image.getUrls()) == null) ? null : (String) C13LP.LJJJLL(urls);
        long jElapsedRealtime = this.j3;
        long j = jElapsedRealtime - ((C1765300w2S) this.l0).LJII;
        c1765300w2S.getClass();
        try {
            zLJFF = Intrinsics.LJFF(UriProtector.parse(str).getPath(), UriProtector.parse(HeaderDisplayImageOpt.LIZJ).getPath());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLJFF = false;
        }
        C1054104Ah c1054104Ah = c1765300w2S.LIZ.LLJLIL;
        if (c1054104Ah != null) {
            boolean z2 = c1765300w2S.LIZIZ;
            float f = c1765300w2S.LIZJ;
            float f2 = c1765300w2S.LIZLLL;
            boolean z3 = c1765300w2S.LJFF;
            boolean z4 = c1765300w2S.LJI;
            c1054104Ah.LJJI = 1;
            if (jElapsedRealtime == 0) {
                jElapsedRealtime = SystemClock.elapsedRealtime();
            }
            new C1066230dqv(f, f2, c1054104Ah.LJJI, jElapsedRealtime - c1054104Ah.LJIJI, j, z2, z, z3, z4, zLJFF).LIZJ(c1054104Ah.LIZIZ);
        }
    }

    public static final void run$0(ARunnableS0S0210100_26 aRunnableS0S0210100_26) {
        boolean zLIZ;
        C1C7U.LIZ("HeaderImageLogger@6339.onFirstHeaderImageShow$pendingJob$1");
        try {
            aRunnableS0S0210100_26.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HeaderImageLogger@6339.onFirstHeaderImageShow$pendingJob$1");
    }

    public static final void run$1(ARunnableS0S0210100_26 aRunnableS0S0210100_26) {
        boolean zLIZ;
        C1C7U.LIZ("SeaHeaderImageLogger@abb3.onFirstHeaderImageShow$pendingJob$1");
        try {
            aRunnableS0S0210100_26.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeaHeaderImageLogger@abb3.onFirstHeaderImageShow$pendingJob$1");
    }

    public ARunnableS0S0210100_26(Object obj, boolean z, Object obj2, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z2 = z;
        this.l1 = obj2;
        this.j3 = j;
    }
}
