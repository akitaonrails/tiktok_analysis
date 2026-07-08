package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XRC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.hybrid.jsb.impl.EcPlayAudioMethod$loadCdnAudio$1", f = "EcPlayAudioMethod.kt", l = {}, m = "invokeSuspend")
public final class C0XRC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ CompletionBlock<C0XRH> LLILLL;
    public final /* synthetic */ LifecycleOwner LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0XRC(String str, CompletionBlock<C0XRH> completionBlock, LifecycleOwner lifecycleOwner, boolean z, InterfaceC1364105Vn<? super C0XRC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = completionBlock;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0XRC c0xrc = new C0XRC(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0xrc.LL = obj;
        return c0xrc;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r5 = "EcPlayAudioMethod@30c1.loadCdnAudio$1"
            X.C1C7U.LIZ(r5)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r14)
            java.lang.Object r2 = r13.LL
            X.01wk r2 = (X.InterfaceC497601wk) r2
            com.bytedance.forest.Forest r3 = X.C0T1N.LIZ()
            com.bytedance.forest.model.RequestParams r1 = new com.bytedance.forest.model.RequestParams
            r12 = 0
            r0 = 1
            r1.<init>(r12, r0, r12)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.enableCDNCache = r0
            java.lang.String r0 = r13.LLILLJJLI     // Catch: java.lang.Throwable -> L33
            X.0q1F r0 = r3.createSyncRequest(r0, r1)     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L37
            X.0q13 r0 = r0.LIZIZ()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L37
            java.lang.String r9 = r0.LIZLLL()
            goto L38
        L33:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L37:
            r9 = r12
        L38:
            r4 = 0
            if (r9 == 0) goto L5c
            int r0 = r9.length()
            if (r0 == 0) goto L5c
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0XRD r6 = new X.0XRD
            androidx.lifecycle.LifecycleOwner r7 = r13.LLILZ
            java.lang.String r8 = r13.LLILLJJLI
            boolean r10 = r13.LLILZIL
            com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.0XRH> r11 = r13.LLILLL
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0 = 2
            X.C23250099c.LIZLLL(r2, r1, r12, r6, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L5c:
            com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.0XRH> r3 = r13.LLILLL
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "cannot find cdn audio file for "
            r1.append(r0)
            java.lang.String r0 = r13.LLILLJJLI
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            int r0 = X.C0XRI.LLILLL
            java.lang.String r1 = r13.LLILLJJLI
            r0 = -12
            X.0XRH r0 = X.C0XRG.LIZ(r0, r1)
            r3.onFailure(r4, r2, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XRC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
