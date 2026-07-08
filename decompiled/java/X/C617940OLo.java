package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0OLo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C617940OLo extends FrameLayout {
    public final Aweme LL;
    public final String LLILLJJLI;
    public C21411818qq LLILLL;

    public final Aweme getAweme() {
        return this.LL;
    }

    public final String getEnterFrom() {
        return this.LLILLJJLI;
    }

    public final C21411818qq getToggleSwitch() {
        return this.LLILLL;
    }

    public final void setSessionSpeedEvent(boolean z) {
        String aid;
        Video video;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI);
        Aweme aweme = this.LL;
        Object objValueOf = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("item_id", aid);
        Aweme aweme2 = this.LL;
        if (aweme2 != null && (video = aweme2.getVideo()) != null) {
            objValueOf = Integer.valueOf(video.getDuration());
        }
        c2344009Gk.LJ(objValueOf, "item_duration");
        c2344009Gk.LIZJ(z ? 1 : 0, "toggle_status");
        int i = 1;
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().LIZ() == 1) {
            i = 3;
        }
        c2344009Gk.LIZJ(i, "pad_interface_orientation");
        C20684815ws.LJIILLIIL("lock_speed_toggle", c2344009Gk.LIZ);
    }

    public final void setToggleSwitch(C21411818qq c21411818qq) {
        this.LLILLL = c21411818qq;
    }

    public C617940OLo(Context context, Aweme aweme, String str) {
        super(context, null, 0);
        this.LL = aweme;
        this.LLILLJJLI = str;
        C786410Ut5.LJLLJ(context, R.layout.b7o, this);
        C21411818qq c21411818qq = (C21411818qq) findViewById(R.id.np1);
        this.LLILLL = c21411818qq;
        if (c21411818qq != null) {
            C589960NBy.LIZ.getClass();
            c21411818qq.setChecked(C589960NBy.LJI);
        }
        C21411818qq c21411818qq2 = this.LLILLL;
        if (c21411818qq2 != null) {
            c21411818qq2.setInterceptToggleListener(new AwS553S0100000_9(this, 1821));
        }
    }
}
