package X;

import Y.ARunnableS100S0200000_31;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHLiveReuseCameraOptSwitch;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastHostUseTTLH;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastHostUseTTLHVE;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AwS604S0100000_25;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1ALR, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ALR implements InterfaceC1654970tAV {
    public TTLiveBroadcastView LIZ;
    public volatile boolean LIZIZ;

    @Override // X.InterfaceC1654970tAV
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1654970tAV
    public final void LLLLLJIL() {
    }

    @Override // X.InterfaceC1654970tAV
    public final void LLLLLL() {
    }

    @Override // X.InterfaceC1654970tAV
    public final View LLLLLLJ() {
        TTLiveBroadcastView tTLiveBroadcastView = this.LIZ;
        if (tTLiveBroadcastView == null) {
            return null;
        }
        return tTLiveBroadcastView.LLJ;
    }

    @Override // X.InterfaceC1654970tAV
    public final boolean onBackPressed() {
        InterfaceC782930UnT interfaceC782930UnT = this.LIZ.LLJILJIL;
        if (interfaceC782930UnT != null) {
            return interfaceC782930UnT.onBackPressed();
        }
        return false;
    }

    @Override // X.InterfaceC1654970tAV
    public final boolean a() {
        return LiveBroadcastHostUseTTLHVE.getEnable();
    }

    @Override // X.InterfaceC1654970tAV
    public final void notifyCloseAllLynxDialog() {
        Live.getService().notifyCloseAllLynxDialog();
    }

    @Override // X.InterfaceC1654970tAV
    public final void LLLLL(C1655040tAc c1655040tAc) {
        TTLiveBroadcastView tTLiveBroadcastView = this.LIZ;
        if (tTLiveBroadcastView != null) {
            tTLiveBroadcastView.LLJLILLLLZIIL = c1655040tAc;
        }
    }

    @Override // X.InterfaceC1654970tAV
    public final void LLLLLIL(View... viewArr) {
        C21673119rt c21673119rt;
        View[] viewArr2;
        TTLiveBroadcastView tTLiveBroadcastView = this.LIZ;
        if (tTLiveBroadcastView != null && (c21673119rt = tTLiveBroadcastView.LLJIJIL) != null && (viewArr2 = (View[]) Arrays.copyOf(viewArr, viewArr.length)) != null) {
            for (View view : viewArr2) {
                c21673119rt.LIZLLL.add(view);
            }
        }
    }

    @Override // X.InterfaceC1654970tAV
    public final void LLLLLILLIL(C1655000tAY c1655000tAY) {
        C21673119rt c21673119rt;
        TTLiveBroadcastView tTLiveBroadcastView = this.LIZ;
        if (tTLiveBroadcastView != null && (c21673119rt = tTLiveBroadcastView.LLJIJIL) != null) {
            c21673119rt.LJFF = c1655000tAY;
        }
    }

    @Override // X.InterfaceC1654970tAV
    public final int[] LLLLLJLJLL(int[] iArr) {
        int iIntValue;
        int iIntValue2;
        List<String> listLIZIZ = C0UKZ.LLIIII.LIZIZ();
        if (listLIZIZ != null && listLIZIZ.size() >= 2) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) ListProtector.get(listLIZIZ, 0));
            if (numLJIIJJI != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numLJIIJJI2 = C2095008Iq.LJIIJJI((String) ListProtector.get(listLIZIZ, 1));
            if (numLJIIJJI2 != null) {
                iIntValue2 = numLJIIJJI2.intValue();
            } else {
                iIntValue2 = 0;
            }
            if (iIntValue > 0 && iIntValue2 > 0) {
                return new int[]{iIntValue, iIntValue2};
            }
            C770460UKe.LIZ(iArr);
            return iArr;
        }
        C770460UKe.LIZ(iArr);
        return iArr;
    }

    @Override // X.InterfaceC1654970tAV
    public final void LLLLLLL(ViewGroup viewGroup) {
        SurfaceView surfaceViewLJIJJLI;
        SurfaceView surfaceViewLJIJJLI2;
        SurfaceView surfaceView;
        SurfaceHolder holder;
        Surface surface;
        SurfaceView surfaceView2;
        if (this.LIZ != null && this.LIZIZ) {
            TTLiveBroadcastView tTLiveBroadcastView = this.LIZ;
            if (tTLiveBroadcastView.LLJJIII) {
                if (!LiveBroadcastHostUseTTLH.getEnable() && LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage()) {
                    EnumC1778840wOI enumC1778840wOI = tTLiveBroadcastView.LLIZ;
                    if (enumC1778840wOI != null) {
                        tTLiveBroadcastView.LIZJ().St2().getMediaController().a5(new AwS604S0100000_25(enumC1778840wOI, 512));
                    }
                    C337180DJs.LIZ(tTLiveBroadcastView.LJII());
                    if (!LiveBroadcastHostUseTTLH.getEnable()) {
                        View previewView = tTLiveBroadcastView.LIZJ().getPreviewView();
                        if ((previewView instanceof SurfaceView) && (surfaceView2 = (SurfaceView) previewView) != null) {
                            C786410Ut5.LLIIII(surfaceView2, 0);
                        }
                        View previewView2 = tTLiveBroadcastView.LIZJ().getPreviewView();
                        if ((previewView2 instanceof SurfaceView) && (surfaceView = (SurfaceView) previewView2) != null && (holder = surfaceView.getHolder()) != null && (surface = holder.getSurface()) != null) {
                            tTLiveBroadcastView.LIZJ().LJLJLLL(surface);
                        }
                    }
                }
                tTLiveBroadcastView.LLJJIII = false;
                InterfaceC782930UnT interfaceC782930UnT = tTLiveBroadcastView.LLJILJIL;
                if (interfaceC782930UnT != null) {
                    interfaceC782930UnT.iq();
                }
                C21673119rt c21673119rt = tTLiveBroadcastView.LLJIJIL;
                if (c21673119rt != null) {
                    c21673119rt.LIZIZ = 2;
                    c21673119rt.LIZ();
                }
                C1322110kVd c1322110kVd = tTLiveBroadcastView.LLJI;
                if (c1322110kVd != null) {
                    C786410Ut5.LLZZLLIL(c1322110kVd, 8);
                }
                C20592315hx.LIZ = false;
                if (LiveBroadcastHostUseTTLH.getEnable()) {
                    tTLiveBroadcastView.LJIIIZ();
                    tTLiveBroadcastView.LJIIIIZZ();
                    SurfaceHolderCallbackC2177741AKu surfaceHolderCallbackC2177741AKu = tTLiveBroadcastView.LLJJLIIIJLLLLLLLZ;
                    if (surfaceHolderCallbackC2177741AKu != null && (surfaceViewLJIJJLI2 = surfaceHolderCallbackC2177741AKu.LJIJJLI()) != null) {
                        C337180DJs.LIZ(surfaceViewLJIJJLI2);
                    }
                    SurfaceHolderCallbackC2177731AKt surfaceHolderCallbackC2177731AKt = tTLiveBroadcastView.LLJJL;
                    if (surfaceHolderCallbackC2177731AKt != null && (surfaceViewLJIJJLI = surfaceHolderCallbackC2177731AKt.LJIJJLI()) != null) {
                        C786410Ut5.LJLLLLLL(0, surfaceViewLJIJJLI);
                    }
                }
            }
            this.LIZIZ = false;
            HandlerHook.viewPostDelay(viewGroup, new ARunnableS100S0200000_31(viewGroup, this, 18), 300L);
        }
    }

    @Override // X.InterfaceC1654970tAV
    public final C2185991Agv LLLLLLLLL(int[] iArr) {
        long jLongValue;
        if (TTLHLiveReuseCameraOptSwitch.INSTANCE.enableTTLHLiveReuseCameraOpt() != 0 && iArr != null && iArr.length == 2) {
            Long lLIZIZ = C0UKZ.LLIFFJFJJ.LIZIZ();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (lLIZIZ != null) {
                jLongValue = lLIZIZ.longValue();
            } else {
                jLongValue = 0;
            }
            if ((jCurrentTimeMillis - jLongValue) - 2592000000L <= 0) {
                C1DJ7 c1dj7 = new C1DJ7() { // from class: X.1ALY
                    @Override // X.C1DJX
                    public final void LIZIZ(TECameraFrame tECameraFrame) {
                    }

                    @Override // X.C1DJ7, X.C1DJQ
                    public final void LIZJ(SurfaceTexture surfaceTexture, boolean z) {
                    }

                    @Override // X.C1DJ7
                    public final void LJJJJZI(boolean z) {
                    }

                    @Override // X.InterfaceC1283630jVZ
                    public final void LJLJJL(TEFrameSizei tEFrameSizei) {
                    }

                    @Override // X.C1DJX
                    public final void LJLLILLLL(SurfaceTexture surfaceTexture) {
                    }
                };
                C1284180jWS c1284180jWS = new C1284180jWS();
                c1284180jWS.LIZJ(true);
                C2186001Agw c2186001Agw = new C2186001Agw(c1284180jWS.LIZ, c1284180jWS.LIZIZ, new TEFrameSizei(Math.max(iArr[0], iArr[1]), Math.min(iArr[0], iArr[1])), c1dj7);
                c2186001Agw.LJ = true;
                c2186001Agw.LJIIIZ = c1284180jWS;
                return c2186001Agw;
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC1654970tAV
    public final boolean LLLLLLLLLL(Context context) {
        LiveMode lastBroadcastLiveMode;
        InterfaceC782930UnT interfaceC782930UnT = this.LIZ.LLJILJIL;
        if (interfaceC782930UnT != null && interfaceC782930UnT.G9() != null) {
            InterfaceC782930UnT interfaceC782930UnT2 = this.LIZ.LLJILJIL;
            if (interfaceC782930UnT2 != null) {
                lastBroadcastLiveMode = interfaceC782930UnT2.G9();
            } else {
                return true;
            }
        } else {
            IBroadcastService iBroadcastService = (IBroadcastService) PluggableExtentionKt.pluggableSpi(IBroadcastService.class);
            if (iBroadcastService != null) {
                lastBroadcastLiveMode = iBroadcastService.getLastBroadcastLiveMode(context);
            } else {
                return true;
            }
        }
        if (lastBroadcastLiveMode != null) {
            return lastBroadcastLiveMode.equals(LiveMode.VIDEO);
        }
        return true;
    }

    @Override // X.InterfaceC1654970tAV
    public final void againHandlerBundle(JSONObject jSONObject) {
        Live.getService().againHandlerBundle(jSONObject);
    }

    @Override // X.InterfaceC1654970tAV
    public final void LLLLJ(UUID uuid, C2185991Agv c2185991Agv) {
        TTLiveBroadcastView tTLiveBroadcastView = this.LIZ;
        if (tTLiveBroadcastView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TTLiveBroadcastView onStartLiveSetCameraSettings-> ");
            sbLIZ.append(tTLiveBroadcastView.LLJILJIL);
            C20441214yg.LIZIZ("TTLHReuseCamera", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC782930UnT interfaceC782930UnT = tTLiveBroadcastView.LLJILJIL;
            if (interfaceC782930UnT != null) {
                interfaceC782930UnT.LLLLJ(uuid, c2185991Agv);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0295  */
    @Override // X.InterfaceC1654970tAV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLIL(android.os.Bundle r10, android.view.ViewGroup r11) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ALR.LLLLLLIL(android.os.Bundle, android.view.ViewGroup):void");
    }

    @Override // X.InterfaceC1654970tAV
    public final void LLLLJI(Context context, IRecordingOperationPanel iRecordingOperationPanel, FrameLayout frameLayout, C19A3 c19a3, C1DRG c1drg) {
        if (this.LIZ == null && Live.getService() != null) {
            this.LIZ = new TTLiveBroadcastView(context, iRecordingOperationPanel, frameLayout, c19a3, c1drg);
        }
    }
}
