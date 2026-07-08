package X;

import X.C0DYC;
import X.C2188811AlT;
import X.C640750PBh;
import X.C650630PfZ;
import X.C661440Px0;
import X.C661490Px5;
import X.C661550PxB;
import X.C661850Pxf;
import X.C661880Pxi;
import X.C664400Q4g;
import Y.AObserverS214S0100000_10;
import Y.ARunnableS110S0100000_10;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.reflect.TypeToken;
import com.lynx.react.bridge.JavaOnlyMap;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.viewmodel.ISearchAwemePoolCompatParentAbility;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.SearchVideoForLynx$ability$1;
import com.ss.android.ugc.aweme.search.model.KeySegmentInfo;
import com.ss.android.ugc.aweme.search.model.SearchKeySegmentsInfo;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.sticker.IStickerService;
import com.zhiliaoapp.musically.R;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS61S1000000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Px0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C661440Px0 extends FrameLayout implements InterfaceC661680PxO, C0R9I, InterfaceC211600ri, C0PML {
    public final /* synthetic */ C650580PfU LL;
    public final /* synthetic */ C661800Pxa LLILLJJLI;
    public C661490Px5 LLILLL;
    public C0GZM LLILZ;
    public View LLILZIL;
    public ImageView LLILZLL;
    public C661850Pxf LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJILLL;
    public Integer LLJJ;
    public String LLJJI;
    public int LLJJIII;
    public View LLJJIJI;
    public final BPEAHandler LLJJIJIIJIL;
    public ARunnableS110S0100000_10 LLJJIJIL;
    public final long LLJJJ;
    public Integer LLJJJIL;
    public int LLJJJJ;
    public Function2<? super String, ? super Map<String, ? extends Object>, Unit> LLJJJJJIL;
    public Function1<? super Integer, Unit> LLJJJJLIIL;
    public String LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public int LLJLIL;
    public boolean LLJLILLLLZIIL;
    public s LLJLL;
    public final boolean LLJLLIL;
    public final boolean LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final long LLL;
    public Long LLLF;
    public final C01GW LLLFF;
    public final C661580PxE LLLFFI;
    public InterfaceC655270Pn3 LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C615240OBe LLLIIII;
    public String LLLIIIIL;
    public String LLLIIIL;
    public Map<String, ? extends Object> LLLIIL;
    public String LLLIILIL;
    public boolean LLLIL;
    public String LLLILZ;
    public ISearchAwemePoolCompatParentAbility LLLILZJ;
    public final SearchVideoForLynx$ability$1 LLLILZLLLI;
    public String LLLIZZ;
    public Map<String, ? extends Object> LLLJ;
    public InterfaceC665370Q7z LLLJIL;
    public int LLLJL;
    public long LLLL;
    public long LLLLII;
    public int LLLLIIIILLL;

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
    }

    @Override // X.InterfaceC662110Py5
    public final void LIZ() {
    }

    @Override // X.InterfaceC648270Pbl
    public final void LJJJJ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.InterfaceC661680PxO, X.InterfaceC648270Pbl
    public void LLJJJ() {
        UC(1);
        if (this.LLJILJIL) {
            LJJII();
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.InterfaceC661680PxO, X.InterfaceC648270Pbl
    public void LLLLLIL() {
        UC(2);
    }

    @Override // X.InterfaceC661680PxO, X.InterfaceC648270Pbl
    public final void LLLLLILLIL() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void LLZZZIL(C587060N0u c587060N0u) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void Mu(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean N1() {
        return true;
    }

    @Override // X.InterfaceC661680PxO, X.InterfaceC648270Pbl
    public final void O4() {
    }

    @Override // X.InterfaceC648350Pbt
    public View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public InterfaceC584630MwP getPreload() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public C0PCQ getPriority() {
        return null;
    }

    public final InterfaceC662020Pxw getVideoPlayerStatusListener() {
        return null;
    }

    @Override // X.C0PML
    public C661440Px0 getView() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C583620Mum.LIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean l2() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBrightnessChanged(String str, float f) {
        C583620Mum.LIZIZ(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
        C583620Mum.LIZJ(this, str, j, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
        C583620Mum.LIZLLL(this, str, j);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        C583620Mum.LJFF(this, str, z, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
        C583620Mum.LJII(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCrosstalkHappened(String str) {
        C583620Mum.LJIIIIZZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
        C583620Mum.LJIIIZ(this, str, list);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
        C583620Mum.LJIIJ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        C583620Mum.LJIIJJI(this, str, z, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
        C583620Mum.LJIILIIL(this, i, j, j2, map);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJIILJJIL(this, str, c1480420ocy);
    }

    @Override // X.InterfaceC661680PxO, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onLoopPlay(String str, int i) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
        C583620Mum.LJIILLIIL(this, str, c1480290ocl);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIJ(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C583620Mum.LJIJJ(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
        C583620Mum.LJJI(this, str, c1481290oeN, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPause(String str) {
        C583620Mum.LJJII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C583620Mum.LJJIIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
        C583620Mum.LJJIJIIJI(this, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
        C583620Mum.LJJIJIIJIL(this, str, jSONObject, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, boolean z) {
        C583620Mum.LJJIJIL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        C583620Mum.LJJIJL(this, str, i, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJIL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreRenderSessionMissed(String str) {
        C583620Mum.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJI(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C583620Mum.LJJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJJL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C1481290oeN c1481290oeN) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJL(this, str, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekEnd(String str, boolean z) {
        C583620Mum.LJJJJLL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekStart(String str, int i, float f) {
        C583620Mum.LJJJJZ(this, str, i, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
        C583620Mum.LJJJJZI(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onStopPlay(String str) {
        C583620Mum.LJJJLIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
        C583620Mum.LJJJLL(this, str, enumC2281141EQm, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSecondFrame(String str) {
        C583620Mum.LJJJLZIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C583620Mum.LJJJZ(this, str, i, i2);
    }

    @Override // X.InterfaceC648350Pbt
    public final void release() {
    }

    @Override // X.InterfaceC648350Pbt
    public void setPlayMetrics(C664400Q4g c664400Q4g) {
    }

    @Override // X.InterfaceC648350Pbt
    public void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
    }

    public final void setVideoPlayerStatusListener(InterfaceC662020Pxw interfaceC662020Pxw) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        return null;
    }

    private final String getCardName() {
        return (String) this.LLLFF.getValue();
    }

    private final C641040PCk getContainerStatusProvider() {
        return (C641040PCk) this.LLJZ.getValue();
    }

    private final ViewGroup getCoreParent() {
        return (ViewGroup) this.LLLI.getValue();
    }

    private final C651010PgB getImageMonitorListener() {
        return (C651010PgB) this.LLLII.getValue();
    }

    private final C689680R3m getMImageDisplayLighten() {
        return (C689680R3m) this.LLJZIJLIL.getValue();
    }

    private final C586970N0l getMPlayVideoHelper() {
        C661490Px5 c661490Px5 = this.LLILLL;
        if (c661490Px5 != null) {
            return c661490Px5.LJFF;
        }
        return null;
    }

    @Override // X.C0PML
    public final void LIZJ() {
        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
        if (iAwemeService != null) {
            iAwemeService.LLILLL(getMAweme());
        }
    }

    public final void LJ() {
        Aweme mAweme;
        Video video;
        Aweme mAweme2;
        Aweme mAweme3;
        Video video2;
        if (this.LLJILJILJ != null && C1202104n5.LIZ().LJIJJLI()) {
            C0GZM c0gzm = this.LLILZ;
            if (c0gzm != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gzm);
                c0gzm.setAlpha(1.0f);
            }
            C0GZM c0gzm2 = this.LLILZ;
            if (c0gzm2 == null || (mAweme2 = getMAweme()) == null || (mAweme3 = getMAweme()) == null || (video2 = mAweme3.getVideo()) == null) {
                return;
            }
            UrlModel originCover = video2.getOriginCover();
            if (originCover != null) {
                ArrayList arrayList = new ArrayList();
                List<String> urlList = originCover.getUrlList();
                if (urlList != null) {
                    for (String str : urlList) {
                        C1334210kp9.LIZIZ(str, EnumC1769850w9n.GENERAL_SEARCH_LYNX_VIDEO_COVER, null, null, false, false, null, null);
                        arrayList.add(str);
                    }
                }
                C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                ImageUrlModel imageUrlModel = new ImageUrlModel(originCover.getUri(), arrayList);
                c1326790kdB.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
                c1331670kl3LIZLLL.LIZLLL(getCardName());
                Integer numLIZJ = this.LLJJ;
                c1331670kl3LIZLLL.LJJIIZ((numLIZJ == null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bw, getContext())) == null) ? 0 : numLIZJ.intValue());
                c1331670kl3LIZLLL.LJJ(c0gzm2);
                c1331670kl3LIZLLL.LJJJIL = getImageMonitorListener();
                c1331670kl3LIZLLL.LJIIJ(getMImageDisplayLighten());
                return;
            }
            UrlModel cover = video2.getCover();
            if (cover == null && mAweme2.getImageInfos() != null && mAweme2.getImageInfos().size() > 1) {
                cover = ((ImageInfo) ListProtector.get(mAweme2.getImageInfos(), 0)).getLabelThumb();
            }
            ArrayList arrayList2 = new ArrayList();
            List<String> urlList2 = cover.getUrlList();
            if (urlList2 != null) {
                for (String str2 : urlList2) {
                    C1334210kp9.LIZIZ(str2, EnumC1769850w9n.GENERAL_SEARCH_LYNX_VIDEO_COVER, null, null, false, false, null, null);
                    arrayList2.add(str2);
                }
            }
            C1326790kdB c1326790kdB2 = C1326790kdB.LIZ;
            ImageUrlModel imageUrlModel2 = new ImageUrlModel(cover.getUri(), arrayList2);
            c1326790kdB2.getClass();
            C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(imageUrlModel2);
            c1331670kl3LIZLLL2.LIZLLL(getCardName());
            Integer numLIZJ2 = this.LLJJ;
            c1331670kl3LIZLLL2.LJJIIZ((numLIZJ2 == null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.bw, getContext())) == null) ? 0 : numLIZJ2.intValue());
            c1331670kl3LIZLLL2.LJJ(this.LLILZ);
            c1331670kl3LIZLLL2.LJJJIL = getImageMonitorListener();
            c1331670kl3LIZLLL2.LJIIJ(getMImageDisplayLighten());
            return;
        }
        C0GZM c0gzm3 = this.LLILZ;
        if (c0gzm3 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gzm3);
            c0gzm3.setAlpha(1.0f);
        }
        C0GZM c0gzm4 = this.LLILZ;
        if (c0gzm4 == null) {
            return;
        }
        if (C123100dR.LIZ(this.LLLIILIL)) {
            String str3 = this.LLLIILIL;
            if (str3 == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str3);
            c1331670kl3LJIIIZ.LIZLLL(getCardName());
            Integer numLIZJ3 = this.LLJJ;
            c1331670kl3LJIIIZ.LJJIIZ((numLIZJ3 == null && (numLIZJ3 = C1308910kAL.LIZJ(R.attr.bw, getContext())) == null) ? 0 : numLIZJ3.intValue());
            c1331670kl3LJIIIZ.LJJ(this.LLILZ);
            c1331670kl3LJIIIZ.LJJJIL = getImageMonitorListener();
            if (C284190BBx.LIZ()) {
                c1331670kl3LJIIIZ.LJJIII = EnumC1334360kpO.HIGH;
                c1331670kl3LJIIIZ.LJJIIZ = EnumC714850S2h.CUSTOM;
                c1331670kl3LJIIIZ.LJJJJJ = "search_cache";
            }
            c1331670kl3LJIIIZ.LJIIJ(getMImageDisplayLighten());
            this.LLLIL = true;
            return;
        }
        Aweme mAweme4 = getMAweme();
        if (mAweme4 == null || (mAweme = getMAweme()) == null || (video = mAweme.getVideo()) == null) {
            return;
        }
        UrlModel originCover2 = video.getOriginCover();
        if (originCover2 != null) {
            video.getHeight();
            video.getWidth();
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(originCover2));
            c1331670kl3LJIIIIZZ.LIZLLL(getCardName());
            Integer numLIZJ4 = this.LLJJ;
            c1331670kl3LJIIIIZZ.LJJIIZ((numLIZJ4 == null && (numLIZJ4 = C1308910kAL.LIZJ(R.attr.bw, getContext())) == null) ? 0 : numLIZJ4.intValue());
            c1331670kl3LJIIIIZZ.LJJ(c0gzm4);
            c1331670kl3LJIIIIZZ.LJJJIL = getImageMonitorListener();
            if (C284190BBx.LIZ()) {
                c1331670kl3LJIIIIZZ.LJJIII = EnumC1334360kpO.HIGH;
                c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.CUSTOM;
                c1331670kl3LJIIIIZZ.LJJJJJ = "search_cache";
            }
            c1331670kl3LJIIIIZZ.LJIIJ(getMImageDisplayLighten());
            return;
        }
        UrlModel cover2 = video.getCover();
        if (cover2 == null && mAweme4.getImageInfos() != null && mAweme4.getImageInfos().size() > 1) {
            cover2 = ((ImageInfo) ListProtector.get(mAweme4.getImageInfos(), 0)).getLabelThumb();
        }
        C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover2));
        c1331670kl3LJIIIIZZ2.LIZLLL(getCardName());
        Integer numLIZJ5 = this.LLJJ;
        c1331670kl3LJIIIIZZ2.LJJIIZ((numLIZJ5 == null && (numLIZJ5 = C1308910kAL.LIZJ(R.attr.bw, getContext())) == null) ? 0 : numLIZJ5.intValue());
        c1331670kl3LJIIIIZZ2.LJJ(this.LLILZ);
        c1331670kl3LJIIIIZZ2.LJJJIL = getImageMonitorListener();
        if (C284190BBx.LIZ()) {
            c1331670kl3LJIIIIZZ2.LJJIII = EnumC1334360kpO.HIGH;
            c1331670kl3LJIIIIZZ2.LJJIIZ = EnumC714850S2h.CUSTOM;
            c1331670kl3LJIIIIZZ2.LJJJJJ = "search_cache";
        }
        c1331670kl3LJIIIIZZ2.LJIIJ(getMImageDisplayLighten());
    }

    @Override // X.C0PML
    public void LJFF() {
        C661490Px5 c661490Px5 = this.LLILLL;
        if (c661490Px5 == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syncPlayerProgress dataProvider is not null !continueToPlay:[");
        sbLIZ.append(!this.LLJL);
        sbLIZ.append("], provider.player != null:[");
        sbLIZ.append(c661490Px5.LJIILIIL != null);
        sbLIZ.append("]， sharedInfo: ");
        sbLIZ.append(c661490Px5.LJ() == null);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJL && c661490Px5.LJIILIIL == null) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("syncPlayerProgress share data, aid: ");
        Aweme aweme = c661490Px5.LIZJ;
        sbLIZ2.append(aweme != null ? aweme.getAid() : null);
        C2188811AlT.LIZIZ(sbLIZ2);
        C661510Px7.LIZ.getClass();
        C661510Px7.LIZ(c661490Px5, true, false);
    }

    public final void LJI() {
        C653660PkS c653660PkS;
        C661850Pxf c661850Pxf = this.LLIZ;
        if (c661850Pxf != null) {
            C646200PWg.LJI(c661850Pxf);
        }
        if (this.LLJI) {
            C661490Px5 c661490Px5 = this.LLILLL;
            if (Intrinsics.LJFF("hot_user", (c661490Px5 == null || (c653660PkS = c661490Px5.LJIL) == null) ? null : c653660PkS.LJJII) || isPlaying()) {
                LJIIZILJ();
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(hashCode());
        sbLIZ.append(" unregister ");
        AbstractC653010PjP mScrollStateObserver = getMScrollStateObserver();
        sbLIZ.append(mScrollStateObserver != null ? mScrollStateObserver.hashCode() : 0);
        C2188811AlT.LIZIZ(sbLIZ);
        C652990PjN mScrollStateManager = getMScrollStateManager();
        if (mScrollStateManager != null) {
            mScrollStateManager.LJ(getMScrollStateObserver());
        }
    }

    public final void LJII() {
        Aweme mAweme;
        Video video;
        String str = this.LLJJI;
        if (str == null || str.length() == 0 || C123100dR.LIZ(this.LLLIILIL)) {
            LJ();
            return;
        }
        C0GZM c0gzm = this.LLILZ;
        if (c0gzm != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gzm);
            c0gzm.setAlpha(1.0f);
        }
        C0GZM c0gzm2 = this.LLILZ;
        if (c0gzm2 == null || (mAweme = getMAweme()) == null || (video = mAweme.getVideo()) == null) {
            return;
        }
        float height = video.getHeight() / video.getWidth();
        if (height >= 1.0f) {
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            String str2 = this.LLJJI;
            C1334210kp9.LIZIZ(str2, EnumC1769850w9n.SEARCH_PRODUCT, null, null, false, false, null, null);
            c1326790kdB.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str2);
            c1331670kl3LIZLLL.LIZLLL(getCardName());
            Integer numLIZJ = this.LLJJ;
            c1331670kl3LIZLLL.LJJIIZ((numLIZJ == null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bw, getContext())) == null) ? 0 : numLIZJ.intValue());
            c1331670kl3LIZLLL.LJJ(c0gzm2);
            c1331670kl3LIZLLL.LJIIJ(getMImageDisplayLighten());
            return;
        }
        ViewGroup.LayoutParams layoutParams = c0gzm2.getLayoutParams();
        int width = layoutParams.width;
        if (width <= 0) {
            width = getWidth() > 0 ? getWidth() : video.getWidth();
        }
        int i = (int) (width * height);
        layoutParams.width = width;
        layoutParams.height = i;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gzm2);
        c0gzm2.setLayoutParams(layoutParams);
        C1326790kdB c1326790kdB2 = C1326790kdB.LIZ;
        String str3 = this.LLJJI;
        C1334210kp9.LIZIZ(str3, EnumC1769850w9n.SEARCH_PRODUCT, null, null, false, false, null, null);
        c1326790kdB2.getClass();
        C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(str3);
        c1331670kl3LIZLLL2.LIZLLL(getCardName());
        c1331670kl3LIZLLL2.LJIIJJI = width;
        c1331670kl3LIZLLL2.LJIIL = i;
        Integer numLIZJ2 = this.LLJJ;
        c1331670kl3LIZLLL2.LJJIIZ((numLIZJ2 == null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.bw, getContext())) == null) ? 0 : numLIZJ2.intValue());
        c1331670kl3LIZLLL2.LJJ(c0gzm2);
        c1331670kl3LIZLLL2.LJIIJ(getMImageDisplayLighten());
    }

    public final void LJIIIZ() {
        ImageView imageView = this.LLILZLL;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        C0GZM c0gzm = this.LLILZ;
        if (c0gzm != null) {
            int visibility = c0gzm.getVisibility();
            c0gzm.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c0gzm);
        }
    }

    public final void LJIILJJIL() {
        Aweme aweme;
        Video video;
        C0N0Y c0n0y;
        C661490Px5 c661490Px5 = this.LLILLL;
        int currentPosition = (int) ((c661490Px5 == null || (c0n0y = c661490Px5.LJIILIIL) == null) ? 0L : c0n0y.getCurrentPosition());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("progress", Integer.valueOf(currentPosition));
        int i = this.LLJJJJ;
        int i2 = i >= 0 ? i : currentPosition;
        int duration = 0;
        if (i >= 0 && i <= currentPosition) {
            this.LLJJJJ = -1;
        }
        linkedHashMap.put("searchPlayTime", Integer.valueOf(i2));
        C661490Px5 c661490Px52 = this.LLILLL;
        if (c661490Px52 != null && (aweme = c661490Px52.LIZJ) != null && (video = aweme.getVideo()) != null) {
            duration = video.getDuration();
        }
        linkedHashMap.put("duration", Integer.valueOf(duration));
        LJIIL("timeupdate", linkedHashMap);
    }

    public final void LJJII() {
        ImageView imageView = this.LLILZLL;
        if (imageView != null) {
            C786410Ut5.LJZI(0, imageView);
        }
        C0GZM c0gzm = this.LLILZ;
        if (c0gzm != null) {
            int visibility = c0gzm.getVisibility();
            c0gzm.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c0gzm);
        }
    }

    public final void LJJIIJZLJL() {
        Map<String, ? extends Object> map = this.LLLIIL;
        Object obj = map != null ? map.get("aweme_id") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (getMAweme() != null) {
            Aweme mAweme = getMAweme();
            if (Intrinsics.LJFF(mAweme != null ? mAweme.getAid() : null, str)) {
                return;
            }
        }
        Aweme awemeLJFF = C651640PhC.LJFF(str);
        if (awemeLJFF != null) {
            LIZLLL(awemeLJFF);
            String aid = awemeLJFF.getAid();
            hashCode();
            if (aid != null) {
                C651670PhF.LIZ.put(aid, new WeakReference<>(this));
            }
        }
    }

    @Override // X.C0R9I
    public final AbsInteractStickerWidget c6() {
        WidgetManager widgetManagerOR;
        Context context;
        C662130Py7.LIZ.getClass();
        InteractStickerWidget interactStickerWidgetLIZ = ((IStickerService) ServiceManager.get().getService(IStickerService.class)).LIZ();
        if (C1835007Gq.LIZ()) {
            widgetManagerOR = WidgetManager.SR(getItemView(), getRootFragment());
        } else {
            C661490Px5 c661490Px5 = this.LLILLL;
            C19EG c19egLIZIZ = (c661490Px5 == null || (context = c661490Px5.getContext()) == null) ? null : C1388190mED.LIZIZ(context);
            widgetManagerOR = WidgetManager.OR(c19egLIZIZ, null, getItemView(), c19egLIZIZ);
        }
        if (widgetManagerOR != null) {
            widgetManagerOR.PR(R.id.kvf, interactStickerWidgetLIZ);
        }
        return interactStickerWidgetLIZ;
    }

    public final long getCurrentPosition() {
        C661850Pxf c661850Pxf = this.LLIZ;
        if (c661850Pxf != null) {
            return c661850Pxf.getPlayerCurrentPosition();
        }
        return -1L;
    }

    public final String getGecVodSceneTag() {
        if (C123100dR.LIZ(this.LLLIIIIL)) {
            return this.LLLIIIIL;
        }
        return null;
    }

    public final View getItemView() {
        C661490Px5 c661490Px5 = this.LLILLL;
        if (c661490Px5 != null) {
            return c661490Px5.LIZ;
        }
        return null;
    }

    public final Aweme getMAweme() {
        C661490Px5 c661490Px5 = this.LLILLL;
        if (c661490Px5 != null) {
            return c661490Px5.LIZJ;
        }
        return null;
    }

    public final C652990PjN getMScrollStateManager() {
        C661490Px5 c661490Px5 = this.LLILLL;
        if (c661490Px5 != null) {
            return c661490Px5.LJIIIIZZ;
        }
        return null;
    }

    public final AbstractC653010PjP getMScrollStateObserver() {
        C661490Px5 c661490Px5 = this.LLILLL;
        if (c661490Px5 != null) {
            return c661490Px5.LJIIIZ;
        }
        return null;
    }

    public final ISearchAwemePoolCompatParentAbility getParentAbility() {
        InterfaceC665370Q7z interfaceC665370Q7zLIZJ = C1558360qeg.LIZJ(this, "search-list-player", 2);
        if (interfaceC665370Q7zLIZJ != null) {
            return (ISearchAwemePoolCompatParentAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZJ, ISearchAwemePoolCompatParentAbility.class, null);
        }
        return null;
    }

    public final String getPlayTag() {
        if (C123100dR.LIZ(this.LLLIIIL)) {
            return this.LLLIIIL;
        }
        return null;
    }

    public final long getProgress() {
        C661850Pxf c661850Pxf = this.LLIZ;
        if (c661850Pxf != null) {
            return c661850Pxf.getCurrentPosition();
        }
        return -1L;
    }

    public final Fragment getRootFragment() {
        return (Fragment) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        C661850Pxf c661850Pxf = this.LLIZ;
        if (c661850Pxf != null) {
            return c661850Pxf.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC661680PxO
    public final void zU() {
        C661550PxB c661550PxBLJ;
        C661490Px5 c661490Px5 = this.LLILLL;
        if (c661490Px5 == null || (c661550PxBLJ = c661490Px5.LJ()) == null || c661550PxBLJ.LJFF == null) {
            C661490Px5 c661490Px52 = this.LLILLL;
            if (c661490Px52 == null || c661490Px52.LJIILIIL == null) {
                LJJII();
            }
        }
    }

    public final void LIZIZ() {
        AbstractC653010PjP mScrollStateObserver;
        DynamicPatch dynamicPatch;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("attachAutoData aid ");
        Aweme mAweme = getMAweme();
        sbLIZ.append(mAweme != null ? mAweme.getAid() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJI) {
            C649040Pd0 c649040Pd0LIZ = C647140PZw.LIZ.LIZ(this.LLJ);
            String str = (c649040Pd0LIZ == null || (dynamicPatch = c649040Pd0LIZ.LIZ) == null) ? null : dynamicPatch.schema;
            if (C648050PbP.LIZ(str)) {
                C660180Puy.LIZ(this);
                setMScrollStateManager(null);
                C661490Px5 c661490Px5 = this.LLILLL;
                if ((c661490Px5 != null ? c661490Px5.LJI : null) instanceof C646220PWi) {
                    (c661490Px5 != null ? c661490Px5.LJI : null).getClass();
                }
                if (this.LLIZ != null) {
                    C649470Pdh.LIZ.getClass();
                    if (!C649470Pdh.LJIIZILJ(str)) {
                        C646200PWg.LJFF(this.LLIZ);
                    }
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(hashCode());
                sbLIZ2.append(" register ");
                AbstractC653010PjP mScrollStateObserver2 = getMScrollStateObserver();
                sbLIZ2.append(mScrollStateObserver2 != null ? mScrollStateObserver2.hashCode() : 0);
                C2188811AlT.LIZIZ(sbLIZ2);
                C652990PjN mScrollStateManager = getMScrollStateManager();
                if (mScrollStateManager == null || (mScrollStateObserver = getMScrollStateObserver()) == null) {
                    return;
                }
                mScrollStateObserver.LIZ = 0;
                mScrollStateObserver.LIZIZ = false;
                mScrollStateObserver.LIZIZ();
                mScrollStateManager.LIZIZ.add(mScrollStateObserver);
            }
        }
    }

    public final void LJIIJ() {
        if ((getWidth() == 0 || getHeight() == 0) && (getLayoutParams() == null || getLayoutParams().width == 0 || getLayoutParams().height == 0)) {
            C786410Ut5.y3(getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.0PxM
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    this.LL.LJII();
                    C786410Ut5.D3(this.LL.getViewTreeObserver(), this);
                    return true;
                }
            });
        } else {
            LJII();
        }
        LJJII();
        View view = this.LLILZIL;
        if (view != null) {
            C10IT c10it = C10IT.LIZ;
            Aweme mAweme = getMAweme();
            c10it.getClass();
            C786410Ut5.LJLLLLLL(C10IT.LJIIL(mAweme) ? 0 : 8, view);
        }
    }

    public final void LJIILL() {
        Fragment fragmentLIZLLL = C651580Ph6.LIZLLL(this);
        SAFHelper sAFHelper = SAFHelper.LIZ;
        InterfaceC214902198i interfaceC214902198i = null;
        if (fragmentLIZLLL != null) {
            Context context = fragmentLIZLLL.getContext();
            ComponentCallbacks2 componentCallbacks2LJFF = context != null ? SAFExtensionKt.LJFF(context) : null;
            if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                Fragment parentFragment = fragmentLIZLLL;
                while (true) {
                    if (!(parentFragment instanceof InterfaceC214902198i)) {
                        parentFragment = parentFragment.getParentFragment();
                        if (parentFragment == null) {
                            break;
                        }
                    } else {
                        interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                        break;
                    }
                }
            }
        }
        sAFHelper.getClass();
        Activity activityLJIIIIZZ = SAFHelper.LJIIIIZZ(interfaceC214902198i);
        SAFHelper sAFHelper2 = SAFHelper.LIZ;
        sAFHelper2.getClass();
        if ((SAFHelper.LJIIJJI() && (fragmentLIZLLL == null || fragmentLIZLLL.getActivity() == null)) || activityLJIIIIZZ == null || !(activityLJIIIIZZ instanceof C19EG)) {
            return;
        }
        C19EG c19eg = (C19EG) activityLJIIIIZZ;
        sAFHelper2.getClass();
        LifecycleOwner lifecycleOwnerLJJI = SAFHelper.LJJI(fragmentLIZLLL, c19eg);
        if (lifecycleOwnerLJJI == null) {
            return;
        }
        C666210QBf.LIZ(fragmentLIZLLL, c19eg).LLIZLLLIL.observe(lifecycleOwnerLJJI, new AObserverS214S0100000_10(this, 22));
    }

    public void LJIIZILJ() {
        C658950Psz c658950Psz;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pause:");
        Aweme mAweme = getMAweme();
        sbLIZ.append(mAweme != null ? mAweme.getAid() : null);
        sbLIZ.append(" @");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
        C661490Px5 c661490Px5 = this.LLILLL;
        if (c661490Px5 == null || (c658950Psz = c661490Px5.LJIIJ) == null) {
            return;
        }
        c658950Psz.LLJJJ();
    }

    public void LJIJI() {
        C658950Psz c658950Psz;
        C661550PxB c661550PxBLJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("play:");
        Aweme mAweme = getMAweme();
        sbLIZ.append(mAweme != null ? mAweme.getAid() : null);
        sbLIZ.append(" @");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
        if (getMAweme() == null) {
            this.LLJLILLLLZIIL = true;
        }
        C661490Px5 c661490Px5 = this.LLILLL;
        if (c661490Px5 != null && (c661550PxBLJ = c661490Px5.LJ()) != null && c661550PxBLJ.LIZIZ == 3) {
            c661550PxBLJ.LIZIZ = 0;
        }
        C655640Pne c655640Pne = C655650Pnf.LIZ;
        Aweme mAweme2 = getMAweme();
        C661490Px5 c661490Px52 = this.LLILLL;
        c655640Pne.LIZ(mAweme2, c661490Px52 != null ? c661490Px52.LJIIJ : null, this.LLJI, EnumC651030PgD.STOP_OTHER);
        LJJ(this, this);
        C661490Px5 c661490Px53 = this.LLILLL;
        if (c661490Px53 == null || (c658950Psz = c661490Px53.LJIIJ) == null) {
            return;
        }
        c658950Psz.u4(150L);
    }

    public final void LJJIII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop:");
        Aweme mAweme = getMAweme();
        sbLIZ.append(mAweme != null ? mAweme.getAid() : null);
        sbLIZ.append(" @");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
        LJJII();
        C655650Pnf.LIZ.LIZ(null, null, this.LLJI, EnumC651030PgD.STOP_OTHER);
    }

    @Override // X.InterfaceC211600ri
    public String getAuthorId() {
        String authorUid;
        Aweme mAweme = getMAweme();
        return (mAweme == null || (authorUid = AwemeExtKt.getAuthorUid(mAweme)) == null) ? "" : authorUid;
    }

    public Aweme getAwemeStruct() {
        return getMAweme();
    }

    @Override // X.InterfaceC648350Pbt
    public String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    @Override // X.InterfaceC211600ri
    public String getGroupId() {
        String aid;
        Aweme mAweme = getMAweme();
        return (mAweme == null || (aid = mAweme.getAid()) == null) ? "" : aid;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        String aid;
        LifecycleOwner lifecycleOwnerLJJII;
        ICreativeSAAService iCreativeSAAService;
        C661490Px5 c661490Px5;
        this.LLLJIL = C641100PCq.LIZIZ(this);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAttachedToWindow:");
        Aweme mAweme = getMAweme();
        sbLIZ.append(mAweme != null ? mAweme.getAid() : null);
        sbLIZ.append(", searchAutoplayableVScope: ");
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLLJIL;
        sbLIZ.append(interfaceC665370Q7z != null ? interfaceC665370Q7z.hashCode() : 0);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC665370Q7z interfaceC665370Q7z2 = this.LLLJIL;
        if (interfaceC665370Q7z2 != null) {
            C1558520qew.LJII(interfaceC665370Q7z2, this.LLLILZLLLI, SearchServiceCenter$AutoPlayAbility.class, null, null);
        }
        this.LLIZLLLIL = true;
        this.LLLL = SystemClock.uptimeMillis();
        super.onAttachedToWindow();
        LJIIL("attached", new HashMap());
        EventBus.LIZLLL().LJIJJ(this);
        if (C647140PZw.LIZ.LIZ(this.LLJ) != null && (c661490Px5 = this.LLILLL) != null) {
            c661490Px5.LIZLLL();
        }
        ConcurrentHashMap<String, WeakReference<C653660PkS>> concurrentHashMap = C666560QCo.LJIJJ;
        Aweme mAweme2 = getMAweme();
        if (mAweme2 == null || (aid = mAweme2.getAid()) == null) {
            aid = "";
        }
        C661490Px5 c661490Px52 = this.LLILLL;
        concurrentHashMap.put(aid, new WeakReference<>(c661490Px52 != null ? c661490Px52.LJIL : null));
        if (isPlaying()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("aid ");
            Aweme mAweme3 = getMAweme();
            sbLIZ2.append(mAweme3 != null ? mAweme3.getAid() : null);
            sbLIZ2.append(" is playing");
            C2188811AlT.LIZIZ(sbLIZ2);
            LJIJI();
        } else {
            LJJII();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("aid ");
            Aweme mAweme4 = getMAweme();
            sbLIZ3.append(mAweme4 != null ? mAweme4.getAid() : null);
            sbLIZ3.append(" not is playing");
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        LIZIZ();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
        if (c19egLIZIZ == null || (iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null)) == null || (lifecycleOwnerLJJII = iCreativeSAAService.getCreativeLifecycleOwner(c19egLIZIZ)) == null) {
            SAFHelper sAFHelper = SAFHelper.LIZ;
            C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(getContext());
            sAFHelper.getClass();
            lifecycleOwnerLJJII = SAFHelper.LJJII(this, c19egLIZIZ2);
        }
        InterfaceC655270Pn3 interfaceC655270Pn3 = lifecycleOwnerLJJII instanceof InterfaceC655270Pn3 ? (InterfaceC655270Pn3) lifecycleOwnerLJJII : null;
        this.LLLFZ = interfaceC655270Pn3;
        if (interfaceC655270Pn3 != null) {
            interfaceC655270Pn3.registerActivityOnKeyDownListener(this.LLLFFI);
        }
        C036E.LIZ.LIZ(this.LLLIIII);
        this.LL.LIZ(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDetachedFromWindow:");
        Aweme mAweme = getMAweme();
        sbLIZ.append(mAweme != null ? mAweme.getAid() : null);
        sbLIZ.append(" @");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
        LJIIL("stop", new HashMap());
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLLJIL;
        if (interfaceC665370Q7z != null && C1558520qew.LIZ(interfaceC665370Q7z, SearchServiceCenter$AutoPlayAbility.class, null) == this.LLLILZLLLI) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, SearchServiceCenter$AutoPlayAbility.class, null);
        }
        super.onDetachedFromWindow();
        LJIIL("detached", new HashMap());
        this.LLIZLLLIL = false;
        this.LLLJL = -1;
        this.LLLLII = 0L;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onDetachedFromWindow aid:");
        Aweme mAweme2 = getMAweme();
        sbLIZ2.append(mAweme2 != null ? mAweme2.getAid() : null);
        C2188811AlT.LIZIZ(sbLIZ2);
        LJI();
        EventBus.LIZLLL().LJJI(this);
        InterfaceC655270Pn3 interfaceC655270Pn3 = this.LLLFZ;
        if (interfaceC655270Pn3 != null) {
            interfaceC655270Pn3.unRegisterActivityOnKeyDownListener(this.LLLFFI);
        }
        this.LLLFZ = null;
        C036E.LIZ.LIZLLL(this.LLLIIII);
        C661850Pxf c661850Pxf = this.LLIZ;
        if (c661850Pxf != null) {
            c661850Pxf.LJJIIZ();
        }
    }

    @Override // X.InterfaceC648350Pbt
    @InterfaceC1294060jmO
    public final View p0() {
        return C655580PnY.LIZIZ(this);
    }

    @Override // X.InterfaceC648270Pbl
    public final View LJJIIJ() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        C655580PnY.LIZJ(this);
    }

    public final C661850Pxf getCore() {
        return this.LLIZ;
    }

    public final C661490Px5 getDataProvider() {
        return this.LLILLL;
    }

    public final ImageView getMCoverBackground() {
        return this.LLILZLL;
    }

    public final C0GZM getMCoverView() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC211600ri
    public Map<String, Object> getOriginLogExtra() {
        return this.LLLJ;
    }

    public final String getSearchAdCacheKey() {
        return this.LLLILZ;
    }

    @Override // X.InterfaceC211600ri
    public String getSessionIdStr() {
        return this.LLLIZZ;
    }

    @Override // X.C0PML
    public /* bridge */ /* synthetic */ View getView() {
        getView();
        return this;
    }

    public static Aweme LJIILLIIL(String str) {
        if (str != null && str.length() != 0) {
            return (Aweme) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), str, new TypeToken<Aweme>() { // from class: X.0PxL
            }.getType());
        }
        return null;
    }

    private final void setMAweme(Aweme aweme) {
        C661490Px5 c661490Px5 = this.LLILLL;
        if (c661490Px5 != null) {
            c661490Px5.LIZJ = aweme;
        }
    }

    public void LIZLLL(Aweme aweme) {
        int secondStart;
        List<KeySegmentInfo> keySegmentInfos;
        KeySegmentInfo keySegmentInfo;
        C661720PxS c661720PxSLIZ = C661630PxJ.LIZ(aweme.getAid());
        C661490Px5 c661490Px5 = this.LLILLL;
        String str = "";
        if (c661490Px5 != null) {
            C653660PkS c653660PkS = c661490Px5.LJIL;
        }
        c661720PxSLIZ.getClass();
        if (!Intrinsics.LJFF(c661720PxSLIZ, C661810Pxb.LIZ)) {
            System.currentTimeMillis();
            c661720PxSLIZ.getClass();
        }
        ConcurrentHashMap<String, WeakReference<C653660PkS>> concurrentHashMap = C666560QCo.LJIJJ;
        String aid = aweme.getAid();
        if (aid != null) {
            str = aid;
        }
        C661490Px5 c661490Px52 = this.LLILLL;
        C653660PkS c653660PkS2 = null;
        if (c661490Px52 != null) {
            c653660PkS2 = c661490Px52.LJIL;
        }
        concurrentHashMap.put(str, new WeakReference<>(c653660PkS2));
        setMAweme(aweme);
        SearchKeySegmentsInfo keySegmentsInfo = aweme.getKeySegmentsInfo();
        if (keySegmentsInfo != null && (keySegmentInfos = keySegmentsInfo.getKeySegmentInfos()) != null && (keySegmentInfo = (KeySegmentInfo) C13LP.LJJJLL(keySegmentInfos)) != null) {
            secondStart = keySegmentInfo.getSecondStart();
        } else {
            secondStart = 0;
        }
        this.LLJLIL = secondStart;
        if (C07EA.LIZ()) {
            C661850Pxf c661850Pxf = this.LLIZ;
            if (c661850Pxf != null) {
                c661850Pxf.setGecVodSceneTag(getGecVodSceneTag());
            }
            C661850Pxf c661850Pxf2 = this.LLIZ;
            if (c661850Pxf2 != null) {
                c661850Pxf2.setPlayTag(getPlayTag());
            }
        }
        C661850Pxf c661850Pxf3 = this.LLIZ;
        if (c661850Pxf3 != null) {
            c661850Pxf3.LJJ(aweme);
        }
        if (getMAweme() != null && getMAweme() != null) {
            if (!this.LLLIL) {
                LJIIJ();
            }
            C1524805y2.LIZIZ(0L, new AwS554S0100000_10(this, 1191));
        }
        if (this.LLJLILLLLZIIL) {
            LJIJI();
        }
    }

    @Override // X.C0PML
    public final boolean LJIIIIZZ(String str) {
        Aweme aweme;
        String aid;
        C661490Px5 c661490Px5 = this.LLILLL;
        if (c661490Px5 == null || (aweme = c661490Px5.LIZJ) == null || (aid = aweme.getAid()) == null || !aid.equals(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJJI(android.content.Context r8) {
        /*
            r7 = this;
            r6 = 1
            if (r8 != 0) goto L4
            return r6
        L4:
            X.19EG r4 = X.C1388190mED.LIZIZ(r8)
            if (r4 != 0) goto Lb
            return r6
        Lb:
            android.content.Context r0 = r7.getContext()
            X.0JEh r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJII(r0)
            r5 = 0
            if (r0 == 0) goto L23
            X.198i r3 = r0.LIZLLL()
            if (r3 == 0) goto L23
        L1c:
            boolean r0 = X.C651290Pgd.LJIIIZ(r4, r3)
            if (r0 == 0) goto L87
            return r5
        L23:
            android.content.Context r0 = r7.getContext()
            android.app.Activity r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            r3 = 0
            if (r0 == 0) goto L4e
            android.content.Context r0 = r7.getContext()
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L41
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L4e
            goto L1c
        L41:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L1c
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L4e
            goto L1c
        L4e:
            androidx.fragment.app.Fragment r2 = X.C946803n0.LIZ(r7)
            if (r2 == 0) goto L1c
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L69
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L5e:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L6b
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L7a
            goto L1c
        L69:
            r1 = r3
            goto L5e
        L6b:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L1c
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L7a
            goto L1c
        L78:
            if (r2 == 0) goto L1c
        L7a:
            boolean r0 = r2 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L82
            r3 = r2
            X.198i r3 = (X.InterfaceC214902198i) r3
            goto L1c
        L82:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L78
        L87:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C661440Px0.LJIIJJI(android.content.Context):boolean");
    }

    public final void LJIJ(int i) {
        C659080PtC.LIZJ(i);
        boolean z = false;
        if (i == 0) {
            C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
            if (c2174741A9g.LJIILJJIL()) {
                C659080PtC.LIZ = false;
                c2174741A9g.LJIILL("general_search", EnumC655500PnQ.CLICK_UNMUTE_BUTTON, C0SVP.STYLE_NO_BUTTON);
            }
        }
        C661850Pxf c661850Pxf = this.LLIZ;
        if (c661850Pxf != null) {
            if (i == 1) {
                z = true;
            }
            c661850Pxf.setMute(z);
        }
    }

    public void LJIJJLI(EnumC651030PgD enumC651030PgD) {
        C658950Psz c658950Psz;
        C661550PxB c661550PxBLJ;
        Aweme mAweme = getMAweme();
        if (mAweme != null) {
            mAweme.getAid();
        }
        C661490Px5 c661490Px5 = this.LLILLL;
        C658950Psz c658950Psz2 = null;
        if (c661490Px5 != null && (c661550PxBLJ = c661490Px5.LJ()) != null && c661550PxBLJ.LIZIZ == 3) {
            c661550PxBLJ.LIZIZ = 0;
        }
        C655640Pne c655640Pne = C655650Pnf.LIZ;
        Aweme mAweme2 = getMAweme();
        C661490Px5 c661490Px52 = this.LLILLL;
        if (c661490Px52 != null) {
            c658950Psz2 = c661490Px52.LJIIJ;
        }
        c655640Pne.LIZ(mAweme2, c658950Psz2, this.LLJI, enumC651030PgD);
        LJJ(this, this);
        C661490Px5 c661490Px53 = this.LLILLL;
        if (c661490Px53 != null && (c658950Psz = c661490Px53.LJIIJ) != null) {
            c658950Psz.u4(150L);
        }
    }

    public final void LJIL(int i) {
        C661850Pxf c661850Pxf;
        if (i != -1 && (c661850Pxf = this.LLIZ) != null) {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            c661850Pxf.setMute(z);
        }
    }

    public final void LJJIFFI(boolean z) {
        SearchKeySegmentsInfo keySegmentsInfo;
        List<KeySegmentInfo> keySegmentInfos;
        Aweme mAweme = getMAweme();
        boolean z2 = false;
        if (mAweme != null && (keySegmentsInfo = mAweme.getKeySegmentsInfo()) != null && (keySegmentInfos = keySegmentsInfo.getKeySegmentInfos()) != null && (!keySegmentInfos.isEmpty()) && C1111604Wk.LIZ()) {
            z2 = true;
        }
        int i = this.LLJLIL;
        if (i > 0 && z2) {
            int i2 = i * LSPassThroughRecordSizeConfig.DEFAULT;
            if (getCurrentPosition() < i2 || z) {
                LJJI(i2, true);
            }
        }
    }

    public final void UC(int i) {
        int i2;
        C661490Px5 c661490Px5;
        C0N0Y c0n0y;
        C661490Px5 c661490Px52;
        C0N0Y c0n0y2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        LJIIL("stop", new HashMap());
                        return;
                    }
                    return;
                }
                LJIIL("loading", new HashMap());
                return;
            }
            if ((!TextUtils.equals(this.LLJJL, "pause")) && this.LLJJIII > 0 && (c661490Px52 = this.LLILLL) != null && (c0n0y2 = c661490Px52.LJIILIIL) != null) {
                c0n0y2.LJJIIZI();
            }
            LJIIL("pause", new HashMap());
            return;
        }
        if ((!TextUtils.equals(this.LLJJL, "play")) && (i2 = this.LLJJIII) > 0 && (c661490Px5 = this.LLILLL) != null && (c0n0y = c661490Px5.LJIILIIL) != null) {
            c0n0y.LJJIJIIJI(i2);
        }
        C661850Pxf c661850Pxf = this.LLIZ;
        if (c661850Pxf != null) {
            boolean z = C659080PtC.LIZ;
            c661850Pxf.setMute(C659080PtC.LIZ(this.LLLLIIIILLL, 0, getMAweme()));
        }
        Function1<? super Integer, Unit> function1 = this.LLJJJJLIIL;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
        C659080PtC.LJFF();
        LJIIL("play", C2097608Jq.LJI(new Pair("muted", Integer.valueOf(C659080PtC.LIZIZ))));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        int i;
        String aid;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        UC(i);
        if (getMAweme() != null) {
            Object[] objArr = new Object[2];
            Aweme mAweme = getMAweme();
            if (mAweme != null) {
                aid = mAweme.getAid();
            } else {
                aid = null;
            }
            objArr[0] = aid;
            objArr[1] = Boolean.valueOf(z);
            C786410Ut5.j4("onBuffering: sourceId=%s, start=%s", Arrays.copyOf(objArr, 2));
        }
    }

    @Override // X.InterfaceC661680PxO, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        this.LLLLII = 0L;
        UC(1);
        if (this.LLJLLL) {
            LJJII();
        }
    }

    @Override // X.InterfaceC661680PxO, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str) {
        this.LLJILLL = false;
        LJIIL("ended", new HashMap());
        LJJIFFI(true);
    }

    @Override // X.InterfaceC661680PxO, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        C661850Pxf c661850Pxf = this.LLIZ;
        if (c661850Pxf != null && c661850Pxf.getRepeat()) {
            return;
        }
        LJJII();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C1481290oeN c1481290oeN) {
        UC(1);
        LJIIL("error", C2097608Jq.LJI(new Pair("error", String.valueOf(c1481290oeN))));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        C661850Pxf c661850Pxf;
        boolean z = C659080PtC.LIZ;
        if (C659080PtC.LIZ(this.LLLLIIIILLL, 0, getMAweme()) && (c661850Pxf = this.LLIZ) != null) {
            c661850Pxf.setMute(true);
        }
        UC(2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
        if (this.LLJLLIL) {
            LJJII();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        this.LLLLII = 0L;
        this.LLJILLL = false;
        if (!this.LLJLLIL) {
            LJJII();
        }
        UC(5);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        if (this.LLLLII == 0) {
            this.LLLLII = SystemClock.uptimeMillis();
        }
        this.LLJILLL = true;
        if (((Boolean) C271330AkF.LIZ.getValue()).booleanValue()) {
            UC(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        C661850Pxf c661850Pxf;
        boolean z = C659080PtC.LIZ;
        if (C659080PtC.LIZ(this.LLLLIIIILLL, 0, getMAweme()) && (c661850Pxf = this.LLIZ) != null) {
            c661850Pxf.setMute(true);
        }
        UC(2);
    }

    @C14EU
    public final void onReceiveBrandZoneAwemeListMerge(C2041507zB c2041507zB) {
        String aid;
        C661490Px5 c661490Px5;
        String str = c2041507zB.LIZ;
        if (!LJIIJJI(getContext()) && !TextUtils.isEmpty(str)) {
            Aweme mAweme = getMAweme();
            if (mAweme != null) {
                aid = mAweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid, str) && Intrinsics.LJFF(this.LLLILZ, c2041507zB.LIZJ) && (c661490Px5 = this.LLILLL) != null) {
                C661510Px7.LIZ.getClass();
                C661510Px7.LIZ(c661490Px5, true, true);
            }
        }
    }

    @C14EU
    public final void onReceiveLynxOpenGeneralizedSingleVideoEvent(AnonymousClass0344 anonymousClass0344) {
        C661490Px5 c661490Px5;
        if (!LJIIJJI(getContext()) && !TextUtils.isEmpty(anonymousClass0344.LIZ) && (c661490Px5 = this.LLILLL) != null) {
            C661510Px7.LIZ.getClass();
            C661510Px7.LIZ(c661490Px5, true, false);
        }
    }

    @C14EU
    public final void onReceiveSingleVideoEnterDetail(C2037607yY c2037607yY) {
        C661490Px5 c661490Px5;
        if (!LJIIJJI(getContext()) && !TextUtils.isEmpty(c2037607yY.LIZ) && (c661490Px5 = this.LLILLL) != null) {
            C661510Px7.LIZ.getClass();
            C661510Px7.LIZ(c661490Px5, true, false);
        }
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onReceiveSingleVideoExitDetail(C0NCL c0ncl) {
        Aweme aweme;
        String aid;
        C661490Px5 c661490Px5;
        InterfaceC641090PCp interfaceC641090PCp;
        EventBus.LIZLLL().LJIL(c0ncl);
        if (!LJIIJJI(getContext()) && (aweme = c0ncl.LIZ) != null && (aid = aweme.getAid()) != null && aid.length() != 0 && Intrinsics.LJFF(AwemeBizExtKt.getSearchFeedType(aweme), "SearchFeaturedAnswer") && (c661490Px5 = this.LLILLL) != null && (interfaceC641090PCp = c661490Px5.LJII) != null) {
            String strLIZ = C0P7S.LIZ(interfaceC641090PCp.getIdentifier(), aweme.getAid());
            C661510Px7 c661510Px7 = C661510Px7.LIZ;
            boolean z = !c0ncl.LIZIZ;
            long j = c0ncl.LIZJ;
            long j2 = c0ncl.LIZLLL;
            c661510Px7.getClass();
            C661510Px7.LIZJ(j, j2, aweme, strLIZ, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        if (c1480420ocy != null) {
            c1480420ocy.getSourceId();
        }
        LJJIFFI(false);
        LJIIIZ();
        C584080MvW.LIZ();
        UC(0);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C1480430ocz c1480430ocz) {
        String aid;
        UC(0);
        if (getMAweme() != null) {
            Object[] objArr = new Object[2];
            Aweme mAweme = getMAweme();
            if (mAweme != null) {
                aid = mAweme.getAid();
            } else {
                aid = null;
            }
            objArr[0] = aid;
            objArr[1] = Long.valueOf(c1480430ocz.LIZJ);
            C786410Ut5.j4("onRenderReady: preload, sourceId=%s, duration=%d", Arrays.copyOf(objArr, 2));
        }
    }

    @Override // X.InterfaceC661680PxO, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        C0N0Y c0n0y;
        C661850Pxf c661850Pxf = this.LLIZ;
        if (c661850Pxf != null && c661850Pxf.isPlaying()) {
            LJIIIZ();
        }
        UC(0);
        C586970N0l mPlayVideoHelper = getMPlayVideoHelper();
        if (mPlayVideoHelper != null && (c0n0y = mPlayVideoHelper.LJI) != null) {
            c0n0y.getDuration();
        }
        C586970N0l mPlayVideoHelper2 = getMPlayVideoHelper();
        if (mPlayVideoHelper2 != null) {
            mPlayVideoHelper2.LIZLLL();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (!this.LLJIJIL) {
            return;
        }
        if (this.LLJILLL && i == 0) {
            LJIJI();
        } else {
            LJIIZILJ();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void searchShopTabVisible(C2037507yX c2037507yX) {
        if (!this.LLJIJIL) {
            return;
        }
        if (this.LLJILLL && c2037507yX.LIZ) {
            LJIJI();
        } else {
            LJIIZILJ();
        }
    }

    public void setAutoPlay(boolean z) {
        if (this.LLJI == z) {
            return;
        }
        this.LLJI = z;
        C661490Px5 c661490Px5 = this.LLILLL;
        if (c661490Px5 != null) {
            c661490Px5.LJIIJJI = z;
        }
        if (z) {
            LIZIZ();
        } else {
            LJI();
        }
    }

    public void setAweme(String str) {
        Aweme awemeLJIILLIIL = LJIILLIIL(str);
        if (awemeLJIILLIIL != null) {
            if (getMAweme() == null || !Intrinsics.LJFF(getMAweme().getAid(), awemeLJIILLIIL.getAid())) {
                LIZLLL(awemeLJIILLIIL);
            }
        }
    }

    public void setAwemeData(String str) {
        Aweme awemeLJIILLIIL = LJIILLIIL(str);
        if (awemeLJIILLIIL != null) {
            LIZLLL(awemeLJIILLIIL);
        }
    }

    public void setAwemeIdentifier(Map<String, ? extends Object> map) {
        String str;
        this.LLLIIL = map;
        s sVar = this.LLJLL;
        if (sVar == null || (str = sVar.LLJJIII) == null) {
            str = "";
        }
        if (C1903607cw.LIZ(str)) {
            LJJIIJZLJL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013c A[LOOP:0: B:75:0x0128->B:82:0x013c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x005d A[EDGE_INSN: B:90:0x005d->B:20:0x005d BREAK  A[LOOP:0: B:75:0x0128->B:82:0x013c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAwemeIndex(X.C661690PxP r10) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C661440Px0.setAwemeIndex(X.0PxP):void");
    }

    public final void setCore(C661850Pxf c661850Pxf) {
        this.LLIZ = c661850Pxf;
    }

    public final void setCoverPlaceholder(int i) {
        this.LLJJ = Integer.valueOf(i);
    }

    public final void setDataProvider(C661490Px5 c661490Px5) {
        this.LLILLL = c661490Px5;
    }

    public void setEcomTokenType(String str) {
        if (C07EA.LIZ() && C123100dR.LIZ(str)) {
            this.LLLIIIIL = "gec_general_search_video_lynx";
            this.LLLIIIL = "search_outer_general";
        }
        this.LLJILJILJ = str;
    }

    public void setEventChangeListener(Function2<? super String, ? super Map<String, ? extends Object>, Unit> function2) {
        this.LLJJJJJIL = function2;
    }

    public final void setGecVodSceneTag(String str) {
        this.LLLIIIIL = str;
    }

    public final void setIsECommerce(boolean z) {
        this.LLJIJIL = z;
    }

    public void setLogExtra(HashMap<String, Object> map) {
        String str;
        C661490Px5 c661490Px5;
        C653660PkS c653660PkS;
        C661490Px5 c661490Px52;
        C653660PkS c653660PkS2;
        C661490Px5 c661490Px53;
        C653660PkS c653660PkS3;
        C661490Px5 c661490Px54;
        C653660PkS c653660PkS4;
        C661490Px5 c661490Px55;
        C661490Px5 c661490Px56;
        C653660PkS c653660PkS5;
        C661490Px5 c661490Px57;
        C653660PkS c653660PkS6;
        C661490Px5 c661490Px58;
        C653660PkS c653660PkS7;
        C661490Px5 c661490Px59;
        C653660PkS c653660PkS8;
        C661490Px5 c661490Px510;
        C653660PkS c653660PkS9;
        C661490Px5 c661490Px511;
        C653660PkS c653660PkS10;
        C661490Px5 c661490Px512;
        C653660PkS c653660PkS11;
        C661490Px5 c661490Px513;
        C653660PkS c653660PkS12;
        C661490Px5 c661490Px514;
        C653660PkS c653660PkS13;
        C661490Px5 c661490Px515;
        C653660PkS c653660PkS14;
        C661490Px5 c661490Px516;
        C653660PkS c653660PkS15;
        C661490Px5 c661490Px517;
        C653660PkS c653660PkS16;
        C661490Px5 c661490Px518;
        C653660PkS c653660PkS17;
        this.LLLJ = map;
        if (C07EA.LIZ() && Intrinsics.LJFF(map.get("enter_from"), "goods_search")) {
            this.LLLIIIIL = "gec_shop_search_video_goods_search";
            this.LLLIIIL = "search_outer";
        }
        HashMap map2 = new HashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, Object>> it2 = map.entrySet().iterator();
        while (true) {
            str = "";
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, Object> next = it2.next();
            if (next.getValue() != null) {
                if (next.getValue() instanceof JavaOnlyMap) {
                    map2.put(next.getKey(), GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), next.getValue()));
                } else {
                    map2.put(next.getKey(), String.valueOf(next.getValue()));
                    if (Intrinsics.LJFF("enter_from", next.getKey())) {
                        C661490Px5 c661490Px519 = this.LLILLL;
                        if (c661490Px519 != null && (c653660PkS17 = c661490Px519.LJIL) != null) {
                            String str2 = (String) map2.get("enter_from");
                            String str3 = str;
                            if (str2 != null) {
                                str3 = str2;
                            }
                            c653660PkS17.LJIIIIZZ = str3;
                        }
                        map2.remove("enter_from");
                    }
                }
            }
        }
        if (map2.keySet().contains("item_rank") && (c661490Px518 = this.LLILLL) != null) {
            String str4 = (String) map2.get("item_rank");
            if (str4 == null) {
                str4 = "";
            }
            c661490Px518.LJJII = str4;
        }
        if (map2.keySet().contains("impr_id") && (c661490Px517 = this.LLILLL) != null && (c653660PkS16 = c661490Px517.LJIL) != null) {
            String str5 = (String) map2.get("impr_id");
            if (str5 == null) {
                str5 = "";
            }
            c653660PkS16.LJIIJJI = str5;
        }
        if (map2.keySet().contains("search_keyword") && (c661490Px516 = this.LLILLL) != null && (c653660PkS15 = c661490Px516.LJIL) != null) {
            String str6 = (String) map2.get("search_keyword");
            if (str6 == null) {
                str6 = "";
            }
            c653660PkS15.LJFF = str6;
        }
        if (map2.keySet().contains("search_result_id")) {
            C661490Px5 c661490Px520 = this.LLILLL;
            if (c661490Px520 != null && (c653660PkS14 = c661490Px520.LJIL) != null) {
                c653660PkS14.LJJLI = new AwS589S0100000_10(map2, (HashMap<String, String>) 158);
            }
            if (((Number) C18125077z.LIZ.getValue()).intValue() == 0 && (c661490Px515 = this.LLILLL) != null) {
                String str7 = (String) map2.get("search_result_id");
                if (str7 == null) {
                    str7 = "";
                }
                c661490Px515.LJFF(str7);
            }
        }
        if (map2.keySet().contains("list_item_id") && (c661490Px514 = this.LLILLL) != null && (c653660PkS13 = c661490Px514.LJIL) != null) {
            c653660PkS13.LJJLIIIJL = new AwS589S0100000_10(map2, (HashMap<String, String>) 159);
        }
        if (map2.keySet().contains("search_id") && (c661490Px513 = this.LLILLL) != null && (c653660PkS12 = c661490Px513.LJIL) != null) {
            String str8 = (String) map2.get("search_id");
            if (str8 == null) {
                str8 = "";
            }
            c653660PkS12.LJIIJ = str8;
        }
        if (map2.keySet().contains("music_id") && (c661490Px512 = this.LLILLL) != null && (c653660PkS11 = c661490Px512.LJIL) != null) {
            String str9 = (String) map2.get("music_id");
            if (str9 == null) {
                str9 = "";
            }
            c653660PkS11.LJIJJLI = str9;
        }
        if (map2.keySet().contains("token_type") && (c661490Px511 = this.LLILLL) != null && (c653660PkS10 = c661490Px511.LJIL) != null) {
            String str10 = (String) map2.get("token_type");
            if (str10 == null) {
                str10 = "";
            }
            c653660PkS10.LJJII = str10;
        }
        if (map2.keySet().contains("is_fullscreen") && (c661490Px510 = this.LLILLL) != null && (c653660PkS9 = c661490Px510.LJIL) != null) {
            String str11 = (String) map2.get("is_fullscreen");
            if (str11 == null) {
                str11 = "";
            }
            c653660PkS9.LJJIII = str11;
        }
        if (map2.keySet().contains("rank") && (c661490Px59 = this.LLILLL) != null && (c653660PkS8 = c661490Px59.LJIL) != null) {
            String str12 = (String) map2.get("rank");
            if (str12 == null) {
                str12 = "";
            }
            c653660PkS8.LJIJ = str12;
        }
        if (map2.keySet().contains("max_shoot_time") && (c661490Px58 = this.LLILLL) != null && (c653660PkS7 = c661490Px58.LJIL) != null) {
            String str13 = (String) map2.get("max_shoot_time");
            if (str13 == null) {
                str13 = "";
            }
            c653660PkS7.LJJIIJ = str13;
        }
        if (map2.keySet().contains("list_result_type") && (c661490Px57 = this.LLILLL) != null && (c653660PkS6 = c661490Px57.LJIL) != null) {
            String str14 = (String) map2.get("list_result_type");
            if (str14 == null) {
                str14 = "";
            }
            c653660PkS6.LJJLIIIIJ = str14;
        }
        if (map2.keySet().contains("tns_ban_type") && (c661490Px56 = this.LLILLL) != null && (c653660PkS5 = c661490Px56.LJIL) != null) {
            String str15 = (String) map2.get("tns_ban_type");
            if (str15 == null) {
                str15 = "";
            }
            c653660PkS5.LIZLLL(str15);
        }
        if (map2.keySet().contains("previous_page") && (c661490Px55 = this.LLILLL) != null) {
            String str16 = (String) map2.get("previous_page");
            if (str16 == null) {
                str16 = "";
            }
            c661490Px55.LJIJJ = str16;
        }
        if (map2.keySet().contains("enter_method") && (c661490Px54 = this.LLILLL) != null && (c653660PkS4 = c661490Px54.LJIL) != null) {
            String str17 = (String) map2.get("enter_method");
            if (str17 == null) {
                str17 = "";
            }
            c653660PkS4.LJIIIZ = str17;
        }
        if (map2.keySet().contains("is_entity") && (c661490Px53 = this.LLILLL) != null && (c653660PkS3 = c661490Px53.LJIL) != null) {
            String str18 = (String) map2.get("is_entity");
            if (str18 == null) {
                str18 = CardStruct.IStatusCode.DEFAULT;
            }
            c653660PkS3.LJJIIZI = str18;
        }
        if (map2.keySet().contains("entity_type") && (c661490Px52 = this.LLILLL) != null && (c653660PkS2 = c661490Px52.LJIL) != null) {
            String str19 = (String) map2.get("entity_type");
            if (str19 == null) {
                str19 = "";
            }
            c653660PkS2.LJJIIJZLJL = str19;
        }
        String str20 = (String) map2.get("lynx_play_card_type");
        if (str20 != null && (c661490Px5 = this.LLILLL) != null && (c653660PkS = c661490Px5.LJIL) != null) {
            c653660PkS.LJJJLZIJ = str20;
        }
        if (map2.keySet().contains("activity_keyword")) {
            Object obj = map2.get("activity_keyword");
            if (obj == null) {
                obj = "";
            }
            linkedHashMap.put("activity_keyword", obj);
        }
        if (map2.keySet().contains("video_card_type")) {
            Object obj2 = map2.get("video_card_type");
            if (obj2 == null) {
                obj2 = "";
            }
            linkedHashMap.put("video_card_type", obj2);
        }
        if (map2.keySet().contains("search_tab_name")) {
            Object obj3 = map2.get("search_tab_name");
            if (obj3 == null) {
                obj3 = "";
            }
            linkedHashMap.put("search_tab_name", obj3);
        }
        if (map2.keySet().contains("search_tab_rank")) {
            Object obj4 = map2.get("search_tab_rank");
            if (obj4 == null) {
                obj4 = "";
            }
            linkedHashMap.put("search_tab_rank", obj4);
        }
        if (map2.keySet().contains("video_tag")) {
            Object obj5 = map2.get("video_tag");
            if (obj5 == null) {
                obj5 = "";
            }
            linkedHashMap.put("video_tag", obj5);
        }
        if (map2.keySet().contains("is_entity")) {
            Object obj6 = map2.get("is_entity");
            if (obj6 == null) {
                obj6 = "";
            }
            linkedHashMap.put("is_entity", obj6);
        }
        if (map2.keySet().contains("entity_type")) {
            Object obj7 = map2.get("entity_type");
            if (obj7 == null) {
                obj7 = "";
            }
            linkedHashMap.put("entity_type", obj7);
        }
        if (map2.keySet().contains("is_page")) {
            Object obj8 = map2.get("is_page");
            if (obj8 == null) {
                obj8 = "";
            }
            linkedHashMap.put("is_page", obj8);
        }
        C661490Px5 c661490Px521 = this.LLILLL;
        if (c661490Px521 != null) {
            C653660PkS c653660PkS18 = c661490Px521.LJIL;
            if (c653660PkS18 != null) {
                c653660PkS18.LJJJJJ = linkedHashMap;
            }
            C653660PkS c653660PkS19 = c661490Px521.LJIL;
            if (c653660PkS19 != null) {
                c653660PkS19.LJJJJJL = map2;
            }
        }
        s sVar = this.LLJLL;
        if (sVar != null) {
            Object obj9 = map2.get("token_type");
            if (obj9 == null) {
                obj9 = "";
            }
            C0DYC.LIZIZ(sVar, "*_search_lynx_context_token_type", obj9);
        }
        s sVar2 = this.LLJLL;
        if (sVar2 != null) {
            Object obj10 = map2.get("universalRank");
            if (obj10 == null) {
                obj10 = "";
            }
            C0DYC.LIZIZ(sVar2, "*_search_lynx_context_universal_rank", obj10);
        }
        s sVar3 = this.LLJLL;
        if (sVar3 != null) {
            Object obj11 = map2.get("search_result_id");
            Object obj12 = str;
            if (obj11 != null) {
                obj12 = obj11;
            }
            C0DYC.LIZIZ(sVar3, "*_search_lynx_context_search_result_id", obj12);
        }
    }

    public final void setLynxContext(s sVar) {
        this.LLJLL = sVar;
    }

    public final void setMCoverBackground(ImageView imageView) {
        this.LLILZLL = imageView;
    }

    public final void setMCoverView(C0GZM c0gzm) {
        this.LLILZ = c0gzm;
    }

    public final void setMScrollStateManager(C652990PjN c652990PjN) {
        C661490Px5 c661490Px5 = this.LLILLL;
        if (c661490Px5 != null) {
            c661490Px5.LJIIIIZZ = c652990PjN;
        }
    }

    public final void setMScrollStateObserver(AbstractC653010PjP abstractC653010PjP) {
        C661490Px5 c661490Px5 = this.LLILLL;
        if (c661490Px5 != null) {
            c661490Px5.LJIIIZ = abstractC653010PjP;
        }
    }

    public void setMuted(int i) {
        C661850Pxf c661850Pxf;
        if (i == -1) {
            return;
        }
        int i2 = this.LLLJL;
        this.LLLJL = i;
        if (i != 1) {
            if (i != 1) {
                if (i == 0 && i2 == 1 && this.LLLLIIIILLL != 0 && this.LLIZLLLIL && isPlaying() && SystemClock.uptimeMillis() - this.LLLL >= 300 && this.LLLLII > 0 && SystemClock.uptimeMillis() - this.LLLLII >= 200) {
                    LJIJ(0);
                    C661850Pxf c661850Pxf2 = this.LLIZ;
                    if (c661850Pxf2 != null) {
                        c661850Pxf2.setMute(false);
                        return;
                    }
                    return;
                }
                boolean z = C659080PtC.LIZ;
                if (!C659080PtC.LIZ(this.LLLLIIIILLL, 0, getMAweme())) {
                    C661850Pxf c661850Pxf3 = this.LLIZ;
                    if (c661850Pxf3 == null) {
                        return;
                    }
                    c661850Pxf3.setMute(false);
                    return;
                }
                C661850Pxf c661850Pxf4 = this.LLIZ;
                if ((c661850Pxf4 != null && c661850Pxf4.getMute()) || (c661850Pxf = this.LLIZ) == null) {
                    return;
                }
                c661850Pxf.setMute(true);
                return;
            }
        } else if (this.LLLLIIIILLL != 0 && i2 != -1 && i2 != i && this.LLIZLLLIL && isPlaying() && SystemClock.uptimeMillis() - this.LLLL >= 300) {
            C659080PtC.LJFF();
            if (i != C659080PtC.LIZIZ) {
                LJIJ(i);
            }
        }
        C661850Pxf c661850Pxf5 = this.LLIZ;
        if (c661850Pxf5 == null) {
            return;
        }
        c661850Pxf5.setMute(true);
    }

    public void setObjectFit(String str) {
        C661850Pxf c661850Pxf = this.LLIZ;
        if (c661850Pxf != null) {
            c661850Pxf.setFitType(!Intrinsics.LJFF(str, "fill") ? 1 : 0);
        }
    }

    public final void setParentAbility(ISearchAwemePoolCompatParentAbility iSearchAwemePoolCompatParentAbility) {
        this.LLLILZJ = iSearchAwemePoolCompatParentAbility;
    }

    public void setPlayStatusActionHandler(Function1<? super Integer, Unit> function1) {
        this.LLJJJJLIIL = function1;
    }

    public final void setPlayTag(String str) {
        this.LLLIIIL = str;
    }

    public final void setPlayingWhenLeave$search_release(boolean z) {
        this.LLJILLL = z;
    }

    public final void setPoster(String str) {
        this.LLJJI = str;
        if (this.LLJIJIL && ((Boolean) C133000f2.LIZ.getValue()).booleanValue()) {
            LJII();
        }
    }

    public void setRate(int i) {
        this.LLJJIII = i;
    }

    public void setRepeat(boolean z) {
        C661850Pxf c661850Pxf = this.LLIZ;
        if (c661850Pxf != null) {
            c661850Pxf.setRepeat(z);
        }
    }

    public final void setRoundCorner(View view) {
        view.setOutlineProvider(new C663220Pzs((int) C654910PmT.LIZ(2.0f, getContext())));
        view.setClipToOutline(true);
    }

    public void setSampleInterval(int i) {
        this.LLJJJIL = Integer.valueOf(i);
        C661850Pxf c661850Pxf = this.LLIZ;
        if (c661850Pxf != null) {
            c661850Pxf.setEnableProgressCallback(true);
        }
        C661850Pxf c661850Pxf2 = this.LLIZ;
        if (c661850Pxf2 != null) {
            c661850Pxf2.setSampleInterval(i);
        }
    }

    public final void setSearchAdCacheKey(String str) {
        this.LLLILZ = str;
    }

    public void setSessionId(int i) {
        C653660PkS c653660PkS;
        String str;
        DynamicPatch dynamicPatch;
        C658950Psz c658950Psz;
        this.LLJ = i;
        if (this.LLILLL != null) {
            C647140PZw.LIZ.LIZ(i);
        }
        C647140PZw c647140PZw = C647140PZw.LIZ;
        C649040Pd0 c649040Pd0LIZ = c647140PZw.LIZ(this.LLJ);
        if (c649040Pd0LIZ != null) {
            new WeakReference(this);
        }
        C661850Pxf c661850Pxf = this.LLIZ;
        if (c661850Pxf != null && c649040Pd0LIZ != null) {
            new WeakReference(c661850Pxf);
        }
        C661490Px5 c661490Px5 = this.LLILLL;
        if (c661490Px5 != null && (c658950Psz = c661490Px5.LJIIJ) != null && c649040Pd0LIZ != null) {
            c649040Pd0LIZ.LIZIZ = new WeakReference<>(c658950Psz);
        }
        C661490Px5 c661490Px52 = this.LLILLL;
        if (c661490Px52 != null) {
            C649040Pd0 c649040Pd0LIZ2 = c647140PZw.LIZ(this.LLJ);
            if (c649040Pd0LIZ2 != null && (dynamicPatch = c649040Pd0LIZ2.LIZ) != null) {
                str = dynamicPatch.schema;
            } else {
                str = null;
            }
            c661490Px52.LIZLLL = str;
        }
        C661490Px5 c661490Px53 = this.LLILLL;
        if (c661490Px53 != null && (c653660PkS = c661490Px53.LJIL) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lynx:");
            sbLIZ.append(getCardName());
            c653660PkS.LJJJLZIJ = C2188811AlT.LIZIZ(sbLIZ);
        }
        ARunnableS110S0100000_10 aRunnableS110S0100000_10 = new ARunnableS110S0100000_10(this, 168);
        this.LLJJIJIL = aRunnableS110S0100000_10;
        C786410Ut5.LJJZZIII(this.LLJJIJIIJIL, aRunnableS110S0100000_10);
    }

    public void setSessionIdStr(String str) {
        this.LLLIZZ = str;
    }

    public void setShareEComVideoPlayerBeforeLaunchDetail(String str) {
        if (!TextUtils.isEmpty(str) && this.LLJIJIL) {
            Aweme mAweme = getMAweme();
            String aid = null;
            if (mAweme != null) {
                aid = mAweme.getAid();
            }
            if (Intrinsics.LJFF(str, aid) && C078I.LIZ()) {
                C666390QBx.LIZ = getMAweme();
                C661490Px5 c661490Px5 = this.LLILLL;
                if (c661490Px5 != null && c661490Px5.LJ() != null) {
                    C0N0Y c0n0y = c661490Px5.LJIILIIL;
                    C661510Px7.LIZ.getClass();
                    C661510Px7.LIZ(c661490Px5, true, false);
                    if (c0n0y != null) {
                        c0n0y.LIZ();
                    }
                }
            }
        }
    }

    public final void setShowCoverOnPause(boolean z) {
        this.LLJILJIL = z;
    }

    public void setSoundControl(int i) {
        this.LLLLIIIILLL = i;
        C661850Pxf c661850Pxf = this.LLIZ;
        if (c661850Pxf != null) {
            boolean z = C659080PtC.LIZ;
            c661850Pxf.setMute(C659080PtC.LIZ(i, 0, getMAweme()));
        }
    }

    public final void LJIIL(String str, Map<String, ? extends Object> map) {
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynxPlayEvent ");
        sbLIZ.append(str);
        sbLIZ.append(" aid:");
        Aweme mAweme = getMAweme();
        if (mAweme != null) {
            aid = mAweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        int iHashCode = str.hashCode();
        if (iHashCode != 2908512) {
            if (iHashCode != 1704170695) {
                if (iHashCode == 1762557398 && str.equals("timeupdate")) {
                    this.LLJJL = str;
                    Function2<? super String, ? super Map<String, ? extends Object>, Unit> function2 = this.LLJJJJJIL;
                    if (function2 != null) {
                        function2.invoke(str, map);
                        return;
                    }
                    return;
                }
            } else if (str.equals("modifySoundStatus")) {
                this.LLJJL = str;
                Function2<? super String, ? super Map<String, ? extends Object>, Unit> function22 = this.LLJJJJJIL;
                if (function22 == null) {
                    return;
                }
                function22.invoke(str, map);
                return;
            }
        } else if (str.equals("carousel")) {
            this.LLJJL = str;
            Function2<? super String, ? super Map<String, ? extends Object>, Unit> function23 = this.LLJJJJJIL;
            if (function23 == null) {
                return;
            }
            function23.invoke(str, map);
            return;
        }
        if (!(!TextUtils.equals(this.LLJJL, str))) {
            return;
        }
        this.LLJJL = str;
        Function2<? super String, ? super Map<String, ? extends Object>, Unit> function24 = this.LLJJJJJIL;
        if (function24 == null) {
            return;
        }
        function24.invoke(str, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(android.view.View r5, X.InterfaceC648270Pbl r6) {
        /*
            r4 = this;
            X.0Pxa r3 = r4.LLILLJJLI
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility r0 = r3.LIZ
            r1 = 0
            if (r0 != 0) goto L51
            X.01GW r0 = X.C1829107Ej.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2e
            androidx.fragment.app.Fragment r2 = X.C946803n0.LIZ(r5)
            if (r2 == 0) goto L2c
            boolean r0 = r2.isDetached()     // Catch: java.lang.Exception -> L28
            if (r0 != 0) goto L2c
            X.0Q7z r2 = X.C1558360qeg.LJIIJJI(r2, r1)     // Catch: java.lang.Exception -> L28
            if (r2 == 0) goto L2c
            goto L47
        L28:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L2c:
            r0 = r1
            goto L4f
        L2e:
            androidx.fragment.app.Fragment r0 = X.C946803n0.LIZ(r5)
            if (r0 == 0) goto L45
            X.0Q7z r2 = X.C1558360qeg.LJIIJJI(r0, r1)
            if (r2 == 0) goto L45
            java.lang.Class<com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility> r0 = com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r2, r0, r1)
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility r0 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility) r0
        L42:
            r3.LIZ = r0
            goto L51
        L45:
            r0 = r1
            goto L42
        L47:
            java.lang.Class<com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility> r0 = com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r2, r0, r1)
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility r0 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility) r0
        L4f:
            r3.LIZ = r0
        L51:
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility r0 = r3.LIZ
            if (r0 == 0) goto L59
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r0.LU(r5)
        L59:
            boolean r0 = r1 instanceof X.InterfaceC661780PxY
            if (r0 == 0) goto L6a
            X.0PxY r1 = (X.InterfaceC661780PxY) r1
            if (r1 == 0) goto L6a
            boolean r0 = r1.c0()
            if (r0 == 0) goto L6a
            r1.w3(r6)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C661440Px0.LJJ(android.view.View, X.0Pbl):void");
    }

    public final void LJJI(int i, boolean z) {
        int duration;
        C661550PxB c661550PxBLJ;
        C0N0Y c0n0y;
        Video video;
        Aweme mAweme = getMAweme();
        if (mAweme != null && (video = mAweme.getVideo()) != null) {
            duration = video.getDuration();
        } else {
            duration = 0;
        }
        int iMax = Math.max(duration, i);
        float f = (i / iMax) * 100;
        C586970N0l mPlayVideoHelper = getMPlayVideoHelper();
        if (mPlayVideoHelper != null) {
            float fMin = Math.min(Math.max(0.0f, f), 100.0f);
            if (mPlayVideoHelper.LIZIZ() && (c0n0y = mPlayVideoHelper.LJI) != null) {
                c0n0y.LJJIJ(mPlayVideoHelper.LIZLLL);
                mPlayVideoHelper.LJI.setSurface(mPlayVideoHelper.LIZJ.getSurface());
                mPlayVideoHelper.LJI.seek(fMin);
            }
        }
        C661490Px5 c661490Px5 = this.LLILLL;
        if (c661490Px5 != null && (c661550PxBLJ = c661490Px5.LJ()) != null) {
            c661550PxBLJ.LJI = Math.min(i, iMax);
        }
        this.LLJJJJ = i;
        if (z) {
            LJIJI();
        } else {
            LJIIZILJ();
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        C655580PnY.LIZLLL(this, j);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        UC(i);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        UC(1);
        LJIIL("error", C2097608Jq.LJI(new Pair("error", String.valueOf(c1481290oeN))));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        LJJIFFI(false);
        LJIIIZ();
        C584080MvW.LIZ();
        UC(0);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0PxE] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.0OBe] */
    /* JADX WARN: Type inference failed for: r0v52, types: [com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.SearchVideoForLynx$ability$1] */
    public C661440Px0(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        C661490Px5 dataProvider;
        InterfaceC1482650ogZ surfaceHolder;
        C661490Px5 dataProvider2;
        C653660PkS c653660PkS;
        String str;
        ImageView imageView;
        super(context, attributeSet, i);
        this.LL = new C650580PfU();
        this.LLILLJJLI = new C661800Pxa();
        this.LLJ = -1;
        this.LLJJI = "";
        this.LLJJIII = -1;
        this.LLJJIJIIJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJJJ = 500L;
        this.LLJJJJ = -1;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 340));
        this.LLJLLIL = C1867080ygc.LIZ();
        this.LLJLLL = C288510BSn.LIZIZ();
        this.LLJZ = C452501pT.LIZIZ(new AwS411S0200000_10(this, context, 28));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 338));
        this.LLLFF = C452501pT.LIZIZ(new AwS554S0100000_10(this, 335));
        this.LLLFFI = new InterfaceC1399350mWD() { // from class: X.0PxE
            @Override // X.InterfaceC1399350mWD
            public final /* synthetic */ boolean Fi() {
                return false;
            }

            @Override // X.InterfaceC1399350mWD
            public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
                if (this.LL.isPlaying() && C2174741A9g.LIZIZ.LJIILJJIL() && (i2 == 24 || i2 == 25)) {
                    this.LL.LJIIL("modifySoundStatus", C2097608Jq.LJI(new Pair("isMute", 0)));
                }
                return false;
            }
        };
        this.LLLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 336));
        this.LLLII = C452501pT.LIZIZ(new AwS554S0100000_10(this, 337));
        this.LLLIIII = new C0H62() { // from class: X.0OBe
            @Override // X.C0H62
            public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
                if (C0N74.LIZ[c0o0l2.ordinal()] == 1 && c0o0l != C0O0L.AVAILABLE) {
                    C1524805y2.LIZIZ(0L, new AwS554S0100000_10(this.LL, 339));
                }
            }
        };
        this.LLL = System.currentTimeMillis();
        if (C301150BrF.LIZ() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C650520PfO c650520PfO = C650520PfO.LIZ;
            Context context2 = getContext();
            c650520PfO.getClass();
            C650520PfO.LIZIZ(context2, R.layout.f4p, this, true);
        } else {
            C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.f4p, this, true);
        }
        View viewFindViewById = findViewById(R.id.mhe);
        this.LLJJIJI = viewFindViewById;
        if (viewFindViewById != null) {
            setRoundCorner(viewFindViewById);
        }
        this.LLILZ = (C0GZM) findViewById(R.id.cover);
        this.LLILZIL = findViewById(R.id.f5d);
        this.LLILZLL = (ImageView) findViewById(R.id.f4p);
        if (C1838907Id.LIZ() && (imageView = this.LLILZLL) != null) {
            imageView.setBackground(new ColorDrawable(C446980Hfs.LIZ(getContext(), R.color.dr)));
        }
        C661850Pxf c661850Pxf = (C661850Pxf) findViewById(R.id.xrx);
        this.LLIZ = c661850Pxf;
        if (c661850Pxf != null) {
            dataProvider = c661850Pxf.getDataProvider();
        } else {
            dataProvider = null;
        }
        this.LLILLL = dataProvider;
        if (dataProvider != null) {
            dataProvider.LJII = getContainerStatusProvider();
        }
        C661490Px5 c661490Px5 = this.LLILLL;
        if (c661490Px5 != null) {
            c661490Px5.LJIIL = false;
            c661490Px5.LJIIJJI = false;
            c661490Px5.LIZ = this;
        }
        C661850Pxf c661850Pxf2 = this.LLIZ;
        if (c661850Pxf2 != null) {
            c661850Pxf2.setMVideoViewListener(this);
        }
        C661850Pxf c661850Pxf3 = this.LLIZ;
        if (c661850Pxf3 != null) {
            c661850Pxf3.setMPlayerViewListener(this);
        }
        View itemView = getItemView();
        if (itemView != null) {
            if (itemView.isAttachedToWindow()) {
                C661850Pxf core = getCore();
                if (core != null) {
                    core.setMVideoMobListener(new C661710PxR(getDataProvider(), C0Q3E.LIZ(this)));
                }
                if (C0BQ1.LIZ() && (dataProvider2 = getDataProvider()) != null && (c653660PkS = dataProvider2.LJIL) != null && (str = c653660PkS.LJJJJJL.get("list_item_id")) != null) {
                    c653660PkS.LJJLIIIJL = new AwS61S1000000_10(str, 19);
                }
            } else {
                itemView.addOnAttachStateChangeListener(new C0R48(this, itemView, 18));
            }
        } else {
            C1524805y2.LIZIZ(0L, new AwS554S0100000_10(this, 1196));
        }
        C661850Pxf c661850Pxf4 = this.LLIZ;
        if (c661850Pxf4 != null) {
            if (((Number) AnonymousClass0799.LIZ.getValue()).intValue() == 0) {
                if (c661850Pxf4.isAttachedToWindow()) {
                    c661850Pxf4.LJIJI(C946803n0.LIZ(c661850Pxf4));
                } else {
                    c661850Pxf4.addOnAttachStateChangeListener(new C0R48(c661850Pxf4, c661850Pxf4, 19));
                }
            } else {
                c661850Pxf4.LJIJI(null);
            }
        }
        Integer num = this.LLJJJIL;
        if (num != null) {
            int iIntValue = num.intValue();
            C661850Pxf c661850Pxf5 = this.LLIZ;
            if (c661850Pxf5 != null) {
                c661850Pxf5.setEnableProgressCallback(true);
            }
            C661850Pxf c661850Pxf6 = this.LLIZ;
            if (c661850Pxf6 != null) {
                c661850Pxf6.setSampleInterval(iIntValue);
            }
        }
        C661850Pxf c661850Pxf7 = this.LLIZ;
        if (c661850Pxf7 != null && (surfaceHolder = c661850Pxf7.getSurfaceHolder()) != null) {
            surfaceHolder.Dn(new InterfaceC1473950oSX() { // from class: X.0PxZ
                @Override // X.InterfaceC1473950oSX
                public final void LIZ() {
                }

                @Override // X.InterfaceC1473950oSX
                public final void LLF(int i2, int i3) {
                }

                @Override // X.InterfaceC1473950oSX
                public final void LLILLIZIL(int i2, int i3) {
                }

                @Override // X.InterfaceC1473950oSX
                public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }
            });
        }
        getMPlayVideoHelper();
        C661490Px5 c661490Px52 = this.LLILLL;
        if (c661490Px52 != null) {
            c661490Px52.LJIL = new C653660PkS();
        }
        C658950Psz c658950Psz = new C658950Psz(this.LLIZ, this.LLILLL);
        C661490Px5 c661490Px53 = this.LLILLL;
        if (c661490Px53 != null) {
            c661490Px53.LJIIJ = c658950Psz;
            c661490Px53.LJI = new C646220PWi(this.LLIZ);
        }
        if (C649470Pdh.LJIILIIL("search-video") && !Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            C2487409ou.LIZJ(new ARunnableS110S0100000_10(this, 167));
        } else {
            LJIILL();
        }
        AwS589S0100000_10 awS589S0100000_10 = new AwS589S0100000_10(this, 587);
        C658630PsT c658630PsT = new C658630PsT();
        awS589S0100000_10.invoke(c658630PsT);
        setMScrollStateObserver(c658630PsT);
        C661490Px5 c661490Px54 = this.LLILLL;
        if (c661490Px54 != null) {
            c661490Px54.LJI = new C646220PWi(this.LLIZ);
        }
        this.LLLILZLLLI = new SearchServiceCenter$AutoPlayAbility() { // from class: com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.SearchVideoForLynx$ability$1
            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void Mu(C650630PfZ c650630PfZ) {
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final boolean N1() {
                return true;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final View Vt() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void kC0(int i2) {
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final boolean mm() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void wp(C650630PfZ c650630PfZ) {
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void J0() {
                C661550PxB c661550PxBLJ;
                C661490Px5 dataProvider3;
                C664400Q4g c664400Q4g;
                C661850Pxf core2;
                Aweme mAweme = this.LL.getMAweme();
                C661440Px0 c661440Px0 = this.LL;
                if (mAweme == null) {
                    c661440Px0.LLJLILLLLZIIL = true;
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ability play ");
                Aweme mAweme2 = this.LL.getMAweme();
                sbLIZ.append(mAweme2 != null ? mAweme2.getAid() : null);
                sbLIZ.append(", hashcode: ");
                sbLIZ.append(this.LL.hashCode());
                sbLIZ.append(", is attchtowindow: ");
                sbLIZ.append(this.LL.LLIZLLLIL);
                sbLIZ.append(", id: ");
                Map<String, ? extends Object> map = this.LL.LLLIIL;
                sbLIZ.append(map != null ? map.get("aweme_id") : null);
                C2188811AlT.LIZIZ(sbLIZ);
                s sVar = this.LL.LLJLL;
                Object objLIZ = sVar != null ? C0DYC.LIZ(sVar, "play_metrics") : null;
                if ((objLIZ instanceof C664400Q4g) && (c664400Q4g = (C664400Q4g) objLIZ) != null && (core2 = this.LL.getCore()) != null) {
                    core2.setPlayMetrics(c664400Q4g);
                }
                C661850Pxf core3 = this.LL.getCore();
                if (core3 != null) {
                    C661880Pxi.LIZ(core3);
                }
                C661490Px5 dataProvider4 = this.LL.getDataProvider();
                if (dataProvider4 == null || (c661550PxBLJ = dataProvider4.LJ()) == null || c661550PxBLJ.LJFF == null || (dataProvider3 = this.LL.getDataProvider()) == null || dataProvider3.LJIILIIL == null) {
                    this.LL.LJJII();
                }
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void LJJLIIIJLLLLLLLZ() {
                C661850Pxf core2 = this.LL.getCore();
                if (core2 != null) {
                    core2.LJJIIZ();
                }
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void LLZZZZ() {
                C661850Pxf core2 = this.LL.getCore();
                if (core2 != null) {
                    core2.LLJJJ();
                }
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final boolean isPlaying() {
                C661850Pxf core2 = this.LL.getCore();
                if (core2 != null) {
                    return core2.isPlaying();
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final View getDetectView() {
                return this.LL;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void Ot0(C640750PBh c640750PBh, Function0<Unit> function0) {
                function0.invoke();
            }
        };
        this.LLLIZZ = "";
        this.LLLJL = -1;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        LJIILJJIL();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
