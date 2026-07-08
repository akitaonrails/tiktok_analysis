package X;

import com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08WN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl$fetchGroupStatus$2$5", f = "InboxGroupChatSocialStatusViewModelImpl.kt", l = {}, m = "invokeSuspend")
public final class C08WN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ InboxGroupChatSocialStatusViewModelImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08WN(List<String> list, InboxGroupChatSocialStatusViewModelImpl inboxGroupChatSocialStatusViewModelImpl, InterfaceC1364105Vn<? super C08WN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = inboxGroupChatSocialStatusViewModelImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08WN(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        C1C7U.LIZ("InboxGroupChatSocialStatusViewModelImpl@9cd5.fetchGroupStatus$2$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<String> list = this.LL;
        InboxGroupChatSocialStatusViewModelImpl inboxGroupChatSocialStatusViewModelImpl = this.LLILLJJLI;
        for (String str : list) {
            Integer num = (Integer) ((LinkedHashMap) inboxGroupChatSocialStatusViewModelImpl.LLILZLL).get(str);
            if (num != null) {
                iIntValue = num.intValue();
                if (iIntValue < 1) {
                }
            } else {
                iIntValue = 0;
            }
            inboxGroupChatSocialStatusViewModelImpl.LLILZLL.put(str, C2286608xc.LJ(iIntValue + 1));
            inboxGroupChatSocialStatusViewModelImpl.vQ2(str, false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxGroupChatSocialStatusViewModelImpl@9cd5.fetchGroupStatus$2$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
