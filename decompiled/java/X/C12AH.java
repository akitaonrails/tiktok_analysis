package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.recommendationcard.data.BusinessInfo;
import com.ss.android.ugc.aweme.recommendationcard.data.CardMaterials;
import com.ss.android.ugc.aweme.recommendationcard.data.FeedCardEventTrackInfo;
import com.ss.android.ugc.aweme.recommendationcard.data.FeedCardTemplate;
import com.ss.android.ugc.aweme.recommendationcard.data.FeedEventCardInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12AH, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.recommendationcard.data.ParseCardMaterialsUseCase$execute$2", f = "ParseCardMaterialsUseCase.kt", l = {}, m = "invokeSuspend")
public final class C12AH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends CardMaterials, ? extends String>>, Object> {
    public final /* synthetic */ Aweme LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12AH(Aweme aweme, InterfaceC1364105Vn<? super C12AH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C12AH(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String cardInsertStatus;
        String str;
        String str2;
        FeedEventCardInfo feedEventCardInfo;
        FeedCardTemplate feedCardTemplate;
        FeedCardEventTrackInfo feedCardEventTrackInfo;
        CardInsertInfo cardInsertInfo;
        C1C7U.LIZ("ParseCardMaterialsUseCase@a7e8.execute$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            Gson gsonLIZ = C19598511m3.LIZ();
            Aweme aweme = this.LL;
            if (aweme != null && (cardInsertInfo = aweme.getCardInsertInfo()) != null) {
                cardInsertStatus = cardInsertInfo.getCardInsertStatus();
            } else {
                cardInsertStatus = null;
            }
            C12AG.LIZ = (CardMaterials) GsonProtectorUtils.fromJson(gsonLIZ, cardInsertStatus, CardMaterials.class);
            Gson gsonLIZ2 = C19598511m3.LIZ();
            CardMaterials cardMaterials = C12AG.LIZ;
            if (cardMaterials != null && (feedEventCardInfo = cardMaterials.feedEventCardInfo) != null && (feedCardTemplate = feedEventCardInfo.feedCardTemplate) != null && (feedCardEventTrackInfo = feedCardTemplate.feedCardEventTrackInfo) != null) {
                str = feedCardEventTrackInfo.businessInfo;
            } else {
                str = null;
            }
            C12AG.LIZIZ = (BusinessInfo) GsonProtectorUtils.fromJson(gsonLIZ2, str, BusinessInfo.class);
            CardMaterials cardMaterials2 = C12AG.LIZ;
            BusinessInfo businessInfo = C12AG.LIZIZ;
            if (businessInfo != null) {
                str2 = businessInfo.musicId;
            } else {
                str2 = null;
            }
            Pair pair = new Pair(cardMaterials2, str2);
            C1C7U.LIZIZ("ParseCardMaterialsUseCase@a7e8.execute$2");
            return pair;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C12AG.LIZ = null;
            C12AG.LIZIZ = null;
            C201955140j.LJI("ParseCardMaterialsUseCase execute error", e);
            Pair pair2 = new Pair(null, null);
            C1C7U.LIZIZ("ParseCardMaterialsUseCase@a7e8.execute$2");
            return pair2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends CardMaterials, ? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
