package X;

import com.lynx.tasm.TemplateBundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0q7M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.bytedance.lynx.hybrid.lite.LiteLynxKitView$renderLynxPage$2", f = "LiteLynxKitView.kt", l = {864}, m = "invokeSuspend")
public final class C1537700q7M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1537720q7O LLILLJJLI;
    public final /* synthetic */ AnonymousClass0957<C1536920q66> LLILLL;
    public final /* synthetic */ C259800zU<C1536930q67> LLILZ;
    public final /* synthetic */ C1537830q7Z LLILZIL;
    public final /* synthetic */ C1533790q13 LLILZLL;
    public final /* synthetic */ C1537810q7X LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ long LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537700q7M(C1537720q7O c1537720q7O, AnonymousClass0957<C1536920q66> anonymousClass0957, C259800zU<C1536930q67> c259800zU, C1537830q7Z c1537830q7Z, C1533790q13 c1533790q13, C1537810q7X c1537810q7X, boolean z, String str, long j, InterfaceC1364105Vn<? super C1537700q7M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1537720q7O;
        this.LLILLL = anonymousClass0957;
        this.LLILZ = c259800zU;
        this.LLILZIL = c1537830q7Z;
        this.LLILZLL = c1533790q13;
        this.LLIZ = c1537810q7X;
        this.LLIZLLLIL = z;
        this.LLJ = str;
        this.LLJI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1537700q7M(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, X.0q67] */
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
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJLIIIL = obj;
        C1C7U.LIZ("LiteLynxKitView@73dd.renderLynxPage$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJLIIIL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJLIIIL);
            this.LLILLJJLI.LJJJI(EnumC1538160q86.TEMPLATE_BUNDLE_PRE_DECODE);
            C1490740otc.LIZIZ(C1490740otc.LIZ, "decodeTemplateDeferred is waiting", null, "LiteLynxView", 2);
            AnonymousClass0957<C1536920q66> anonymousClass0957 = this.LLILLL;
            this.LL = 1;
            objLJLIIIL = anonymousClass0957.LJLIIIL(this);
            if (objLJLIIIL == objLJFF) {
                C1C7U.LIZIZ("LiteLynxKitView@73dd.renderLynxPage$2");
                return objLJFF;
            }
        }
        C1536920q66 c1536920q66 = (C1536920q66) objLJLIIIL;
        C1490740otc.LIZIZ(C1490740otc.LIZ, "decodeTemplateDeferred load finish", null, "LiteLynxView", 2);
        TemplateBundle templateBundle = c1536920q66.LJ;
        if (templateBundle != null) {
            C259800zU<C1536930q67> c259800zU = this.LLILZ;
            C1537720q7O c1537720q7O = this.LLILLJJLI;
            C1537830q7Z c1537830q7Z = this.LLILZIL;
            C1533790q13 c1533790q13 = this.LLILZLL;
            C1537810q7X c1537810q7X = this.LLIZ;
            boolean z = this.LLIZLLLIL;
            String str = this.LLJ;
            long j = this.LLJI;
            C1533790q13 c1533790q132 = c1536920q66.LIZ;
            if (c1533790q132 != null || c1536920q66.LIZIZ != null) {
                ?? c1536930q67 = new C1536930q67(templateBundle, c1533790q132, c1536920q66.LIZIZ, null);
                c259800zU.element = c1536930q67;
                c1537720q7O.LJJ(null, c1537830q7Z, c1533790q13, c1537810q7X, z, str, j, c1536930q67);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiteLynxKitView@73dd.renderLynxPage$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
