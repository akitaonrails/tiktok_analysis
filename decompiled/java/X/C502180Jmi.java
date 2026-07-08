package X;

import com.bytedance.android.livesdk.chatroom.api.SpaceTopicContent;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jmi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502180Jmi extends C09AY implements Function1<C502060JmW, Unit> {
    public final /* synthetic */ SubSpaceNewPostVM LL;
    public final /* synthetic */ SpaceTopicContent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C502180Jmi(SubSpaceNewPostVM subSpaceNewPostVM, SpaceTopicContent spaceTopicContent) {
        super(1);
        this.LL = subSpaceNewPostVM;
        this.LLILLJJLI = spaceTopicContent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C502060JmW c502060JmW) {
        this.LL.setState(new C502170Jmh(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
