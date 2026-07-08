package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12H4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$sendRequest$1$handleEffectFetchResponseSuccess$1", f = "BeautySource.kt", l = {995}, m = "invokeSuspend")
public final class C12H4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C12HN LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ EffectChannelResponse LLILZ;
    public final /* synthetic */ C12HN LLILZIL;
    public final /* synthetic */ C19729512Hd LLILZLL;
    public final /* synthetic */ C12H8 LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12H4(EffectChannelResponse effectChannelResponse, C12HN c12hn, C19729512Hd c19729512Hd, C12H8 c12h8, InterfaceC1364105Vn<? super C12H4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = effectChannelResponse;
        this.LLILZIL = c12hn;
        this.LLILZLL = c19729512Hd;
        this.LLIZ = c12h8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C12H4(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c0  */
    /* JADX WARN: Type inference failed for: r0v88, types: [T, java.lang.String] */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r100) {
        /*
            Method dump skipped, instruction units count: 1457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12H4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
