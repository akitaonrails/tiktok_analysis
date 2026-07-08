package X;

import Y.ARunnableS36S0300000_3;
import com.ss.android.ugc.aweme.model.GroupStoryStatus;
import com.ss.android.ugc.aweme.service.IPublishResourceFirstPolicyService;
import com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Yf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl$preloadVisibleGroupStoryDetail$1", f = "InboxGroupChatSocialStatusViewModelImpl.kt", l = {}, m = "invokeSuspend")
public final class C2135508Yf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<GroupStoryStatus> LL;
    public final /* synthetic */ InboxGroupChatSocialStatusViewModelImpl LLILLJJLI;
    public final /* synthetic */ InterfaceC2135708Yh LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2135508Yf(List<GroupStoryStatus> list, InboxGroupChatSocialStatusViewModelImpl inboxGroupChatSocialStatusViewModelImpl, InterfaceC2135708Yh interfaceC2135708Yh, InterfaceC1364105Vn<? super C2135508Yf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = inboxGroupChatSocialStatusViewModelImpl;
        this.LLILLL = interfaceC2135708Yh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2135508Yf(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("InboxGroupChatSocialStatusViewModelImpl@9cd5.preloadVisibleGroupStoryDetail$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<GroupStoryStatus> list = this.LL;
        InboxGroupChatSocialStatusViewModelImpl inboxGroupChatSocialStatusViewModelImpl = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (GroupStoryStatus groupStoryStatus : list) {
            if (inboxGroupChatSocialStatusViewModelImpl.LLILLL.contains(groupStoryStatus.groupId) && (str = groupStoryStatus.groupId) != null) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("InboxGroupChatSocialStatusViewModelImpl@9cd5.preloadVisibleGroupStoryDetail$1");
            return unit;
        }
        InboxGroupChatSocialStatusViewModelImpl inboxGroupChatSocialStatusViewModelImpl2 = this.LLILLJJLI;
        ARunnableS36S0300000_3 aRunnableS36S0300000_3 = new ARunnableS36S0300000_3(inboxGroupChatSocialStatusViewModelImpl2, arrayList, this.LLILLL, 1);
        IPublishResourceFirstPolicyService iPublishResourceFirstPolicyServiceWQ2 = inboxGroupChatSocialStatusViewModelImpl2.wQ2();
        if (iPublishResourceFirstPolicyServiceWQ2 != null) {
            iPublishResourceFirstPolicyServiceWQ2.LIZ(C2136008Yk.LIZIZ, aRunnableS36S0300000_3);
        } else {
            aRunnableS36S0300000_3.run();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("InboxGroupChatSocialStatusViewModelImpl@9cd5.preloadVisibleGroupStoryDetail$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
