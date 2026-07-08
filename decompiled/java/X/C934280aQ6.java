package X;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import avg.f;
import com.bytedance.android.live.liveinteract.api.ShowNoticeBoardManagePanel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.NoticeboardStateChangeEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import mf.a;

/* JADX INFO: renamed from: X.0aQ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C934280aQ6 extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public final InterfaceC920220a3Q LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    private final View.OnClickListener getClickListener() {
        return (View.OnClickListener) this.LLJILJIL.getValue();
    }

    private final View.OnClickListener getMaskClickListener() {
        return (View.OnClickListener) this.LLJILJILJ.getValue();
    }

    private final Function1<Unit, Unit> getObserver() {
        return (Function1) this.LLJI.getValue();
    }

    private final ViewTreeObserver.OnGlobalLayoutListener getOnGlobalLayoutListener() {
        return (ViewTreeObserver.OnGlobalLayoutListener) this.LLJILLL.getValue();
    }

    private final Function1<Integer, Unit> getStateObserver() {
        return (Function1) this.LLJIJIL.getValue();
    }

    public final C932910aNt getViewModel() {
        return (C932910aNt) this.LLJJ.getValue();
    }

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutId() {
        if (C930540aK4.LIZJ()) {
            int intValue = LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_noticeboard_opt_v1");
            if (intValue != 2 && intValue != 3) {
                return null;
            }
        } else if (!C462601r6.LIZ()) {
            return null;
        }
        return Integer.valueOf(R.layout.hu2);
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = getOnGlobalLayoutListener();
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        getDataChannel().BQ2(this, ShowNoticeBoardManagePanel.class, getObserver());
        getDataChannel().EQ2(this, NoticeboardStateChangeEvent.class, getStateObserver());
        View viewFindViewById = findViewById(R.id.o17);
        if (viewFindViewById != null) {
            C786410Ut5.I7(getMaskClickListener(), viewFindViewById);
        }
        View.OnClickListener clickListener = getClickListener();
        if (C1848410yCV.LIZ) {
            if (clickListener != null) {
                clickListener = new f(clickListener);
                clickListener = new a(clickListener);
            }
        } else if (clickListener != null) {
            clickListener = new a(clickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(clickListener);
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C932910aNt viewModel = getViewModel();
        viewModel.getClass();
        try {
            Long l = viewModel.LJ;
            if (l != null) {
                C19322110iZ.LIZ(l.longValue());
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJ("NoticeboardBizViewModel", String.valueOf(th.getMessage()));
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = getOnGlobalLayoutListener();
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            C2187701Ajg.LIZIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        super.onDetachedFromWindow();
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.NOTICEBOARD_VIEW;
    }

    public C934280aQ6(Context context, DataChannel dataChannel, C957020b0m c957020b0m, InterfaceC920220a3Q interfaceC920220a3Q) {
        super(context, dataChannel, c957020b0m, null);
        this.LLIZLLLIL = dataChannel;
        this.LLJ = interfaceC920220a3Q;
        this.LLJI = C930540aK4.LJJIJIL(new AwS416S0200000_15(this, c957020b0m, 119));
        this.LLJIJIL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1155));
        this.LLJILJIL = C930540aK4.LJJIJIL(new AwS416S0200000_15(this, c957020b0m, 118));
        this.LLJILJILJ = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(468));
        this.LLJILLL = C930540aK4.LJJIJIL(new AwS416S0200000_15(this, c957020b0m, 120));
        this.LLJJ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1156));
    }
}
