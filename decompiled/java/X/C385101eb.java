package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01eb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.settingpage.SettingsRegistry$dynamicItem$3$1", f = "LiveHostSettingsConfigFactory.kt", l = {229}, m = "invokeSuspend")
public final class C385101eb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1631630sYr<InterfaceC497601wk, Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object>, Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object>, InterfaceC1364105Vn<? super Unit>, Object> LLILLL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super Unit>, Object> LLILZ;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super Unit>, Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C385101eb(InterfaceC1631630sYr<? super InterfaceC497601wk, ? super Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object>, ? super Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631630sYr, Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function1, Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function12, InterfaceC1364105Vn<? super C385101eb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1631630sYr;
        this.LLILZ = function1;
        this.LLILZIL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C385101eb c385101eb = new C385101eb(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c385101eb.LLILLJJLI = obj;
        return c385101eb;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to X.01eb for r7v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "SettingsRegistry@fb82.dynamicItem$3$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 1
            if (r0 == 0) goto L19
            if (r0 != r4) goto L30
            X.C155000ia.LIZIZ(r8)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L19:
            X.C155000ia.LIZIZ(r8)
            java.lang.Object r3 = r7.LLILLJJLI
            X.0sYr<X.01wk, kotlin.jvm.functions.Function1<? super X.05Vn<? super kotlin.Unit>, ? extends java.lang.Object>, kotlin.jvm.functions.Function1<? super X.05Vn<? super kotlin.Unit>, ? extends java.lang.Object>, X.05Vn<? super kotlin.Unit>, java.lang.Object> r2 = r7.LLILLL
            kotlin.jvm.functions.Function1<X.05Vn<? super kotlin.Unit>, java.lang.Object> r1 = r7.LLILZ
            kotlin.jvm.functions.Function1<X.05Vn<? super kotlin.Unit>, java.lang.Object> r0 = r7.LLILZIL
            r7.LL = r4
            java.lang.Object r0 = r2.invoke(r3, r1, r0, r7)
            if (r0 != r5) goto L13
            X.C1C7U.LIZIZ(r6)
            return r5
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385101eb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
