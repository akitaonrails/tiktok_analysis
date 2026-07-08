package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.LiveRepostVM;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yAv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847430yAv extends C09AY implements Function0<C1ACA> {
    public final /* synthetic */ LiveRepostVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1847430yAv(LiveRepostVM liveRepostVM) {
        super(0);
        this.LL = liveRepostVM;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1ACA, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C1ACA invoke() {
        DataChannel dataChannel = this.LL.getDataChannel();
        if (dataChannel != null) {
            return dataChannel.gg0(C748910TZh.class);
        }
        return null;
    }
}
