package X;

import Y.AfS171S0100000_2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto.MixFeedApiConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto.SessionInfo;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto.WriteImpressionRequest;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.utils.ECMixFeedExtra;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.12B0, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.detailpage.ECMixFeedDetailPageComponent$onViewCreated$2$onPageSelected$1", f = "ECMixFeedDetailPageComponent.kt", l = {105, 117}, m = "invokeSuspend")
public final class C12B0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C12B4 LLILLL;
    public final /* synthetic */ C2189821An6 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12B0(C12B4 c12b4, C2189821An6 c2189821An6, InterfaceC1364105Vn<? super C12B0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c12b4;
        this.LLILZ = c2189821An6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C12B0 c12b0 = new C12B0(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c12b0.LLILLJJLI = obj;
        return c12b0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MixFeedApiConfig mixFeedApiConfig;
        Object objLLJLILLLLZIIL = obj;
        C1C7U.LIZ("ECMixFeedDetailPageComponent@b5f1.onViewCreated$2$onPageSelected$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLLJLILLLLZIIL);
                C189200o6.m2constructorimpl(objLLJLILLLLZIIL);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ECMixFeedDetailPageComponent@b5f1.onViewCreated$2$onPageSelected$1");
                return unit;
            }
            C155000ia.LIZIZ(objLLJLILLLLZIIL);
        } else {
            C155000ia.LIZIZ(objLLJLILLLLZIIL);
            C12B4 c12b4 = this.LLILLL;
            C2189821An6 c2189821An6 = this.LLILZ;
            WriteImpressionRequest writeImpressionRequest = new WriteImpressionRequest("content_in_stream_feed", "default", C1697810uHb.LJIILJJIL(new Feed(c12b4.LIZJ, c12b4.LIZLLL, null, null, null, c12b4.LJII, null)), new SessionInfo(c12b4.LIZIZ));
            C127Y c127y = C127Z.LLILLJJLI.getValue().LL;
            C1735810vGt.LIZ.getClass();
            ECMixFeedExtra eCMixFeedExtraLIZIZ = C1735810vGt.LIZIZ(c2189821An6);
            if (eCMixFeedExtraLIZIZ != null) {
                mixFeedApiConfig = eCMixFeedExtraLIZIZ.apiConfig;
            } else {
                mixFeedApiConfig = null;
            }
            this.LL = 1;
            objLLJLILLLLZIIL = c127y.LLJLILLLLZIIL(writeImpressionRequest, mixFeedApiConfig);
            if (objLLJLILLLLZIIL == objLJFF) {
                C1C7U.LIZIZ("ECMixFeedDetailPageComponent@b5f1.onViewCreated$2$onPageSelected$1");
                return objLJFF;
            }
        }
        C11NZ c11nz = (C11NZ) objLLJLILLLLZIIL;
        this.LLILLJJLI = c11nz;
        this.LL = 2;
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
        c2252611DEt.LJIJJ();
        c2252611DEt.LJJII(new AwS581S0100000_2(c11nz.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS171S0100000_2(c2252611DEt, 13), new AfS171S0100000_2(c2252611DEt, 14)), 165));
        objLLJLILLLLZIIL = c2252611DEt.LJIJ();
        if (objLLJLILLLLZIIL == C099R.LJFF()) {
            C099Q.LIZJ(this);
        }
        if (objLLJLILLLLZIIL == objLJFF) {
            C1C7U.LIZIZ("ECMixFeedDetailPageComponent@b5f1.onViewCreated$2$onPageSelected$1");
            return objLJFF;
        }
        C189200o6.m2constructorimpl(objLLJLILLLLZIIL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ECMixFeedDetailPageComponent@b5f1.onViewCreated$2$onPageSelected$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
