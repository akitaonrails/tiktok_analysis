package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.vm.EmotePollStartVM;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06Jy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1588806Jy extends C09AY implements Function0<C06K0> {
    public final /* synthetic */ EmotePollStartVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1588806Jy(EmotePollStartVM emotePollStartVM) {
        super(0);
        this.LL = emotePollStartVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C06K0 invoke() {
        return new C06K0(this.LL.vQ2());
    }
}
