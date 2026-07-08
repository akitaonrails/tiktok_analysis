package X;

import Y.ARunnableS115S0100000_15;
import android.content.Context;
import com.bytedance.android.live.broadcast.api.LivePreviewGuestLayoutZoomOutFinish;
import com.bytedance.android.live.broadcast.api.PreviewCoverEditVisibilityChannel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS594S0100000_15;
import wh6.AbS696S0100000_15;

/* JADX INFO: renamed from: X.0ad0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942280ad0 extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public LiveIconView LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final ViewOnLayoutChangeListenerC986920bn0 LLJILJIL;

    @Override // X.AbstractC939840aZ4
    public int getLayoutBizViewThemeMode() {
        return 1;
    }

    public final void LJIIIZ() {
        if (this.LLJI || this.LLJIJIL) {
            LiveIconView liveIconView = this.LLJ;
            if (liveIconView != null) {
                C786410Ut5.LLJJIJIL(liveIconView, 8);
                return;
            }
            return;
        }
        if (C500260Jjc.LJJIL()) {
            C957020b0m window = getWindow();
            int iLJIIZILJ = C497740JfY.LJIIZILJ();
            if (window.getHeight() <= C497740JfY.LJIILLIIL() * 0.4f && window.getWidth() <= iLJIIZILJ * 0.7f) {
                LiveIconView liveIconView2 = this.LLJ;
                if (liveIconView2 != null) {
                    C786410Ut5.LLJJIJIL(liveIconView2, 0);
                    return;
                }
                return;
            }
        }
        LiveIconView liveIconView3 = this.LLJ;
        if (liveIconView3 != null) {
            C786410Ut5.LLJJIJIL(liveIconView3, 8);
        }
    }

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutId() {
        return Integer.valueOf(R.layout.g0f);
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLJ = (LiveIconView) findViewById(R.id.hg0);
        getWindow().addOnLayoutChangeListener(this.LLJILJIL);
        HandlerHook.viewPost(getWindow(), new ARunnableS115S0100000_15(this, 206));
        LiveIconView liveIconView = this.LLJ;
        if (liveIconView != null) {
            C786410Ut5.I7(new AbS696S0100000_15(this, 11), liveIconView);
        }
        DataChannel dataChannel = getDataChannel();
        dataChannel.CQ2(LivePreviewGuestLayoutZoomOutFinish.class, this, new AwS594S0100000_15(this, 1137));
        dataChannel.CQ2(PreviewCoverEditVisibilityChannel.class, this, new AwS594S0100000_15(this, 1138));
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getDataChannel().zQ2(this);
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.GUIDE_HOST_EXPAND;
    }

    public C942280ad0(Context context, DataChannel dataChannel, C957020b0m c957020b0m) {
        super(context, dataChannel, c957020b0m, null);
        this.LLIZLLLIL = dataChannel;
        this.LLJILJIL = new ViewOnLayoutChangeListenerC986920bn0(this, 12);
    }
}
