package X;

import com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.slot.FeedBackReusedSkeletonUIContent;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.provider.MessageListAbilityHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06S7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.slot.FeedBackReusedSkeletonUIContent$refreshMessage$1", f = "FeedBackReusedSkeletonUIContent.kt", l = {156}, m = "invokeSuspend")
public final class C06S7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FeedBackReusedSkeletonUIContent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06S7(FeedBackReusedSkeletonUIContent feedBackReusedSkeletonUIContent, InterfaceC1364105Vn<? super C06S7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = feedBackReusedSkeletonUIContent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06S7(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedBackReusedSkeletonUIContent@f62c.refreshMessage$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("FeedBackReusedSkeletonUIContent@f62c.refreshMessage$1");
                return objLJFF;
            }
        }
        ChatroomEventAbility chatroomEventAbility = (ChatroomEventAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILLJJLI), MessageListAbilityHolder.class, null);
        if (chatroomEventAbility != null) {
            chatroomEventAbility.QU0(new C06P6(false));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedBackReusedSkeletonUIContent@f62c.refreshMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
