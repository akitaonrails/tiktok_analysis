package X;

import com.bytedance.ext_power_list.AssemSingleListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [ITEM] */
/* JADX INFO: renamed from: X.0Cwc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.ext_power_list.AssemSingleListViewModel$loadLatestInner$3", f = "AssemSingleListViewModel.kt", l = {275}, m = "invokeSuspend")
public final class C329960Cwc<ITEM> extends C09AX implements Function1<InterfaceC1364105Vn<? super AbstractC1264080j02<ITEM>>, Object> {
    public int LL;
    public final /* synthetic */ AssemSingleListViewModel<ITEM, S, Cursor> LLILLJJLI;
    public final /* synthetic */ Cursor LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329960Cwc(AssemSingleListViewModel<ITEM, S, Cursor> assemSingleListViewModel, Cursor cursor, InterfaceC1364105Vn<? super C329960Cwc> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = assemSingleListViewModel;
        this.LLILLL = cursor;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C329960Cwc(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((a) create((InterfaceC1364105Vn) obj)).invokeSuspend(Unit.LIZ);
    }

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
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AssemSingleListViewModel@7ba5.loadLatestInner$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AssemSingleListViewModel<ITEM, S, Cursor> assemSingleListViewModel = this.LLILLJJLI;
            Cursor cursor = this.LLILLL;
            this.LL = 1;
            obj = assemSingleListViewModel.whenLoadLatest(cursor, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AssemSingleListViewModel@7ba5.loadLatestInner$3");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AssemSingleListViewModel@7ba5.loadLatestInner$3");
        return obj;
    }
}
