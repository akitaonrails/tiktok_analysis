package X;

import android.content.Context;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.MultiGuestAdStopEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestAudienceStartPlayAdEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestAudienceStopPlayAdEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestStartPlayAdEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestStopPlayAdEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aZ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939810aZ1 extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public C939820aZ2 LLJ;
    public TextureView LLJI;

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutId() {
        return null;
    }

    public final void LJIIJ() {
        C939820aZ2 c939820aZ2 = this.LLJ;
        if (c939820aZ2 != null) {
            c939820aZ2.LIZ();
        }
        this.LLJ = null;
        TextureView textureView = this.LLJI;
        if (textureView != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, textureView);
            removeView(textureView);
            this.LLJI = null;
        }
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C939820aZ2 c939820aZ2 = this.LLJ;
        if (c939820aZ2 != null) {
            c939820aZ2.LIZ();
        }
        this.LLJ = null;
        getDataChannel().FQ2(MultiGuestAdStopEvent.class);
        super.onDetachedFromWindow();
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DataChannel dataChannel = getDataChannel();
        dataChannel.BQ2(this, MultiGuestStartPlayAdEvent.class, new AwS594S0100000_15(this, 1103));
        dataChannel.BQ2(this, MultiGuestStopPlayAdEvent.class, new AwS594S0100000_15(this, 1104));
        dataChannel.BQ2(this, MultiGuestAudienceStartPlayAdEvent.class, new AwS594S0100000_15(this, 1105));
        dataChannel.BQ2(this, MultiGuestAudienceStopPlayAdEvent.class, new AwS594S0100000_15(this, 1106));
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.AD;
    }

    public C939810aZ1(Context context, DataChannel dataChannel, C957020b0m c957020b0m) {
        super(context, dataChannel, c957020b0m, null);
        this.LLIZLLLIL = dataChannel;
    }

    public final void LJIIIZ(String str, int i, int i2, float f, String str2) {
        TextureView textureView;
        boolean zBooleanValue = false;
        if (str2.length() != 0 && i > 0 && i2 > 0) {
            if (this.LLJI == null) {
                Context context = getContext();
                if (context != null) {
                    textureView = new TextureView(context);
                } else {
                    textureView = null;
                }
                this.LLJI = textureView;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                TextureView textureView2 = this.LLJI;
                if (textureView2 != null) {
                    C786410Ut5.V5(textureView2, layoutParams);
                }
            }
            TextureView textureView3 = this.LLJI;
            if (textureView3 != null) {
                addView(textureView3);
                if (this.LLJ == null) {
                    this.LLJ = new C939820aZ2();
                }
                C939820aZ2 c939820aZ2 = this.LLJ;
                if (c939820aZ2 != null) {
                    Boolean bool = (Boolean) getDataChannel().gg0(UserIsAnchorChannel.class);
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    }
                    c939820aZ2.LIZIZ(textureView3, str, zBooleanValue, str2, i, i2, f, new InterfaceC940660aaO() { // from class: X.0aZg
                        @Override // X.InterfaceC940660aaO
                        public final void LJLLILLLL() {
                            this.LIZ.getDataChannel().FQ2(MultiGuestAdStopEvent.class);
                            this.LIZ.LJIIJ();
                        }

                        @Override // X.InterfaceC940660aaO
                        public final void LJLLI(String str3) {
                            this.LIZ.getDataChannel().FQ2(MultiGuestAdStopEvent.class);
                            this.LIZ.LJIIJ();
                        }
                    });
                }
            }
        }
    }
}
