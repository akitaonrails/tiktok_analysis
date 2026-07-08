package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.subscribe.SubscribeMaskLayerVM;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ABG, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ABG extends C09AY implements Function0<C1ACA> {
    public final /* synthetic */ SubscribeMaskLayerVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1ABG(SubscribeMaskLayerVM subscribeMaskLayerVM) {
        super(0);
        this.LL = subscribeMaskLayerVM;
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
