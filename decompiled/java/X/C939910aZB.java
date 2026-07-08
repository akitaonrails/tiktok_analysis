package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.android.live.broadcast.api.LivePreviewGuestLayoutZoomInAction;
import com.bytedance.android.live.broadcast.api.LivePreviewGuestLayoutZoomOutFinish;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aZB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939910aZB extends AbstractC939840aZ4 {
    public final Context LLIZLLLIL;
    public final DataChannel LLJ;
    public final InterfaceC920220a3Q LLJI;
    public FrameLayout LLJIJIL;

    @Override // X.AbstractC939840aZ4
    public int getLayoutBizViewThemeMode() {
        return 1;
    }

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutId() {
        return Integer.valueOf(R.layout.g0e);
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLJIJIL = (FrameLayout) findViewById(R.id.jcg);
        if (C937310aUz.LIZJ(this.LLJI) || this.LLJI.getPanelLayoutType() == 7) {
            FrameLayout frameLayout = this.LLJIJIL;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(C497740JfY.LIZLLL(R.attr.exh, this.LLIZLLLIL));
            }
        } else if (C917900Zzg.LIZ()) {
            FrameLayout frameLayout2 = this.LLJIJIL;
            if (frameLayout2 != null) {
                frameLayout2.setBackgroundColor(C497740JfY.LIZLLL(R.attr.exm, this.LLIZLLLIL));
            }
        } else {
            InterfaceC940060aZQ layoutManager = getLayoutManager();
            if (layoutManager == null || layoutManager.LLIIZ() || C917900Zzg.LIZ()) {
                FrameLayout frameLayout3 = this.LLJIJIL;
                if (frameLayout3 != null) {
                    frameLayout3.setBackgroundColor(C497740JfY.LIZLLL(R.attr.exm, this.LLIZLLLIL));
                }
            } else {
                FrameLayout frameLayout4 = this.LLJIJIL;
                if (frameLayout4 != null) {
                    frameLayout4.setBackground(C800330VaR.LIZIZ(this.LLIZLLLIL, R.drawable.f5t));
                }
            }
        }
        if (!getWindow().LLJIJIL) {
            FrameLayout frameLayout5 = this.LLJIJIL;
            if (frameLayout5 != null) {
                C786410Ut5.LJZ(0, frameLayout5);
                return;
            }
            return;
        }
        FrameLayout frameLayout6 = this.LLJIJIL;
        if (frameLayout6 != null) {
            C786410Ut5.LJZ(8, frameLayout6);
        }
        DataChannel dataChannel = getDataChannel();
        dataChannel.CQ2(LivePreviewGuestLayoutZoomInAction.class, this, new AwS594S0100000_15(this, 1133));
        dataChannel.CQ2(LivePreviewGuestLayoutZoomOutFinish.class, this, new AwS594S0100000_15(this, 1135));
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getDataChannel().zQ2(this);
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLJ;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.GUIDE_GUEST_MASK;
    }

    public C939910aZB(Context context, DataChannel dataChannel, C957020b0m c957020b0m, InterfaceC920220a3Q interfaceC920220a3Q, InterfaceC940060aZQ interfaceC940060aZQ) {
        super(context, dataChannel, c957020b0m, interfaceC940060aZQ);
        this.LLIZLLLIL = context;
        this.LLJ = dataChannel;
        this.LLJI = interfaceC920220a3Q;
    }
}
