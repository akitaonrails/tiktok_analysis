package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ImageItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v4o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel$display$1", f = "ImageListViewModel.kt", l = {392, 406, 431, 458}, m = "invokeSuspend")
public final class C1728320v4o extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1728990v5t LL;
    public LiveEffect LLILLJJLI;
    public InterfaceC1728700v5Q LLILLL;
    public int LLILZ;
    public final /* synthetic */ ImageListViewModel LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ ImageItem LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728320v4o(ImageItem imageItem, ImageListViewModel imageListViewModel, String str, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = imageListViewModel;
        this.LLILZLL = z;
        this.LLIZ = imageItem;
        this.LLIZLLLIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728320v4o(this.LLIZ, this.LLILZIL, this.LLIZLLLIL, interfaceC1364105Vn, this.LLILZLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e3  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Integer, java.lang.String] */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1728320v4o.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
