package X;

import Y.ARunnableS43S0300000_10;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.keva.Keva;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.poi.PoiAnchorCard;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Q4a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C664340Q4a implements InterfaceC661680PxO {
    public static Aweme LLJJI;
    public final C661490Px5 LL;
    public final ISearchContextAbility LLILLJJLI;
    public final C01GW LLILLL;
    public boolean LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public boolean LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public int LLJI;
    public C664390Q4f LLJIJIL;
    public Exception LLJILJIL;
    public long LLJILJILJ;
    public final TreeMap<Long, String> LLJILLL;
    public C664370Q4d LLJJ;

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
    }

    public void LJIJI(Aweme aweme, C653660PkS c653660PkS, long j) {
    }

    @Override // X.InterfaceC648270Pbl
    public final View LJJIIJ() {
        return null;
    }

    @Override // X.InterfaceC648270Pbl
    public final void LJJJJ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.InterfaceC661680PxO, X.InterfaceC648270Pbl
    public void LLLLLIL() {
        this.LLIZ = false;
        this.LLIZLLLIL = 0L;
        this.LLJ = 0L;
        this.LLJI = 0;
        this.LLJILLL.put(Long.valueOf(System.currentTimeMillis()), "play");
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
    public final View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final InterfaceC584630MwP getPreload() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final C0PCQ getPriority() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C583620Mum.LIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        return false;
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
    public final void onBuffering(boolean z) {
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
    public final void onDecoderBuffering(String str, boolean z) {
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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
        C583620Mum.LJIILLIIL(this, str, c1480290ocl);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIJ(this, str, c1480430ocz);
    }

    @Override // X.InterfaceC661680PxO, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
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
    public final void onPlayFailed(C1481290oeN c1481290oeN) {
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
    public final void onPlayProgressChange(float f) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
        C583620Mum.LJJIIZ(this, str, j, j2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayRelease(String str) {
        C583620Mum.LJJIIZI(this, str);
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
    public final /* synthetic */ void onPlaying(String str) {
        C583620Mum.LJJIJLIJ(this, str);
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
    public final void onPreparePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJI(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(C1480420ocy c1480420ocy) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C583620Mum.LJJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJIZL(this, c1480430ocz);
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
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        return null;
    }

    @Override // X.InterfaceC661680PxO
    public final void zU() {
    }

    public final Aweme LJII() {
        C661490Px5 c661490Px5 = this.LL;
        if (c661490Px5 != null) {
            return c661490Px5.LIZJ;
        }
        return null;
    }

    public final String LJIIIIZZ() {
        String str;
        C661490Px5 c661490Px5 = this.LL;
        return (c661490Px5 == null || (str = c661490Px5.LJIIZILJ) == null) ? "" : str;
    }

    public final C653660PkS LJIIIZ() {
        C661490Px5 c661490Px5 = this.LL;
        if (c661490Px5 != null) {
            return c661490Px5.LJIL;
        }
        return null;
    }

    public final String LJIIL() {
        return ((C0PRC) this.LLILLJJLI.Ph1().LIZJ()).LLJZIJLIL;
    }

    public final boolean LJIILIIL() {
        Aweme awemeLJII;
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> list;
        C661490Px5 c661490Px5 = this.LL;
        return (c661490Px5 == null || !c661490Px5.LJJIIJ || (awemeLJII = LJII()) == null || (video = awemeLJII.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (list = captionModel.captionList) == null || list.isEmpty()) ? false : true;
    }

    public final void LJIILL() {
        this.LLJILLL.clear();
        C664370Q4d c664370Q4d = this.LLJJ;
        if (c664370Q4d != null) {
            for (Map.Entry entry : ((ConcurrentHashMap) C664450Q4l.LIZ).entrySet()) {
                entry.getKey();
                ((Set) entry.getValue()).remove(c664370Q4d);
            }
        }
    }

    public final void LJIJ() {
        Long lValueOf;
        String aid;
        Aweme aweme;
        Aweme aweme2;
        C661550PxB c661550PxBLJ;
        C661490Px5 c661490Px5 = this.LL;
        if (c661490Px5 != null) {
            c661490Px5.LJJIL = -1L;
        }
        if (!C664430Q4j.LIZLLL) {
            C664430Q4j.LIZLLL = true;
            C664430Q4j.LIZIZ = false;
        }
        if (c661490Px5 == null || (c661550PxBLJ = c661490Px5.LJ()) == null) {
            lValueOf = null;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c661550PxBLJ.LIZLLL == -1) {
                c661550PxBLJ.LIZLLL = jCurrentTimeMillis;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("startCalcPlayTime mStartPlayTime = ");
                sbLIZ.append(c661550PxBLJ.LIZLLL);
                sbLIZ.append(", aid = ");
                Aweme aweme3 = c661550PxBLJ.LIZ;
                sbLIZ.append(aweme3 == null ? "null" : aweme3.getAid());
                C2188811AlT.LIZIZ(sbLIZ);
            }
            lValueOf = Long.valueOf(jCurrentTimeMillis);
        }
        if (C664430Q4j.LJI) {
            C661490Px5 c661490Px52 = this.LL;
            if (c661490Px52 != null) {
                c661490Px52.LJJIJ = C664430Q4j.LJ;
            }
            C664430Q4j.LJI = false;
        } else {
            C661490Px5 c661490Px53 = this.LL;
            if (c661490Px53 != null) {
                c661490Px53.LJJIJ = lValueOf != null ? lValueOf.longValue() : System.currentTimeMillis();
            }
        }
        Keva keva = C584250Mvn.LIZ;
        C661490Px5 c661490Px54 = this.LL;
        String aid2 = (c661490Px54 == null || (aweme2 = c661490Px54.LIZJ) == null) ? null : aweme2.getAid();
        C661490Px5 c661490Px55 = this.LL;
        C584250Mvn.LIZ(c661490Px55 != null ? c661490Px55.LJIILIIL : null, aid2);
        C1322105Fj c1322105Fj = C1322105Fj.LLILLJJLI;
        C661490Px5 c661490Px56 = this.LL;
        if (c661490Px56 == null || (aweme = c661490Px56.LIZJ) == null || (aid = aweme.getAid()) == null) {
            aid = "empty";
        }
        C661490Px5 c661490Px57 = this.LL;
        long j = c661490Px57 != null ? c661490Px57.LJJIJ : -1L;
        c1322105Fj.getClass();
        C23250099c.LIZLLL(c1322105Fj, null, null, new C1321705Ff(j, aid, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    @Override // X.InterfaceC661680PxO, X.InterfaceC648270Pbl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJJ() {
        /*
            r9 = this;
            java.util.TreeMap<java.lang.Long, java.lang.String> r2 = r9.LLJILLL
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "pause"
            r2.put(r1, r0)
            X.0PkS r0 = r9.LJIIIZ()
            if (r0 == 0) goto L7a
            java.lang.String r0 = r0.LJIIIIZZ
        L17:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r8 = ""
            if (r0 == 0) goto L6e
            java.lang.String r5 = r9.LJIIIIZZ()
        L23:
            X.0Px5 r0 = r9.LL
            r3 = -1
            if (r0 == 0) goto L67
            X.0PxB r0 = r0.LJ()
            if (r0 == 0) goto L67
            long r1 = r0.LIZLLL
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L67
        L35:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L56
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.LJII()
            java.lang.String r0 = X.C436190H8n.LIZ(r0)
            if (r0 == 0) goto L49
            r8 = r0
        L49:
            r4 = 0
            java.util.concurrent.ExecutorService r0 = X.C823050WQl.LIZLLL()
            X.0Q42 r3 = new X.0Q42
            r3.<init>(r4, r5, r6, r8)
            r0.execute(r3)
        L56:
            X.0Px5 r0 = r9.LL
            if (r0 == 0) goto L66
            X.0Q4g r2 = r0.LJJIJIL
            if (r2 == 0) goto L66
            int r1 = r2.LJIIJJI
            r0 = 1
            if (r1 != r0) goto L66
            r0 = 2
            r2.LJIIJJI = r0
        L66:
            return
        L67:
            X.0Px5 r0 = r9.LL
            if (r0 == 0) goto L56
            long r1 = r0.LJJIL
            goto L35
        L6e:
            X.0PkS r0 = r9.LJIIIZ()
            if (r0 == 0) goto L78
            java.lang.String r5 = r0.LJIIIIZZ
            if (r5 != 0) goto L23
        L78:
            r5 = r8
            goto L23
        L7a:
            r0 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C664340Q4a.LLJJJ():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    @Override // X.InterfaceC662110Py5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r5 = this;
            boolean r0 = X.C145500h3.LIZ()
            if (r0 == 0) goto L1f
            X.0Px5 r0 = r5.LL
            r3 = -1
            if (r0 == 0) goto L45
            X.0PxB r0 = r0.LJ()
            if (r0 == 0) goto L45
            long r1 = r0.LIZLLL
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L45
        L18:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L1f
            r5.LJIJJLI()
        L1f:
            boolean r0 = X.C301550Brt.LIZ()
            if (r0 == 0) goto L42
            X.0Pxd r2 = X.C661820Pxc.LIZ
            X.0Px5 r0 = r5.LL
            if (r0 == 0) goto L43
            java.lang.String r1 = r0.LIZLLL()
        L2f:
            java.util.Map<java.lang.String, X.0PxB> r0 = r2.LIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L42
            if (r1 == 0) goto L42
            java.util.Map<java.lang.String, X.0PxB> r0 = r2.LIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.remove(r1)
        L42:
            return
        L43:
            r1 = 0
            goto L2f
        L45:
            X.0Px5 r0 = r5.LL
            if (r0 == 0) goto L1f
            long r1 = r0.LJJIL
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C664340Q4a.LIZ():void");
    }

    public final String LJI() {
        String strLJIIIIZZ;
        C653660PkS c653660PkSLJIIIZ = LJIIIZ();
        if (c653660PkSLJIIIZ == null || (strLJIIIIZZ = c653660PkSLJIIIZ.LJIIIIZZ) == null || strLJIIIIZZ.length() == 0) {
            strLJIIIIZZ = LJIIIIZZ();
        }
        return C123100dR.LIZ(strLJIIIIZZ) ? strLJIIIIZZ : "general_search";
    }

    public final String LJIIJ() {
        Function1<? super Aweme, String> function1;
        String strInvoke;
        C653660PkS c653660PkSLJIIIZ = LJIIIZ();
        String str = c653660PkSLJIIIZ != null ? c653660PkSLJIIIZ.LJIJI : null;
        if (str != null && str.length() != 0) {
            return str;
        }
        C653660PkS c653660PkSLJIIIZ2 = LJIIIZ();
        return (c653660PkSLJIIIZ2 == null || (function1 = c653660PkSLJIIIZ2.LJJLI) == null || (strInvoke = function1.invoke(LJII())) == null || strInvoke.length() == 0) ? ((C0PRC) this.LLILLJJLI.Ph1().LIZJ()).LLL : strInvoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:306:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x053b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI() {
        /*
            Method dump skipped, instruction units count: 1485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C664340Q4a.LJIJJLI():void");
    }

    @Override // X.InterfaceC648350Pbt
    public final String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    @InterfaceC1294060jmO
    public final View p0() {
        return C655580PnY.LIZIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        C655580PnY.LIZJ(this);
    }

    public static Map LJIIJJI(Aweme aweme) {
        HashMap<String, String> mobParams;
        if (aweme != null && (mobParams = aweme.getMobParams()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = mobParams.get("block_type");
            if (str != null) {
                linkedHashMap.put("block_type", str);
            }
            String str2 = mobParams.get("block_index");
            if (str2 != null) {
                linkedHashMap.put("block_index", str2);
            }
            String str3 = mobParams.get("position_in_block");
            if (str3 != null) {
                linkedHashMap.put("position_in_block", str3);
            }
            return linkedHashMap;
        }
        return C2097608Jq.LJ();
    }

    public final C664380Q4e LJFF(long j) {
        String aid;
        boolean z;
        int i;
        String str;
        String strLIZ;
        Map<String, String> map;
        C653660PkS c653660PkS;
        String str2;
        C653660PkS c653660PkS2;
        Aweme aweme;
        PoiDataStruct poiDataStruct;
        PoiAnchorInfo poiAnchorInfo;
        PoiAnchorCard poiAnchorCard;
        String str3;
        Aweme aweme2;
        C664380Q4e c664380Q4e = new C664380Q4e();
        c664380Q4e.LIZIZ = j;
        C661490Px5 c661490Px5 = this.LL;
        String str4 = "";
        if (c661490Px5 == null || (aweme2 = c661490Px5.LIZJ) == null || (aid = aweme2.getAid()) == null) {
            aid = "";
        }
        c664380Q4e.LIZ = aid;
        C661490Px5 c661490Px52 = this.LL;
        C664400Q4g c664400Q4g = null;
        if (c661490Px52 != null) {
            c664400Q4g = c661490Px52.LJJIJIL;
        }
        c664380Q4e.LJFF = c664400Q4g;
        if (c661490Px52 != null && (aweme = c661490Px52.LIZJ) != null && (poiDataStruct = aweme.getPoiDataStruct()) != null && (poiAnchorInfo = poiDataStruct.videoAnchor) != null && (poiAnchorCard = poiAnchorInfo.poiAnchorCard) != null && (str3 = poiAnchorCard.lynxSchema) != null && C123100dR.LIZ(str3)) {
            z = true;
        } else {
            z = false;
        }
        c664380Q4e.LJI = z;
        c664380Q4e.LJII = LJI();
        c664380Q4e.LJIIIIZZ = "search_outer";
        C661490Px5 c661490Px53 = this.LL;
        if (c661490Px53 != null) {
            i = c661490Px53.LJJIFFI;
        } else {
            i = -1;
        }
        ((ConcurrentHashMap) c664380Q4e.LJIIIZ).put("rank", Integer.valueOf(i));
        C661490Px5 c661490Px54 = this.LL;
        if (c661490Px54 == null || (c653660PkS2 = c661490Px54.LJIL) == null || (str = c653660PkS2.LJJJLZIJ) == null) {
            str = "";
        }
        c664380Q4e.LIZJ("card_type", str);
        int i2 = ((C0PRC) this.LLILLJJLI.Ph1().LIZJ()).LL;
        C653660PkS c653660PkSLJIIIZ = LJIIIZ();
        if (c653660PkSLJIIIZ != null && c653660PkSLJIIIZ.LIZJ == 8) {
            strLIZ = "visual";
        } else {
            strLIZ = C0PSI.LIZ(i2);
            if (strLIZ == null) {
                strLIZ = "";
            }
        }
        c664380Q4e.LIZJ("search_type", strLIZ);
        C661490Px5 c661490Px55 = this.LL;
        if (c661490Px55 != null && (c653660PkS = c661490Px55.LJIL) != null && (str2 = c653660PkS.LJIIJ) != null) {
            str4 = str2;
        }
        c664380Q4e.LIZJ("search_id", str4);
        C653660PkS c653660PkSLJIIIZ2 = LJIIIZ();
        if (c653660PkSLJIIIZ2 != null && (map = c653660PkSLJIIIZ2.LJJJJJL) != null && (!map.isEmpty())) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c664380Q4e.LIZJ(entry.getKey(), entry.getValue());
            }
        }
        return c664380Q4e;
    }

    public final void LJIILLIIL(Map<String, String> map) {
        String str;
        String strLJIIIIZZ;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String strInvoke;
        String str8;
        String str9;
        boolean z;
        String str10;
        String str11;
        String str12;
        String str13;
        Integer num;
        String str14;
        String str15;
        String str16;
        Map<String, String> map2;
        Map<String, String> map3;
        String str17;
        String str18;
        String str19;
        String str20;
        C653660PkS c653660PkSLJIIIZ;
        Map<String, String> map4;
        String str21;
        Aweme awemeLJII;
        HashMap<String, String> searchExtraParams;
        String str22;
        String strInvoke2;
        Function1<? super Aweme, String> function1;
        Function1<? super Aweme, String> function12;
        if (LJII() == null) {
            return;
        }
        final C653660PkS c653660PkSLJIIIZ2 = LJIIIZ();
        C1386170mAx c1386170mAx = new C1386170mAx(c653660PkSLJIIIZ2) { // from class: X.0QtF
            public static final /* synthetic */ int LLIIII = 0;
            public final C653660PkS LLII;

            @Override // X.AbstractC1386140mAu, X.AbstractC1386130mAt
            public final void LJII() {
                super.LJII();
                LIZIZ(C666580QCq.LIZIZ(this.LJJJJZ, "play_time", this.LIZLLL, this.LLII));
                C1380890m2R.LJ(this.LJJJJZ, this);
            }

            {
                this.LLII = c653660PkSLJIIIZ2;
            }
        };
        C653660PkS c653660PkSLJIIIZ3 = LJIIIZ();
        Map<String, String> map5 = null;
        if (c653660PkSLJIIIZ3 != null) {
            str = c653660PkSLJIIIZ3.LJIIIIZZ;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            strLJIIIIZZ = LJIIIIZZ();
        } else {
            C653660PkS c653660PkSLJIIIZ4 = LJIIIZ();
            if (c653660PkSLJIIIZ4 != null) {
                strLJIIIIZZ = c653660PkSLJIIIZ4.LJIIIIZZ;
            } else {
                strLJIIIIZZ = null;
            }
        }
        if (!C123100dR.LIZ(strLJIIIIZZ) || strLJIIIIZZ == null) {
            strLJIIIIZZ = "general_search";
        }
        c1386170mAx.LIZLLL = strLJIIIIZZ;
        C653660PkS c653660PkSLJIIIZ5 = LJIIIZ();
        if (c653660PkSLJIIIZ5 != null) {
            str2 = c653660PkSLJIIIZ5.LJIIIZ;
        } else {
            str2 = null;
        }
        c1386170mAx.LJJLIIIJL = str2;
        C661490Px5 c661490Px5 = this.LL;
        String str23 = "";
        if (c661490Px5 == null || (str3 = c661490Px5.LJIJJ) == null) {
            str3 = "";
        }
        c1386170mAx.LJJLIL = str3;
        c1386170mAx.LJIJI(LJII());
        C653660PkS c653660PkSLJIIIZ6 = LJIIIZ();
        if (c653660PkSLJIIIZ6 != null) {
            str4 = c653660PkSLJIIIZ6.LJIJJLI;
        } else {
            str4 = null;
        }
        c1386170mAx.LJLJLLL = str4;
        C661490Px5 c661490Px52 = this.LL;
        if (c661490Px52 == null || (str5 = c661490Px52.LJIJI) == null) {
            str5 = "";
        }
        c1386170mAx.LJJLIIIJLJLI = str5;
        if (c661490Px52 == null || (str6 = c661490Px52.LJIJ) == null) {
            str6 = "";
        }
        c1386170mAx.LJIIZILJ = str6;
        boolean z2 = false;
        c1386170mAx.LJJLL = 0;
        C653660PkS c653660PkSLJIIIZ7 = LJIIIZ();
        if (c653660PkSLJIIIZ7 != null) {
            str7 = c653660PkSLJIIIZ7.LJIIJ;
        } else {
            str7 = null;
        }
        c1386170mAx.LJLJI = str7;
        C653660PkS c653660PkSLJIIIZ8 = LJIIIZ();
        if (c653660PkSLJIIIZ8 != null && (function12 = c653660PkSLJIIIZ8.LJJLIIIJL) != null) {
            strInvoke = function12.invoke(LJII());
        } else {
            strInvoke = null;
        }
        c1386170mAx.LJJIII = strInvoke;
        C653660PkS c653660PkSLJIIIZ9 = LJIIIZ();
        if (c653660PkSLJIIIZ9 != null) {
            str8 = c653660PkSLJIIIZ9.LJIIJ;
        } else {
            str8 = null;
        }
        if (str8 == null || !C123100dR.LIZ(str8)) {
            str8 = ((C0PRC) this.LLILLJJLI.Ph1().LIZJ()).LLILLL;
        }
        c1386170mAx.LJJIJLIJ = str8;
        if (C256020A1o.LIZ()) {
            C653660PkS c653660PkSLJIIIZ10 = LJIIIZ();
            if (c653660PkSLJIIIZ10 == null || (function1 = c653660PkSLJIIIZ10.LJJLI) == null || (strInvoke2 = function1.invoke(LJII())) == null) {
                strInvoke2 = ((C0PRC) this.LLILLJJLI.Ph1().LIZJ()).LLL;
            }
            c1386170mAx.LJJII = strInvoke2;
        } else {
            c1386170mAx.LJJII = LJIIJ();
        }
        C653660PkS c653660PkSLJIIIZ11 = LJIIIZ();
        if (c653660PkSLJIIIZ11 == null || (str9 = c653660PkSLJIIIZ11.LJFF) == null) {
            str9 = ((C0PRC) this.LLILLJJLI.Ph1().LIZJ()).LLIZLLLIL;
        }
        c1386170mAx.LJLJJI = str9;
        c1386170mAx.LIZIZ(C666580QCq.LIZIZ(LJII(), "video_play_finish", LJIIIIZZ(), null));
        c1386170mAx.LIZIZ(LJIIJJI(LJII()));
        C661490Px5 c661490Px53 = this.LL;
        if (c661490Px53 != null) {
            z = c661490Px53.LJJIIZ;
        } else {
            z = false;
        }
        if (z) {
            str10 = "1";
        } else {
            str10 = CardStruct.IStatusCode.DEFAULT;
        }
        c1386170mAx.LJ("search_is_caption_translated", str10);
        C661490Px5 c661490Px54 = this.LL;
        if (c661490Px54 != null && c661490Px54.LJJIIZI) {
            str11 = "1";
        } else {
            str11 = CardStruct.IStatusCode.DEFAULT;
        }
        c1386170mAx.LJ("search_is_title_translated", str11);
        c1386170mAx.LJ("is_page", ((C0PRC) this.LLILLJJLI.Ph1().LIZJ()).LLJZ);
        c1386170mAx.LJ("token_type", LJIIL());
        if (LJIIL().length() == 0 && (awemeLJII = LJII()) != null && (searchExtraParams = AwemeBizExtKt.getSearchExtraParams(awemeLJII)) != null && (str22 = searchExtraParams.get("token_type")) != null) {
            c1386170mAx.LJ("token_type", str22);
        }
        if (LJIIIZ() != null && LJIIIZ().LJJII.length() > 0) {
            c1386170mAx.LJ("token_type", LJIIIZ().LJJII);
        }
        C653660PkS c653660PkSLJIIIZ12 = LJIIIZ();
        if (c653660PkSLJIIIZ12 != null) {
            str12 = c653660PkSLJIIIZ12.LJJII;
        } else {
            str12 = null;
        }
        if (Intrinsics.LJFF(str12, "tikbot")) {
            c1386170mAx.LIZLLL(((C646370PWx) C0Q3E.LJI().wO2().LIZJ()).LLILZ, "is_quote_video");
        }
        C653660PkS c653660PkSLJIIIZ13 = LJIIIZ();
        if (c653660PkSLJIIIZ13 != null) {
            str13 = c653660PkSLJIIIZ13.LJJII;
        } else {
            str13 = null;
        }
        if (Intrinsics.LJFF(str13, "viral_song")) {
            c1386170mAx.LJ("is_music_chart", "1");
        }
        C653660PkS c653660PkSLJIIIZ14 = LJIIIZ();
        if (c653660PkSLJIIIZ14 != null && (str21 = c653660PkSLJIIIZ14.LJJJJIZL) != null) {
            c1386170mAx.LJ("search_source", str21);
        }
        if (LJIIIZ() != null && LJIIIZ().LJJIII.length() > 0) {
            c1386170mAx.LJ("is_fullscreen", LJIIIZ().LJJIII);
        } else {
            c1386170mAx.LJ("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        }
        if (LJIIIZ() != null && LJIIIZ().LJJIIJ.length() > 0) {
            c1386170mAx.LJ("max_shoot_time", LJIIIZ().LJJIIJ);
        }
        if (LJIIIZ() != null && (c653660PkSLJIIIZ = LJIIIZ()) != null && (map4 = c653660PkSLJIIIZ.LJJJJJ) != null && (!map4.isEmpty())) {
            c1386170mAx.LIZIZ(LJIIIZ().LJJJJJ);
        }
        C653660PkS c653660PkSLJIIIZ15 = LJIIIZ();
        if (c653660PkSLJIIIZ15 != null && (str20 = c653660PkSLJIIIZ15.LJJIIJZLJL) != null && str20.length() > 0) {
            c1386170mAx.LJ("entity_type", str20);
        }
        C653660PkS c653660PkSLJIIIZ16 = LJIIIZ();
        if (c653660PkSLJIIIZ16 != null && (str19 = c653660PkSLJIIIZ16.LJJIIZI) != null && str19.length() > 0) {
            c1386170mAx.LJ("is_entity", str19);
        }
        if (LJIIIZ() != null && LJIIIZ().LJIJ.length() > 0) {
            C653660PkS c653660PkSLJIIIZ17 = LJIIIZ();
            if (c653660PkSLJIIIZ17 != null) {
                str18 = c653660PkSLJIIIZ17.LJIJ;
            } else {
                str18 = null;
            }
            c1386170mAx.LJIIJ = str18;
        }
        C653660PkS c653660PkSLJIIIZ18 = LJIIIZ();
        if ((c653660PkSLJIIIZ18 != null && (num = c653660PkSLJIIIZ18.LJIILLIIL) != null) || (num = ((C646370PWx) this.LLILLJJLI.wO2().LIZJ()).LLJILJIL) != null) {
            c1386170mAx.LIZLLL(num.intValue(), "universal_rank");
            C653660PkS c653660PkSLJIIIZ19 = LJIIIZ();
            if (c653660PkSLJIIIZ19 == null || (str17 = c653660PkSLJIIIZ19.LJIIZILJ) == null) {
                str17 = ((C646370PWx) this.LLILLJJLI.wO2().LIZJ()).LLJILJILJ;
            }
            c1386170mAx.LJ("insert_type", str17);
        }
        C661490Px5 c661490Px55 = this.LL;
        if (c661490Px55 == null || (str14 = c661490Px55.LJJII) == null) {
            str14 = "";
        }
        if (C123100dR.LIZ(str14)) {
            c1386170mAx.LJ("item_rank", str14);
        }
        c1386170mAx.LIZIZ(map);
        String strLIZ = C436190H8n.LIZ(LJII());
        if (strLIZ != null) {
            c1386170mAx.LJ("aweme_id", strLIZ);
        }
        int i = ((C0PRC) this.LLILLJJLI.Ph1().LIZJ()).LL;
        C653660PkS c653660PkSLJIIIZ20 = LJIIIZ();
        if (c653660PkSLJIIIZ20 != null && c653660PkSLJIIIZ20.LIZJ == 8) {
            str23 = "visual";
        } else {
            String strLIZ2 = C0PSI.LIZ(i);
            if (strLIZ2 != null) {
                str23 = strLIZ2;
            }
        }
        c1386170mAx.LJ("search_type", str23);
        C649470Pdh c649470Pdh = C649470Pdh.LIZ;
        Aweme awemeLJII2 = LJII();
        c649470Pdh.getClass();
        c1386170mAx.LJIIL = !C649470Pdh.LJIILLIIL(awemeLJII2);
        C653400Pk2.LIZIZ(LJII(), c1386170mAx);
        C645930PVf.LIZ(c1386170mAx);
        C653660PkS c653660PkSLJIIIZ21 = LJIIIZ();
        if (c653660PkSLJIIIZ21 != null) {
            str15 = c653660PkSLJIIIZ21.LJJJJLL;
        } else {
            str15 = null;
        }
        c1386170mAx.LJ("module", str15);
        C653660PkS c653660PkSLJIIIZ22 = LJIIIZ();
        if (c653660PkSLJIIIZ22 != null && (map3 = c653660PkSLJIIIZ22.LJJJJJL) != null && (!map3.isEmpty())) {
            c1386170mAx.LIZIZ(map3);
        }
        C653660PkS c653660PkSLJIIIZ23 = LJIIIZ();
        if (c653660PkSLJIIIZ23 != null && (map2 = c653660PkSLJIIIZ23.LJJJJJL) != null) {
            str16 = map2.get("is_from_landing_page");
        } else {
            str16 = null;
        }
        Integer numLIZJ = C20252814Mk.LIZJ(str16);
        if (numLIZJ != null && numLIZJ.intValue() == 1) {
            z2 = true;
        }
        if (this.LLILZ || z2) {
            C653660PkS c653660PkSLJIIIZ24 = LJIIIZ();
            if (c653660PkSLJIIIZ24 != null) {
                map5 = c653660PkSLJIIIZ24.LJJJJJL;
            }
            C661570PxD.LIZ(c1386170mAx, map5, LJII());
        }
        c1386170mAx.LIZIZ(C659470Ptp.LIZIZ(LJII()));
        c1386170mAx.LJIILJJIL();
    }

    public final void LJIL(String str) {
        C664390Q4f c664390Q4f = this.LLJIJIL;
        if (c664390Q4f != null) {
            if (str == null) {
                str = "";
            }
            c664390Q4f.LIZJ(str, "search_outer");
        }
    }

    @Override // X.InterfaceC661680PxO, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPausePlay(String str) {
        C664390Q4f c664390Q4f;
        C0N0Y c0n0y;
        this.LLJILLL.put(Long.valueOf(System.currentTimeMillis()), "onPausePlay");
        C661490Px5 c661490Px5 = this.LL;
        if (c661490Px5 != null) {
            c661490Px5.LJ();
        }
        Aweme awemeLJII = LJII();
        if (awemeLJII == null || !awemeLJII.isAd()) {
            LJIJJLI();
        }
        C661490Px5 c661490Px52 = this.LL;
        if (c661490Px52 != null && (c0n0y = c661490Px52.LJIILIIL) != null && (c0n0y.isPlaying() || c0n0y.isPaused())) {
            C584250Mvn.LIZIZ(c0n0y, str);
        }
        if (C664490Q4p.LIZ() && (c664390Q4f = this.LLJIJIL) != null) {
            if (str == null) {
                str = "";
            }
            c664390Q4f.LIZJ(str, "search_outer");
        }
    }

    @Override // X.InterfaceC661680PxO, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompletedFirstTime(String str) {
        LJIILLIIL(C2097608Jq.LJ());
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        int i;
        this.LLJILLL.put(Long.valueOf(System.currentTimeMillis()), "onPlayPrepare");
        Aweme awemeLJII = LJII();
        if (awemeLJII != null) {
            C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
            C661490Px5 c661490Px5 = this.LL;
            if (c661490Px5 != null) {
                i = c661490Px5.LJIJJLI;
            } else {
                i = -1;
            }
            c1589640rT8.onAwemeRead(i, awemeLJII, LJIIIIZZ());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        this.LLJILLL.put(Long.valueOf(System.currentTimeMillis()), "onPlayStop");
        C584830Mwj c584830Mwj = (C584830Mwj) this.LLILZIL.getValue();
        if (c584830Mwj != null) {
            c584830Mwj.LIZJ();
        }
    }

    @Override // X.InterfaceC661680PxO, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        long j;
        C664400Q4g c664400Q4g;
        C664400Q4g c664400Q4g2;
        C664400Q4g c664400Q4g3;
        String str2 = str;
        this.LLIZ = true;
        C661490Px5 c661490Px5 = this.LL;
        long j2 = 0;
        if (c661490Px5 != null && (c664400Q4g3 = c661490Px5.LJJIJIL) != null) {
            j = c664400Q4g3.LIZJ;
        } else {
            j = 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j > 0) {
            j2 = jCurrentTimeMillis - j;
        }
        C661490Px5 c661490Px52 = this.LL;
        if (c661490Px52 != null && (c664400Q4g2 = c661490Px52.LJJIJIL) != null && c664400Q4g2.LJIIJJI == 1) {
            c664400Q4g2.LJIIJJI = 3;
        }
        this.LLJILLL.put(Long.valueOf(jCurrentTimeMillis), "onResumePlay");
        LJIJ();
        if (C664490Q4p.LIZ()) {
            C664390Q4f c664390Q4f = this.LLJIJIL;
            if (c664390Q4f == null) {
                c664390Q4f = new C664390Q4f();
                this.LLJIJIL = c664390Q4f;
            }
            C664460Q4m c664460Q4m = new C664460Q4m(this, j2);
            if (c664390Q4f.LIZJ == null) {
                c664390Q4f.LIZJ = (C664380Q4e) c664460Q4m.invoke();
            }
            if (str2 == null) {
                str2 = "";
            }
            C661490Px5 c661490Px53 = this.LL;
            if (c661490Px53 != null) {
                c664400Q4g = c661490Px53.LJJIJIL;
            } else {
                c664400Q4g = null;
            }
            c664390Q4f.LJ(str2, "search_outer", j2, c664400Q4g);
        }
    }

    public C664340Q4a(C661490Px5 c661490Px5, ISearchContextAbility iSearchContextAbility) {
        this.LL = c661490Px5;
        this.LLILLJJLI = iSearchContextAbility;
        if (C256020A1o.LIZ()) {
            C653660PkS c653660PkSLJIIIZ = LJIIIZ();
            if (c653660PkSLJIIIZ != null) {
                c653660PkSLJIIIZ.LJJLI = new AwS589S0100000_10(this, 491);
                c653660PkSLJIIIZ.LJJLIIIJL = AFwS241S0000000_10.get$arr$(476);
            }
        } else {
            C653660PkS c653660PkSLJIIIZ2 = LJIIIZ();
            if (c653660PkSLJIIIZ2 != null) {
                c653660PkSLJIIIZ2.LJJLIIIJL = AFwS241S0000000_10.get$arr$(477);
            }
        }
        this.LLILLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(533));
        this.LLILZIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(535));
        this.LLILZLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(534));
        this.LLJILLL = new TreeMap<>();
    }

    public final void LJIILJJIL(String str, List<? extends Map<String, ? extends Object>> list) {
        String str2;
        String str3;
        String strLIZ;
        String string;
        String str4;
        int i;
        LinkedHashSet linkedHashSet;
        C653660PkS c653660PkS;
        String str5;
        C653660PkS c653660PkS2;
        Object obj;
        C653660PkS c653660PkS3;
        C653660PkS c653660PkS4;
        if (!C291320BbO.LIZ()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0QGC sessionInfo = C0QO8.LIZ.getSessionInfo();
        linkedHashMap.put("search_session_id", sessionInfo.LIZ);
        C661490Px5 c661490Px5 = this.LL;
        String str6 = "";
        if (c661490Px5 == null || (c653660PkS4 = c661490Px5.LJIL) == null || (str2 = c653660PkS4.LJIIJ) == null) {
            str2 = "";
        }
        linkedHashMap.put("search_id", str2);
        C661490Px5 c661490Px52 = this.LL;
        if (c661490Px52 == null || (c653660PkS3 = c661490Px52.LJIL) == null || (str3 = c653660PkS3.LJJJLZIJ) == null) {
            str3 = "";
        }
        linkedHashMap.put("card_type", str3);
        linkedHashMap.put("enter_from", LJI());
        int i2 = ((C0PRC) this.LLILLJJLI.Ph1().LIZJ()).LL;
        C653660PkS c653660PkSLJIIIZ = LJIIIZ();
        if (c653660PkSLJIIIZ != null && c653660PkSLJIIIZ.LIZJ == 8) {
            strLIZ = "visual";
        } else {
            strLIZ = C0PSI.LIZ(i2);
            if (strLIZ == null) {
                strLIZ = "";
            }
        }
        linkedHashMap.put("search_type", strLIZ);
        C664370Q4d c664370Q4d = new C664370Q4d();
        Map map = (Map) C13LP.LJJJLL(list);
        if (map == null || (obj = map.get("crosstalk_id")) == null || (string = obj.toString()) == null) {
            string = "";
        }
        c664370Q4d.LIZ = string;
        c664370Q4d.LIZIZ = sessionInfo.LIZ;
        C661490Px5 c661490Px53 = this.LL;
        if (c661490Px53 == null || (c653660PkS2 = c661490Px53.LJIL) == null || (str4 = c653660PkS2.LJIIJ) == null) {
            str4 = "";
        }
        c664370Q4d.LIZJ = str4;
        c664370Q4d.LIZLLL = LJI();
        c664370Q4d.LJ = strLIZ;
        C661490Px5 c661490Px54 = this.LL;
        if (c661490Px54 != null && (c653660PkS = c661490Px54.LJIL) != null && (str5 = c653660PkS.LJJJLZIJ) != null) {
            str6 = str5;
        }
        c664370Q4d.LJFF = str6;
        c664370Q4d.LJII = str;
        if (c661490Px54 != null) {
            i = c661490Px54.LJJIFFI;
        } else {
            i = -1;
        }
        c664370Q4d.LJI = i;
        c664370Q4d.LJIIIIZZ = this.LLJILJILJ;
        TreeMap<Long, String> treeMap = new TreeMap<>();
        treeMap.putAll(this.LLJILLL);
        c664370Q4d.LJIIIZ = treeMap;
        c664370Q4d.LJIIJ = list;
        c664370Q4d.LJIIJJI = this.LLJILJIL;
        this.LLJJ = c664370Q4d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C664450Q4l.LIZ;
        Set set = (Set) concurrentHashMap.get(c664370Q4d.LIZ);
        if (set != null) {
            set.remove(c664370Q4d);
        }
        C823050WQl.LIZJ().execute(new ARunnableS43S0300000_10(set, c664370Q4d, linkedHashMap, 21));
        if (set == null) {
            linkedHashSet = new LinkedHashSet();
        } else {
            linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(set);
        }
        linkedHashSet.add(c664370Q4d);
        concurrentHashMap.put(c664370Q4d.LIZ, linkedHashSet);
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        C655580PnY.LIZLLL(this, j);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        String str2;
        long jCurrentTimeMillis;
        C653660PkS c653660PkS;
        String str3;
        String str4;
        C653660PkS c653660PkS2;
        C664390Q4f c664390Q4f = this.LLJIJIL;
        if (c664390Q4f != null) {
            c664390Q4f.LIZIZ(z);
        }
        TreeMap<Long, String> treeMap = this.LLJILLL;
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        if (z) {
            str2 = "onBufferingStart";
        } else {
            str2 = "onBufferingEnd";
        }
        treeMap.put(lValueOf, str2);
        if (!C664480Q4o.LIZ()) {
            return;
        }
        if (z) {
            this.LLIZLLLIL = System.currentTimeMillis();
            this.LLJI++;
        } else {
            if (this.LLIZLLLIL > 0) {
                jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZLLLIL;
            } else {
                jCurrentTimeMillis = 0;
            }
            this.LLJ += jCurrentTimeMillis;
        }
        int i = this.LLJI;
        String str5 = "";
        if (i >= 3) {
            C666110QAv c666110QAv = new C666110QAv(306, "video has been buffered three times");
            C661490Px5 c661490Px5 = this.LL;
            if (c661490Px5 == null || (c653660PkS2 = c661490Px5.LJIL) == null || (str4 = c653660PkS2.LJJJLZIJ) == null) {
                str4 = "";
            }
            c666110QAv.LIZLLL = str4;
            c666110QAv.LJ = LJI();
            c666110QAv.LIZ("aweme_id", str);
            c666110QAv.LIZ("buffer_count", String.valueOf(i));
            C0QO8.LIZ.LJII(c666110QAv);
            this.LLJI = 0;
        }
        long j = this.LLJ;
        if (j > 3000) {
            C666110QAv c666110QAv2 = new C666110QAv(305, "video has been buffered more than three seconds");
            C661490Px5 c661490Px52 = this.LL;
            if (c661490Px52 != null && (c653660PkS = c661490Px52.LJIL) != null && (str3 = c653660PkS.LJJJLZIJ) != null) {
                str5 = str3;
            }
            c666110QAv2.LIZLLL = str5;
            c666110QAv2.LJ = LJI();
            c666110QAv2.LIZ("aweme_id", str);
            c666110QAv2.LIZ("buffer_duration", String.valueOf(j));
            C0QO8.LIZ.LJII(c666110QAv2);
            this.LLJ = 0L;
        }
    }

    @Override // X.InterfaceC661680PxO, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onLoopPlay(String str, int i) {
        String str2;
        String strLJIIIIZZ;
        if (C300370Bpz.LIZ()) {
            C653660PkS c653660PkSLJIIIZ = LJIIIZ();
            String str3 = null;
            if (c653660PkSLJIIIZ != null) {
                str2 = c653660PkSLJIIIZ.LJIIIIZZ;
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                strLJIIIIZZ = LJIIIIZZ();
            } else {
                C653660PkS c653660PkSLJIIIZ2 = LJIIIZ();
                if (c653660PkSLJIIIZ2 == null || (strLJIIIIZZ = c653660PkSLJIIIZ2.LJIIIIZZ) == null) {
                    strLJIIIIZZ = "";
                }
            }
            C584830Mwj c584830Mwj = (C584830Mwj) this.LLILZIL.getValue();
            if (c584830Mwj != null) {
                Aweme awemeLJII = LJII();
                C653660PkS c653660PkSLJIIIZ3 = LJIIIZ();
                if (c653660PkSLJIIIZ3 != null) {
                    str3 = c653660PkSLJIIIZ3.LJIIJ;
                }
                c584830Mwj.LIZ(awemeLJII, strLJIIIIZZ, str3, null, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        int i;
        String str2;
        C653660PkS c653660PkS;
        C664400Q4g c664400Q4g;
        C661490Px5 c661490Px5 = this.LL;
        if (c661490Px5 != null && (c664400Q4g = c661490Px5.LJJIJIL) != null && c664400Q4g.LJIIJJI == 1) {
            c664400Q4g.LJIIJJI = 2;
        }
        this.LLJILLL.put(Long.valueOf(System.currentTimeMillis()), "onPlayFailed");
        C584830Mwj c584830Mwj = (C584830Mwj) this.LLILZIL.getValue();
        if (c584830Mwj != null) {
            c584830Mwj.LIZJ();
        }
        if (c1481290oeN != null) {
            if (C664480Q4o.LIZ()) {
                if (this.LLIZ) {
                    i = 302;
                } else {
                    i = 301;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("media error code: ");
                sbLIZ.append(c1481290oeN.LJ);
                sbLIZ.append(", extra: ");
                sbLIZ.append(c1481290oeN.LJFF);
                C666110QAv c666110QAv = new C666110QAv(i, C2188811AlT.LIZIZ(sbLIZ));
                C661490Px5 c661490Px52 = this.LL;
                if (c661490Px52 == null || (c653660PkS = c661490Px52.LJIL) == null || (str2 = c653660PkS.LJJJLZIJ) == null) {
                    str2 = "";
                }
                c666110QAv.LIZLLL = str2;
                c666110QAv.LJ = LJI();
                c666110QAv.LIZ("aweme_id", str);
                C0QO8.LIZ.LJII(c666110QAv);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        long j;
        C664400Q4g c664400Q4g;
        int i;
        int awemeType;
        Long l;
        Long lValueOf;
        C664400Q4g c664400Q4g2;
        String str2;
        boolean z;
        C664400Q4g c664400Q4g3;
        String str3;
        String str4;
        C664400Q4g c664400Q4g4;
        C653660PkS c653660PkS;
        C664400Q4g c664400Q4g5;
        C0N0Y c0n0y;
        String aid;
        String aid2;
        C664400Q4g c664400Q4g6;
        C664400Q4g c664400Q4g7;
        C664400Q4g c664400Q4g8;
        this.LLIZ = true;
        C661490Px5 c661490Px5 = this.LL;
        long j2 = 0;
        if (c661490Px5 != null && (c664400Q4g8 = c661490Px5.LJJIJIL) != null) {
            j = c664400Q4g8.LIZJ;
        } else {
            j = 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j > 0) {
            C661490Px5 c661490Px52 = this.LL;
            if (c661490Px52 != null && (c664400Q4g7 = c661490Px52.LJJIJIL) != null) {
                c664400Q4g7.LJIIIZ = jCurrentTimeMillis;
            }
            j2 = jCurrentTimeMillis - j;
        }
        C661490Px5 c661490Px53 = this.LL;
        if (c661490Px53 != null && (c664400Q4g6 = c661490Px53.LJJIJIL) != null) {
            c664400Q4g6.LJIIIIZZ = c1480420ocy.getOnRenderTime();
        }
        C661490Px5 c661490Px54 = this.LL;
        if (c661490Px54 != null && (c0n0y = c661490Px54.LJIILIIL) != null) {
            InterfaceC1483670oiD interfaceC1483670oiDLJIILL = c0n0y.LJIILL();
            Aweme aweme = c661490Px54.LIZJ;
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            C1480660odM c1480660odMLJIJ = interfaceC1483670oiDLJIILL.LJIJ(aid);
            if (c1480660odMLJIJ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("recordPrepareTimeInfo, id:");
                Aweme aweme2 = c661490Px54.LIZJ;
                if (aweme2 != null) {
                    aid2 = aweme2.getAid();
                } else {
                    aid2 = null;
                }
                sbLIZ.append(aid2);
                sbLIZ.append(", begin:");
                sbLIZ.append(c1480660odMLJIJ.LIZLLL);
                sbLIZ.append(", end:");
                sbLIZ.append(c1480660odMLJIJ.LJ);
                sbLIZ.append(", prepare:");
                sbLIZ.append(c1480660odMLJIJ.LJFF);
                sbLIZ.append(", ttPlayer prepare:");
                sbLIZ.append(c1480660odMLJIJ.LJI);
                C2188811AlT.LIZIZ(sbLIZ);
                C664400Q4g c664400Q4g9 = c661490Px54.LJJIJIL;
                if (c664400Q4g9 != null) {
                    c664400Q4g9.LJFF = c1480660odMLJIJ.LIZLLL;
                    c664400Q4g9.LJI = c1480660odMLJIJ.LJ;
                    c664400Q4g9.LJII = c1480660odMLJIJ.LJI;
                }
            }
        }
        C661490Px5 c661490Px55 = this.LL;
        if (c661490Px55 != null && (c664400Q4g5 = c661490Px55.LJJIJIL) != null && c664400Q4g5.LJIIJJI == 1) {
            c664400Q4g5.LJIIJJI = 3;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("<onRenderFirstFrame>, sourceId: ");
        sbLIZ2.append(str);
        sbLIZ2.append(", duration:");
        sbLIZ2.append(j2);
        sbLIZ2.append(" ms, ");
        C661490Px5 c661490Px56 = this.LL;
        if (c661490Px56 != null) {
            c664400Q4g = c661490Px56.LJJIJIL;
        } else {
            c664400Q4g = null;
        }
        sbLIZ2.append(c664400Q4g);
        C2188811AlT.LIZIZ(sbLIZ2);
        this.LLJILLL.put(Long.valueOf(System.currentTimeMillis()), "renderFirstFrame");
        String strLJIIIIZZ = LJIIIIZZ();
        C661490Px5 c661490Px57 = this.LL;
        if (c661490Px57 != null) {
            i = c661490Px57.LJIJJLI;
        } else {
            i = -1;
        }
        Aweme awemeLJII = LJII();
        if (awemeLJII != null) {
            awemeType = awemeLJII.getAwemeType();
        } else {
            awemeType = 0;
        }
        C1387270mCj.LIZ(i, awemeType, LJII(), strLJIIIIZZ, str, "");
        C661490Px5 c661490Px58 = this.LL;
        if (c661490Px58 != null) {
            c661490Px58.LJ();
        }
        Aweme awemeLJII2 = LJII();
        if (awemeLJII2 == null) {
            z = true;
        } else {
            C653660PkS c653660PkSLJIIIZ = LJIIIZ();
            C661490Px5 c661490Px59 = this.LL;
            C0PRC c0prc = (C0PRC) this.LLILLJJLI.Ph1().LIZJ();
            C646370PWx c646370PWx = (C646370PWx) this.LLILLJJLI.wO2().LIZJ();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (c661490Px59 != null) {
                l = c661490Px59.LJJIJIIJIL;
                lValueOf = Long.valueOf(c661490Px59.LJJIJL);
                c664400Q4g2 = c661490Px59.LJJIJIL;
                str2 = c661490Px59.LJJIJLIJ;
            } else {
                l = null;
                lValueOf = null;
                c664400Q4g2 = null;
                str2 = null;
            }
            z = true;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C664350Q4b(c653660PkSLJIIIZ, this, awemeLJII2, c0prc, c661490Px59, l, lValueOf, jCurrentTimeMillis, c664400Q4g2, str2, jCurrentTimeMillis2, c646370PWx, null), 3);
        }
        LJIJ();
        C584080MvW.LIZ();
        C639500P6m.LIZ(z);
        C661490Px5 c661490Px510 = this.LL;
        if (c661490Px510 != null && (c664400Q4g3 = c661490Px510.LJJIJIL) != null && C664480Q4o.LIZ()) {
            long jLIZJ = c664400Q4g3.LIZJ();
            if (C664560Q4w.LIZ < 0) {
                C664560Q4w.LIZ = C0C64.LJIILLIIL().LJIJ(31744, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, "search_first_video_time_threshold", z);
            }
            if (jLIZJ < C664560Q4w.LIZ && j2 > C664470Q4n.LIZ().videoPlayDuration) {
                C666110QAv c666110QAv = new C666110QAv(303, "from play to first frame duration is more than one seconds");
                C661490Px5 c661490Px511 = this.LL;
                if (c661490Px511 == null || (c653660PkS = c661490Px511.LJIL) == null || (str3 = c653660PkS.LJJJLZIJ) == null) {
                    str3 = "";
                }
                c666110QAv.LIZLLL = str3;
                c666110QAv.LJ = LJI();
                c666110QAv.LIZIZ(Long.valueOf(j2), "duration");
                c666110QAv.LIZ("aweme_id", str);
                C661490Px5 c661490Px512 = this.LL;
                if (c661490Px512 == null || (c664400Q4g4 = c661490Px512.LJJIJIL) == null || (str4 = c664400Q4g4.LJIIJ) == null) {
                    str4 = "";
                }
                c666110QAv.LIZ("play_source", str4);
                c666110QAv.LIZ("duration", String.valueOf(j2));
                C0QO8.LIZ.LJII(c666110QAv);
            }
        }
        if (C664490Q4p.LIZ()) {
            C664390Q4f c664390Q4f = this.LLJIJIL;
            if (c664390Q4f == null) {
                c664390Q4f = new C664390Q4f();
                this.LLJIJIL = c664390Q4f;
            }
            c664390Q4f.LIZLLL(LJFF(j2));
        }
    }
}
