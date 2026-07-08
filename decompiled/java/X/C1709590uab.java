package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PayRequestPaymentDetailItem;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayElement;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0uab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1709590uab extends C09AY implements InterfaceC1631630sYr<EnumC336190DFx, List<? extends POPayElement>, String, String, Unit> {
    public final /* synthetic */ C1709570uaZ LL;
    public final /* synthetic */ InterfaceC835070WpN LLILLJJLI;
    public final /* synthetic */ PaymentOption LLILLL;
    public final /* synthetic */ InterfaceC1631630sYr<EnumC336190DFx, PayRequestPaymentDetailItem, String, String, Unit> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1709590uab(C1709570uaZ c1709570uaZ, InterfaceC835070WpN interfaceC835070WpN, PaymentOption paymentOption, InterfaceC1631630sYr<? super EnumC336190DFx, ? super PayRequestPaymentDetailItem, ? super String, ? super String, Unit> interfaceC1631630sYr, boolean z) {
        super(4);
        this.LL = c1709570uaZ;
        this.LLILLJJLI = interfaceC835070WpN;
        this.LLILLL = paymentOption;
        this.LLILZ = interfaceC1631630sYr;
        this.LLILZIL = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(EnumC336190DFx enumC336190DFx, List<? extends POPayElement> list, String str, String str2) {
        List<? extends POPayElement> list2 = list;
        if (enumC336190DFx == EnumC336190DFx.SUCCESS) {
            this.LL.LJIIL(this.LLILLJJLI, this.LLILLL, list2);
            this.LLILZ.invoke(enumC336190DFx, this.LL.LJIIIIZZ(this.LLILLL, this.LLILZIL, list2), str, str2);
        } else {
            this.LLILZ.invoke(enumC336190DFx, null, str, str2);
        }
        return Unit.LIZ;
    }
}
