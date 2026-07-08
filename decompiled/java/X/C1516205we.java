package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05we, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.unreadinfo.ChatListUnreadInfoUpdater$onUserUpdateEvent$1", f = "ChatListUnreadInfoUpdater.kt", l = {}, m = "invokeSuspend")
public final class C1516205we extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C880130Yfr LL;
    public final /* synthetic */ Set<Pair<InterfaceC1490905sZ<?>, InterfaceC1491305sd>> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1516205we(C880130Yfr c880130Yfr, Set<Pair<InterfaceC1490905sZ<?>, InterfaceC1491305sd>> set, String str, InterfaceC1364105Vn<? super C1516205we> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c880130Yfr;
        this.LLILLJJLI = set;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1516205we(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0617 anonymousClass0617;
        C0Y8T c0y8tLJIL;
        C1C7U.LIZ("ChatListUnreadInfoUpdater@e118.onUserUpdateEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        List<FilterTabType> listLJIJJ = C880130Yfr.LJIJJ();
        Set<Pair<InterfaceC1490905sZ<?>, InterfaceC1491305sd>> set = this.LLILLJJLI;
        C880130Yfr c880130Yfr = this.LL;
        String str = this.LLILLL;
        for (FilterTabType filterTabType : listLJIJJ) {
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                Object second = pair.getSecond();
                if ((second instanceof AnonymousClass0617) && (anonymousClass0617 = (AnonymousClass0617) second) != null && (c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(anonymousClass0617.getConversationId())) != null) {
                    c880130Yfr.LJJ(filterTabType, (InterfaceC1490905sZ) pair.getFirst(), anonymousClass0617, c0y8tLJIL, null, str);
                }
            }
        }
        this.LL.LJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListUnreadInfoUpdater@e118.onUserUpdateEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
