package X;

import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0n0Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.AutoCutComponent$requestRecommendMusic$2", f = "AutoCutComponent.kt", l = {}, m = "invokeSuspend")
public final class C1418160n0Y extends C09AX implements Function2<C096D, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1418150n0X LLILLJJLI;
    public final /* synthetic */ InterfaceC1418410n0x LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function2<List<CutsameDataItem>, String, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1418160n0Y(C1418150n0X c1418150n0X, InterfaceC1418410n0x interfaceC1418410n0x, Function0<Unit> function0, Function2<? super List<CutsameDataItem>, ? super String, Unit> function2, InterfaceC1364105Vn<? super C1418160n0Y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1418150n0X;
        this.LLILLL = interfaceC1418410n0x;
        this.LLILZ = function0;
        this.LLILZIL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1418160n0Y c1418160n0Y = new C1418160n0Y(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1418160n0Y.LL = obj;
        return c1418160n0Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, java.lang.Object] */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1418160n0Y.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C096D c096d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c096d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
