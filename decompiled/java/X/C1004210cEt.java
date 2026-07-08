package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonTrigger;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cEt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004210cEt extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ QuickShareButtonTrigger LL;
    public final /* synthetic */ VideoItemParams LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004210cEt(QuickShareButtonTrigger quickShareButtonTrigger, VideoItemParams videoItemParams) {
        super(1);
        this.LL = quickShareButtonTrigger;
        this.LLILLJJLI = videoItemParams;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        boolean z = false;
        ((QuickShareVM) this.LL.LLJLILLLLZIIL.getValue()).LLILZ = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryContention = false aid=");
        sbLIZ.append(this.LLILLJJLI.getAweme().getAid());
        sbLIZ.append(' ');
        sbLIZ.append(this.LL.LJJIJL());
        sbLIZ.append(' ');
        if (this.LL.LJJIJL().getVisibility() == 0) {
            z = true;
        }
        sbLIZ.append(z);
        C1720006oQ.LJ("QuickShareTrigger", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }
}
