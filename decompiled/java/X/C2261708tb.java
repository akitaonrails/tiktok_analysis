package X;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08tb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionTask$getFramesForSingleMedia$2$framesResult$1", f = "MixEditingFeatureExtractionTask.kt", l = {490, 493}, m = "invokeSuspend")
public final class C2261708tb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Bitmap>>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1337805Lk LLILLJJLI;
    public final /* synthetic */ C2277408w8 LLILLL;
    public final /* synthetic */ C2263508tt LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2261708tb(InterfaceC1337805Lk interfaceC1337805Lk, C2277408w8 c2277408w8, C2263508tt c2263508tt, InterfaceC1364105Vn<? super C2261708tb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1337805Lk;
        this.LLILLL = c2277408w8;
        this.LLILZ = c2263508tt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2261708tb(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060 A[Catch: all -> 0x0089, TryCatch #0 {all -> 0x0089, blocks: (B:25:0x005a, B:27:0x0060, B:28:0x0075, B:31:0x007c, B:16:0x0033, B:24:0x004f, B:21:0x0045, B:22:0x0048, B:17:0x0037), top: B:43:0x000d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "MixEditingFeatureExtractionTask@c1fc.getFramesForSingleMedia$2$framesResult$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L20
            if (r0 == r1) goto L1c
            if (r0 != r3) goto L14
            goto L45
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1c:
            X.C155000ia.LIZIZ(r7)
            goto L33
        L20:
            X.C155000ia.LIZIZ(r7)
            X.05Lk r0 = r6.LLILLJJLI
            if (r0 == 0) goto L33
            r6.LL = r1
            java.lang.Object r0 = r0.LIZ(r6)
            if (r0 != r4) goto L33
            X.C1C7U.LIZIZ(r5)
            return r4
        L33:
            X.08w8 r2 = r6.LLILLL     // Catch: java.lang.Throwable -> L89
            X.08tt r1 = r6.LLILZ     // Catch: java.lang.Throwable -> L89
            X.08tk r0 = r2.LIZ     // Catch: java.lang.Throwable -> L4e
            r6.LL = r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r7 = r2.LJFF(r0, r1, r6)     // Catch: java.lang.Throwable -> L4e
            if (r7 != r4) goto L48
            X.C1C7U.LIZIZ(r5)
            return r4
        L45:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Throwable -> L4e
        L48:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L4e
            X.C189200o6.m2constructorimpl(r7)     // Catch: java.lang.Throwable -> L4e
            goto L5a
        L4e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L89
            X.00Yq r7 = new X.00Yq     // Catch: java.lang.Throwable -> L89
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L89
            X.C189200o6.m2constructorimpl(r7)     // Catch: java.lang.Throwable -> L89
        L5a:
            java.lang.Throwable r3 = X.C189200o6.m5exceptionOrNullimpl(r7)     // Catch: java.lang.Throwable -> L89
            if (r3 == 0) goto L75
            java.lang.String r2 = "MIX_EDITING_FEATURE_EXTRACTION"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "getBitmap failed, reason="
            r1.append(r0)     // Catch: java.lang.Throwable -> L89
            r1.append(r3)     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L89
            X.C201955140j.LJFF(r2, r0)     // Catch: java.lang.Throwable -> L89
        L75:
            boolean r0 = X.C189200o6.m7isFailureimpl(r7)     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L7c
            r7 = 0
        L7c:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L89
            X.05Lk r0 = r6.LLILLJJLI
            if (r0 == 0) goto L85
            r0.release()
        L85:
            X.C1C7U.LIZIZ(r5)
            return r7
        L89:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L89
            X.05Lk r0 = r6.LLILLJJLI
            if (r0 == 0) goto L94
            r0.release()
        L94:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2261708tb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Bitmap>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
