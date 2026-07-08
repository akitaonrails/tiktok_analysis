package X;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Z6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel$navigateByStatus$2", f = "MixStudioBaseViewModel.kt", l = {249, 249}, m = "invokeSuspend")
public final class C05Z6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends C0HOM<? extends List<? extends C440440HOw>>, ? extends C0HOM<? extends List<? extends C440440HOw>>>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0HKU LLILLL;
    public final /* synthetic */ C1372205Yq LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05Z6(C0HKU c0hku, C1372205Yq c1372205Yq, InterfaceC1364105Vn<? super C05Z6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0hku;
        this.LLILZ = c1372205Yq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05Z6 c05z6 = new C05Z6(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c05z6.LLILLJJLI = obj;
        return c05z6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0957 anonymousClass0957LIZIZ;
        Object obj2;
        C1C7U.LIZ("MixStudioBaseViewModel@9c39.navigateByStatus$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    obj2 = this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                    Pair pair = new Pair(obj2, obj);
                    C1C7U.LIZIZ("MixStudioBaseViewModel@9c39.navigateByStatus$2");
                    return pair;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anonymousClass0957LIZIZ = (AnonymousClass0957) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C05Z5(this.LLILLL, null), 3);
            anonymousClass0957LIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C05Z3(this.LLILZ, null), 3);
            this.LLILLJJLI = anonymousClass0957LIZIZ;
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MixStudioBaseViewModel@9c39.navigateByStatus$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI = obj;
        this.LL = 2;
        Object objLJLIIIL = anonymousClass0957LIZIZ.LJLIIIL(this);
        if (objLJLIIIL == objLJFF) {
            C1C7U.LIZIZ("MixStudioBaseViewModel@9c39.navigateByStatus$2");
            return objLJFF;
        }
        obj2 = obj;
        obj = objLJLIIIL;
        Pair pair2 = new Pair(obj2, obj);
        C1C7U.LIZIZ("MixStudioBaseViewModel@9c39.navigateByStatus$2");
        return pair2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends C0HOM<? extends List<? extends C440440HOw>>, ? extends C0HOM<? extends List<? extends C440440HOw>>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
