package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.layer.BaseLayeredElementManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;

/* JADX INFO: renamed from: X.0eE0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080540eE0 extends AbstractC1080560eE2 {
    @Override // X.AbstractC1080560eE2
    public final int LIZ() {
        return C1152540g68.LJIIIIZZ(true);
    }

    @Override // com.bytedance.ies.sdk.widgets.LayeredElementContext
    public final boolean isAnchor() {
        return true;
    }

    public C1080540eE0(Context context, ViewGroup viewGroup, DataChannel dataChannel, BaseLayeredElementManager<? extends LayeredElementContext> baseLayeredElementManager) {
        super(context, viewGroup, dataChannel, baseLayeredElementManager);
    }
}
