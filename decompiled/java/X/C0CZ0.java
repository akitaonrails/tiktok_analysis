package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.mention.model.MentionGeneralCheckResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CZ0, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.vm.MentionListViewModel$packMentionRecommendUsersWithCache$2$mentionCheckDeferred$1", f = "MentionListViewModel.kt", l = {355}, m = "invokeSuspend")
public final class C0CZ0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends MentionGeneralCheckResponse, ? extends Boolean>>, Object> {
    public int LL;
    public final /* synthetic */ List<IMUser> LLILLJJLI;
    public final /* synthetic */ List<IMUser> LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CZ0(long j, List list, List list2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = list2;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CZ0(this.LLILZ, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionListViewModel@ff55.packMentionRecommendUsersWithCache$2$mentionCheckDeferred$1");
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
            List<IMUser> list = this.LLILLJJLI;
            List<IMUser> list2 = this.LLILLL;
            long j = this.LLILZ;
            this.LL = 1;
            obj = C2296808zG.LJ(new C0CZ2(j, list, list2, null), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MentionListViewModel@ff55.packMentionRecommendUsersWithCache$2$mentionCheckDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MentionListViewModel@ff55.packMentionRecommendUsersWithCache$2$mentionCheckDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends MentionGeneralCheckResponse, ? extends Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
