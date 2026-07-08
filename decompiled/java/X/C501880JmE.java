package X;

import com.bytedance.android.livesdk.chatroom.api.SpaceTopicContent;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JmE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501880JmE extends C09AY implements Function1<SpaceTopicContent, Unit> {
    public final /* synthetic */ SubSpaceNewPostVM LL;
    public final /* synthetic */ C502390Jn3 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C501880JmE(SubSpaceNewPostVM subSpaceNewPostVM, C502390Jn3 c502390Jn3) {
        super(1);
        this.LL = subSpaceNewPostVM;
        this.LLILLJJLI = c502390Jn3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SpaceTopicContent spaceTopicContent) {
        C501820Jm8 c501820Jm8;
        SpaceTopicContent spaceTopicContent2 = spaceTopicContent;
        SubSpaceNewPostVM subSpaceNewPostVM = this.LL;
        C502390Jn3 c502390Jn3 = this.LLILLJJLI;
        if (spaceTopicContent2 == null) {
            subSpaceNewPostVM.getClass();
        } else {
            C501810Jm7 c501810Jm7XQ2 = subSpaceNewPostVM.xQ2();
            if (c501810Jm7XQ2 != null && (c501820Jm8 = c501810Jm7XQ2.LL) != null) {
                c501820Jm8.LIZLLL = spaceTopicContent2;
            }
            c502390Jn3.notifyDataSetChanged();
        }
        return Unit.LIZ;
    }
}
