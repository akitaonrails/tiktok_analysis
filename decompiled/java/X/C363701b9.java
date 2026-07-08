package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01b9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinImageGeckoManagerV2$fetchResource$1", f = "BulletinImageGeckoManagerV2.kt", l = {248, 263}, m = "invokeSuspend")
public final class C363701b9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ AbstractC2252651DEx LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, C1533790q13, InterfaceC1364105Vn<? super Unit>, Object> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C363701b9(AbstractC2252651DEx abstractC2252651DEx, String str, String str2, String str3, InterfaceC1631620sYq<? super Boolean, ? super C1533790q13, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq, InterfaceC1364105Vn<? super C363701b9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = abstractC2252651DEx;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C363701b9(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinImageGeckoManagerV2@3246.fetchResource$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BulletinImageGeckoManagerV2@3246.fetchResource$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILZLL;
            String str2 = this.LLIZ;
            String str3 = this.LLIZLLLIL;
            this.LL = str;
            this.LLILLJJLI = str2;
            this.LLILLL = str3;
            this.LLILZ = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            Forest forest = (Forest) C363301b5.LIZ.getValue();
            RequestParams requestParams = new RequestParams(null, 1, null);
            requestParams.channel = str2;
            requestParams.bundle = str3;
            requestParams.waitGeckoUpdate = true;
            requestParams.enableRequestReuse = true;
            requestParams.enableMemoryCache = true;
            forest.fetchResourceAsync(str, requestParams, new C5183020f(c23260099m, 256));
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinImageGeckoManagerV2@3246.fetchResource$1");
                return objLJFF;
            }
        }
        AbstractC2252651DEx abstractC2252651DEx = this.LLILZIL;
        C363601b8 c363601b8 = new C363601b8((C1533790q13) obj, this.LLJ, null);
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = 2;
        if (C23250099c.LJI(this, abstractC2252651DEx, c363601b8) == objLJFF) {
            C1C7U.LIZIZ("BulletinImageGeckoManagerV2@3246.fetchResource$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BulletinImageGeckoManagerV2@3246.fetchResource$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
