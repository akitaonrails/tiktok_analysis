package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.music.HighlightChooseMusicDialogFragment;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcIntroFragment;

/* JADX INFO: renamed from: X.0Di1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class DialogInterfaceOnDismissListenerC346390Di1 implements DialogInterface.OnDismissListener {
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
        }
    }

    public DialogInterfaceOnDismissListenerC346390Di1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC346390Di1 dialogInterfaceOnDismissListenerC346390Di1, DialogInterface dialogInterface) {
        HighlightChooseMusicDialogFragment highlightChooseMusicDialogFragment = (HighlightChooseMusicDialogFragment) dialogInterfaceOnDismissListenerC346390Di1.l0;
        C344110DeL.LIZ(highlightChooseMusicDialogFragment.LL, highlightChooseMusicDialogFragment.LLILLJJLI, highlightChooseMusicDialogFragment.LLILLL);
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC346390Di1 dialogInterfaceOnDismissListenerC346390Di1, DialogInterface dialogInterface) {
        ((C20656615sK) dialogInterfaceOnDismissListenerC346390Di1.l0).LIZ();
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC346390Di1 dialogInterfaceOnDismissListenerC346390Di1, DialogInterface dialogInterface) {
        ((C344610Df9) dialogInterfaceOnDismissListenerC346390Di1.l0).LIZIZ = false;
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC346390Di1 dialogInterfaceOnDismissListenerC346390Di1, DialogInterface dialogInterface) {
        ProfileAigcIntroFragment profileAigcIntroFragment = (ProfileAigcIntroFragment) dialogInterfaceOnDismissListenerC346390Di1.l0;
        profileAigcIntroFragment.LLJILJILJ = false;
        profileAigcIntroFragment.LLJILLL = null;
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC346390Di1 dialogInterfaceOnDismissListenerC346390Di1, DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) dialogInterfaceOnDismissListenerC346390Di1.l0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public static final void onDismiss$5(DialogInterfaceOnDismissListenerC346390Di1 dialogInterfaceOnDismissListenerC346390Di1, DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) dialogInterfaceOnDismissListenerC346390Di1.l0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
