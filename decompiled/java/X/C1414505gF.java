package X;

import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.viewmodel.CreatorCareModeNewDesignViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05gF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.viewmodel.CreatorCareModeNewDesignViewModel$updateCareModeOnly$2", f = "CreatorCareModeNewDesignViewModel.kt", l = {39}, m = "invokeSuspend")
public final class C1414505gF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends String>>, Object> {
    public int LL;
    public final /* synthetic */ CreatorCareModeNewDesignViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1414505gF(CreatorCareModeNewDesignViewModel creatorCareModeNewDesignViewModel, InterfaceC1364105Vn<? super C1414505gF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creatorCareModeNewDesignViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1414505gF(this.LLILLJJLI, interfaceC1364105Vn);
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
        Object objLJIIJ;
        C1C7U.LIZ("CreatorCareModeNewDesignViewModel@4e58.updateCareModeOnly$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJIIJ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1888220zEi c1888220zEi = C1888220zEi.LIZIZ;
            boolean zLJFF = Intrinsics.LJFF(this.LLILLJJLI.LL.getValue(), Boolean.TRUE);
            this.LL = 1;
            objLJIIJ = c1888220zEi.LJIIJ(zLJFF ? 1 : 0, this);
            if (objLJIIJ == objLJFF) {
                C1C7U.LIZIZ("CreatorCareModeNewDesignViewModel@4e58.updateCareModeOnly$2");
                return objLJFF;
            }
        }
        if (C189200o6.m8isSuccessimpl(objLJIIJ)) {
            objLJIIJ = ((BaseResponse) objLJIIJ).getStatusMsg();
        }
        C189200o6.m2constructorimpl(objLJIIJ);
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJIIJ);
        C1C7U.LIZIZ("CreatorCareModeNewDesignViewModel@4e58.updateCareModeOnly$2");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
