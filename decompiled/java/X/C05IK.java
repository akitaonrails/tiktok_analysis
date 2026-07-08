package X;

import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS403S0200000_2;
import njp.a;

/* JADX INFO: renamed from: X.05IK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel$loadFeedLayeredCacheFull$1", f = "FeedSkylightListViewModel.kt", l = {614}, m = "invokeSuspend")
public final class C05IK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05IL LLILLJJLI;
    public final /* synthetic */ FeedSkylightListViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05IK(C05IL c05il, FeedSkylightListViewModel feedSkylightListViewModel, InterfaceC1364105Vn<? super C05IK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05il;
        this.LLILLL = feedSkylightListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05IK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
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
        C1C7U.LIZ("FeedSkylightListViewModel@458.loadFeedLayeredCacheFull$1");
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
            C05IL c05il = this.LLILLJJLI;
            this.LL = 1;
            obj = c05il.LIZIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FeedSkylightListViewModel@458.loadFeedLayeredCacheFull$1");
                return objLJFF;
            }
        }
        C610950Nxl c610950Nxl = (C610950Nxl) obj;
        if (c610950Nxl != null) {
            this.LLILLL.DQ2(c610950Nxl.LIZIZ, true);
            FeedSkylightListViewModel feedSkylightListViewModel = this.LLILLL;
            feedSkylightListViewModel.WQ2(new AwS403S0200000_2(feedSkylightListViewModel, (FeedSkylightListViewModel) c610950Nxl, (C610950Nxl<InterfaceC1891350zJl>) 63));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedSkylightListViewModel@458.loadFeedLayeredCacheFull$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
