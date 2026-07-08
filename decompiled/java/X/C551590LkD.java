package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.ies.nle.editor_jni.INLEExporter;
import com.bytedance.ies.nle.editor_jni.INLEListenerCompile;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEMediaABConfig;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLEVEGlobalConfig;
import com.bytedance.ies.nle.editor_jni.NLEVideoCompileEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLEVideoEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLE_COMPILE_TYPE;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.experiment.AigcArchFixPostProcessingWithKeyframes;
import com.ss.android.ugc.aweme.aigc.graph.nodes.node.I2VOfflineProcessingPostProcessingConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.vesdk.VEUtils;
import com.ss.ugc.android.editor.core.api.params.Resolution;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0LkD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC553000LmU(artifacts = {C552510Llh.class})
@InterfaceC552990LmT(artifacts = {C552480Lle.class, C552650Llv.class, C552630Llt.class, C552620Lls.class})
public final class C551590LkD implements InterfaceC552790Lm9<InterfaceC551900Lki<I2VOfflineProcessingPostProcessingConfig>, I2VOfflineProcessingPostProcessingConfig, C551680LkM, C1177604j8> {
    public final String LIZ = "I2VOfflineProcessingPostProcessingNode";
    public final String LIZIZ = "postprocess";
    public final C552160Ll8 LIZJ = C552160Ll8.LIZ;
    public final C551670LkL LIZLLL = C551670LkL.LIZ;

    @Override // X.InterfaceC552790Lm9
    public final InterfaceC551240Lje<C551680LkM> LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC552790Lm9
    public final String LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC552790Lm9
    public final InterfaceC552870LmH<C1177604j8> LJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC552790Lm9
    public final String getNodeName() {
        return this.LIZ;
    }

    public static C0E4S LJIIJ(String str) {
        return new C0E4S(str, NLEResType.IMAGE, 0L, 1.0f, 0L, 0L, UUID.randomUUID().toString(), null, 128);
    }

