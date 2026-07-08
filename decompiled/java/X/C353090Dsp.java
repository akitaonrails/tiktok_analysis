package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dsp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.VCBasePipelineHandler$process$2", f = "VCBasePipelineHandler.kt", l = {40}, m = "invokeSuspend")
public final class C353090Dsp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<Object>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ List<C19536311c1> LLILZ;
    public final /* synthetic */ Function1<C19536311c1, Object> LLILZIL;
    public final /* synthetic */ Function1<C19536311c1, Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C353090Dsp(List<C19536311c1> list, Function1<? super C19536311c1, Object> function1, Function1<? super C19536311c1, Object> function12, InterfaceC1364105Vn<? super C353090Dsp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
        this.LLILZIL = function1;
        this.LLILZLL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C353090Dsp c353090Dsp = new C353090Dsp(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c353090Dsp.LLILLL = obj;
        return c353090Dsp;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003b -> B:6:0x001c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0043 -> B:6:0x001c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0Dsp for r12v1 'this'  X.05Vn
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
            java.lang.String r11 = "VCBasePipelineHandler@28e4.process$2"
            X.C1C7U.LIZ(r11)
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r12.LLILLJJLI
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L46
            if (r0 != r7) goto L91
            java.lang.Object r2 = r12.LL
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r12.LLILLL
            java.util.List r5 = (java.util.List) r5
            X.C155000ia.LIZIZ(r13)
        L1c:
            if (r13 == 0) goto L21
            r5.add(r13)
        L21:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r1 = r2.next()
            X.0Dsq r1 = (X.C353100Dsq) r1
            X.0957<T> r0 = r1.LIZIZ
            if (r0 == 0) goto L41
            r12.LLILLL = r5
            r12.LL = r2
            r12.LLILLJJLI = r7
            java.lang.Object r13 = r0.LJLIIIL(r12)
            if (r13 != r8) goto L1c
            X.C1C7U.LIZIZ(r11)
            return r8
        L41:
            T r13 = r1.LIZ
            if (r13 == 0) goto L21
            goto L1c
        L46:
            X.C155000ia.LIZIZ(r13)
            java.lang.Object r9 = r12.LLILLL
            X.01wk r9 = (X.InterfaceC497601wk) r9
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List<X.11c1> r0 = r12.LLILZ
            java.util.Iterator r10 = r0.iterator()
        L5d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r3 = r10.next()
            X.11c1 r3 = (X.C19536311c1) r3
            kotlin.jvm.functions.Function1<X.11c1, java.lang.Object> r0 = r12.LLILZIL
            java.lang.Object r2 = r0.invoke(r3)
            if (r2 != 0) goto L86
            X.0Dso r1 = new X.0Dso
            kotlin.jvm.functions.Function1<X.11c1, java.lang.Object> r0 = r12.LLILZLL
            r1.<init>(r0, r3, r6)
            r0 = 3
            X.099G r1 = X.C23250099c.LIZIZ(r9, r6, r6, r1, r0)
        L7d:
            X.0Dsq r0 = new X.0Dsq
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L5d
        L86:
            r1 = r6
            goto L7d
        L88:
            java.util.Iterator r2 = r4.iterator()
            goto L21
        L8d:
            X.C1C7U.LIZIZ(r11)
            return r5
        L91:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353090Dsp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<Object>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
