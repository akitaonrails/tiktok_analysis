package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.edit.vm.EmotePollEditVM;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JQh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491770JQh extends C09AY implements Function0<C491740JQe> {
    public final /* synthetic */ EmotePollEditVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491770JQh(EmotePollEditVM emotePollEditVM) {
        super(0);
        this.LL = emotePollEditVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C491740JQe invoke() {
        C491740JQe c491740JQe = new C491740JQe();
        c491740JQe.LIZLLL = this.LL;
        return c491740JQe;
    }
}
