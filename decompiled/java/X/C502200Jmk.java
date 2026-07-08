package X;

import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Jmk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502200Jmk extends C09AY implements Function1<C502060JmW, Unit> {
    public final /* synthetic */ SpaceTopicCategory LL;
    public final /* synthetic */ SubSpaceNewPostVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C502200Jmk(SpaceTopicCategory spaceTopicCategory, SubSpaceNewPostVM subSpaceNewPostVM) {
        super(1);
        this.LL = spaceTopicCategory;
        this.LLILLJJLI = subSpaceNewPostVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C502060JmW c502060JmW) {
        if (!Intrinsics.LJFF(c502060JmW.LLILLJJLI, this.LL)) {
            this.LLILLJJLI.setState(new C502190Jmj(this.LL));
        }
        return Unit.LIZ;
    }
}