    public static final Object LJI(String str, InterfaceC1364105Vn<? super NLETemplateModel> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        ITemplateResourceService iTemplateResourceService = (ITemplateResourceService) PluggableExtentionKt.pluggableSpi$default(ITemplateResourceService.class, false, false, false, 14, null);
        if (iTemplateResourceService == null) {
            C2243608qg.LIZIZ(EnumC551600LkE.toException$default(EnumC551600LkE.POSTPROC_NULL_TEMPLATE_SERVICE, null, null, null, null, null, 31, null), c23260099m);
        } else {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            EnumC1412640mre enumC1412640mre = EnumC1412640mre.PUGC_TEMPLATE;
            BinderC532620Kui binderC532620Kui = new BinderC532620Kui("NleI2VPostProcessing", str, 5);
            EnumC539100LCi enumC539100LCiLIZ = C0LBC.LIZ(5);
            C1429050nI7.LIZ.getClass();
            iTemplateResourceService.LIZLLL(contextLIZ, str, enumC1412640mre, null, null, null, false, new C573920Mf8(binderC532620Kui, enumC539100LCiLIZ, false, 2, C1429050nI7.LIZ()), null, new C1418100n0S("", "", null, "", "", ""), true, new C0L7K() { // from class: X.0LkK
                @Override // X.C0L7K
                public final void LJ(String str2, String str3, boolean z) {
                }

                @Override // X.C0L7K
                public final void LJFF(C0L7F c0l7f, boolean z) {
                }

                @Override // X.C0L7K
                public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                }

                @Override // X.C0L7K
                public final void LIZLLL(C0L7B c0l7b, boolean z) {
                    NLETemplateModel nLETemplateModel;
                    if (c0l7b != null && (nLETemplateModel = c0l7b.LIZ) != null) {
                        C2243608qg.LIZ(nLETemplateModel, c23260099m);
                    } else {
                        C2243608qg.LIZIZ(EnumC551600LkE.toException$default(EnumC551600LkE.POSTPROC_NULL_TEMPLATE_MODEL, null, null, null, null, null, 31, null), c23260099m);
                    }
                }

                @Override // X.C0L7K
                public final void LIZJ(int i, String str2, boolean z) {
                    C2243608qg.LIZIZ(EnumC551600LkE.toException$default(EnumC551600LkE.POSTPROC_TEMPLATE_DOWNLOAD_FAILED, null, Integer.valueOf(i), str2, Integer.valueOf(i), null, 17, null), c23260099m);
                }
            });
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public static String LJII(String str, String str2) {
        if (!u.LJIIZILJ(str, "/", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('/');
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        String str3 = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("file_");
        sbLIZ2.append(str3);
        sbLIZ2.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static C0E4S LJIILIIL(long j, String str) {
        return new C0E4S(str, NLEResType.VIDEO, j, 1.0f, 0L, j, UUID.randomUUID().toString(), null, 128);
    }

    public static Object LJFF(String str, NLEEditor nLEEditor, C551640LkI c551640LkI) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c551640LkI));
        final String strLJII = LJII(str, ".mp4");
        NLEMediaConfig nLEMediaConfig = new NLEMediaConfig();
        if (AigcArchFixPostProcessingWithKeyframes.isEnabled()) {
            nLEMediaConfig.setNleMediaAbConfig(new NLEMediaABConfig());
            NLEVEGlobalConfig nLEVEGlobalConfig = new NLEVEGlobalConfig();
            nLEVEGlobalConfig.addConfig("EnableEditorFpsLog", true);
            nLEVEGlobalConfig.addConfig("ve_enable_render_encode_resolution_align4", true);
            nLEMediaConfig.setNleVEGlobalConfig(nLEVEGlobalConfig);
        }
        C1463860oCG c1463860oCGLIZ = C0F9X.LIZ(nLEMediaConfig, null, nLEEditor, 8);
        c1463860oCGLIZ.setDataSource(nLEEditor.getModel());
        Resolution resolution = new Resolution(720, 0.5625f);
        INLEExporter exporterApi = c1463860oCGLIZ.getExporterApi();
        NLEVideoEncodeSettings nLEVideoEncodeSettings = new NLEVideoEncodeSettings();
        nLEVideoEncodeSettings.setCompileType(NLE_COMPILE_TYPE.COMPILE_TYPE_MP4);
        nLEVideoEncodeSettings.setFps(30);
        nLEVideoEncodeSettings.setSwCRF(15);
        nLEVideoEncodeSettings.setOutputSize(new PairIntInt(resolution.getWidth(), resolution.getHeight()));
        nLEVideoEncodeSettings.setIsSupportHWEncoder(true);
        NLEVideoCompileEncodeSettings nLEVideoCompileEncodeSettings = new NLEVideoCompileEncodeSettings();
        nLEVideoCompileEncodeSettings.setUseHWEncoder(true);
        nLEVideoCompileEncodeSettings.setIsSupportHWEncoder(true);
        nLEVideoEncodeSettings.setMVideoCompileEncodeSetting(nLEVideoCompileEncodeSettings);
        ((C1463840oCE) exporterApi).compile(strLJII, nLEVideoEncodeSettings, new INLEListenerCompile() { // from class: X.0LkO
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
            public final void onCompileProgress(float f) {
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
            public final void onCompileDone() {
                C2243608qg.LIZ(strLJII, c23260099m);
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
            public final void onCompileError(int i, int i2, float f, String str2) {
                C2243608qg.LIZIZ(EnumC551600LkE.toException$default(EnumC551600LkE.POSTPROC_NLE_COMPILE_ERROR, null, Integer.valueOf(i), str2, Integer.valueOf(i), null, 17, null), c23260099m);
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c551640LkI);
        }
        return objLIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016e A[RETURN] */
    @Override // X.InterfaceC552820LmC
    /* JADX INFO: renamed from: LJIIL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC551900Lki<com.ss.android.ugc.aweme.aigc.graph.nodes.node.I2VOfflineProcessingPostProcessingConfig> r23, X.C551680LkM r24, X.InterfaceC1364105Vn<? super X.C1177604j8> r25) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C551590LkD.LIZIZ(X.0Lki, X.0LkM, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(java.lang.String r11, com.bytedance.ies.nle.editor_jni.NLETemplateModel r12, java.util.List r13, com.bytedance.ies.nle.editor_jni.NLEEditor r14) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C551590LkD.LJIIJJI(java.lang.String, com.bytedance.ies.nle.editor_jni.NLETemplateModel, java.util.List, com.bytedance.ies.nle.editor_jni.NLEEditor):void");
    }

    @Override // X.InterfaceC552790Lm9
    public final /* bridge */ /* synthetic */ Object LIZJ(InterfaceC551900Lki interfaceC551900Lki, Object obj, Map map, C552910LmL c552910LmL) {
        return null;
    }

    public final Object LJIIIZ(int i, String str, final String str2, C551650LkJ c551650LkJ) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c551650LkJ));
        VEUtils.getVideoThumb(str, i, new InterfaceC1286300jZs() { // from class: X.0LkF
            @Override // X.InterfaceC1286300jZs
            public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
                boolean z = false;
                if (byteBuffer == null) {
                    C2243608qg.LIZIZ(EnumC551600LkE.toException$default(EnumC551600LkE.POSTPROC_FRAME_EXTRACTION_FAILED, null, null, null, null, null, 31, null), c23260099m);
                    return false;
                }
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                    C551590LkD c551590LkD = this;
                    String str3 = str2;
                    c551590LkD.getClass();
                    String strLJII = C551590LkD.LJII(str3, ".jpeg");
                    C2475009mu.LJFF(100, Bitmap.CompressFormat.JPEG, bitmapCreateBitmap, new C0VSJ(strLJII));
                    C2243608qg.LIZ(strLJII, c23260099m);
                    z = true;
                    return true;
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2243608qg.LIZIZ(EnumC551600LkE.toException$default(EnumC551600LkE.POSTPROC_FRAME_EXTRACTION_FAILED, e, null, null, null, null, 30, null), c23260099m);
                    return z;
                }
            }
        }, true, 80, 40, 0L, 0);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c551650LkJ);
        }
        return objLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, X.InterfaceC1364105Vn<? super java.util.List<X.C0E4S>> r15) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C551590LkD.LJIIIIZZ(int, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
