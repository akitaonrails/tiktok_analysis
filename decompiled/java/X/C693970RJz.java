package X;

import android.view.View;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693970RJz extends C09AY implements Function0<View> {
    public final /* synthetic */ VideoTagContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C693970RJz(VideoTagContainer videoTagContainer) {
        super(0);
        this.LL = videoTagContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        return this.LL.op();
    }
}
