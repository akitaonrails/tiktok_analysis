package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.ss.android.ugc.aweme.ILoginService;

/* JADX INFO: renamed from: X.0Xfn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class DialogInterfaceOnClickListenerC854610Xfn implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
        }
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC854610Xfn dialogInterfaceOnClickListenerC854610Xfn, DialogInterface dialogInterface, int i) {
        C0XQ7.LIZ().changeEmail((Activity) dialogInterfaceOnClickListenerC854610Xfn.l1, dialogInterfaceOnClickListenerC854610Xfn.s0, (Bundle) dialogInterfaceOnClickListenerC854610Xfn.l2, null);
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC854610Xfn dialogInterfaceOnClickListenerC854610Xfn, DialogInterface dialogInterface, int i) {
        ILoginService iLoginServiceLIZJ = C0XQ7.LIZJ();
        C0XQS c0xqs = new C0XQS();
        c0xqs.LIZ = (Activity) dialogInterfaceOnClickListenerC854610Xfn.l1;
        final C0XK9 c0xk9 = (C0XK9) dialogInterfaceOnClickListenerC854610Xfn.l2;
        final String str = dialogInterfaceOnClickListenerC854610Xfn.s0;
        c0xqs.LJ = new C0XTR() { // from class: X.0XKB
            @Override // X.C0XTR
            public final void onResult(int i2, int i3, Object obj) {
                C0XK9 c0xk92 = c0xk9;
                String str2 = str;
                if (i2 == 1 && i3 == 1) {
                    C1440005kM.LIZ(new C0XKC(str2));
                }
                c0xk92.LIZJ.set(false);
            }
        };
        iLoginServiceLIZJ.showLoginAndRegisterView(c0xqs.LIZ());
    }

    public DialogInterfaceOnClickListenerC854610Xfn(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
