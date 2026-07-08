package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.repo.ChangeLiveSettingRequest;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.repo.HighlightsNetApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NSo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.script.ECScriptView$openSheet$sheet$1$1", f = "ECScriptView.kt", l = {313}, m = "invokeSuspend")
public final class C594280NSo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass1814 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C594280NSo(AnonymousClass1814 anonymousClass1814, InterfaceC1364105Vn<? super C594280NSo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass1814;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C594280NSo(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECScriptView@44fc.openSheet$sheet$1$1");
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
            C0NSS.LIZ.getClass();
            HighlightsNetApi highlightsNetApi = (HighlightsNetApi) C0NSS.LIZ(HighlightsNetApi.class);
            ChangeLiveSettingRequest changeLiveSettingRequest = new ChangeLiveSettingRequest(C2286608xc.LJ(7), "2", this.LLILLJJLI.getAuthorId());
            this.LL = 1;
            if (highlightsNetApi.changeLiveSetting(changeLiveSettingRequest, this) == objLJFF) {
                C1C7U.LIZIZ("ECScriptView@44fc.openSheet$sheet$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECScriptView@44fc.openSheet$sheet$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
