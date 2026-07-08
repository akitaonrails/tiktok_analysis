package X;

import android.graphics.Rect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TcB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C750450TcB extends C09AY implements Function1<Rect, Unit> {
    public final /* synthetic */ LivePreviewPlayerVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C750450TcB(LivePreviewPlayerVM livePreviewPlayerVM) {
        super(1);
        this.LL = livePreviewPlayerVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Rect rect) {
        DataChannel dataChannel = this.LL.getDataChannel();
        if (dataChannel != null) {
            dataChannel.SX0(C750120Tbe.class, rect);
        }
        return Unit.LIZ;
    }
}
