package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings.ArchiveSettingPageViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS101S0110000_14;
import njp.a;

/* JADX INFO: renamed from: X.0Yda, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.datasource.conversation.ChatListConversationDataSource$tryAutoArchiveInactiveConversationsWhenPreload$1", f = "ChatListConversationDataSource.kt", l = {666}, m = "invokeSuspend")
public final class C878720Yda extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<C0Y8T> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C878720Yda(List<C0Y8T> list, boolean z, InterfaceC1364105Vn<? super C878720Yda> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C878720Yda(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListConversationDataSource@6f28.tryAutoArchiveInactiveConversationsWhenPreload$1");
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
            long j = C878730Ydb.LIZ().autoArchiveOnPreloadDelayMs;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ChatListConversationDataSource@6f28.tryAutoArchiveInactiveConversationsWhenPreload$1");
                return objLJFF;
            }
        }
        C878970Ydz.LIZIZ(ArchiveSettingPageViewModel.LL, false, false, false, new AwS101S0110000_14((List) this.LLILLJJLI, (List<C0Y8T>) this.LLILLL, true), 7);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListConversationDataSource@6f28.tryAutoArchiveInactiveConversationsWhenPreload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
