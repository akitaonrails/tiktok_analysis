package X;

import com.lynx.tasm.TemplateBundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0q7L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.bytedance.lynx.hybrid.lite.LiteLynxKitView$loadInnerWithBizCache$2", f = "LiteLynxKitView.kt", l = {1015}, m = "invokeSuspend")
public final class C1537690q7L extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1537720q7O LLILLL;
    public final /* synthetic */ AnonymousClass0957<C1536920q66> LLILZ;
    public final /* synthetic */ C1537830q7Z LLILZIL;
    public final /* synthetic */ C1537810q7X LLILZLL;
    public final /* synthetic */ C259800zU<C1533790q13> LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ C259800zU<TemplateBundle> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537690q7L(long j, C1537830q7Z c1537830q7Z, C1537720q7O c1537720q7O, C1537810q7X c1537810q7X, String str, InterfaceC1364105Vn interfaceC1364105Vn, C259800zU c259800zU, C259800zU c259800zU2, AnonymousClass0957 anonymousClass0957, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1537720q7O;
        this.LLILZ = anonymousClass0957;
        this.LLILZIL = c1537830q7Z;
        this.LLILZLL = c1537810q7X;
        this.LLIZ = c259800zU;
        this.LLIZLLLIL = z;
        this.LLJ = str;
        this.LLJI = j;
        this.LLJIJIL = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1537720q7O c1537720q7O = this.LLILLL;
        AnonymousClass0957<C1536920q66> anonymousClass0957 = this.LLILZ;
        C1537830q7Z c1537830q7Z = this.LLILZIL;
        C1537810q7X c1537810q7X = this.LLILZLL;
        C259800zU<C1533790q13> c259800zU = this.LLIZ;
        boolean z = this.LLIZLLLIL;
        return new C1537690q7L(this.LLJI, c1537830q7Z, c1537720q7O, c1537810q7X, this.LLJ, interfaceC1364105Vn, c259800zU, this.LLJIJIL, anonymousClass0957, z);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jCurrentTimeMillis;
        Object objLJLIIIL = obj;
        C1C7U.LIZ("LiteLynxKitView@73dd.loadInnerWithBizCache$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jCurrentTimeMillis = this.LL;
                C155000ia.LIZIZ(objLJLIIIL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJLIIIL);
            this.LLILLL.LJJJI(EnumC1538160q86.TEMPLATE_ARRAY_PRELOAD_TEMPLATE);
            jCurrentTimeMillis = System.currentTimeMillis();
            AnonymousClass0957<C1536920q66> anonymousClass0957 = this.LLILZ;
            this.LL = jCurrentTimeMillis;
            this.LLILLJJLI = 1;
            objLJLIIIL = anonymousClass0957.LJLIIIL(this);
            if (objLJLIIIL == objLJFF) {
                C1C7U.LIZIZ("LiteLynxKitView@73dd.loadInnerWithBizCache$2");
                return objLJFF;
            }
        }
        C1536920q66 c1536920q66 = (C1536920q66) objLJLIIIL;
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("decodeTemplateDeferred finished, wait for ");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sbLIZ.append(" ms");
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "LiteLynxView", 2);
        C1537910q7h c1537910q7h = this.LLILLL.LLILZIL;
        if (c1537910q7h != null) {
            c1537910q7h.LJJIFFI(c1536920q66.LIZJ);
        }
        C1537910q7h c1537910q7h2 = this.LLILLL.LLILZIL;
        if (c1537910q7h2 != null) {
            c1537910q7h2.LJJII(c1536920q66.LIZLLL);
        }
        C1537910q7h c1537910q7h3 = this.LLILLL.LLILZIL;
        if (c1537910q7h3 != null) {
            c1537910q7h3.LJJIII(c1536920q66.LJ);
        }
        this.LLILLL.getHybridContext().LJJ(C1533790q13.class, c1536920q66.LIZ);
        this.LLILLL.LJIL(this.LLILZIL, this.LLILZLL, this.LLIZ.element, this.LLJ, this.LLJI, this.LLJIJIL.element);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiteLynxKitView@73dd.loadInnerWithBizCache$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
