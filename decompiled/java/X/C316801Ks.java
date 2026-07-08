package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.onthisday.OnThisDayRequestApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Ks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.onthisday.OnThisDayAwemeRepository$sendViewedMemorableVideo$1", f = "OnThisDayAwemeRepository.kt", l = {79}, m = "invokeSuspend")
public final class C316801Ks extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316801Ks(String str, InterfaceC1364105Vn<? super C316801Ks> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C316801Ks(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OnThisDayAwemeRepository@cb06.sendViewedMemorableVideo$1");
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
            OnThisDayRequestApi onThisDayRequestApi = (OnThisDayRequestApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(OnThisDayRequestApi.class);
            String str = this.LLILLJJLI;
            this.LL = 1;
            if (onThisDayRequestApi.sendViewedMemorableView(str, this) == objLJFF) {
                C1C7U.LIZIZ("OnThisDayAwemeRepository@cb06.sendViewedMemorableVideo$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OnThisDayAwemeRepository@cb06.sendViewedMemorableVideo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
