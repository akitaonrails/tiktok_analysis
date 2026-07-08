package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.view.assem.EmotePollInfoAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JRB, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JRB extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ EmotePollInfoAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JRB(EmotePollInfoAssem emotePollInfoAssem) {
        super(1);
        this.LL = emotePollInfoAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        C501540Jlg.LIZJ(this.LL.getContext(), th);
        return Unit.LIZ;
    }
}
