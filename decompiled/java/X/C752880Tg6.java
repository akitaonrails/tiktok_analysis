package X;

import Y.AfS181S0100000_12;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.profile.service.ILiveProfileService;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.usercard.TryModeLiveProfileDialog;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Tg6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C752880Tg6 extends RecyclerView.ViewHolder {
    public final EnumC748580TYa LL;
    public final DataChannel LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final C1099610eil LLILZ;
    public final View LLILZIL;
    public final C16FS LLILZLL;
    public final TextView LLIZ;
    public final TextView LLIZLLLIL;

    public final void L5(C752860Tg4 c752860Tg4) {
        String str;
        FragmentManager fragmentManager;
        if (C500260Jjc.LJJJIL(this.LLILLJJLI)) {
            TryModeLiveProfileDialog tryModeLiveProfileDialogHG1 = ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).HG1(c752860Tg4.LIZJ, null);
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                tryModeLiveProfileDialogHG1.NR(fragmentManager);
                return;
            }
            return;
        }
        if (C500260Jjc.LJJIJLIJ()) {
            HashMap map = new HashMap();
            if (c752860Tg4 != null) {
                str = c752860Tg4.LIZLLL;
            } else {
                str = "";
            }
            map.put("sec_user_id", str);
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openUserProfilePage(c752860Tg4.LIZJ, map);
            return;
        }
        UserProfileEvent userProfileEvent = new UserProfileEvent(c752860Tg4.LIZJ);
        userProfileEvent.mReportType = "report_user";
        userProfileEvent.setEnigmaOutside(c752860Tg4.LJII);
        C784440Upu.LIZ().LIZIZ(userProfileEvent);
    }

    public static final void I5(User user, C752880Tg6 c752880Tg6) {
        C0IR5 c0ir5;
        c752880Tg6.LLILZLL.LJ();
        DataChannel dataChannel = c752880Tg6.LLILLJJLI;
        LifecycleOwner lifecycleOwner = null;
        if (dataChannel != null) {
            c0ir5 = (C0IR5) dataChannel.gg0(C1087000eOQ.class);
        } else {
            c0ir5 = null;
        }
        DataChannel dataChannel2 = c752880Tg6.LLILLJJLI;
        if (dataChannel2 != null) {
            lifecycleOwner = dataChannel2.LLILZ;
        }
        ((C0J1N) C476130Iln.LIZIZ(user, c0ir5, lifecycleOwner).LIZJ(C11RD.LJ(c752880Tg6.LLILLL))).LIZ(new AfS181S0100000_12(c752880Tg6, 24), new AfS181S0100000_12(c752880Tg6, 25));
    }

    public C752880Tg6(View view, EnumC748580TYa enumC748580TYa, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        super(view);
        this.LL = enumC748580TYa;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = (C1099610eil) view.findViewById(R.id.jjh);
        this.LLILZIL = view.findViewById(R.id.a3w);
        this.LLILZLL = (C16FS) view.findViewById(R.id.a23);
        this.LLIZ = (TextView) view.findViewById(R.id.user_tag);
        this.LLIZLLLIL = (TextView) view.findViewById(R.id.user_name);
    }
}
