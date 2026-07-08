package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.RecommendImpressionItem;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.RecommendSessionInfo;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.WriteImpressionRequest;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09YM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.innerfeed.SeaPdpCreatorVideoDetailPageComponent$onViewCreated$1$onPageSelected$1", f = "SeaPdpCreatorVideoDetailPageComponent.kt", l = {115}, m = "invokeSuspend")
public final class C09YM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2189821An6 LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09YM(Aweme aweme, C2189821An6 c2189821An6, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2189821An6;
        this.LLILLL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09YM(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLIZIZ;
        Integer numLIZIZ2;
        Integer numLJ;
        C1C7U.LIZ("SeaPdpCreatorVideoDetailPageComponent@2e3a.onViewCreated$1$onPageSelected$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = false;
        String str = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                String str2 = this.LLILLJJLI.getExtra().get(Scene.SCENE_SERVICE);
                RecommendImpressionItem[] recommendImpressionItemArr = new RecommendImpressionItem[1];
                String str3 = this.LLILLJJLI.getExtra().get("feed_type");
                if (str3 != null) {
                    numLIZIZ = C123100dR.LIZIZ(str3);
                } else {
                    numLIZIZ = null;
                }
                String str4 = this.LLILLJJLI.getExtra().get("feed_sub_type");
                if (str4 != null) {
                    numLIZIZ2 = C123100dR.LIZIZ(str4);
                } else {
                    numLIZIZ2 = null;
                }
                recommendImpressionItemArr[0] = new RecommendImpressionItem(numLIZIZ, numLIZIZ2, this.LLILLL.getAid());
                WriteImpressionRequest writeImpressionRequest = new WriteImpressionRequest(str2, C1697810uHb.LJIILJJIL(recommendImpressionItemArr), new RecommendSessionInfo(this.LLILLJJLI.getExtra().get("session_id")));
                C09YK c09yk = C09YL.LIZ;
                this.LL = 1;
                c09yk.getClass();
                obj = C09YK.LIZ(writeImpressionRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SeaPdpCreatorVideoDetailPageComponent@2e3a.onViewCreated$1$onPageSelected$1");
                    return objLJFF;
                }
            }
            Response response = (Response) obj;
            if (response != null && !response.isCodeOK()) {
                z = true;
            }
            if (z) {
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sea_pdp_creator_video, inner feed write impression, fail: ");
                if (response == null) {
                    numLJ = null;
                } else {
                    numLJ = C2286608xc.LJ(response.code);
                }
                sbLIZ.append(numLJ);
                sbLIZ.append(' ');
                if (response != null) {
                    str = response.message;
                }
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZJ(strLIZIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sea_pdp_creator_video, inner feed write impression exception: ");
            sbLIZ2.append(e.getMessage());
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c2341109Fh2.getClass();
            C2341109Fh.LIZJ(strLIZIZ2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpCreatorVideoDetailPageComponent@2e3a.onViewCreated$1$onPageSelected$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
