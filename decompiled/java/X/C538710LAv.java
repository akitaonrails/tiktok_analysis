package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LAv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538710LAv extends C09AY implements Function1<VideoPublishEditModel, Unit> {
    public final /* synthetic */ C538810LBf LL;
    public final /* synthetic */ C538790LBd LLILLJJLI;
    public final /* synthetic */ AwemeDraft LLILLL;
    public final /* synthetic */ Activity LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C538710LAv(C538810LBf c538810LBf, C538790LBd c538790LBd, AwemeDraft awemeDraft, Activity activity, int i) {
        super(1);
        this.LL = c538810LBf;
        this.LLILLJJLI = c538790LBd;
        this.LLILLL = awemeDraft;
        this.LLILZ = activity;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(VideoPublishEditModel videoPublishEditModel) {
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C538700LAu(videoPublishEditModel, this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, null), 2);
        return Unit.LIZ;
    }
}
