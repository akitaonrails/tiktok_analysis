package Y;

import X.C784440Upu;
import X.C934080aPm;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.GuestInviteViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.IGuestInviteAbility;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS49S0100100_15;

/* JADX INFO: loaded from: classes16.dex */
public class ACListenerS0S1302000_15 implements View.OnClickListener {
    public final int $t;
    public int i4;
    public int i5;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS0S1302000_15 aCListenerS0S1302000_15, View view) {
        ((C934080aPm) aCListenerS0S1302000_15.l1).LIZ(aCListenerS0S1302000_15.i4, aCListenerS0S1302000_15.i5, (User) aCListenerS0S1302000_15.l2, "profile_head", aCListenerS0S1302000_15.s0);
        User user = (User) aCListenerS0S1302000_15.l2;
        if (user != null) {
            ((C934080aPm) aCListenerS0S1302000_15.l1).getClass();
            C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
            UserProfileEvent userProfileEvent = new UserProfileEvent(user);
            userProfileEvent.clickModule = "multi_guest_guest_invite_guide";
            c784440UpuLIZ.LIZIZ(userProfileEvent);
        }
        Function0 function0 = (Function0) aCListenerS0S1302000_15.l3;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onClick$1(ACListenerS0S1302000_15 aCListenerS0S1302000_15, View view) {
        GuestInviteViewModel viewModel;
        GuestInviteViewModel viewModel2;
        ((C934080aPm) aCListenerS0S1302000_15.l1).LIZ(aCListenerS0S1302000_15.i4, aCListenerS0S1302000_15.i5, (User) aCListenerS0S1302000_15.l2, "head_invite", aCListenerS0S1302000_15.s0);
        User user = (User) aCListenerS0S1302000_15.l2;
        if (user != null) {
            C934080aPm c934080aPm = (C934080aPm) aCListenerS0S1302000_15.l1;
            long id = user.getId();
            IGuestInviteAbility iGuestInviteAbility = c934080aPm.LIZJ;
            if (iGuestInviteAbility != null && (viewModel2 = iGuestInviteAbility.getViewModel()) != null) {
                viewModel2.xQ2(1, id, 2, new AwS49S0100100_15(c934080aPm, id, 8), null);
            }
        }
        IGuestInviteAbility iGuestInviteAbility2 = ((C934080aPm) aCListenerS0S1302000_15.l1).LIZJ;
        if (iGuestInviteAbility2 != null && (viewModel = iGuestInviteAbility2.getViewModel()) != null) {
            viewModel.setState(AFwS250S0000000_15.get$arr$(3));
        }
        Function0 function0 = (Function0) aCListenerS0S1302000_15.l3;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onClick$2(ACListenerS0S1302000_15 aCListenerS0S1302000_15, View view) {
        ((C934080aPm) aCListenerS0S1302000_15.l1).LIZ(aCListenerS0S1302000_15.i4, aCListenerS0S1302000_15.i5, (User) aCListenerS0S1302000_15.l2, "profile_head", aCListenerS0S1302000_15.s0);
        ((C934080aPm) aCListenerS0S1302000_15.l1).LIZIZ();
        Function0 function0 = (Function0) aCListenerS0S1302000_15.l3;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onClick$3(ACListenerS0S1302000_15 aCListenerS0S1302000_15, View view) {
        ((C934080aPm) aCListenerS0S1302000_15.l1).LIZ(aCListenerS0S1302000_15.i4, aCListenerS0S1302000_15.i5, (User) aCListenerS0S1302000_15.l2, "head_invite", aCListenerS0S1302000_15.s0);
        ((C934080aPm) aCListenerS0S1302000_15.l1).LIZIZ();
        Function0 function0 = (Function0) aCListenerS0S1302000_15.l3;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS0S1302000_15(C934080aPm c934080aPm, C934080aPm c934080aPm2, User user, int i, int i2, String str, Function0<Unit> function0) {
        this.$t = function0;
        this.l1 = c934080aPm;
        this.l2 = c934080aPm2;
        this.i4 = user;
        this.i5 = i;
        this.s0 = i2;
        this.l3 = str;
    }
}
