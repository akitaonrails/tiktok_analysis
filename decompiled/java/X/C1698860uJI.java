package X;

import Y.ARunnableS17S0200100_20;
import Y.ARunnableS2S0310100_20;
import Y.ARunnableS92S0200000_23;
import android.app.Application;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceControl;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.videoarch.liveio.LiveIOManager;
import com.ss.videoarch.liveplayer.VideoLiveManager;
import com.ss.videoarch.liveplayer.log.LiveLoggerService;
import com.tts.oecverify.BdTuring;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uJI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1698860uJI implements C1EOS, InterfaceC1698710uJ3, Handler.Callback {
    public static final C1699030uJZ LLJILJILJ = new C1699030uJZ();
    public C1480770odX LL;
    public final HandlerThread LLILLJJLI;
    public final BPEAHandler LLILLL;
    public VideoLiveManager LLILZ;
    public InterfaceC1279750jPJ LLILZIL;
    public boolean LLILZLL;
    public final boolean LLIZ;
    public boolean LLIZLLLIL;
    public final int LLJ;
    public volatile InterfaceC1699000uJW LLJI;
    public final AtomicInteger LLJIJIL = new AtomicInteger(10);
    public InterfaceC1279680jPC LLJILJIL;

    @Override // X.C1EOS
    public final void LJIILL() {
        this.LLIZLLLIL = true;
        LJJLIIIJ(7, null);
    }

    @Override // X.C1EOS
    public final Bitmap LJIL() {
        return null;
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJIJIL() {
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJJIL() {
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJJJJ(String str) {
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJJJJL() {
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJJJLI() {
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJJJLL() {
    }

    @Override // X.C1EOS
    public final void pause() {
        LJJLIIIJ(4, null);
    }

    @Override // X.C1EOS
    public final void release() {
        this.LLIZLLLIL = true;
        LJJLIIIJ(6, null);
    }

    @Override // X.C1EOS
    public final EnumC1279670jPB LIZJ() {
        VideoLiveManager videoLiveManager = this.LLILZ;
        if (videoLiveManager == null) {
            return EnumC1279670jPB.IDLE;
        }
        int i = C1490980ou0.LIZJ[videoLiveManager.LLFFF().ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? EnumC1279670jPB.IDLE : EnumC1279670jPB.PREPARING : EnumC1279670jPB.STOPPED : EnumC1279670jPB.PAUSED : EnumC1279670jPB.PLAYED : EnumC1279670jPB.IDLE;
    }

    @Override // X.C1EOS
    public final boolean LJFF() {
        InterfaceC1467950oIr interfaceC1467950oIr;
        VideoLiveManager videoLiveManager = this.LLILZ;
        return (videoLiveManager == null || (interfaceC1467950oIr = videoLiveManager.LIZLLL) == null || !(((C1470430oMr) interfaceC1467950oIr).LIZ instanceof C20547315ah)) ? false : true;
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJI() {
        LJJLIIIIJ("onStallEnd");
        InterfaceC1279680jPC interfaceC1279680jPC = this.LLJILJIL;
        if (interfaceC1279680jPC != null) {
            interfaceC1279680jPC.LJI();
        }
    }

    @Override // X.C1EOS
    public final void LJIIIIZZ() {
        LJJLIIIJ(11, null);
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJIIJ() {
        LJJLIIIIJ("onStallStart");
        InterfaceC1279680jPC interfaceC1279680jPC = this.LLJILJIL;
        if (interfaceC1279680jPC != null) {
            interfaceC1279680jPC.LJIIJ();
        }
    }

    @Override // X.C1EOS
    public final Surface LJIIJJI() {
        VideoLiveManager videoLiveManager = this.LLILZ;
        if (videoLiveManager == null) {
            return null;
        }
        return videoLiveManager.LJJIJ;
    }

    @Override // X.C1EOS
    public final JSONObject LJIIZILJ() {
        VideoLiveManager videoLiveManager = this.LLILZ;
        if (videoLiveManager == null) {
            return null;
        }
        return videoLiveManager.LLILZ();
    }

    @Override // X.C1EOS
    public final List<String> LJIJJ() {
        VideoLiveManager videoLiveManager = this.LLILZ;
        if (videoLiveManager != null) {
            return videoLiveManager.LLJJ();
        }
        return null;
    }

    @Override // X.C1EOS
    public final long LJIJJLI() {
        VideoLiveManager videoLiveManager = this.LLILZ;
        if (videoLiveManager == null) {
            return 0L;
        }
        return videoLiveManager.LJIILLIIL.LJJ(100);
    }

    @Override // X.C1EOS
    public final void LJJ() {
        if (this.LLJ == 0) {
            return;
        }
        LJJLIIIIJ("receive stop pre io.");
        LJJLIIIJ(31, null);
    }

    @Override // X.C1EOS
    public final int LJJI() {
        if (this.LLJ == 0) {
            return -1;
        }
        LJJLIIIIJ("receive start pre io.");
        LJJLIIIJ(30, null);
        return 0;
    }

    @Override // X.C1EOS
    public final boolean LJJIFFI() {
        VideoLiveManager videoLiveManager = this.LLILZ;
        if (videoLiveManager != null) {
            return videoLiveManager.LJJII.LJJIII();
        }
        return false;
    }

    @Override // X.C1EOS
    public final void LJJIIJ() {
        LJJLIIIJ(32, Boolean.TRUE);
    }

    @Override // X.C1EOS
    public final void LJJJJI() {
        LiveLoggerService liveLoggerService;
        VideoLiveManager videoLiveManager = this.LLILZ;
        if (videoLiveManager == null || (liveLoggerService = videoLiveManager.LJIILLIIL) == null) {
            return;
        }
        liveLoggerService.LLLI = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    @Override // X.C1EOS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1279660jPA LJJJJIZL() {
        /*
            r9 = this;
            com.ss.videoarch.liveplayer.VideoLiveManager r0 = r9.LLILZ
            r6 = 0
            if (r0 == 0) goto L8b
            com.ss.videoarch.liveplayer.log.LiveLoggerService r1 = r0.LJIILLIIL
            if (r1 == 0) goto L8b
            X.0jP9 r8 = r1.LLLFZ
            if (r8 == 0) goto L8b
            r0 = 1
            r8.LJ = r0
            X.0jPA r0 = r8.LIZ
            r4 = 0
            if (r0 == 0) goto La3
            long r2 = r0.LIZIZ
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto La3
        L1c:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L8b
            X.0jPA r6 = new X.0jPA
            r6.<init>()
            r6.LIZIZ = r2
            X.0jPA r7 = r8.LIZ
            if (r7 == 0) goto La0
            long r2 = r7.LIZJ
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto La0
        L31:
            r6.LIZJ = r2
            if (r7 == 0) goto L43
            java.lang.String r0 = r7.LIZ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L43
            X.0jPA r0 = r8.LIZ
            java.lang.String r0 = r0.LIZ
            r6.LIZ = r0
        L43:
            X.0jPA r7 = r8.LIZ
            if (r7 == 0) goto L9d
            long r2 = r7.LJ
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L9d
        L4d:
            r6.LJ = r2
            if (r7 == 0) goto L58
            long r2 = r7.LJFF
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L58
            r4 = r2
        L58:
            r6.LJFF = r4
            java.lang.String r0 = r6.LIZ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L6e
            boolean r0 = X.C1474810oTv.LJLJLLL()
            if (r0 == 0) goto L8c
            X.0uJ9 r0 = r1.LLILZIL
            java.lang.String r0 = r0.LIZIZ
            r6.LIZ = r0
        L6e:
            long r4 = r1.LLZLLIL
            long r2 = r1.LLZLL
            boolean r0 = r1.k
            if (r0 == 0) goto L81
            long r7 = java.lang.System.currentTimeMillis()
            long r0 = r1.LLZILL
            long r7 = r7 - r0
            long r4 = r4 + r7
            r0 = 1
            long r2 = r2 + r0
        L81:
            long r0 = r6.LJ
            long r0 = r0 + r4
            r6.LJ = r0
            long r0 = r6.LJFF
            long r0 = r0 + r2
            r6.LJFF = r0
        L8b:
            return r6
        L8c:
            java.lang.String r0 = r1.LLLLZLLIL
            r6.LIZ = r0
            java.lang.String r0 = r1.LLLLZLL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L6e
            java.lang.String r0 = r1.LLLLZLL
            r6.LIZ = r0
            goto L6e
        L9d:
            r2 = 0
            goto L4d
        La0:
            long r2 = r8.LIZJ
            goto L31
        La3:
            long r2 = r8.LIZIZ
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1698860uJI.LJJJJIZL():X.0jPA");
    }

    public final boolean LJJLI() {
        return ((Boolean) C1474810oTv.D5.getValue()).booleanValue() ? this.LLILLJJLI.isAlive() : this.LLILLJJLI.isAlive() && !this.LLILLJJLI.isInterrupted();
    }

    @Override // X.C1EOS
    public final long getBitrate() {
        VideoLiveManager videoLiveManager = this.LLILZ;
        if (videoLiveManager != null) {
            return videoLiveManager.LLIIJLIL().LIZ;
        }
        return 0L;
    }

    @Override // X.C1EOS
    public final String getCurrentResolution() {
        VideoLiveManager videoLiveManager = this.LLILZ;
        return videoLiveManager == null ? "" : videoLiveManager.LLILZLL(58);
    }

    @Override // X.C1EOS
    public final JSONObject getFirstFrameBlockInfo() {
        VideoLiveManager videoLiveManager = this.LLILZ;
        if (videoLiveManager == null) {
            return null;
        }
        return videoLiveManager.LJZI();
    }

    @Override // X.C1EOS
    public final int getHeight() {
        VideoLiveManager videoLiveManager = this.LLILZ;
        if (videoLiveManager == null) {
            return 0;
        }
        return videoLiveManager.LLJIJIL();
    }

    @Override // X.C1EOS
    public final C1281010jRL getNetworkState() {
        VideoLiveManager videoLiveManager = this.LLILZ;
        if (videoLiveManager != null) {
            return videoLiveManager.LLIIIJ();
        }
        return null;
    }

    @Override // X.C1EOS
    public final int getWidth() {
        VideoLiveManager videoLiveManager = this.LLILZ;
        if (videoLiveManager == null) {
            return 0;
        }
        return videoLiveManager.LLJILJIL();
    }

    @Override // X.C1EOS
    public final void mute() {
        LJJLIIIJ(10, null);
    }

    @Override // X.InterfaceC1698710uJ3
    public final void onCompletion() {
        LJJLIIIIJ("onCompletion");
        InterfaceC1279680jPC interfaceC1279680jPC = this.LLJILJIL;
        if (interfaceC1279680jPC != null) {
            interfaceC1279680jPC.onCompletion();
        }
    }

    @Override // X.InterfaceC1698710uJ3
    public final void onPrepared() {
        LJJLIIIIJ("onPrepared");
        InterfaceC1279680jPC interfaceC1279680jPC = this.LLJILJIL;
        if (interfaceC1279680jPC != null) {
            interfaceC1279680jPC.onPrepared();
        }
    }

    public C1698860uJI() {
        if (C1474810oTv.LJJJZ()) {
            LJJLIIIIJ("enable use global handler threadpool");
            this.LL = C1484670ojp.LIZ.LIZ(EnumC1482310og1.LIVE);
            this.LLIZ = ((Boolean) C1474810oTv.S4.getValue()).booleanValue();
        }
        C1480770odX c1480770odX = this.LL;
        if (c1480770odX != null) {
            this.LLILLJJLI = c1480770odX.LIZ;
        } else {
            HandlerThread handlerThread = new HandlerThread("single-live-player-thread", -20);
            this.LLILLJJLI = handlerThread;
            handlerThread.start();
        }
        int iIntValue = ((Integer) LLJILJILJ.LIZ(0, "live_sdk_enable_opt_pre_io")).intValue();
        this.LLJ = iIntValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enable live preio:");
        sbLIZ.append(iIntValue);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        this.LLILLL = new BPEAHandler(C786410Ut5.W2(this.LLILLJJLI), this);
        LJJLIIIJ(1, null);
    }

    @Override // X.C1EOS
    public final void reset() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reset, handlerActive ");
        sbLIZ.append(LJJLI());
        sbLIZ.append(", ");
        sbLIZ.append(this.LLILZ);
        C827820Wdg.LIZ(this, "TTKLivePlayer2", C2188811AlT.LIZIZ(sbLIZ));
        LJJLIIIJ(8, null);
    }

    @Override // X.C1EOS
    public final void stop() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop, handlerActive ");
        sbLIZ.append(LJJLI());
        sbLIZ.append(", ");
        sbLIZ.append(this.LLILZ);
        C827820Wdg.LIZ(this, "TTKLivePlayer2", C2188811AlT.LIZIZ(sbLIZ));
        LJJLIIIJ(5, null);
    }

    public static long LJJL(ByteBuffer byteBuffer) {
        long j;
        if (byteBuffer.isDirect()) {
            try {
                for (Class<?> superclass = byteBuffer.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    try {
                        Field declaredField = superclass.getDeclaredField("effectiveDirectAddress");
                        declaredField.setAccessible(true);
                        long j2 = declaredField.getLong(byteBuffer);
                        if (j2 != 0) {
                            return j2;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    try {
                        Field declaredField2 = superclass.getDeclaredField("address");
                        declaredField2.setAccessible(true);
                        j = declaredField2.getLong(byteBuffer);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                    if (j != 0) {
                        return j;
                    }
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
        return 0L;
    }

    @Override // X.C1EOS
    public final void LIZ(boolean z) {
        LJJLIIIJ(26, Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LIZIZ(int i) {
        if (this.LLJI != null) {
            this.LLJI.LIZIZ(i);
        }
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LIZLLL(int i) {
        if (this.LLJI != null) {
            this.LLJI.LIZLLL(i);
        }
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJ(int i) {
        if (this.LLJI != null) {
            this.LLJI.LJ(i);
        }
    }

    @Override // X.C1EOS
    public final String LJIIIZ(int i) {
        VideoLiveManager videoLiveManager = this.LLILZ;
        if (videoLiveManager != null) {
            return videoLiveManager.LLILZLL(i);
        }
        return "";
    }

    @Override // X.C1EOS
    public final void LJIILIIL(boolean z) {
        LJJLIIIJ(9, Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJIILJJIL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResolutionDegrade: ");
        sbLIZ.append(str);
        LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1279680jPC interfaceC1279680jPC = this.LLJILJIL;
        if (interfaceC1279680jPC != null) {
            interfaceC1279680jPC.LJIILJJIL(str);
        }
    }

    @Override // X.C1EOS
    public final void LJIJ(int i) {
        LJJLIIIJ(22, Integer.valueOf(i));
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJIJI(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFirstFrame: ");
        sbLIZ.append(z);
        LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1279680jPC interfaceC1279680jPC = this.LLJILJIL;
        if (interfaceC1279680jPC != null) {
            interfaceC1279680jPC.LJIJI(z);
        }
    }

    @Override // X.C1EOS
    public final void LJJII(InterfaceC1279680jPC interfaceC1279680jPC) {
        this.LLJILJIL = interfaceC1279680jPC;
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJIII(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAbrSwitch: ");
        sbLIZ.append(str);
        sbLIZ.append(" reason:");
        sbLIZ.append(0);
        LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1279680jPC interfaceC1279680jPC = this.LLJILJIL;
        if (interfaceC1279680jPC != null) {
            interfaceC1279680jPC.LJJIII(str);
        }
    }

    @Override // X.C1EOS
    public final void LJJIIJZLJL(int i) {
        LJJLIIIJ(28, Integer.valueOf(i));
    }

    @Override // X.C1EOS
    public final void LJJIIZI(C1698870uJJ c1698870uJJ) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("play ");
        sbLIZ.append(c1698870uJJ.LIZLLL);
        sbLIZ.append(", handlerActive ");
        sbLIZ.append(LJJLI());
        sbLIZ.append(", ");
        sbLIZ.append(this.LLILZ);
        C827820Wdg.LIZ(this, "TTKLivePlayer2", C2188811AlT.LIZIZ(sbLIZ));
        LJJLIIIJ(3, c1698870uJJ);
    }

    @Override // X.C1EOS
    public final void LJJIJIIJI(String str) {
        LJJLIIIJ(21, str);
    }

    @Override // X.C1EOS
    public final void LJJIJL(EnumC1490990ou1 enumC1490990ou1) {
        LJJLIIIJ(13, enumC1490990ou1);
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJIJLIJ(Surface surface) {
        InterfaceC1279680jPC interfaceC1279680jPC = this.LLJILJIL;
        if (interfaceC1279680jPC != null) {
            interfaceC1279680jPC.Au(surface);
        }
    }

    @Override // X.C1EOS
    public final void LJJIZ(C1699080uJe c1699080uJe) {
        LJJLIIIJ(25, c1699080uJe);
    }

    @Override // X.C1EOS
    public final void LJJJ(InterfaceC1279750jPJ interfaceC1279750jPJ) {
        this.LLILZIL = interfaceC1279750jPJ;
    }

    @Override // X.C1EOS
    public final void LJJJI(boolean z) {
        LJJLIIIJ(27, Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJJJ(C1281010jRL c1281010jRL) {
        InterfaceC1279680jPC interfaceC1279680jPC = this.LLJILJIL;
        if (interfaceC1279680jPC != null) {
            interfaceC1279680jPC.LLZZLLIL(c1281010jRL);
        }
    }

    @Override // X.C1EOS
    public final int LJJJJL(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[AudioDucking] getAudioDuckingDuration called duckingId=");
        sbLIZ.append(i);
        LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ));
        long jLJZL = this.LLILZ.LJZL(326, 0L);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[AudioDucking] getAudioDuckingDuration return duration=");
        sbLIZ2.append(jLJZL);
        LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ2));
        return (int) jLJZL;
    }

    @Override // X.C1EOS
    public final void LJJJJZ(C1698870uJJ c1698870uJJ) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepareNext ");
        sbLIZ.append(c1698870uJJ.LIZLLL);
        sbLIZ.append(", handlerActive ");
        sbLIZ.append(LJJLI());
        sbLIZ.append(", ");
        sbLIZ.append(this.LLILZ);
        C827820Wdg.LIZ(this, "TTKLivePlayer2", C2188811AlT.LIZIZ(sbLIZ));
        LJJLIIIJ(2, c1698870uJJ);
    }

    @Override // X.C1EOS
    public final void LJJJJZI(boolean z) {
        LJJLIIIJ(29, Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJJLIIL(JSONObject jSONObject) {
        InterfaceC1279680jPC interfaceC1279680jPC = this.LLJILJIL;
        if (interfaceC1279680jPC != null) {
            interfaceC1279680jPC.uv(jSONObject);
        }
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJJLL(C1284740jXM c1284740jXM) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onError: ");
        sbLIZ.append(c1284740jXM);
        LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1279680jPC interfaceC1279680jPC = this.LLJILJIL;
        if (interfaceC1279680jPC != null) {
            interfaceC1279680jPC.LJJLIL(new C1284720jXK(c1284740jXM.code, c1284740jXM.getMessage(), c1284740jXM.info, c1284740jXM.playForbidden));
        }
    }

    public final void LJJJZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_releaseThread ");
        sbLIZ.append(str);
        C827820Wdg.LIZ(this, "TTKLivePlayer2", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZLL = false;
        C1480770odX c1480770odX = this.LL;
        if (c1480770odX != null) {
            HandlerThread handlerThread = c1480770odX.LIZ;
            HandlerThread handlerThread2 = this.LLILLJJLI;
            if (handlerThread != handlerThread2) {
                if (handlerThread2 != null) {
                    handlerThread2.quit();
                    this.LLILLJJLI.interrupt();
                }
            } else if (this.LLIZ) {
                C786410Ut5.LJJZZIII(C1475000oUE.LJ, new ARunnableS92S0200000_23(c1480770odX, this, 74));
            } else {
                this.LLILLL.removeCallbacksAndMessages(null);
                C1484670ojp.LIZ.LIZIZ(this.LL);
            }
            this.LL = null;
            return;
        }
        this.LLILLJJLI.quit();
        this.LLILLJJLI.interrupt();
    }

    public final void LJJLIIIIJ(String str) {
        int iHashCode;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" <===> ttk2 hash:");
            sbLIZ.append(hashCode());
            sbLIZ.append(", videoLiveManagerHash: ");
            VideoLiveManager videoLiveManager = this.LLILZ;
            if (videoLiveManager == null) {
                iHashCode = 0;
            } else {
                iHashCode = videoLiveManager.hashCode();
            }
            sbLIZ.append(iHashCode);
            C1481110oe5.LIZIZ("TTKLivePlayer2", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJJLIIIJILLIZJL(C1698870uJJ c1698870uJJ) {
        VideoLiveManager videoLiveManager;
        C1279650jP9 c1279650jP9;
        if (c1698870uJJ != null && (videoLiveManager = this.LLILZ) != null) {
            if (!this.LLILZLL) {
                this.LLILZLL = true;
                LiveLoggerService liveLoggerService = videoLiveManager.LJIILLIIL;
                if (liveLoggerService != null) {
                    liveLoggerService.H6 = true;
                }
                if (!TextUtils.isEmpty(c1698870uJJ.LIZLLL)) {
                    this.LLILZ.LLLLL(c1698870uJJ.LIZLLL);
                }
                if (!TextUtils.isEmpty(c1698870uJJ.LJIJI)) {
                    VideoLiveManager videoLiveManager2 = this.LLILZ;
                    String str = c1698870uJJ.LJIJI;
                    if (videoLiveManager2.LLIILII == null && !TextUtils.isEmpty(str)) {
                        videoLiveManager2.LLIILII = str;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("client set live log id:");
                        sbLIZ.append(str);
                        sbLIZ.append("-- ");
                        sbLIZ.append(videoLiveManager2.P0);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C1698940uJQ.LIZJ();
                    }
                }
                this.LLILZ.LIZJ(44, 0);
                boolean z = c1698870uJJ.LJIILLIIL;
                if (z) {
                    this.LLILZ.LIZJ(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, z ? 1 : 0);
                }
                if (c1698870uJJ.LIZJ) {
                    VideoLiveManager videoLiveManager3 = this.LLILZ;
                    videoLiveManager3.LLLL = true;
                    videoLiveManager3.LJIILLIIL.c1 = true;
                }
            }
            this.LLILZ.LLLLIILL(c1698870uJJ.LJIIZILJ);
            this.LLILZ.LIZJ(156, 73);
            this.LLILZ.LIZJ(158, c1698870uJJ.LJIIJ);
            this.LLILZ.LIZJ(2, 0);
            if (c1698870uJJ.LIZ) {
                this.LLILZ.LIZJ(35, 1);
                this.LLILZ.LIZJ(33, 1);
                this.LLILZ.LIZJ(34, 0);
            }
            if (c1698870uJJ.LIZIZ) {
                this.LLILZ.LIZJ(36, 1);
            }
            if (c1698870uJJ.LJII) {
                this.LLILZ.LIZJ(42, 1);
            }
            this.LLILZ.LLLLILI(c1698870uJJ.LJIIIIZZ, 143);
            this.LLILZ.LIZJ(9, 2);
            if (c1698870uJJ.LJIIJJI) {
                this.LLILZ.LIZJ(155, 1);
            }
            if (C1474810oTv.LJJJLIIL() >= 0) {
                this.LLILZ.LIZJ(160, C1474810oTv.LJJJLIIL());
            }
            if (!TextUtils.isEmpty(c1698870uJJ.LJ)) {
                this.LLILZ.LJIILLIIL.LLJJIII = c1698870uJJ.LJ;
            }
            VideoLiveManager videoLiveManager4 = this.LLILZ;
            C1279660jPA c1279660jPA = c1698870uJJ.LJIJ;
            LiveLoggerService liveLoggerService2 = videoLiveManager4.LJIILLIIL;
            if (liveLoggerService2 != null && (c1279650jP9 = liveLoggerService2.LLLFZ) != null && c1279650jP9.LIZIZ <= 0) {
                if (c1279660jPA != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("update context:");
                    sbLIZ2.append(c1279660jPA.toString());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1698940uJQ.LIZJ();
                    c1279650jP9.LIZ = new C1279660jPA(c1279660jPA.LIZIZ, c1279660jPA.LIZJ, c1279660jPA.LIZLLL, c1279660jPA.LIZ, c1279660jPA.LJ, c1279660jPA.LJFF);
                } else {
                    c1279650jP9.LIZ = null;
                }
            }
            if (!TextUtils.isEmpty(c1698870uJJ.LJIIIZ)) {
                this.LLILZ.LIZ(157, c1698870uJJ.LJIIIZ);
            }
            if (!TextUtils.isEmpty(c1698870uJJ.LJIIL)) {
                this.LLILZ.LIZ(200, c1698870uJJ.LJIIL);
            }
            if (!TextUtils.isEmpty(c1698870uJJ.LJIILIIL)) {
                this.LLILZ.LIZ(63, c1698870uJJ.LJIILIIL);
            }
            if (!TextUtils.isEmpty(c1698870uJJ.LJIILJJIL)) {
                this.LLILZ.LIZ(64, c1698870uJJ.LJIILJJIL);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("setLiveRequest with prePlayType: ");
            sbLIZ3.append(c1698870uJJ.LJIILL);
            LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ3));
            this.LLILZ.LIZJ(131, c1698870uJJ.LJIILL);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        LiveLoggerService liveLoggerService;
        int iStopPreIO = -1;
        String str = null;
        switch (message.what) {
            case 1:
                Application application = C1475000oUE.LIZ;
                AtomicInteger atomicInteger = VideoLiveManager.k3;
                C1698820uJE c1698820uJE = new C1698820uJE(application);
                c1698820uJE.LJFF = 300000;
                c1698820uJE.LIZJ = new InterfaceC1286560jaI() { // from class: X.0uJf
                };
                c1698820uJE.LJ = false;
                c1698820uJE.LIZIZ = this;
                c1698820uJE.LJII = new InterfaceC1491020ou4() { // from class: X.0ou3
                    @Override // X.InterfaceC1491020ou4
                    public final Size LIZIZ() {
                        InterfaceC1279750jPJ interfaceC1279750jPJ = this.LIZ.LLILZIL;
                        if (interfaceC1279750jPJ == null) {
                            return null;
                        }
                        InterfaceC1491020ou4 interfaceC1491020ou4 = ((C1491030ou5) interfaceC1279750jPJ).LIZ.LJI;
                        return interfaceC1491020ou4 != null ? interfaceC1491020ou4.LIZIZ() : new Size(-1, -1);
                    }

                    @Override // X.InterfaceC1491020ou4
                    public final HashMap<String, Object> LIZ(EnumC1491000ou2 enumC1491000ou2, String str2) {
                        int i = C1490980ou0.LIZ[enumC1491000ou2.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                return null;
                            }
                            return C1480850odf.LIZJ.getLiveGlobalConfig().LIZIZ(C0CJQ.LivePlayerEffectUnknown, str2);
                        }
                        return C1480850odf.LIZJ.getLiveGlobalConfig().LIZIZ(C0CJQ.LivePlayerEffectAudioBalance, str2);
                    }
                };
                c1698820uJE.LIZLLL = new InterfaceC1699150uJl() { // from class: X.0uJa
                    @Override // X.InterfaceC1699150uJl
                    public final Object LIZ(Object obj, String str2) {
                        return C1480850odf.LIZJ.getLiveGlobalConfig().LIZ(obj, str2);
                    }
                };
                this.LLILZ = c1698820uJE.LIZ();
                LJJLIIIIJ("_init");
                return true;
            case 2:
                C1698870uJJ c1698870uJJ = (C1698870uJJ) HandlerHook.getMessageObj(message.obj);
                LJJLIIIIJ("_prepareNext");
                if (this.LLILZ != null) {
                    String str2 = c1698870uJJ.LJI;
                    if (!TextUtils.isEmpty(str2)) {
                        this.LLILZ.LIZ(43, str2);
                    }
                    LJJLIIIJILLIZJL(c1698870uJJ);
                    this.LLILZ.LLLII(c1698870uJJ.LJFF);
                    return true;
                }
                return true;
            case 3:
                C1698870uJJ c1698870uJJ2 = (C1698870uJJ) HandlerHook.getMessageObj(message.obj);
                LJJLIIIIJ("_play");
                if (this.LLILZ != null) {
                    LJJLIIIJILLIZJL(c1698870uJJ2);
                    this.LLILZ.play();
                    LJJLIIIIJ("onStartPulling: ");
                    InterfaceC1279680jPC interfaceC1279680jPC = this.LLJILJIL;
                    if (interfaceC1279680jPC != null) {
                        interfaceC1279680jPC.LJJJJ();
                        return true;
                    }
                }
                return true;
            case 4:
                LJJLIIIIJ("_pause");
                VideoLiveManager videoLiveManager = this.LLILZ;
                if (videoLiveManager != null) {
                    videoLiveManager.pause();
                    return true;
                }
                return true;
            case 5:
                LJJLIIIIJ("_stop");
                VideoLiveManager videoLiveManager2 = this.LLILZ;
                if (videoLiveManager2 != null) {
                    this.LLILZLL = false;
                    videoLiveManager2.stop();
                    return true;
                }
                return true;
            case 6:
                LJJLIIIIJ("_release");
                VideoLiveManager videoLiveManager3 = this.LLILZ;
                if (videoLiveManager3 != null) {
                    videoLiveManager3.release();
                }
                LJJJZ("_release");
                return true;
            case 7:
                VideoLiveManager videoLiveManager4 = this.LLILZ;
                if (videoLiveManager4 != null) {
                    videoLiveManager4.LJIILL();
                }
                LJJJZ("_releaseAsync");
                return true;
            case 8:
                LJJLIIIIJ("_reset");
                VideoLiveManager videoLiveManager5 = this.LLILZ;
                if (videoLiveManager5 != null) {
                    this.LLILZLL = false;
                    videoLiveManager5.LLLILZLLLI();
                    return true;
                }
                return true;
            case BdTuring.TYPE_ECAF /* 9 */:
                boolean zBooleanValue = ((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("_setPreviewFlag: ");
                sbLIZ.append(zBooleanValue);
                LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ));
                VideoLiveManager videoLiveManager6 = this.LLILZ;
                if (videoLiveManager6 != null) {
                    videoLiveManager6.LLLLLJIL(zBooleanValue);
                    return true;
                }
                return true;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJJLIIIIJ("_mute");
                VideoLiveManager videoLiveManager7 = this.LLILZ;
                if (videoLiveManager7 != null) {
                    videoLiveManager7.LLLLLIL(true);
                    return true;
                }
                return true;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJJLIIIIJ("_unMute");
                VideoLiveManager videoLiveManager8 = this.LLILZ;
                if (videoLiveManager8 != null) {
                    videoLiveManager8.LLLLLIL(false);
                    return true;
                }
                return true;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                Surface surface = (Surface) HandlerHook.getMessageObj(message.obj);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("_setSurface: ");
                sbLIZ2.append(surface);
                LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ2));
                VideoLiveManager videoLiveManager9 = this.LLILZ;
                if (videoLiveManager9 != null) {
                    videoLiveManager9.setSurface(surface);
                    return true;
                }
                return true;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                EnumC1490990ou1 enumC1490990ou1 = (EnumC1490990ou1) HandlerHook.getMessageObj(message.obj);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("_setRenderRotation: ");
                sbLIZ3.append(enumC1490990ou1);
                LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ3));
                if (this.LLILZ != null) {
                    C0IJ8 c0ij8 = C0IJ8.VeLivePlayerRotation0;
                    int i = C1490980ou0.LIZIZ[enumC1490990ou1.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                c0ij8 = C0IJ8.VeLivePlayerRotation270;
                            }
                        } else {
                            c0ij8 = C0IJ8.VeLivePlayerRotation180;
                        }
                    } else {
                        c0ij8 = C0IJ8.VeLivePlayerRotation90;
                    }
                    this.LLILZ.LLLLLJLJLL(c0ij8);
                    return true;
                }
                return true;
            case 14:
            case 15:
            default:
                return true;
            case 16:
                Object messageObj = HandlerHook.getMessageObj(message.obj);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("_addSurface: ");
                sbLIZ4.append(messageObj);
                LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ4));
                if (this.LLILZ != null) {
                    AtomicInteger atomicInteger2 = VideoLiveManager.k3;
                    C1698940uJQ.LIZJ();
                    return true;
                }
                return true;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                Object messageObj2 = HandlerHook.getMessageObj(message.obj);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("_resetSurface: ");
                sbLIZ5.append(messageObj2);
                LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ5));
                if (this.LLILZ != null) {
                    AtomicInteger atomicInteger3 = VideoLiveManager.k3;
                    C1698940uJQ.LIZJ();
                    return true;
                }
                return true;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                String str3 = (String) HandlerHook.getMessageObj(message.obj);
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("_switchResolution: ");
                sbLIZ6.append(str3);
                LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ6));
                VideoLiveManager videoLiveManager10 = this.LLILZ;
                if (videoLiveManager10 != null) {
                    boolean zLLLI = videoLiveManager10.LLLI(str3);
                    InterfaceC1279680jPC interfaceC1279680jPC2 = this.LLJILJIL;
                    if (interfaceC1279680jPC2 != null) {
                        if (zLLLI) {
                            str = str3;
                        }
                        interfaceC1279680jPC2.LJJJJI(str);
                        return true;
                    }
                }
                return true;
            case 19:
                Pair pair = (Pair) HandlerHook.getMessageObj(message.obj);
                ((Boolean) pair.first).booleanValue();
                ((Boolean) pair.second).booleanValue();
                return true;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                boolean zBooleanValue2 = ((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue();
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("_configResolutionDegrade: ");
                sbLIZ7.append(zBooleanValue2);
                LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ7));
                VideoLiveManager videoLiveManager11 = this.LLILZ;
                if (videoLiveManager11 != null) {
                    videoLiveManager11.LIZJ(56, zBooleanValue2 ? 1 : 0);
                    return true;
                }
                return true;
            case 21:
                String str4 = (String) HandlerHook.getMessageObj(message.obj);
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("_configEnterMethodSubTag: ");
                sbLIZ8.append(str4);
                LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ8));
                VideoLiveManager videoLiveManager12 = this.LLILZ;
                if (videoLiveManager12 != null) {
                    videoLiveManager12.LIZ(141, str4);
                    return true;
                }
                return true;
            case 22:
                int iIntValue = ((Integer) HandlerHook.getMessageObj(message.obj)).intValue();
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("_configLiveFastOpenDuration: ");
                sbLIZ9.append(iIntValue);
                LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ9));
                VideoLiveManager videoLiveManager13 = this.LLILZ;
                if (videoLiveManager13 != null) {
                    videoLiveManager13.LLLLIILLL(iIntValue);
                    return true;
                }
                return true;
            case 23:
                Pair pair2 = (Pair) HandlerHook.getMessageObj(message.obj);
                float fFloatValue = ((Float) pair2.first).floatValue();
                ((Float) pair2.second).floatValue();
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("_setVolume: ");
                sbLIZ10.append(fFloatValue);
                LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ10));
                VideoLiveManager videoLiveManager14 = this.LLILZ;
                if (videoLiveManager14 != null) {
                    videoLiveManager14.LLLLLLZ(fFloatValue);
                    return true;
                }
                return true;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                Pair pair3 = (Pair) HandlerHook.getMessageObj(message.obj);
                String str5 = (String) pair3.first;
                String str6 = (String) pair3.second;
                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                sbLIZ11.append("setDataSource with streamData,  defaultResolution: ");
                sbLIZ11.append(str6);
                LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ11));
                VideoLiveManager videoLiveManager15 = this.LLILZ;
                if (videoLiveManager15 != null) {
                    videoLiveManager15.LLLLLL(str5);
                    if (!TextUtils.isEmpty(str6)) {
                        this.LLILZ.LIZ(43, str6);
                        return true;
                    }
                }
                return true;
            case 25:
                C1699080uJe c1699080uJe = (C1699080uJe) HandlerHook.getMessageObj(message.obj);
                LJJLIIIIJ("setDataSource with liveURL");
                VideoLiveManager videoLiveManager16 = this.LLILZ;
                if (videoLiveManager16 != null) {
                    videoLiveManager16.LLLLLILLIL(new C1698830uJF[]{new C1698830uJF(c1699080uJe.LIZ, c1699080uJe.LIZIZ, c1699080uJe.LIZJ)});
                    return true;
                }
                return true;
            case 26:
                boolean zBooleanValue3 = ((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue();
                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                sbLIZ12.append("_setRadioModeEnable: ");
                sbLIZ12.append(zBooleanValue3);
                LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ12));
                VideoLiveManager videoLiveManager17 = this.LLILZ;
                if (videoLiveManager17 != null) {
                    Boolean boolValueOf = Boolean.valueOf(zBooleanValue3);
                    StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                    sbLIZ13.append("setDisableVideoRender: ");
                    sbLIZ13.append(boolValueOf);
                    C2188811AlT.LIZIZ(sbLIZ13);
                    C1698940uJQ.LIZJ();
                    if (videoLiveManager17.LIZLLL != null) {
                        LiveLoggerService liveLoggerService2 = videoLiveManager17.LJIILLIIL;
                        boolean zBooleanValue4 = boolValueOf.booleanValue();
                        liveLoggerService2.K0.lock();
                        if (liveLoggerService2.Z4 != zBooleanValue4) {
                            liveLoggerService2.Z4 = zBooleanValue4;
                            liveLoggerService2.LJLJL();
                        }
                        liveLoggerService2.K0.unlock();
                        ((C1470430oMr) videoLiveManager17.LIZLLL).LIZJ(261, boolValueOf.booleanValue() ? 1 : 0);
                        return true;
                    }
                }
                return true;
            case 27:
                boolean zBooleanValue5 = ((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue();
                StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                sbLIZ14.append("_configBackgroundStatus: ");
                sbLIZ14.append(zBooleanValue5);
                LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ14));
                VideoLiveManager videoLiveManager18 = this.LLILZ;
                if (videoLiveManager18 != null) {
                    videoLiveManager18.LIZJ(167, zBooleanValue5 ? 1 : 0);
                    return true;
                }
                return true;
            case 28:
                int iIntValue2 = ((Integer) HandlerHook.getMessageObj(message.obj)).intValue();
                StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                sbLIZ15.append("_configBackgroundMode: ");
                sbLIZ15.append(iIntValue2);
                LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ15));
                VideoLiveManager videoLiveManager19 = this.LLILZ;
                if (videoLiveManager19 != null) {
                    videoLiveManager19.LIZJ(168, iIntValue2);
                    return true;
                }
                return true;
            case 29:
                boolean zBooleanValue6 = ((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue();
                StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                sbLIZ16.append("_configPrePlayShow: ");
                sbLIZ16.append(zBooleanValue6);
                LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ16));
                VideoLiveManager videoLiveManager20 = this.LLILZ;
                if (videoLiveManager20 != null) {
                    videoLiveManager20.LIZJ(145, zBooleanValue6 ? 1 : 0);
                    return true;
                }
                return true;
            case 30:
                VideoLiveManager videoLiveManager21 = this.LLILZ;
                if (videoLiveManager21 != null) {
                    C1698940uJQ.LIZJ();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (TextUtils.isEmpty(videoLiveManager21.Q0)) {
                        C1698940uJQ.LIZIZ();
                        videoLiveManager21.LJIILLIIL.LJJIJL(-20, jCurrentTimeMillis);
                        return true;
                    }
                    EnumC1487700ooi enumC1487700ooiLJIIIZ = videoLiveManager21.LJIIIZ();
                    if (enumC1487700ooiLJIIIZ != EnumC1487700ooi.PREPARED) {
                        StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                        sbLIZ17.append("player status is wrong:");
                        sbLIZ17.append(enumC1487700ooiLJIIIZ);
                        C2188811AlT.LIZIZ(sbLIZ17);
                        C1698940uJQ.LIZIZ();
                        videoLiveManager21.LJIILLIIL.LJJIJL(-21, jCurrentTimeMillis);
                        return true;
                    }
                    C1476650oWt c1476650oWt = C1476660oWu.LIZ;
                    String str7 = videoLiveManager21.Q0;
                    if (c1476650oWt.LIZJ && (iStopPreIO = LiveIOManager.getInstance().startPreIO(str7)) >= 0) {
                        videoLiveManager21.LJIIJ(EnumC1487700ooi.PREIO);
                    }
                    videoLiveManager21.LJIILLIIL.LJJIJL(iStopPreIO, jCurrentTimeMillis);
                    StringBuilder sbLIZ18 = C2188811AlT.LIZ();
                    sbLIZ18.append("start preio ret:");
                    sbLIZ18.append(iStopPreIO);
                    C2188811AlT.LIZIZ(sbLIZ18);
                    C1698940uJQ.LIZJ();
                    return true;
                }
                return true;
            case 31:
                VideoLiveManager videoLiveManager22 = this.LLILZ;
                if (videoLiveManager22 != null) {
                    C1698940uJQ.LIZJ();
                    LiveLoggerService liveLoggerService3 = videoLiveManager22.LJIILLIIL;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    C1698980uJU c1698980uJU = liveLoggerService3.g7;
                    if (c1698980uJU != null) {
                        c1698980uJU.LIZIZ = jCurrentTimeMillis2;
                    }
                    if (TextUtils.isEmpty(videoLiveManager22.Q0)) {
                        C1698940uJQ.LIZIZ();
                        return true;
                    }
                    EnumC1487700ooi enumC1487700ooiLJIIIZ2 = videoLiveManager22.LJIIIZ();
                    if (enumC1487700ooiLJIIIZ2 != EnumC1487700ooi.PREIO) {
                        StringBuilder sbLIZ19 = C2188811AlT.LIZ();
                        sbLIZ19.append("player status is wrong:");
                        sbLIZ19.append(enumC1487700ooiLJIIIZ2);
                        C2188811AlT.LIZIZ(sbLIZ19);
                        C1698940uJQ.LIZIZ();
                        return true;
                    }
                    C1476650oWt c1476650oWt2 = C1476660oWu.LIZ;
                    String str8 = videoLiveManager22.Q0;
                    if (c1476650oWt2.LIZJ) {
                        iStopPreIO = LiveIOManager.getInstance().stopPreIO(str8);
                    }
                    StringBuilder sbLIZ20 = C2188811AlT.LIZ();
                    sbLIZ20.append("stop preio ret:");
                    sbLIZ20.append(iStopPreIO);
                    C2188811AlT.LIZIZ(sbLIZ20);
                    C1698940uJQ.LIZJ();
                    return true;
                }
                return true;
            case 32:
                boolean zBooleanValue7 = ((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue();
                VideoLiveManager videoLiveManager23 = this.LLILZ;
                if (videoLiveManager23 != null && (liveLoggerService = videoLiveManager23.LJIILLIIL) != null) {
                    if (zBooleanValue7) {
                        if (liveLoggerService.LLLFZ == null) {
                            liveLoggerService.LLLFZ = new C1279650jP9();
                            return true;
                        }
                    } else if (liveLoggerService.LLLFZ != null) {
                        liveLoggerService.LLLFZ = null;
                        return true;
                    }
                }
                return true;
        }
    }

    @Override // X.C1EOS
    public final void setSurface(Surface surface) {
        LJJLIIIJ(12, surface);
    }

    @Override // X.C1EOS
    public final int stopAuxAudioDucking(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[AudioDucking] stopAuxAudioDucking called duckingId=");
        sbLIZ.append(i);
        LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZ.LIZJ(322, 1);
        return 0;
    }

    @Override // X.C1EOS
    public final void switchResolution(String str) {
        LJJLIIIJ(18, str);
    }

    @Override // X.C1EOS
    public final void LJIIL(String str, String str2) {
        LJJLIIIJ(24, new Pair(str, str2));
    }

    @Override // X.C1EOS
    public final void LJIILLIIL(float f, float f2) {
        LJJLIIIJ(23, new Pair(Float.valueOf(f), Float.valueOf(f2)));
    }

    @Override // X.C1EOS
    public final int LJJIIZ(C1698900uJM c1698900uJM, C1699380uK8 c1699380uK8) {
        LJJLIIIIJ("[AudioDucking] startAuxAudioDucking");
        this.LLJI = c1699380uK8;
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(52).order(ByteOrder.nativeOrder());
        byteBufferOrder.putFloat(0.0f);
        byteBufferOrder.putFloat(c1698900uJM.LIZ);
        byteBufferOrder.putFloat(c1698900uJM.LIZIZ);
        byteBufferOrder.putFloat(c1698900uJM.LIZJ);
        byteBufferOrder.putFloat(c1698900uJM.LIZLLL);
        byteBufferOrder.putFloat(c1698900uJM.LJ);
        byteBufferOrder.putFloat(c1698900uJM.LJFF);
        byteBufferOrder.putInt(1);
        byteBufferOrder.putInt(c1698900uJM.LJI);
        byteBufferOrder.putInt(c1698900uJM.LJII);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(c1698900uJM.LJIIIIZZ);
        byteBufferOrder.putFloat(c1698900uJM.LJIIIZ);
        byteBufferOrder.flip();
        this.LLILZ.LIZIZ(320, LJJL(byteBufferOrder));
        int iIncrementAndGet = this.LLJIJIL.incrementAndGet();
        this.LLILZ.LIZJ(325, iIncrementAndGet);
        this.LLILZ.LIZJ(321, 1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[AudioDucking] startAuxAudioDucking return duckingId=");
        sbLIZ.append(iIncrementAndGet);
        LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ));
        return iIncrementAndGet;
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJIJ(String str, JSONObject jSONObject) {
        InterfaceC1279680jPC interfaceC1279680jPC = this.LLJILJIL;
        if (interfaceC1279680jPC != null) {
            interfaceC1279680jPC.tc(str, jSONObject);
        }
    }

    @Override // X.C1EOS
    public final void LJJIL(boolean z, boolean z2) {
        LJJLIIIJ(19, new Pair(Boolean.valueOf(z), Boolean.valueOf(z2)));
    }

    public final void LJJLIIIJ(int i, Object obj) {
        if (LJJLI()) {
            Message.obtain(this.LLILLL, i, obj).sendToTarget();
        }
    }

    @Override // X.InterfaceC1698710uJ3
    public final void onVideoSizeChanged(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoSizeChanged: ");
        sbLIZ.append(i);
        sbLIZ.append("x");
        sbLIZ.append(i2);
        LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1279680jPC interfaceC1279680jPC = this.LLJILJIL;
        if (interfaceC1279680jPC != null) {
            interfaceC1279680jPC.onVideoSizeChanged(i, i2);
        }
    }

    @Override // X.C1EOS
    public final int writeAuxAudioDuckingPCM(byte[] bArr, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[AudioDucking]  writeAuxAudioDuckingPCM called duckingId=");
        sbLIZ.append(i);
        LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZ.LIZJ(323, bArr.length);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.put(bArr, 0, bArr.length);
        byteBufferAllocateDirect.flip();
        this.LLILZ.LIZIZ(324, LJJL(byteBufferAllocateDirect));
        return 0;
    }

    @Override // X.C1EOS
    public final void LJII(final SurfaceControl surfaceControl, final int i, final int i2) {
        if (this.LLILZ != null && !this.LLIZLLLIL) {
            if (surfaceControl == null) {
                C786410Ut5.LJL(this.LLILLL, new Runnable() { // from class: X.0jRN
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1698860uJI c1698860uJI = this.LL;
                        SurfaceControl surfaceControl2 = surfaceControl;
                        int i3 = i;
                        int i4 = i2;
                        c1698860uJI.getClass();
                        C1C7U.LIZ("TTKLivePlayer2@97f4.setSurfaceControl$1L");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("setSurfaceControl postAtFrontOfQueue: ");
                        sbLIZ.append(surfaceControl2);
                        c1698860uJI.LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ));
                        c1698860uJI.LLILZ.LLLLLLIL(surfaceControl2, i3, i4);
                        C1C7U.LIZIZ("TTKLivePlayer2@97f4.setSurfaceControl$1L");
                    }
                });
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setSurfaceControl: ");
            sbLIZ.append(surfaceControl);
            LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ));
            this.LLILZ.LLLLLLIL(surfaceControl, i, i2);
        }
    }

    @Override // X.C1EOS
    public final void LJJIJIIJIL(long j, Surface surface, boolean z) {
        if (this.LLILZ != null && z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sync setSurface: ");
            sbLIZ.append(surface);
            LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ));
            this.LLILZ.LLLLZIL(j, surface);
            return;
        }
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS17S0200100_20(j, this, surface, 4));
    }

    @Override // X.C1EOS
    public final void LJJJLZIJ(long j, InterfaceC1279730jPH interfaceC1279730jPH, ExecutorService executorService, boolean z) {
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS2S0310100_20(interfaceC1279730jPH, j, this, z, executorService, 1));
    }
}
