package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.dataChannel.GameLiveGuessInfoChangeEvent;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.message.GameGuessToastMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0Tgm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C753300Tgm implements InterfaceC773910UXl {
    public View LL;
    public DataChannel LLILLJJLI;
    public boolean LLILLL;

    @Override // X.InterfaceC773910UXl
    public final void LIZ(DataChannel dataChannel) {
    }

    @Override // X.InterfaceC773910UXl
    public final int LIZIZ() {
        return 2131852798;
    }

    @Override // X.InterfaceC773910UXl
    public final int LJ() {
        return R.attr.dtw;
    }

    @Override // X.InterfaceC773910UXl
    public final void onHide() {
    }

    public final void LIZJ() {
        boolean z;
        InterfaceC753440Th0 interfaceC753440Th0;
        View view = this.LL;
        if (view != null) {
            View viewFindViewById = view.findViewById(R.id.kij);
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel == null || (interfaceC753440Th0 = (InterfaceC753440Th0) C2659011d.LIZ(dataChannel, InterfaceC753440Th0.class)) == null || interfaceC753440Th0.LJIJJLI() == null) {
                z = false;
                C500260Jjc.LJIILIIL(viewFindViewById);
            } else {
                z = true;
                C500260Jjc.LLFFF(viewFindViewById);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("refreshProgressView, haveRunningRound: ");
            sbLIZ.append(z);
            C20441214yg.LIZIZ("InteractionGuessingView", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC773910UXl
    public final void onShow() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onShow, isShow: ");
        sbLIZ.append(this.LLILLL);
        C20441214yg.LIZIZ("InteractionGuessingView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        LIZLLL("show");
    }

    public final void LIZLLL(String str) {
        Long lValueOf;
        long jLongValue;
        InterfaceC753440Th0 interfaceC753440Th0;
        Hashtag hashtag;
        Long l;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_guessing_entrance");
        c474500IjALIZ.LJJIJIIJI(Long.valueOf(C500260Jjc.LJJLIIIJ(this.LLILLJJLI)));
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LLILLJJLI);
        List<String> listLJIJJLI = null;
        if (roomLJJLIIIIJ != null) {
            lValueOf = Long.valueOf(roomLJJLIIIIJ.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJI(lValueOf);
        c474500IjALIZ.LJJ(C500260Jjc.LJJJJJL(this.LLILLJJLI));
        c474500IjALIZ.LJ(str);
        c474500IjALIZ.LJJII("interact_panel", "entrance");
        Room roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(this.LLILLJJLI);
        if (roomLJJLIIIIJ2 != null && (hashtag = roomLJJLIIIIJ2.hashtag) != null && (l = hashtag.id) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 5;
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "choose_hashtag_id");
        c474500IjALIZ.LJJII(Integer.valueOf(RedDotExtensionKt.LJIILLIIL(C0UX6.RED_DOT_LIVE_BROADCAST_INTERACT_GUESSING) ? 1 : 0), "has_red_dot");
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null && (interfaceC753440Th0 = (InterfaceC753440Th0) C2659011d.LIZ(dataChannel, InterfaceC753440Th0.class)) != null) {
            listLJIJJLI = interfaceC753440Th0.LJIJJLI();
        }
        c474500IjALIZ.LJJII(AnonymousClass0104.LIZLLL(listLJIJJLI), "round_id");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC773910UXl
    public final void onClick(View view) {
        String str;
        InterfaceC753440Th0 interfaceC753440Th0;
        if (view == null) {
            return;
        }
        DataChannel dataChannel = this.LLILLJJLI;
        GameGuessToastMessage gameGuessToastMessageLJJIIJZLJL = null;
        if (dataChannel != null && (interfaceC753440Th0 = (InterfaceC753440Th0) C2659011d.LIZ(dataChannel, InterfaceC753440Th0.class)) != null) {
            gameGuessToastMessageLJJIIJZLJL = interfaceC753440Th0.LJJIIJZLJL();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (gameGuessToastMessageLJJIIJZLJL != null && (str = gameGuessToastMessageLJJIIJZLJL.showOptionIdxStr) != null && str.length() > 0) {
            linkedHashMap.put("show_option_idx", str);
            linkedHashMap.put("ui_auto_open_result_popup", "1");
            linkedHashMap.put("round_id", gameGuessToastMessageLJJIIJZLJL.roundIdStr);
        }
        linkedHashMap.put("open_page_time", String.valueOf(System.currentTimeMillis()));
        C753430Tgz.LJIIL("interact_panel", linkedHashMap, this.LLILLJJLI, view.getContext());
        LIZLLL("click");
        C0UX6 c0ux6 = C0UX6.RED_DOT_LIVE_BROADCAST_INTERACT_GUESSING;
        RedDotExtensionKt.LIZ(c0ux6);
        View viewFindViewById = view.findViewById(R.id.b1e);
        if (viewFindViewById != null) {
            RedDotExtensionKt.LJIILJJIL(c0ux6, viewFindViewById, false);
        }
    }

    @Override // X.InterfaceC773910UXl
    public final void LJI(View view, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        this.LL = view;
        this.LLILLJJLI = dataChannel;
        LIZJ();
        if (view != null) {
            RedDotExtensionKt.LJI(view.findViewById(R.id.b1e), lifecycleOwner, null, C0UX6.RED_DOT_LIVE_BROADCAST_INTERACT_GUESSING, null);
        }
        if (dataChannel != null) {
            dataChannel.BQ2(lifecycleOwner, GameLiveGuessInfoChangeEvent.class, new AwS591S0100000_12(this, 1243));
        }
    }

    @Override // X.InterfaceC773910UXl
    public final void LJFF(View view, String str, WeakReference<InterfaceC978780bZs> weakReference, DataChannel dataChannel, boolean z, int i) {
        onClick(view);
    }
}
