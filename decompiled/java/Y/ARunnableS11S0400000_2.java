package Y;

import X.C05X1;
import X.C05X2;
import X.C0SY5;
import X.C1367805Wy;
import X.C1671006gW;
import X.C1954807lC;
import X.C1C7U;
import X.C23250099c;
import X.C786410Ut5;
import X.InterfaceC852200Xbu;
import android.app.Activity;
import android.text.method.LinkMovementMethod;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class ARunnableS11S0400000_2 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Lifecycle lifecycle;
        LifecycleCoroutineScope lifecycleScope;
        String str;
        LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ((Activity) this.l0);
        if (lifecycleOwnerLIZIZ != null) {
            lifecycle = lifecycleOwnerLIZIZ.getLifecycle();
            lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZIZ);
        } else {
            lifecycle = null;
            lifecycleScope = null;
        }
        int i = C05X1.LIZ[((C05X2) this.l1).ordinal()];
        if (i == 1 || i == 2) {
            str = "passkey";
        } else {
            if (i != 3) {
                throw new C1954807lC();
            }
            str = "google_onetap";
        }
        String str2 = CredentialManagerService.LIZ;
        CredentialManagerService.LJI = lifecycleScope != null ? C23250099c.LIZLLL(lifecycleScope, null, null, new C1367805Wy(lifecycle, (CredentialManagerService) this.l2, (Activity) this.l0, str, (InterfaceC852200Xbu) this.l3, null), 3) : null;
    }

    public final void LIZ$1() {
        TuxTextView tuxTextView = (TuxTextView) this.l0;
        if (tuxTextView == null || tuxTextView.getLineCount() <= 2) {
            C1671006gW c1671006gW = (C1671006gW) this.l1;
            TuxIconView tuxIconView = (TuxIconView) this.l2;
            TuxTextView tuxTextView2 = (TuxTextView) this.l0;
            Function1 function1 = (Function1) this.l3;
            c1671006gW.getClass();
            if (tuxTextView2 != null) {
                tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
            }
            tuxIconView.setIconRes(R.raw.icon_x_mark_small);
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            C786410Ut5.a9(tuxIconView, new ACListenerS106S0200000_2(function1, c1671006gW, 9));
            return;
        }
        C1671006gW c1671006gW2 = (C1671006gW) this.l1;
        TuxIconView tuxIconView2 = (TuxIconView) this.l2;
        TuxTextView tuxTextView3 = (TuxTextView) this.l0;
        Function1 function12 = (Function1) this.l3;
        c1671006gW2.getClass();
        if (tuxTextView3 != null) {
            tuxTextView3.setMaxLines(2);
            tuxTextView3.setMovementMethod(null);
        }
        tuxIconView2.setIconRes(R.raw.icon_chevron_down_fill);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
        C786410Ut5.a9(tuxIconView2, new ACListenerS44S0400000_4(tuxIconView2, tuxTextView3, c1671006gW2, function12, 1));
    }

    public static final void run$0(ARunnableS11S0400000_2 aRunnableS11S0400000_2) {
        boolean zLIZ;
        C1C7U.LIZ("CredentialManagerService@16d5.openInvisibleActivity$1");
        try {
            aRunnableS11S0400000_2.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CredentialManagerService@16d5.openInvisibleActivity$1");
    }

    public static final void run$1(ARunnableS11S0400000_2 aRunnableS11S0400000_2) {
        boolean zLIZ;
        C1C7U.LIZ("ChatTopTip@22df.setupExpandAndCloseButton$1$1");
        try {
            aRunnableS11S0400000_2.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ChatTopTip@22df.setupExpandAndCloseButton$1$1");
    }

    public ARunnableS11S0400000_2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
