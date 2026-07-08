package X;

import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.view.assem.EmotePollDetailAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JRR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JRR extends C09AY implements Function0<Unit> {
    public final /* synthetic */ EmotePollDetailAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JRR(EmotePollDetailAssem emotePollDetailAssem) {
        super(0);
        this.LL = emotePollDetailAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EmotePollDetailAssem emotePollDetailAssem = this.LL;
        FrameLayout frameLayout = emotePollDetailAssem.LLJJIJI;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        FrameLayout frameLayout2 = emotePollDetailAssem.LLJJIJI;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        return Unit.LIZ;
    }
}
