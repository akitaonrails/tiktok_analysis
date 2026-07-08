package X;

import com.ss.android.ugc.aweme.poi.creator.PoiCreatorApi;
import com.ss.android.ugc.aweme.poi.creator.PoiCreatorVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS105S0110000_18;
import kotlin.jvm.internal.AwS32S0001000_18;
import njp.a;

/* JADX INFO: renamed from: X.0hGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.creator.PoiCreatorVM$initUIState$1", f = "PoiCreatorVM.kt", l = {302}, m = "invokeSuspend")
public final class C1197550hGj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PoiCreatorVM LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1197550hGj(PoiCreatorVM poiCreatorVM, boolean z, InterfaceC1364105Vn<? super C1197550hGj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = poiCreatorVM;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1197550hGj c1197550hGj = new C1197550hGj(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1197550hGj.LLILLJJLI = obj;
        return c1197550hGj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiCreatorVM@a397.initUIState$1");
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
            Object obj2 = this.LLILLJJLI;
            C1199030hJ7 c1199030hJ7 = PoiCreatorApi.LIZ;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            obj = c1199030hJ7.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PoiCreatorVM@a397.initUIState$1");
                return objLJFF;
            }
        }
        PoiCreatorApi.PoiCreatorBaseConfigResponse poiCreatorBaseConfigResponse = (PoiCreatorApi.PoiCreatorBaseConfigResponse) obj;
        int i2 = -1;
        if (poiCreatorBaseConfigResponse != null) {
            this.LLILLL.setState(new AwS105S0110000_18(poiCreatorBaseConfigResponse, this.LLILZ, 9));
            C1197540hGi c1197540hGi = C1197540hGi.LIZ;
            Integer num = poiCreatorBaseConfigResponse.code;
            if (num != null && num.intValue() == 200) {
                i2 = 0;
            }
            c1197540hGi.getClass();
            c1197540hGi.LIZJ("influencer_extension_api", new AwS32S0001000_18(i2, 1));
        } else {
            this.LLILLL.setState(AFwS256S0000000_18.get$arr$(344));
            C1197540hGi c1197540hGi2 = C1197540hGi.LIZ;
            c1197540hGi2.getClass();
            c1197540hGi2.LIZJ("influencer_extension_api", new AwS32S0001000_18(-1, 1));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiCreatorVM@a397.initUIState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
