package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.edit.vm.EmotePollEditVM;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JQH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JQH extends C09AY implements Function0<C0JQC> {
    public final /* synthetic */ EmotePollEditVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JQH(EmotePollEditVM emotePollEditVM) {
        super(0);
        this.LL = emotePollEditVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0JQC invoke() {
        return new C0JQC(this.LL.vQ2());
    }
}
