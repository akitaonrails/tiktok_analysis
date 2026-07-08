package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.broadcast.setting.LiveCenterNativePageRenew;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterStructureOpt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import tikcast.api.anchor_data.RealtimeLiveCenterDetailData;

/* JADX INFO: renamed from: X.1AHE, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C1AHE extends RecyclerView.ViewHolder {
    public final C1AHD LL;

    public abstract void P5(int i);

    public final long I5() {
        return this.LL.LJIIIZ();
    }

    public final RealtimeLiveCenterDetailData L5() {
        return this.LL.LJIIJJI();
    }

    public final void N5() {
        if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
            this.itemView.setBackground(null);
        } else if (LiveCenterNativePageRenew.INSTANCE.isEnable()) {
            this.itemView.setBackground(this.LL.LJIIIIZZ());
        }
    }

    public final Context getContext() {
        return this.LL.getContext();
    }

    public final DataChannel getDataChannel() {
        return this.LL.getDataChannel();
    }

    public C1AHE(View view, C1AHD c1ahd) {
        super(view);
        this.LL = c1ahd;
    }
}
