package X;

import Y.AObjectS246S0100000_25;
import android.app.Activity;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import mn3.e0;

/* JADX INFO: renamed from: X.0svO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645600svO extends AbstractC2255721DQs<InterfaceC1621970sJH> implements InterfaceC1621970sJH, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C1DRG LL;
    public final InterfaceC1621970sJH LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), Activity.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
    public final InterfaceC1648570t0B LLILZIL = (InterfaceC1648570t0B) getDiContainer().LJII(InterfaceC1648570t0B.class, null);
    public final ShortVideoContext LLILZLL = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
    public final C560530Lyd<Boolean> LLIZ = new C560530Lyd<>();
    public final C560530Lyd<Boolean> LLIZLLLIL = new C560530Lyd<>();
    public final C538770LBb<Boolean> LLJ;
    public final C385670FAf<Boolean> LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1645600svO.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1645600svO.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final e0 X1() {
        return (e0) this.LLILZ.getValue(this, LLJIJIL[1]);
    }

    public final Activity getActivity() {
        return (Activity) this.LLILLL.getValue(this, LLJIJIL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLILZIL.yM2().LIZ(this, new AObjectS246S0100000_25(this, 212));
        X1().vC1().LIZ(this, new AObjectS246S0100000_25(this, 213));
    }

    @Override // X.InterfaceC1621970sJH
    public C385670FAf<Boolean> CP1() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1621970sJH
    public /* bridge */ /* synthetic */ LiveEvent Rm() {
        return this.LLIZ;
    }

    public InterfaceC1621970sJH W1() {
        return this.LLILLJJLI;
    }

    public C560530Lyd<Boolean> Z1() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1621970sJH
    public /* bridge */ /* synthetic */ LiveEvent jh2() {
        return this.LLIZLLLIL;
    }

    public C560530Lyd<Boolean> o2() {
        return this.LLIZ;
    }

    public C1645600svO(C1DRG c1drg) {
        this.LL = c1drg;
        C538770LBb<Boolean> c538770LBb = new C538770LBb<>(Boolean.FALSE);
        this.LLJ = c538770LBb;
        this.LLJI = c538770LBb;
    }

    @Override // X.InterfaceC1621970sJH
    public void Ud1(boolean z) {
        this.LLJ.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1621970sJH
    public void Um(boolean z) {
        this.LLIZ.LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1621970sJH
    public void pU0(boolean z) {
        this.LLIZLLLIL.LJIIJ(Boolean.valueOf(z));
    }
}
