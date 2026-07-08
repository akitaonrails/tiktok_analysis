package X;

import Y.AfS181S0100000_12;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.adminsetting.MarkViewerNotionFragment;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveMarkViewerOptimizationSetting;
import com.bytedance.android.livesdk.usercard.LiveProfileManageNewDialog;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0Tg9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C752910Tg9 extends AbstractC752950TgD implements InterfaceC750590TcP {
    public final Room LLILZ;
    public User LLILZIL;
    public final DataChannel LLILZLL;

    @Override // X.AbstractC752950TgD
    public final Function0<Unit> LIZLLL() {
        return new AwS556S0100000_12(this, 816);
    }

    @Override // X.AbstractC752950TgD
    public final Function1<Boolean, Unit> LJII() {
        return new AwS591S0100000_12(this, 925);
    }

    public final void LJIIIZ() {
        InterfaceC750520TcI interfaceC750520TcI;
        InterfaceC750520TcI interfaceC750520TcI2 = this.LLILLJJLI;
        if ((interfaceC750520TcI2 == null || interfaceC750520TcI2.LIZ() != this.LLILZIL.isAnchorMarked) && (interfaceC750520TcI = this.LLILLJJLI) != null) {
            interfaceC750520TcI.LIZIZ(this.LLILZIL.isAnchorMarked);
        }
    }

    public final void LJIIJ() {
        FragmentManager fragmentManagerOc;
        InterfaceC752920TgA interfaceC752920TgA = this.LLILLL;
        if (interfaceC752920TgA == null || (fragmentManagerOc = interfaceC752920TgA.oc()) == null) {
            return;
        }
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.dimBehindType = 1;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", this.LLILLL instanceof LiveProfileManageNewDialog ? "profile_settings_panel" : "comment_panel", bundle);
        C19322110iZ.LIZLLL(fragmentManagerOc, MarkViewerNotionFragment.class, "mark_viewer_notion", sheetOptions, bundle);
    }

    @Override // X.InterfaceC750590TcP
    public final void LIZ(User user) {
        User user2 = this.LLILZIL;
        user.enigmaInfo = user2.enigmaInfo;
        user.setDisplayId(user2.getUsername());
        user.setNickName(this.LLILZIL.getNickName());
        this.LLILZIL = user;
    }

    @Override // X.AbstractC752950TgD
    public final boolean LJ(EnumC755280Tjy enumC755280Tjy) {
        Boolean boolValueOf;
        User owner = this.LLILZ.getOwner();
        if (owner != null && owner.getId() == this.LLILZIL.getId()) {
            return false;
        }
        User.EnigmaInfo enigmaInfo = this.LLILZIL.enigmaInfo;
        if (enigmaInfo != null) {
            boolValueOf = Boolean.valueOf(enigmaInfo.isEnigmaMaskOn);
        } else {
            boolValueOf = null;
        }
        if (!C176600m4.LIZIZ(boolValueOf)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC752950TgD
    public final boolean LJI(EnumC755280Tjy enumC755280Tjy) {
        return LJ(enumC755280Tjy);
    }

    @Override // X.AbstractC752950TgD
    public final void LIZIZ(C755180Tjo c755180Tjo, Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        this.LLILLJJLI = c755180Tjo;
        this.LL = context;
        LJIIIZ();
        LifecycleOwner lifecycleOwnerLLILLIZIL = null;
        if (LiveMarkViewerOptimizationSetting.INSTANCE.getValue()) {
            C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.n5;
            if (c20337914i1.LIZIZ().booleanValue()) {
                if (c755180Tjo != null) {
                    c755180Tjo.LJII();
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_mark_viewer_highlight");
                c474500IjALIZ.LJIJJLI(this.LLILZLL);
                LiveMode liveMode = (LiveMode) this.LLILZLL.gg0(LiveModeChannel.class);
                if (liveMode != null) {
                    str3 = liveMode.logStreamingType;
                } else {
                    str3 = null;
                }
                c474500IjALIZ.LJJ(str3);
                c474500IjALIZ.LJJII(String.valueOf(this.LLILZIL.getId()), "to_user_id");
                if (this.LLILLL instanceof LiveProfileManageNewDialog) {
                    str4 = "link_audience_profile_settings";
                } else {
                    str4 = "comment_panel";
                }
                c474500IjALIZ.LJJII(str4, "enter_from_page");
                c474500IjALIZ.LIZ();
                c20337914i1.LJFF(Boolean.FALSE);
            }
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_anchor_mark_viewer_switch");
        c474500IjALIZ2.LJIJJLI(this.LLILZLL);
        c474500IjALIZ2.LJJII(String.valueOf(this.LLILZIL.getId()), "to_user_id");
        c474500IjALIZ2.LJJII("show", "action_type");
        if (this.LLILZIL.isAnchorMarked) {
            str = "on";
        } else {
            str = "off";
        }
        c474500IjALIZ2.LJJII(str, "icon_type");
        if (this.LLILLL instanceof LiveProfileManageNewDialog) {
            str2 = "profile_card";
        } else {
            str2 = "click_comment";
        }
        c474500IjALIZ2.LJJII(str2, "enter_from");
        c474500IjALIZ2.LIZ();
        C11RK<Pair<Long, Boolean>> c11rk = C476130Iln.LIZ;
        c11rk.getClass();
        C19491011Nk c19491011NkLJJIL = new C19475711Hn(c11rk).LJJIL(new C786280Uss(this, 1));
        InterfaceC752920TgA interfaceC752920TgA = this.LLILLL;
        if (interfaceC752920TgA != null) {
            lifecycleOwnerLLILLIZIL = interfaceC752920TgA.LLILLIZIL();
        }
        ((C0J1N) c19491011NkLJJIL.LIZJ(C11RD.LJ(lifecycleOwnerLLILLIZIL))).LIZJ(new AfS181S0100000_12(this, 187));
    }

    public C752910Tg9(Room room, User user, DataChannel dataChannel) {
        this.LLILZ = room;
        this.LLILZIL = user;
        this.LLILZLL = dataChannel;
    }
}
