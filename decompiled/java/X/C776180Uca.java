package X;

import com.bytedance.android.livesdk.mvi.core.MviViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [I] */
/* JADX INFO: renamed from: X.0Uca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.mvi.core.MviViewModel$1", f = "LiveMviFrameworkCore.kt", l = {146}, m = "invokeSuspend")
public final class C776180Uca<I> extends C09AX implements Function2<I, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MviViewModel<S, I, E> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C776180Uca(MviViewModel<S, I, E> mviViewModel, InterfaceC1364105Vn<? super C776180Uca> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = mviViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C776180Uca c776180Uca = new C776180Uca(this.LLILLL, interfaceC1364105Vn);
        c776180Uca.LLILLJJLI = obj;
        return c776180Uca;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0Uca<I> for r5v1 'this'  X.05Vn
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
            java.lang.String r4 = "MviViewModel@c71f.<init>$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LL
            r2 = 1
            if (r0 == 0) goto L19
            if (r0 != r2) goto L2e
            X.C155000ia.LIZIZ(r6)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L19:
            X.C155000ia.LIZIZ(r6)
            java.lang.Object r1 = r5.LLILLJJLI
            X.0UZo r1 = (X.InterfaceC774460UZo) r1
            com.bytedance.android.livesdk.mvi.core.MviViewModel<S, I, E> r0 = r5.LLILLL
            r5.LL = r2
            java.lang.Object r0 = r0.yQ2(r1, r5)
            if (r0 != r3) goto L13
            X.C1C7U.LIZIZ(r4)
            return r3
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C776180Uca.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
