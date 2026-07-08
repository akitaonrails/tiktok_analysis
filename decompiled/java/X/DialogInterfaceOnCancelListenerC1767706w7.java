package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06w7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class DialogInterfaceOnCancelListenerC1767706w7 implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                break;
            case 1:
                onCancel$1(this, dialogInterface);
                break;
            case 2:
                onCancel$2(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnCancelListenerC1767706w7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC1767706w7 dialogInterfaceOnCancelListenerC1767706w7, DialogInterface dialogInterface) {
        C912070ZqH.LIZIZ.LJIJJ().LIZJ().LIZIZ(0, "chat");
        ((C1692206jw) dialogInterfaceOnCancelListenerC1767706w7.l0).LLZLI();
        ((C1692206jw) dialogInterfaceOnCancelListenerC1767706w7.l0).LLILZIL = null;
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC1767706w7 dialogInterfaceOnCancelListenerC1767706w7, DialogInterface dialogInterface) {
        ((C1686306iz) dialogInterfaceOnCancelListenerC1767706w7.l0).LLZLI();
        ((C1686306iz) dialogInterfaceOnCancelListenerC1767706w7.l0).LLILZ = null;
    }

    public static final void onCancel$2(DialogInterfaceOnCancelListenerC1767706w7 dialogInterfaceOnCancelListenerC1767706w7, DialogInterface dialogInterface) {
        String str = TuxSheet._pnsPageId;
        if (Intrinsics.LJFF(C1391190mJ3.LJIIJ(dialogInterface), C343980De8.LIZ)) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((Fragment) dialogInterfaceOnCancelListenerC1767706w7.l0), null, null, new C1416005gU(null), 3);
            C20684815ws.LJIILLIIL("filter_all_close_reminder_page_click", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "comment_zone"), new Pair("action", "close")));
        }
    }
}
