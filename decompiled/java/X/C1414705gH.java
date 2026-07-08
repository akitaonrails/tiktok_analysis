package X;

import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.viewmodel.CreatorCareModeNewDesignViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05gH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.viewmodel.CreatorCareModeNewDesignViewModel$updateCareModeAndFilterAllParallel$2$1$filter$1", f = "CreatorCareModeNewDesignViewModel.kt", l = {51}, m = "invokeSuspend")
public final class C1414705gH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BaseResponse>, Object> {
    public int LL;
    public final /* synthetic */ CreatorCareModeNewDesignViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1414705gH(CreatorCareModeNewDesignViewModel creatorCareModeNewDesignViewModel, InterfaceC1364105Vn<? super C1414705gH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creatorCareModeNewDesignViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1414705gH(this.LLILLJJLI, interfaceC1364105Vn);
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
        Object objLIZ;
        C1C7U.LIZ("CreatorCareModeNewDesignViewModel@4e58.updateCareModeAndFilterAllParallel$2$1$filter$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1888220zEi c1888220zEi = C1888220zEi.LIZIZ;
            boolean zLJFF = Intrinsics.LJFF(this.LLILLJJLI.LLILLJJLI.getValue(), Boolean.TRUE);
            this.LL = 1;
            objLIZ = c1888220zEi.LIZ(zLJFF ? 1 : 0, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("CreatorCareModeNewDesignViewModel@4e58.updateCareModeAndFilterAllParallel$2$1$filter$1");
                return objLJFF;
            }
        }
        C155000ia.LIZIZ(objLIZ);
        C1C7U.LIZIZ("CreatorCareModeNewDesignViewModel@4e58.updateCareModeAndFilterAllParallel$2$1$filter$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
