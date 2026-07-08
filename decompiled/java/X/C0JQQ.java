package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.view.frgment.EmotePollStartDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JQQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JQQ extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ EmotePollStartDialog LL;
    public final /* synthetic */ C510160Jza LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JQQ(EmotePollStartDialog emotePollStartDialog, C510160Jza c510160Jza) {
        super(1);
        this.LL = emotePollStartDialog;
        this.LLILLJJLI = c510160Jza;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        C501540Jlg.LIZJ(this.LL.getContext(), th);
        this.LLILLJJLI.LIZ();
        return Unit.LIZ;
    }
}
