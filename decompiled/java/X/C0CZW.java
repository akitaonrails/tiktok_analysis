package X;

import com.ss.android.ugc.aweme.base.api.IMentionApi;
import com.ss.android.ugc.aweme.model.MentionRecentContactResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CZW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.vm.MentionListViewModel$packMentionRecommendUsersWithCache$2$recentContactDeferred$1", f = "MentionListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0CZW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super MentionRecentContactResponse>, Object> {
    public C0CZW(InterfaceC1364105Vn<? super C0CZW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CZW(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionListViewModel@ff55.packMentionRecommendUsersWithCache$2$recentContactDeferred$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C316410Cal.LIZ.getClass();
        MentionRecentContactResponse mentionRecentContactResponse = ((IMentionApi) C316410Cal.LIZIZ.getValue()).queryMentionRecentContacts(3L).execute().LIZIZ;
        C1C7U.LIZIZ("MentionListViewModel@ff55.packMentionRecommendUsersWithCache$2$recentContactDeferred$1");
        return mentionRecentContactResponse;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super MentionRecentContactResponse> interfaceC1364105Vn) {
        return new C0CZW(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
