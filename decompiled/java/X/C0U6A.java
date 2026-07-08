package X;

import com.bytedance.android.live.effect.api.LiveGameEffectFetchFailedEvent;
import com.bytedance.android.live.effect.api.LiveGameEffectFetchedChannel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: X.0U6A, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U6A implements C0U68<LiveEffect> {
    public final WeakReference<DataChannel> LIZ;

    @Override // X.C0U68
    public final void onFail() {
        DataChannel dataChannel = this.LIZ.get();
        if (dataChannel != null) {
            dataChannel.FQ2(LiveGameEffectFetchFailedEvent.class);
        }
    }

    public C0U6A(DataChannel dataChannel) {
        this.LIZ = new WeakReference<>(dataChannel);
    }

    @Override // X.C0U68
    public final void onSuccess(List<C0U74<LiveEffect>> list) {
        DataChannel dataChannel = this.LIZ.get();
        if (dataChannel != null) {
            dataChannel.zW(LiveGameEffectFetchedChannel.class, list);
        }
    }
}
