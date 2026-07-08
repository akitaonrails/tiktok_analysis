package X;

import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.view.assem.EmotePollDetailAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JRP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JRP extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ EmotePollDetailAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JRP(EmotePollDetailAssem emotePollDetailAssem) {
        super(1);
        this.LL = emotePollDetailAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        boolean zBooleanValue;
        Boolean bool;
        C501540Jlg.LIZJ(this.LL.getContext(), th);
        EmotePollDetailAssem emotePollDetailAssem = this.LL;
        FrameLayout frameLayout = emotePollDetailAssem.LLJJIJI;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        FrameLayout frameLayout2 = emotePollDetailAssem.LLJJIJI;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        C491870JQr c491870JQr = (C491870JQr) this.LL.LLJJIJIIJIL.getValue();
        C0JRE c0jreHp = this.LL.hp();
        if (c0jreHp != null && (bool = c0jreHp.LL) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        c491870JQr.LIZJ(zBooleanValue);
        return Unit.LIZ;
    }
}
