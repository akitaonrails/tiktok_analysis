package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.RecommendListResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08jn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.CreatorVideoRepository$operator$1$fetchCreatorVideoList$2", f = "CreatorVideoRepository.kt", l = {27, 28}, m = "invokeSuspend")
public final class C2200908jn extends C09AX implements Function2<InterfaceC346701Wf<? super Response<RecommendListResponse>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2200908jn(Map<String, Object> map, InterfaceC1364105Vn<? super C2200908jn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2200908jn c2200908jn = new C2200908jn(this.LLILLL, interfaceC1364105Vn);
        c2200908jn.LLILLJJLI = obj;
        return c2200908jn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        InterfaceC2207608ks interfaceC2207608ks;
        C1C7U.LIZ("CreatorVideoRepository@a445.operator$1$fetchCreatorVideoList$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CreatorVideoRepository@a445.operator$1$fetchCreatorVideoList$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C2207808ku c2207808ku = InterfaceC2207608ks.LIZ;
            Map<String, Object> map = this.LLILLL;
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            c2207808ku.getClass();
            InterfaceC2661011f interfaceC2661011f = C2207808ku.LIZIZ;
            if (interfaceC2661011f != null && (interfaceC2207608ks = (InterfaceC2207608ks) interfaceC2661011f.create(InterfaceC2207608ks.class)) != null) {
                obj = interfaceC2207608ks.LIZIZ(map, this);
                if (obj != C099R.LJFF()) {
                    obj = (Response) obj;
                }
            } else {
                obj = null;
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CreatorVideoRepository@a445.operator$1$fetchCreatorVideoList$2");
                return objLJFF;
            }
        }
        if (obj != null) {
            this.LLILLJJLI = null;
            this.LL = 2;
            if (interfaceC346701Wf.emit(obj, this) == objLJFF) {
                C1C7U.LIZIZ("CreatorVideoRepository@a445.operator$1$fetchCreatorVideoList$2");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CreatorVideoRepository@a445.operator$1$fetchCreatorVideoList$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super Response<RecommendListResponse>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
