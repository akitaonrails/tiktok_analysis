package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallApiWithPreload;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0wCN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallRepository$requestChunk$1", f = "ShopMallRepository.kt", l = {355}, m = "invokeSuspend")
public final class C1771450wCN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1771590wCb LLILLL;
    public final /* synthetic */ EnumC1771830wCz LLILZ;
    public final /* synthetic */ C1771500wCS LLILZIL;
    public final /* synthetic */ InterfaceC1773310wFN LLILZLL;
    public final /* synthetic */ Function1<AbstractC1771170wBv, Unit> LLIZ;
    public final /* synthetic */ C1773140wF6 LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1771450wCN(C1771500wCS c1771500wCS, InterfaceC1773310wFN interfaceC1773310wFN, C1773140wF6 c1773140wF6, C1771590wCb c1771590wCb, EnumC1771830wCz enumC1771830wCz, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1771590wCb;
        this.LLILZ = enumC1771830wCz;
        this.LLILZIL = c1771500wCS;
        this.LLILZLL = interfaceC1773310wFN;
        this.LLIZ = function1;
        this.LLIZLLLIL = c1773140wF6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1771590wCb c1771590wCb = this.LLILLL;
        EnumC1771830wCz enumC1771830wCz = this.LLILZ;
        C1771450wCN c1771450wCN = new C1771450wCN(this.LLILZIL, this.LLILZLL, this.LLIZLLLIL, c1771590wCb, enumC1771830wCz, interfaceC1364105Vn, this.LLIZ);
        c1771450wCN.LLILLJJLI = obj;
        return c1771450wCN;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, X.0wCQ] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZ;
        String str;
        C1C7U.LIZ("ShopMallRepository@92e8.requestChunk$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            if ((!Intrinsics.LJFF(this.LLILLL.LJFF, "first_fetch") && !Intrinsics.LJFF(this.LLILLL.LJFF, "error_retry")) || (strLIZ = C1767800w6U.LIZ()) == null) {
                strLIZ = "";
            }
            if (this.LLILZ == EnumC1771830wCz.REFRESH) {
                C1771330wCB c1771330wCB = ShopMallApiWithPreload.LIZ;
                C1767790w6T c1767790w6T = C1767980w6m.LJII;
                if (c1767790w6T != null) {
                    str = c1767790w6T.LJI;
                } else {
                    str = null;
                }
                String strLIZJ = C1767800w6U.LIZJ();
                C1771590wCb c1771590wCb = this.LLILLL;
                InterfaceC599750Nfh interfaceC599750Nfh = this.LLILZIL.LIZ.globalContext;
                c1771330wCB.getClass();
                n nVarLIZLLL = C1771330wCB.LIZLLL(strLIZ, str, strLIZJ, c1771590wCb, interfaceC599750Nfh);
                long jCurrentTimeMillis = System.currentTimeMillis();
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = "";
                C259800zU c259800zU2 = new C259800zU();
                C259800zU c259800zU3 = new C259800zU();
                c259800zU3.element = new C1771480wCQ("chunk unknown error", null);
                C259800zU c259800zU4 = new C259800zU();
                C259800zU c259800zU5 = new C259800zU();
                C013C c013c = new C013C();
                C259800zU c259800zU6 = new C259800zU();
                c259800zU6.element = "unknown";
                ShopMallMixViewModel shopMallMixViewModel = this.LLILZIL.LIZ;
                C1771590wCb c1771590wCb2 = this.LLILLL;
                shopMallMixViewModel.getClass();
                C2325381G0q c2325381G0q = new C2325381G0q(new C1771470wCP(c259800zU3, this.LLILZIL, jCurrentTimeMillis, this.LLILLL, this.LLILZLL, c259800zU2, c259800zU, c013c, c259800zU6, this.LLIZ, null), new C2501109r7(new C1771460wCO(c259800zU3, null), C09IC.LJ(new C1771320wCA(c1771590wCb2, shopMallMixViewModel, nVarLIZLLL, null)), 0), 0);
                C1771490wCR c1771490wCR = new C1771490wCR(interfaceC497601wk, this.LLILLL, this.LLILZIL, this.LLIZLLLIL, this.LLILZLL, c259800zU4, c259800zU5, c259800zU6, this.LLILZ, c259800zU3, c013c, c259800zU, c259800zU2, this.LLIZ);
                this.LL = 1;
                if (c2325381G0q.collect(c1771490wCR, this) == objLJFF) {
                    C1C7U.LIZIZ("ShopMallRepository@92e8.requestChunk$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMallRepository@92e8.requestChunk$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
