package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tJm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660720tJm implements InterfaceC1649090t11, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final C1DRG LL;
    public final Function0<InterfaceC1674890tgd> LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public EnumC1448590nnd LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1660720tJm.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1660720tJm(C1DRG c1drg, Function0<? extends InterfaceC1674890tgd> function0) {
        this.LL = c1drg;
        this.LLILLJJLI = function0;
        C1664750tQH c1664750tQHLIZ = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
        this.LLILLL = c1664750tQHLIZ;
        this.LLILZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 493));
        this.LLILZIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 495));
        this.LLILZLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 494));
        this.LLIZ = C1660530tJT.LIZLLL(d4.LIZLLL((ShortVideoContext) c1664750tQHLIZ.getValue(this, LLIZLLLIL[0])));
    }

    @Override // X.InterfaceC1649090t11
    public final boolean LIZ(EnumC1448590nnd enumC1448590nnd, View view, View view2, boolean z) {
        EnumC1448590nnd enumC1448590nnd2;
        if (enumC1448590nnd == null) {
            enumC1448590nnd2 = this.LLIZ;
        } else {
            enumC1448590nnd2 = enumC1448590nnd;
        }
        boolean z2 = false;
        if (z || enumC1448590nnd2 != this.LLIZ) {
            if (enumC1448590nnd2 != null) {
                int i = C1448610nnf.LIZ[enumC1448590nnd2.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3 && d4.LJJIII((ShortVideoContext) this.LLILLL.getValue(this, LLIZLLLIL[0]))) {
                            ((C1660730tJn) this.LLILZIL.getValue()).LIZ(enumC1448590nnd2, view, view2, z);
                        }
                    } else if (C1443960ngA.LJIIL((ShortVideoContext) this.LLILLL.getValue(this, LLIZLLLIL[0]))) {
                        ((C1649740t24) this.LLILZLL.getValue()).LIZ(enumC1448590nnd2, view, view2, false);
                    }
                } else {
                    ((C1660710tJl) this.LLILZ.getValue()).LIZ(enumC1448590nnd2, view, view2, z);
                }
            }
            if (enumC1448590nnd2 != this.LLIZ) {
                z2 = true;
            }
            this.LLIZ = enumC1448590nnd2;
        }
        C201955140j.LIZ("SurfaceSizeAdapterProxy:onResetSurfaceSize,currentRatio:" + this.LLIZ + ",targetRatio:" + enumC1448590nnd + ",forceRefresh:" + z + ",result:" + z2);
        return z2;
    }
}
