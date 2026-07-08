package X;

import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.bytedance.android.live.broadcast.api.CameraFocusViewGone;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.ZoomCameraScaleEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestAnchorMaskTouchEventChannel;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveExposureOptSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UKN, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UKN extends AbstractC1120020fFg implements ScaleGestureDetector.OnScaleGestureListener, C0UVD {
    public final Context LL;
    public final DataChannel LLILLJJLI;
    public final int LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL = -1.0f;
    public C1273890jFr LLIZ = C776270Ucj.LIZ.LJIIJJI(false, this, false);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 6));
    public final ScaleGestureDetector LLJ;
    public boolean LLJI;
    public C0UKP LLJIJIL;
    public boolean LLJILJIL;
    public C0UKO LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public final ARunnableS112S0100000_12 LLJJJIL;

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void LJI() {
        C0IK5.LIZ().removeCallbacks(this.LLJJJIL);
        C776270Ucj.LIZ.getClass();
        ((CopyOnWriteArrayList) C776270Ucj.LJIIIZ).remove(this);
        C0UK0.LIZIZ = false;
        C0UK0.LIZJ = false;
        C769260UFo.LIZ = false;
    }

    @Override // X.AbstractC1120020fFg
    public final int LIZIZ() {
        return this.LLILLL;
    }

    @Override // X.C0UVD
    public final void LIZ(C1273890jFr c1273890jFr) {
        if (C500260Jjc.LJJIJLIJ()) {
            return;
        }
        this.LLIZ = c1273890jFr;
    }

    public final boolean LJFF(MotionEvent motionEvent) {
        C0UKP c0ukp = this.LLJIJIL;
        if (c0ukp == null) {
            return false;
        }
        if (LiveExposureOptSetting.INSTANCE.enable()) {
            this.LLJJIJIL = C497740JfY.LJIILLIIL();
            if (motionEvent.getY() <= this.LLJJIJI || motionEvent.getY() >= this.LLJJIJIIJIL) {
                return false;
            }
            return true;
        }
        if (C500260Jjc.LJJIJLIJ()) {
            this.LLJJIJIL = (int) c0ukp.LIZIZ;
            if (motionEvent.getY() <= this.LLJILLL + ((int) C497740JfY.LIZIZ(8.0f)) || this.LLJJIJIL - motionEvent.getY() <= this.LLJJ + ((int) C497740JfY.LIZIZ(8.0f))) {
                return false;
            }
        } else {
            this.LLJJIJIL = C497740JfY.LJIILLIIL();
            if (motionEvent.getY() <= this.LLJJI || this.LLJJIJIL - motionEvent.getY() <= this.LLJJIII) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C0UKP c0ukp;
        if (motionEvent == null || !C500260Jjc.LJJIJLIJ() || (c0ukp = this.LLJIJIL) == null) {
            return false;
        }
        int i = (int) c0ukp.LIZ;
        int i2 = (int) c0ukp.LIZIZ;
        int i3 = i2 / 10;
        float f = i / 10;
        if (motionEvent.getX() < f || i - motionEvent.getX() < f) {
            return false;
        }
        float f2 = i3;
        if (motionEvent.getY() < f2 || i2 - motionEvent.getY() < f2) {
            return false;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_camera_switch");
        c474500IjALIZ.LJJII("double_click", "event_type");
        C770730ULf.LIZLLL(c474500IjALIZ);
        c474500IjALIZ.LIZ();
        C20337914i1<Integer> c20337914i1 = InterfaceC772190UQv.c3;
        Integer numLIZ = c20337914i1.LIZ();
        C0UJY c0ujyLIZ = C770730ULf.LIZ(this.LLILLJJLI);
        if (c0ujyLIZ == null) {
            return false;
        }
        c0ujyLIZ.LJJIIZ(1 - numLIZ.intValue(), CertProviderManagerKt.findCert("bpea-operate_camera", 1476788229));
        c20337914i1.LJ(Integer.valueOf(1 - numLIZ.intValue()));
        return true;
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return C500260Jjc.LJJIJLIJ();
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.LLIZ == null) {
            C0UJY c0ujyLIZ = C770730ULf.LIZ(this.LLILLJJLI);
            if (c0ujyLIZ == null) {
                return false;
            }
            return c0ujyLIZ.scaleCamera(scaleGestureDetector).booleanValue();
        }
        if (this.LLILZLL == -1.0f) {
            this.LLILZLL = r2.K3();
        }
        if (this.LLILZLL <= 0.0f || scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan() == 0.0f) {
            return false;
        }
        C1273890jFr c1273890jFr = this.LLIZ;
        if (c1273890jFr != null) {
            c1273890jFr.N3(scaleGestureDetector.getScaleFactor());
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.LLIZ != null) {
            this.LLILLJJLI.SX0(C755540TkO.class, Boolean.TRUE);
            this.LLILZIL = this.LLILZ;
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScaleEnd(android.view.ScaleGestureDetector r5) {
        /*
            r4 = this;
            X.0jFr r0 = r4.LLIZ
            if (r0 == 0) goto L4b
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r4.LLILLJJLI
            java.lang.Class<X.0TkO> r1 = X.C755540TkO.class
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.SX0(r1, r0)
            boolean r0 = X.C500260Jjc.LJJIJLIJ()
            if (r0 != 0) goto L4b
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.LLILLJJLI
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.InteractModeChannel> r0 = com.bytedance.android.livesdk.dataChannel.InteractModeChannel.class
            java.lang.Object r2 = r1.gg0(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L60
            int r1 = r2.intValue()
            r0 = 1
            if (r1 != r0) goto L56
            java.lang.String r3 = "guest_connect"
        L28:
            float r2 = r4.LLILZ
            float r1 = r4.LLILZIL
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4c
            java.lang.String r2 = "zoom_in"
        L32:
            double r0 = com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting.getNO_SAMPLE()
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "livesdk_zoom_in"
            X.0IjA r1 = X.C0IJT.LIZIZ(r0, r1)
            r1.LJIILJJIL(r3)
            java.lang.String r0 = "hand_gesture"
            r1.LJJII(r2, r0)
            r1.LIZ()
        L4b:
            return
        L4c:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L53
            java.lang.String r2 = "zoom_out"
            goto L32
        L53:
            java.lang.String r2 = "no_change"
            goto L32
        L56:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L60
            java.lang.String r3 = "host_connect"
            goto L28
        L60:
            java.lang.String r3 = "live_take_detail"
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UKN.onScaleEnd(android.view.ScaleGestureDetector):void");
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        boolean zLIZIZ;
        String str;
        String broadcastScene;
        Pair<Integer, Integer> pairLIZ;
        if (motionEvent == null) {
            return false;
        }
        C20441214yg.LIZIZ("CameraGestureDetector", "onSingleTapConfirmed");
        C0UKP c0ukp = this.LLJIJIL;
        if (c0ukp != null) {
            C0UKO c0uko = this.LLJILJILJ;
            if (c0uko != null && (pairLIZ = c0uko.LIZ()) != null) {
                if (LiveExposureOptSetting.INSTANCE.enable()) {
                    this.LLJJIJI = pairLIZ.getFirst().intValue();
                    this.LLJJIJIIJIL = pairLIZ.getSecond().intValue();
                } else if (C500260Jjc.LJJIJLIJ()) {
                    this.LLJILLL = pairLIZ.getFirst().intValue();
                    this.LLJJ = pairLIZ.getSecond().intValue();
                } else {
                    this.LLJJI = pairLIZ.getFirst().intValue();
                    this.LLJJIII = pairLIZ.getSecond().intValue();
                }
            }
            C0UKQ c0ukq = (C0UKQ) this.LLILLJJLI.gg0(MultiGuestAnchorMaskTouchEventChannel.class);
            if (c0ukq != null) {
                zLIZIZ = c0ukq.LIZIZ(motionEvent);
            } else {
                zLIZIZ = false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSingleTapConfirmed, multiIntercept: ");
            sbLIZ.append(!zLIZIZ);
            sbLIZ.append(", enableExposureCompensation: ");
            sbLIZ.append(LJFF(motionEvent));
            C20441214yg.LIZIZ("CameraGestureDetector", C2188811AlT.LIZIZ(sbLIZ));
            if (!zLIZIZ && LJFF(motionEvent)) {
                C20441214yg.LJ("CameraGestureDetector", "exposureCompensationOpenFlag = true");
                this.LLJILJIL = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(motionEvent.getX()));
                arrayList.add(Float.valueOf(motionEvent.getY()));
                this.LLILLJJLI.SX0(C750420Tc8.class, arrayList);
                C0UKO c0uko2 = this.LLJILJILJ;
                if (c0uko2 != null) {
                    c0uko2.LIZJ(true);
                }
                C786410Ut5.LJLIIL(2000L, C0IK5.LIZ(), this.LLJJJIL);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_focus_exposure_click");
                c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
                c474500IjALIZ.LJJII(0, "is_dual_camera");
                Integer numLIZ = InterfaceC772190UQv.c3.LIZ();
                if (numLIZ != null && numLIZ.intValue() == 1) {
                    str = "front";
                } else {
                    str = "back";
                }
                c474500IjALIZ.LJJII(str, "camera_type");
                if (C500260Jjc.LJJIJLIJ()) {
                    broadcastScene = "live_take_page";
                } else {
                    broadcastScene = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene();
                }
                c474500IjALIZ.LJJII(broadcastScene, "select_scene");
                String str2 = C0UKJ.LJIIIIZZ;
                if (str2 == null) {
                    str2 = "normal_click";
                }
                c474500IjALIZ.LJJII(str2, "from");
                c474500IjALIZ.LIZ();
                if (C500260Jjc.LJJIJLIJ()) {
                    C0UJY c0ujyLIZ = C770730ULf.LIZ(this.LLILLJJLI);
                    if (c0ujyLIZ != null) {
                        c0ujyLIZ.LJJIJIIJIL((int) c0ukp.LIZ, (int) c0ukp.LIZIZ, motionEvent);
                    }
                } else {
                    C1273890jFr c1273890jFr = this.LLIZ;
                    if (c1273890jFr != null) {
                        c1273890jFr.j3((int) c0ukp.LIZ, (int) c0ukp.LIZIZ, (int) motionEvent.getX(), (int) motionEvent.getY());
                        return true;
                    }
                }
                return true;
            }
            C0UK0.LIZIZ = false;
        }
        return false;
    }

    @Override // X.AbstractC1120020fFg
    public final boolean LJ(MotionEvent motionEvent, C0UKP c0ukp, View view) {
        if (this.LLILLJJLI.gg0(LiveCenterStatusChannel.class) != C0UVH.DISMISS || this.LLILLJJLI.gg0(LiveExtendedScreenStatus.class) != EnumC1083260eIO.HIDE) {
            return false;
        }
        this.LLJIJIL = c0ukp;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            C20441214yg.LIZIZ("CameraGestureDetector", "ACTION_DOWN");
            this.LLJI = false;
            if (LJFF(motionEvent)) {
                LiveExposureOptSetting liveExposureOptSetting = LiveExposureOptSetting.INSTANCE;
                if (liveExposureOptSetting.isV1()) {
                    C0UK0.LIZIZ = C0UK0.LIZJ;
                } else if (liveExposureOptSetting.isV2()) {
                    C0UK0.LIZIZ = false;
                }
            } else {
                C0UK0.LIZIZ = false;
            }
            C769260UFo.LIZ = false;
        }
        if (action == 1) {
            C20441214yg.LIZIZ("CameraGestureDetector", "ACTION_UP");
            C786410Ut5.LJLIIL(2000L, C0IK5.LIZ(), this.LLJJJIL);
            this.LLJJJ = false;
            C769260UFo.LIZ = false;
            C0UK0.LIZIZ = false;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.LLJI = true;
        }
        if (this.LLJI) {
            return this.LLJ.onTouchEvent(motionEvent);
        }
        C19290410dS c19290410dS = (C19290410dS) this.LLIZLLLIL.getValue();
        if (c19290410dS == null) {
            return true;
        }
        return c19290410dS.LIZ(motionEvent);
    }

    public C0UKN(Context context, DataChannel dataChannel, int i, BaseFragment baseFragment) {
        this.LL = context;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = i;
        this.LLJ = new ScaleGestureDetector(context, this);
        dataChannel.EQ2(baseFragment.getViewLifecycleOwner(), ZoomCameraScaleEvent.class, new AwS591S0100000_12(this, 4));
        dataChannel.BQ2(baseFragment.getViewLifecycleOwner(), CameraFocusViewGone.class, new AwS591S0100000_12(this, 5));
        this.LLJJJIL = new ARunnableS112S0100000_12(this, 2);
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        C20441214yg.LIZIZ("CameraGestureDetector", "onScroll");
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        LiveExposureOptSetting liveExposureOptSetting = LiveExposureOptSetting.INSTANCE;
        if (liveExposureOptSetting.enable()) {
            if (this.LLJIJIL == null || C769260UFo.LIZ) {
                return false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onScroll, enableExposureCompensation(e1): ");
            sbLIZ.append(LJFF(motionEvent));
            sbLIZ.append(", 2: ");
            if (Math.abs(f2) > Math.abs(f)) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            sbLIZ.append(", ExposureBar.adjusting: ");
            sbLIZ.append(C0UK0.LIZIZ);
            C20441214yg.LIZIZ("CameraGestureDetector", C2188811AlT.LIZIZ(sbLIZ));
            if (C0UK0.LIZ) {
                if (!C0UK0.LIZJ ? !(!LJFF(motionEvent) || Math.abs(motionEvent.getRawY() - motionEvent2.getRawY()) <= Math.abs(motionEvent.getRawX() - motionEvent2.getRawX())) : !(!C0UK0.LIZIZ && (!liveExposureOptSetting.isV1() ? !LJFF(motionEvent) || Math.abs(motionEvent.getRawY() - motionEvent2.getRawY()) <= Math.abs(motionEvent.getRawX() - motionEvent2.getRawX()) : !LJFF(motionEvent)))) {
                    C0UK0.LIZIZ = true;
                    C0UKO c0uko = this.LLJILJILJ;
                    if (c0uko != null) {
                        c0uko.LIZIZ();
                    }
                    C0IK5.LIZ().removeCallbacks(this.LLJJJIL);
                    int iLIZIZ = C814420VxA.LIZIZ((f2 * LSPassThroughRecordSizeConfig.DEFAULT) / this.LLJJIJIL);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("exposureCompensationValue: ");
                    sbLIZ2.append(iLIZIZ);
                    C20441214yg.LIZIZ("VerticalExposureBar", C2188811AlT.LIZIZ(sbLIZ2));
                    C0UKO c0uko2 = this.LLJILJILJ;
                    if (c0uko2 != null) {
                        c0uko2.LIZLLL(iLIZIZ);
                    }
                    return true;
                }
                C0UK0.LIZIZ = false;
                C786410Ut5.LJLIIL(2000L, C0IK5.LIZ(), this.LLJJJIL);
                return false;
            }
        } else {
            if (!this.LLJILJIL) {
                return false;
            }
            C786410Ut5.LJLIIL(2000L, C0IK5.LIZ(), this.LLJJJIL);
            if (this.LLJIJIL != null && ((LJFF(motionEvent) && Math.abs(motionEvent.getRawY() - motionEvent2.getRawY()) > Math.abs(motionEvent.getRawX() - motionEvent2.getRawX())) || this.LLJJJ)) {
                this.LLJJJ = true;
                C0UKO c0uko3 = this.LLJILJILJ;
                if (c0uko3 != null) {
                    c0uko3.LIZIZ();
                }
                C0IK5.LIZ().removeCallbacks(this.LLJJJIL);
                int rawY = (int) (((double) (motionEvent.getRawY() - motionEvent2.getRawY())) * 0.01d);
                C0UKO c0uko4 = this.LLJILJILJ;
                if (c0uko4 != null) {
                    c0uko4.LIZLLL(rawY);
                }
                return true;
            }
        }
        return false;
    }
}
