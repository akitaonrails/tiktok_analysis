package X;

import Y.ACListenerS131S0200000_29;
import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.live.LiveCountDownStickerModel;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11s2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19635611s2 extends AbstractC19588311kP<LiveCountDownStickerModel> {
    public C1664680tQA<LiveCountDownStickerModel> LLILZIL;
    public LifecycleOwner LLILZLL;
    public InterfaceC19637111sH LLIZ;

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void destroy() {
        InterfaceC19637111sH interfaceC19637111sH = this.LLIZ;
        if (interfaceC19637111sH == null) {
            interfaceC19637111sH = null;
        }
        interfaceC19637111sH.destroy();
    }

    public final C391430FWj getEdLiveTitle() {
        C19636611sC c19636611sC;
        InterfaceC19637111sH interfaceC19637111sH = this.LLIZ;
        if (interfaceC19637111sH == null) {
            interfaceC19637111sH = null;
        }
        if (!(interfaceC19637111sH instanceof C19636611sC) || (c19636611sC = (C19636611sC) interfaceC19637111sH) == null) {
            return null;
        }
        return c19636611sC.LIZLLL();
    }

    public final C418610GbD getLlCountDown() {
        C19636611sC c19636611sC;
        C418610GbD c418610GbD;
        InterfaceC19637111sH interfaceC19637111sH = this.LLIZ;
        if (interfaceC19637111sH == null) {
            interfaceC19637111sH = null;
        }
        if (!(interfaceC19637111sH instanceof C19636611sC) || (c19636611sC = (C19636611sC) interfaceC19637111sH) == null || (c418610GbD = c19636611sC.LIZJ) == null) {
            return null;
        }
        return c418610GbD;
    }

    public C19635611s2(Context context) {
        super(0, 8, context, (AttributeSet) null);
    }

    public C19635611s2(C19EG c19eg, C19591211ks c19591211ks) {
        super(0, c19eg, (AttributeSet) null, c19591211ks);
    }

    public final void LIZIZ(LifecycleOwner lifecycleOwner, C1664680tQA c1664680tQA) {
        FrameLayout.LayoutParams layoutParams;
        this.LLILZIL = c1664680tQA;
        this.LLILZLL = lifecycleOwner;
        C19636611sC c19636611sC = new C19636611sC(getContext());
        this.LLIZ = c19636611sC;
        c19636611sC.LIZIZ(this);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        LifecycleOwner lifecycleOwner2 = null;
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.gravity = 17;
        }
        InterfaceC19637111sH interfaceC19637111sH = this.LLIZ;
        if (interfaceC19637111sH == null) {
            interfaceC19637111sH = null;
        }
        C1664680tQA<LiveCountDownStickerModel> c1664680tQA2 = this.LLILZIL;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        LifecycleOwner lifecycleOwner3 = this.LLILZLL;
        if (lifecycleOwner3 != null) {
            lifecycleOwner2 = lifecycleOwner3;
        }
        interfaceC19637111sH.LIZ(c1664680tQA2, this, lifecycleOwner2);
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        long millSecond;
        EnumC19589411ka enumC19589411ka;
        ScheduledFuture<?> scheduledFutureScheduleAtFixedRate;
        FrameLayout.LayoutParams layoutParams;
        this.LLILZ = interactStickerStruct;
        C19635811s4 c19635811s4 = new C19635811s4(getContext(), getInteractStickerContainerCommonParam());
        this.LLIZ = c19635811s4;
        LinearLayout linearLayout = null;
        if ((stickerModel instanceof LiveCountDownStickerModel) && stickerModel != null) {
            c19635811s4.LIZIZ(this);
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.gravity = 17;
            }
            InterfaceC19637111sH interfaceC19637111sH = this.LLIZ;
            if (interfaceC19637111sH == null) {
                interfaceC19637111sH = null;
            }
            C19635811s4 c19635811s42 = (C19635811s4) interfaceC19637111sH;
            CountDownStickerStruct countDownStickerStruct = interactStickerStruct.getCountDownStickerStruct();
            c19635811s42.LIZLLL = countDownStickerStruct;
            if (countDownStickerStruct == null) {
                c19635811s42.LIZLLL = new CountDownStickerStruct(null, 0L, 0L, Boolean.FALSE, "", "", "");
                Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
                calendar.set(2020, 11, 6, 19, 1, 1);
                CountDownStickerStruct countDownStickerStruct2 = c19635811s42.LIZLLL;
                if (countDownStickerStruct2 != null) {
                    countDownStickerStruct2.setExpiredTime(Long.valueOf(calendar.getTimeInMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                }
                CountDownStickerStruct countDownStickerStruct3 = c19635811s42.LIZLLL;
                if (countDownStickerStruct3 != null) {
                    countDownStickerStruct3.setSubscribe(Boolean.FALSE);
                }
                CountDownStickerStruct countDownStickerStruct4 = c19635811s42.LIZLLL;
                if (countDownStickerStruct4 != null) {
                    countDownStickerStruct4.setSubscribeNum(500L);
                }
                CountDownStickerStruct countDownStickerStruct5 = c19635811s42.LIZLLL;
                if (countDownStickerStruct5 != null) {
                    countDownStickerStruct5.setTitle("");
                }
                CountDownStickerStruct countDownStickerStruct6 = c19635811s42.LIZLLL;
                if (countDownStickerStruct6 != null) {
                    countDownStickerStruct6.setTextAlreadyExpired("");
                }
            }
            InterfaceC19637111sH interfaceC19637111sH2 = this.LLIZ;
            if (interfaceC19637111sH2 == null) {
                interfaceC19637111sH2 = null;
            }
            C19635811s4 c19635811s43 = (C19635811s4) interfaceC19637111sH2;
            CountDownStickerStruct countDownStickerStruct7 = interactStickerStruct.getCountDownStickerStruct();
            c19635811s43.LIZLLL = countDownStickerStruct7;
            if (countDownStickerStruct7 != null) {
                TextView textView = c19635811s43.LIZJ;
                if (textView != null) {
                    textView.setText(countDownStickerStruct7.getTitle());
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                CountDownStickerStruct countDownStickerStruct8 = c19635811s43.LIZLLL;
                if (countDownStickerStruct8 != null) {
                    millSecond = countDownStickerStruct8.getMillSecond();
                } else {
                    millSecond = 0;
                }
                if (jCurrentTimeMillis <= millSecond) {
                    c19635811s43.LIZLLL();
                    if (c19635811s43.LJIIJJI == null) {
                        c19635811s43.LJIIJJI = C823050WQl.LJ();
                    }
                    ScheduledExecutorService scheduledExecutorService = c19635811s43.LJIIJJI;
                    if (scheduledExecutorService != null) {
                        scheduledFutureScheduleAtFixedRate = scheduledExecutorService.scheduleAtFixedRate(new ARunnableS129S0100000_29(c19635811s43, 123), 0L, 1L, TimeUnit.SECONDS);
                    } else {
                        scheduledFutureScheduleAtFixedRate = null;
                    }
                    c19635811s43.LJIIL = scheduledFutureScheduleAtFixedRate;
                }
                C19591211ks c19591211ks = c19635811s43.LIZIZ;
                if (c19591211ks != null) {
                    enumC19589411ka = c19591211ks.LIZ;
                } else {
                    enumC19589411ka = null;
                }
                if (enumC19589411ka == EnumC19589411ka.INTERACT) {
                    LinearLayout linearLayout2 = c19635811s43.LJ;
                    if (linearLayout2 != null) {
                        linearLayout = linearLayout2;
                    }
                    C786410Ut5.R7(linearLayout, new ACListenerS131S0200000_29(c19635811s43, interactStickerStruct, 18));
                }
            }
            postInvalidate();
        }
    }
}
