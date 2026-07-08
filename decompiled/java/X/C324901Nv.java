package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftRetrofitApi;
import com.bytedance.android.livesdk.guide.model.GuideReportResponse;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdk.model.message.GuideTarget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Nv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.guide.utils.GiftGuideUtils$reportGiftGuideClose$1", f = "GiftGuideUtils.kt", l = {254}, m = "invokeSuspend")
public final class C324901Nv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ GiftGuideMessage LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324901Nv(long j, GiftGuideMessage giftGuideMessage, int i, InterfaceC1364105Vn<? super C324901Nv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = giftGuideMessage;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C324901Nv c324901Nv = new C324901Nv(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c324901Nv.LLILLJJLI = obj;
        return c324901Nv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJFF;
        C1C7U.LIZ("GiftGuideUtils@574d.reportGiftGuideClose$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                long j = this.LLILLL;
                GiftGuideMessage giftGuideMessage = this.LLILZ;
                int i2 = this.LLILZIL;
                C480460Ism.LIZ().getClass();
                GiftRetrofitApi giftRetrofitApi = (GiftRetrofitApi) C480460Ism.LIZLLL(GiftRetrofitApi.class);
                String str = giftGuideMessage.guideType;
                GuideTarget guideTarget = giftGuideMessage.guideTarget;
                if (guideTarget != null) {
                    lLJFF = C2286608xc.LJFF(guideTarget.targetId);
                } else {
                    lLJFF = null;
                }
                C11NZ<C470590Icr<GuideReportResponse.Data>> c11nzReportGiftGuide = giftRetrofitApi.reportGiftGuide(j, str, i2, String.valueOf(lLJFF), CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT);
                this.LL = 1;
                obj = C11UD.LIZJ(c11nzReportGiftGuide, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GiftGuideUtils@574d.reportGiftGuideClose$1");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl((C470590Icr) obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftGuideUtils@574d.reportGiftGuideClose$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
