package X;

import com.ss.android.ugc.aweme.im.common.experiment.ImReplyToStickerSettings;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.replytosticker.ReplyToStickerRecommendationViewModel;
import com.ss.android.ugc.aweme.im.service.analytics.IMessageAnalyticsUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS585S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0Hpy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.replytosticker.ReplyToStickerRecommendationViewModel$fireRecommendationTask$1", f = "ReplyToStickerRecommendationViewModel.kt", l = {349}, m = "invokeSuspend")
public final class C453240Hpy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0HJO LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ ReplyToStickerRecommendationViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C453240Hpy(C0HJO c0hjo, C869590Y9l c869590Y9l, String str, ReplyToStickerRecommendationViewModel replyToStickerRecommendationViewModel, InterfaceC1364105Vn<? super C453240Hpy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0hjo;
        this.LLILLL = c869590Y9l;
        this.LLILZ = str;
        this.LLILZIL = replyToStickerRecommendationViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C453240Hpy(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C892320YzW c892320YzWLJIIIIZZ;
        C1C7U.LIZ("ReplyToStickerRecommendationViewModel@af6a.fireRecommendationTask$1");
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
            Function1<InterfaceC1364105Vn<? super List<StickerItem>>, Object> function1 = this.LLILLJJLI.LIZIZ;
            this.LL = 1;
            obj = function1.invoke(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ReplyToStickerRecommendationViewModel@af6a.fireRecommendationTask$1");
                return objLJFF;
            }
        }
        List list = (List) obj;
        if (!list.isEmpty() && list.size() >= ((ImReplyToStickerSettings.Config) ImReplyToStickerSettings.LIZIZ.getValue()).minStickersNumber) {
            IMessageAnalyticsUtils.LIZ.getClass();
            IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ = C892250YzP.LIZ();
            String str = null;
            if (iMessageAnalyticsUtilsLIZ != null && (c892320YzWLJIIIIZZ = iMessageAnalyticsUtilsLIZ.LJIIIIZZ(this.LLILLL, null)) != null) {
                str = c892320YzWLJIIIIZZ.LIZ;
            }
            C452920HpS c452920HpS = new C452920HpS(str, this.LLILZ, list);
            if (this.LLILZIL.LLJILJIL) {
                this.LLILZIL.setState(new AwS585S0100000_6(c452920HpS, 333));
                if (C06RM.LIZ()) {
                    this.LLILZIL.LLJIJIL = c452920HpS;
                }
            } else {
                this.LLILZIL.LLJIJIL = c452920HpS;
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ReplyToStickerRecommendationViewModel@af6a.fireRecommendationTask$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ReplyToStickerRecommendationViewModel@af6a.fireRecommendationTask$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
