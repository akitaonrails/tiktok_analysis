package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHEnableDynamicGLVersionSettings;
import com.bytedance.android.livesdk.livesetting.effect.LiveAsiaBeautyGenderOpt;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastHostUseTTLH;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGLContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS556S0100000_12;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UIg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C769960UIg implements C0UJY, C0UHD {
    public final LifecycleOwner LL;
    public final InterfaceC769940UIe LLILLJJLI;
    public final InterfaceC770050UIp LLILLL;
    public final SurfaceView LLILZ;
    public final float LLILZIL;
    public final Function0<Unit> LLILZLL;
    public final Function1<Boolean, Unit> LLIZ;
    public InterfaceC770090UIt LLJI;
    public InterfaceC770070UIr LLJIJIL;
    public C770020UIm LLJILJIL;
    public C769990UIj LLJILJILJ;
    public String LLJJ;
    public boolean LLJJI;
    public float LLJJIII;
    public Function0<Unit> LLJJIJIIJIL;
    public InterfaceC770080UIs LLJJIJIL;
    public int LLJJJ;
    public final C01GW LLIZLLLIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 513));
    public final C01GW LLJ = C292401Bi.LIZ(new AwS556S0100000_12(this, 514));
    public final AtomicBoolean LLJILLL = new AtomicBoolean(false);
    public float LLJJIJI = -1.0f;

    @Override // X.C0UJY
    public final void LIZIZ() {
    }

    @Override // X.C0UJY
    public final String[] LJIIJ() {
        return null;
    }

    @Override // X.C0UJY
    public final void LJIILLIIL(LiveEffect liveEffect, String str) {
    }

    @Override // X.C0UJY
    public final boolean LJIJJLI() {
        return true;
    }

    @Override // X.C0UJY
    public final void LJJ(LiveEffect liveEffect, String str) {
    }

    @Override // X.C0UJY
    public final int LJJIII(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        return -1;
    }

    @Override // X.C0UJY
    public final void LJJIIZI(Boolean bool) {
    }

    @Override // X.C0UJY
    public final void LJJIJL(boolean z) {
    }

    @Override // X.C0UJY
    public final void LJJLIIIJJI() {
    }

    @Override // X.C0UJY
    public final void Pn(boolean z, boolean z2, boolean z3) {
    }

    @Override // X.C0UJY
    public final long getAvgExpTime() {
        return 0L;
    }

    @Override // X.C0UJY
    public final String LIZLLL() {
        String strLIZIZ = "";
        if (TTLHEnableDynamicGLVersionSettings.INSTANCE.value()) {
            try {
                int[] eGLVersion = GLThreadManager.getEGLVersion();
                if (eGLVersion.length >= 2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(eGLVersion[0]);
                    sbLIZ.append('.');
                    sbLIZ.append(eGLVersion[1]);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    return strLIZIZ;
                }
            } catch (IndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("StickerEffectAdaptiveManager", "wrong gl version");
            }
        }
        return strLIZIZ;
    }

    @Override // X.C0UJY
    public final void LJFF() {
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL = this.LLILLJJLI.LJIIL();
        if (interfaceC1268640j7OLJIIL != null) {
            interfaceC1268640j7OLJIIL.notifyKeyboardHide(true);
        }
    }

    @Override // X.C0UJY
    public final void LJJIFFI() {
        InterfaceC770050UIp interfaceC770050UIp = this.LLILLL;
        if (interfaceC770050UIp != null) {
            interfaceC770050UIp.LJIIZILJ(CertProviderManagerKt.findCert("bpea-go_live_destroy_video", 1476788484));
        }
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getLiveCoreInitUtil().LIZJ();
    }

    @Override // X.C0UJY
    public final void LJJII() {
        AbstractC1273900jFs liveCore = this.LLILLJJLI.getLiveCore();
        if (liveCore != null) {
            liveCore.LJLJL(false);
        }
    }

    @Override // X.C0UJY
    public final void LJJIIJZLJL() {
        if (LiveAsiaBeautyGenderOpt.INSTANCE.enable() && this.LLJILLL.get()) {
            String str = this.LLJJ;
            if (str != null) {
                this.LLILLL.LIZIZ(str);
                this.LLJJJ = 0;
            }
            this.LLJJ = null;
            this.LLJILLL.set(false);
        }
        C770020UIm c770020UIm = this.LLJILJIL;
        if (c770020UIm != null) {
            this.LLILLL.LJIILL(c770020UIm);
        }
        C769990UIj c769990UIj = this.LLJILJILJ;
        if (c769990UIj != null) {
            LJIIL(c769990UIj);
        }
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
    }

    @Override // X.C0UJY
    public final InterfaceC1268640j7O LJJIJ() {
        InterfaceC769940UIe interfaceC769940UIe = this.LLILLJJLI;
        if (interfaceC769940UIe != null) {
            return interfaceC769940UIe.LJIIL();
        }
        return null;
    }

    public final C0UG9 LJJIL() {
        return (C0UG9) this.LLIZLLLIL.getValue();
    }

    public final C0UGQ LJJIZ() {
        return (C0UGQ) this.LLJ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, X.0UIl] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0UIm, X.0jDh] */
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
    public final void LJJJ() {
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = EnumC770010UIl.DEFAULT;
        if (LiveAsiaBeautyGenderOpt.INSTANCE.enable()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C769970UIh(this, c259800zU, null), 3);
        }
        ?? r1 = new InterfaceC1272550jDh() { // from class: X.0UIm
            @Override // X.InterfaceC1272550jDh
            public final void onFaceDetectResultCallback(int i) {
                boolean z;
                C769960UIg c769960UIg = this.LL;
                if (c769960UIg.LLJJI) {
                    InterfaceC770090UIt interfaceC770090UIt = c769960UIg.LLJI;
                    if (interfaceC770090UIt != null) {
                        interfaceC770090UIt.onResult(-1);
                    }
                } else {
                    InterfaceC770090UIt interfaceC770090UIt2 = c769960UIg.LLJI;
                    if (interfaceC770090UIt2 != null) {
                        interfaceC770090UIt2.onResult(i);
                    }
                }
                InterfaceC770070UIr interfaceC770070UIr = this.LL.LLJIJIL;
                if (interfaceC770070UIr != null) {
                    if (i > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    interfaceC770070UIr.LIZ(z, c259800zU.element);
                }
            }
        };
        this.LLJILJIL = r1;
        this.LLILLL.LJIILJJIL(r1);
    }

    @Override // X.C0UJY
    public final int getCameraInfo() {
        return this.LLILLJJLI.LJIIJJI();
    }

    @Override // X.C0UJY
    public final JSONObject getCameraParams() throws JSONException {
        JSONObject jSONObjectLJLZ;
        AbstractC1273900jFs liveCore = this.LLILLJJLI.getLiveCore();
        if (liveCore != null && (jSONObjectLJLZ = liveCore.LJLZ()) != null && jSONObjectLJLZ.has("colorCorrectionSetting")) {
            Object obj = jSONObjectLJLZ.get("colorCorrectionSetting");
            if (obj instanceof JSONObject) {
                return (JSONObject) obj;
            }
        }
        return null;
    }

    @Override // X.C0UJY
    public final void hideBottomTab() {
        Function1<Boolean, Unit> function1 = this.LLIZ;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
    }

    @Override // X.C0UJY
    public final void l() {
        this.LLILZLL.invoke();
    }

    @Override // X.C0UJY
    public final void showBottomTab() {
        Function1<Boolean, Unit> function1 = this.LLIZ;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    @Override // X.C0UJY
    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startVideoCapture, cameraCapture: ");
        sbLIZ.append(this.LLILLL);
        C20441214yg.LIZIZ("GoLiveParamsListener", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLL.LIZ();
    }

    @Override // X.C0UJY
    public final float LJIJ() {
        return this.LLILZIL;
    }

    @Override // X.C0UJY
    public final void LJ(String str) {
        Function1<Boolean, Unit> function1 = this.LLIZ;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    @Override // X.C0UJY
    public final void LJII(String[] strArr) {
        C0UG9 c0ug9LJJIL = LJJIL();
        if (c0ug9LJJIL != null) {
            c0ug9LJJIL.LJII(strArr);
        }
    }

    @Override // X.C0UJY
    public final void LJIIIZ(C0UHE c0uhe) {
        this.LLILLL.LJIIIZ(c0uhe);
    }

    @Override // X.C0UJY
    public final void LJIIJJI(String str) {
        Function1<Boolean, Unit> function1 = this.LLIZ;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
    }

    @Override // X.C0UJY
    public final void LJIIL(C0UHE c0uhe) {
        this.LLILLL.LJIIL(c0uhe);
    }

    @Override // X.C0UJY
    public final void LJIILJJIL(InterfaceC770080UIs interfaceC770080UIs) {
        this.LLJJIJIL = interfaceC770080UIs;
        AbstractC1273900jFs liveCore = this.LLILLJJLI.getLiveCore();
        if (liveCore != null) {
            liveCore.LJIJI(this);
        }
    }

    @Override // X.C0UJY
    public final void LJIILL(JSONObject jSONObject) throws JSONException {
        AbstractC1273900jFs liveCore;
        C20441214yg.LIZIZ("AIBeauty#setTTLH", String.valueOf(jSONObject));
        if (jSONObject != null && (liveCore = this.LLILLJJLI.getLiveCore()) != null) {
            liveCore.LJLJL(true);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("colorCorrectionSetting", jSONObject);
            liveCore.LLLFZ(jSONObject2);
        }
    }

    @Override // X.C0UJY
    public final void LJIJI(String[] strArr) {
        C0UG9 c0ug9LJJIL = LJJIL();
        if (c0ug9LJJIL != null) {
            c0ug9LJJIL.LJIJI(strArr);
        }
    }

    @Override // X.C0UJY
    public final void LJIL(InterfaceC770090UIt interfaceC770090UIt) {
        this.LLJI = interfaceC770090UIt;
    }

    @Override // X.C0UJY
    public final void LJJI(InterfaceC770070UIr interfaceC770070UIr) {
        this.LLJIJIL = interfaceC770070UIr;
    }

    @Override // X.C0UJY
    public final void LJJIIJ(final C0UJ0 c0uj0) {
        Object c098200Yq;
        Bundle bundle = new Bundle();
        bundle.putFloat("x", 0.0f);
        bundle.putFloat("y", 0.0f);
        bundle.putFloat("w", 1.0f);
        bundle.putFloat("h", 1.0f);
        try {
            this.LLILLJJLI.B3(bundle, new InterfaceC1272960jEM() { // from class: X.0UIq
                @Override // X.InterfaceC1272960jEM
                public final void LIZJ() {
                    c0uj0.LIZ(null);
                }

                @Override // X.InterfaceC1272960jEM
                public final void LIZLLL(Bitmap bitmap) {
                    c0uj0.LIZ(bitmap);
                }
            });
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c0uj0.LIZ(null);
        }
    }

    @Override // X.C0UJY
    public final String LJJIJIIJI(int i) {
        String strLLFZ;
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL = this.LLILLJJLI.LJIIL();
        if (interfaceC1268640j7OLJIIL == null || (strLLFZ = interfaceC1268640j7OLJIIL.LLFZ()) == null) {
            return "";
        }
        return strLLFZ;
    }

    @Override // X.C0UJY
    public final void LJJIJIL(boolean z) {
        AbstractC1273900jFs liveCore = this.LLILLJJLI.getLiveCore();
        if (liveCore != null) {
            liveCore.LJLJL(z);
        }
    }

    @Override // X.C0UJY
    public final void closeCamera(Cert cert) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("closeCamera, cameraCapture: ");
        sbLIZ.append(this.LLILLL);
        C20441214yg.LIZIZ("GoLiveParamsListener", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLL.LJIILIIL(cert, false);
        this.LLJJI = true;
    }

    @Override // X.C0UJY
    public final Boolean scaleCamera(ScaleGestureDetector scaleGestureDetector) {
        if (this.LLJJIJI == -1.0f) {
            this.LLJJIJI = this.LLILLJJLI.K3();
        }
        float f = 0.0f;
        if (this.LLJJIJI <= 0.0f) {
            return Boolean.FALSE;
        }
        if (scaleGestureDetector != null) {
            if (scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan() == 0.0f) {
                return Boolean.FALSE;
            }
            float currentSpan = ((this.LLJJIJI / LSPassThroughRecordSizeConfig.DEFAULT) * (scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan())) + this.LLJJIII;
            if (0.0f < currentSpan) {
                f = currentSpan;
            }
            this.LLJJIII = f;
            float f2 = this.LLJJIJI;
            if (f > f2) {
                f = f2;
            }
            this.LLJJIII = f;
            this.LLILLJJLI.N3(f);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // X.C0UJY
    public final void setExposureCompensation(int i) {
        this.LLILLJJLI.LJIIIZ(i);
    }

    @Override // X.C0UJY
    public final void LJIILIIL(String[] strArr, String[] strArr2) {
        C0UG9 c0ug9LJJIL = LJJIL();
        if (c0ug9LJJIL != null) {
            c0ug9LJJIL.LJIILIIL(strArr, strArr2);
        }
    }

    @Override // X.C0UJY
    public final void LJIJJ(String[] strArr, String[] strArr2) {
        C0UG9 c0ug9LJJIL = LJJIL();
        if (c0ug9LJJIL != null) {
            c0ug9LJJIL.LJIILJJIL(strArr, strArr2);
        }
    }

    @Override // X.C0UJY
    public final void LJJIIZ(int i, Cert cert) {
        if (i != 0) {
            if (i == 1) {
                this.LLILLJJLI.L3(1, cert);
                return;
            }
            return;
        }
        this.LLILLJJLI.L3(2, cert);
    }

    @Override // X.C0UJY
    public final void LJJIJLIJ(String[] strArr, String[] strArr2) {
        C0UG9 c0ug9LJJIL = LJJIL();
        if (c0ug9LJJIL != null) {
            c0ug9LJJIL.LJIJ(strArr, strArr2);
        }
    }

    @Override // X.C0UJY
    public final int LJJZ(String str, String str2) {
        if (str == null || str2 == null) {
            return -1;
        }
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL = this.LLILLJJLI.LJIIL();
        if (interfaceC1268640j7OLJIIL != null) {
            interfaceC1268640j7OLJIIL.setCustomEffect(str, str2);
            return 0;
        }
        return 0;
    }

    @Override // X.C0UJY
    public final void openCamera(Cert cert, boolean z) {
        SurfaceView surfaceView;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openCamera, cameraCapture: ");
        sbLIZ.append(this.LLILLL);
        C20441214yg.LIZIZ("GoLiveParamsListener", C2188811AlT.LIZIZ(sbLIZ));
        if (LiveBroadcastHostUseTTLH.getEnable() && (surfaceView = this.LLILZ) != null) {
            C786410Ut5.LLIIII(surfaceView, 0);
        }
        this.LLILLL.LJIILIIL(cert, true);
        this.LLJJI = false;
    }

    @Override // X.InterfaceC21656819pG
    public final void processLongPressEvent(float f, float f2) {
        C0UGQ c0ugqLJJIZ = LJJIZ();
        if (c0ugqLJJIZ != null) {
            ((C770040UIo) c0ugqLJJIZ).processLongPressEvent(f, f2);
        }
    }

    @Override // X.InterfaceC21656819pG
    public final void processRotationEvent(float f, float f2) {
        C0UGQ c0ugqLJJIZ = LJJIZ();
        if (c0ugqLJJIZ != null) {
            ((C770040UIo) c0ugqLJJIZ).processRotationEvent(f, f2);
        }
    }

    @Override // X.InterfaceC21656819pG
    public final void processScaleEvent(float f, float f2) {
        C0UGQ c0ugqLJJIZ = LJJIZ();
        if (c0ugqLJJIZ != null) {
            ((C770040UIo) c0ugqLJJIZ).processScaleEvent(f, f2);
        }
    }

    @Override // X.InterfaceC21656819pG
    public final void processTouchEvent(float f, float f2) {
        C0UGQ c0ugqLJJIZ = LJJIZ();
        if (c0ugqLJJIZ != null) {
            ((C770040UIo) c0ugqLJJIZ).processTouchEvent(f, f2);
        }
    }

    @Override // X.C0UJY
    public final void setRenderCacheString(String str, String str2) {
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL = this.LLILLJJLI.LJIIL();
        if (interfaceC1268640j7OLJIIL != null) {
            interfaceC1268640j7OLJIIL.setRenderCacheString(str, str2);
        }
    }

    @Override // X.C0UJY
    public final void LJI(String[] strArr, String[] strArr2, float[] fArr) {
        C0UG9 c0ug9LJJIL = LJJIL();
        if (c0ug9LJJIL != null) {
            c0ug9LJJIL.LJI(strArr, strArr2, fArr);
        }
    }

    @Override // X.C0UJY
    public final void LJIIZILJ(String[] strArr, String[] strArr2, String[] strArr3) {
        C0UG9 c0ug9LJJIL = LJJIL();
        if (c0ug9LJJIL != null) {
            c0ug9LJJIL.LJIJJ(strArr, strArr2, strArr3);
        }
    }

    @Override // X.C0UJY
    public final void LJJIJIIJIL(int i, int i2, MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.LLILLJJLI.j3(i, i2, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
    }

    @Override // X.C0UJY
    public final int composerCheckNodeExclusion(String str, String str2, int[] iArr) {
        C0UG9 c0ug9LJJIL = LJJIL();
        if (c0ug9LJJIL != null) {
            c0ug9LJJIL.composerCheckNodeExclusion(str, str2, iArr);
            return 0;
        }
        return 0;
    }

    @Override // X.C0UJY
    public final int composerUpdateNode(String str, String str2, float f) {
        C0UG9 c0ug9LJJIL = LJJIL();
        if (c0ug9LJJIL != null) {
            c0ug9LJJIL.LJIIZILJ(f, str, str2);
            return 0;
        }
        return 0;
    }

    @Override // X.InterfaceC21656819pG
    public final void processTouchDownEvent(float f, float f2, int i) {
        C0UGQ c0ugqLJJIZ = LJJIZ();
        if (c0ugqLJJIZ != null) {
            ((C770040UIo) c0ugqLJJIZ).processTouchDownEvent(f, f2, i);
        }
    }

    @Override // X.InterfaceC21656819pG
    public final void processTouchUpEvent(float f, float f2, int i) {
        C0UGQ c0ugqLJJIZ = LJJIZ();
        if (c0ugqLJJIZ != null) {
            ((C770040UIo) c0ugqLJJIZ).processTouchUpEvent(f, f2, i);
        }
    }

    @Override // X.C0UJY
    public final void LIZJ(int i, int i2, String str, String str2) {
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL = this.LLILLJJLI.LJIIL();
        if (interfaceC1268640j7OLJIIL != null) {
            interfaceC1268640j7OLJIIL.setInputText(str, i, i2, str2);
        }
    }

    @Override // X.C0UJY
    public final void sendEffectMsg(int i, long j, long j2, String str) {
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL = this.LLILLJJLI.LJIIL();
        if (interfaceC1268640j7OLJIIL != null) {
            interfaceC1268640j7OLJIIL.sendEffectMsg(i, (int) j, (int) j2, str);
        }
    }

    @Override // X.C0UJY
    public final void LJIIIIZZ(String[] strArr, String[] strArr2, boolean z, boolean z2, boolean z3) {
        C0UG9 c0ug9LJJIL = LJJIL();
        if (c0ug9LJJIL != null) {
            c0ug9LJJIL.LJIIIIZZ(strArr, strArr2, z, z2, z3);
        }
    }

    @Override // X.InterfaceC21656819pG
    public final void processPanEvent(float f, float f2, float f3, float f4, float f5) {
        C0UGQ c0ugqLJJIZ = LJJIZ();
        if (c0ugqLJJIZ != null) {
            ((C770040UIo) c0ugqLJJIZ).processPanEvent(f, f2, f3, f4, f5);
        }
    }

    public C769960UIg(float f, SurfaceView surfaceView, LifecycleOwner lifecycleOwner, InterfaceC770050UIp interfaceC770050UIp, InterfaceC769940UIe interfaceC769940UIe, Function0 function0, Function1 function1) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = interfaceC769940UIe;
        this.LLILLL = interfaceC770050UIp;
        this.LLILZ = surfaceView;
        this.LLILZIL = f;
        this.LLILZLL = function0;
        this.LLIZ = function1;
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL = interfaceC769940UIe.LJIIL();
        if (interfaceC1268640j7OLJIIL != null) {
            interfaceC1268640j7OLJIIL.composerSetMode(1, 0);
        }
        if (LiveBroadcastHostUseTTLH.getEnable()) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C592710NMn(this, null), 3);
        } else {
            LJJJ();
        }
    }

    @Override // X.InterfaceC21656819pG
    public final void processTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2) {
        C0UGQ c0ugqLJJIZ = LJJIZ();
        if (c0ugqLJJIZ != null) {
            ((C770040UIo) c0ugqLJJIZ).processTouchEventWithTouchType(j, f, f2, f3, f4, i, i2);
        }
    }

    @Override // X.C0UHD
    public final void u(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object... objArr) {
        AbstractC1273900jFs liveCore;
        try {
            try {
                InterfaceC770080UIs interfaceC770080UIs = this.LLJJIJIL;
                if (interfaceC770080UIs != null) {
                    interfaceC770080UIs.LIZ(C1273030jET.LIZ(i, i2, i3, z));
                }
                this.LLJJIJIL = null;
                liveCore = this.LLILLJJLI.getLiveCore();
                if (liveCore == null) {
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                InterfaceC770080UIs interfaceC770080UIs2 = this.LLJJIJIL;
                if (interfaceC770080UIs2 != null) {
                    interfaceC770080UIs2.LIZ(null);
                }
                this.LLJJIJIL = null;
                liveCore = this.LLILLJJLI.getLiveCore();
                if (liveCore == null) {
                    return;
                }
            }
            liveCore.LLJZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJIJIL = null;
            AbstractC1273900jFs liveCore2 = this.LLILLJJLI.getLiveCore();
            if (liveCore2 != null) {
                liveCore2.LLJZ(this);
            }
            throw th;
        }
    }

    @Override // X.C0UHD
    public final void LLLLZLL(EGLContext eGLContext, int i, boolean z, InterfaceC1272490jDb interfaceC1272490jDb, int i2, int i3, long j, float[] fArr, long j2, Object... objArr) {
        u(eGLContext, i, z, i2, i3, j, fArr, objArr);
    }
}
