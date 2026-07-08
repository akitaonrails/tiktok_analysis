package X;

import android.view.View;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RKD, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RKD extends C09AY implements Function0<View> {
    public final /* synthetic */ VideoTagContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RKD(VideoTagContainer videoTagContainer) {
        super(0);
        this.LL = videoTagContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        return this.LL.op();
    }
}
