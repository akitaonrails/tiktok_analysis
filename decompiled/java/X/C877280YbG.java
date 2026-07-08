package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YbG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.professional.bridge.ProfessionalInboxChatListBridge$notifySelectionChange$1", f = "ProfessionalInboxChatListBridge.kt", l = {}, m = "invokeSuspend")
public final class C877280YbG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C883740Ylg LL;
    public final /* synthetic */ FilterTabType LLILLJJLI;
    public final /* synthetic */ Set<EnumC880480YgQ> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C877280YbG(C883740Ylg c883740Ylg, FilterTabType filterTabType, Set<? extends EnumC880480YgQ> set, InterfaceC1364105Vn<? super C877280YbG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c883740Ylg;
        this.LLILLJJLI = filterTabType;
        this.LLILLL = set;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C877280YbG(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfessionalInboxChatListBridge@5f09.notifySelectionChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJII(this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfessionalInboxChatListBridge@5f09.notifySelectionChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
