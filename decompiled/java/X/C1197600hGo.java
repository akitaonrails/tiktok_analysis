package X;

import com.ss.android.ugc.aweme.poi.creator.PoiCreatorApi;
import com.ss.android.ugc.aweme.poi.creator.vm.PoiSearchCreatorVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS32S0010000_18;
import njp.a;

/* JADX INFO: renamed from: X.0hGo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.creator.vm.PoiSearchCreatorVM$fetchCreatorEnrollData$1", f = "PoiSearchCreatorVM.kt", l = {41}, m = "invokeSuspend")
public final class C1197600hGo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiSearchCreatorVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1197600hGo(PoiSearchCreatorVM poiSearchCreatorVM, InterfaceC1364105Vn<? super C1197600hGo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiSearchCreatorVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1197600hGo(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Boolean boolValueOf;
        boolean z;
        PoiCreatorApi.PoiCreatorEnrollData poiCreatorEnrollData;
        Integer num;
        C1C7U.LIZ("PoiSearchCreatorVM@a41a.fetchCreatorEnrollData$1");
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
            InterfaceC1197610hGp interfaceC1197610hGp = (InterfaceC1197610hGp) this.LLILLJJLI.LLILLJJLI.getValue().getOperator();
            this.LL = 1;
            obj = interfaceC1197610hGp.LLZIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PoiSearchCreatorVM@a41a.fetchCreatorEnrollData$1");
                return objLJFF;
            }
        }
        PoiCreatorApi.PoiCreatorEnrollDataResponse poiCreatorEnrollDataResponse = (PoiCreatorApi.PoiCreatorEnrollDataResponse) obj;
        if (poiCreatorEnrollDataResponse != null) {
            if (poiCreatorEnrollDataResponse.status_code == 0 && (poiCreatorEnrollData = poiCreatorEnrollDataResponse.poiEnrollData) != null && (num = poiCreatorEnrollData.creatorEnrollStatusEnum) != null && num.intValue() == 4) {
                z = true;
            } else {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        if (C1189060h32.LJIILJJIL(boolValueOf)) {
            PoiSearchCreatorVM poiSearchCreatorVM = this.LLILLJJLI;
            poiSearchCreatorVM.LL = true;
            poiSearchCreatorVM.setState(new AwS32S0010000_18(true, 22));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiSearchCreatorVM@a41a.fetchCreatorEnrollData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
