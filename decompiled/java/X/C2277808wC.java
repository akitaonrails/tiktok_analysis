package X;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08wC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionTask$featureExtraction$nolNullBitmaps$1", f = "MixEditingFeatureExtractionTask.kt", l = {433, 440}, m = "invokeSuspend")
public final class C2277808wC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Bitmap>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC1337805Lk LLILLL;
    public final /* synthetic */ C2277408w8 LLILZ;
    public final /* synthetic */ C2263508tt LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2277808wC(InterfaceC1337805Lk interfaceC1337805Lk, C2277408w8 c2277408w8, C2263508tt c2263508tt, InterfaceC1364105Vn<? super C2277808wC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1337805Lk;
        this.LLILZ = c2277408w8;
        this.LLILZIL = c2263508tt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2277808wC(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "MixEditingFeatureExtractionTask@c1fc.featureExtraction$nolNullBitmaps$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r8.LLILLJJLI
            r3 = 2
            r6 = 1
            if (r0 == 0) goto L24
            if (r0 == r6) goto L20
            if (r0 != r3) goto L18
            java.lang.Object r5 = r8.LL
            java.lang.String r5 = (java.lang.String) r5
            goto L78
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L20:
            X.C155000ia.LIZIZ(r9)
            goto L37
        L24:
            X.C155000ia.LIZIZ(r9)
            X.05Lk r0 = r8.LLILLL
            if (r0 == 0) goto L37
            r8.LLILLJJLI = r6
            java.lang.Object r0 = r0.LIZ(r8)
            if (r0 != r4) goto L37
            X.C1C7U.LIZIZ(r7)
            return r4
        L37:
            X.0C64 r5 = X.C0C64.LJIILLIIL()     // Catch: java.lang.Throwable -> L88
            java.lang.String r2 = "studio_mix_material_mock_feature_extraction_failed"
            r1 = 31744(0x7c00, float:4.4483E-41)
            r0 = 0
            boolean r0 = r5.LJIIIZ(r1, r2, r6, r0)     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L4d
            X.1Ds4 r0 = X.C0CHQ.LIZ()     // Catch: java.lang.Throwable -> L88
            r0.LJIIJJI()     // Catch: java.lang.Throwable -> L88
        L4d:
            X.08w8 r0 = r8.LLILZ     // Catch: java.lang.Throwable -> L88
            X.08tk r0 = r0.LIZ     // Catch: java.lang.Throwable -> L88
            boolean r0 = X.C1414600muo.LIZJ(r0)     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L6f
            java.lang.String r5 = "mix_edit_extract_frame_video"
        L59:
            com.ss.android.ugc.aweme.shortvideo.util.j r1 = X.C524780Ki4.LIZ     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = "start get bitmap"
            r1.start(r5, r0)     // Catch: java.lang.Throwable -> L88
            X.08w8 r2 = r8.LLILZ     // Catch: java.lang.Throwable -> L88
            X.08tk r1 = r2.LIZ     // Catch: java.lang.Throwable -> L88
            X.08tt r0 = r8.LLILZIL     // Catch: java.lang.Throwable -> L88
            r8.LL = r5     // Catch: java.lang.Throwable -> L88
            r8.LLILLJJLI = r3     // Catch: java.lang.Throwable -> L88
            java.lang.Object r9 = r2.LJFF(r1, r0, r8)     // Catch: java.lang.Throwable -> L88
            goto L72
        L6f:
            java.lang.String r5 = "mix_edit_extract_frame_image"
            goto L59
        L72:
            if (r9 != r4) goto L7b
            X.C1C7U.LIZIZ(r7)
            return r4
        L78:
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Throwable -> L88
        L7b:
            r0 = r9
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L88
            com.ss.android.ugc.aweme.shortvideo.util.j r1 = X.C524780Ki4.LIZ     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = "finish get bitmap"
            r1.end(r5, r0)     // Catch: java.lang.Throwable -> L88
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> L88
            goto L9a
        L88:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> La5
            java.lang.String r0 = "MIX_EDITING_FEATURE_EXTRACTION"
            android.util.Log.wtf(r0, r1)     // Catch: java.lang.Throwable -> La5
            X.05Lk r0 = r8.LLILLL
            if (r0 == 0) goto L98
            r0.release()
        L98:
            r9 = 0
            goto La1
        L9a:
            X.05Lk r0 = r8.LLILLL
            if (r0 == 0) goto La1
            r0.release()
        La1:
            X.C1C7U.LIZIZ(r7)
            return r9
        La5:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> La5
            X.05Lk r0 = r8.LLILLL
            if (r0 == 0) goto Lb0
            r0.release()
        Lb0:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2277808wC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Bitmap>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
