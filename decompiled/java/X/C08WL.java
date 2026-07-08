package X;

import com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08WL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl$onGroupMemberChanged$1", f = "InboxGroupChatSocialStatusViewModelImpl.kt", l = {200}, m = "invokeSuspend")
public final class C08WL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InboxGroupChatSocialStatusViewModelImpl LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08WL(InboxGroupChatSocialStatusViewModelImpl inboxGroupChatSocialStatusViewModelImpl, String str, InterfaceC1364105Vn<? super C08WL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = inboxGroupChatSocialStatusViewModelImpl;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08WL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("InboxGroupChatSocialStatusViewModelImpl@9cd5.onGroupMemberChanged$1");
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
            InboxGroupChatSocialStatusViewModelImpl inboxGroupChatSocialStatusViewModelImpl = this.LLILLJJLI;
            List listSingletonList = Collections.singletonList(this.LLILLL);
            this.LL = 1;
            inboxGroupChatSocialStatusViewModelImpl.getClass();
            Object objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C2135308Yd(inboxGroupChatSocialStatusViewModelImpl, listSingletonList, "dm_inbox_group_member_update", null));
            if (objLJI != C099R.LJFF()) {
                objLJI = Unit.LIZ;
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("InboxGroupChatSocialStatusViewModelImpl@9cd5.onGroupMemberChanged$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxGroupChatSocialStatusViewModelImpl@9cd5.onGroupMemberChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
