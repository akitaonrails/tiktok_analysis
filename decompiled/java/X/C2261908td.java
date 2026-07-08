package X;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08td, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionTask$featureExtraction$3", f = "MixEditingFeatureExtractionTask.kt", l = {459, 461}, m = "invokeSuspend")
public final class C2261908td extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C2262108tf>>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1337805Lk LLILLJJLI;
    public final /* synthetic */ C2277408w8 LLILLL;
    public final /* synthetic */ AnonymousClass0957<List<Bitmap>> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C2263508tt LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2261908td(InterfaceC1337805Lk interfaceC1337805Lk, C2277408w8 c2277408w8, AnonymousClass0957<? extends List<Bitmap>> anonymousClass0957, String str, C2263508tt c2263508tt, InterfaceC1364105Vn<? super C2261908td> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1337805Lk;
        this.LLILLL = c2277408w8;
        this.LLILZ = anonymousClass0957;
        this.LLILZIL = str;
        this.LLILZLL = c2263508tt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2261908td(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "MixEditingFeatureExtractionTask@c1fc.featureExtraction$3"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L20
            if (r0 == r1) goto L1c
            if (r0 != r4) goto L14
            goto L47
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1c:
            X.C155000ia.LIZIZ(r8)
            goto L33
        L20:
            X.C155000ia.LIZIZ(r8)
            X.05Lk r0 = r7.LLILLJJLI
            if (r0 == 0) goto L33
            r7.LL = r1
            java.lang.Object r0 = r0.LIZ(r7)
            if (r0 != r5) goto L33
            X.C1C7U.LIZIZ(r6)
            return r5
        L33:
            X.08w8 r3 = r7.LLILLL     // Catch: java.util.concurrent.CancellationException -> L4d java.lang.Throwable -> L6a
            X.0957<java.util.List<android.graphics.Bitmap>> r2 = r7.LLILZ     // Catch: java.util.concurrent.CancellationException -> L4d java.lang.Throwable -> L6a
            java.lang.String r1 = r7.LLILZIL     // Catch: java.util.concurrent.CancellationException -> L4d java.lang.Throwable -> L6a
            X.08tt r0 = r7.LLILZLL     // Catch: java.util.concurrent.CancellationException -> L4d java.lang.Throwable -> L6a
            r7.LL = r4     // Catch: java.util.concurrent.CancellationException -> L4d java.lang.Throwable -> L6a
            java.lang.Object r8 = r3.LJI(r2, r1, r0, r7)     // Catch: java.util.concurrent.CancellationException -> L4d java.lang.Throwable -> L6a
            if (r8 != r5) goto L4a
            X.C1C7U.LIZIZ(r6)
            return r5
        L47:
            X.C155000ia.LIZIZ(r8)     // Catch: java.util.concurrent.CancellationException -> L4d java.lang.Throwable -> L6a
        L4a:
            java.util.List r8 = (java.util.List) r8     // Catch: java.util.concurrent.CancellationException -> L4d java.lang.Throwable -> L6a
            goto L5f
        L4d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "MIX_EDITING_FEATURE_EXTRACTION"
            android.util.Log.wtf(r0, r1)     // Catch: java.lang.Throwable -> L6a
            X.05Lk r0 = r7.LLILLJJLI
            if (r0 == 0) goto L5d
            r0.release()
        L5d:
            r8 = 0
            goto L66
        L5f:
            X.05Lk r0 = r7.LLILLJJLI
            if (r0 == 0) goto L66
            r0.release()
        L66:
            X.C1C7U.LIZIZ(r6)
            return r8
        L6a:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L6a
            X.05Lk r0 = r7.LLILLJJLI
            if (r0 == 0) goto L75
            r0.release()
        L75:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2261908td.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C2262108tf>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
