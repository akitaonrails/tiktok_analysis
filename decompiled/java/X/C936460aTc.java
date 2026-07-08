package X;

import Y.AfS184S0100000_15;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.guest.NoticeboardGuestController;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0aTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936460aTc extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public TuxTextView LLJ;

    /* JADX INFO: renamed from: getLayoutId, reason: collision with other method in class */
    public Void m41getLayoutId() {
        return null;
    }

    @Override // X.AbstractC939840aZ4
    public /* bridge */ /* synthetic */ Integer getLayoutId() {
        return (Integer) m41getLayoutId();
    }

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutIdLazy() {
        return Integer.valueOf(R.layout.htq);
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C11PQ<String> c11pq;
        super.onAttachedToWindow();
        if (C937310aUz.LIZIZ(getDataChannel()) == EnumC934000aPe.ANCHOR) {
            C953610avH.LJJI.getClass();
            c11pq = C953610avH.LJJIIZ;
        } else {
            c11pq = NoticeboardGuestController.LJIILJJIL;
        }
        getCompositeDisposable().LIZ(new C11IW(c11pq.LJJIFFI().LJJIJIIJIL(new AfS184S0100000_15(this, 241))).LJIILL().LJIIZILJ());
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.NOTICEBOARD_TAG;
    }

    public final TuxTextView LJIIIZ(boolean z) {
        String strLJIJI;
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView == null) {
            if (z && (tuxTextView = (TuxTextView) LJI(R.id.tv_tag)) != null) {
                this.LLJ = tuxTextView;
                if (MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
                    strLJIJI = C497740JfY.LJIJI(2131854991);
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131854020);
                }
                tuxTextView.setText(strLJIJI);
            } else {
                return null;
            }
        }
        return tuxTextView;
    }

    public C936460aTc(Context context, DataChannel dataChannel, C957020b0m c957020b0m) {
        super(context, dataChannel, c957020b0m, null);
        this.LLIZLLLIL = dataChannel;
    }
}
