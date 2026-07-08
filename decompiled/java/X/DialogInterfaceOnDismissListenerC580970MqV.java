package X;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import java.util.LinkedHashMap;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0MqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class DialogInterfaceOnDismissListenerC580970MqV implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) throws Exception {
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

    public DialogInterfaceOnDismissListenerC580970MqV(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC580970MqV dialogInterfaceOnDismissListenerC580970MqV, DialogInterface dialogInterface) {
        C2296808zG.LIZJ((InterfaceC497601wk) dialogInterfaceOnDismissListenerC580970MqV.l0, null);
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC580970MqV dialogInterfaceOnDismissListenerC580970MqV, DialogInterface dialogInterface) {
        C09AE c09ae = ((C526120KkE) dialogInterfaceOnDismissListenerC580970MqV.l0).LLJILJIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC580970MqV dialogInterfaceOnDismissListenerC580970MqV, DialogInterface dialogInterface) {
        String str = TuxSheet._pnsPageId;
        boolean z = C1391190mJ3.LJIIJJI(dialogInterface) instanceof C343980De8;
        C497720JfW c497720JfW = C497720JfW.LIZ;
        String enterFrom = ((DraftFragment) dialogInterfaceOnDismissListenerC580970MqV.l0).getEnterFrom();
        String strOR = ((DraftFragment) dialogInterfaceOnDismissListenerC580970MqV.l0).OR();
        C499180Jhs c499180Jhs = C499180Jhs.LIZ;
        boolean z2 = C499180Jhs.LIZJ.getBoolean("posted_draft_status", true);
        c497720JfW.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C497720JfW.LIZ(enterFrom, strOR, linkedHashMap);
        linkedHashMap.put("is_auto_save_draft", C1402490mbH.LIZ(z2));
        linkedHashMap.put("is_click_dismiss", C1402490mbH.LIZ(z));
        C20684815ws.LJIILLIIL("draft_settings_dismiss", linkedHashMap);
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC580970MqV dialogInterfaceOnDismissListenerC580970MqV, DialogInterface dialogInterface) {
        C2296808zG.LIZJ((InterfaceC497601wk) dialogInterfaceOnDismissListenerC580970MqV.l0, null);
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC580970MqV dialogInterfaceOnDismissListenerC580970MqV, DialogInterface dialogInterface) {
        C565060MEe c565060MEe = (C565060MEe) dialogInterfaceOnDismissListenerC580970MqV.l0;
        c565060MEe.getClass();
        EventBus.LIZLLL().LJJI(c565060MEe);
        C1440005kM.LIZ(new C453940Hr6(false, false, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onDismiss$5(DialogInterfaceOnDismissListenerC580970MqV dialogInterfaceOnDismissListenerC580970MqV, DialogInterface dialogInterface) throws Exception {
        Dialog dialog;
        DialogFragment dialogFragment = (DialogFragment) ((C259800zU) dialogInterfaceOnDismissListenerC580970MqV.l0).element;
        if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null) {
            C2211631BhB.LIZIZ(dialog);
        }
    }
}
