package X;

import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.LoadMoreResponse;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.TakoNimbleApi;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cv4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.TakoNimbleRepository$queryLoadMoreAweme$2", f = "TakoNimbleRepository.kt", l = {45, 54}, m = "invokeSuspend")
public final class C329000Cv4 extends C09AX implements Function2<InterfaceC346701Wf<? super LoadMoreResponse>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C329070CvB LLILLL;
    public final /* synthetic */ C329020Cv6 LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Integer LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329000Cv4(C329070CvB c329070CvB, C329020Cv6 c329020Cv6, int i, Integer num, InterfaceC1364105Vn<? super C329000Cv4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c329070CvB;
        this.LLILZ = c329020Cv6;
        this.LLILZIL = i;
        this.LLILZLL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C329000Cv4 c329000Cv4 = new C329000Cv4(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c329000Cv4.LLILLJJLI = obj;
        return c329000Cv4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        C1C7U.LIZ("TakoNimbleRepository@e7fc.queryLoadMoreAweme$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoNimbleRepository@e7fc.queryLoadMoreAweme$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            TakoNimbleApi takoNimbleApi = (TakoNimbleApi) this.LLILLL.LIZ.getValue();
            this.LLILZ.getClass();
            HashMap map = new HashMap(this.LLILZ.LIZIZ);
            int i2 = this.LLILZIL;
            C329020Cv6 c329020Cv6 = this.LLILZ;
            Integer num = this.LLILZLL;
            map.put("offset", String.valueOf(i2));
            map.put("unique_key", c329020Cv6.LIZ);
            if (num != null) {
                map.put("count", String.valueOf(num.intValue()));
            }
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            obj = takoNimbleApi.loadMore("/aweme/v2/search/loadmore/", map, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoNimbleRepository@e7fc.queryLoadMoreAweme$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC346701Wf.emit(obj, this) == objLJFF) {
            C1C7U.LIZIZ("TakoNimbleRepository@e7fc.queryLoadMoreAweme$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoNimbleRepository@e7fc.queryLoadMoreAweme$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super LoadMoreResponse> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
