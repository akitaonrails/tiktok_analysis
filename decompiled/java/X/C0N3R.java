package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0N3R, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N3R implements OnUIPlayListener {
    public final C0N3W LL;
    public long LLILZLL;
    public final C603820NmG<String, Long> LLILLJJLI = new C603820NmG<>(100);
    public final Map<String, Long> LLILLL = new LinkedHashMap();
    public final CopyOnWriteArraySet<C0N3S> LLILZ = new CopyOnWriteArraySet<>();
    public String LLILZIL = "";
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(529));
    public final C054G LLIZLLLIL = C2296808zG.LIZ(C0PEM.LIZJ);
    public final C01GW LLJ = C587650N3b.LIZ("AnalyticsController");

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C583620Mum.LIZ(this);
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
    public final /* synthetic */ void onBuffering(String str, boolean z) {
        C583620Mum.LJ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        C583620Mum.LJFF(this, str, z, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(boolean z) {
        C583620Mum.LJI(this, z);
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
    public final /* synthetic */ void onDecoderBuffering(boolean z) {
        C583620Mum.LJIIL(this, z);
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
    public final /* synthetic */ void onLoopPlay(String str, int i) {
        C583620Mum.LJIILL(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
        C583620Mum.LJIILLIIL(this, str, c1480290ocl);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str) {
        C583620Mum.LJIIZILJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C583620Mum.LJIJJ(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
        C583620Mum.LJIJJLI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(C1481290oeN c1481290oeN) {
        C583620Mum.LJJIFFI(this, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJ(this, str, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPause(String str) {
        C583620Mum.LJJII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepare(String str) {
        C583620Mum.LJJIII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C583620Mum.LJJIIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(float f) {
        C583620Mum.LJJIIJZLJL(this, f);
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
    public final /* synthetic */ void onPlayStop(String str) {
        C583620Mum.LJJIJ(this, str);
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
    public final /* synthetic */ void onPreparePlay(String str) {
        C583620Mum.LJJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        C583620Mum.LJJJJ(this, c1480420ocy);
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
    public final /* synthetic */ void onResumePlay(String str) {
        C583620Mum.LJJJJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJLI(this, c1481290oeN);
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

    public final IAwemeService LIZIZ() {
        return (IAwemeService) this.LLIZ.getValue();
    }

    public final long LIZJ() {
        Object next;
        Map<String, Long> map = this.LLILLL;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((Number) ((Map.Entry) it2.next()).getValue()).longValue()));
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            next = it3.next();
            while (it3.hasNext()) {
                next = Long.valueOf(((Number) next).longValue() + ((Number) it3.next()).longValue());
            }
        } else {
            next = null;
        }
        Long l = (Long) next;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public C0N3R(C0N3W c0n3w) {
        this.LL = c0n3w;
    }

    public static Map LIZ(Aweme aweme) {
        String str;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("author_id", AwemeExtKt.getAuthorUid(aweme));
        pairArr[1] = new Pair("group_id", aweme.getAid());
        pairArr[2] = new Pair("log_pb", aweme.getLogPbString());
        if (aweme.isAd()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[3] = new Pair("is_ad", str);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static String LIZLLL(Aweme aweme) {
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null && !interactStickerStructs.isEmpty()) {
            Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
            while (it2.hasNext()) {
                if (it2.next().getType() == 18) {
                    return "1";
                }
            }
            return CardStruct.IStatusCode.DEFAULT;
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        if (str != null) {
            LJ(str, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[PHI: r1
      0x0084: PHI (r1v14 java.lang.String) = (r1v3 java.lang.String), (r1v15 java.lang.String) binds: [B:27:0x0082, B:25:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e A[PHI: r1
      0x009e: PHI (r1v12 java.lang.String) = (r1v5 java.lang.String), (r1v13 java.lang.String) binds: [B:34:0x009c, B:32:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r10, X.C1480430ocz r11) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0N3R.LJ(java.lang.String, X.0ocz):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str, C1480430ocz c1480430ocz) {
        C0N3W c0n3w;
        C0N3S c0n3s;
        C583620Mum.LJIJ(this, str, c1480430ocz);
        if (str != null) {
            LJ(str, c1480430ocz);
            Aweme awemeLLILZ = LIZIZ().LLILZ(str);
            if ((awemeLLILZ != null || ((c0n3s = (C0N3S) C13LP.LJJJLIIL(this.LLILZ)) != null && (awemeLLILZ = c0n3s.LJ()) != null && Intrinsics.LJFF(awemeLLILZ.getAid(), str))) && (c0n3w = this.LL) != null) {
                HashMap map = new HashMap();
                map.putAll(LIZ(awemeLLILZ));
                String str2 = c0n3w.LIZ;
                if (str2 != null) {
                    map.put("enter_from", str2);
                }
                Iterator<C0N3S> it2 = this.LLILZ.iterator();
                while (it2.hasNext()) {
                    map.putAll(it2.next().LIZ());
                }
                C20684815ws.LJIILLIIL("video_pause", map);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[PHI: r1
      0x006c: PHI (r1v12 java.lang.String) = (r1v3 java.lang.String), (r1v13 java.lang.String) binds: [B:26:0x006a, B:24:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[PHI: r1
      0x0086: PHI (r1v10 java.lang.String) = (r1v5 java.lang.String), (r1v11 java.lang.String) binds: [B:33:0x0084, B:31:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPlayCompletedFirstTime(java.lang.String r8, X.C1480430ocz r9) {
        /*
            r7 = this;
            X.C583620Mum.LJIL(r7, r8, r9)
            if (r8 == 0) goto Lc2
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = r7.LIZIZ()
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r0.LLILZ(r8)
            r5 = 0
            if (r6 != 0) goto L2a
            java.util.concurrent.CopyOnWriteArraySet<X.0N3S> r0 = r7.LLILZ
            java.lang.Object r0 = X.C13LP.LJJJLIIL(r0)
            X.0N3S r0 = (X.C0N3S) r0
            if (r0 == 0) goto Lc2
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r0.LJ()
            if (r6 == 0) goto Lc2
            java.lang.String r0 = r6.getAid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r8)
            if (r0 == 0) goto Lc2
        L2a:
            X.0N3W r1 = r7.LL
            if (r1 == 0) goto Lc2
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Map r0 = LIZ(r6)
            r3.putAll(r0)
            java.lang.String r1 = r1.LIZ
            if (r1 == 0) goto L43
            java.lang.String r0 = "enter_from"
            r3.put(r0, r1)
        L43:
            java.util.concurrent.CopyOnWriteArraySet<X.0N3S> r0 = r7.LLILZ
            java.util.Iterator r1 = r0.iterator()
        L49:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r1.next()
            X.0N3S r0 = (X.C0N3S) r0
            java.util.Map r0 = r0.LJI()
            r3.putAll(r0)
            goto L49
        L5d:
            X.1D0F r4 = X.C1D0F.LIZ
            java.lang.String r2 = ""
            if (r4 == 0) goto L69
            java.lang.String r1 = r4.LIZ()
            if (r1 != 0) goto L6c
        L69:
            r1 = r2
            if (r4 == 0) goto L74
        L6c:
            boolean r0 = r4.isConnected()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
        L74:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r3.put(r1, r0)
            if (r4 == 0) goto L83
            java.lang.String r1 = r4.LIZIZ()
            if (r1 != 0) goto L86
        L83:
            r1 = r2
            if (r4 == 0) goto L8d
        L86:
            java.lang.String r0 = r4.LIZJ()
            if (r0 == 0) goto L8d
            r2 = r0
        L8d:
            r3.put(r1, r2)
            boolean r1 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isOfflineVideo(r6)
            r0 = 1
            java.lang.String r2 = "1"
            if (r1 != r0) goto L9e
            java.lang.String r0 = "is_offline_video"
            r3.put(r0, r2)
        L9e:
            java.lang.String r1 = X.C1383360m6Q.LIZ(r6)
            java.lang.String r0 = "redistribute_reason"
            r3.put(r0, r1)
            com.ss.android.ugc.aweme.feed.model.StreaksMeta r0 = r6.getStreaksMeta()
            if (r0 != 0) goto Laf
            java.lang.String r2 = "0"
        Laf:
            java.lang.String r0 = "is_streaks_story"
            r3.put(r0, r2)
            java.lang.String r1 = LIZLLL(r6)
            java.lang.String r0 = "has_text"
            r3.put(r0, r1)
            java.lang.String r0 = "video_play_finish"
            X.C20684815ws.LJIILLIIL(r0, r3)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0N3R.onPlayCompletedFirstTime(java.lang.String, X.0ocz):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        C0N3W c0n3w;
        Aweme awemeLLILZ;
        C0N3W c0n3w2;
        C0N3S c0n3s;
        C583620Mum.LJJJI(this, str, c1480430ocz);
        this.LLILZLL = SystemClock.elapsedRealtime();
        Aweme awemeLLILZ2 = LIZIZ().LLILZ(str);
        if ((awemeLLILZ2 != null || ((c0n3s = (C0N3S) C13LP.LJJJLIIL(this.LLILZ)) != null && (awemeLLILZ2 = c0n3s.LJ()) != null && Intrinsics.LJFF(awemeLLILZ2.getAid(), str))) && (c0n3w = this.LL) != null) {
            HashMap map = new HashMap();
            map.putAll(LIZ(awemeLLILZ2));
            String str2 = c0n3w.LIZ;
            if (str2 != null) {
                map.put("enter_from", str2);
            }
            Iterator<C0N3S> it2 = this.LLILZ.iterator();
            while (it2.hasNext()) {
                map.putAll(it2.next().LJFF());
            }
            C20684815ws.LJIILLIIL("video_request", map);
        }
        if (str != null && (awemeLLILZ = LIZIZ().LLILZ(str)) != null && (c0n3w2 = this.LL) != null) {
            C1589640rT8.LIZIZ.onAwemeRead(c0n3w2.LIZIZ, awemeLLILZ, c0n3w2.LIZJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C0N3W c0n3w;
        Object obj;
        C0N3W c0n3w2;
        C0N3S c0n3s;
        C0N3S c0n3s2;
        C583620Mum.LJJJIL(this, str, c1480420ocy);
        if (str != null) {
            this.LLILLJJLI.LIZLLL(str, Long.valueOf(SystemClock.elapsedRealtime()));
            this.LLILZIL = str;
            Aweme awemeLLILZ = LIZIZ().LLILZ(str);
            if ((awemeLLILZ != null || ((c0n3s2 = (C0N3S) C13LP.LJJJLIIL(this.LLILZ)) != null && (awemeLLILZ = c0n3s2.LJ()) != null && Intrinsics.LJFF(awemeLLILZ.getAid(), str))) && (c0n3w = this.LL) != null) {
                HashMap map = new HashMap();
                map.putAll(LIZ(awemeLLILZ));
                boolean zLJJIJIL = C735370Ssx.LJJIJIL(awemeLLILZ);
                String str2 = CardStruct.IStatusCode.DEFAULT;
                if (zLJJIJIL) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_landscape_portrait", obj);
                Video video = awemeLLILZ.getVideo();
                if (video != null) {
                    map.put("video_duration", String.valueOf(video.getDuration()));
                }
                String str3 = c0n3w.LIZ;
                if (str3 != null) {
                    map.put("enter_from", str3);
                }
                Iterator<C0N3S> it2 = this.LLILZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Pair pairLIZIZ = it2.next().LIZIZ();
                        if (!((Boolean) pairLIZIZ.getFirst()).booleanValue()) {
                            break;
                        } else {
                            map.putAll((Map) pairLIZIZ.getSecond());
                        }
                    } else {
                        map.put("redistribute_reason", C1383360m6Q.LIZ(awemeLLILZ));
                        if (AwemeExtKt.isOfflineVideo(awemeLLILZ)) {
                            map.put("is_offline_video", "1");
                        }
                        if (awemeLLILZ.getStreaksMeta() != null) {
                            str2 = "1";
                        }
                        map.put("is_streaks_story", str2);
                        C109300bD.LIZ("video_play", map);
                        map.put("duration", String.valueOf(SystemClock.elapsedRealtime() - this.LLILZLL));
                        C109300bD.LIZ("video_play_quality", map);
                    }
                }
            }
            if (c1480420ocy != null) {
                Aweme awemeLLILZ2 = LIZIZ().LLILZ(str);
                if ((awemeLLILZ2 != null || ((c0n3s = (C0N3S) C13LP.LJJJLIIL(this.LLILZ)) != null && (awemeLLILZ2 = c0n3s.LJ()) != null && Intrinsics.LJFF(awemeLLILZ2.getAid(), str))) && (c0n3w2 = this.LL) != null) {
                    C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C590670NEr(this, str, c0n3w2, c1480420ocy, awemeLLILZ2, null), 3);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJJL(this, str, c1480430ocz);
        if (str != null) {
            this.LLILLJJLI.LIZLLL(str, Long.valueOf(SystemClock.elapsedRealtime()));
            this.LLILZIL = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
        C0N3W c0n3w;
        C0N3S c0n3s;
        C583620Mum.LJJI(this, str, c1481290oeN, c1480430ocz);
        this.LLILZLL = 0L;
        if (str != null) {
            LJ(str, c1480430ocz);
            Aweme awemeLLILZ = LIZIZ().LLILZ(str);
            if ((awemeLLILZ != null || ((c0n3s = (C0N3S) C13LP.LJJJLIIL(this.LLILZ)) != null && (awemeLLILZ = c0n3s.LJ()) != null && Intrinsics.LJFF(awemeLLILZ.getAid(), str))) && (c0n3w = this.LL) != null) {
                HashMap map = new HashMap();
                map.putAll(LIZ(awemeLLILZ));
                String str2 = c0n3w.LIZ;
                if (str2 != null) {
                    map.put("enter_from", str2);
                }
                Iterator<C0N3S> it2 = this.LLILZ.iterator();
                while (it2.hasNext()) {
                    map.putAll(it2.next().LIZLLL());
                }
                C20684815ws.LJIILLIIL("video_play_fail", map);
            }
        }
    }
}
