package X;

import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.view.assem.EmotePollStartAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JQW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JQW extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ EmotePollStartAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JQW(EmotePollStartAssem emotePollStartAssem) {
        super(1);
        this.LL = emotePollStartAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        C501540Jlg.LIZJ(this.LL.getContext(), th);
        EmotePollStartAssem emotePollStartAssem = this.LL;
        FrameLayout frameLayout = emotePollStartAssem.LLJJIJI;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        FrameLayout frameLayout2 = emotePollStartAssem.LLJJIJI;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        ((C491870JQr) this.LL.LLJJIJIIJIL.getValue()).LIZJ(false);
        return Unit.LIZ;
    }
}
