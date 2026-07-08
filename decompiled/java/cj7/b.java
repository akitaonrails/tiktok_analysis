package cj7;

import X.C0PEM;
import X.C15438062q;
import X.C1643440sru;
import X.C1655800tBq;
import X.C1780100wQK;
import X.C1AO1;
import X.C1AO5;
import X.C1AWM;
import X.C1DKV;
import X.C1DLD;
import X.C1DLJ;
import X.C1DLS;
import X.C1DMI;
import X.C2178491ANr;
import X.C2188811AlT;
import X.C2208821Bce;
import X.C2216191BoX;
import X.C2254401DLq;
import X.C2254541DMe;
import X.C23250099c;
import X.C2484209oO;
import X.C817503Hh;
import X.EnumC2249751D3t;
import X.InterfaceC1294060jmO;
import X.InterfaceC2178571ANz;
import X.InterfaceC2183551Acz;
import X.InterfaceC2216251Bod;
import X.InterfaceC2240011Clr;
import X.InterfaceC2253451DHz;
import X.InterfaceC2254001DKc;
import X.InterfaceC2254571DMh;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEBundle;
import com.ss.android.ttve.nativePort.TERecorderInterface;
import com.ss.android.ugc.asve.recorder.ASMediaSegment;
import com.ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.ss.android.ugc.asve.recorder.camera.VECameraController;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESafeAreaParams;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.filterparam.VEAudioAECFilterParam;
import com.ss.android.vesdk.k;
import com.ss.android.vesdk.model.VEPrePlayParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS15S0000001_35;
import kotlin.jvm.internal.AwS20S0002000_35;
import kotlin.jvm.internal.AwS242S0300000_33;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import ud7.b;

/* JADX INFO: loaded from: classes36.dex */
public final class b implements InterfaceC2254001DKc {
    public final VERecorder LIZ;
    public final C1DKV LIZIZ;
    public final VECameraSettings LIZJ;
    public final VECameraController LIZLLL;
    public final InterfaceC2253451DHz LJ;
    public InterfaceC2240011Clr LJFF;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public volatile C1DMI LJIILIIL;
    public volatile boolean LJIILJJIL;
    public boolean LJI = true;
    public final MutableLiveData<Boolean> LJIIIZ = new MutableLiveData<>();
    public final List<C1DLS> LJIIJ = new ArrayList();
    public final List<InterfaceC2183551Acz> LJIIJJI = new ArrayList();
    public final Object LJIIL = new Object();

    @Override // X.InterfaceC2254001DKc
    public final void B5() {
    }

    @Override // X.InterfaceC2254001DKc
    public final void U4() {
    }

    @Override // X.InterfaceC2254001DKc
    public final void w5() {
    }

    @Override // X.InterfaceC2254001DKc
    public final int A5() {
        return this.LIZLLL.LLJJJJLIIL.LJJJJ();
    }

    @Override // X.InterfaceC2254001DKc
    public final int G5() {
        return this.LIZ.LIZIZ.LJIJJ;
    }

    @Override // X.InterfaceC2254001DKc
    public final boolean I4() {
        return this.LIZ.LIZIZ.LJIIZILJ() == 3;
    }

    @Override // X.InterfaceC2254001DKc
    public final float J5() {
        return this.LIZ.LIZIZ.LJJIIZ;
    }

    @Override // X.InterfaceC2254001DKc
    public final float K5() {
        return this.LIZ.LIZIZ.LJIJ;
    }

    @Override // X.InterfaceC2254001DKc
    public final float L4() {
        return this.LIZLLL.LLJJJJLIIL.LJJIJ();
    }

    @Override // X.InterfaceC2254001DKc
    public final float L5() {
        return this.LIZ.LIZIZ.LJJIJ;
    }

    @Override // X.InterfaceC2254001DKc
    public final void LIZ() {
        if (this.LIZIZ.LJIIJJI()) {
            LIZIZ();
        }
        VERecorder vERecorder = this.LIZ;
        vERecorder.getClass();
        C2484209oO.LJI("VERecorder", "stopPreview");
        vERecorder.LIZIZ.LJJJJ(false);
    }

