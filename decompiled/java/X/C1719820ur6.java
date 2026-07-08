package X;

import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.page.StellarPageViewModel;
import com.bytedance.pipo.stellar.base.resourceloader.StellarChunk;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS76S1000000_26;
import njp.a;

/* JADX INFO: renamed from: X.0ur6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.stellar.base.page.StellarPageViewModel$fetchData$2", f = "StellarPageViewModel.kt", l = {121}, m = "invokeSuspend")
public final class C1719820ur6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StellarPageViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Map<String, Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1719820ur6(StellarPageViewModel stellarPageViewModel, String str, String str2, Map<String, Object> map, InterfaceC1364105Vn<? super C1719820ur6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = stellarPageViewModel;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1719820ur6(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        String str2;
        BaseResponse baseResponse;
        BaseResponse baseResponse2;
        String str3;
        CardDO cardDO;
        C1C7U.LIZ("StellarPageViewModel@66e0.fetchData$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            StellarPageViewModel stellarPageViewModel = this.LLILLJJLI;
            String str4 = this.LLILLL;
            String str5 = this.LLILZ;
            Map<String, ? extends Object> map = this.LLILZIL;
            Long lLJFF = C2286608xc.LJFF(stellarPageViewModel.LLJILJIL);
            this.LL = 1;
            obj = stellarPageViewModel.AQ2(str4, str5, map, null, null, lLJFF, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StellarPageViewModel@66e0.fetchData$2");
                return objLJFF;
            }
        }
        C0X52 c0x52 = (C0X52) obj;
        boolean zYQ2 = false;
        if (c0x52 != null && c0x52.LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        String str6 = null;
        if (z && ((BaseResponse) c0x52.LIZIZ).LIZ()) {
            this.LLILLJJLI.xQ2((StellarChunk) ((BaseResponse) c0x52.LIZIZ).data, false);
            C1222130huN c1222130huN = C1222130huN.LIZ;
            C1719840ur8 c1719840ur8 = this.LLILLJJLI.LL;
            if (c1719840ur8 != null) {
                str3 = c1719840ur8.LLJILJIL;
            } else {
                str3 = null;
            }
            c1222130huN.getClass();
            C1222130huN.LIZIZ("STELLAR_EVENT_DATA_FETCH_SUCCESS", str3, null);
            StellarPageViewModel stellarPageViewModel2 = this.LLILLJJLI;
            StellarChunk stellarChunk = stellarPageViewModel2.LLILLJJLI;
            if (stellarChunk != null && (cardDO = stellarChunk.errorComponent) != null) {
                zYQ2 = StellarPageViewModel.yQ2(cardDO);
            }
            stellarPageViewModel2.LLJIJIL = !zYQ2;
        } else {
            C1716280ulO c1716280ulO = this.LLILLJJLI.LLILLL;
            c1716280ulO.getClass();
            c1716280ulO.LJFF = CardStruct.IStatusCode.DEFAULT;
            StellarPageViewModel stellarPageViewModel3 = this.LLILLJJLI;
            if (c0x52 != null && (baseResponse2 = (BaseResponse) c0x52.LIZIZ) != null) {
                str = baseResponse2.errorContent;
            } else {
                str = null;
            }
            stellarPageViewModel3.getClass();
            stellarPageViewModel3.setState(new AwS76S1000000_26(str, 51));
            C1222130huN c1222130huN2 = C1222130huN.LIZ;
            C1719840ur8 c1719840ur82 = this.LLILLJJLI.LL;
            if (c1719840ur82 != null) {
                str2 = c1719840ur82.LLJILJIL;
            } else {
                str2 = null;
            }
            if (c0x52 != null && (baseResponse = (BaseResponse) c0x52.LIZIZ) != null) {
                str6 = baseResponse.errorCode;
            }
            c1222130huN2.getClass();
            C1222130huN.LIZIZ("STELLAR_EVENT_DATA_FETCH_FAIL", str2, str6);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StellarPageViewModel@66e0.fetchData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
