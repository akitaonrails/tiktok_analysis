package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: renamed from: X.0fyH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.data.repository.MusicGiftRepository$requestFlow$1", f = "MusicGiftRepository.kt", l = {143, 144, 147, 152, 156, 158}, m = "invokeSuspend")
public final class C1147670fyH<R> extends C09AX implements Function2<InterfaceC346701Wf<? super AbstractC1147530fy3<? extends R>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super C470590Icr<T>>, Object> LLILLL;
    public final /* synthetic */ C1147690fyJ LLILZ;
    public final /* synthetic */ Function1<T, R> LLILZIL;
    public final /* synthetic */ Function1<R, Boolean> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1147670fyH(Function1<? super InterfaceC1364105Vn<? super C470590Icr<T>>, ? extends Object> function1, C1147690fyJ c1147690fyJ, Function1<? super T, ? extends R> function12, Function1<? super R, Boolean> function13, InterfaceC1364105Vn<? super C1147670fyH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function1;
        this.LLILZ = c1147690fyJ;
        this.LLILZIL = function12;
        this.LLILZLL = function13;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1147670fyH c1147670fyH = new C1147670fyH(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1147670fyH.LLILLJJLI = obj;
        return c1147670fyH;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1147670fyH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
