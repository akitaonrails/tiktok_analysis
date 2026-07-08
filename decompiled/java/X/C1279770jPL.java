package X;

import android.view.SurfaceView;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicRtcDispatcher;
import com.bytedance.android.livesdk.livesetting.linkmic.LInkMicSdkCallMixStreamFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicAuxStreamHandleTiming;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFirstFrameDropAfterEnd;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkDisposeAfterRtcEndSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkUseRealFirstFrameRenderCallback;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicRustRTCMsgDispatchSetting;
import com.ss.bytertc.engine.type.RemoteAudioStats;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.RemoteVideoStats;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jPL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1279770jPL implements InterfaceC2277241EBm {
    public int LIZ = -1;
    public final /* synthetic */ C1276910jKj LIZIZ;

    @Override // X.InterfaceC2277241EBm
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC2277241EBm
    @InterfaceC1294060jmO
    public final void LJJIIZI() {
    }

    @Override // X.InterfaceC2277241EBm
    public final void LIZJ() {
        C1276910jKj c1276910jKj;
        LinkMicRtcDispatcher linkMicRtcDispatcher;
        C965350bED c965350bED = this.LIZIZ.LLILZ.LJJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ.LLILZIL);
        sbLIZ.append("_1965");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[onStartSuccess]");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LIZIZ.LLJJJJ;
        sbLIZ2.append(interfaceC1276380jJs != null ? Integer.valueOf(interfaceC1276380jJs.hashCode()) : null);
        C1AZW.LJIIIZ(c965350bED, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        this.LIZIZ.LLJJIJIL = false;
        if (!((CopyOnWriteArrayList) this.LIZIZ.LLJLILLLLZIIL).isEmpty()) {
            List<InterfaceC1277190jLB> list = this.LIZIZ.LLJLILLLLZIIL;
            ArrayList<InterfaceC1277190jLB> arrayList = new ArrayList();
            for (Object obj : (CopyOnWriteArrayList) list) {
                if (((InterfaceC1277190jLB) obj).triggerTiming() == C00FE.ON_START_SUCCESS) {
                    arrayList.add(obj);
                }
            }
            C1276910jKj c1276910jKj2 = this.LIZIZ;
            for (InterfaceC1277190jLB interfaceC1277190jLB : arrayList) {
                ((CopyOnWriteArrayList) c1276910jKj2.LLJLILLLLZIIL).remove(interfaceC1277190jLB);
                interfaceC1277190jLB.execute();
            }
        }
        if (LInkMicSdkCallMixStreamFixSetting.INSTANCE.enable() && (linkMicRtcDispatcher = (c1276910jKj = this.LIZIZ).LLJJLIIIJLLLLLLLZ) != null) {
            linkMicRtcDispatcher.LJIIZILJ(c1276910jKj.LLILZ.LJJIJIIJI());
        }
        C1276910jKj.LJJLIIJ(new C965480bEQ(this.LIZIZ));
    }

    @Override // X.InterfaceC2277241EBm
    public final void LIZLLL() {
        C965350bED c965350bED = this.LIZIZ.LLILZ.LJJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ.LLILZIL);
        sbLIZ.append("_2124");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[onEndSuccess], rtcClient:");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LIZIZ.LLJJJJ;
        sbLIZ2.append(interfaceC1276380jJs != null ? Integer.valueOf(interfaceC1276380jJs.hashCode()) : null);
        C1AZW.LJIIIZ(c965350bED, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        if (LinkMicSdkDisposeAfterRtcEndSetting.getValue() || !this.LIZIZ.LLILLJJLI) {
            this.LIZIZ.LLJJIJIL = true;
        }
        C1276910jKj c1276910jKj = this.LIZIZ;
        int i = c1276910jKj.LLILLL;
        if (i == 4 || i == 0) {
            LinkMicRtcDispatcher linkMicRtcDispatcher = c1276910jKj.LLJJLIIIJLLLLLLLZ;
            if (linkMicRtcDispatcher != null) {
                linkMicRtcDispatcher.LJIJJ();
            }
        } else {
            c1276910jKj.stopForwardStreamToRooms();
        }
        if (LinkMicSdkDisposeAfterRtcEndSetting.getValue() || !this.LIZIZ.LLILLJJLI) {
            this.LIZIZ.LJJJJZI(true, false, "onEndSuccess", null);
        }
        C1276910jKj.LJJLIIJ(new C1279880jPW(this.LIZIZ));
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJ() {
        InterfaceC1280020jPk interfaceC1280020jPk = this.LIZIZ.LLJLL;
        if (interfaceC1280020jPk != null) {
            interfaceC1280020jPk.LIZIZ();
        }
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJI() {
        this.LIZIZ.getClass();
        C1276910jKj.LJJLIIJ(new C1279930jPb(this.LIZIZ));
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJIILJJIL() {
        C1276910jKj c1276910jKj = this.LIZIZ;
        LinkMicRtcDispatcher linkMicRtcDispatcher = c1276910jKj.LLJJLIIIJLLLLLLLZ;
        if (linkMicRtcDispatcher != null) {
            linkMicRtcDispatcher.LJJJJJ(Collections.singletonList(new C1280010jPj(String.valueOf(c1276910jKj.LL.getId()), EnumC1288020jce.Failure, EnumC2233131Cal.InvalidArgument)));
        }
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJIJJLI() {
        InterfaceC1280020jPk interfaceC1280020jPk = this.LIZIZ.LLJLL;
        if (interfaceC1280020jPk != null) {
            interfaceC1280020jPk.LIZJ();
        }
    }

    public C1279770jPL(C1276910jKj c1276910jKj) {
        this.LIZIZ = c1276910jKj;
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJIILLIIL(EnumC1276080jJO enumC1276080jJO) {
        List<C968980bK4> listLIZ;
        C1CX9 c1cx9;
        InterfaceC1279800jPO interfaceC1279800jPO;
        this.LIZIZ.LLJJIJIIJIL = enumC1276080jJO;
        if (enumC1276080jJO == EnumC1276080jJO.LinkMic) {
            if (LinkMicAuxStreamHandleTiming.INSTANCE.enable()) {
                C1276910jKj c1276910jKj = this.LIZIZ;
                if (c1276910jKj.LLILZ.LIZ.netMode == 1 && (interfaceC1279800jPO = c1276910jKj.LLJJJ) != null) {
                    interfaceC1279800jPO.LJJLIIIJ();
                }
            }
            C1276910jKj c1276910jKj2 = this.LIZIZ;
            int i = c1276910jKj2.LLILLL;
            if (i == 2 || i == 0) {
                C967370bHT c967370bHT = c1276910jKj2.LLILZ.LJJII;
                if (c967370bHT == null || (listLIZ = c967370bHT.LJII.LIZ(false)) == null) {
                    listLIZ = C13BV.INSTANCE;
                }
                C1276910jKj c1276910jKj3 = this.LIZIZ;
                for (C968980bK4 c968980bK4 : listLIZ) {
                    Integer num = (Integer) ((LinkedHashMap) c1276910jKj3.LLJJJJLIIL).get(c968980bK4.LIZIZ);
                    if (num != null && ((c1cx9 = c968980bK4.LIZJ) == C1CX9.LiveStudioStreamLandscape || c1cx9 == C1CX9.LiveStudioStreamPortrait)) {
                        if (!Intrinsics.LJFF(c1276910jKj3.LLJJJJJIL, c968980bK4.LIZIZ)) {
                            C966020bFI c966020bFI = c1276910jKj3.LLILZ;
                            c966020bFI.LJ().LJIIIZ(num.intValue(), c968980bK4.LIZIZ);
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJJIIJZLJL(String str) {
        C1276910jKj c1276910jKj = this.LIZIZ;
        C965350bED c965350bED = c1276910jKj.LLILZ.LJJ;
        String str2 = c1276910jKj.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onFirstRemoteAudio] linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" hasReceivedEndSuccessCallback=");
        sbLIZ.append(this.LIZIZ.LLJJIJIL);
        C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        LinkMicRtcDispatcher linkMicRtcDispatcher = this.LIZIZ.LLJJLIIIJLLLLLLLZ;
        if (linkMicRtcDispatcher != null) {
            linkMicRtcDispatcher.LJJIZ(str);
        }
        C1276910jKj.LJJLIIJ(new C1279840jPS(this.LIZIZ, str));
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJJIIZ(C1275890jJ5 c1275890jJ5) {
        C1276910jKj.LJJLIIJ(new C1279920jPa(this.LIZIZ, c1275890jJ5));
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJJIJIIJI(String str) {
        LinkMicRtcDispatcher linkMicRtcDispatcher;
        C1276910jKj c1276910jKj = this.LIZIZ;
        C965350bED c965350bED = c1276910jKj.LLILZ.LJJ;
        String str2 = c1276910jKj.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onFirstRemoteVideoFrame] linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" hasReceivedEndSuccessCallback=");
        sbLIZ.append(this.LIZIZ.LLJJIJIL);
        C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if ((!LinkMicFirstFrameDropAfterEnd.INSTANCE.enable() || !this.LIZIZ.LLJJIJIL) && (linkMicRtcDispatcher = this.LIZIZ.LLJJLIIIJLLLLLLLZ) != null) {
            linkMicRtcDispatcher.LJJJ(str);
        }
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJJIJLIJ(RemoteStreamStats remoteStreamStats) {
        String str;
        float f;
        RemoteVideoStats remoteVideoStats;
        RemoteVideoStats remoteVideoStats2;
        if (remoteStreamStats == null || (str = remoteStreamStats.uid) == null) {
            str = "";
        }
        float f2 = 0.0f;
        if (remoteStreamStats != null && (remoteVideoStats2 = remoteStreamStats.videoStats) != null) {
            f = remoteVideoStats2.receivedKBitrate;
        } else {
            f = 0.0f;
            if (remoteStreamStats != null) {
            }
            if (remoteStreamStats != null && (remoteVideoStats = remoteStreamStats.videoStats) != null) {
                C965900bF6.LIZ(new C1279900jPY(this.LIZIZ, new C1283480jVK(str, remoteVideoStats.width, remoteVideoStats.height, remoteVideoStats.videoLossRate, remoteVideoStats.receivedKBitrate, remoteVideoStats.decoderOutputFrameRate, remoteVideoStats.rendererOutputFrameRate, remoteVideoStats.stallCount, remoteVideoStats.stallDuration, remoteVideoStats.e2eDelay, remoteStreamStats.isScreen, remoteVideoStats.statsInterval, remoteVideoStats.rtt, remoteVideoStats.frozenRate, remoteVideoStats.videoIndex)));
            }
            C1276910jKj.LJJLIIJ(new C1279890jPX(this.LIZIZ, str, f, f2));
        }
        RemoteAudioStats remoteAudioStats = remoteStreamStats.audioStats;
        if (remoteAudioStats != null) {
            f2 = remoteAudioStats.receivedKBitrate;
        }
        if (remoteStreamStats != null) {
            C965900bF6.LIZ(new C1279900jPY(this.LIZIZ, new C1283480jVK(str, remoteVideoStats.width, remoteVideoStats.height, remoteVideoStats.videoLossRate, remoteVideoStats.receivedKBitrate, remoteVideoStats.decoderOutputFrameRate, remoteVideoStats.rendererOutputFrameRate, remoteVideoStats.stallCount, remoteVideoStats.stallDuration, remoteVideoStats.e2eDelay, remoteStreamStats.isScreen, remoteVideoStats.statsInterval, remoteVideoStats.rtt, remoteVideoStats.frozenRate, remoteVideoStats.videoIndex)));
        }
        C1276910jKj.LJJLIIJ(new C1279890jPX(this.LIZIZ, str, f, f2));
    }

    @Override // X.InterfaceC2277241EBm
    public final void onAuxStreamPublished(String str) {
        LinkMicRtcDispatcher linkMicRtcDispatcher = this.LIZIZ.LLJJLIIIJLLLLLLLZ;
        if (linkMicRtcDispatcher != null) {
            linkMicRtcDispatcher.LIZLLL(str);
        }
    }

    @Override // X.InterfaceC2277241EBm
    public final void onAuxStreamUnpublished(String str) {
        LinkMicRtcDispatcher linkMicRtcDispatcher = this.LIZIZ.LLJJLIIIJLLLLLLLZ;
        if (linkMicRtcDispatcher != null) {
            linkMicRtcDispatcher.LJI(str);
        }
    }

    @Override // X.InterfaceC2277241EBm
    public final void onUserJoined(String str) {
        C1276910jKj c1276910jKj = this.LIZIZ;
        C965350bED c965350bED = c1276910jKj.LLILZ.LJJ;
        String str2 = c1276910jKj.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onUserJoined] linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" hasReceivedEndSuccessCallback=");
        sbLIZ.append(this.LIZIZ.LLJJIJIL);
        C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (!((CopyOnWriteArrayList) this.LIZIZ.LLJLILLLLZIIL).isEmpty()) {
            List<InterfaceC1277190jLB> list = this.LIZIZ.LLJLILLLLZIIL;
            ArrayList<InterfaceC1277190jLB> arrayList = new ArrayList();
            for (Object obj : (CopyOnWriteArrayList) list) {
                if (((InterfaceC1277190jLB) obj).triggerTiming() == C00FE.ON_USER_JOINED) {
                    arrayList.add(obj);
                }
            }
            C1276910jKj c1276910jKj2 = this.LIZIZ;
            for (InterfaceC1277190jLB interfaceC1277190jLB : arrayList) {
                ((CopyOnWriteArrayList) c1276910jKj2.LLJLILLLLZIIL).remove(interfaceC1277190jLB);
                interfaceC1277190jLB.execute();
            }
        }
        if (LInkMicSdkCallMixStreamFixSetting.INSTANCE.enable()) {
            LinkMicRtcDispatcher linkMicRtcDispatcher = this.LIZIZ.LLJJLIIIJLLLLLLLZ;
            if (linkMicRtcDispatcher != null) {
                linkMicRtcDispatcher.LJJJJ(str);
            }
        } else {
            LinkMicRtcDispatcher linkMicRtcDispatcher2 = this.LIZIZ.LLJJLIIIJLLLLLLLZ;
            if (linkMicRtcDispatcher2 != null) {
                linkMicRtcDispatcher2.LJIIZILJ(str);
            }
        }
        C1276910jKj.LJJLIIJ(new C1279850jPT(this.LIZIZ, str));
    }

    @Override // X.InterfaceC2277241EBm
    public final void LIZIZ(String str, SurfaceView surfaceView) {
        LinkMicRtcDispatcher linkMicRtcDispatcher;
        C1276910jKj c1276910jKj = this.LIZIZ;
        int i = c1276910jKj.LLILLL;
        if ((i == 2 || i == 0) && (linkMicRtcDispatcher = c1276910jKj.LLJJLIIIJLLLLLLLZ) != null) {
            linkMicRtcDispatcher.LJII(str);
        }
        C1276910jKj c1276910jKj2 = this.LIZIZ;
        c1276910jKj2.LLJJJJJIL = str;
        C1276910jKj.LJJLIIJ(new C1279780jPM(c1276910jKj2, str, surfaceView));
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJII(long j, String str) {
        EnumC1280040jPm enumC1280040jPm;
        C1276910jKj c1276910jKj = this.LIZIZ;
        C965350bED c965350bED = c1276910jKj.LLILZ.LJJ;
        String str2 = c1276910jKj.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onUserLeaved] linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(", leaveReason=");
        sbLIZ.append(j);
        C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        LinkMicRtcDispatcher linkMicRtcDispatcher = this.LIZIZ.LLJJLIIIJLLLLLLLZ;
        if (linkMicRtcDispatcher != null) {
            if (j == 1) {
                enumC1280040jPm = EnumC1280040jPm.Dropped;
            } else if (j == 2) {
                enumC1280040jPm = EnumC1280040jPm.BecomeAudience;
            } else {
                enumC1280040jPm = EnumC1280040jPm.Quit;
            }
            linkMicRtcDispatcher.LJJ(str, enumC1280040jPm);
        }
        LJJIFFI(str);
        C1276910jKj.LJJLIIJ(new C1279990jPh(this.LIZIZ, str, j));
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJIIJJI(String str, SurfaceView surfaceView) {
        LinkMicRtcDispatcher linkMicRtcDispatcher;
        C1276910jKj c1276910jKj = this.LIZIZ;
        C965350bED c965350bED = c1276910jKj.LLILZ.LJJ;
        String str2 = c1276910jKj.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onFirstRemoteVideoFrameRender] linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" hasReceivedEndSuccessCallback=");
        sbLIZ.append(this.LIZIZ.LLJJIJIL);
        sbLIZ.append(", surfaceView:");
        sbLIZ.append(surfaceView);
        C1AZW.LJIILLIIL(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (!LivesdkUseRealFirstFrameRenderCallback.getValue() && (linkMicRtcDispatcher = this.LIZIZ.LLJJLIIIJLLLLLLLZ) != null) {
            linkMicRtcDispatcher.LJJIL(str);
        }
        C1276910jKj.LJJLIIJ(new C1279810jPP(this.LIZIZ, str, surfaceView));
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJIIZILJ(String str, SurfaceView surfaceView) {
        C1276910jKj c1276910jKj = this.LIZIZ;
        C965350bED c965350bED = c1276910jKj.LLILZ.LJJ;
        String str2 = c1276910jKj.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onFirstRemoteVideoFrameRealRender] linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" hasReceivedEndSuccessCallback=");
        sbLIZ.append(this.LIZIZ.LLJJIJIL);
        C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (LivesdkUseRealFirstFrameRenderCallback.getValue()) {
            LinkMicRtcDispatcher linkMicRtcDispatcher = this.LIZIZ.LLJJLIIIJLLLLLLLZ;
            if (linkMicRtcDispatcher != null) {
                linkMicRtcDispatcher.LJJIL(str);
            }
            C1276910jKj.LJJLIIJ(new C1279790jPN(this.LIZIZ, str, surfaceView));
        }
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJIJ(String str, String str2) {
        LinkMicRtcDispatcher linkMicRtcDispatcher = this.LIZIZ.LLJJLIIIJLLLLLLLZ;
        if (linkMicRtcDispatcher != null) {
            linkMicRtcDispatcher.LJIILLIIL(str, str2);
        }
        C1276910jKj c1276910jKj = this.LIZIZ;
        C965350bED c965350bED = c1276910jKj.LLILZ.LJJ;
        String str3 = c1276910jKj.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onUserMsgReceived] linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(", message=");
        sbLIZ.append(str2);
        C1AZW.LIZIZ(c965350bED, str3, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C1276910jKj.LJJLIIJ(new C1279960jPe(this.LIZIZ, str, str2));
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJIJI(String str, String str2) {
        LinkMicRtcDispatcher linkMicRtcDispatcher;
        if (LinkMicRustRTCMsgDispatchSetting.INSTANCE.enable() && (linkMicRtcDispatcher = this.LIZIZ.LLJJLIIIJLLLLLLLZ) != null) {
            linkMicRtcDispatcher.LJIILL(str, str2);
        }
        C1276910jKj c1276910jKj = this.LIZIZ;
        C965350bED c965350bED = c1276910jKj.LLILZ.LJJ;
        String str3 = c1276910jKj.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onRoomMsgReceived] linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(", message=");
        sbLIZ.append(str2);
        C1AZW.LIZIZ(c965350bED, str3, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C1276910jKj.LJJLIIJ(new C1279950jPd(this.LIZIZ, str, str2));
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJJ(String str, SurfaceView surfaceView) {
        String strLJIIL;
        C1276910jKj c1276910jKj = this.LIZIZ;
        C965350bED c965350bED = c1276910jKj.LLILZ.LJJ;
        String str2 = c1276910jKj.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onSingleViewToMultiView] linkMicId = ");
        sbLIZ.append(str);
        sbLIZ.append(", surfaceView:");
        if (surfaceView != null) {
            strLJIIL = C500260Jjc.LJIIL(surfaceView);
        } else {
            strLJIIL = null;
        }
        sbLIZ.append(strLJIIL);
        C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C1276910jKj c1276910jKj2 = this.LIZIZ;
        c1276910jKj2.LLIZLLLIL = EnumC952680atm.DEFAULT;
        C1276910jKj.LJJLIIJ(new C1279910jPZ(c1276910jKj2, str, surfaceView));
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJJIII(String str, InterfaceC1268870j7l interfaceC1268870j7l) {
        LinkMicRtcDispatcher linkMicRtcDispatcher;
        C1276910jKj c1276910jKj = this.LIZIZ;
        C965350bED c965350bED = c1276910jKj.LLILZ.LJJ;
        String str2 = c1276910jKj.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onFirstRemoteVideoFrameRender] linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" hasReceivedEndSuccessCallback=");
        sbLIZ.append(this.LIZIZ.LLJJIJIL);
        C1AZW.LJIILLIIL(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (!LivesdkUseRealFirstFrameRenderCallback.getValue() && (linkMicRtcDispatcher = this.LIZIZ.LLJJLIIIJLLLLLLLZ) != null) {
            linkMicRtcDispatcher.LJJIL(str);
        }
        C1276910jKj.LJJLIIJ(new C1279820jPQ(this.LIZIZ, str, interfaceC1268870j7l));
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJJIJ(long j, long j2) {
        InterfaceC1280020jPk interfaceC1280020jPk = this.LIZIZ.LLJLL;
        if (interfaceC1280020jPk != null) {
            interfaceC1280020jPk.LIZ(j, j2);
        }
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJJIJIIJIL(Boolean bool, String str) {
        if (bool != null) {
            C1276910jKj c1276910jKj = this.LIZIZ;
            bool.booleanValue();
            C1276910jKj.LJJLIIJ(new C1279980jPg(c1276910jKj, str, bool));
        }
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJJIJIL(Boolean bool, String str) {
        if (bool != null) {
            C1276910jKj c1276910jKj = this.LIZIZ;
            bool.booleanValue();
            C1276910jKj.LJJLIIJ(new C1279970jPf(c1276910jKj, str, bool));
        }
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJJIJL(long j, long j2) {
        C1276910jKj.LJJLIIJ(new C1279940jPc(this.LIZIZ, j, j2));
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJIJJ(String[] strArr, boolean[] zArr, int[] iArr) {
        C1276910jKj.LJJLIIJ(new C1279860jPU(this.LIZIZ, strArr, zArr, iArr));
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJJII(int i, int i2, String str) {
        if (Intrinsics.LJFF(this.LIZIZ.LLILZ.LJJIJIIJI(), str) && this.LIZ != i) {
            this.LIZ = i;
        }
        C1276910jKj.LJJLIIJ(new C1280000jPi(this.LIZIZ, str, i, i2));
    }

    @Override // X.InterfaceC2277241EBm
    public final void LIZ(int i, long j, Exception exc, String str) throws JSONException {
        String message;
        String str2;
        C1276910jKj c1276910jKj = this.LIZIZ;
        C965350bED c965350bED = c1276910jKj.LLILZ.LJJ;
        String str3 = c1276910jKj.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onError] code=");
        sbLIZ.append(i);
        sbLIZ.append(", subCode:");
        sbLIZ.append(j);
        sbLIZ.append(", desc=");
        sbLIZ.append(str);
        C1AZW.LJI(c965350bED, str3, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C1276910jKj c1276910jKj2 = this.LIZIZ;
        C966020bFI c966020bFI = c1276910jKj2.LLILZ;
        if (c966020bFI != null && (i == 407 || i == 409)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c1276910jKj2.LLILZIL);
            sbLIZ2.append("_onError code:");
            sbLIZ2.append(i);
            sbLIZ2.append(" desc:");
            sbLIZ2.append(str);
            sbLIZ2.append(" exception:");
            sbLIZ2.append(exc);
            C20441214yg.LJ("water_mark_opt", C2188811AlT.LIZIZ(sbLIZ2));
            C965270bE5 c965270bE5 = c966020bFI.LJIJJ;
            if (i == 407) {
                str2 = "alternate_image";
            } else {
                str2 = "background_image";
            }
            HashMap<String, String> mapLIZ = c965270bE5.LIZ(c966020bFI);
            mapLIZ.put("image_type", str2);
            mapLIZ.put("state", "failed");
            mapLIZ.put("error_code", String.valueOf(i));
            mapLIZ.put("error_msg", str);
            C965270bE5.LIZJ("livesdk_set_watermark_result", mapLIZ);
        }
        LinkMicRtcDispatcher linkMicRtcDispatcher = this.LIZIZ.LLJJLIIIJLLLLLLLZ;
        if (linkMicRtcDispatcher != null) {
            long j2 = i;
            if (exc == null || (message = exc.getMessage()) == null) {
                message = "";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sub_error_code", j);
            linkMicRtcDispatcher.LJIJJLI(new C966980bGq(j2, message, "", "", C786410Ut5.J3(jSONObject)));
        }
        C1276910jKj.LJJLIIJ(new C966860bGe(i, j, this.LIZIZ, str));
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJFF(int i, long j, Exception exc, String str) throws JSONException {
        String message;
        C965350bED c965350bED = this.LIZIZ.LLILZ.LJJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ.LLILZIL);
        sbLIZ.append("_2295");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[onEndFailed] code=");
        sbLIZ2.append(i);
        sbLIZ2.append(", subCode:");
        sbLIZ2.append(j);
        sbLIZ2.append(", desc=");
        sbLIZ2.append(str);
        C1AZW.LJI(c965350bED, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        LinkMicRtcDispatcher linkMicRtcDispatcher = this.LIZIZ.LLJJLIIIJLLLLLLLZ;
        if (linkMicRtcDispatcher != null) {
            long j2 = i;
            if (exc == null || (message = exc.getMessage()) == null) {
                message = "";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sub_error_code", j);
            linkMicRtcDispatcher.LJIJJLI(new C966980bGq(j2, message, "", "", C786410Ut5.J3(jSONObject)));
        }
        this.LIZIZ.LJJJJZI(true, false, "onEndFailed", null);
        C1276910jKj.LJJLIIJ(new C1279830jPR(i, j, this.LIZIZ, str));
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJIILL(int i, long j, Exception exc, String str) throws JSONException {
        String message;
        C965350bED c965350bED = this.LIZIZ.LLILZ.LJJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ.LLILZIL);
        sbLIZ.append("_2146");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[onStartFailed] code=");
        sbLIZ2.append(i);
        sbLIZ2.append(", subCode:");
        sbLIZ2.append(j);
        sbLIZ2.append(", desc=");
        sbLIZ2.append(str);
        C1AZW.LJI(c965350bED, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        this.LIZIZ.LLJJIJIL = false;
        LinkMicRtcDispatcher linkMicRtcDispatcher = this.LIZIZ.LLJJLIIIJLLLLLLLZ;
        if (linkMicRtcDispatcher != null) {
            long j2 = i;
            if (exc == null || (message = exc.getMessage()) == null) {
                message = "";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sub_error_code", j);
            linkMicRtcDispatcher.LJIJJLI(new C966980bGq(j2, message, "", "", C786410Ut5.J3(jSONObject)));
        }
        C1276910jKj.LJJLIIJ(new C966660bGK(i, j, this.LIZIZ, str));
    }

    @Override // X.InterfaceC2277241EBm
    public final void LJIL(int i, int i2, SurfaceView surfaceView, String str) {
        C1276910jKj c1276910jKj = this.LIZIZ;
        C965350bED c965350bED = c1276910jKj.LLILZ.LJJ;
        String str2 = c1276910jKj.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onFirstRemoteVideoFrame] linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" hasReceivedEndSuccessCallback=");
        sbLIZ.append(this.LIZIZ.LLJJIJIL);
        C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        LinkMicRtcDispatcher linkMicRtcDispatcher = this.LIZIZ.LLJJLIIIJLLLLLLLZ;
        if (linkMicRtcDispatcher != null) {
            linkMicRtcDispatcher.LJJJ(str);
        }
        C1276910jKj.LJJLIIJ(new C1279870jPV(this.LIZIZ, str, surfaceView, i, i2));
    }
}
