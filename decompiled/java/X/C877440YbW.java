package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YbW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.datasource.conversation.ChatListConversationDataSource$checkPinnedSpamConversation$1", f = "ChatListConversationDataSource.kt", l = {}, m = "invokeSuspend")
public final class C877440YbW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<C0Y8T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C877440YbW(List<C0Y8T> list, InterfaceC1364105Vn<? super C877440YbW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C877440YbW(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListConversationDataSource@6f28.checkPinnedSpamConversation$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C0Y8T> list = this.LL;
        ArrayList arrayList = new ArrayList();
        for (C0Y8T c0y8t : list) {
            C0Y8T c0y8t2 = c0y8t;
            if (c0y8t2.isStickTop()) {
                Set<EnumC880480YgQ> set = C880490YgR.LLILLL;
                if (C880370YgF.LIZ(FilterTabType.SPAM, Collections.singleton(EnumC880480YgQ.SAME_WITH_TAB), c0y8t2, null, null, null)) {
                    arrayList.add(c0y8t);
                }
            }
        }
        for (List list2 : C13LP.LJJJIL(arrayList, 99)) {
            InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
            C13BV c13bv = C13BV.INSTANCE;
            interfaceC876950YajLIZIZ.LJJIJL(list2, c13bv, c13bv, false, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListConversationDataSource@6f28.checkPinnedSpamConversation$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
