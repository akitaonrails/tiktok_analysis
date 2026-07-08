package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vY5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel$getCandInputOptionsReal$1", f = "AddressEditViewModel.kt", l = {1247}, m = "invokeSuspend")
public final class C1746470vY5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Address LLILLJJLI;
    public final /* synthetic */ C1744080vUE LLILLL;
    public final /* synthetic */ AddressEditViewModel LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ InterfaceC1631620sYq<CandInputDataOptions, Boolean, String, Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1746470vY5(Address address, C1744080vUE c1744080vUE, AddressEditViewModel addressEditViewModel, String str, String str2, String str3, String str4, InterfaceC1631620sYq<? super CandInputDataOptions, ? super Boolean, ? super String, Unit> interfaceC1631620sYq, InterfaceC1364105Vn<? super C1746470vY5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = address;
        this.LLILLL = c1744080vUE;
        this.LLILZ = addressEditViewModel;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1746470vY5(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d A[Catch: all -> 0x014e, TryCatch #0 {all -> 0x014e, blocks: (B:79:0x012a, B:80:0x012d, B:82:0x0137, B:83:0x0144, B:9:0x0022, B:11:0x0028, B:12:0x002a, B:17:0x003f, B:19:0x0043, B:24:0x004e, B:26:0x0052, B:31:0x005d, B:33:0x0061, B:38:0x006c, B:40:0x0072, B:43:0x0081, B:45:0x0085, B:50:0x0090, B:52:0x0096, B:55:0x00a5, B:54:0x00a3, B:42:0x007f, B:57:0x00bd, B:58:0x00c1, B:60:0x00cd, B:65:0x00d8, B:67:0x00dd, B:69:0x00e3, B:74:0x00ec, B:75:0x00ee, B:66:0x00db), top: B:88:0x0011 }] */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1746470vY5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
