package X;

import Y.ARunnableS31S0201000_26;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.livesetting.performance.LiveReleasePlayerAsyncExp;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveEnableThreadPoolExp;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveHardwareDecodeBytevc1EnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveHardwareDecodeH264EnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveSdkNtpEnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerLogIdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerSessionIdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveEnablePlayerSetTimeoutSetting;
import com.bytedance.android.livesdk.settings.LivePlayerThreadTimeOutSetting;
import com.bytedance.android.livesdk.settings.LiveStreamPreInitAppInfoBundleSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1699270uJx extends AbstractC1700380uLk {
    public InterfaceC1484830ok5 LLJILJILJ;
    public C1698870uJJ LLJILLL;
    public C1482560ogQ LLJJ;
    public InterfaceC1700400uLm LLJJI;
    public ExecutorService LLJJIII;
    public volatile boolean LLJJIJI;
    public boolean LLJJIJIIJIL;

    @Override // X.C1API
    public final void LJJ(String str) {
    }

    @Override // X.C1API
    public final void LJJIIZI(int i) {
    }

    public static void LJJJJL() {
        C827750WdZ.LIZIZ("TTLivePlayer3", "roomId is empty");
        for (StackTraceElement stackTraceElement : ThreadMethodProxy.getStackTrace(C786410Ut5.u3())) {
            C827750WdZ.LIZ("TTLivePlayer3", stackTraceElement.toString());
        }
    }

    @Override // X.C1API
    public final int LIZJ() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 == null || interfaceC1484830ok5.LJJLIIJ().LIZJ() == null) {
            return -1;
        }
        return this.LLJILJILJ.LJJLIIJ().LIZJ().ordinal();
    }

    @Override // X.AbstractC1700380uLk, X.C1API
    public final void LIZLLL() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.LJIILIIL().LIZLLL();
        }
    }

    @Override // X.C1API
    public final int LJ() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 == null || interfaceC1484830ok5.LJJLIIJ().LIZJ() == null) {
            return -1;
        }
        return this.LLJILJILJ.LJJLIIJ().LIZJ().ordinal();
    }

    @Override // X.C1API
    public final boolean LJFF() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        return interfaceC1484830ok5 != null && interfaceC1484830ok5.LJJLIIJ().LJFF();
    }

    @Override // X.C1API
    public final JSONObject LJI() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        return interfaceC1484830ok5 != null ? interfaceC1484830ok5.LJJLIIJ().LJIIZILJ() : new JSONObject();
    }

    @Override // X.C1API
    public final String LJIIIIZZ() {
        JSONObject firstFrameBlockInfo;
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        return (interfaceC1484830ok5 == null || (firstFrameBlockInfo = interfaceC1484830ok5.LJJLIIJ().getFirstFrameBlockInfo()) == null) ? "" : C786410Ut5.J3(firstFrameBlockInfo);
    }

    @Override // X.AbstractC1700380uLk, X.C1API
    public final Surface LJIIJJI() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 == null || interfaceC1484830ok5.LJJLIIJ() == null) {
            return null;
        }
        return this.LLJILJILJ.LJJLIIJ().LJIIJJI();
    }

    @Override // X.C1API
    public final List<String> LJIJJLI() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null) {
            return interfaceC1484830ok5.LJIJJ();
        }
        return null;
    }

    @Override // X.C1API
    public final void LJJIFFI() {
        LJJJJJL("TTLivePlayer3", "cancel: ");
    }

    @Override // X.C1API
    public final long LJJIIJ() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null) {
            return interfaceC1484830ok5.LJJLIIJ().LJIJJLI();
        }
        return 0L;
    }

    @Override // X.C1API
    public final long c0() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null) {
            return interfaceC1484830ok5.LJJLIIJ().getBitrate();
        }
        return 0L;
    }

    @Override // X.C1API
    public final String d0() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        return interfaceC1484830ok5 != null ? interfaceC1484830ok5.LJJLIIJ().LJIIIZ(318) : "";
    }

    @Override // X.C1API
    public final void dynamicOpenTextureRender() {
        if (this.LLJILJILJ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("real dynamicOpenTextureRender. $");
            sbLIZ.append(this.LLJILJILJ.hashCode());
            C20441214yg.LJIIIZ("PlayerTestLog", C2188811AlT.LIZIZ(sbLIZ));
            this.LLJILJILJ.LJJLJ();
        }
    }

    @Override // X.C1API
    public final Bitmap getCurrentFrame() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null) {
            return interfaceC1484830ok5.LJJLIIJ().LJIL();
        }
        return null;
    }

    @Override // X.C1API
    public final String getCurrentResolution() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        return interfaceC1484830ok5 != null ? interfaceC1484830ok5.LJJLIIJ().getCurrentResolution() : "";
    }

    @Override // X.AbstractC1700380uLk, X.C1API
    public final C1281010jRL getNetworkState() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null) {
            return interfaceC1484830ok5.LJJLIIJ().getNetworkState();
        }
        return null;
    }

    @Override // X.C1API
    public final Point getVideoSize() {
        return this.LLJILJILJ != null ? new Point(this.LLJILJILJ.LJJLIIJ().getWidth(), this.LLJILJILJ.LJJLIIJ().getHeight()) : new Point(0, 0);
    }

    @Override // X.C1API
    public final boolean isPlaying() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        return interfaceC1484830ok5 != null && interfaceC1484830ok5.LJJLIIJ().LIZJ() == EnumC1279670jPB.PLAYED;
    }

    @Override // X.C1API
    public final boolean isWidevineDrmStream() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null) {
            return interfaceC1484830ok5.LJJIFFI();
        }
        return false;
    }

    @Override // X.C1API
    public final void play() {
        LJJJJJL("TTLivePlayer3", "play: ");
        C1482560ogQ c1482560ogQ = this.LLJJ;
        if (c1482560ogQ != null) {
            this.LLJILJILJ.LJ(c1482560ogQ);
        }
    }

    @Override // X.C1API
    public final void stop() {
        LJJJJJL("TTLivePlayer3", "stop: ");
        this.LLJILJILJ.stop();
    }

    @Override // X.C1API
    public final void stopUseTextureRender() {
        if (this.LLJILJILJ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("real stopUseTextureRender. $");
            sbLIZ.append(this.LLJILJILJ.hashCode());
            C20441214yg.LJIIIZ("PlayerTestLog", C2188811AlT.LIZIZ(sbLIZ));
            this.LLJILJILJ.LJJJJLL();
        }
    }

    @Override // X.C1API
    public final void LJJIJL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSurfaceTexture: surfaceTexture = ");
        sbLIZ.append("null");
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJILJILJ.LJJJLL(LivePlayerThreadTimeOutSetting.INSTANCE.getValue(), new C1699310uK1(this), this.LLJJIII, LiveEnablePlayerSetTimeoutSetting.INSTANCE.getValue());
    }

    @Override // X.AbstractC1700380uLk, X.C1API
    public final void reset() {
        super.reset();
        LJJJJJL("TTLivePlayer3", "reset: ");
        this.LLJILJILJ.reset();
    }

    @Override // X.C1API
    public final boolean LJJIJ() {
        return this.LLJJIJI;
    }

    @Override // X.C1API
    public final C1699430uKD getPlayerThreadBlockStatus() {
        return this.LL;
    }

    public C1699270uJx(C1491040ou6 c1491040ou6) {
        ExecutorService executorService;
        LJJJJJL("TTLivePlayer3", "init: ");
        if (LiveEnablePlayerSetTimeoutSetting.INSTANCE.getValue() && ((executorService = this.LLJJIII) == null || executorService.isShutdown())) {
            this.LLJJIII = C786410Ut5.i4(new ThreadFactoryC854690Xfv(1));
        }
        if (!TextUtils.isEmpty(c1491040ou6.LJII)) {
            this.LLJILJILJ = c1491040ou6.LIZ(c1491040ou6.LJII, c1491040ou6.LJIIIIZZ);
        } else {
            this.LLJILJILJ = c1491040ou6.LIZ(CardStruct.IStatusCode.DEFAULT, c1491040ou6.LJIIIIZZ);
        }
        C786410Ut5.N3(c1491040ou6.LIZ);
        C1698870uJJ c1698870uJJ = new C1698870uJJ();
        this.LLJILLL = c1698870uJJ;
        c1698870uJJ.LIZJ = true;
        C1482580ogS c1482580ogS = new C1482580ogS();
        C1698870uJJ c1698870uJJ2 = this.LLJILLL;
        c1698870uJJ2.getClass();
        c1482580ogS.LJFF = c1698870uJJ2;
        this.LLJJ = new C1484680ojq(c1482580ogS).LIZ();
        C1700450uLr c1700450uLr = c1491040ou6.LJFF;
        this.LLILZLL = c1700450uLr;
        c1700450uLr.LLILZ = this.LLIZ;
        C1700450uLr c1700450uLr2 = this.LLILZLL;
        c1700450uLr2.LL = this.LLJILJIL;
        InterfaceC1700400uLm interfaceC1700400uLm = this.LLJJI;
        if (interfaceC1700400uLm != null) {
            c1700450uLr2.LLILLJJLI = interfaceC1700400uLm;
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            this.LLJILLL.LJIILLIIL = InterfaceC1106030et7.w8.LIZIZ().booleanValue();
        }
    }

    @Override // X.AbstractC1700380uLk, X.C1API
    public final void LIZ(boolean z) {
        this.LLJILJILJ.LIZ(z);
    }

    @Override // X.C1API
    public final String LJIIIZ(int i) {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null) {
            return interfaceC1484830ok5.LJJLIIJ().LJIIIZ(i);
        }
        return null;
    }

    @Override // X.C1API
    public final void LJIIJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("configLiveBackgroundPlayerMode: ");
        sbLIZ.append(i);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.LJIILIIL().LJIIJ(i);
        }
    }

    @Override // X.C1API
    public final void LJIILIIL(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPreviewFlag: ");
        sbLIZ.append(z);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJILJILJ.LJJJJL(z);
    }

    @Override // X.C1API
    public final void LJIILJJIL(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMute: ");
        sbLIZ.append(z);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            this.LLJILJILJ.LJIILIIL().mute();
        } else {
            this.LLJILJILJ.LJIILIIL().unmute();
        }
    }

    @Override // X.AbstractC1700380uLk, X.C1API
    public final void LJIILL(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("schedulePreIo, start: ");
        sbLIZ.append(z);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null) {
            if (z) {
                interfaceC1484830ok5.LJJI();
            } else {
                interfaceC1484830ok5.LJJ();
            }
        }
    }

    @Override // X.C1API
    public final void LJIILLIIL(ArrayList<String> arrayList) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadResource: ");
        sbLIZ.append(arrayList.size());
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C1API
    public final void LJIIZILJ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("configLiveBackgroundStatus: ");
        sbLIZ.append(z);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.LJIILIIL().LJIIZILJ(z);
        }
    }

    public final String LJIJ(String str) {
        if (LivePlayerSessionIdSetting.INSTANCE.allowPassSessionId()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("full link >> setBizSessionId: bizSessionId is ");
            sbLIZ.append(str);
            LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
            this.LLJILLL.LJIIZILJ = str;
            return str;
        }
        LJJJJJL("TTLivePlayer3", "setBizSessionId is return due to the switch is off.");
        return null;
    }

    @Override // X.C1API
    public final void LJJI(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateEnterMethodSubtag: enterMethodSubtag:");
        sbLIZ.append(str);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null && interfaceC1484830ok5.LJIILIIL() != null) {
            this.LLJILJILJ.LJIILIIL().LJIJJ(str);
        }
    }

    @Override // X.C1API
    public final void LJJII(C1699360uK6 c1699360uK6) {
        int i;
        C1699360uK6 c1699360uK62 = c1699360uK6;
        if (c1699360uK62 == null) {
            c1699360uK62 = new C1699360uK6("", "", "", null, false, false);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1699360uK62.LIZ);
        sbLIZ.append(", ");
        sbLIZ.append(c1699360uK62.LIZIZ);
        sbLIZ.append(", ");
        sbLIZ.append(c1699360uK62.LIZJ);
        sbLIZ.append(", ");
        sbLIZ.append(c1699360uK62.LIZLLL);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        C1698870uJJ c1698870uJJ = this.LLJILLL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c1699360uK62.LIZ);
        sbLIZ2.append("-");
        sbLIZ2.append(c1699360uK62.LIZIZ);
        c1698870uJJ.LJIILIIL = C2188811AlT.LIZIZ(sbLIZ2);
        this.LLJILLL.LJIILJJIL = c1699360uK62.LIZJ;
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null && interfaceC1484830ok5.LJIILIIL() != null) {
            this.LLJILJILJ.LJIILIIL().LJIJJ(c1699360uK62.LJFF);
        }
        if (c1699360uK62.LIZLLL) {
            i = 3;
        } else {
            i = -1;
        }
        this.LLJILLL.LJIILL = i;
    }

    @Override // X.C1API
    public final void LJJIJIIJIL(int i) {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.LJIILIIL().LJIJ(i);
        }
    }

    @Override // X.C1API
    public final boolean LJJIL(Surface surface) {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null && interfaceC1484830ok5.LJJLIIJ().LJIIJJI() != null && this.LLJILJILJ.LJJLIIJ().LJIIJJI() == surface) {
            return true;
        }
        return false;
    }

    @Override // X.C1API
    public final void LJJJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCreateEnterMethod: ");
        sbLIZ.append(str);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJILLL.LJIIL = str;
    }

    @Override // X.C1API
    public final void LJJJIL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setProjectKey: ");
        sbLIZ.append(str);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJILLL.LJ = str;
    }

    @Override // X.C1API
    public final void LJJJJI(Surface surface) {
        String strValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSurfaceDisplay: surface = ");
        if (surface == null) {
            strValueOf = "null";
        } else {
            strValueOf = String.valueOf(surface.hashCode());
        }
        sbLIZ.append(strValueOf);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJILJILJ.LJJLIIIJLLLLLLLZ(surface);
    }

    @Override // X.C1API
    public final void LJJJJJ(String str) {
        ExecutorService executorService;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("releaseAsync: ");
        sbLIZ.append(str);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJILJILJ.LJJJJLI(str, false);
        if (LiveEnablePlayerSetTimeoutSetting.INSTANCE.getValue() && (executorService = this.LLJJIII) != null && !executorService.isShutdown()) {
            this.LLJJIII.shutdown();
        }
        super.reset();
    }

    public final void LJJJJLI(Long l) {
        this.LLJILLL.getClass();
        long j = this.LLIZ;
        if (j != 0) {
            this.LLJILLL.LJIIIZ = String.valueOf(j);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("_prepareAsync, roomId: ");
            sbLIZ.append(this.LLIZ);
            LJJJJJL("waterMark", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (l != null) {
            this.LLJILLL.LJIIJ = l.intValue();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("_prepareAsync, isPrivate: ");
            sbLIZ2.append(l);
            LJJJJJL("waterMark", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.C1API
    public final void LJJL(SurfaceHolder surfaceHolder) {
        String strValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDisplay: surface holder= ");
        if (surfaceHolder == null) {
            strValueOf = "null";
        } else {
            strValueOf = String.valueOf(surfaceHolder.hashCode());
        }
        sbLIZ.append(strValueOf);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        if (surfaceHolder != null) {
            this.LLJILJILJ.LJJLIIIJLLLLLLLZ(surfaceHolder.getSurface());
        }
    }

    @Override // X.AbstractC1700380uLk, X.C1API
    public final void changeLowLatencyMode(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeLowLatencyMode, isLowLatencyMode: ");
        sbLIZ.append(z);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJIJIIJIL == z) {
            return;
        }
        this.LLJJIJIIJIL = z;
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.LJIILIIL().LJJ(z ? 1 : 0);
        }
    }

    @Override // X.C1API
    public final void changeSRSupportScene(boolean z) {
        this.LLJILJILJ.LJIILIIL().LJIJJLI(z, z);
    }

    @Override // X.AbstractC1700380uLk, X.C1API
    public final int getAudioDuckingDurationForLive(int i) {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null) {
            return interfaceC1484830ok5.getAudioDuckingDurationForLive(i);
        }
        return 0;
    }

    @Override // X.C1API
    public final void release(String str) {
        ExecutorService executorService;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release: ");
        sbLIZ.append(str);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        if (LiveReleasePlayerAsyncExp.isEnable()) {
            this.LLJILJILJ.LJJJJLI(str, false);
        } else {
            this.LLJILJILJ.LJJJJLI(str, true);
        }
        if (LiveEnablePlayerSetTimeoutSetting.INSTANCE.getValue() && (executorService = this.LLJJIII) != null && !executorService.isShutdown()) {
            this.LLJJIII.shutdown();
        }
        super.reset();
    }

    @Override // X.C1API
    public final void setRenderRotation(C0IIZ c0iiz) {
        if (this.LLJILJILJ != null) {
            EnumC1490990ou1 enumC1490990ou1 = EnumC1490990ou1.RenderRotation0;
            int i = C464150IIb.LIZ[c0iiz.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        enumC1490990ou1 = EnumC1490990ou1.RenderRotation270;
                    }
                } else {
                    enumC1490990ou1 = EnumC1490990ou1.RenderRotation180;
                }
            } else {
                enumC1490990ou1 = EnumC1490990ou1.RenderRotation90;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("real setRenderRotation:");
            sbLIZ.append(enumC1490990ou1);
            sbLIZ.append(". $");
            sbLIZ.append(this.LLJILJILJ.hashCode());
            C20441214yg.LJIIIZ("PlayerTestLog", C2188811AlT.LIZIZ(sbLIZ));
            this.LLJILJILJ.LJJIIJ(enumC1490990ou1);
        }
    }

    @Override // X.C1API
    public final void setSeiOpen(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSeiOpen: ");
        sbLIZ.append(z);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        if (!z && this.LLJILJILJ != null) {
            this.LLJILLL.getClass();
        }
    }

    @Override // X.AbstractC1700380uLk, X.C1API
    public final int stopAuxAudioDucking(int i) {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null) {
            return interfaceC1484830ok5.LJJJJIZL(i);
        }
        return -100;
    }

    @Override // X.C1API
    public final void switchResolution(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchResolution: ");
        sbLIZ.append(str);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJILJILJ.LJJIL(str);
    }

    @Override // X.C1API
    public final void LJIIL(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDataSource: ");
        sbLIZ.append(str);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        C1698870uJJ c1698870uJJ = this.LLJILLL;
        c1698870uJJ.LJFF = str;
        c1698870uJJ.LJI = str2;
        this.LLJILJILJ.LJJIJIL(str, str2);
    }

    public final void LJIJI(C1699300uK0 c1699300uK0, C0IMA c0ima) {
        String str = c1699300uK0.LIZ;
        String str2 = c1699300uK0.LIZIZ;
        String str3 = c1699300uK0.LIZJ;
        C09JN<Pair<Integer, Integer>> c09jn = c1699300uK0.LJFF;
        String str4 = c1699300uK0.LIZLLL;
        if (!C2093608Ic.LJ(str2)) {
            this.LLJILLL.LJI = str2;
        }
        if (LiveHardwareDecodeH264EnableSetting.INSTANCE.getValue() == 1) {
            this.LLJILLL.LIZ = true;
        }
        if (LiveHardwareDecodeBytevc1EnableSetting.INSTANCE.getValue() == 1) {
            this.LLJILLL.LIZIZ = true;
        }
        C1698870uJJ c1698870uJJ = this.LLJILLL;
        C08P1.LIZ();
        c1698870uJJ.getClass();
        if (c1699300uK0.LJ) {
            this.LLJILLL.LJIIJJI = true;
        }
        LJJIII(str, str3, c09jn, str4, c0ima);
    }

    public final void LJIL(C0IMA c0ima, boolean z) {
        if (LiveStreamPreInitAppInfoBundleSetting.INSTANCE.getEnable()) {
            ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).Wr1().LIZLLL();
        }
        String str = c0ima.LIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strLJIJ = LJIJ(str);
        C0IX5.LJIILJJIL(strLJIJ);
        C465050ILn.LJ(this.LLIZ, "live_sdk_player_start");
        C1700450uLr c1700450uLr = this.LLILZLL;
        if (c1700450uLr != null) {
            c1700450uLr.LLILZIL = strLJIJ;
        }
        if (z) {
            this.LLJILLL.LJIIJJI = true;
        }
        if (LivePlayerLogIdSetting.INSTANCE.allowPassLogId()) {
            C1698870uJJ c1698870uJJ = this.LLJILLL;
            String str3 = c0ima.LIZJ;
            if (str3 == null) {
                str3 = "";
            }
            c1698870uJJ.LJIJI = str3;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("playAfterSetRoomSessionId: logId is ");
            String str4 = c0ima.LIZJ;
            if (str4 != null) {
                str2 = str4;
            }
            sbLIZ.append(str2);
            LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLJILJILJ.LJ(this.LLJJ);
    }

    @Override // X.C1API
    public final void LJJIIZ(int i, Surface surface) {
        String strValueOf;
        if (surface != null) {
            strValueOf = String.valueOf(surface.hashCode());
        } else {
            strValueOf = "null";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syncSetSurface: timeout:");
        sbLIZ.append(i);
        sbLIZ.append(" surface:");
        sbLIZ.append(strValueOf);
        sbLIZ.append(" <===> player hash:");
        sbLIZ.append(hashCode());
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.LJJIIJZLJL(i, surface, true);
        }
        if (surface != null) {
            this.LLJJIJI = false;
        } else {
            this.LLJJIJI = true;
        }
    }

    @Override // X.C1API
    public final void LJJIJLIJ(C0IMA c0ima, boolean z) {
        LJJJJJL("TTLivePlayer3", "start: ");
        C1700360uLi.LJI.getClass();
        C1700320uLe.LIZ();
        String strLIZIZ = C0IM9.LIZIZ(c0ima);
        if (TextUtils.isEmpty(strLIZIZ)) {
            strLIZIZ = String.valueOf(this.LLIZ);
        }
        if (!TextUtils.isEmpty(strLIZIZ)) {
            this.LLJILLL.LIZLLL = strLIZIZ;
        } else {
            LJJJJL();
        }
        if (LiveHardwareDecodeH264EnableSetting.INSTANCE.getValue() == 1) {
            this.LLJILLL.LIZ = true;
        }
        if (LiveHardwareDecodeBytevc1EnableSetting.INSTANCE.getValue() == 1) {
            this.LLJILLL.LIZIZ = true;
        }
        C1698870uJJ c1698870uJJ = this.LLJILLL;
        C08P1.LIZ();
        c1698870uJJ.getClass();
        LJIL(c0ima, z);
        LJJJJLI(null);
    }

    @Override // X.C1API
    public final void LJJJI(InterfaceC1700420uLo interfaceC1700420uLo, InterfaceC1700400uLm interfaceC1700400uLm) {
        this.LLILZ = interfaceC1700420uLo;
        C1700450uLr c1700450uLr = this.LLILZLL;
        if (c1700450uLr != null) {
            c1700450uLr.LLILLJJLI = interfaceC1700400uLm;
        }
        this.LLJJI = interfaceC1700400uLm;
    }

    @Override // X.C1API
    public final void LJJJJIZL(int i, Surface surface) {
        String strValueOf;
        ExecutorService executorService;
        if (surface != null) {
            strValueOf = String.valueOf(surface.hashCode());
        } else {
            strValueOf = "null";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("asyncSetSurface: timeout:");
        sbLIZ.append(i);
        sbLIZ.append(" surface:");
        sbLIZ.append(strValueOf);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        if (LiveEnableThreadPoolExp.getEnable() && (executorService = this.LLJJIII) != null && !executorService.isShutdown()) {
            this.LLJJIII.submit(new ARunnableS31S0201000_26(i, this, surface, 1));
            return;
        }
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.LJJIIJZLJL(i, surface, false);
        }
        if (surface != null) {
            this.LLJJIJI = false;
        } else {
            this.LLJJIJI = true;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("syncSetSurface: timeout:");
        sbLIZ2.append(i);
        sbLIZ2.append(" mIsSurfaceReleased:");
        sbLIZ2.append(this.LLJJIJI);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJJJJJL(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(" <===> player hash:");
        sbLIZ.append(hashCode());
        C827750WdZ.LIZJ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1700380uLk, X.C1API
    public final int startAuxAudioDucking(C1300320jwU c1300320jwU, InterfaceC1699390uK9 interfaceC1699390uK9) {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null) {
            C1699290uJz c1699290uJz = new C1699290uJz();
            c1699290uJz.LIZ = c1300320jwU.LIZ;
            c1699290uJz.LIZIZ = c1300320jwU.LIZIZ;
            c1699290uJz.LIZJ = c1300320jwU.LIZJ;
            c1699290uJz.LIZLLL = c1300320jwU.LIZLLL;
            c1699290uJz.LJ = c1300320jwU.LJ;
            c1699290uJz.LJFF = c1300320jwU.LJFF;
            c1699290uJz.LJI = c1300320jwU.LJI;
            c1699290uJz.LJII = c1300320jwU.LJII;
            c1699290uJz.LJIIIIZZ = c1300320jwU.LJIIIIZZ;
            c1699290uJz.LJIIIZ = c1300320jwU.LJIIIZ;
            return interfaceC1484830ok5.LJJJJZ(c1699290uJz, new C1699370uK7(interfaceC1699390uK9));
        }
        return -100;
    }

    @Override // X.C1API
    public final void switchResolution(String str, InterfaceC1699420uKC interfaceC1699420uKC) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchResolution: ");
        sbLIZ.append(str);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZLL.LLILZLL = interfaceC1699420uKC;
        this.LLJILJILJ.LJJIL(str);
    }

    @Override // X.AbstractC1700380uLk, X.C1API
    public final int writeAuxAudioDuckingPCM(byte[] bArr, int i) {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJILJILJ;
        if (interfaceC1484830ok5 != null) {
            return interfaceC1484830ok5.LJJLIIIIJ(i, bArr);
        }
        return -100;
    }

    @Override // X.C1API
    public final void LJII(SurfaceControl surfaceControl, int i, int i2) {
        String strValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSurfaceControl: ");
        if (surfaceControl == null) {
            strValueOf = "null";
        } else {
            strValueOf = String.valueOf(surfaceControl.hashCode());
        }
        sbLIZ.append(strValueOf);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJILJILJ.LJII(surfaceControl, i, i2);
    }

    @Override // X.C1API
    public final void LJJIIJZLJL(String str, String str2, C0IMA c0ima) {
        LJJJJJL("TTLivePlayer3", "innerPrepare: ");
        if (LiveHardwareDecodeH264EnableSetting.INSTANCE.getValue() == 1) {
            this.LLJILLL.LIZ = true;
        }
        if (!C2093608Ic.LJ(str2)) {
            this.LLJILLL.LJI = str2;
        }
        if (LiveHardwareDecodeBytevc1EnableSetting.INSTANCE.getValue() == 1) {
            this.LLJILLL.LIZIZ = true;
        }
        C1698870uJJ c1698870uJJ = this.LLJILLL;
        C08P1.LIZ();
        c1698870uJJ.getClass();
        String str3 = c0ima.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        LJJIII(str, str3, null, String.valueOf(C0IM9.LIZ(c0ima)), c0ima);
    }

    @Override // X.C1API
    public final void LJJIJIIJI(C0IMA c0ima, boolean z, Long l) {
        LJJJJJL("TTLivePlayer3", "prepareAsync: ");
        C1700360uLi.LJI.getClass();
        C1700320uLe.LIZ();
        new C1699340uK4();
        String strLIZIZ = C0IM9.LIZIZ(c0ima);
        String str = c0ima.LIZ;
        if (!TextUtils.isEmpty(strLIZIZ)) {
            this.LLJILLL.LIZLLL = strLIZIZ;
        } else {
            LJJJJL();
        }
        LJJJJLI(l);
        if (LiveHardwareDecodeH264EnableSetting.INSTANCE.getValue() == 1) {
            this.LLJILLL.LIZ = true;
        }
        if (LiveHardwareDecodeBytevc1EnableSetting.INSTANCE.getValue() == 1) {
            this.LLJILLL.LIZIZ = true;
        }
        if (LiveSdkNtpEnableSetting.INSTANCE.getValue() == 1) {
            this.LLJILLL.LJII = true;
        }
        this.LLJILLL.LJIIIIZZ = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).calcTargetLoudness();
        C1698870uJJ c1698870uJJ = this.LLJILLL;
        C08P1.LIZ();
        c1698870uJJ.getClass();
        LJIL(c0ima, z);
    }

    @Override // X.C1API
    public final void LJJIJIL(int i, boolean z, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSuperResolutionOptions: ");
        sbLIZ.append(z);
        sbLIZ.append(",");
        sbLIZ.append(z2);
        sbLIZ.append(",");
        sbLIZ.append(i);
        LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C1API
    public final void LJJIZ(String str, Map<String, String> map, EnumC1700430uLp enumC1700430uLp) {
        Uri uri;
        LJJJJJL("TTLivePlayer3", "setDataSource: with url");
        if (str.indexOf("://") <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("file://");
            sbLIZ.append(str);
            uri = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            uri = UriProtector.parse(str);
        }
        C1699080uJe c1699080uJe = new C1699080uJe(uri.toString(), (String) ((HashMap) map).get("sdk_params"));
        this.LLJILLL.getClass();
        this.LLJILJILJ.LJJL(c1699080uJe);
    }

    @Override // X.C1API
    public final void LJIJJ(String str, String str2, boolean z, C0IMA c0ima) {
        LJJJJJL("TTLivePlayer3", "prepare: ");
        if (LiveStreamPreInitAppInfoBundleSetting.INSTANCE.getEnable()) {
            ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).Wr1().LIZLLL();
        }
        C1699300uK0 c1699300uK0 = new C1699300uK0(str, str2);
        String str3 = c0ima.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        c1699300uK0.LIZJ = str3;
        c1699300uK0.LJ = z;
        c1699300uK0.LIZLLL = String.valueOf(C0IM9.LIZ(c0ima));
        LJIJI(c1699300uK0, c0ima);
    }

    @Override // X.C1API
    public final void LJJJJ(String str, String str2, boolean z, C0IMA c0ima) {
        C09JN c09jn = C1700770uMN.LL;
        LJJJJJL("TTLivePlayer3", "prepareWithCallback: ");
        C1699300uK0 c1699300uK0 = new C1699300uK0(str, str2);
        String str3 = c0ima.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        c1699300uK0.LIZJ = str3;
        c1699300uK0.LJFF = c09jn;
        c1699300uK0.LJ = z;
        c1699300uK0.LIZLLL = String.valueOf(C0IM9.LIZ(c0ima));
        LJIJI(c1699300uK0, c0ima);
    }

    public final void LJJIII(String str, String str2, C09JN<Pair<Integer, Integer>> c09jn, String str3, C0IMA c0ima) {
        LJIJ(str2);
        this.LLJILLL.LJFF = str;
        if (TextUtils.isEmpty(str3)) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        this.LLJILLL.LIZLLL = str3;
        if (LivePlayerLogIdSetting.INSTANCE.allowPassLogId()) {
            C1698870uJJ c1698870uJJ = this.LLJILLL;
            String str4 = c0ima.LIZJ;
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            c1698870uJJ.LJIJI = str4;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prepareAfterSetSessionId: logId is ");
            String str6 = c0ima.LIZJ;
            if (str6 != null) {
                str5 = str6;
            }
            sbLIZ.append(str5);
            LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLJILJILJ.LJJJIL(this.LLJJ);
        if (c09jn != null) {
            try {
                c09jn.accept(new Pair<>(Integer.valueOf(this.LLJILJILJ.LJJLIIJ().getWidth()), Integer.valueOf(this.LLJILJILJ.LJJLIIJ().getHeight())));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
