package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [SEARCH_RESULT] */
/* JADX INFO: renamed from: X.0iOM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.search.sdk.impl.IMSearchEngine$doQuery$14", f = "IMSearchEngine.kt", l = {143}, m = "invokeSuspend")
public final class C1240720iOM<SEARCH_RESULT> extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends SEARCH_RESULT>>, Object> {
    public int LL;
    public final /* synthetic */ C1240730iON<SEARCH_RESULT> LLILLJJLI;
    public final /* synthetic */ List<SEARCH_RESULT> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1240720iOM(C1240730iON<SEARCH_RESULT> c1240730iON, List<? extends SEARCH_RESULT> list, InterfaceC1364105Vn<? super C1240720iOM> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1240730iON;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1240720iOM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((a) create((InterfaceC1364105Vn) obj)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0iOM<SEARCH_RESULT> for r5v1 'this'  X.05Vn
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "IMSearchEngine@a240.doQuery$14"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LL
            r2 = 1
            if (r0 == 0) goto L17
            if (r0 != r2) goto L2c
            X.C155000ia.LIZIZ(r6)
        L13:
            X.C1C7U.LIZIZ(r4)
            return r6
        L17:
            X.C155000ia.LIZIZ(r6)
            X.0iON<SEARCH_RESULT> r0 = r5.LLILLJJLI
            X.0iOK<SEARCH_RESULT> r1 = r0.LIZIZ
            java.util.List<SEARCH_RESULT> r0 = r5.LLILLL
            r5.LL = r2
            java.lang.Object r6 = r1.LIZIZ(r0, r5)
            if (r6 != r3) goto L13
            X.C1C7U.LIZIZ(r4)
            return r3
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1240720iOM.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
