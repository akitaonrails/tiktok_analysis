package X;

import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.ad.RewardAdCountdownInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttvideoengine.utils.WeakHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0OZQ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OZQ implements InterfaceC1031910cxZ, InterfaceC587150N1d {
    public final Function0<Unit> LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public long LIZLLL;
    public int LJ;
    public int LJFF;
    public TextView LJII;
    public ViewGroup LJIIIIZZ;
    public long LJIIIZ;
    public RewardAdCountdownInfo LJIIJ;
    public int LJI = -1;
    public final WeakHandler LJIIJJI = new WeakHandler(Looper.getMainLooper(), this);

    public final void LIZLLL() {
        String countdownMsg;
        if (this.LIZJ) {
            return;
        }
        long j = this.LIZLLL;
        long j2 = this.LJIIIZ;
        if (j >= ((long) LSPassThroughRecordSizeConfig.DEFAULT) * j2) {
            this.LIZJ = true;
            TextView textView = this.LJII;
            if (textView != null) {
                RewardAdCountdownInfo rewardAdCountdownInfo = this.LJIIJ;
                textView.setText(rewardAdCountdownInfo != null ? rewardAdCountdownInfo.getCountdownFinishMsg() : null);
            }
            this.LIZ.invoke();
            LIZJ(true);
            return;
        }
        int iCeil = (int) Math.ceil(j2 - (j / 1000.0d));
        if (iCeil == this.LJ) {
            return;
        }
        this.LJ = iCeil;
        RewardAdCountdownInfo rewardAdCountdownInfo2 = this.LJIIJ;
        if (rewardAdCountdownInfo2 == null || (countdownMsg = rewardAdCountdownInfo2.getCountdownMsg()) == null) {
            countdownMsg = "";
        }
        if (countdownMsg.length() == 0) {
            return;
        }
        String strLJJIFFI = u.LJJIFFI(countdownMsg, "{num}", String.valueOf(this.LJ), false);
        TextView textView2 = this.LJII;
        if (textView2 != null) {
            textView2.setText(strLJJIFFI);
        }
        LIZJ(false);
    }

    @Override // X.InterfaceC1031910cxZ
    public final void start() {
        if (this.LIZIZ || this.LIZJ) {
            return;
        }
        this.LIZIZ = true;
        this.LJIIJJI.removeMessages(LSPassThroughRecordSizeConfig.DEFAULT);
        this.LJIIJJI.sendEmptyMessageDelayed(LSPassThroughRecordSizeConfig.DEFAULT, 500L);
    }

    @Override // X.InterfaceC1031910cxZ
    public final void stop() {
        if (!this.LIZIZ || this.LIZJ) {
            return;
        }
        this.LIZIZ = false;
        this.LJIIJJI.removeMessages(LSPassThroughRecordSizeConfig.DEFAULT);
    }

    @Override // X.InterfaceC1031910cxZ
    public final boolean LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1031910cxZ
    public final int LIZIZ() {
        return this.LJ;
    }

    public C0OZQ(AwS560S0100000_16 awS560S0100000_16) {
        this.LIZ = awS560S0100000_16;
    }

    public final void LIZJ(boolean z) {
        ViewGroup viewGroup;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        TextView textView = this.LJII;
        if (textView == null || (viewGroup = this.LJIIIIZZ) == null) {
            return;
        }
        if (!z && this.LJFF > 0) {
            return;
        }
        int measuredWidth = this.LJI;
        ViewGroup.LayoutParams layoutParams = null;
        if (measuredWidth <= 0) {
            Object parent = viewGroup.getParent();
            if ((parent instanceof ViewGroup) && (view = (View) parent) != null && (measuredWidth = view.getMeasuredWidth()) > 0) {
                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    measuredWidth = (measuredWidth - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin;
                }
                this.LJI = measuredWidth;
                if (measuredWidth <= 0) {
                    return;
                }
            } else {
                return;
            }
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(10000, Integer.MIN_VALUE));
        int measuredWidth2 = textView.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
            measuredWidth2 = measuredWidth2 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        if (!z) {
            measuredWidth2 += 5;
        }
        this.LJFF = measuredWidth2;
        ViewGroup viewGroup2 = this.LJIIIIZZ;
        if (viewGroup2 != null && (layoutParams = viewGroup2.getLayoutParams()) != null) {
            layoutParams.width = this.LJFF;
        }
        ViewGroup viewGroup3 = this.LJIIIIZZ;
        if (viewGroup3 != null) {
            C786410Ut5.X5(layoutParams, viewGroup3);
        }
    }

    @Override // X.InterfaceC587150N1d
    public final void handleMessage(Message message) {
        if (message != null) {
            if (message.what == 1000) {
                this.LIZLLL += 500;
            }
            LIZLLL();
            if (!this.LIZJ) {
                this.LJIIJJI.removeMessages(LSPassThroughRecordSizeConfig.DEFAULT);
                this.LJIIJJI.sendEmptyMessageDelayed(LSPassThroughRecordSizeConfig.DEFAULT, 500L);
            }
        }
    }
}
