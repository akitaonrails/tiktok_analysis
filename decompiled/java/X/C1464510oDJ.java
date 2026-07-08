package X;

import Y.ARunnableS122S0100000_22;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.service.IMusicExternalService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.services.IMusicEditService;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.VeMusicStreamTimeoutOpt;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0oDJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1464510oDJ extends AbstractC2255721DQs<InterfaceC1457960o2k> implements InterfaceC1457960o2k, InterfaceC379610EuV {
    public static final C1464540oDM LLJILJILJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C1DRG LL;
    public volatile boolean LLIZ;
    public Runnable LLJ;
    public Pair<String, ? extends Runnable> LLJI;
    public AbstractC20187113yn LLJIJIL;
    public AbstractC20187113yn LLJILJIL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1457960o2k LLILZ = this;
    public final h0<EnumC1457970o2l> LLILZIL = new h0<>(EnumC1457970o2l.DEFAULT);
    public final h0<Boolean> LLILZLL = new h0<>(Boolean.FALSE);
    public final SafeHandler LLIZLLLIL = new SafeHandler(this);

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0oDM] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1464510oDJ.class, "videoPublishEditModel", "getVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1464510oDJ.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0)};
        LLJILJILJ = new Object() { // from class: X.0oDM
        };
    }

    private final void T2() {
        AbstractC20187113yn abstractC20187113yn = new AbstractC20187113yn() { // from class: X.0oDL
            @Override // X.InterfaceC20187013ym
            public final void LIZIZ(String str, int i, int i2, String str2) {
            }

            @Override // X.InterfaceC20187013ym
            public final void LIZJ(String str) {
            }

            @Override // X.InterfaceC20187013ym
            public final void LIZLLL(String str, boolean z) {
            }

            @Override // X.AbstractC20187113yn
            public final void LJ(String str, int i, int i2, float f, String str2) {
            }

            @Override // X.InterfaceC20187013ym
            public final void LJJJLL(String str, float f) {
            }

            @Override // X.InterfaceC20187013ym
            public final void LIZ(String str) {
                InterfaceC1662290tMJ interfaceC1662290tMJLIZJ;
                String strLJFF;
                if (C123100dR.LIZ(str)) {
                    C141Q c141q = C141Q.LIZ;
                    String mMusicPath = this.LIZ.bb2().getMMusicPath();
                    c141q.getClass();
                    if (C141Q.LJII(mMusicPath) && Intrinsics.LJFF(str, this.LIZ.bb2().getMMusicPath())) {
                        String strLIZJ = C1429680nJ8.LIZJ(this.LIZ.bb2().creativeModel.musicBuzModel);
                        IMusicExternalService iMusicExternalService = (IMusicExternalService) PluggableExtentionKt.pluggableSpi$default(IMusicExternalService.class, false, false, false, 14, null);
                        if (iMusicExternalService != null && (interfaceC1662290tMJLIZJ = iMusicExternalService.LIZJ()) != null && (strLJFF = interfaceC1662290tMJLIZJ.LJFF(str, strLIZJ, this.LIZ.bb2().getMMusicUrlKey(str))) != null) {
                            this.LIZ.bb2().setMMusicPath(strLJFF);
                        }
                        C201955140j.LIZJ(C201962140q.LIZIZ, "EditMusicStreamPlayback : replaceMusicPathIfNeed : ");
                    }
                }
            }
        };
        this.LLJIJIL = abstractC20187113yn;
        C20187213yo.LIZ.getClass();
        ((CopyOnWriteArraySet) C20187213yo.LIZJ).add(abstractC20187113yn);
    }

    private final InterfaceC1455860nzM Z1() {
        return (InterfaceC1455860nzM) this.LLILLL.getValue(this, LLJILLL[1]);
    }

    private final void w2() {
        final C817403Hg c817403Hg = new C817403Hg();
        final C817403Hg c817403Hg2 = new C817403Hg();
        AbstractC20187113yn abstractC20187113yn = new AbstractC20187113yn() { // from class: X.0oDK
            @Override // X.InterfaceC20187013ym
            public final void LIZ(String str) {
                Runnable second;
                C1464510oDJ.G2(this.LIZ, c817403Hg2, c817403Hg, str, 1.0f);
                if (((VeMusicStreamTimeoutOpt.VeMusicStreamTimeoutOptConfig) VeMusicStreamTimeoutOpt.LIZIZ.getValue()).isEnable && this.LIZ.H2(str)) {
                    Pair<String, ? extends Runnable> pair = this.LIZ.LLJI;
                    if (pair != null && (second = pair.getSecond()) != null) {
                        this.LIZ.LLIZLLLIL.removeCallbacks(second);
                    }
                    this.LIZ.LLJI = null;
                }
            }

            @Override // X.InterfaceC20187013ym
            public final void LIZJ(String str) {
                this.LIZ.LLIZ = false;
            }

            @Override // X.InterfaceC20187013ym
            public final void LIZLLL(String str, boolean z) {
                this.LIZ.LLIZ = false;
            }

            @Override // X.InterfaceC20187013ym
            public final void LJJJLL(String str, float f) {
                Runnable second;
                C1464510oDJ.G2(this.LIZ, c817403Hg2, c817403Hg, str, f);
                C01GW c01gw = VeMusicStreamTimeoutOpt.LIZIZ;
                if (((VeMusicStreamTimeoutOpt.VeMusicStreamTimeoutOptConfig) c01gw.getValue()).isEnable && str != null && this.LIZ.H2(str)) {
                    Pair<String, ? extends Runnable> pair = this.LIZ.LLJI;
                    if (pair == null || !Intrinsics.LJFF(pair.getFirst(), str)) {
                        Pair<String, ? extends Runnable> pair2 = this.LIZ.LLJI;
                        if (pair2 != null && (second = pair2.getSecond()) != null) {
                            this.LIZ.LLIZLLLIL.removeCallbacks(second);
                        }
                        C1464510oDJ c1464510oDJ = this.LIZ;
                        ARunnableS122S0100000_22 aRunnableS122S0100000_22 = new ARunnableS122S0100000_22(c1464510oDJ, 68);
                        c1464510oDJ.LLIZLLLIL.postDelayed(aRunnableS122S0100000_22, ((VeMusicStreamTimeoutOpt.VeMusicStreamTimeoutOptConfig) c01gw.getValue()).timeoutMs);
                        c1464510oDJ.LLJI = new Pair<>(str, aRunnableS122S0100000_22);
                    }
                }
            }

            @Override // X.InterfaceC20187013ym
            public final void LIZIZ(String str, int i, int i2, String str2) {
                Runnable second;
                this.LIZ.LLIZ = false;
                if (((VeMusicStreamTimeoutOpt.VeMusicStreamTimeoutOptConfig) VeMusicStreamTimeoutOpt.LIZIZ.getValue()).isEnable && this.LIZ.H2(str)) {
                    Pair<String, ? extends Runnable> pair = this.LIZ.LLJI;
                    if (pair != null && (second = pair.getSecond()) != null) {
                        this.LIZ.LLIZLLLIL.removeCallbacks(second);
                    }
                    this.LIZ.LLJI = null;
                }
            }

            @Override // X.AbstractC20187113yn
            public final void LJ(String str, int i, int i2, float f, String str2) {
                if (!this.LIZ.H2(str)) {
                    return;
                }
                C1464510oDJ c1464510oDJ = this.LIZ;
                Runnable runnable = c1464510oDJ.LLJ;
                if (runnable != null) {
                    c1464510oDJ.LLIZLLLIL.removeCallbacks(runnable);
                }
                c817403Hg.element = c817403Hg2.element;
                C1464510oDJ c1464510oDJ2 = this.LIZ;
                ARunnableS122S0100000_22 aRunnableS122S0100000_22 = new ARunnableS122S0100000_22(c1464510oDJ2, 67);
                c1464510oDJ2.LLIZLLLIL.postDelayed(aRunnableS122S0100000_22, ((Number) C0ATN.LIZ.getValue()).longValue());
                c1464510oDJ2.LLJ = aRunnableS122S0100000_22;
                C201962140q c201962140q = C201962140q.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("EditMusicStreamPlayback : onInfo url: ");
                sbLIZ.append(str);
                sbLIZ.append(" type: ");
                sbLIZ.append(i);
                sbLIZ.append(" ext: ");
                sbLIZ.append(i2);
                sbLIZ.append(" f: ");
                sbLIZ.append(f);
                sbLIZ.append(" msg: ");
                sbLIZ.append(str2);
                C201955140j.LIZJ(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.LLJILJIL = abstractC20187113yn;
        C20187213yo.LIZ.getClass();
        ((CopyOnWriteArraySet) C20187213yo.LIZJ).add(abstractC20187113yn);
    }

    public final VideoPublishEditModel bb2() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLJILLL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (C298120BmM.LIZ()) {
            T2();
        }
        IMusicEditService iMusicEditService = (IMusicEditService) PluggableExtentionKt.pluggableSpi$default(IMusicEditService.class, false, false, false, 14, null);
        if (iMusicEditService == null || !iMusicEditService.LJIILIIL(Z1())) {
            w2();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        AbstractC20187113yn abstractC20187113yn = this.LLJIJIL;
        if (abstractC20187113yn != null) {
            C20187213yo.LIZ.getClass();
            ((CopyOnWriteArraySet) C20187213yo.LIZJ).remove(abstractC20187113yn);
            this.LLJIJIL = null;
        }
        AbstractC20187113yn abstractC20187113yn2 = this.LLJILJIL;
        if (abstractC20187113yn2 != null) {
            C20187213yo.LIZ.getClass();
            ((CopyOnWriteArraySet) C20187213yo.LIZJ).remove(abstractC20187113yn2);
            this.LLJILJIL = null;
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        if (this.LLIZ) {
            this.LLILZIL.LJII(EnumC1457970o2l.PLAYING);
            this.LLIZ = false;
        }
    }

    @Override // X.InterfaceC1457960o2k
    public /* bridge */ /* synthetic */ C385670FAf P11() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1457960o2k
    public /* bridge */ /* synthetic */ C385670FAf Te0() {
        return this.LLILZLL;
    }

    public InterfaceC1457960o2k W1() {
        return this.LLILZ;
    }

    public h0<Boolean> X1() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public h0<EnumC1457970o2l> o2() {
        return this.LLILZIL;
    }

    public C1464510oDJ(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final boolean H2(String str) {
        MusicObject musicObject;
        UrlModel urlModel;
        List<String> urlList;
        Object objLJJJLL;
        if (str == null || a0.LJJJIL(str) || (musicObject = bb2().creativeModel.musicBuzModel.music) == null || (urlModel = musicObject.playUrl) == null || (urlList = urlModel.getUrlList()) == null || (objLJJJLL = C13LP.LJJJLL(urlList)) == null) {
            return false;
        }
        return Intrinsics.LJFF(objLJJJLL, str);
    }

    public static final void G2(C1464510oDJ c1464510oDJ, C817403Hg c817403Hg, C817403Hg c817403Hg2, String str, float f) {
        if (!c1464510oDJ.H2(str)) {
            return;
        }
        c817403Hg.element = f;
        if (c817403Hg2.element >= f) {
            c817403Hg2.element = 0.0f;
        }
        C201962140q c201962140q = C201962140q.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditMusicStreamPlayback : hideLoadingAndPlay : onProgress ");
        sbLIZ.append(f);
        sbLIZ.append(". lastStopProgress: ");
        sbLIZ.append(c817403Hg2.element);
        C201955140j.LIZJ(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
        if (f == 1.0f || f - c817403Hg2.element > ((Number) C2555209zq.LIZ.getValue()).floatValue()) {
            Runnable runnable = c1464510oDJ.LLJ;
            if (runnable != null) {
                c1464510oDJ.LLIZLLLIL.removeCallbacks(runnable);
            }
            if (c1464510oDJ.LLIZ) {
                C01TT.LIZLLL(new AwS566S0100000_22(c1464510oDJ, 656));
            }
        }
    }
}
