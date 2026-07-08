package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachGetParams;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0NwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem$requestInterest$2", f = "EcVideoGuideAssem.kt", l = {609}, m = "invokeSuspend")
public final class C610160NwU extends C09AX implements Function1<InterfaceC1364105Vn<? super C0X52<Response<FeedReachResponse>>>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ EcVideoGuideAssem LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ List<String> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610160NwU(int i, int i2, EcVideoGuideAssem ecVideoGuideAssem, int i3, int i4, String str, List<String> list, InterfaceC1364105Vn<? super C610160NwU> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = ecVideoGuideAssem;
        this.LLILZIL = i3;
        this.LLILZLL = i4;
        this.LLIZ = str;
        this.LLIZLLLIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C610160NwU(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C0X52<Response<FeedReachResponse>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIIZILJ = obj;
        C1C7U.LIZ("EcVideoGuideAssem@5df3.requestInterest$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIIZILJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIIZILJ);
            C0CXF.LIZ.getClass();
            boolean zLIZJ = C0CXF.LIZJ();
            n nVar = new n();
            C2399609ak.LJFF(nVar, "interest_level", C2286608xc.LJ(this.LLILLJJLI));
            C2399609ak.LJII(nVar, "interest_types", new int[]{this.LLILLL});
            FeedReachGetParams feedReachGetParams = new FeedReachGetParams(null, ((VideoItemParams) C631370Opb.LIZ(this.LLILZ)).getAweme().getAid(), AwemeExtKt.getAuthorUid(((VideoItemParams) C631370Opb.LIZ(this.LLILZ)).getAweme()), zLIZJ ? 1 : 0, this.LLILZIL, nVar, C2286608xc.LJ(this.LLILZLL), this.LLIZ, this.LLIZLLLIL, null);
            InterfaceC610090NwN interfaceC610090NwN = (InterfaceC610090NwN) C0NSL.LIZ().create(InterfaceC610090NwN.class);
            this.LL = 1;
            objLJIIZILJ = interfaceC610090NwN.LJIIZILJ(feedReachGetParams, this);
            if (objLJIIZILJ == objLJFF) {
                C1C7U.LIZIZ("EcVideoGuideAssem@5df3.requestInterest$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EcVideoGuideAssem@5df3.requestInterest$2");
        return objLJIIZILJ;
    }
}
