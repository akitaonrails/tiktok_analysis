package X;

import com.ss.android.ugc.aweme.model.GroupRelatedInfoResponse;
import com.ss.android.ugc.aweme.model.GroupStoryStatus;
import com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.08Yc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl$fetchGroupStatus$2$4", f = "InboxGroupChatSocialStatusViewModelImpl.kt", l = {}, m = "invokeSuspend")
public final class C2135208Yc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InboxGroupChatSocialStatusViewModelImpl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2135208Yc(List<String> list, Object obj, InboxGroupChatSocialStatusViewModelImpl inboxGroupChatSocialStatusViewModelImpl, InterfaceC1364105Vn<? super C2135208Yc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = obj;
        this.LLILLL = inboxGroupChatSocialStatusViewModelImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2135208Yc(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        List<GroupStoryStatus> groupStatusList;
        C0ZPB c0zpb;
        C1C7U.LIZ("InboxGroupChatSocialStatusViewModelImpl@9cd5.fetchGroupStatus$2$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<String> list = this.LL;
        Object obj3 = this.LLILLJJLI;
        InboxGroupChatSocialStatusViewModelImpl inboxGroupChatSocialStatusViewModelImpl = this.LLILLL;
        for (String str : list) {
            GroupStoryStatus groupStoryStatus = null;
            if (C189200o6.m7isFailureimpl(obj3)) {
                obj2 = null;
            } else {
                obj2 = obj3;
            }
            GroupRelatedInfoResponse groupRelatedInfoResponse = (GroupRelatedInfoResponse) obj2;
            if (groupRelatedInfoResponse != null && (groupStatusList = groupRelatedInfoResponse.getGroupStatusList()) != null) {
                Iterator<GroupStoryStatus> it2 = groupStatusList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    GroupStoryStatus next = it2.next();
                    if (Intrinsics.LJFF(next.groupId, str)) {
                        groupStoryStatus = next;
                        break;
                    }
                }
                GroupStoryStatus groupStoryStatus2 = groupStoryStatus;
                if (groupStoryStatus2 != null && (c0zpb = inboxGroupChatSocialStatusViewModelImpl.LLIZLLLIL.get(str)) != null) {
                    List<Long> list2 = groupStoryStatus2.userIds;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<Long> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(String.valueOf(it3.next().longValue()));
                    }
                    c0zpb.LIZIZ(str, arrayList);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxGroupChatSocialStatusViewModelImpl@9cd5.fetchGroupStatus$2$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
