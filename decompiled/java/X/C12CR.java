package X;

import Y.AObjectS247S0100000_29;
import Y.AObserverS231S0100000_29;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.12CR, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12CR extends AbstractC2255721DQs<C12C1> implements C12C1, InterfaceC379610EuV {
    public static final C12CS LLJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final int LLJIJIL;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final VideoPublishEditModel LLILZ;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455610nyx.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC459260Hzg.class, null);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 312));

    /* JADX WARN: Type inference failed for: r0v7, types: [X.12CS] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C12CR.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C12CR.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/BaseEditToolbarApi;", 0), new C2217381BqS(C12CR.class, "editGradientBgApi", "getEditGradientBgApi()Lcom/ss/android/ugc/aweme/social/sticker/service/EditStoryGradientBgApi;", 0)};
        LLJ = new Object() { // from class: X.12CS
        };
        LLJIJIL = 8;
    }

    public C12C1 W1() {
        return this;
    }

    private final InterfaceC1455610nyx o2() {
        return (InterfaceC1455610nyx) this.LLILZLL.getValue(this, LLJI[1]);
    }

    private final C459250Hzf w2() {
        return (C459250Hzf) this.LLIZLLLIL.getValue();
    }

    public final InterfaceC459260Hzg X1() {
        return (InterfaceC459260Hzg) this.LLIZ.getValue(this, LLJI[2]);
    }

    public final InterfaceC1461350o8D Z1() {
        return (InterfaceC1461350o8D) this.LLILZIL.getValue(this, LLJI[0]);
    }

    @Override // X.C12C1
    public void C92() {
        w2().LLLIIIIL();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLILLJJLI.add(this.LLILLL, w2(), "EditStorySAStickerTrayComponent");
        o2().x8().observe(this, new AObserverS231S0100000_29(this, 90));
        Z1().DO2().LIZ(this, new AObjectS247S0100000_29(this, 59));
        Z1().gD0().LIZ(this, new AObjectS247S0100000_29(this, 60));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLILLJJLI.remove(w2());
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final C19A3 getParentScene() {
        return this.LLILLJJLI;
    }

    @Override // X.C12C1
    public void f32(boolean z) {
        w2().LLLII(z);
    }

    public C12CR(C1DRG c1drg, C19A3 c19a3, int i, VideoPublishEditModel videoPublishEditModel) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
        this.LLILZ = videoPublishEditModel;
    }
}
