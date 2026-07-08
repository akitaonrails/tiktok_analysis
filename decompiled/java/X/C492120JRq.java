package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.vm.EmotePollDetailVM;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JRq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492120JRq extends C09AY implements Function0<C492070JRl> {
    public final /* synthetic */ EmotePollDetailVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C492120JRq(EmotePollDetailVM emotePollDetailVM) {
        super(0);
        this.LL = emotePollDetailVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C492070JRl invoke() {
        return new C492070JRl(this.LL.wQ2());
    }
}
