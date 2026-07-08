package X;

import com.ss.android.ugc.aweme.model.MentionRecommendQueryRequest;
import com.ss.android.ugc.aweme.model.MentionRecommendResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Caj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.util.MentionNetworkRequestHelper$fetchRecommendUserForMentionWithCache$2$respDeferred$1", f = "MentionNetworkRequestHelper.kt", l = {}, m = "invokeSuspend")
public final class C316390Caj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super MentionRecommendResponse>, Object> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316390Caj(long j, InterfaceC1364105Vn<? super C316390Caj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C316390Caj(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MentionRecommendResponse mentionRecommendResponseLIZIZ;
        C1C7U.LIZ("MentionNetworkRequestHelper@3b12.fetchRecommendUserForMentionWithCache$2$respDeferred$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MentionRecommendQueryRequest mentionRecommendQueryRequestLIZ = C316420Cam.LIZ(this.LL, null, null, null, null, null, null, 1L, 126);
        if (mentionRecommendQueryRequestLIZ != null) {
            C316410Cal.LIZ.getClass();
            mentionRecommendResponseLIZIZ = C316410Cal.LIZIZ(mentionRecommendQueryRequestLIZ);
        } else {
            mentionRecommendResponseLIZIZ = null;
        }
        C1C7U.LIZIZ("MentionNetworkRequestHelper@3b12.fetchRecommendUserForMentionWithCache$2$respDeferred$1");
        return mentionRecommendResponseLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super MentionRecommendResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
