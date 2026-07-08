package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lt3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.cut_ui_impl.newplayer.CutPlayerActivity$launchCompile$1$2", f = "CutPlayerActivity.kt", l = {}, m = "invokeSuspend")
public final class C557070Lt3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractActivityC559670LxF LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C557070Lt3(AbstractActivityC559670LxF abstractActivityC559670LxF, C259800zU<String> c259800zU, InterfaceC1364105Vn<? super C557070Lt3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractActivityC559670LxF;
        this.LLILLJJLI = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C557070Lt3(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "CutPlayerActivity@2b06.launchCompile$1$2"
            X.C1C7U.LIZ(r6)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r8)
            X.0LxF r0 = r7.LL
            com.bytedance.ies.nle.editor_jni.INLEPlayer r0 = r0.LLILZLL
            if (r0 == 0) goto L18
            int r0 = r0.pause()
            X.C2286608xc.LJ(r0)
        L18:
            com.bytedance.ies.nle.editor_jni.NLEVideoEncodeSettings r5 = new com.bytedance.ies.nle.editor_jni.NLEVideoEncodeSettings
            r5.<init>()
            r0 = 30
            r5.setFps(r0)
            r0 = 8912896(0x880000, float:1.2489627E-38)
            r5.setBps(r0)
            r0 = 0
            r5.setIsSupportHWEncoder(r0)
            r0 = 35
            r5.setGopSize(r0)
            java.lang.String r0 = "{\"compile\": {\"encode_mode\": \"hw\",\"hw\": {\"bitrate\": 6000000,\"profile\": \"unknown\",\"hp_bitrate_ratio\": \"0.8\",\"sd_bitrate_ratio\": \"0.9\",\"h_fps_bitrate_ratio\": \"1.4\",\"gop\": -1},\"sw\": {\"crf\": 17,\"preset\": 0,\"profile\": \"unknown\",\"maxrate\": 15000000,\"gop\": 35,\"qpoffset\":0.0}},\"watermark_compile\": {\"encode_mode\": \"hw\",\"hw\": {\"bitrate\": 9000000,\"profile\": \"unknown\",\"hp_bitrate_ratio\": \"0.8\",\"full_hd_bitrate_ratio\":1.33,\"gop\": -1},\"sw\": {\"crf\": 17,\"preset\": 0,\"profile\": \"unknown\",\"maxrate\": 15000000,\"gop\": 35,\"qpoffset\":0.0}}}"
            r5.setExternalSettingsJsonStr(r0)
            r0 = 4
            r5.setResizeMode(r0)
            boolean r0 = r5.getIsSupportHWEncoder()
            if (r0 != 0) goto L44
            r0 = 15
            r5.setSwCRF(r0)
        L44:
            com.bytedance.ies.nle.editor_jni.PairIntInt r4 = new com.bytedance.ies.nle.editor_jni.PairIntInt
            r0 = 720(0x2d0, double:3.557E-321)
            int r3 = (int) r0
            r1 = 1280(0x500, double:6.324E-321)
            int r0 = (int) r1
            r4.<init>(r3, r0)
            r5.setOutputSize(r4)
            X.0LxF r0 = r7.LL
            X.0oCG r0 = r0.LLILZIL
            if (r0 == 0) goto L88
            com.bytedance.ies.nle.editor_jni.INLEExporter r4 = r0.getExporterApi()
            if (r4 == 0) goto L88
            X.00zU<java.lang.String> r3 = r7.LLILLJJLI
            T r2 = r3.element
            java.lang.String r2 = (java.lang.String) r2
            X.08mR r1 = new X.08mR
            X.0LxF r0 = r7.LL
            r1.<init>()
            X.0oCE r4 = (X.C1463840oCE) r4
            boolean r0 = r4.compile(r2, r5, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L88
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L88
            X.0LxF r0 = r7.LL
            r0.LLLZLZ()
        L82:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L88:
            X.0LxF r2 = r7.LL
            r1 = -10086(0xffffffffffffd89a, float:NaN)
            java.lang.String r0 = "compile return error directly"
            r2.LLLZ(r1, r0)
            goto L82
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C557070Lt3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
