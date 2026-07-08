package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NwJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem$showNoAnchorGuide$4", f = "EcVideoGuideAssem.kt", l = {570, 575}, m = "invokeSuspend")
public final class C610050NwJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Map<String, Integer> LLILLJJLI;
    public final /* synthetic */ EcVideoGuideAssem LLILLL;
    public final /* synthetic */ ReachCfg LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610050NwJ(Map<String, Integer> map, EcVideoGuideAssem ecVideoGuideAssem, ReachCfg reachCfg, int i, InterfaceC1364105Vn<? super C610050NwJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = map;
        this.LLILLL = ecVideoGuideAssem;
        this.LLILZ = reachCfg;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C610050NwJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Response response;
        C1C7U.LIZ("EcVideoGuideAssem@5df3.showNoAnchorGuide$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    EcVideoGuideAssem.LLLLLJIL.getClass();
                    EcVideoGuideAssem.LLLLLL.remove(((VideoItemParams) C631370Opb.LIZ(this.LLILLL)).getAweme().getAid());
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EcVideoGuideAssem@5df3.showNoAnchorGuide$4");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            Map<String, Integer> map = this.LLILLJJLI;
            C610060NwK c610060NwK = new C610060NwK(this.LLILZ, this.LLILZIL, null);
            this.LL = 1;
            obj = C2381909Uz.LIZJ("homepage_hot", map, this, c610060NwK);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcVideoGuideAssem@5df3.showNoAnchorGuide$4");
                return objLJFF;
            }
        }
        C0X52 c0x52 = (C0X52) obj;
        if (c0x52 != null && (response = (Response) c0x52.LIZIZ) != null && response.isCodeOK()) {
            this.LL = 2;
            if (AnonymousClass0958.LIZIZ(86400000L, this) == objLJFF) {
                C1C7U.LIZIZ("EcVideoGuideAssem@5df3.showNoAnchorGuide$4");
                return objLJFF;
            }
        }
        EcVideoGuideAssem.LLLLLJIL.getClass();
        EcVideoGuideAssem.LLLLLL.remove(((VideoItemParams) C631370Opb.LIZ(this.LLILLL)).getAweme().getAid());
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EcVideoGuideAssem@5df3.showNoAnchorGuide$4");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
