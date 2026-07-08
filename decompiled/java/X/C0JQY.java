package X;

import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.view.assem.EmotePollStartAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JQY, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JQY extends C09AY implements Function0<Unit> {
    public final /* synthetic */ EmotePollStartAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JQY(EmotePollStartAssem emotePollStartAssem) {
        super(0);
        this.LL = emotePollStartAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EmotePollStartAssem emotePollStartAssem = this.LL;
        FrameLayout frameLayout = emotePollStartAssem.LLJJIJI;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        FrameLayout frameLayout2 = emotePollStartAssem.LLJJIJI;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        return Unit.LIZ;
    }
}
