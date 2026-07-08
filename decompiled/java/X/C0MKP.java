package X;

import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MKP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$prefetchSourceMedia$1", f = "ForwardOnThisDayEnvironment.kt", l = {375, 378}, m = "invokeSuspend")
public final class C0MKP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ ForwardMedia LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MKP(String str, List<String> list, ForwardMedia forwardMedia, InterfaceC1364105Vn<? super C0MKP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = list;
        this.LLILZIL = forwardMedia;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0MKP c0mkp = new C0MKP(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0mkp.LLILLJJLI = obj;
        return c0mkp;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "ForwardOnThisDayEnvironment@5609.prefetchSourceMedia$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r7.LL
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L1b
            if (r0 == r4) goto L63
            if (r0 == r5) goto L63
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1b:
            X.C155000ia.LIZIZ(r8)
            com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia r2 = r7.LLILZIL
            boolean r0 = X.C565720MGs.LIZ(r2)     // Catch: java.lang.Throwable -> L6c
            r1 = 0
            if (r0 == 0) goto L43
            X.0MKJ r0 = X.C0MKJ.LIZ     // Catch: java.lang.Throwable -> L6c
            r0.getClass()     // Catch: java.lang.Throwable -> L6c
            X.0MKc r0 = new X.0MKc     // Catch: java.lang.Throwable -> L6c
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L6c
            kotlinx.coroutines.flow.b r1 = X.C09IC.LJ(r0)     // Catch: java.lang.Throwable -> L6c
            X.0MKR<T> r0 = new X.InterfaceC346701Wf() { // from class: X.0MKR
                static {
                    /*
                        X.0MKR r0 = new X.0MKR
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0MKR<T>) X.0MKR.LL X.0MKR
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0MKR.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0MKR.<init>():void");
                }

                @Override // X.InterfaceC346701Wf
                public final java.lang.Object emit(java.lang.Object r2, X.InterfaceC1364105Vn r3) {
                    /*
                        r1 = this;
                        kotlin.Unit r0 = kotlin.Unit.LIZ
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0MKR.emit(java.lang.Object, X.05Vn):java.lang.Object");
                }
            }     // Catch: java.lang.Throwable -> L6c
            r7.LL = r4     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = r1.collect(r0, r7)     // Catch: java.lang.Throwable -> L6c
            if (r0 != r3) goto L66
            X.C1C7U.LIZIZ(r6)
            return r3
        L43:
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r0 = r2.localMedia     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L66
            X.0MKJ r0 = X.C0MKJ.LIZ     // Catch: java.lang.Throwable -> L6c
            r0.getClass()     // Catch: java.lang.Throwable -> L6c
            X.0MKf r0 = new X.0MKf     // Catch: java.lang.Throwable -> L6c
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L6c
            kotlinx.coroutines.flow.b r1 = X.C09IC.LJ(r0)     // Catch: java.lang.Throwable -> L6c
            X.0MKS<T> r0 = new X.InterfaceC346701Wf() { // from class: X.0MKS
                static {
                    /*
                        X.0MKS r0 = new X.0MKS
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0MKS<T>) X.0MKS.LL X.0MKS
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0MKS.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0MKS.<init>():void");
                }

                @Override // X.InterfaceC346701Wf
                public final java.lang.Object emit(java.lang.Object r2, X.InterfaceC1364105Vn r3) {
                    /*
                        r1 = this;
                        kotlin.Unit r0 = kotlin.Unit.LIZ
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0MKS.emit(java.lang.Object, X.05Vn):java.lang.Object");
                }
            }     // Catch: java.lang.Throwable -> L6c
            r7.LL = r5     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = r1.collect(r0, r7)     // Catch: java.lang.Throwable -> L6c
            if (r0 != r3) goto L66
            X.C1C7U.LIZIZ(r6)
            return r3
        L63:
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Throwable -> L6c
        L66:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L6c
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L6c
            goto L78
        L6c:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L78:
            java.util.Map<java.lang.String, X.0MKQ> r3 = X.C0MKJ.LJFF
            java.lang.String r2 = r7.LLILLL
            boolean r0 = X.C189200o6.m8isSuccessimpl(r0)
            if (r0 == 0) goto La5
            X.0MKJ r1 = X.C0MKJ.LIZ
            java.util.List<java.lang.String> r0 = r7.LLILZ
            r1.getClass()
            boolean r0 = X.C0MKJ.LIZIZ(r0)
            if (r0 == 0) goto La5
            X.0MKQ r0 = X.C0MKQ.LLILLJJLI
        L91:
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            r3.put(r2, r0)
            java.util.Map<java.lang.String, X.09AE> r1 = X.C0MKJ.LJI
            java.lang.String r0 = r7.LLILLL
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            r1.remove(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        La5:
            X.0MKQ r0 = X.C0MKQ.LLILLL
            goto L91
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MKP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
