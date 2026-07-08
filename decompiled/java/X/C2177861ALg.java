package X;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import bck.u;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautyCameraParams;
import com.bytedance.android.livesdk.livesetting.effect.LiveBeautyFilterRestoreOpt;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectDetailGLSwitch;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEBundle;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VETouchPointer;
import com.ss.android.vesdk.k;
import com.ss.android.vesdk.runtime.VERuntime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1ALg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2177861ALg implements C0UJY {
    public C2177871ALh LL;
    public final /* synthetic */ TTLiveBroadcastView LLILLJJLI;

    @Override // X.C0UJY
    public final void LIZ() {
    }

    @Override // X.C0UJY
    public final float LJIJ() {
        return 0.5625f;
    }

    @Override // X.C0UJY
    public final boolean LJIJJLI() {
        return false;
    }

    @Override // X.C0UJY
    public final void LJJIFFI() {
    }

    @Override // X.C0UJY
    public final void LJJIIJZLJL() {
    }

    @Override // X.C0UJY
    public final InterfaceC1268640j7O LJJIJ() {
        return null;
    }

    @Override // X.C0UJY
    public final void LIZIZ() {
        this.LLILLJJLI.LLJJIJIIJIL = true;
    }

    @Override // X.C0UJY
    public final String LIZLLL() {
        String string;
        if (LiveEffectDetailGLSwitch.INSTANCE.enable()) {
            InterfaceC2177841ALe interfaceC2177841ALe = this.LLILLJJLI.LLJJI;
            if (interfaceC2177841ALe != null) {
                VERecorder vERecorder = ((u) interfaceC2177841ALe).LIZLLL;
                Float fValueOf = Float.valueOf(vERecorder != null ? vERecorder.LIZIZ.LLIIIILZ : 2.0f);
                if (fValueOf != null && (string = fValueOf.toString()) != null) {
                    return string;
                }
            }
            if (!VERuntime.getInstance().isGLES3Enabled()) {
                return "2.0";
            }
        } else if (!VERuntime.getInstance().isGLES3Enabled()) {
            return "2.0";
        }
        return "3.0";
    }

    @Override // X.C0UJY
    public final void LJFF() {
        InterfaceC1645720sva interfaceC1645720sva;
        InterfaceC2177841ALe interfaceC2177841ALe = this.LLILLJJLI.LLJJI;
        if (interfaceC2177841ALe == null || (interfaceC1645720sva = ((u) interfaceC2177841ALe).LIZ) == null) {
            return;
        }
        interfaceC1645720sva.LJLJJI();
    }

    @Override // X.C0UJY
    public final String[] LJIIJ() {
        return this.LLILLJJLI.LLLI;
    }

    @Override // X.C0UJY
    public final void LJJII() {
        InterfaceC2177841ALe interfaceC2177841ALe = this.LLILLJJLI.LLJJI;
        if (interfaceC2177841ALe != null) {
            ((u) interfaceC2177841ALe).LIZJ(false);
        }
    }

    @Override // X.C0UJY
    public final void LJJLIIIJJI() {
        InterfaceC1645720sva interfaceC1645720sva;
        InterfaceC2177841ALe interfaceC2177841ALe = this.LLILLJJLI.LLJJI;
        if (interfaceC2177841ALe != null && (interfaceC1645720sva = ((u) interfaceC2177841ALe).LIZ) != null) {
            interfaceC1645720sva.LJJLIIIJJI();
        }
        this.LLILLJJLI.LLLI = null;
    }

    @Override // X.C0UJY
    public final long getAvgExpTime() {
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLIZLLLIL;
        if (iRecordingOperationPanel != null) {
            return iRecordingOperationPanel.getAvgExpTime();
        }
        return 0L;
    }

    @Override // X.C0UJY
    public final int getCameraInfo() {
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLIZLLLIL;
        if (iRecordingOperationPanel != null) {
            return iRecordingOperationPanel.getCameraInfo();
        }
        return 0;
    }

    @Override // X.C0UJY
    public final JSONObject getCameraParams() {
        try {
            InterfaceC2177841ALe interfaceC2177841ALe = this.LLILLJJLI.LLJJI;
            if (interfaceC2177841ALe == null) {
                return null;
            }
            C2177871ALh c2177871ALhLIZLLL = ((u) interfaceC2177841ALe).LIZLLL();
            TTLiveBroadcastView tTLiveBroadcastView = this.LLILLJJLI;
            this.LL = c2177871ALhLIZLLL;
            JSONObject jSONObject = new JSONObject();
            float f = c2177871ALhLIZLLL.LIZ;
            tTLiveBroadcastView.getClass();
            TTLiveBroadcastView.LJI(jSONObject, "gamma", TTLiveBroadcastView.LJIILIIL(f), -3.0f, 3.0f);
            TTLiveBroadcastView.LJI(jSONObject, "brightness", TTLiveBroadcastView.LJIILIIL(c2177871ALhLIZLLL.LIZIZ), -100.0f, 100.0f);
            TTLiveBroadcastView.LJI(jSONObject, "contrast", TTLiveBroadcastView.LJIILIIL(c2177871ALhLIZLLL.LIZJ), -100.0f, 100.0f);
            TTLiveBroadcastView.LJI(jSONObject, "saturation", TTLiveBroadcastView.LJIILIIL(c2177871ALhLIZLLL.LIZLLL), -100.0f, 100.0f);
            TTLiveBroadcastView.LJI(jSONObject, "hueShift", TTLiveBroadcastView.LJIILIIL(c2177871ALhLIZLLL.LJ), -180.0f, 180.0f);
            TTLiveBroadcastView.LJI(jSONObject, "opacity", TTLiveBroadcastView.LJIILIIL(c2177871ALhLIZLLL.LJFF), 0.0f, 100.0f);
            int i = c2177871ALhLIZLLL.LJI;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("value", i);
            jSONObject2.put("min", 0);
            jSONObject2.put("max", 16777215);
            jSONObject.put("addColor", jSONObject2);
            int i2 = c2177871ALhLIZLLL.LJII;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("value", i2);
            jSONObject3.put("min", 0);
            jSONObject3.put("max", 16777215);
            jSONObject.put("mulColor", jSONObject3);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.C0UJY
    public final void hideBottomTab() {
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLIZLLLIL;
        if (iRecordingOperationPanel != null) {
            iRecordingOperationPanel.hideBottomTab();
        }
    }

    @Override // X.C0UJY
    public final void l() {
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLIZLLLIL;
        if (iRecordingOperationPanel != null) {
            iRecordingOperationPanel.closeRecording();
        }
    }

    @Override // X.C0UJY
    public final void showBottomTab() {
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLIZLLLIL;
        if (iRecordingOperationPanel != null) {
            iRecordingOperationPanel.showBottomTab();
        }
    }

    public C2177861ALg(TTLiveBroadcastView tTLiveBroadcastView) {
        this.LLILLJJLI = tTLiveBroadcastView;
    }

    @Override // X.C0UJY
    public final void LJ(String str) {
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLIZLLLIL;
        if (iRecordingOperationPanel != null) {
            iRecordingOperationPanel.onHidePanel(str);
        }
    }

    @Override // X.C0UJY
    public final void LJII(String[] strArr) {
        InterfaceC2177841ALe interfaceC2177841ALe;
        if (strArr != null && strArr.length != 0 && (interfaceC2177841ALe = this.LLILLJJLI.LLJJI) != null) {
            List listLJJLL = C13LQ.LJJLL(strArr);
            InterfaceC1645720sva interfaceC1645720sva = ((u) interfaceC2177841ALe).LIZ;
            if (interfaceC1645720sva != null) {
                interfaceC1645720sva.LJJLIIIJILLIZJL(u.LIZIZ(listLJJLL, Collections.emptyList(), Collections.emptyList()));
            }
        }
    }

    @Override // X.C0UJY
    public final void LJIIIZ(C0UHE c0uhe) {
        this.LLILLJJLI.LLJJJJ.add(c0uhe);
    }

    @Override // X.C0UJY
    public final void LJIIJJI(String str) {
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLIZLLLIL;
        if (iRecordingOperationPanel != null) {
            iRecordingOperationPanel.onShowPanel(str);
        }
    }

    @Override // X.C0UJY
    public final void LJIIL(C0UHE c0uhe) {
        this.LLILLJJLI.LLJJJJ.remove(c0uhe);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.1ALj] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.1ALi] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C0UJY
    public final void LJIILJJIL(final InterfaceC770080UIs interfaceC770080UIs) {
        View previewView;
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLILLJJLI;
        if (iRecordingOperationPanel != null && (previewView = iRecordingOperationPanel.getPreviewView()) != null) {
            try {
                InterfaceC2177841ALe interfaceC2177841ALe = this.LLILLJJLI.LLJJI;
                if (interfaceC2177841ALe != null) {
                    int measuredWidth = (int) (previewView.getMeasuredWidth() * previewView.getScaleX());
                    int measuredHeight = (int) (previewView.getMeasuredHeight() * previewView.getScaleY());
                    final ?? r2 = new InterfaceC2177901ALk() { // from class: X.1ALi
                        @Override // X.InterfaceC2177901ALk
                        public final void LIZ(Bitmap bitmap) {
                            interfaceC770080UIs.LIZ(bitmap);
                        }
                    };
                    InterfaceC1645720sva interfaceC1645720sva = ((u) interfaceC2177841ALe).LIZ;
                    if (interfaceC1645720sva != 0) {
                        interfaceC1645720sva.bo(measuredWidth, measuredHeight, new InterfaceC2173471A4j() { // from class: X.1ALj
                            @Override // X.InterfaceC2173471A4j
                            public final void LIZ(int i, Bitmap bitmap) {
                                InterfaceC2177901ALk interfaceC2177901ALk = r2;
                                if (interfaceC2177901ALk != null) {
                                    interfaceC2177901ALk.LIZ(bitmap);
                                }
                            }
                        });
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                interfaceC770080UIs.LIZ(null);
                C20441214yg.LJII(e);
            }
        }
    }

    @Override // X.C0UJY
    public final void LJIILL(JSONObject jSONObject) {
        float value;
        float value2;
        float value3;
        float value4;
        float value5;
        int value6;
        C20441214yg.LIZIZ("AIBeauty#setVE", String.valueOf(jSONObject));
        if (jSONObject == null) {
            C2177871ALh c2177871ALh = this.LL;
            if (c2177871ALh == null) {
                c2177871ALh = new C2177871ALh();
            }
            LiveAIBeautyCameraParams liveAIBeautyCameraParams = LiveAIBeautyCameraParams.INSTANCE;
            LiveAIBeautyCameraParams.CameraParams gamma = liveAIBeautyCameraParams.getValue().getGamma();
            float value7 = 0.0f;
            if (gamma != null) {
                value = gamma.getValue();
            } else {
                value = 0.0f;
            }
            c2177871ALh.LIZ = value;
            LiveAIBeautyCameraParams.CameraParams brightness = liveAIBeautyCameraParams.getValue().getBrightness();
            if (brightness != null) {
                value2 = brightness.getValue();
            } else {
                value2 = 0.0f;
            }
            c2177871ALh.LIZIZ = value2;
            LiveAIBeautyCameraParams.CameraParams contrast = liveAIBeautyCameraParams.getValue().getContrast();
            if (contrast != null) {
                value3 = contrast.getValue();
            } else {
                value3 = 0.0f;
            }
            c2177871ALh.LIZJ = value3;
            LiveAIBeautyCameraParams.CameraParams saturation = liveAIBeautyCameraParams.getValue().getSaturation();
            if (saturation != null) {
                value4 = saturation.getValue();
            } else {
                value4 = 0.0f;
            }
            c2177871ALh.LIZLLL = value4;
            LiveAIBeautyCameraParams.CameraParams hueShift = liveAIBeautyCameraParams.getValue().getHueShift();
            if (hueShift != null) {
                value5 = hueShift.getValue();
            } else {
                value5 = 0.0f;
            }
            c2177871ALh.LJ = value5;
            LiveAIBeautyCameraParams.CameraParams opacity = liveAIBeautyCameraParams.getValue().getOpacity();
            if (opacity != null) {
                value7 = opacity.getValue();
            }
            c2177871ALh.LJFF = value7;
            LiveAIBeautyCameraParams.CameraParams addColor = liveAIBeautyCameraParams.getValue().getAddColor();
            int value8 = 0;
            if (addColor != null) {
                value6 = (int) addColor.getValue();
            } else {
                value6 = 0;
            }
            c2177871ALh.LJI = value6;
            LiveAIBeautyCameraParams.CameraParams mulColor = liveAIBeautyCameraParams.getValue().getMulColor();
            if (mulColor != null) {
                value8 = (int) mulColor.getValue();
            }
            c2177871ALh.LJII = value8;
            InterfaceC2177841ALe interfaceC2177841ALe = this.LLILLJJLI.LLJJI;
            if (interfaceC2177841ALe != null) {
                ((u) interfaceC2177841ALe).LIZJ(true);
            }
            InterfaceC2177841ALe interfaceC2177841ALe2 = this.LLILLJJLI.LLJJI;
            if (interfaceC2177841ALe2 != null) {
                ((u) interfaceC2177841ALe2).LJI(c2177871ALh);
                return;
            }
            return;
        }
        TTLiveBroadcastView tTLiveBroadcastView = this.LLILLJJLI;
        C2177871ALh c2177871ALh2 = this.LL;
        if (c2177871ALh2 == null) {
            c2177871ALh2 = new C2177871ALh();
        }
        tTLiveBroadcastView.getClass();
        Float fLIZ = TTLiveBroadcastView.LIZ("gamma", jSONObject);
        if (fLIZ != null) {
            c2177871ALh2.LIZ = fLIZ.floatValue();
        }
        Float fLIZ2 = TTLiveBroadcastView.LIZ("brightness", jSONObject);
        if (fLIZ2 != null) {
            c2177871ALh2.LIZIZ = fLIZ2.floatValue();
        }
        Float fLIZ3 = TTLiveBroadcastView.LIZ("contrast", jSONObject);
        if (fLIZ3 != null) {
            c2177871ALh2.LIZJ = fLIZ3.floatValue();
        }
        Float fLIZ4 = TTLiveBroadcastView.LIZ("saturation", jSONObject);
        if (fLIZ4 != null) {
            c2177871ALh2.LIZLLL = fLIZ4.floatValue();
        }
        Float fLIZ5 = TTLiveBroadcastView.LIZ("hueShift", jSONObject);
        if (fLIZ5 != null) {
            c2177871ALh2.LJ = fLIZ5.floatValue();
        }
        Float fLIZ6 = TTLiveBroadcastView.LIZ("opacity", jSONObject);
        if (fLIZ6 != null) {
            c2177871ALh2.LJFF = fLIZ6.floatValue();
        }
        Integer numLIZIZ = TTLiveBroadcastView.LIZIZ("addColor", jSONObject);
        if (numLIZIZ != null) {
            c2177871ALh2.LJI = numLIZIZ.intValue();
        }
        Integer numLIZIZ2 = TTLiveBroadcastView.LIZIZ("mulColor", jSONObject);
        if (numLIZIZ2 != null) {
            c2177871ALh2.LJII = numLIZIZ2.intValue();
        }
        InterfaceC2177841ALe interfaceC2177841ALe3 = tTLiveBroadcastView.LLJJI;
        if (interfaceC2177841ALe3 != null) {
            ((u) interfaceC2177841ALe3).LIZJ(true);
        }
        InterfaceC2177841ALe interfaceC2177841ALe4 = tTLiveBroadcastView.LLJJI;
        if (interfaceC2177841ALe4 == null) {
            return;
        }
        ((u) interfaceC2177841ALe4).LJI(c2177871ALh2);
    }

    @Override // X.C0UJY
    public final void LJIJI(String[] strArr) {
        LJJIJLIJ(strArr, null);
    }

    @Override // X.C0UJY
    public final void LJIL(InterfaceC770090UIt interfaceC770090UIt) {
        this.LLILLJJLI.LLJJJ = interfaceC770090UIt;
    }

    @Override // X.C0UJY
    public final void LJJI(InterfaceC770070UIr interfaceC770070UIr) {
        this.LLILLJJLI.LLJJJIL = interfaceC770070UIr;
    }

    @Override // X.C0UJY
    public final void LJJIIJ(C0UJ0 c0uj0) {
        LJIILJJIL(c0uj0);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    @Override // X.C0UJY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(java.lang.Boolean r4) {
        /*
            r3 = this;
            boolean r2 = r4.booleanValue()
            com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView r0 = r3.LLILLJJLI
            com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel r0 = r0.LLILLJJLI
            if (r0 == 0) goto L32
            int r1 = r0.getSurfaceSizeLayoutId()
            com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView r0 = r3.LLILLJJLI
            X.0UnT r0 = r0.LLJILJIL
            if (r0 == 0) goto L32
            androidx.fragment.app.Fragment r0 = r0.getFragment()
            if (r0 == 0) goto L32
            X.19EG r0 = r0.getActivity()
            if (r0 == 0) goto L32
            android.view.View r0 = r0.findViewById(r1)
        L24:
            if (r2 == 0) goto L2c
            if (r0 == 0) goto L2b
            X.C500260Jjc.LLFFF(r0)
        L2b:
            return
        L2c:
            if (r0 == 0) goto L2b
            X.C500260Jjc.LJIILLIIL(r0)
            return
        L32:
            r0 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2177861ALg.LJJIIZI(java.lang.Boolean):void");
    }

    @Override // X.C0UJY
    public final String LJJIJIIJI(int i) {
        InterfaceC2177841ALe interfaceC2177841ALeVideoRecorder;
        InterfaceC1645720sva interfaceC1645720sva;
        String strOk;
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLILLJJLI;
        if (iRecordingOperationPanel == null || (interfaceC2177841ALeVideoRecorder = iRecordingOperationPanel.videoRecorder()) == null || (interfaceC1645720sva = ((u) interfaceC2177841ALeVideoRecorder).LIZ) == null || (strOk = interfaceC1645720sva.ok()) == null) {
            return "";
        }
        return strOk;
    }

    @Override // X.C0UJY
    public final void LJJIJIL(boolean z) {
        InterfaceC2177841ALe interfaceC2177841ALe = this.LLILLJJLI.LLJJI;
        if (interfaceC2177841ALe != null) {
            ((u) interfaceC2177841ALe).LIZJ(z);
        }
    }

    @Override // X.C0UJY
    public final void LJJIJL(boolean z) {
        C20311414dk.LIZ = z;
    }

    @Override // X.C0UJY
    public final void closeCamera(Cert cert) {
        TTLiveBroadcastView tTLiveBroadcastView = this.LLILLJJLI;
        tTLiveBroadcastView.LLJJIJIL = true;
        IRecordingOperationPanel iRecordingOperationPanel = tTLiveBroadcastView.LLIZLLLIL;
        if (iRecordingOperationPanel != null) {
            iRecordingOperationPanel.closeCamera(cert);
        }
    }

    @Override // X.C0UJY
    public final Boolean scaleCamera(ScaleGestureDetector scaleGestureDetector) {
        boolean zBooleanValue;
        Boolean boolScaleCamera;
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLIZLLLIL;
        if (iRecordingOperationPanel != null && (boolScaleCamera = iRecordingOperationPanel.scaleCamera(scaleGestureDetector)) != null) {
            zBooleanValue = boolScaleCamera.booleanValue();
        } else {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // X.C0UJY
    public final void setExposureCompensation(int i) {
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLIZLLLIL;
        if (iRecordingOperationPanel != null) {
            iRecordingOperationPanel.setExposureCompensation(i);
        }
    }

    @Override // X.C0UJY
    public final void LJIILIIL(String[] strArr, String[] strArr2) {
        InterfaceC2177841ALe interfaceC2177841ALe = this.LLILLJJLI.LLJJI;
        if (interfaceC2177841ALe != null) {
            u uVar = (u) interfaceC2177841ALe;
            InterfaceC1645720sva interfaceC1645720sva = uVar.LIZIZ.LIZ;
            if (interfaceC1645720sva != null) {
                interfaceC1645720sva.M4();
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (strArr2 != null && i < strArr2.length) {
                    arrayList.add(strArr[i]);
                    arrayList2.add(strArr2[i]);
                } else {
                    arrayList.add(strArr[i]);
                    arrayList2.add("");
                }
            }
            List<ComposerInfo> listLIZIZ = u.LIZIZ(arrayList, arrayList2, Collections.emptyList());
            InterfaceC1645720sva interfaceC1645720sva2 = uVar.LIZ;
            if (interfaceC1645720sva2 != null) {
                interfaceC1645720sva2.n0(listLIZIZ, 10000);
            }
        }
    }

    @Override // X.C0UJY
    public final void LJIILLIIL(LiveEffect liveEffect, String str) {
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLIZLLLIL;
        if (iRecordingOperationPanel != null) {
            iRecordingOperationPanel.onStickerCancel(C202009142l.LIZ(liveEffect), str);
        }
    }

    @Override // X.C0UJY
    public final void LJIJJ(String[] strArr, String[] strArr2) {
        LJJIJLIJ(strArr, strArr2);
    }

    @Override // X.C0UJY
    public final void LJJ(LiveEffect liveEffect, String str) {
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLIZLLLIL;
        if (iRecordingOperationPanel != null) {
            iRecordingOperationPanel.onStickerChosen(C202009142l.LIZ(liveEffect), str);
        }
    }

    @Override // X.C0UJY
    public final void LJJIIZ(int i, Cert cert) {
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLIZLLLIL;
        if (iRecordingOperationPanel != null && iRecordingOperationPanel.getCameraPos() != i) {
            iRecordingOperationPanel.setCameraPos(i, cert);
        }
        C0UD5 c0ud5LJFF = C0UF5.LJFF();
        if (c0ud5LJFF != null) {
            c0ud5LJFF.LIZ = true;
        }
    }

    @Override // X.C0UJY
    public final void LJJIJLIJ(String[] strArr, String[] strArr2) {
        InterfaceC2177841ALe interfaceC2177841ALe = this.LLILLJJLI.LLJJI;
        if (interfaceC2177841ALe != null) {
            u uVar = (u) interfaceC2177841ALe;
            InterfaceC1645720sva interfaceC1645720sva = uVar.LIZIZ.LIZ;
            if (interfaceC1645720sva != null) {
                interfaceC1645720sva.M4();
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (strArr2 != null && i < strArr2.length) {
                    arrayList.add(strArr[i]);
                    arrayList2.add(strArr2[i]);
                } else {
                    arrayList.add(strArr[i]);
                    arrayList2.add("");
                }
            }
            List<ComposerInfo> listLIZIZ = u.LIZIZ(arrayList, arrayList2, Collections.emptyList());
            InterfaceC1645720sva interfaceC1645720sva2 = uVar.LIZ;
            if (interfaceC1645720sva2 != null) {
                interfaceC1645720sva2.R1(listLIZIZ, 10000);
            }
        }
    }

    @Override // X.C0UJY
    public final int LJJZ(String str, String str2) {
        InterfaceC2177841ALe interfaceC2177841ALe = this.LLILLJJLI.LLJJI;
        if (interfaceC2177841ALe != null) {
            InterfaceC1645720sva interfaceC1645720sva = ((u) interfaceC2177841ALe).LIZ;
            if (interfaceC1645720sva != null) {
                return interfaceC1645720sva.LJJZ(str, str2);
            }
            return -1;
        }
        return 0;
    }

    @Override // X.C0UJY
    public final void openCamera(Cert cert, boolean z) {
        boolean z2;
        C0UD5 c0ud5LJFF;
        IRecordingOperationPanel iRecordingOperationPanel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openCamera ignoreSurfaceView: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("TTLiveBroadcastView", C2188811AlT.LIZIZ(sbLIZ));
        if (LiveBeautyFilterRestoreOpt.INSTANCE.enable() && (iRecordingOperationPanel = this.LLILLJJLI.LLILLJJLI) != null && Intrinsics.LJFF(iRecordingOperationPanel.isCameraOpen(), Boolean.TRUE)) {
            C20441214yg.LIZIZ("TTLiveBroadcastView", "openCamera: camera is already open");
            return;
        }
        TTLiveBroadcastView tTLiveBroadcastView = this.LLILLJJLI;
        IRecordingOperationPanel iRecordingOperationPanel2 = tTLiveBroadcastView.LLIZLLLIL;
        if (iRecordingOperationPanel2 != null) {
            if (z && tTLiveBroadcastView.LLJJIJI) {
                z2 = true;
            } else {
                z2 = false;
            }
            iRecordingOperationPanel2.openCamera(cert, z2);
            InterfaceC782930UnT interfaceC782930UnT = tTLiveBroadcastView.LLJILJIL;
            if (interfaceC782930UnT != null) {
                interfaceC782930UnT.LLLLZLLLI();
            }
            tTLiveBroadcastView.LLJJIJIL = false;
            if (tTLiveBroadcastView.LLJJIII && tTLiveBroadcastView.LLJJIJIIJIL && (c0ud5LJFF = C0UF5.LJFF()) != null) {
                c0ud5LJFF.LIZ = true;
            }
        }
    }

    @Override // X.InterfaceC21656819pG
    public final void processLongPressEvent(float f, float f2) {
        InterfaceC2177841ALe interfaceC2177841ALeVideoRecorder;
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLILLJJLI;
        if (iRecordingOperationPanel != null && (interfaceC2177841ALeVideoRecorder = iRecordingOperationPanel.videoRecorder()) != null) {
            ((u) interfaceC2177841ALeVideoRecorder).LJIIIIZZ(f, f2, 3, 5);
        }
    }

    @Override // X.InterfaceC21656819pG
    public final void processRotationEvent(float f, float f2) {
        InterfaceC2177841ALe interfaceC2177841ALeVideoRecorder;
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLILLJJLI;
        if (iRecordingOperationPanel != null && (interfaceC2177841ALeVideoRecorder = iRecordingOperationPanel.videoRecorder()) != null) {
            float f3 = -f;
            InterfaceC1645720sva interfaceC1645720sva = ((u) interfaceC2177841ALeVideoRecorder).LIZ;
            if (interfaceC1645720sva != null) {
                interfaceC1645720sva.Ao(f3, f2);
            }
        }
    }

    @Override // X.InterfaceC21656819pG
    public final void processScaleEvent(float f, float f2) {
        InterfaceC2177841ALe interfaceC2177841ALeVideoRecorder;
        InterfaceC1645720sva interfaceC1645720sva;
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLILLJJLI;
        if (iRecordingOperationPanel != null && (interfaceC2177841ALeVideoRecorder = iRecordingOperationPanel.videoRecorder()) != null && (interfaceC1645720sva = ((u) interfaceC2177841ALeVideoRecorder).LIZ) != null) {
            interfaceC1645720sva.mo59do(f, f2);
        }
    }

    @Override // X.InterfaceC21656819pG
    public final void processTouchEvent(float f, float f2) {
        InterfaceC2177841ALe interfaceC2177841ALeVideoRecorder;
        InterfaceC1645720sva interfaceC1645720sva;
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLILLJJLI;
        if (iRecordingOperationPanel != null && (interfaceC2177841ALeVideoRecorder = iRecordingOperationPanel.videoRecorder()) != null && (interfaceC1645720sva = ((u) interfaceC2177841ALeVideoRecorder).LIZ) != null) {
            interfaceC1645720sva.Do(f, f2);
        }
    }

    @Override // X.C0UJY
    public final void setRenderCacheString(String str, String str2) {
        InterfaceC2177841ALe interfaceC2177841ALe = this.LLILLJJLI.LLJJI;
        if (interfaceC2177841ALe != null) {
            ((u) interfaceC2177841ALe).LIZ.setRenderCacheString(str, str2);
        }
    }

    @Override // X.C0UJY
    public final void LJI(String[] strArr, String[] strArr2, float[] fArr) {
        u uVar;
        VERecorder vERecorder;
        InterfaceC2177841ALe interfaceC2177841ALe = this.LLILLJJLI.LLJJI;
        if (interfaceC2177841ALe != null && (vERecorder = (uVar = (u) interfaceC2177841ALe).LIZLLL) != null && vERecorder.LJIIL() != null) {
            uVar.LIZLLL.LJIIL().LJJIJIIJIL(strArr.length, strArr, strArr2, fArr);
        }
    }

    @Override // X.C0UJY
    public final void LJIIZILJ(String[] strArr, String[] strArr2, String[] strArr3) {
        List listLJJLL;
        InterfaceC2177841ALe interfaceC2177841ALe = this.LLILLJJLI.LLJJI;
        if (interfaceC2177841ALe != null) {
            if (strArr == null || (listLJJLL = C13LQ.LJJLL(strArr)) == null) {
                listLJJLL = C13BV.INSTANCE;
            }
            C13BV c13bv = C13BV.INSTANCE;
            List listLJJLL2 = C13LQ.LJJLL(strArr2);
            List listLJJLL3 = C13LQ.LJJLL(strArr3);
            List<ComposerInfo> listLIZIZ = u.LIZIZ(listLJJLL, c13bv, Collections.emptyList());
            List<ComposerInfo> listLIZIZ2 = u.LIZIZ(listLJJLL2, listLJJLL3, Collections.emptyList());
            InterfaceC1645720sva interfaceC1645720sva = ((u) interfaceC2177841ALe).LIZ;
            if (interfaceC1645720sva != null) {
                interfaceC1645720sva.i2(listLIZIZ, listLIZIZ2, 10000);
            }
        }
    }

    @Override // X.C0UJY
    public final void LJJIJIIJIL(int i, int i2, MotionEvent motionEvent) {
        float[] fArr = {motionEvent.getX(), motionEvent.getY()};
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLIZLLLIL;
        if (iRecordingOperationPanel != null) {
            iRecordingOperationPanel.cameraFocus(i, i2, fArr);
        }
    }

    @Override // X.C0UJY
    public final void Pn(boolean z, boolean z2, boolean z3) {
        InterfaceC2177841ALe interfaceC2177841ALe = this.LLILLJJLI.LLJJI;
        if (interfaceC2177841ALe != null) {
            ((u) interfaceC2177841ALe).LJIIJ(z, z2, z3);
        }
    }

    @Override // X.C0UJY
    public final int composerCheckNodeExclusion(String str, String str2, int[] iArr) {
        int[] iArrLJJLL;
        InterfaceC2177841ALe interfaceC2177841ALe = this.LLILLJJLI.LLJJI;
        if (interfaceC2177841ALe != null) {
            iArrLJJLL = ((u) interfaceC2177841ALe).LIZ.LJJLL(str, str2);
        } else {
            iArrLJJLL = null;
        }
        if (iArrLJJLL != null && iArrLJJLL.length == 2) {
            iArr[0] = iArrLJJLL[1];
            return 0;
        }
        iArr[0] = 0;
        return 0;
    }

    @Override // X.C0UJY
    public final int composerUpdateNode(String str, String str2, float f) throws Exception {
        InterfaceC2177841ALe interfaceC2177841ALe;
        InterfaceC1645720sva interfaceC1645720sva;
        if (C703302op.LIZ(str) && C703302op.LIZ(str2) && (interfaceC2177841ALe = this.LLILLJJLI.LLJJI) != null && (interfaceC1645720sva = ((u) interfaceC2177841ALe).LIZ) != null) {
            C1404370meJ c1404370meJN4 = interfaceC1645720sva.N4();
            c1404370meJN4.LIZIZ(f, str, str2);
            c1404370meJN4.LIZ();
            return 0;
        }
        return 0;
    }

    @Override // X.InterfaceC21656819pG
    public final void processTouchDownEvent(float f, float f2, int i) {
        InterfaceC2177841ALe interfaceC2177841ALeVideoRecorder;
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLILLJJLI;
        if (iRecordingOperationPanel != null && (interfaceC2177841ALeVideoRecorder = iRecordingOperationPanel.videoRecorder()) != null) {
            ((u) interfaceC2177841ALeVideoRecorder).LJIIIIZZ(f, f2, 0, i);
        }
    }

    @Override // X.InterfaceC21656819pG
    public final void processTouchUpEvent(float f, float f2, int i) {
        InterfaceC2177841ALe interfaceC2177841ALeVideoRecorder;
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLILLJJLI;
        if (iRecordingOperationPanel != null && (interfaceC2177841ALeVideoRecorder = iRecordingOperationPanel.videoRecorder()) != null) {
            ((u) interfaceC2177841ALeVideoRecorder).LJIIIIZZ(f, f2, 2, i);
        }
    }

    @Override // X.C0UJY
    public final void LIZJ(int i, int i2, String str, String str2) {
        InterfaceC1645720sva interfaceC1645720sva;
        InterfaceC2177841ALe interfaceC2177841ALe = this.LLILLJJLI.LLJJI;
        if (interfaceC2177841ALe != null && (interfaceC1645720sva = ((u) interfaceC2177841ALe).LIZ) != null) {
            interfaceC1645720sva.LJLJJL(i, i2, str, str2);
        }
    }

    @Override // X.C0UJY
    public final void sendEffectMsg(int i, long j, long j2, String str) {
        InterfaceC2177841ALe interfaceC2177841ALe = this.LLILLJJLI.LLJJI;
        if (interfaceC2177841ALe != null) {
            ((u) interfaceC2177841ALe).LIZ.sendEffectMsg(i, j, j2, str);
        }
    }

    @Override // X.C0UJY
    public final void LJIIIIZZ(String[] strArr, String[] strArr2, boolean z, boolean z2, boolean z3) {
        LJIILIIL(strArr, strArr2);
    }

    @Override // X.InterfaceC21656819pG
    public final void processPanEvent(float f, float f2, float f3, float f4, float f5) {
        InterfaceC2177841ALe interfaceC2177841ALeVideoRecorder;
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLILLJJLI;
        if (iRecordingOperationPanel != null && (interfaceC2177841ALeVideoRecorder = iRecordingOperationPanel.videoRecorder()) != null) {
            ((u) interfaceC2177841ALeVideoRecorder).LJII(f, f2, f3, f4, f5);
        }
    }

    @Override // X.C0UJY
    public final int LJJIII(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        VERecorder vERecorder;
        k kVar;
        InterfaceC2177841ALe interfaceC2177841ALe = this.LLILLJJLI.LLJJI;
        if (interfaceC2177841ALe != null && (vERecorder = ((u) interfaceC2177841ALe).LIZLLL) != null && (kVar = vERecorder.LIZIZ) != null && kVar.LJJJ != null) {
            TEBundle tEBundleObtain = TEBundle.obtain();
            tEBundleObtain.setBool("InitBMFStreamHd", true);
            tEBundleObtain.setLong("algVersion", i);
            tEBundleObtain.setLong("backend", i2);
            tEBundleObtain.setLong("algSubType", 1L);
            tEBundleObtain.setLong("poolSize", i3);
            tEBundleObtain.setLong("maxWidth", i4);
            tEBundleObtain.setLong("maxHeight", i5);
            tEBundleObtain.setLong("abStrategy", 0L);
            tEBundleObtain.setLong("strongStreamhdIsoTh", 0L);
            tEBundleObtain.setLong("mediumStreamhdIsoTh", 0L);
            tEBundleObtain.setLong("weakStreamhdIsoTh", 0L);
            tEBundleObtain.setLong("aesType", i6);
            tEBundleObtain.setFloat("sharpStrength", 0.0f);
            tEBundleObtain.setFloat("sharpThreshLow", 0.0f);
            tEBundleObtain.setFloat("sharpThreshHigh", 0.0f);
            tEBundleObtain.setString("modelNamePrefix", "");
            tEBundleObtain.setString("programCacheDir", str);
            tEBundleObtain.setString("aesWeightPath", "");
            return kVar.LJJJ.LJIL("InitBMFStreamHd", tEBundleObtain);
        }
        return -1;
    }

    @Override // X.InterfaceC21656819pG
    public final void processTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2) {
        InterfaceC2177841ALe interfaceC2177841ALeVideoRecorder;
        InterfaceC1645720sva interfaceC1645720sva;
        VETouchPointer vETouchPointer = new VETouchPointer();
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    if (i == 4) {
                        vETouchPointer.setEvent(VETouchPointer.TouchEvent.CANCELED);
                    }
                } else {
                    vETouchPointer.setEvent(VETouchPointer.TouchEvent.ENDED);
                }
            } else {
                vETouchPointer.setEvent(VETouchPointer.TouchEvent.MOVED);
            }
        } else {
            vETouchPointer.setEvent(VETouchPointer.TouchEvent.BEGAN);
        }
        vETouchPointer.setForce(f3);
        vETouchPointer.setPointerId((int) j);
        vETouchPointer.setX(f);
        vETouchPointer.setY(f2);
        vETouchPointer.setMajorRadius(f4);
        IRecordingOperationPanel iRecordingOperationPanel = this.LLILLJJLI.LLILLJJLI;
        if (iRecordingOperationPanel != null && (interfaceC2177841ALeVideoRecorder = iRecordingOperationPanel.videoRecorder()) != null && (interfaceC1645720sva = ((u) interfaceC2177841ALeVideoRecorder).LIZ) != null) {
            interfaceC1645720sva.Ch(vETouchPointer, i2);
        }
    }
}
