package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Hzm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C459320Hzm implements C0IBX {
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public final SessionInfo LIZJ;
    public final String LIZLLL;
    public C099G LJ;

    @Override // X.C0IBX
    public final Integer LJ() {
        return null;
    }

    @Override // X.C0IBX
    public final int getType() {
        return 3;
    }

    @Override // X.C0IBX
    public final Integer LIZ() {
        return Integer.valueOf(R.raw.icon_game_controller_fill);
    }

    @Override // X.C0IBX
    public final Integer LIZJ() {
        return 2131831801;
    }

    @Override // X.C0IBX
    public final void LIZLLL(C197039127h c197039127h) {
        Activity activityLIZ = C1388190mED.LIZ(this.LIZ);
        if (activityLIZ == null) {
            return;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LIZIZ);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C459310Hzl(this, activityLIZ, null), 2);
    }

    @Override // X.C0IBX
    public final void LJFF(C197039127h c197039127h) {
        View view;
        String str;
        View viewFindViewById;
        C1378990lzN.LIZIZ(c197039127h, Float.valueOf(C418440Gaw.LIZIZ(200)), null, null, null, null, 30);
        Object parent = c197039127h.getParent();
        if (parent instanceof ViewGroup) {
            view = (View) parent;
        } else {
            view = null;
        }
        if (view != null && (viewFindViewById = view.findViewById(R.id.video_card_bottom_gradient)) != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        } else {
            c197039127h.addOnAttachStateChangeListener(new C04JG(1));
        }
        C0I0B.LJFF.LIZIZ();
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("conversation_id", this.LIZJ.getConversationId());
        Integer numValueOf = Integer.valueOf(this.LIZJ.getChatType());
        if (numValueOf != null && numValueOf.intValue() == 3) {
            str = "group";
        } else {
            str = "private";
        }
        pairArr[1] = new Pair("chat_type", str);
        String str2 = this.LIZLLL;
        str2.toString();
        pairArr[2] = new Pair("effect_id", str2);
        pairArr[3] = new Pair("enter_from", "chat");
        pairArr[4] = new Pair("enter_method", "effect_game_card");
        pairArr[5] = new Pair("is_game_owner", "1");
        pairArr[6] = new Pair("user_cnt", "1");
        pairArr[7] = new Pair("users_played_cnt", "1");
        pairArr[8] = new Pair("resource_id", "");
        C20684815ws.LJIILLIIL("show_game_battle_entrance", C2097608Jq.LJIIJ(pairArr));
    }

    public C459320Hzm(Context context, LifecycleOwner lifecycleOwner, SessionInfo sessionInfo, String str) {
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = sessionInfo;
        this.LIZLLL = str;
    }
}
