package X;

import Y.ACListenerS74S0300000_7;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0Jgl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C498490Jgl extends AbstractC495800JcQ<Unit> {
    public ViewGroup LLILZIL;
    public C16F5 LLILZLL;
    public FrameLayout LLIZ;
    public User LLIZLLLIL;
    public final DataChannel LLJ;
    public final EnumC495780JcO LLJI;
    public final boolean LLJIJIL;

    @Override // X.AbstractC495790JcP
    public final int LJ() {
        return R.layout.h22;
    }

    @Override // X.AbstractC495790JcP
    public final void LJIIJ() {
        View view = this.LLILLL;
        this.LLILZIL = view != null ? (ViewGroup) view.findViewById(R.id.hee) : null;
        View view2 = this.LLILLL;
        if (view2 != null) {
            view2.findViewById(R.id.heo);
        }
        View view3 = this.LLILLL;
        this.LLILZLL = view3 != null ? (C16F5) view3.findViewById(R.id.hep) : null;
        View view4 = this.LLILLL;
        this.LLIZ = view4 != null ? (FrameLayout) view4.findViewById(R.id.hec) : null;
    }

    @Override // X.InterfaceC495840JcU
    public final void cC() {
        C500260Jjc.LJIILIIL(this.LLILLL);
    }

    @Override // X.AbstractC495790JcP
    public final EnumC495780JcO LIZLLL() {
        return this.LLJI;
    }

    @Override // X.AbstractC495790JcP
    public final boolean LJFF() {
        return this.LLJIJIL;
    }

    public C498490Jgl(C495920Jcc c495920Jcc) {
        boolean z;
        super(c495920Jcc);
        this.LLJ = c495920Jcc.LJIIJJI;
        this.LLJI = EnumC495780JcO.LIVE_EVENT;
        C495950Jcf c495950Jcf = c495920Jcc.LIZJ;
        if (!c495950Jcf.LJII && !c495950Jcf.LJIIIIZZ && !c495920Jcc.LJIIIIZZ.coHostEnable) {
            z = false;
        } else {
            z = true;
        }
        this.LLJIJIL = z;
    }

    @Override // X.AbstractC495790JcP
    public final boolean LJIIIZ(User user, Object obj) {
        LiveEventInfo liveEventInfo;
        String str;
        String strLIZIZ;
        if (LJIIIIZZ(user)) {
            return false;
        }
        this.LLIZLLLIL = user;
        List<LiveEventInfo> list = user.upcomingEventList;
        if (list == null || (liveEventInfo = (LiveEventInfo) C13LP.LJJJLL(list)) == null) {
            return false;
        }
        C16F5 c16f5 = this.LLILZLL;
        if (c16f5 != null) {
            long jLongValue = liveEventInfo.startTime.longValue();
            long millis = TimeUnit.SECONDS.toMillis(jLongValue);
            if (jLongValue == 0) {
                strLIZIZ = "";
            } else {
                long j = 0;
                long j2 = (j * 1000) + j;
                long j3 = j * 60;
                long j4 = j2 + (j3 * 1000) + (j3 * 60 * 1000) + (((long) 1) * 24 * 60 * 60 * 1000);
                C01A7 c01a7LIZ = C332701Qv.LIZ();
                long j5 = c01a7LIZ.LIZ - j4;
                c01a7LIZ.LIZ = j5;
                long j6 = c01a7LIZ.LIZIZ - j4;
                if (millis > j5 && millis < j6) {
                    strLIZIZ = C2275731E5r.LJIILLIIL.getValue().LIZIZ(millis, Locale.getDefault());
                } else {
                    C01A7 c01a7LIZ2 = C332701Qv.LIZ();
                    if (millis > c01a7LIZ2.LIZ && millis < c01a7LIZ2.LIZIZ) {
                        strLIZIZ = C2275731E5r.LJIJ.getValue().LIZIZ(millis, Locale.getDefault());
                    } else {
                        C01A7 c01a7LIZ3 = C332701Qv.LIZ();
                        long j7 = c01a7LIZ3.LIZ + j4;
                        c01a7LIZ3.LIZ = j7;
                        long j8 = c01a7LIZ3.LIZIZ + j4;
                        if (millis > j7 && millis < j8) {
                            strLIZIZ = C2275731E5r.LJIJJ.getValue().LIZIZ(millis, Locale.getDefault());
                        } else {
                            Calendar calendar = Calendar.getInstance();
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.setTimeInMillis(millis);
                            if (calendar2.get(1) == calendar.get(1)) {
                                strLIZIZ = C2275731E5r.LJIIJ.getValue().LIZIZ(millis, Locale.getDefault());
                            } else {
                                strLIZIZ = C2275731E5r.LJIIIZ.getValue().LIZIZ(millis, Locale.getDefault());
                            }
                        }
                    }
                }
            }
            c16f5.setText(strLIZIZ);
        }
        ViewGroup viewGroup = this.LLILZIL;
        if (viewGroup != null) {
            C495870JcX c495870JcX = InterfaceC495890JcZ.LJJLL;
            ACListenerS74S0300000_7 aCListenerS74S0300000_7 = new ACListenerS74S0300000_7(this, liveEventInfo, list, 13);
            C495980Jci c495980Jci = this.LL;
            EnumC495860JcW enumC495860JcW = EnumC495860JcW.BUSINESS;
            c495870JcX.getClass();
            C495870JcX.LIZIZ(viewGroup, aCListenerS74S0300000_7, false, c495980Jci, enumC495860JcW, "live_event", null);
        }
        C500260Jjc.LLFFF(this.LLILLL);
        if (this.LL.LIZJ.LIZLLL) {
            str = "livesdk_live_event_anchor_entrance_show";
        } else {
            str = "livesdk_live_event_user_entrance_show";
        }
        LJIIZILJ(str, "show", liveEventInfo, list);
        return true;
    }

    public final void LJIIZILJ(String str, String str2, LiveEventInfo liveEventInfo, List<? extends LiveEventInfo> list) {
        String str3;
        String str4;
        long id;
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIJJLI(this.LLJ);
        c474500IjALIZ.LJJII("profile", "enter_from");
        boolean z = true;
        c474500IjALIZ.LJJII(Integer.valueOf(!liveEventInfo.isPaidEvent.booleanValue() ? 1 : 0), "is_free");
        if (this.LL.LIZJ.LJI) {
            str3 = "anchor";
        } else {
            str3 = "user";
        }
        c474500IjALIZ.LJJII(str3, "user_type");
        c474500IjALIZ.LJJII(str2, "action_type");
        C495950Jcf c495950Jcf = this.LL.LIZJ;
        if (c495950Jcf.LJI) {
            if (c495950Jcf.LIZLLL) {
                str4 = "self_anchor";
            } else {
                str4 = "link_anchor";
            }
        } else if (c495950Jcf.LJII) {
            str4 = "audience_c_host_anchor";
        } else {
            str4 = "audience_c_link_anchor";
        }
        c474500IjALIZ.LJJII(str4, "request_page");
        c474500IjALIZ.LJJII("profile", "event_page");
        if (list.size() <= 1) {
            z = false;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_multi_event");
        c474500IjALIZ.LJJII(liveEventInfo.eventId, "main_live_event_id");
        c474500IjALIZ.LJJII("upcoming", "main_live_event_status");
        c474500IjALIZ.LJJII(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, new AwS586S0100000_7(this, 431), 30), "live_event_status");
        c474500IjALIZ.LJJII(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS237S0000000_7.get$arr$(290), 30), "live_event_id");
        User user = this.LLIZLLLIL;
        if (user != null) {
            id = user.getId();
        } else {
            id = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "anchor_id");
        c474500IjALIZ.LIZ();
    }
}
