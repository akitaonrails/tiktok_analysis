package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.VCBasePipelineHandler$process2$2$1", f = "VCBasePipelineHandler.kt", l = {66}, m = "invokeSuspend")
public final class C353120Dss extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<Object>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1631620sYq<InterfaceC497601wk, C19536311c1, InterfaceC1364105Vn<Object>, Object> LLILLL;
    public final /* synthetic */ C19536311c1 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C353120Dss(InterfaceC1631620sYq<? super InterfaceC497601wk, ? super C19536311c1, ? super InterfaceC1364105Vn<Object>, ? extends Object> interfaceC1631620sYq, C19536311c1 c19536311c1, InterfaceC1364105Vn<? super C353120Dss> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1631620sYq;
        this.LLILZ = c19536311c1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C353120Dss c353120Dss = new C353120Dss(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c353120Dss.LLILLJJLI = obj;
        return c353120Dss;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to X.0Dss for r6v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "VCBasePipelineHandler@28e4.process2$2$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 1
            if (r0 == 0) goto L17
            if (r0 != r3) goto L2c
            X.C155000ia.LIZIZ(r7)
        L13:
            X.C1C7U.LIZIZ(r5)
            return r7
        L17:
            X.C155000ia.LIZIZ(r7)
            java.lang.Object r2 = r6.LLILLJJLI
            X.0sYq<X.01wk, X.11c1, X.05Vn<java.lang.Object>, java.lang.Object> r1 = r6.LLILLL
            X.11c1 r0 = r6.LLILZ
            r6.LL = r3
            java.lang.Object r7 = r1.invoke(r2, r0, r6)
            if (r7 != r4) goto L13
            X.C1C7U.LIZIZ(r5)
            return r4
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353120Dss.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
