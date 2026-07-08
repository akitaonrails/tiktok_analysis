package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.live.toplives.notifications.LiveNotificationItem;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import webcast.api.feed.NoticeItem;

/* JADX INFO: renamed from: X.0Kd2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class ViewOnLongClickListenerC521660Kd2 implements View.OnLongClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            case 4:
                return onLongClick$4(this, view);
            default:
                return false;
        }
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC521660Kd2 viewOnLongClickListenerC521660Kd2, View view) {
        SubSpaceDetailVM subSpaceDetailVM = ((C0K3R) viewOnLongClickListenerC521660Kd2.l0).LLILLJJLI;
        C0K3J c0k3j = (C0K3J) viewOnLongClickListenerC521660Kd2.l1;
        subSpaceDetailVM.getClass();
        subSpaceDetailVM.setState(new AwS586S0100000_7(c0k3j, 387));
        return true;
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC521660Kd2 viewOnLongClickListenerC521660Kd2, View view) {
        SubSpaceDetailVM subSpaceDetailVM = ((C0K3R) viewOnLongClickListenerC521660Kd2.l0).LLILLJJLI;
        C0K3J c0k3j = (C0K3J) viewOnLongClickListenerC521660Kd2.l1;
        subSpaceDetailVM.getClass();
        subSpaceDetailVM.setState(new AwS586S0100000_7(c0k3j, 387));
        return true;
    }

    public static final boolean onLongClick$2(ViewOnLongClickListenerC521660Kd2 viewOnLongClickListenerC521660Kd2, View view) {
        SubSpaceDetailVM subSpaceDetailVM = ((C0K3Q) viewOnLongClickListenerC521660Kd2.l0).LLILLJJLI;
        C0K3J c0k3j = (C0K3J) viewOnLongClickListenerC521660Kd2.l1;
        subSpaceDetailVM.getClass();
        subSpaceDetailVM.setState(new AwS586S0100000_7(c0k3j, 387));
        return true;
    }

    public static final boolean onLongClick$3(ViewOnLongClickListenerC521660Kd2 viewOnLongClickListenerC521660Kd2, View view) {
        SubSpaceDetailVM subSpaceDetailVM = ((C0K3Q) viewOnLongClickListenerC521660Kd2.l0).LLILLJJLI;
        C0K3J c0k3j = (C0K3J) viewOnLongClickListenerC521660Kd2.l1;
        subSpaceDetailVM.getClass();
        subSpaceDetailVM.setState(new AwS586S0100000_7(c0k3j, 387));
        return true;
    }

    public static final boolean onLongClick$4(ViewOnLongClickListenerC521660Kd2 viewOnLongClickListenerC521660Kd2, View view) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        LiveNotificationItem liveNotificationItem = (LiveNotificationItem) viewOnLongClickListenerC521660Kd2.l0;
        NoticeItem noticeItem = (NoticeItem) viewOnLongClickListenerC521660Kd2.l1;
        Context context = liveNotificationItem.itemView.getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && supportFragmentManager.LJJJJZI("LiveNotificationActionSheet") == null) {
            C1247510iZJ c1247510iZJ = new C1247510iZJ();
            c1247510iZJ.LIZJ = 1;
            c1247510iZJ.LIZ = liveNotificationItem.itemView.getContext().getString(R.string.gm7);
            c1247510iZJ.LIZ(new AwS373S0200000_7(liveNotificationItem, noticeItem, 88));
            List listSingletonList = Collections.singletonList(c1247510iZJ);
            C1390850mIV c1390850mIV = new C1390850mIV();
            c1390850mIV.LJI(listSingletonList);
            c1390850mIV.LIZ.LLJJJIL = liveNotificationItem.itemView.getContext().getString(R.string.f1_);
            c1390850mIV.LIZJ().show(supportFragmentManager, "LiveNotificationActionSheet");
        }
        return true;
    }

    public ViewOnLongClickListenerC521660Kd2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
