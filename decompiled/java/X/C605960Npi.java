package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Npi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.periodic.AbstractBulletinPeriodicRequestHandler$startPolling$1", f = "AbstractBulletinPeriodicRequestHandler.kt", l = {75, 76}, m = "invokeSuspend")
public final class C605960Npi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC605970Npj<RESPONSE_DATA> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605960Npi(AbstractC605970Npj<RESPONSE_DATA> abstractC605970Npj, InterfaceC1364105Vn<? super C605960Npi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = abstractC605970Npj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C605960Npi c605960Npi = new C605960Npi(this.LLILLL, interfaceC1364105Vn);
        c605960Npi.LLILLJJLI = obj;
        return c605960Npi;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007b -> B:7:0x001a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0Npi for r10v1 'this'  X.05Vn
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "AbstractBulletinPeriodicRequestHandler@d949.startPolling$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r10.LL
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L81
            if (r0 == r6) goto L6a
            if (r0 != r7) goto La8
            java.lang.Object r1 = r10.LLILLJJLI
            X.01wk r1 = (X.InterfaceC497601wk) r1
            X.C155000ia.LIZIZ(r11)
        L1a:
            X.0Npj<RESPONSE_DATA> r0 = r10.LLILLL
            long r2 = java.lang.System.currentTimeMillis()
            r0.LIZJ = r2
        L22:
            boolean r0 = X.C2296808zG.LJI(r1)
            if (r0 == 0) goto L89
            X.0Npj<RESPONSE_DATA> r0 = r10.LLILLL
            long r4 = r0.LIZJ
            long r2 = r0.LIZLLL
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L89
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            X.0Npj<RESPONSE_DATA> r0 = r10.LLILLL
            java.lang.String r0 = r0.LJI()
            r2.append(r0)
            java.lang.String r0 = ": Job is Start."
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            X.C0OPX.LJII(r0)
            X.0Npj<RESPONSE_DATA> r0 = r10.LLILLL
            com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinPeriodicRequestConfig r0 = r0.LJ()
            java.lang.Long r0 = r0.syncInterval
            if (r0 == 0) goto L67
            long r2 = r0.longValue()
        L59:
            r10.LLILLJJLI = r1
            r10.LL = r6
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r10)
            if (r0 != r8) goto L71
            X.C1C7U.LIZIZ(r9)
            return r8
        L67:
            r2 = 0
            goto L59
        L6a:
            java.lang.Object r1 = r10.LLILLJJLI
            X.01wk r1 = (X.InterfaceC497601wk) r1
            X.C155000ia.LIZIZ(r11)
        L71:
            X.0Npj<RESPONSE_DATA> r0 = r10.LLILLL
            r10.LLILLJJLI = r1
            r10.LL = r7
            java.lang.Object r0 = r0.LIZIZ(r10)
            if (r0 != r8) goto L1a
            X.C1C7U.LIZIZ(r9)
            return r8
        L81:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r1 = r10.LLILLJJLI
            X.01wk r1 = (X.InterfaceC497601wk) r1
            goto L22
        L89:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            X.0Npj<RESPONSE_DATA> r0 = r10.LLILLL
            java.lang.String r0 = r0.LJI()
            r1.append(r0)
            java.lang.String r0 = " Job is finish."
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJII(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        La8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C605960Npi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
