package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.view.frgment.EmotePollStartDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JQU, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JQU extends C09AY implements Function0<Unit> {
    public final /* synthetic */ EmotePollStartDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JQU(EmotePollStartDialog emotePollStartDialog) {
        super(0);
        this.LL = emotePollStartDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.close(1);
        return Unit.LIZ;
    }
}
