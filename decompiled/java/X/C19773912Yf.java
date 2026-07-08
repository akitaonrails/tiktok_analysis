package X;

import androidx.lifecycle.LiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.guest.NoticeboardGuestController;
import com.ss.android.ugc.aweme.canvas.guide.CanvasGestureGuideWidget;
import com.ss.android.ugc.aweme.series.vip.serviceimpl.SeriesSubscriptionServiceImpl;

/* JADX INFO: renamed from: X.12Yf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19773912Yf implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public static final void run$0(C19773912Yf c19773912Yf) {
        ((C1APH) c19773912Yf.l0).LJIILL(false);
    }

    public static final void run$1(C19773912Yf c19773912Yf) {
        ((LiveData) ((CanvasGestureGuideWidget) c19773912Yf.l0).LIZLLL.getValue()).setValue(Boolean.FALSE);
    }

    public static final void run$2(C19773912Yf c19773912Yf) {
        ((NoticeboardGuestController) c19773912Yf.l0).LJIIJJI = false;
    }

    public static final void run$3(C19773912Yf c19773912Yf) {
        ((SeriesSubscriptionServiceImpl) c19773912Yf.l0).LIZLLL = C2097608Jq.LJ();
        ((SeriesSubscriptionServiceImpl) c19773912Yf.l0).LJ = null;
    }

    public static final void run$4(C19773912Yf c19773912Yf) {
        ((SeriesSubscriptionServiceImpl) c19773912Yf.l0).LIZLLL = C2097608Jq.LJ();
        ((SeriesSubscriptionServiceImpl) c19773912Yf.l0).LJ = null;
    }

    public C19773912Yf(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
