package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.skylight.LiveTopLiveEventSpaceSetting;
import com.bytedance.android.livesdk.livesetting.skylight.LiveTopLiveNotificationSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveWatchLaterSettingSetting;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0InK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C477080InK extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    public C477080InK(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final C477530Io3 getLiveEventSpaceButton() {
        return (C477530Io3) this.LLILLL.getValue();
    }

    public final C477400Inq getLiveNotificationBell() {
        return (C477400Inq) this.LL.getValue();
    }

    public final C477370Inn getLiveWatchLaterButton() {
        return (C477370Inn) this.LLILLJJLI.getValue();
    }

    public final void setViewVisibility(int i) {
        C477530Io3 liveEventSpaceButton;
        if (i == 0) {
            if (LiveTopLiveNotificationSetting.INSTANCE.getEnable()) {
                C339190DRl.LIZLLL(getLiveNotificationBell());
            }
            if (LiveWatchLaterSettingSetting.INSTANCE.getValue() == 1) {
                C339190DRl.LIZLLL(getLiveWatchLaterButton());
            }
            if (LiveTopLiveEventSpaceSetting.INSTANCE.getEnable() && (liveEventSpaceButton = getLiveEventSpaceButton()) != null) {
                liveEventSpaceButton.LIZLLL(true);
            }
        }
        super.setVisibility(i);
    }

    public C477080InK(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 597));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 598));
        this.LLILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 596));
    }
}
