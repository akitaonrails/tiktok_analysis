package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.InteractInfoAreaComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RPF, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RPF extends C09AY implements Function0<String> {
    public final /* synthetic */ InteractInfoAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RPF(InteractInfoAreaComponent interactInfoAreaComponent) {
        super(0);
        this.LL = interactInfoAreaComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return C603280NlO.LIZ((VideoItemParams) C631370Opb.LIZ(this.LL), this.LL.jm());
    }
}
