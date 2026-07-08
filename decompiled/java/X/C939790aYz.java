package X;

import Y.AfS184S0100000_15;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestLiveShowTransitionDurationSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939790aYz extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public final WeakReference<C938220aWS> LLJ;
    public C1106010et5 LLJI;
    public C1088120eQE LLJIJIL;
    public View LLJILJIL;

    public final void LJIIIZ() {
        setVisibilityOpt(false);
    }

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutId() {
        return null;
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String str;
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        C11PQ<C11H7<EnumC938240aWU, Long, Long>> c11pq;
        super.onAttachedToWindow();
        PosIdentity posIdentity = getWindow().getPosIdentity();
        if (posIdentity == null || posIdentity.type != 1 || (str = posIdentity.value) == null || (c938220aWS = this.LLJ.get()) == null || (c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false)) == null || (c11pq = c938230aWTLIZJ.LJIIIZ) == null) {
            return;
        }
        getCompositeDisposable().LIZ(new C11IW(c11pq.LJJIFFI().LJJIJIIJIL(new AfS184S0100000_15(this, 235))).LJIILL().LJIIZILJ());
    }

    private final C1106010et5 getTimeCircleView() {
        return this.LLJI;
    }

    private final C1088120eQE getTimeCountdownView() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.LIVESHOW_TIMER;
    }

    private final void setVisibilityOpt(boolean z) {
        if (z) {
            if (!getInflated()) {
                setInflated(true);
                Context context = getContext();
                setInflated(true);
                C786410Ut5.Td(C786410Ut5.ne(context), R.layout.htk, this, true);
            }
            C12ES.LJIILL(0, this);
            return;
        }
        C439101nJ.LJI(this);
    }

    public final void LJIIJ(long j, long j2, EnumC938240aWU enumC938240aWU) {
        C1088120eQE timeCountdownView;
        View viewLJLLLL;
        boolean z = true;
        setVisibilityOpt(true);
        ViewStub viewStub = (ViewStub) findViewById(R.id.xy4);
        C1088120eQE c1088120eQE = null;
        if (this.LLJILJIL == null) {
            if (viewStub != null) {
                viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            } else {
                viewLJLLLL = null;
            }
            this.LLJILJIL = viewLJLLLL;
        }
        View view = this.LLJILJIL;
        if (view == null) {
            return;
        }
        this.LLJI = (C1106010et5) view.findViewById(R.id.n6e);
        View view2 = this.LLJILJIL;
        if (view2 != null) {
            c1088120eQE = (C1088120eQE) view2.findViewById(R.id.n6i);
        }
        this.LLJIJIL = c1088120eQE;
        if (c1088120eQE != null) {
            c1088120eQE.setTextSize(14.0f);
        }
        C1106010et5 timeCircleView = getTimeCircleView();
        if (timeCircleView != null) {
            C12ES.LJIILL(0, timeCircleView);
        }
        C1088120eQE timeCountdownView2 = getTimeCountdownView();
        if (timeCountdownView2 != null) {
            C12ES.LJIILL(0, timeCountdownView2);
        }
        C1106010et5 timeCircleView2 = getTimeCircleView();
        if (timeCircleView2 != null) {
            timeCircleView2.setTotalTime(j);
        }
        C1106010et5 timeCircleView3 = getTimeCircleView();
        if (timeCircleView3 != null) {
            timeCircleView3.setRemainTime(j2);
        }
        if (enumC938240aWU == EnumC938240aWU.LIVE_SHOW) {
            C1088120eQE timeCountdownView3 = getTimeCountdownView();
            if (timeCountdownView3 != null) {
                if (!MultiGuestLiveShowTransitionDurationSetting.INSTANCE.isCountdownLabelAnimated() || j2 >= 10) {
                    z = false;
                }
                timeCountdownView3.LIZ(j2, z);
                return;
            }
            return;
        }
        if (enumC938240aWU != EnumC938240aWU.AIGC_COUNTDOWN || (timeCountdownView = getTimeCountdownView()) == null) {
            return;
        }
        timeCountdownView.LIZ(j2, false);
    }

    public C939790aYz(Context context, C957020b0m c957020b0m, DataChannel dataChannel, WeakReference weakReference) {
        super(context, dataChannel, c957020b0m, null);
        this.LLIZLLLIL = dataChannel;
        this.LLJ = weakReference;
    }
}
