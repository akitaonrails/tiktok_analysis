package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Rb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.entitycard.api.SearchEntityCardCacheManager$get$2$1", f = "SearchEntityCardCacheManager.kt", l = {56, 55}, m = "invokeSuspend")
public final class C333301Rb extends C09AX implements Function2<InterfaceC346701Wf<? super InterfaceC346201Wa<? extends C0O7A<C628380Okm>>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333301Rb(String str, long j, String str2, int i, int i2, InterfaceC1364105Vn<? super C333301Rb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = j;
        this.LLILZIL = str2;
        this.LLILZLL = i;
        this.LLIZ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C333301Rb c333301Rb = new C333301Rb(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c333301Rb.LLILLJJLI = obj;
        return c333301Rb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        C1C7U.LIZ("SearchEntityCardCacheManager@717d.get$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SearchEntityCardCacheManager@717d.get$2$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            InterfaceC333401Rc interfaceC333401Rc = (InterfaceC333401Rc) ((InterfaceC736910SvR) C628640OlC.LIZLLL.getValue()).getOperator();
            String str = this.LLILLL;
            long j = this.LLILZ;
            String str2 = this.LLILZIL;
            int i2 = this.LLILZLL;
            int i3 = this.LLIZ;
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            obj = interfaceC333401Rc.LJJZZIII(str, j, str2, i2, i3);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchEntityCardCacheManager@717d.get$2$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC346701Wf.emit(obj, this) == objLJFF) {
            C1C7U.LIZIZ("SearchEntityCardCacheManager@717d.get$2$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchEntityCardCacheManager@717d.get$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super InterfaceC346201Wa<? extends C0O7A<C628380Okm>>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
