package X;

import Y.AObjectS246S0100000_25;
import Y.AObserverS227S0100000_25;
import Y.AfS194S0100000_25;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.creative.model.record.RecordDowngradeModel;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.setting.performance.videoquality.StickerPreviewResolutionConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VESize;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.text.a0;
import mn3.e0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sPF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1625670sPF implements InterfaceC1622080sJS {
    public final e0 LL;
    public final Function0<VEDisplaySettings> LLILLJJLI;
    public final InterfaceC1624480sNK LLILLL;
    public final ShortVideoContext LLILZ;
    public final Function1<VEDisplaySettings, Unit> LLILZIL;
    public final Function2<Integer, Integer, Unit> LLILZLL;
    public final Function1<Float, Unit> LLIZ;
    public final Function0<Boolean> LLIZLLLIL;
    public InterfaceC1623190sLF LLJIJIL;
    public AwS426S0200000_25 LLJILJILJ;
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(404));
    public String LLJI = "";
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 764));
    public final HashSet<String> LLJILLL = new HashSet<>();

    public final StickerPreviewResolutionConfig LIZIZ() {
        return (StickerPreviewResolutionConfig) this.LLJ.getValue();
    }

    public final C1625700sPI LIZLLL() {
        return (C1625700sPI) this.LLJILJIL.getValue();
    }

    public final void LJFF() {
        C11NZ<EnumC1159860gHw> c11nzLi;
        InterfaceC1623190sLF interfaceC1623190sLF = this.LLJIJIL;
        if (interfaceC1623190sLF != null) {
            interfaceC1623190sLF.wk(new AObserverS227S0100000_25(this, 89));
        }
        InterfaceC1623190sLF interfaceC1623190sLF2 = this.LLJIJIL;
        if (interfaceC1623190sLF2 == null || (c11nzLi = interfaceC1623190sLF2.li()) == null) {
            return;
        }
        c11nzLi.LJJLJLI(new AfS194S0100000_25(this, 127));
    }

    public final boolean LJIIJJI() {
        if (this.LLILZ.cameraComponentModel.isRetakeMode) {
            LJII("sticker canceled already record clips do nothing, isRetake:true");
            return false;
        }
        if ((!r1.LJI().isEmpty()) && this.LLILZ.LJII() > 0) {
            if (LIZJ()) {
                C1441190nbh c1441190nbhLJI = this.LLILZ.LJI();
                if (!(c1441190nbhLJI instanceof Collection) || !c1441190nbhLJI.isEmpty()) {
                    Iterator<TimeSpeedModelExtension> it2 = c1441190nbhLJI.iterator();
                    while (it2.hasNext()) {
                        if (LJI(it2.next())) {
                        }
                    }
                }
            }
            LJII("sticker canceled already record clips do nothing, isRetake:false");
            return false;
        }
        return !C539900LFk.LJI(this.LLILZ);
    }

    public final void LJIILIIL() {
        String str;
        int[] videoSize;
        String str2 = this.LLJI;
        Effect effectLLILIL = this.LLILLL.LLILIL();
        if (LJ(str2, effectLLILIL != null ? effectLLILIL.getEffect_id() : null) || !(!this.LLILZ.LJI().isEmpty()) || this.LLILZ.LJII() <= 0 || (str = this.LLILZ.creativeModel.recordDowngradeModel.resolution) == null || a0.LJJJIL(str) || (videoSize = AVSettingsWrapper.getVideoSize(this.LLILZ.creativeModel.recordDowngradeModel.resolution)) == null) {
            return;
        }
        int[] recordVideoSize = AVSettingsWrapper.getRecordVideoSize();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("backToRecord updateDowngradeResolutionIfNeeded size: ");
        sbLIZ.append(Arrays.toString(videoSize));
        sbLIZ.append(", origin_size: ");
        sbLIZ.append(Arrays.toString(recordVideoSize));
        LJII(C2188811AlT.LIZIZ(sbLIZ));
        VESize vESize = new VESize(videoSize[0], videoSize[1]);
        Float f = this.LLILZ.creativeModel.recordDowngradeModel.bitrate;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("backToRecord updateDowngradeResolutionIfNeeded bitrate: ");
        sbLIZ2.append(f);
        LJII(C2188811AlT.LIZIZ(sbLIZ2));
        LJIILJJIL(vESize, false);
        LJIIL(f);
    }

    public final boolean LIZJ() {
        StickerPreviewResolutionConfig stickerPreviewResolutionConfigLIZIZ;
        StickerPreviewResolutionConfig stickerPreviewResolutionConfigLIZIZ2 = LIZIZ();
        return stickerPreviewResolutionConfigLIZIZ2 != null && stickerPreviewResolutionConfigLIZIZ2.enable && (stickerPreviewResolutionConfigLIZIZ = LIZIZ()) != null && stickerPreviewResolutionConfigLIZIZ.enableDowngradeMultiSegments;
    }

    public final void LJIIJ() {
        if (LJIIJJI()) {
            int[] iArrLIZJ = LIZLLL().LIZJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sticker canceled render&output resolution back to:");
            sbLIZ.append(Arrays.toString(iArrLIZJ));
            LJII(C2188811AlT.LIZIZ(sbLIZ));
            VESize vESize = new VESize(iArrLIZJ[0], iArrLIZJ[1]);
            LJIILJJIL(vESize, false);
            LIZLLL().getClass();
            float fLIZIZ = C1625700sPI.LIZIZ(vESize);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sticker canceled render&output bitrate back to:");
            sbLIZ2.append(fLIZIZ);
            LJII(C2188811AlT.LIZIZ(sbLIZ2));
            LJIIL(Float.valueOf(fLIZIZ));
            RecordDowngradeModel recordDowngradeModel = this.LLILZ.creativeModel.recordDowngradeModel;
            recordDowngradeModel.resolution = null;
            recordDowngradeModel.bitrate = null;
            recordDowngradeModel.downgradeLevels = 0;
            recordDowngradeModel.downgradeInputFlags = 0;
        }
    }

    @Override // X.InterfaceC1622080sJS
    public final int getPriority() {
        return C1623350sLV.LIZ();
    }

    public static final void LJII(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downgrade_sticker_preview_resolution_tag ");
        sbLIZ.append(str);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean LJI(TimeSpeedModelExtension timeSpeedModelExtension) {
        if (InterfaceC1625730sPL.LJIILIIL.enableUseDynamicEffectLabel()) {
            if (timeSpeedModelExtension != null && timeSpeedModelExtension.isEnable() && C123100dR.LIZ(timeSpeedModelExtension.getStickerId()) && this.LLJILLL.contains(timeSpeedModelExtension.getStickerId())) {
                return true;
            }
            return false;
        }
        if (timeSpeedModelExtension != null && timeSpeedModelExtension.isEnable() && C123100dR.LIZ(timeSpeedModelExtension.getStickerId())) {
            return true;
        }
        return false;
    }

    public final void LJIIIIZZ(Effect effect) {
        String effect_id;
        StickerPreviewResolutionConfig stickerPreviewResolutionConfigLIZIZ = LIZIZ();
        if (stickerPreviewResolutionConfigLIZIZ != null && stickerPreviewResolutionConfigLIZIZ.enable && C13LQ.LJJIJIIJI(Integer.valueOf(this.LLILZ.shootMode), new Integer[]{16}) < 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("modifyStickerChosen sticker:");
            String effect_id2 = null;
            if (effect != null) {
                effect_id = effect.getEffect_id();
            } else {
                effect_id = null;
            }
            sbLIZ.append(effect_id);
            LJII(C2188811AlT.LIZIZ(sbLIZ));
            if (effect != null && (!a0.LJJJIL(effect.getEffect_id()))) {
                int i = 0;
                LJIIIZ(new C1627370sRz(effect, i, EnumC1448980noG.RECOVER, null, i, 96));
                return;
            }
            C1627360sRy c1627360sRy = new C1627360sRy(0, null, EnumC1448980noG.RECOVER, null, false);
            String str = this.LLJI;
            Effect effectLIZ = c1627360sRy.LIZ();
            if (effectLIZ != null) {
                effect_id2 = effectLIZ.getEffect_id();
            }
            if (LJ(str, effect_id2)) {
                return;
            }
            LJIIJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e A[PHI: r3
      0x007e: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v6 int) binds: [B:29:0x0072, B:31:0x0078, B:33:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(X.AbstractC1627380sS0 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1625670sPF.LJIIIZ(X.0sS0):void");
    }

    public final void LJIIL(Float f) {
        if (f != null) {
            float fFloatValue = f.floatValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("-> update bitrate: ");
            sbLIZ.append(fFloatValue);
            LJII(C2188811AlT.LIZIZ(sbLIZ));
            this.LLIZ.invoke(Float.valueOf(fFloatValue));
        }
    }

    public final Boolean LIZ(Map<String, Double> map, n nVar) {
        Object c098200Yq;
        Object c098200Yq2;
        if (nVar == null) {
            return null;
        }
        try {
            c098200Yq = new JSONObject(nVar.toString());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        JSONObject jSONObject = (JSONObject) c098200Yq;
        if (jSONObject == null) {
            return null;
        }
        C08LV.LIZ.getClass();
        try {
            c098200Yq2 = Boolean.valueOf(C08LV.LIZ(jSONObject, map));
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        if (thM5exceptionOrNullimpl != null) {
            C08LV c08lv = C08LV.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("evaluation error: ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c08lv.getClass();
            C08LV.LIZIZ(strLIZIZ);
            c098200Yq2 = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) c098200Yq2).booleanValue();
        LJII("condition eval: result=" + zBooleanValue);
        return Boolean.valueOf(zBooleanValue);
    }

    public final boolean LJ(String str, String str2) {
        boolean z;
        List<String> list;
        List<String> list2;
        StickerPreviewResolutionConfig stickerPreviewResolutionConfigLIZIZ = LIZIZ();
        if (stickerPreviewResolutionConfigLIZIZ != null && stickerPreviewResolutionConfigLIZIZ.enable) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sticker:");
            sbLIZ.append(str2);
            sbLIZ.append(" resolution downgrade experiment not open");
            LJII(C2188811AlT.LIZIZ(sbLIZ));
            return true;
        }
        StickerPreviewResolutionConfig stickerPreviewResolutionConfigLIZIZ2 = LIZIZ();
        if (stickerPreviewResolutionConfigLIZIZ2 != null && (list2 = stickerPreviewResolutionConfigLIZIZ2.blockCategories) != null && C13LP.LJJJJ(str, list2)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sticker:");
            sbLIZ2.append(str2);
            sbLIZ2.append(" category:");
            sbLIZ2.append(str);
            sbLIZ2.append(" resolution downgrade block by category");
            LJII(C2188811AlT.LIZIZ(sbLIZ2));
            return true;
        }
        StickerPreviewResolutionConfig stickerPreviewResolutionConfigLIZIZ3 = LIZIZ();
        if (stickerPreviewResolutionConfigLIZIZ3 != null && (list = stickerPreviewResolutionConfigLIZIZ3.blockEffects) != null && C13LP.LJJJJ(str2, list)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("sticker:");
            sbLIZ3.append(str2);
            sbLIZ3.append(" resolution downgrade block by effect id");
            LJII(C2188811AlT.LIZIZ(sbLIZ3));
            return true;
        }
        if (!C539900LFk.LJI(this.LLILZ)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(com.ss.android.vesdk.VESize r5, boolean r6) {
        /*
            r4 = this;
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "live_tab_camera_fit_mode_fix_setting"
            r1 = 1
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r1)
            r2 = 0
            if (r0 == 0) goto L56
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r4.LLIZLLLIL
            if (r0 == 0) goto L40
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r1) goto L40
        L21:
            kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, kotlin.Unit> r3 = r4.LLILZLL
            int r0 = r5.width
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r5.height
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.invoke(r1, r0)
            r4.LLJILJILJ = r2
            if (r6 == 0) goto L77
            kotlin.jvm.internal.AwS426S0200000_25 r1 = new kotlin.jvm.internal.AwS426S0200000_25
            r0 = 114(0x72, float:1.6E-43)
            r1.<init>(r4, r5, r0)
            r4.LLJILJILJ = r1
            return
        L40:
            com.ss.android.vesdk.VEDisplaySettings$Builder r1 = new com.ss.android.vesdk.VEDisplaySettings$Builder
            kotlin.jvm.functions.Function0<com.ss.android.vesdk.VEDisplaySettings> r0 = r4.LLILLJJLI
            java.lang.Object r0 = r0.invoke()
            com.ss.android.vesdk.VEDisplaySettings r0 = (com.ss.android.vesdk.VEDisplaySettings) r0
            r1.<init>(r0)
            r1.setRenderSize(r5)
            X.0wOI r0 = X.EnumC1778840wOI.SCALE_MODE_CENTER_INSIDE
            r1.setFitMode(r0)
            goto L6b
        L56:
            com.ss.android.vesdk.VEDisplaySettings$Builder r1 = new com.ss.android.vesdk.VEDisplaySettings$Builder
            kotlin.jvm.functions.Function0<com.ss.android.vesdk.VEDisplaySettings> r0 = r4.LLILLJJLI
            java.lang.Object r0 = r0.invoke()
            com.ss.android.vesdk.VEDisplaySettings r0 = (com.ss.android.vesdk.VEDisplaySettings) r0
            r1.<init>(r0)
            r1.setRenderSize(r5)
            X.0wOI r0 = X.EnumC1778840wOI.SCALE_MODE_CENTER_INSIDE
            r1.setFitMode(r0)
        L6b:
            com.ss.android.vesdk.VEDisplaySettings r1 = r1.build()
            if (r1 == 0) goto L21
            kotlin.jvm.functions.Function1<com.ss.android.vesdk.VEDisplaySettings, kotlin.Unit> r0 = r4.LLILZIL
            r0.invoke(r1)
            goto L21
        L77:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r4.LLILZ
            int r0 = r5.width
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r1 = r1.cameraComponentModel
            r1.mVideoWidth = r0
            int r0 = r5.height
            r1.mVideoHeight = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1625670sPF.LJIILJJIL(com.ss.android.vesdk.VESize, boolean):void");
    }

    @Override // X.InterfaceC1622080sJS
    public final C1623370sLX LJIILL(InterfaceC1622070sJR interfaceC1622070sJR, AbstractC1627380sS0 abstractC1627380sS0) throws Throwable {
        String effect_id;
        StickerPreviewResolutionConfig stickerPreviewResolutionConfigLIZIZ = LIZIZ();
        if (stickerPreviewResolutionConfigLIZIZ != null && stickerPreviewResolutionConfigLIZIZ.enable && C13LQ.LJJIJIIJI(Integer.valueOf(this.LLILZ.shootMode), new Integer[]{16}) < 0) {
            if (abstractC1627380sS0 instanceof C1627370sRz) {
                LJIIIZ(abstractC1627380sS0);
            } else if (abstractC1627380sS0 instanceof C1627360sRy) {
                String str = this.LLJI;
                Effect effectLIZ = abstractC1627380sS0.LIZ();
                if (effectLIZ != null) {
                    effect_id = effectLIZ.getEffect_id();
                } else {
                    effect_id = null;
                }
                if (!LJ(str, effect_id)) {
                    LJIIJ();
                }
            }
            return interfaceC1622070sJR.LIZ(abstractC1627380sS0);
        }
        return interfaceC1622070sJR.LIZ(abstractC1627380sS0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1625670sPF(InterfaceC1623190sLF interfaceC1623190sLF, LifecycleOwner lifecycleOwner, InterfaceC1648570t0B interfaceC1648570t0B, e0 e0Var, Function0<? extends VEDisplaySettings> function0, InterfaceC1624480sNK interfaceC1624480sNK, ShortVideoContext shortVideoContext, Function1<? super VEDisplaySettings, Unit> function1, Function2<? super Integer, ? super Integer, Unit> function2, Function1<? super Float, Unit> function12, Function0<Boolean> function02) {
        this.LL = e0Var;
        this.LLILLJJLI = function0;
        this.LLILLL = interfaceC1624480sNK;
        this.LLILZ = shortVideoContext;
        this.LLILZIL = function1;
        this.LLILZLL = function2;
        this.LLIZ = function12;
        this.LLIZLLLIL = function02;
        if (interfaceC1623190sLF != null) {
            this.LLJIJIL = interfaceC1623190sLF;
            LJFF();
        }
        interfaceC1648570t0B.zx2().LIZ(lifecycleOwner, new AObjectS246S0100000_25(this, 686));
        interfaceC1648570t0B.yM2().LIZ(lifecycleOwner, new AObjectS246S0100000_25(this, 687));
        interfaceC1648570t0B.cJ0().LIZ(lifecycleOwner, new AObjectS246S0100000_25(this, 688));
        interfaceC1648570t0B.tQ0().LIZ(lifecycleOwner, new AObjectS246S0100000_25(this, 689));
        interfaceC1648570t0B.Ia0().LIZ(lifecycleOwner, new AObjectS246S0100000_25(this, 690));
    }
}
