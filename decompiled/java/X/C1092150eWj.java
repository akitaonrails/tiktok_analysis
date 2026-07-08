package X;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.live.broadcast.api.PreviewBoardPlaceHolderVisibility;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0eWj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092150eWj extends C1092090eWd {
    @Override // X.C1092090eWd
    public final void LIZIZ() {
        super.LIZIZ();
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null) {
            dataChannel.BQ2(getLifecycleOwner(), PreviewBoardPlaceHolderVisibility.class, new C1092170eWl(this));
        }
    }

    public C1092150eWj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
