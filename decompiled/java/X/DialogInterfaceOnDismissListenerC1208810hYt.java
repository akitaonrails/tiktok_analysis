package X;

import android.content.DialogInterface;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.mixdetail.MixVideosDialog;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class DialogInterfaceOnDismissListenerC1208810hYt implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
            case 5:
                onDismiss$5(this, dialogInterface);
                break;
            case 6:
                onDismiss$6(this, dialogInterface);
                break;
            case 7:
                onDismiss$7(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnDismissListenerC1208810hYt(int i) {
        this.$t = i;
        this.l0 = null;
    }

    public DialogInterfaceOnDismissListenerC1208810hYt(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC1208810hYt dialogInterfaceOnDismissListenerC1208810hYt, DialogInterface dialogInterface) {
        Function0 function0 = (Function0) dialogInterfaceOnDismissListenerC1208810hYt.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC1208810hYt dialogInterfaceOnDismissListenerC1208810hYt, DialogInterface dialogInterface) {
        String uid;
        User author;
        C1169160gWw c1169160gWw = C1169160gWw.LIZ;
        MixVideosDialog mixVideosDialog = (MixVideosDialog) dialogInterfaceOnDismissListenerC1208810hYt.l0;
        Aweme aweme = mixVideosDialog.LLJJJJJIL;
        String str = mixVideosDialog.LLJJJJLIIL;
        String str2 = mixVideosDialog.LLJJLIIIJLLLLLLLZ;
        String str3 = mixVideosDialog.LLJLL;
        c1169160gWw.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("playlist_id", str);
        String groupId = null;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        if (aweme != null) {
            groupId = aweme.getGroupId();
        }
        c2344009Gk.LJIIIIZZ("group_id", groupId);
        c2344009Gk.LJIIIIZZ("playlist_session_id", str3);
        C20684815ws.LJIILLIIL("leave_playlist", c2344009Gk.LIZ);
        if (!C297010BkZ.LIZ()) {
            ((MixVideosDialog) dialogInterfaceOnDismissListenerC1208810hYt.l0).gS();
        }
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC1208810hYt dialogInterfaceOnDismissListenerC1208810hYt, DialogInterface dialogInterface) {
        ((C1189730h47) dialogInterfaceOnDismissListenerC1208810hYt.l0).LLILLL.LIZ();
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC1208810hYt dialogInterfaceOnDismissListenerC1208810hYt, DialogInterface dialogInterface) {
        ((C1191030h6D) dialogInterfaceOnDismissListenerC1208810hYt.l0).LLILLL.LIZ();
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC1208810hYt dialogInterfaceOnDismissListenerC1208810hYt, DialogInterface dialogInterface) {
        C1196500hF2 c1196500hF2 = (C1196500hF2) dialogInterfaceOnDismissListenerC1208810hYt.l0;
        if (c1196500hF2 != null) {
            c1196500hF2.dismiss();
        }
        PopupManager.LIZJ(C1261830iwP.class);
    }

    public static final void onDismiss$5(DialogInterfaceOnDismissListenerC1208810hYt dialogInterfaceOnDismissListenerC1208810hYt, DialogInterface dialogInterface) {
        Function0 function0 = (Function0) dialogInterfaceOnDismissListenerC1208810hYt.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onDismiss$6(DialogInterfaceOnDismissListenerC1208810hYt dialogInterfaceOnDismissListenerC1208810hYt, DialogInterface dialogInterface) {
        Function0 function0 = (Function0) dialogInterfaceOnDismissListenerC1208810hYt.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onDismiss$7(DialogInterfaceOnDismissListenerC1208810hYt dialogInterfaceOnDismissListenerC1208810hYt, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnDismissListenerC1208810hYt.l0).invoke();
    }
}