    public final void LIZIZ() {
        synchronized (this.LJIIL) {
            try {
                if (this.LJIILIIL != null) {
                    C2216191BoX.LIZ.getClass();
                    ((C2208821Bce) C2216191BoX.LIZIZ()).LIZIZ().LIZ("VEMediaController: clearSafeAreaCache");
                }
                this.LJIILIIL = null;
                this.LJIILJJIL = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC2254001DKc
    public final void LJLL() {
        C2216191BoX.LIZ.getClass();
        InterfaceC2216251Bod interfaceC2216251BodLIZIZ = ((C2208821Bce) C2216191BoX.LIZIZ()).LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syz music beat sticker stopPrePlay oldPrePlayStatus:");
        sbLIZ.append(this.LJII);
        interfaceC2216251BodLIZIZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LJII = false;
        this.LIZ.LJJJJI(new InterfaceC2183551Acz() { // from class: X.1Bq9
            public final /* synthetic */ InterfaceC2183551Acz LIZ = null;

            @Override // X.InterfaceC2183551Acz
            public final void onDone(int i) {
                C2216191BoX.LIZ.getClass();
                InterfaceC2216251Bod interfaceC2216251BodLIZIZ2 = ((C2208821Bce) C2216191BoX.LIZIZ()).LIZIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("syz music beat sticker stopPrePlay ret=");
                sbLIZ2.append(i);
                interfaceC2216251BodLIZIZ2.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                InterfaceC2183551Acz interfaceC2183551Acz = this.LIZ;
                if (interfaceC2183551Acz != null) {
                    interfaceC2183551Acz.onDone(i);
                }
                this.LIZIZ.LIZLLL(true);
            }
        });
    }

    @Override // X.InterfaceC2254001DKc
    public final float P5() {
        return this.LIZ.LIZIZ.LJIJI;
    }

    @Override // X.InterfaceC2254001DKc
    public final void R4() {
        this.LIZ.LJJJI(null, new InterfaceC2183551Acz() { // from class: X.1DMR
            @Override // X.InterfaceC2183551Acz
            public final void onDone(int i) {
            }
        });
        VERecorder vERecorder = this.LIZ;
        vERecorder.LIZJ(vERecorder.LIZLLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    @Override // X.InterfaceC2254001DKc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String T4() {
        /*
            r3 = this;
            java.lang.String r2 = ""
            com.ss.android.vesdk.VERecorder r0 = r3.LIZ     // Catch: java.lang.Throwable -> L1b
            com.ss.android.vesdk.k r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> L1b
            com.ss.android.ttve.nativePort.TERecorderInterface r0 = r0.LJJJ     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L16
            java.lang.String r1 = r0.LJIIL()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L16
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L17
        L16:
            r1 = r2
        L17:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L1b
            goto L27
        L1b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L27:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L2e
            r2 = r1
        L2e:
            java.lang.String r2 = (java.lang.String) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cj7.b.T4():java.lang.String");
    }

    @Override // X.InterfaceC2254001DKc
    public final int Y4() {
        return this.LIZLLL.LLJJJJLIIL.LJJJI();
    }

    @Override // X.InterfaceC2254001DKc
    public final int Z4() {
        return this.LIZ.LIZIZ.LJIILIIL;
    }

    @Override // X.InterfaceC2254001DKc
    public final int c5() {
        return this.LIZ.LIZIZ.LJJIFFI;
    }

    @Override // X.InterfaceC2254001DKc
    public final float d5() {
        return this.LIZ.LIZIZ.LJJIIZI;
    }

    @Override // X.InterfaceC2254001DKc
    public final int e5() {
        return this.LIZ.LIZIZ.LJIIZILJ;
    }

    @Override // X.InterfaceC2254001DKc
    public final void f5() {
        this.LIZ.LJIIL().LJIJI(true);
    }

    @Override // X.InterfaceC2254001DKc
    public final int g5() {
        return this.LIZLLL.LLJJJJLIIL.LJJJIL();
    }

    @Override // X.InterfaceC2254001DKc
    public final long getEndFrameTimeUS() {
        return this.LIZ.LIZIZ.LJJJ.LJIIIIZZ("SegmentFrameTime");
    }

    @Override // X.InterfaceC2254001DKc
    public final void getIntermediatePathFromEffect() {
        VERecorder vERecorder = this.LIZ;
        vERecorder.getClass();
        C2484209oO.LJI("VERecorder", "get intermediate path from effect");
        vERecorder.LIZIZ.getClass();
    }

    @Override // X.InterfaceC2254001DKc
    public final int getLastRecordFrameNum() {
        return this.LIZ.LIZIZ.LJJLIL;
    }

    @Override // X.InterfaceC2254001DKc
    public final long getSegmentAudioLength() {
        return this.LIZ.LIZIZ.LJJJ.LJIIIIZZ("SegmentFrameTime");
    }

    @Override // X.InterfaceC2254001DKc
    public final float[] getSuggestVolume() {
        this.LIZ.LIZIZ.getClass();
        return new float[]{0.0f, 0.0f};
    }

    @Override // X.InterfaceC2254001DKc
    public final int i5() {
        return this.LIZ.LIZIZ.LJIILL;
    }

    @Override // X.InterfaceC2254001DKc
    public final int j5() {
        return this.LIZ.LIZIZ.LJIILJJIL;
    }

    @Override // X.InterfaceC2254001DKc
    public final void n5() {
        this.LIZ.LJIIL().getClass();
        C2484209oO.LIZ("VEEffect", "Not supported yet.");
    }

    @Override // X.InterfaceC2254001DKc
    public final String[] o5() {
        return this.LIZ.LIZIZ.LJJJ.LJIILIIL();
    }

    @Override // X.InterfaceC2254001DKc
    public final int q5() {
        return this.LIZ.LIZIZ.LJJJ.LJIIIIZZ("ClipCount");
    }

    @Override // X.InterfaceC2254001DKc
    public final int r5() {
        return this.LIZ.LIZIZ.LJIILLIIL;
    }

    @Override // X.InterfaceC2254001DKc
    public final VEDisplaySettings s1() {
        return this.LIZ.LJIIIZ();
    }

    @Override // X.InterfaceC2254001DKc
    public final float s5() {
        return this.LIZ.LIZIZ.LJJIJIIJI;
    }

    @Override // X.InterfaceC2254001DKc
    public final void t1() {
        VEPrePlayParams vEPrePlayParams = new VEPrePlayParams();
        vEPrePlayParams.isLoop = true;
        C2216191BoX.LIZ.getClass();
        InterfaceC2216251Bod interfaceC2216251BodLIZIZ = ((C2208821Bce) C2216191BoX.LIZIZ()).LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syz music beat sticker startPrePlay oldPrePlayStatus:");
        sbLIZ.append(this.LJII);
        interfaceC2216251BodLIZIZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LJII = true;
        LIZLLL(false);
        VERecorder vERecorder = this.LIZ;
        vERecorder.getClass();
        C2484209oO.LJI("VERecorder", "startPrePlay");
        vERecorder.LIZIZ.LJJIZ(vEPrePlayParams);
    }

    @Override // X.InterfaceC2254001DKc
    public final int v5() {
        return this.LIZLLL.LLJJJJLIIL.LJJJ();
    }

    @Override // X.InterfaceC2254001DKc
    public final void z5() {
        k kVar = this.LIZ.LIZIZ;
        kVar.getClass();
        VEConfigCenter.getInstance().getValue("ve_titan_release_gpu_resource", false).booleanValue();
        kVar.LJJLIIIJJIZ = null;
        kVar.LJJJ.LJJIJL();
    }

    @Override // X.InterfaceC2254001DKc
    public final MutableLiveData F5() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC2254001DKc
    public final boolean m5() {
        return this.LJII;
    }

    public static VESafeAreaParams[] LIZJ(VESafeAreaParams[] vESafeAreaParamsArr) {
        if (vESafeAreaParamsArr != null) {
            ArrayList arrayList = new ArrayList(vESafeAreaParamsArr.length);
            for (VESafeAreaParams vESafeAreaParams : vESafeAreaParamsArr) {
                VESafeAreaParams vESafeAreaParams2 = new VESafeAreaParams();
                vESafeAreaParams2.safeType = vESafeAreaParams.safeType;
                vESafeAreaParams2.left = vESafeAreaParams.left;
                vESafeAreaParams2.top = vESafeAreaParams.top;
                vESafeAreaParams2.right = vESafeAreaParams.right;
                vESafeAreaParams2.bottom = vESafeAreaParams.bottom;
                arrayList.add(vESafeAreaParams2);
            }
            return (VESafeAreaParams[]) arrayList.toArray(new VESafeAreaParams[0]);
        }
        return null;
    }

    @Override // X.InterfaceC2254001DKc
    public final int C5(boolean z) {
        k kVar = this.LIZ.LIZIZ;
        if (z) {
            return kVar.LJJI;
        }
        return kVar.LJJ;
    }

    @Override // X.InterfaceC2254001DKc
    public final int D4(VEDisplaySettings vEDisplaySettings) {
        return this.LIZ.LJJI(vEDisplaySettings);
    }

    @Override // X.InterfaceC2254001DKc
    public final void D5(InterfaceC2183551Acz interfaceC2183551Acz) {
        ((ArrayList) this.LJIIJJI).remove(interfaceC2183551Acz);
    }

    @Override // X.InterfaceC2254001DKc
    public final void E4(boolean z) {
        this.LIZ.LIZIZ.LJJJJLL = z;
    }

    @Override // X.InterfaceC2254001DKc
    public final int E5(boolean z) {
        k kVar = this.LIZ.LIZIZ;
        if (z) {
            return kVar.LJJIIJZLJL;
        }
        return kVar.LJJIIJ;
    }

    @Override // X.InterfaceC2254001DKc
    public final void H4(final Function1<? super Integer, Unit> function1) {
        this.LIZ.LJJJJJ(new InterfaceC2183551Acz() { // from class: X.1AOA
            @Override // X.InterfaceC2183551Acz
            public final void onDone(int i) {
                Function1<Integer, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Integer.valueOf(i));
                }
            }
        });
    }

    @Override // X.InterfaceC2254001DKc
    public final void I5(C1DLJ c1dlj) {
        k kVar = this.LIZ.LIZIZ;
        kVar.getClass();
        VEConfigCenter.getInstance().getValue("ve_titan_release_gpu_resource", false).booleanValue();
        kVar.LJJLIIIJJI = c1dlj;
        int iLJIILLIIL = kVar.LJJJ.LJIILLIIL();
        if (iLJIILLIIL != 0) {
            c1dlj.onDone(iLJIILLIIL);
        }
    }

    @Override // X.InterfaceC2254001DKc
    public final float J4(boolean z) {
        return this.LIZLLL.LLJJJJLIIL.LJJIL(z);
    }

    @Override // X.InterfaceC2254001DKc
    public final void K4(C1DLS c1dls) {
        ((ArrayList) this.LJIIJ).remove(c1dls);
    }

    public final void LIZLLL(boolean z) {
        if (!Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            this.LJIIIZ.postValue(Boolean.valueOf(z));
        } else {
            this.LJIIIZ.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC2254001DKc
    public final void LJLJLLL(Surface surface) {
        this.LIZ.LIZJ(surface);
    }

    @Override // X.InterfaceC2254001DKc
    public final float M4(boolean z) {
        return this.LIZLLL.LLJJJJLIIL.LJJIZ(z);
    }

    @Override // X.InterfaceC2254001DKc
    public final boolean N4(String str) {
        k kVar = this.LIZ.LIZIZ;
        int iLJIJJLI = kVar.LJJJ.LJIJJLI("AEC", true);
        int iLJJIJ = kVar.LJJJ.LJJIJ("AecModelPath", str);
        int i = kVar.LLIIL;
        if (i >= 0) {
            kVar.LJJIZ.removeTrackFilter(i);
        }
        VEAudioAECFilterParam vEAudioAECFilterParam = new VEAudioAECFilterParam();
        vEAudioAECFilterParam.modelPath = str;
        kVar.LLIIL = kVar.LJJIZ.addTrackFilter(1, 0, vEAudioAECFilterParam, 0, Integer.MAX_VALUE);
        if (iLJIJJLI == 0 && iLJJIJ == 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC2254001DKc
    public final void N5(InterfaceC2183551Acz interfaceC2183551Acz) {
        ((ArrayList) this.LJIIJJI).add(interfaceC2183551Acz);
    }

    @Override // X.InterfaceC2254001DKc
    public final void O4(C1DLS c1dls) {
        ((ArrayList) this.LJIIJ).add(c1dls);
    }

    @Override // X.InterfaceC2254001DKc
    public final void O5(VEVideoEncodeSettings vEVideoEncodeSettings) {
        this.LIZ.LIZLLL(vEVideoEncodeSettings);
    }

    @Override // X.InterfaceC2254001DKc
    public final void V4(C1655800tBq c1655800tBq) {
        k kVar = this.LIZ.LIZIZ;
        kVar.LJJLIIIJL = c1655800tBq;
        int iLJIJI = kVar.LJJJ.LJIJI(true);
        if (iLJIJI != 0) {
            c1655800tBq.onDone(iLJIJI);
        }
    }

    @Override // X.InterfaceC2254001DKc
    public final int W4(boolean z) {
        k kVar = this.LIZ.LIZIZ;
        if (z) {
            return kVar.LJIL;
        }
        return kVar.LJIJJLI;
    }

    @Override // X.InterfaceC2254001DKc
    public final void a5(Function1<? super VEDisplaySettings.Builder, Unit> function1) {
        VEDisplaySettings.Builder builder;
        VEDisplaySettings vEDisplaySettings = this.LIZ.LIZIZ.LJLJL;
        if (vEDisplaySettings != null) {
            builder = new VEDisplaySettings.Builder(vEDisplaySettings);
        } else {
            builder = new VEDisplaySettings.Builder();
        }
        function1.invoke(builder);
        D4(builder.build());
    }

    @Override // X.InterfaceC2254001DKc
    public final void enableAudio(boolean z) {
        EnumC2249751D3t enumC2249751D3t;
        k kVar = this.LIZ.LIZIZ;
        C2254401DLq c2254401DLq = kVar.LJJJJ;
        if (z) {
            enumC2249751D3t = EnumC2249751D3t.ENABLE;
        } else {
            enumC2249751D3t = EnumC2249751D3t.DISABLE;
        }
        c2254401DLq.LJJIII = enumC2249751D3t;
        kVar.LJJJ.LJJIII("RecordMicConfig", enumC2249751D3t.ordinal());
    }

    @Override // X.InterfaceC2254001DKc
    public final void h5(Function1<? super C1780100wQK, Unit> function1) {
        C1780100wQK c1780100wQK;
        VEVideoEncodeSettings vEVideoEncodeSettings = this.LIZ.LIZIZ.LJIIIIZZ;
        if (vEVideoEncodeSettings != null) {
            c1780100wQK = new C1780100wQK(vEVideoEncodeSettings);
        } else {
            c1780100wQK = new C1780100wQK(1);
        }
        function1.invoke(c1780100wQK);
        this.LIZ.LIZLLL(c1780100wQK.LIZ());
    }

    @Override // X.InterfaceC2254001DKc
    public final void k5(VESafeAreaParams[] vESafeAreaParamsArr) {
        if (vESafeAreaParamsArr != null) {
            for (VESafeAreaParams vESafeAreaParams : vESafeAreaParamsArr) {
                C2216191BoX.LIZ.getClass();
                InterfaceC2216251Bod interfaceC2216251BodLIZIZ = ((C2208821Bce) C2216191BoX.LIZIZ()).LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VEMediaController: setSafeArea type ");
                sbLIZ.append(0);
                sbLIZ.append(" safeType ");
                sbLIZ.append(vESafeAreaParams.safeType);
                sbLIZ.append(" left ");
                sbLIZ.append(vESafeAreaParams.left);
                sbLIZ.append(" top ");
                sbLIZ.append(vESafeAreaParams.top);
                sbLIZ.append(" right ");
                sbLIZ.append(vESafeAreaParams.right);
                sbLIZ.append(" bottom ");
                sbLIZ.append(vESafeAreaParams.bottom);
                interfaceC2216251BodLIZIZ.uu(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (this.LIZIZ.LJIIJJI()) {
            synchronized (this.LJIIL) {
                try {
                    if (!this.LJIILJJIL && !this.LJIIIIZZ) {
                        this.LJIILIIL = new C1DMI(LIZJ(vESafeAreaParamsArr));
                        C2216191BoX.LIZ.getClass();
                        ((C2208821Bce) C2216191BoX.LIZIZ()).LIZIZ().uu("VEMediaController: setSafeArea cached before startPreviewAsync");
                        return;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        this.LIZ.LJIIL().LJJI(0, vESafeAreaParamsArr);
    }

    @Override // X.InterfaceC2254001DKc
    public final void l5(float f) {
        h5(new AwS15S0000001_35(f, 0));
    }

    @Override // X.InterfaceC2254001DKc
    public final void setControllerCallback(InterfaceC2240011Clr interfaceC2240011Clr) {
        this.LJFF = interfaceC2240011Clr;
    }

    @Override // X.InterfaceC2254001DKc
    public final void setRecordMaxDuration(long j) {
        this.LIZ.LIZIZ.LJJJ.LJJIIJ("RecordMaxDuration", j * 1000);
    }

    @Override // X.InterfaceC2254001DKc
    public final void t5(VESize vESize) {
        this.LIZ.LIZIZ.LJIIJ(vESize);
    }

    @Override // X.InterfaceC2254001DKc
    public final float u5(boolean z) {
        return this.LIZLLL.LLJJJJLIIL.LJJIJLIJ(z);
    }

    @Override // X.InterfaceC2254001DKc
    public final void x5(boolean z) {
        k kVar = this.LIZ.LIZIZ;
        kVar.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enable34To916RatioForEffectRender : ");
        sbLIZ.append(z);
        C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
        kVar.LJJJ.LJIJJLI("Enable34To916RatioForEffectRender", z);
    }

    @Override // X.InterfaceC2254001DKc
    public final int y5(boolean z) {
        k kVar = this.LIZ.LIZIZ;
        if (z) {
            return kVar.LJJIII;
        }
        return kVar.LJJII;
    }

    @Override // X.InterfaceC2254001DKc
    public final void F4(Function1 function1, boolean z) {
        if (!this.LJIIIIZZ && this.LIZIZ.LJIIZILJ().LJII()) {
            if (this.LIZIZ.LJIIJJI()) {
                LIZIZ();
                return;
            }
            return;
        }
        this.LJIIIIZZ = false;
        if (this.LIZIZ.LJIIJJI()) {
            LIZIZ();
        }
        VERecorder vERecorder = this.LIZ;
        C1AWM c1awm = new C1AWM(function1);
        vERecorder.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopPreviewAsync, async = ");
        sbLIZ.append(z);
        C2484209oO.LJI("VERecorder", C2188811AlT.LIZIZ(sbLIZ));
        k kVar = vERecorder.LIZIZ;
        if (z) {
            kVar.LJJLI = c1awm;
        }
        kVar.LJJJJ(z);
    }

    @Override // X.InterfaceC2254001DKc
    public final float H5(boolean z, boolean z2) {
        String str;
        TERecorderInterface tERecorderInterface = this.LIZ.LIZIZ.LJJJ;
        if (z) {
            str = "recordAvgRenderFps";
        } else if (z2) {
            str = "previewAvgRenderFpsNew";
        } else {
            str = "previewAvgRenderFps";
        }
        return tERecorderInterface.LJII(str);
    }

    @Override // X.InterfaceC2254001DKc
    public final void Q4(int i, int i2) {
        h5(new AwS20S0002000_35(i, i2, 0));
    }

    @Override // X.InterfaceC2254001DKc
    public final void Q5(double d, final AwS581S0100000_2 awS581S0100000_2) {
        InterfaceC2240011Clr interfaceC2240011Clr;
        final boolean z = this.LJI;
        this.LIZ.LJJJIL((float) d, new InterfaceC2183551Acz() { // from class: X.1ANs
            @Override // X.InterfaceC2183551Acz
            public final void onDone(int i) {
                InterfaceC2240011Clr interfaceC2240011Clr2;
                awS581S0100000_2.invoke(Integer.valueOf(i));
                if (z && (interfaceC2240011Clr2 = this.LJFF) != null) {
                    interfaceC2240011Clr2.LJIILIIL();
                }
            }
        });
        if (z && (interfaceC2240011Clr = this.LJFF) != null) {
            interfaceC2240011Clr.LIZIZ();
        }
    }

    @Override // X.InterfaceC2254001DKc
    public final void S4(Function0 function0, Function1 function1) {
        C1AWM c1awm;
        C2216191BoX.LIZ.getClass();
        InterfaceC2216251Bod interfaceC2216251BodLIZIZ = ((C2208821Bce) C2216191BoX.LIZIZ()).LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEMediaController#deleteLastFrag, ");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        interfaceC2216251BodLIZIZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZ.LIZIZ.LJIIZILJ() == 3) {
            H4(new AwS242S0300000_33(this, (b) function1, (Function1<? super Integer, Unit>) function0, (Function0<Unit>) 1));
            return;
        }
        VERecorder vERecorder = this.LIZ;
        if (function1 != null) {
            c1awm = new C1AWM(function1);
        } else {
            c1awm = null;
        }
        vERecorder.LJI(c1awm);
    }

    @Override // X.InterfaceC2254001DKc
    @InterfaceC1294060jmO
    public final void X4(Cert cert, boolean z) {
        EnumC2249751D3t enumC2249751D3t;
        this.LJI = z;
        k kVar = this.LIZ.LIZIZ;
        C2254401DLq c2254401DLq = kVar.LJJJJ;
        if (z) {
            enumC2249751D3t = EnumC2249751D3t.ENABLE;
        } else {
            enumC2249751D3t = EnumC2249751D3t.DISABLE;
        }
        c2254401DLq.LJJIII = enumC2249751D3t;
        kVar.LJJJ.LJJIII("RecordMicConfig", enumC2249751D3t.ordinal());
        VEAudioCapture vEAudioCapture = kVar.LIZ;
        if (vEAudioCapture != null) {
            if (z) {
                kVar.LJIJJ();
                return;
            }
            vEAudioCapture.release(cert);
        } else if (z) {
            return;
        }
        InterfaceC2240011Clr interfaceC2240011Clr = this.LJFF;
        if (interfaceC2240011Clr != null) {
            interfaceC2240011Clr.LIZJ();
        }
        InterfaceC2240011Clr interfaceC2240011Clr2 = this.LJFF;
        if (interfaceC2240011Clr2 == null) {
            return;
        }
        interfaceC2240011Clr2.LJIILJJIL();
    }

    @Override // X.InterfaceC2254001DKc
    public final void b5(Surface surface, final Function1 function1) {
        C1DMI c1dmi;
        this.LJIIIIZZ = true;
        this.LIZ.LIZIZ.LJII = this.LIZJ;
        InterfaceC2183551Acz interfaceC2183551Acz = new InterfaceC2183551Acz() { // from class: X.1ANt
            @Override // X.InterfaceC2183551Acz
            public final void onDone(int i) {
                Function1<Integer, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Integer.valueOf(i));
                }
                Iterator<InterfaceC2183551Acz> it2 = this.LJIIJJI.iterator();
                while (it2.hasNext()) {
                    it2.next().onDone(i);
                }
            }
        };
        InterfaceC2253451DHz interfaceC2253451DHz = this.LJ;
        if (interfaceC2253451DHz != null) {
            interfaceC2253451DHz.LIZIZ("ve_recorder_start_to_surface_create");
        }
        if (this.LIZIZ.LJIIJJI()) {
            synchronized (this.LJIIL) {
                try {
                    this.LJIILJJIL = true;
                    c1dmi = this.LJIILIIL;
                    this.LJIILIIL = null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (c1dmi != null) {
                C2216191BoX.LIZ.getClass();
                ((C2208821Bce) C2216191BoX.LIZIZ()).LIZIZ().LIZ("VEMediaController: flushPendingSafeAreaBeforeStartPreview");
                this.LIZ.LJIIL().LJJI(c1dmi.LIZ, c1dmi.LIZIZ);
            }
        }
        this.LIZ.LJJJI(surface, interfaceC2183551Acz);
    }

    @Override // X.InterfaceC2254001DKc
    public final void M5(boolean z, String str, final Function1 function1) {
        if (z) {
            this.LIZ.LJ("", new InterfaceC2254571DMh() { // from class: X.0tGN
                @Override // X.InterfaceC2254571DMh
                public final void LIZ(int i, String str2, String str3) {
                    Function1<RecorderConcatResult, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(new RecorderConcatResult(i, str2, str3));
                    }
                }
            });
        } else {
            this.LIZ.LJ(str, new InterfaceC2254571DMh() { // from class: X.0tGO
                @Override // X.InterfaceC2254571DMh
                public final void LIZ(int i, String str2, String str3) {
                    Function1<RecorderConcatResult, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(new RecorderConcatResult(i, str2, str3));
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC2254001DKc
    public final void P4(String str, double d, Function1<? super Integer, Unit> function1) {
        InterfaceC2240011Clr interfaceC2240011Clr;
        boolean z = this.LJI;
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C2178491ANr(this, str, d, function1, z, null), 2);
        if (z && (interfaceC2240011Clr = this.LJFF) != null) {
            interfaceC2240011Clr.LIZIZ();
        }
    }

    @Override // X.InterfaceC2254001DKc
    public final void p5(List list, final int i, C1DLD c1dld) {
        VERecorder vERecorder = this.LIZ;
        final ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (ASMediaSegment aSMediaSegment : (ArrayList) list) {
            final long j = aSMediaSegment.duration;
            final double d = aSMediaSegment.speed;
            arrayList.add(new C2254541DMe(d, j) { // from class: X.1DMd
            });
        }
        final k kVar = vERecorder.LIZIZ;
        kVar.LJJLIIIIJ = c1dld;
        kVar.LJJLIIJ.execute(new Runnable() { // from class: X.1DLo
            public final /* synthetic */ String LLILLJJLI = null;
            public final /* synthetic */ int LLILZ = 2;
            public final /* synthetic */ int LLILZIL = 0;

            /* JADX WARN: Multi-variable type inference failed */
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
            public final void LIZ() {
                k kVar2 = kVar;
                List list2 = arrayList;
                kVar2.LJJIIZI(this.LLILZ, i, 2147483647L, this.LLILZIL, this.LLILLJJLI);
                int size = list2.size();
                String[] strArr = new String[size];
                int[] iArr = new int[size];
                int[] iArr2 = new int[size];
                double[] dArr = new double[size];
                for (int i2 = 0; i2 < size; i2++) {
                    if (kVar2.LJJJJ.LIZLLL.isEmpty() || kVar2.LJJJJ.LJ.isEmpty()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(kVar2.LJJJJ.LIZ);
                        sbLIZ.append("/");
                        sbLIZ.append(i2);
                        sbLIZ.append("_frag_v");
                        strArr[i2] = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        strArr[i2] = ((LinkedList) kVar2.LJJJJ.LIZLLL).poll();
                    }
                    iArr[i2] = 0;
                    iArr2[i2] = (int) ((C2254541DMe) ListProtector.get(list2, i2)).LIZ;
                    dArr[i2] = ((C2254541DMe) ListProtector.get(list2, i2)).LIZIZ;
                }
                TEBundle tEBundleObtain = TEBundle.obtain();
                tEBundleObtain.setStringArray("Paths", strArr);
                tEBundleObtain.setIntArray("TrimIns", iArr);
                tEBundleObtain.setIntArray("TrimOuts", iArr2);
                tEBundleObtain.setDoubleArray("Speeds", dArr);
                tEBundleObtain.setInt("TrackType", 0);
                kVar2.LJJJ.LJIL("FillRecordedClips", tEBundleObtain);
                String[] strArr2 = new String[size];
                for (int i3 = 0; i3 < size; i3++) {
                    if (kVar2.LJJJJ.LIZLLL.isEmpty() || kVar2.LJJJJ.LJ.isEmpty()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(kVar2.LJJJJ.LIZ);
                        sbLIZ2.append("/");
                        sbLIZ2.append(i3);
                        sbLIZ2.append("_frag_a");
                        strArr2[i3] = C2188811AlT.LIZIZ(sbLIZ2);
                    } else {
                        strArr2[i3] = ((LinkedList) kVar2.LJJJJ.LJ).poll();
                    }
                }
                TEBundle tEBundleObtain2 = TEBundle.obtain();
                tEBundleObtain2.setStringArray("Paths", strArr2);
                tEBundleObtain2.setIntArray("TrimIns", iArr);
                tEBundleObtain2.setIntArray("TrimOuts", iArr2);
                tEBundleObtain2.setDoubleArray("Speeds", dArr);
                tEBundleObtain2.setInt("TrackType", 1);
                kVar2.LJJJ.LJIL("FillRecordedClips", tEBundleObtain2);
                int iLJJJ = kVar2.LJJJ.LJJJ();
                synchronized (kVar2.LJL) {
                    try {
                        C1DMH c1dmh = kVar2.LJJZZIII;
                        if (c1dmh != null) {
                            c1dmh.LIZLLL();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                InterfaceC2183551Acz interfaceC2183551Acz = kVar.LJJLIIIIJ;
                if (interfaceC2183551Acz != null) {
                    interfaceC2183551Acz.onDone(iLJJJ);
                    kVar.LJJLIIIIJ = null;
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TERecorder@aadd.tryRestoreAsync$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TERecorder@aadd.tryRestoreAsync$1");
            }
        });
    }

    @Override // X.InterfaceC2254001DKc
    public final void n4(String str, final int i, final int i2, Function1 function1) {
        VERecorder vERecorder = this.LIZ;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        final C1AO1 c1ao1 = new C1AO1(function1);
        vERecorder.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        vERecorder.LIZIZ.LJJIJLIJ(str, i, i2, false, true, compressFormat, new InterfaceC2178571ANz() { // from class: X.1AO0
            public final /* synthetic */ boolean LIZJ = false;
            public final /* synthetic */ boolean LIZLLL = true;

            @Override // X.InterfaceC2178571ANz
            public final void LIZ(int i3) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    String str2 = "vesdk_event_recorder_shot_screen";
                    jSONObject.put("width", i);
                    jSONObject.put("height", i2);
                    jSONObject.put("resultCode", i3);
                    if (this.LIZJ) {
                        str2 = "vesdk_event_recorder_take_picture";
                    }
                    jSONObject.put("is_effect", this.LIZLLL);
                    jSONObject.put("duration", System.currentTimeMillis() - jCurrentTimeMillis);
                    b.LIZIZ(str2, "business", jSONObject, true);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                c1ao1.LIZ(i3);
            }
        });
    }

    public b(VERecorder vERecorder, C1DKV c1dkv, VECameraSettings vECameraSettings, VECameraController vECameraController, InterfaceC2253451DHz interfaceC2253451DHz) {
        this.LIZ = vERecorder;
        this.LIZIZ = c1dkv;
        this.LIZJ = vECameraSettings;
        this.LIZLLL = vECameraController;
        this.LJ = interfaceC2253451DHz;
    }

    @Override // X.InterfaceC2254001DKc
    public final void F0(String str, int i, int i2, boolean z, Bitmap.CompressFormat compressFormat, Function1<? super Integer, Unit> function1, boolean z2) {
        C1643440sru c1643440sru = new C1643440sru();
        c1643440sru.LIZ.LIZJ = str;
        VESize vESize = new VESize(i, i2);
        C1AO5 c1ao5 = c1643440sru.LIZ;
        c1ao5.LIZ = vESize;
        c1ao5.LIZIZ = z;
        c1ao5.LJ = compressFormat;
        c1ao5.LJII = new C1AO1(function1);
        c1ao5.LJFF = z2;
        this.LIZ.LJJIJIIJIL(c1ao5);
    }

    @Override // X.InterfaceC2254001DKc
    public final void G4(String str, long j, long j2, boolean z, boolean z2, boolean z3, int i, long j3) {
        int i2;
        int i3 = i;
        long j4 = j3;
        Iterator it2 = ((ArrayList) this.LJIIJ).iterator();
        while (it2.hasNext()) {
            ((C1DLS) it2.next()).LIZIZ(z2);
        }
        C2216191BoX.LIZ.getClass();
        InterfaceC2216251Bod interfaceC2216251BodLIZIZ = ((C2208821Bce) C2216191BoX.LIZIZ()).LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syz setMusicTime-->bgmPaths:");
        sbLIZ.append(str);
        sbLIZ.append(" musicStartTime:");
        sbLIZ.append(j);
        sbLIZ.append(" musicEndTime:");
        sbLIZ.append(j4);
        sbLIZ.append(" recordTime:");
        sbLIZ.append(j2);
        sbLIZ.append(" isLoopSwitchOn:");
        sbLIZ.append(z);
        sbLIZ.append(" isRecordPrepare:");
        sbLIZ.append(z2);
        sbLIZ.append(" shouldUnbindBgmState:");
        sbLIZ.append(z3);
        sbLIZ.append(" maxLoopDuration:");
        sbLIZ.append(i3);
        interfaceC2216251BodLIZIZ.uu(C2188811AlT.LIZIZ(sbLIZ));
        if (z3) {
            i2 = 3;
        } else if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        if (!this.LIZLLL.LLLIZZ.invoke().booleanValue() || j4 <= 0 || j4 <= j) {
            j4 = -1;
        }
        if (!this.LIZLLL.LLLJ.invoke().booleanValue()) {
            i3 = -1;
        }
        InterfaceC2216251Bod interfaceC2216251BodLIZIZ2 = ((C2208821Bce) C2216191BoX.LIZIZ()).LIZIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("syz setMusicTime-->realMusicEndTime:");
        sbLIZ2.append(j4);
        sbLIZ2.append(" realMaxLoopDuration:");
        sbLIZ2.append(i3);
        sbLIZ2.append(" bgmType:");
        sbLIZ2.append(i2);
        interfaceC2216251BodLIZIZ2.uu(C2188811AlT.LIZIZ(sbLIZ2));
        this.LIZ.LJJIIZI((int) j, (int) j4, i2, i3, str);
        Iterator it3 = ((ArrayList) this.LJIIJ).iterator();
        while (it3.hasNext()) {
            ((C1DLS) it3.next()).LIZ(z2);
        }
    }
}
