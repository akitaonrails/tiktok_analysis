package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftMultiplePlayerSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoPlayerPerfOptSetting;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.live.render.engine.alphaplayer.controller.LocalPlayerControllerKotlin;
import com.bytedance.live.render.engine.alphaplayer.model.VideoFileModelKotlin;
import com.bytedance.live.render.engine.alphaplayer.player.TTMultiplePlayerImpl;
import com.bytedance.live.render.engine.alphaplayer.player.TTMultiplePlayerImplV2;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.alphaplayer.Configuration;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import com.ss.ttvideoengine.TTVideoEngine;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.text.a0;
import kotlin.text.u;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1CwZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2246651CwZ implements InterfaceC1142460fps {
    public final boolean LIZ;
    public InterfaceC2247071CxF LIZIZ;
    public Context LIZJ;
    public LifecycleOwner LIZLLL;
    public InterfaceC1142480fpu LJ;
    public InterfaceC2246631CwX LJFF;
    public LocalPlayerControllerKotlin LJII;
    public AbsPlayer LJIIIIZZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public final Object LJI = new Object();
    public boolean LJIIIZ = true;
    public final C1151890g55 LJIIL = new C1151890g55(CoroutineExceptionHandler.LJJLIL, 3);
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 381));
    public final C2246701Cwe LJIILJJIL = new InterfaceC2246741Cwi() { // from class: X.1Cwe
        @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
        public final void endAction() {
            boolean z;
            C2246651CwZ c2246651CwZ = this.LIZ;
            InterfaceC1142480fpu interfaceC1142480fpu = c2246651CwZ.LJ;
            if (interfaceC1142480fpu != null) {
                LocalPlayerControllerKotlin localPlayerControllerKotlin = c2246651CwZ.LJII;
                JSONObject jSONObject = localPlayerControllerKotlin != null ? localPlayerControllerKotlin.LLJJJJLIIL : null;
                boolean z2 = false;
                if (localPlayerControllerKotlin != null) {
                    z = localPlayerControllerKotlin.LLJJL;
                    z2 = localPlayerControllerKotlin.LLJJLIIIJLLLLLLLZ;
                } else {
                    z = false;
                }
                C2246671Cwb.LIZ.getClass();
                interfaceC1142480fpu.LIZ(new C1141460foG(jSONObject, z, z2, C2246671Cwb.LJIIIIZZ.size()));
            }
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
        public final void startAction() {
            InterfaceC1142480fpu interfaceC1142480fpu = this.LIZ.LJ;
            if (interfaceC1142480fpu != null) {
                interfaceC1142480fpu.onStart();
            }
        }

        @Override // X.InterfaceC2246741Cwi
        public final void LIZ(C1141050fnb c1141050fnb) {
            if (this.LIZ.LJ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("endActionWithError, GiftPlayer=");
                sbLIZ.append(this.LIZ.LJIIIIZZ);
                sbLIZ.append(", error = ");
                sbLIZ.append(c1141050fnb);
                C1149270g0r.LIZ("LiveGiftPlayControllerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC1142480fpu interfaceC1142480fpu = this.LIZ.LJ;
                if (interfaceC1142480fpu != null) {
                    interfaceC1142480fpu.LIZJ(c1141050fnb);
                }
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0077, code lost:
        
            if (r9 > r8) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x008c, code lost:
        
            if (r9 > r8) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0091, code lost:
        
            if (r9 > r8) goto L51;
         */
        @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onVideoSizeChange(int r11, int r12, com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource.ScaleType r13) {
            /*
                Method dump skipped, instruction units count: 202
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C2246701Cwe.onVideoSizeChange(int, int, com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource$ScaleType):void");
        }
    };
    public final C2246641CwY LJIILL = new IMonitor() { // from class: X.1CwY
        @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor
        public final void monitorInit(String str, Exception exc) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create ");
            sbLIZ.append(str);
            sbLIZ.append(" failure");
            C1141240fnu.LIZJ("LiveGiftPlayControllerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ), exc);
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor
        public final void monitor(boolean z, String str, int i, int i2, String str2) {
            C2246651CwZ c2246651CwZ = this.LIZ;
            synchronized (c2246651CwZ.LJI) {
                try {
                    InterfaceC2246631CwX interfaceC2246631CwX = c2246651CwZ.LJFF;
                    if (interfaceC2246631CwX != null) {
                        interfaceC2246631CwX.LIZIZ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    };

    @Override // X.InterfaceC1142460fps
    public final void LJIIIZ() {
        this.LJ = null;
    }

    @Override // X.InterfaceC1142460fps
    public final float LIZIZ() {
        LocalPlayerControllerKotlin localPlayerControllerKotlin = this.LJII;
        if (localPlayerControllerKotlin != null) {
            return localPlayerControllerKotlin.LJIIL();
        }
        return 0.0f;
    }

    @Override // X.InterfaceC1142460fps
    public final float LJ() {
        LocalPlayerControllerKotlin localPlayerControllerKotlin = this.LJII;
        if (localPlayerControllerKotlin != null) {
            return localPlayerControllerKotlin.LIZJ();
        }
        return -1.0f;
    }

    @Override // X.InterfaceC1142460fps
    public final void LJIIL() {
        if (this.LJII != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stopWhenSlideSwitch() called with: ");
            sbLIZ.append(LJIILL());
            C1141240fnu.LIZ("LiveGiftPlayControllerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
            LocalPlayerControllerKotlin localPlayerControllerKotlin = this.LJII;
            if (localPlayerControllerKotlin != null) {
                localPlayerControllerKotlin.reset();
            }
        }
    }

    @Override // X.InterfaceC1142460fps
    public final void LJIILIIL() {
        synchronized (this.LJI) {
            try {
                this.LJFF = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1142460fps
    public final String getPlayerType() {
        String playerType;
        LocalPlayerControllerKotlin localPlayerControllerKotlin = this.LJII;
        return (localPlayerControllerKotlin == null || (playerType = localPlayerControllerKotlin.getPlayerType()) == null) ? "unknown" : playerType;
    }

    @Override // X.InterfaceC1142460fps
    public final boolean isPlaying() {
        LocalPlayerControllerKotlin localPlayerControllerKotlin = this.LJII;
        return C176600m4.LIZIZ(localPlayerControllerKotlin != null ? Boolean.valueOf(localPlayerControllerKotlin.isPlaying()) : null);
    }

    @Override // X.InterfaceC1142460fps
    public final void release() {
        if (this.LJII != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("release() called with: ");
            sbLIZ.append(LJIILL());
            C1141240fnu.LIZ("LiveGiftPlayControllerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
            LocalPlayerControllerKotlin localPlayerControllerKotlin = this.LJII;
            if (localPlayerControllerKotlin != null) {
                localPlayerControllerKotlin.LLJ = null;
                localPlayerControllerKotlin.LLIZLLLIL = null;
                localPlayerControllerKotlin.release();
            }
            this.LJII = null;
        }
        this.LJIIIZ = true;
        this.LIZLLL = null;
        this.LIZJ = null;
        this.LJ = null;
        synchronized (this.LJI) {
            try {
                this.LJFF = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        try {
            C2296808zG.LIZLLL((InterfaceC497601wk) this.LJIILIIL.getValue(), "release");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1142460fps
    public final void stop() {
        LocalPlayerControllerKotlin localPlayerControllerKotlin = this.LJII;
        if (localPlayerControllerKotlin != null) {
            localPlayerControllerKotlin.stop();
            InterfaceC1142480fpu interfaceC1142480fpu = this.LJ;
            if (interfaceC1142480fpu != null) {
                interfaceC1142480fpu.onStop();
            }
        }
    }

    public final String LJIILL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("player_info = [LiftPlayController = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", LocalPlayerController = ");
        LocalPlayerControllerKotlin localPlayerControllerKotlin = this.LJII;
        sbLIZ.append(localPlayerControllerKotlin != null ? Integer.valueOf(localPlayerControllerKotlin.hashCode()) : null);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1142460fps
    public final void LIZ(C1142470fpt c1142470fpt) {
        this.LJ = c1142470fpt;
    }

    @Override // X.InterfaceC1142460fps
    public final void LIZLLL(InterfaceC2246631CwX interfaceC2246631CwX) {
        synchronized (this.LJI) {
            try {
                this.LJFF = interfaceC2246631CwX;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1142460fps
    public final void LJI(C1141100fng c1141100fng) {
        LocalPlayerControllerKotlin localPlayerControllerKotlin = this.LJII;
        if ((localPlayerControllerKotlin instanceof LocalPlayerControllerKotlin) && localPlayerControllerKotlin != null) {
            localPlayerControllerKotlin.LLJLILLLLZIIL = c1141100fng;
        }
    }

    @Override // X.InterfaceC1142460fps
    public final boolean LJIIIIZZ(C1141100fng c1141100fng) {
        AbsPlayer absPlayer = this.LJIIIIZZ;
        if (absPlayer == null || c1141100fng == null) {
            return false;
        }
        List<String> list = c1141100fng.LJ;
        if (list != null && list.size() > 1) {
            return absPlayer.isSupportDataPathList();
        }
        if (!(absPlayer instanceof C2246981Cx6) && !(absPlayer instanceof C2247221CxU)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1142460fps
    public final void LJIIJ(InterfaceC2247071CxF interfaceC2247071CxF) {
        C2246981Cx6 c2246981Cx6;
        this.LIZIZ = interfaceC2247071CxF;
        LocalPlayerControllerKotlin localPlayerControllerKotlin = this.LJII;
        if ((localPlayerControllerKotlin instanceof LocalPlayerControllerKotlin) && localPlayerControllerKotlin != null) {
            localPlayerControllerKotlin.LLJLIL = interfaceC2247071CxF;
            IMediaPlayer<AbsPlayer<AbsPlayer<?>>> iMediaPlayer = localPlayerControllerKotlin.LLJI;
            if ((iMediaPlayer instanceof C2246981Cx6) && (c2246981Cx6 = (C2246981Cx6) iMediaPlayer) != null) {
                c2246981Cx6.LJ = interfaceC2247071CxF;
            }
        }
    }

    public final List<String> LJIILJJIL(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            String strLIZ = C20024313Wn.LIZ(str);
            if (strLIZ == null) {
                strLIZ = "";
            }
            boolean z = true;
            boolean zExists = false;
            if (LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableConfig()) {
                if (str != null && !a0.LJJJIL(str)) {
                    z = false;
                }
                if (z) {
                    continue;
                } else {
                    C2246671Cwb.LIZ.getClass();
                    String strLJI = C2246671Cwb.LJI(strLIZ);
                    if (!a0.LJJJIL(strLJI)) {
                        arrayList.add(strLJI);
                    } else {
                        String strLIZIZ = C20024313Wn.LIZIZ(strLIZ);
                        if (strLIZIZ == null) {
                            strLIZIZ = "";
                        }
                        if (!a0.LJJJIL(strLIZIZ)) {
                            arrayList.add(strLIZIZ);
                            C2246671Cwb.LIZ(strLIZ, strLIZIZ);
                        } else {
                            if (str != null) {
                                zExists = new C0VSJ(str).exists();
                            }
                            synchronized (this.LJI) {
                                try {
                                    InterfaceC2246631CwX interfaceC2246631CwX = this.LJFF;
                                    if (interfaceC2246631CwX != null) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("configList: configJson is null; exist:");
                                        sbLIZ.append(zExists);
                                        C2188811AlT.LIZIZ(sbLIZ);
                                        interfaceC2246631CwX.LIZIZ();
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    }
                }
            } else {
                String strLIZIZ2 = C20024313Wn.LIZIZ(strLIZ);
                if (strLIZIZ2 != null) {
                    if (strLIZIZ2.length() != 0) {
                        z = false;
                    }
                    if (!z) {
                        arrayList.add(strLIZIZ2);
                    }
                }
                if (str != null) {
                    zExists = new C0VSJ(str).exists();
                }
                synchronized (this.LJI) {
                    try {
                        InterfaceC2246631CwX interfaceC2246631CwX2 = this.LJFF;
                        if (interfaceC2246631CwX2 != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("configList: configJson is null; exist:");
                            sbLIZ2.append(zExists);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            interfaceC2246631CwX2.LIZIZ();
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1142460fps
    public final void attachAlphaView(ViewGroup viewGroup) {
        if (this.LJII != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachAlphaView() called with: ");
            sbLIZ.append(LJIILL());
            C1141240fnu.LIZ("LiveGiftPlayControllerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
            LocalPlayerControllerKotlin localPlayerControllerKotlin = this.LJII;
            if (localPlayerControllerKotlin != null) {
                localPlayerControllerKotlin.attachAlphaView(viewGroup);
            }
        }
    }

    @Override // X.InterfaceC1142460fps
    public final void detachAlphaView(ViewGroup viewGroup) {
        if (this.LJII != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("detachAlphaView() called with: ");
            sbLIZ.append(LJIILL());
            C1141240fnu.LIZ("LiveGiftPlayControllerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
            LocalPlayerControllerKotlin localPlayerControllerKotlin = this.LJII;
            if (localPlayerControllerKotlin != null) {
                localPlayerControllerKotlin.detachAlphaView(viewGroup);
            }
        }
    }

    @Override // X.InterfaceC1142460fps
    public final void setVolume(float f) {
        AbsPlayer absPlayer = this.LJIIIIZZ;
        if (absPlayer != null) {
            if (absPlayer instanceof C2246981Cx6) {
                C2246981Cx6 c2246981Cx6 = (C2246981Cx6) absPlayer;
                c2246981Cx6.LJIIJJI = f;
                TTVideoEngine tTVideoEngine = c2246981Cx6.LIZLLL;
                if (tTVideoEngine != null && f < 1.0f) {
                    tTVideoEngine.LIZJ(415, 1);
                    TTVideoEngine tTVideoEngine2 = c2246981Cx6.LIZLLL;
                    if (tTVideoEngine2 != null) {
                        tTVideoEngine2.LJIILLIIL(f, f);
                        return;
                    }
                    return;
                }
                return;
            }
            if (absPlayer instanceof TTMultiplePlayerImpl) {
                ((TTMultiplePlayerImpl) absPlayer).LJIILL = f;
                return;
            }
        }
        if (!(absPlayer instanceof TTMultiplePlayerImplV2)) {
            return;
        }
        ((TTMultiplePlayerImplV2) absPlayer).LJII = f;
    }

    public static List LJIILLIIL(List list, List list2) {
        Object objFromJson;
        VideoFileModelKotlin videoFileModelKotlin;
        ArrayList arrayList = new ArrayList();
        if (LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableConfig() && list2.size() == ((ArrayList) list).size()) {
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                String str = (String) ListProtector.get(list2, i);
                if (str != null && !a0.LJJJIL(str)) {
                    C2246671Cwb.LIZ.getClass();
                    VideoFileModelKotlin videoFileModelKotlinLJII = C2246671Cwb.LJII(str);
                    if (videoFileModelKotlinLJII == null) {
                        String str2 = (String) ListProtector.get(list, i);
                        if (str2 != null && !a0.LJJJIL(str2) && (videoFileModelKotlin = (VideoFileModelKotlin) GsonProtectorUtils.fromJson(C2334609Cu.LIZIZ, str2, VideoFileModelKotlin.class)) != null) {
                            arrayList.add(videoFileModelKotlin);
                            C2246671Cwb.LIZIZ(str, videoFileModelKotlin);
                        }
                    } else {
                        arrayList.add(videoFileModelKotlinLJII);
                    }
                } else {
                    String str3 = (String) ListProtector.get(list, i);
                    if (str3 != null && !a0.LJJJIL(str3) && (objFromJson = GsonProtectorUtils.fromJson(C2334609Cu.LIZIZ, str3, (Class<Object>) VideoFileModelKotlin.class)) != null) {
                        arrayList.add(objFromJson);
                    }
                }
            }
        } else {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                Object objFromJson2 = GsonProtectorUtils.fromJson(C2334609Cu.LIZIZ, (String) it2.next(), (Class<Object>) VideoFileModelKotlin.class);
                if (objFromJson2 != null) {
                    arrayList.add(objFromJson2);
                }
            }
        }
        return arrayList;
    }

    public static String LJIIZILJ(String str, VideoFileModelKotlin videoFileModelKotlin) {
        String str2;
        String str3;
        String str4 = File.separator;
        String str5 = "";
        if (u.LJIIZILJ(str, str4, false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            VideoFileModelKotlin.Item item = videoFileModelKotlin.landscape;
            if (item != null && (str3 = item.path) != null) {
                str5 = str3;
            }
            sbLIZ.append(str5);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(str4);
        VideoFileModelKotlin.Item item2 = videoFileModelKotlin.landscape;
        if (item2 != null && (str2 = item2.path) != null) {
            str5 = str2;
        }
        sbLIZ2.append(str5);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static List LJIJ(List list, List list2) {
        if (list != null && list2 != null) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = (String) C13LP.LJJJLZIJ(i, list);
                VideoFileModelKotlin videoFileModelKotlin = (VideoFileModelKotlin) C13LP.LJJJLZIJ(i, list2);
                if (str != null && videoFileModelKotlin != null) {
                    arrayList.add(LJIIZILJ(str, videoFileModelKotlin));
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public static String LJIJI(String str, VideoFileModelKotlin videoFileModelKotlin) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(File.separator);
        VideoFileModelKotlin.Item item = videoFileModelKotlin.portrait;
        if (item == null || (str2 = item.path) == null) {
            str2 = "";
        }
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static List LJIJJ(List list, List list2) {
        if (list != null && list2 != null) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = (String) C13LP.LJJJLZIJ(i, list);
                VideoFileModelKotlin videoFileModelKotlin = (VideoFileModelKotlin) C13LP.LJJJLZIJ(i, list2);
                if (str != null && videoFileModelKotlin != null) {
                    arrayList.add(LJIJI(str, videoFileModelKotlin));
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    @Override // X.InterfaceC1142460fps
    public final C1141050fnb LIZJ(long j, List list) {
        List listLJIILLIIL;
        Object obj;
        if (this.LJII != null) {
            C1149270g0r.LIZIZ("LiveGiftPlayControllerKt_gift_video_engine", "start");
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start, startTs = ");
            sbLIZ.append(jCurrentTimeMillis);
            C1149270g0r.LIZ("LiveGiftPlayControllerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
            List<String> listLJIILJJIL = LJIILJJIL(list);
            if (((ArrayList) listLJIILJJIL).isEmpty()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("configJson is null, filePathList = ");
                sbLIZ2.append(list);
                return new C1141050fnb(-21, C2188811AlT.LIZIZ(sbLIZ2), null);
            }
            try {
                listLJIILLIIL = LJIILLIIL(listLJIILJJIL, list);
                try {
                    obj = ((ArrayList) listLJIILLIIL).get(0);
                    e = null;
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    C1141240fnu.LIZJ("LiveGiftPlayControllerKt_gift_video_engine", "start error", e);
                    obj = null;
                }
            } catch (Exception e2) {
                e = e2;
                listLJIILLIIL = null;
            }
            C1149270g0r.LIZ("LiveGiftPlayControllerKt_gift_video_engine", "start, startTs = " + jCurrentTimeMillis + ", cost = " + (System.currentTimeMillis() - jCurrentTimeMillis));
            if (obj == null) {
                synchronized (this.LJI) {
                    try {
                        InterfaceC2246631CwX interfaceC2246631CwX = this.LJFF;
                        if (interfaceC2246631CwX != null) {
                            listLJIILJJIL.toString();
                            interfaceC2246631CwX.LIZIZ();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return new C1141050fnb(-21, "configJson parse error", e);
            }
            DataSource dataSource = new DataSource();
            dataSource.setMessageId(j);
            String str = (String) C13LP.LJJJLL(list);
            if (str == null) {
                str = "";
            }
            VideoFileModelKotlin videoFileModelKotlin = (VideoFileModelKotlin) obj;
            VideoFileModelKotlin.Item item = videoFileModelKotlin.landscape;
            if (item != null) {
                DataSource.DataInfo dataInfo = new DataSource.DataInfo(LJIIZILJ(str, videoFileModelKotlin));
                dataInfo.setPathList(LJIJ(list, listLJIILLIIL));
                dataInfo.setScaleType(item.align);
                dataInfo.setVersion(item.version);
                dataInfo.setTotalFrame(item.totalFrame);
                dataInfo.setVideoWidth(item.videoWidth);
                dataInfo.setVideoHeight(item.videoHeight);
                dataInfo.setActualWidth(item.actualWidth);
                dataInfo.setActualHeight(item.actualHeight);
                dataInfo.setAlphaArea(item.alphaFrame);
                dataInfo.setRgbArea(item.rgbFrame);
                dataInfo.setMasks(item.masks);
                dataInfo.setLayers(item.LIZ());
                dataSource.setLandscapeDataInfo(dataInfo);
            }
            VideoFileModelKotlin.Item item2 = videoFileModelKotlin.portrait;
            if (item2 != null) {
                DataSource.DataInfo dataInfo2 = new DataSource.DataInfo(LJIJI(str, videoFileModelKotlin));
                dataInfo2.setPathList(LJIJJ(list, listLJIILLIIL));
                dataInfo2.setScaleType(item2.align);
                dataInfo2.setVersion(item2.version);
                dataInfo2.setTotalFrame(item2.totalFrame);
                dataInfo2.setVideoWidth(item2.videoWidth);
                dataInfo2.setVideoHeight(item2.videoHeight);
                dataInfo2.setActualWidth(item2.actualWidth);
                dataInfo2.setActualHeight(item2.actualHeight);
                dataInfo2.setAlphaArea(item2.alphaFrame);
                dataInfo2.setRgbArea(item2.rgbFrame);
                dataInfo2.setMasks(item2.masks);
                dataInfo2.setLayers(item2.LIZ());
                dataSource.setPortraitDataInfo(dataInfo2);
                dataSource.setLandscapeDataInfo(dataInfo2);
            }
            dataSource.setAutoRelease(this.LJIIIZ);
            dataSource.setLoop(this.LJIIJ);
            LocalPlayerControllerKotlin localPlayerControllerKotlin = this.LJII;
            if (localPlayerControllerKotlin != null) {
                localPlayerControllerKotlin.startWithLastFrameHold(dataSource, this.LJIIJJI);
            }
            return null;
        }
        return new C1141050fnb(-18, "playerController is null", null);
    }

    public final void LJIJJLI(LifecycleOwner lifecycleOwner, List<String> list) {
        String str;
        AbsPlayer absPlayerLJIIIIZZ;
        LocalPlayerControllerKotlin localPlayerControllerKotlin;
        this.LIZLLL = lifecycleOwner;
        boolean z = this.LIZ;
        if (this.LIZJ != null && lifecycleOwner != null) {
            LocalPlayerControllerKotlin localPlayerControllerKotlin2 = this.LJII;
            if (localPlayerControllerKotlin2 != null) {
                localPlayerControllerKotlin2.release();
                C1141240fnu.LIZLLL("LiveGiftPlayControllerKt_gift_video_engine", "createPlayerController, release playerController");
            }
            Configuration configuration = new Configuration();
            configuration.setContext(this.LIZJ);
            configuration.setAlphaVideoViewType(1);
            configuration.setLifecycleOwner(this.LIZLLL);
            if (list != null && list.size() > 1) {
                if (LiveGiftMultiplePlayerSetting.INSTANCE.isPlayerV2()) {
                    absPlayerLJIIIIZZ = new TTMultiplePlayerImplV2(this.LIZJ, this.LIZIZ);
                } else {
                    absPlayerLJIIIIZZ = new TTMultiplePlayerImpl(this.LIZJ, this.LIZIZ);
                }
            } else {
                C2246671Cwb c2246671Cwb = C2246671Cwb.LIZ;
                if (list == null || (str = (String) C13LP.LJJJLL(list)) == null) {
                    str = "";
                }
                Context context = this.LIZJ;
                InterfaceC2247071CxF interfaceC2247071CxF = this.LIZIZ;
                c2246671Cwb.getClass();
                absPlayerLJIIIIZZ = C2246671Cwb.LJIIIIZZ(str, context, interfaceC2247071CxF, z);
            }
            this.LJIIIIZZ = absPlayerLJIIIIZZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createPlayerController, giftPlayer=");
            sbLIZ.append(absPlayerLJIIIIZZ.getClass().getSimpleName());
            sbLIZ.append(" use=");
            sbLIZ.append(absPlayerLJIIIIZZ.getPlayerSimpleName());
            C1141240fnu.LIZLLL("LiveGiftPlayControllerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
            LocalPlayerControllerKotlin localPlayerControllerKotlin3 = new LocalPlayerControllerKotlin(configuration, absPlayerLJIIIIZZ, z);
            this.LJII = localPlayerControllerKotlin3;
            localPlayerControllerKotlin3.LLJ = this.LJIILJJIL;
            localPlayerControllerKotlin3.LLIZLLLIL = this.LJIILL;
            localPlayerControllerKotlin3.LJIIIIZZ(new InterfaceC2247121CxK() { // from class: X.1Cwa
                @Override // X.InterfaceC2247121CxK
                public final void LIZ() {
                    InterfaceC1142480fpu interfaceC1142480fpu = this.LIZ.LJ;
                    if (interfaceC1142480fpu != null) {
                        interfaceC1142480fpu.LJII();
                    } else {
                        C1141240fnu.LIZIZ("LiveGiftPlayControllerKt_gift_video_engine", "FirstGLFrameListener fire but no listener attached");
                    }
                }
            });
            if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).w02() && (localPlayerControllerKotlin = this.LJII) != null) {
                localPlayerControllerKotlin.LJIIIZ(EnumC1778680wO2.PAD.getValue());
                return;
            }
            return;
        }
        C1141240fnu.LIZIZ("LiveGiftPlayControllerKt_gift_video_engine", "createPlayerController, context or lifecycleOwner is null!");
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1Cwe] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.1CwY] */
    public C2246651CwZ(Context context, InterfaceC2247071CxF interfaceC2247071CxF, boolean z) {
        this.LIZJ = context;
        this.LIZIZ = interfaceC2247071CxF;
        this.LIZ = z;
    }

    @Override // X.InterfaceC1142460fps
    public final void LJII(List list, long j, AwS383S0200000_17 awS383S0200000_17) {
        if (this.LJII != null) {
            C23250099c.LIZLLL((InterfaceC497601wk) this.LJIILIIL.getValue(), null, null, new C2246621CwW(j, this, list, null, awS383S0200000_17), 3);
        } else {
            awS383S0200000_17.invoke(new C1141050fnb(-18, "playerController is null", null));
        }
    }

    @Override // X.InterfaceC1142460fps
    public final void LJIIJJI(String str, Bitmap bitmap, float f) {
        if (this.LJII != null) {
            MaskSrc maskSrc = new MaskSrc();
            maskSrc.setName(str);
            maskSrc.setType(1);
            maskSrc.setBitmap(bitmap);
            if (f - 1.0f > 0.001d) {
                maskSrc.setUseBitmapSize(false);
                if (bitmap != null) {
                    maskSrc.setWidth((int) (bitmap.getWidth() / f));
                    maskSrc.setHeight((int) (bitmap.getHeight() / f));
                }
            }
            LocalPlayerControllerKotlin localPlayerControllerKotlin = this.LJII;
            if (localPlayerControllerKotlin != null) {
                localPlayerControllerKotlin.setMask(maskSrc);
            }
        }
    }

    @Override // X.InterfaceC1142460fps
    public final void LJFF(int i, String str, String str2, String str3, boolean z) {
        LocalPlayerControllerKotlin localPlayerControllerKotlin = this.LJII;
        if (localPlayerControllerKotlin != null) {
            MaskSrc maskSrc = new MaskSrc();
            maskSrc.setName(str);
            maskSrc.setType(0);
            maskSrc.setTextColor(str3);
            maskSrc.setTextSize(i);
            maskSrc.setBold(z);
            maskSrc.setText(str2);
            localPlayerControllerKotlin.setMask(maskSrc);
        }
    }
}
