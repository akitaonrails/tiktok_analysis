package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.creatorvideo.SeaPdpCreatorVideoModuleDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.repository.api.RecommendListResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.repository.api.SeaPdpCreatorVideoApi;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Y6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.videocreator.SeaPdpCreatorVideoMgr$fetchCreatorVideoList$1$1", f = "SeaPdpCreatorVideoMgr.kt", l = {105, 130, 130, 130}, m = "invokeSuspend")
public final class C09Y6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ C09YH LLILZ;
    public final /* synthetic */ C259800zU<Integer> LLILZIL;
    public final /* synthetic */ C259800zU<String> LLILZLL;
    public final /* synthetic */ C259800zU<String> LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09Y6(Map<String, Object> map, C09YH c09yh, C259800zU<Integer> c259800zU, C259800zU<String> c259800zU2, C259800zU<String> c259800zU3, long j, String str, InterfaceC1364105Vn<? super C09Y6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = map;
        this.LLILZ = c09yh;
        this.LLILZIL = c259800zU;
        this.LLILZLL = c259800zU2;
        this.LLIZ = c259800zU3;
        this.LLIZLLLIL = j;
        this.LLJ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09Y6(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        SeaPdpCreatorVideoModuleDTO seaPdpCreatorVideoModuleDTO;
        AbstractC1623806Xk<SeaPdpCreatorVideoModuleDTO> c491001vg;
        Integer numLJ;
        String str;
        T tLJ;
        T t;
        T t2;
        RecommendListResponse recommendListResponse;
        Object recommendList = obj;
        C1C7U.LIZ("SeaPdpCreatorVideoMgr@e5e1.fetchCreatorVideoList$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJFF(th, "fetchCreatorVideoList");
                this.LLILZ.LIZJ = new C491001vg(th);
                C09YH c09yh = this.LLILZ;
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZLLLIL;
                Integer numLJ2 = C2286608xc.LJ(-2000);
                String message = th.getMessage();
                AbstractC1623806Xk<SeaPdpCreatorVideoModuleDTO> abstractC1623806Xk = this.LLILZ.LIZJ;
                String str2 = this.LLJ;
                c09yh.getClass();
                C09YH.LIZ(jCurrentTimeMillis, numLJ2, message, abstractC1623806Xk, str2, null);
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C09Y7 c09y7 = new C09Y7(this.LLILZ, null);
                this.LLILLJJLI = 3;
                if (C23250099c.LJI(this, abstractC2238408pq, c09y7) == objLJFF) {
                    C1C7U.LIZIZ("SeaPdpCreatorVideoMgr@e5e1.fetchCreatorVideoList$1$1");
                    return objLJFF;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
                C09Y7 c09y72 = new C09Y7(this.LLILZ, null);
                this.LL = th2;
                this.LLILLJJLI = 4;
                if (C23250099c.LJI(this, abstractC2238408pq2, c09y72) == objLJFF) {
                    C1C7U.LIZIZ("SeaPdpCreatorVideoMgr@e5e1.fetchCreatorVideoList$1$1");
                    return objLJFF;
                }
                throw th2;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th3 = (Throwable) this.LL;
                    C155000ia.LIZIZ(recommendList);
                    throw th3;
                }
                C155000ia.LIZIZ(recommendList);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SeaPdpCreatorVideoMgr@e5e1.fetchCreatorVideoList$1$1");
                return unit;
            }
            C155000ia.LIZIZ(recommendList);
        } else {
            C155000ia.LIZIZ(recommendList);
            SeaPdpCreatorVideoApi.Companion companion = SeaPdpCreatorVideoApi.LIZ;
            Map<String, Object> map = this.LLILLL;
            this.LLILLJJLI = 1;
            recommendList = companion.getRecommendList(map, this);
            if (recommendList == objLJFF) {
                C1C7U.LIZIZ("SeaPdpCreatorVideoMgr@e5e1.fetchCreatorVideoList$1$1");
                return objLJFF;
            }
        }
        Response response = (Response) recommendList;
        if (response != null && (recommendListResponse = (RecommendListResponse) response.data) != null) {
            seaPdpCreatorVideoModuleDTO = recommendListResponse.seaData;
        } else {
            seaPdpCreatorVideoModuleDTO = null;
        }
        C09YH c09yh2 = this.LLILZ;
        if (response != null && response.isCodeOK()) {
            if (seaPdpCreatorVideoModuleDTO == null) {
                seaPdpCreatorVideoModuleDTO = new SeaPdpCreatorVideoModuleDTO(null, null, C13BV.INSTANCE, null, null, null);
            }
            c491001vg = new C1623606Xi<>(seaPdpCreatorVideoModuleDTO);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchCreatorVideoList fail: ");
            if (response == null) {
                numLJ = null;
            } else {
                numLJ = C2286608xc.LJ(response.code);
            }
            sbLIZ.append(numLJ);
            sbLIZ.append(", ");
            if (response == null) {
                str = null;
            } else {
                str = response.message;
            }
            sbLIZ.append(str);
            c491001vg = new C491001vg<>(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ)));
        }
        c09yh2.LIZJ = c491001vg;
        C259800zU<Integer> c259800zU = this.LLILZIL;
        if (response != null) {
            tLJ = C2286608xc.LJ(response.code);
        } else {
            tLJ = 0;
        }
        c259800zU.element = tLJ;
        C259800zU<String> c259800zU2 = this.LLILZLL;
        if (response != null) {
            t = response.message;
        } else {
            t = 0;
        }
        c259800zU2.element = t;
        C259800zU<String> c259800zU3 = this.LLIZ;
        if (response != null) {
            t2 = response.logId;
        } else {
            t2 = 0;
        }
        c259800zU3.element = t2;
        C09YH c09yh3 = this.LLILZ;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LLIZLLLIL;
        Integer num = this.LLILZIL.element;
        String str3 = this.LLILZLL.element;
        AbstractC1623806Xk<SeaPdpCreatorVideoModuleDTO> abstractC1623806Xk2 = this.LLILZ.LIZJ;
        String str4 = this.LLJ;
        String str5 = this.LLIZ.element;
        c09yh3.getClass();
        C09YH.LIZ(jCurrentTimeMillis2, num, str3, abstractC1623806Xk2, str4, str5);
        C1DFH c1dfh2 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq3 = C2107308Nj.LIZ;
        C09Y7 c09y73 = new C09Y7(this.LLILZ, null);
        this.LLILLJJLI = 2;
        if (C23250099c.LJI(this, abstractC2238408pq3, c09y73) == objLJFF) {
            C1C7U.LIZIZ("SeaPdpCreatorVideoMgr@e5e1.fetchCreatorVideoList$1$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpCreatorVideoMgr@e5e1.fetchCreatorVideoList$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
