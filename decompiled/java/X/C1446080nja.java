package X;

import Y.AObjectS245S0100000_22;
import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS306S0000000_22;
import kotlin.jvm.internal.AwS671S0100000_22;

/* JADX INFO: renamed from: X.0nja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446080nja extends AbstractC2255721DQs<InterfaceC569720MWc> implements InterfaceC569720MWc, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final int LLJIJIL;
    public final AbstractC214814194y LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC569720MWc LLILLL = this;
    public final C19EG LLILZ = (C19EG) getDiContainer().LJII(C19EG.class, null);
    public final ShortVideoContext LLILZIL = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), C1453870nw9.class, null);
    public long LLIZ = -1;
    public final C1655770tBn LLIZLLLIL = new C1655770tBn(AFwS306S0000000_22.get$arr$(13));
    public long LLJ = -1;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1446080nja.class, "screenStateDispatch", "getScreenStateDispatch()Lcom/ss/android/ugc/aweme/shortvideo/util/performance/ScreenStateDispatch;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJIJIL = 8;
    }

    private final C1453870nw9<EnumC1641390sob> X1() {
        return (C1453870nw9) this.LLILZLL.getValue(this, LLJI[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (C1462510oA5.LIZ().isOpen) {
            this.LLIZLLLIL.LIZLLL(new C1462480oA2(this.LLILZ, this.LL, AFwS210S0000000_22.get$arr$(278), new AwS671S0100000_22(this, 4)));
        }
        Bundle bundleLIZ = C537670L6v.LIZ(getDiContainer(), this.LLILZ);
        if (bundleLIZ != null) {
            this.LLJ = bundleLIZ.getLong("extra_start_record_time", -1L);
        }
        C1453870nw9<EnumC1641390sob> c1453870nw9X1 = X1();
        if (c1453870nw9X1 != null) {
            c1453870nw9X1.LIZLLL(EnumC1641390sob.ACTIVITY_ENTER_ANIMATION_END).LIZ(this, new AObjectS245S0100000_22(this, 256));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLIZLLLIL.destroy();
    }

    public InterfaceC569720MWc W1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public C1446080nja(AbstractC214814194y abstractC214814194y, C1DRG c1drg) {
        this.LL = abstractC214814194y;
        this.LLILLJJLI = c1drg;
    }

    @Override // X.InterfaceC569720MWc
    public void MH(String str, long j) {
        if (!this.LLIZLLLIL.LIZ(str)) {
            su1(str, j, false, true);
        }
    }

    @Override // X.InterfaceC569720MWc
    public void su1(String str, long j, boolean z, boolean z2) {
        if (z) {
            C1444920nhi.LIZJ(this.LLILZIL, str, "video_album_page", "video_album_page");
        }
        if (z2) {
            C1444920nhi c1444920nhi = C1444920nhi.LIZ;
            ShortVideoContext shortVideoContext = this.LLILZIL;
            long j2 = this.LLJ;
            long j3 = this.LLIZ;
            c1444920nhi.getClass();
            C1444920nhi.LIZIZ(str, shortVideoContext, j2, j3, "video_album_page");
        }
        this.LL.finish();
    }
}
