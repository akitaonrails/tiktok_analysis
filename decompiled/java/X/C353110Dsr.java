package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dsr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.VCBasePipelineHandler$process2$2", f = "VCBasePipelineHandler.kt", l = {73}, m = "invokeSuspend")
public final class C353110Dsr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<Object>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AbstractC19536111bz LLILZ;
    public final /* synthetic */ List<C19536311c1> LLILZIL;
    public final /* synthetic */ Function1<C19536311c1, Object> LLILZLL;
    public final /* synthetic */ InterfaceC1631620sYq<InterfaceC497601wk, C19536311c1, InterfaceC1364105Vn<Object>, Object> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C353110Dsr(AbstractC19536111bz abstractC19536111bz, List<C19536311c1> list, Function1<? super C19536311c1, Object> function1, InterfaceC1631620sYq<? super InterfaceC497601wk, ? super C19536311c1, ? super InterfaceC1364105Vn<Object>, ? extends Object> interfaceC1631620sYq, InterfaceC1364105Vn<? super C353110Dsr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = abstractC19536111bz;
        this.LLILZIL = list;
        this.LLILZLL = function1;
        this.LLIZ = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C353110Dsr c353110Dsr = new C353110Dsr(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c353110Dsr.LLILLL = obj;
        return c353110Dsr;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003b -> B:6:0x001c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0043 -> B:6:0x001c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0Dsr for r12v1 'this'  X.05Vn
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r11 = "VCBasePipelineHandler@28e4.process2$2"
            X.C1C7U.LIZ(r11)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r12.LLILLJJLI
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L46
            if (r0 != r5) goto La1
            java.lang.Object r2 = r12.LL
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r12.LLILLL
            java.util.List r4 = (java.util.List) r4
            X.C155000ia.LIZIZ(r13)
        L1c:
            if (r13 == 0) goto L21
            r4.add(r13)
        L21:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9d
            java.lang.Object r1 = r2.next()
            X.0Dsq r1 = (X.C353100Dsq) r1
            X.0957<T> r0 = r1.LIZIZ
            if (r0 == 0) goto L41
            r12.LLILLL = r4
            r12.LL = r2
            r12.LLILLJJLI = r5
            java.lang.Object r13 = r0.LJLIIIL(r12)
            if (r13 != r7) goto L1c
            X.C1C7U.LIZIZ(r11)
            return r7
        L41:
            T r13 = r1.LIZ
            if (r13 == 0) goto L21
            goto L1c
        L46:
            X.C155000ia.LIZIZ(r13)
            java.lang.Object r8 = r12.LLILLL
            X.01wk r8 = (X.InterfaceC497601wk) r8
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.11bz r1 = r12.LLILZ
            r0 = 0
            r1.LIZIZ = r0
            java.util.List<X.11c1> r0 = r12.LLILZIL
            java.util.Iterator r10 = r0.iterator()
        L62:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r9 = r10.next()
            X.11c1 r9 = (X.C19536311c1) r9
            kotlin.jvm.functions.Function1<X.11c1, java.lang.Object> r0 = r12.LLILZLL
            java.lang.Object r2 = r0.invoke(r9)
            if (r2 == 0) goto L8b
            X.11bz r1 = r12.LLILZ
            int r0 = r1.LIZIZ
            int r0 = r0 + 1
            r1.LIZIZ = r0
            X.C2286608xc.LJ(r0)
            r1 = r6
        L82:
            X.0Dsq r0 = new X.0Dsq
            r0.<init>(r2, r1)
            r3.add(r0)
            goto L62
        L8b:
            X.0Dss r1 = new X.0Dss
            X.0sYq<X.01wk, X.11c1, X.05Vn<java.lang.Object>, java.lang.Object> r0 = r12.LLIZ
            r1.<init>(r0, r9, r6)
            r0 = 3
            X.099G r1 = X.C23250099c.LIZIZ(r8, r6, r6, r1, r0)
            goto L82
        L98:
            java.util.Iterator r2 = r3.iterator()
            goto L21
        L9d:
            X.C1C7U.LIZIZ(r11)
            return r4
        La1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353110Dsr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<Object>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
