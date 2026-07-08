package X;

import Y.ARunnableS111S0100000_11;
import android.app.Activity;
import android.content.Context;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SKv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719670SKv {
    public static final C01GW<C720240SNa> LJIJI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(331));
    public static final C01GW<C720250SNb> LJIJJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(332));
    public final Context LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL = "";
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public BPEAHandler LJII;
    public ARunnableS111S0100000_11 LJIIIIZZ;
    public boolean LJIIIZ;
    public PhotoModeImage LJIIJ;
    public PhotoModeImage LJIIJJI;
    public PhotoModeImage LJIIL;
    public final int LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public int LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;

    public C719670SKv(C19EG c19eg) {
        this.LIZ = c19eg;
        C721640SSk c721640SSk = C721640SSk.LIZ;
        Activity activityLIZIZ = c19eg;
        if (c19eg == null) {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null) {
                activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
            } else {
                activityLIZIZ = null;
            }
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
        c721640SSk.getClass();
        this.LJIILIIL = C721640SSk.LJIIIZ(iLIZIZ, activityLIZIZ);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1369));
        this.LJIILJJIL = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(431));
        this.LJIILL = c01gwLIZIZ2;
        C844470XAv.LIZ.getClass();
        this.LJIILLIIL = C11VU.LIZLLL(C844470XAv.LIZ());
        this.LJIIZILJ = ((Number) c01gwLIZIZ2.getValue()).intValue();
        this.LJIJ = (this.LJIILLIIL - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49))) + ((Number) c01gwLIZIZ.getValue()).intValue();
    }

    public final void LIZ(boolean z) {
        if (C0SKM.LJIIIIZZ().enableTrack && Intrinsics.LJFF(this.LIZLLL, "homepage_hot") && !C20737116Cr.LIZJ() && z && !this.LJIIIZ && this.LIZIZ != null) {
            ARunnableS111S0100000_11 aRunnableS111S0100000_11 = this.LJIIIIZZ;
            if (aRunnableS111S0100000_11 != null) {
                BPEAHandler bPEAHandler = this.LJII;
                if (bPEAHandler != null) {
                    bPEAHandler.removeCallbacks(aRunnableS111S0100000_11);
                }
            } else {
                aRunnableS111S0100000_11 = new ARunnableS111S0100000_11(this, 102);
                this.LJIIIIZZ = aRunnableS111S0100000_11;
            }
            BPEAHandler bPEAHandler2 = this.LJII;
            if (bPEAHandler2 != null) {
                C786410Ut5.LJLIIL(3000L, bPEAHandler2, aRunnableS111S0100000_11);
            }
        }
    }
}
