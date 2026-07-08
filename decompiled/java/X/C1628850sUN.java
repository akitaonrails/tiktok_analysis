package X;

import Y.AObserverS227S0100000_25;
import Y.AfS172S0100000_3;
import Y.AfS194S0100000_25;
import Y.AfS41S1100000_3;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.vesdk.VERecorder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS147S0201000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: renamed from: X.0sUN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1628850sUN extends AbstractC2255721DQs<InterfaceC1628900sUS> implements InterfaceC1628900sUS, InterfaceC379610EuV {
    public static final C1628880sUQ LLJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public static final int LLJJJJ;
    public final C1DRG LL;
    public final InterfaceC1624480sNK LLILLJJLI;
    public final InterfaceC1625410sOp LLILLL;
    public C093E LLILZ;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final MutableLiveData<C0LCS<C1637080she>> LLJ;
    public final MutableLiveData<Effect> LLJI;
    public ViewGroup LLJIJIL;
    public final LiveData<C0LCS<C1637080she>> LLJILJIL;
    public final C11NJ LLJILJILJ;
    public C1637060shc LLJILLL;
    public String LLJJ;
    public Effect LLJJI;
    public boolean LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final Function2<Effect, Boolean, Unit> LLJJIJIL;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0sUQ] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1628850sUN.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1628850sUN.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C1628850sUN.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C2217381BqS(C1628850sUN.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0)};
        LLJJJ = new Object() { // from class: X.0sUQ
        };
        LLJJJJ = 8;
    }

    public InterfaceC1628900sUS w2() {
        return this;
    }

    private final InterfaceC1628910sUT c3() {
        return (InterfaceC1628910sUT) this.LLJJIJIIJIL.getValue();
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLIZLLLIL.getValue(this, LLJJJIL[3]);
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZLL.getValue(this, LLJJJIL[1]);
    }

    public final EffectCategoryModel G2() {
        return (EffectCategoryModel) this.LLJJIJI.getValue();
    }

    public final C093E H2() {
        C093E c093e = this.LLILZ;
        if (c093e != null) {
            return c093e;
        }
        return null;
    }

    public final InterfaceC1650230t2r getCameraApi() {
        return (InterfaceC1650230t2r) this.LLIZ.getValue(this, LLJJJIL[2]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLILZIL.getValue(this, LLJJJIL[0]);
    }

    private final boolean o2() {
        C1441190nbh c1441190nbhLIZIZ = getShortVideoContext().cameraComponentModel.LIZIZ();
        return (c1441190nbhLIZIZ.isEmpty() || c1441190nbhLIZIZ.get(c1441190nbhLIZIZ.size() + (-1)) == null) && !getShortVideoContext().LJJJJLL() && !getShortVideoContext().isDuetMode && this.LLILLJJLI.LLILIL() == null;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        i3(new C093E(this.LLILLJJLI));
        getCameraApi().St2().L0(new InterfaceC1631630sYr<Integer, Integer, String, VERecorder, Unit>() { // from class: X.0sUP
            @Override // X.InterfaceC1631630sYr
            public final Unit invoke(Integer num, Integer num2, String str, VERecorder vERecorder) {
                int iIntValue = num.intValue();
                num2.intValue();
                if (iIntValue == 1050) {
                    C1628850sUN c1628850sUN = this.LL;
                    if (!c1628850sUN.LLJJIII) {
                        c1628850sUN.getCameraApi().St2().Dh(this);
                        C1628850sUN c1628850sUN2 = this.LL;
                        c1628850sUN2.LLJJIII = true;
                        Effect effect = c1628850sUN2.LLJJI;
                        if (effect != null) {
                            C01TT.LIZLLL(new AwS426S0200000_25(c1628850sUN2, effect, 104));
                        }
                    }
                }
                return Unit.LIZ;
            }
        });
        C11NJ c11nj = this.LLJILJILJ;
        C11RK<EnumC1647590syb> c11rk = C1638140sjM.LIZ;
        c11rk.getClass();
        c11nj.LIZ(new C19475711Hn(c11rk).LJJLJLI(new AfS194S0100000_25(this, 62)));
        this.LLJI.observe(this, new AObserverS227S0100000_25(this, 73));
        C11NJ c11nj2 = this.LLJILJILJ;
        C11PQ<C07YZ> c11pq = H2().LIZIZ;
        c11pq.getClass();
        c11nj2.LIZ(new C19475711Hn(c11pq).LJJLJLI(new AfS172S0100000_3(this, 19)));
        vd(MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJILJILJ.LJ();
    }

    public final InterfaceC1624480sNK T2() {
        return this.LLILLJJLI;
    }

    public final InterfaceC1625410sOp W2() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        w2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1628900sUS
    public LiveData<C0LCS<C1637080she>> getShowEntrance() {
        return this.LLJILJIL;
    }

    private final void X1(Effect effect) {
        C1624010sMZ.LIZLLL(getStickerApiComponent(), C1697810uHb.LJIILJJIL(effect), true, !getShortVideoContext().LJJJJZ(), new InterfaceC1625550sP3() { // from class: X.0sUO
            @Override // X.InterfaceC1625550sP3
            public final void LJIIIIZZ(Effect effect2) {
                this.LL.m3(effect2, EnumC1641420soe.DOWNLOADING, null);
            }

            @Override // X.InterfaceC1625550sP3
            public final void onSuccess(Effect effect2) {
                C1637060shc c1637060shc = this.LL.LLJILLL;
                if (c1637060shc != null) {
                    c1637060shc.LIZ();
                }
                this.LL.m3(effect2, EnumC1641420soe.DOWNLOAD_SUCCESS, null);
            }

            @Override // X.InterfaceC1625550sP3
            public final void LJII(int i, Effect effect2) {
                C421570Gfz.LIZ(new AwS147S0201000_25(this.LL, i, effect2, 7));
            }

            @Override // X.InterfaceC1625550sP3
            public final void LJIILLIIL(Effect effect2, ExceptionResult exceptionResult) {
                C1637060shc c1637060shc = this.LL.LLJILLL;
                if (c1637060shc != null) {
                    c1637060shc.LIZ();
                }
                this.LL.m3(effect2, EnumC1641420soe.DOWNLOAD_FAILED, null);
            }
        }, false, null, null, null, 32744);
    }

    public final void Z1(Effect effect) {
        if (!this.LLJJIII) {
            return;
        }
        X1(effect);
    }

    @Override // X.InterfaceC1628900sUS
    public void fM0(ViewGroup viewGroup) {
        this.LLJIJIL = viewGroup;
    }

    public final void i3(C093E c093e) {
        this.LLILZ = c093e;
    }

    @Override // X.InterfaceC1628900sUS
    public void vd(AVMusic aVMusic) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_recommend_prop", true, false) && !getShortVideoContext().cameraComponentModel.enterRecordWithSticker && TextUtils.isEmpty(getShortVideoContext().presetEffectId) && TextUtils.isEmpty(getShortVideoContext().LJIIIZ()) && !getShortVideoContext().LJJLL() && !getShortVideoContext().LJJJJZ() && !getShortVideoContext().cameraComponentModel.isEditorProRecordMode && aVMusic != null && !aVMusic.isLocalMusic()) {
            if (getStickerApiComponent().jr() != null && !Intrinsics.LJFF(getStickerApiComponent().jr(), FaceStickerBean.NONE)) {
                return;
            }
            this.LLJJ = aVMusic.getMusicId();
            if (!o2()) {
                return;
            }
            final C093E c093eH2 = H2();
            final String str = this.LLJJ;
            c093eH2.LIZIZ.onNext(new C07YZ() { // from class: X.07Ya
            });
            ((InterfaceC2470909mF) C0CHQ.LIZ().getNetworkService().createRetrofit(C0CHQ.LIZ().getNetworkService().getApiHost(), true, InterfaceC2470909mF.class)).LIZ(str, C0C64.LJIILLIIL().LJIJ(31744, -1, "recommend_prop_threshold", true), C0CHQ.LIZ().LJJJ().getEffectSDKVersion()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0sNU
                /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
                @Override // X.C09JN
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void accept(java.lang.Object r7) {
                    /*
                        r6 = this;
                        java.lang.String r5 = "RecommendStickerViewModel@c855.fetchRecommendSticker$1"
                        X.C1C7U.LIZ(r5)
                        com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.RecommendStickerResponse r7 = (com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.RecommendStickerResponse) r7
                        java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = r7.recommendStickerList
                        java.lang.Object r3 = X.C13LP.LJJJLL(r0)
                        com.ss.android.ugc.effectmanager.effect.model.Effect r3 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r3
                        r4 = 1
                        if (r3 == 0) goto L3a
                        X.093E r0 = r1
                        r0.getClass()
                        boolean r0 = X.C1624570sNT.LJIIIIZZ(r3)
                        if (r0 != 0) goto L3a
                        if (r3 == 0) goto L67
                        boolean r0 = r3.isBusiness()
                        if (r0 == 0) goto L67
                        com.google.gson.Gson r2 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L63
                        r2.<init>()     // Catch: java.lang.Exception -> L63
                        java.lang.String r1 = r3.getExtra()     // Catch: java.lang.Exception -> L63
                        java.lang.Class<com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean> r0 = com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean.class
                        java.lang.Object r0 = r2.LJII(r1, r0)     // Catch: java.lang.Exception -> L63
                        com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean r0 = (com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean) r0     // Catch: java.lang.Exception -> L63
                        int r0 = r0.commerceStickerType     // Catch: java.lang.Exception -> L63
                        if (r4 != r0) goto L67
                    L3a:
                        X.093E r0 = r1
                        X.11PQ<X.07YZ> r4 = r0.LIZIZ
                        X.07YY r3 = new X.07YY
                        java.lang.Throwable r2 = new java.lang.Throwable
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = "Id "
                        r1.append(r0)
                        java.lang.String r0 = r2
                        r1.append(r0)
                        java.lang.String r0 = " music can't find a sticker to recommend"
                        r1.append(r0)
                        java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                        r2.<init>(r0)
                        r3.<init>(r2)
                        r4.onNext(r3)
                        goto L95
                    L63:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    L67:
                        boolean r0 = X.C1624200sMs.LJIIIIZZ(r3)
                        if (r0 != 0) goto L3a
                        if (r3 == 0) goto L7d
                        X.0njf r0 = X.C1446130njf.LIZ
                        java.lang.String r1 = "share_ar"
                        r0.getClass()
                        r0 = 0
                        boolean r0 = X.C1446130njf.LJIILJJIL(r3, r1, r0)
                        if (r0 != 0) goto L3a
                    L7d:
                        boolean r0 = X.C1624200sMs.LJIILL(r3)
                        if (r0 != 0) goto L3a
                        boolean r0 = X.C1624200sMs.LJIILIIL(r3)
                        if (r0 != 0) goto L3a
                        X.093E r0 = r1
                        X.11PQ<X.07YZ> r1 = r0.LIZIZ
                        X.07Yb r0 = new X.07Yb
                        r0.<init>(r3)
                        r1.onNext(r0)
                    L95:
                        X.C1C7U.LIZIZ(r5)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1624580sNU.accept(java.lang.Object):void");
                }
            }, new AfS41S1100000_3(c093eH2, str, 6));
        }
    }

    public C1628850sUN(C1DRG c1drg, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625410sOp interfaceC1625410sOp) {
        this.LL = c1drg;
        this.LLILLJJLI = interfaceC1624480sNK;
        this.LLILLL = interfaceC1625410sOp;
        MutableLiveData<C0LCS<C1637080she>> mutableLiveData = new MutableLiveData<>();
        this.LLJ = mutableLiveData;
        this.LLJI = new MutableLiveData<>();
        this.LLJILJIL = mutableLiveData;
        this.LLJILJILJ = new C11NJ();
        this.LLJJ = "";
        this.LLJJIJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 662));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 663));
        this.LLJJIJIL = new AwS639S0100000_25(this, 84);
    }

    public final void W1(String str, String str2, String str3) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", getShortVideoContext().getCreationId());
        c0lab.LJ("shoot_way", getShortVideoContext().shootWay);
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("prop_id", str3);
        c0lab.LJ("music_id", str2);
        C20684815ws.LJIILLIIL(str, c0lab.LIZ);
    }

    public final void m3(Effect effect, EnumC1641420soe enumC1641420soe, Integer num) {
        if (effect != null) {
            c3().LIZJ(effect, enumC1641420soe, num, true);
        }
    }
}
