package Y;

import X.C1699706l9;
import android.view.View;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;

/* JADX INFO: loaded from: classes3.dex */
public class ACListenerS52S1200000_2 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
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
        }
    }

    public static final void onClick$0(ACListenerS52S1200000_2 aCListenerS52S1200000_2, View view) {
        C1699706l9 c1699706l9 = (C1699706l9) aCListenerS52S1200000_2.l1;
        String str = aCListenerS52S1200000_2.s0;
        c1699706l9.getClass();
        C1699706l9.LIZJ(C1699706l9.LIZ(str, false), str, false);
        C1699706l9 c1699706l92 = (C1699706l9) aCListenerS52S1200000_2.l1;
        c1699706l92.LL.LIZ(c1699706l92);
        C1699706l9 c1699706l93 = (C1699706l9) aCListenerS52S1200000_2.l1;
        IMUser iMUser = (IMUser) aCListenerS52S1200000_2.l2;
        c1699706l93.getClass();
        C1699706l9.LIZIZ(iMUser, 0);
    }

    public static final void onClick$1(ACListenerS52S1200000_2 aCListenerS52S1200000_2, View view) {
        C1699706l9 c1699706l9 = (C1699706l9) aCListenerS52S1200000_2.l1;
        String str = aCListenerS52S1200000_2.s0;
        c1699706l9.getClass();
        C1699706l9.LIZJ(C1699706l9.LIZ(str, true), str, false);
        C1699706l9 c1699706l92 = (C1699706l9) aCListenerS52S1200000_2.l1;
        c1699706l92.LL.LIZ(c1699706l92);
        C1699706l9 c1699706l93 = (C1699706l9) aCListenerS52S1200000_2.l1;
        IMUser iMUser = (IMUser) aCListenerS52S1200000_2.l2;
        c1699706l93.getClass();
        C1699706l9.LIZIZ(iMUser, 1);
    }

    public ACListenerS52S1200000_2(C1699706l9 c1699706l9, String str, IMUser iMUser, int i) {
        this.$t = i;
        this.l1 = c1699706l9;
        this.s0 = str;
        this.l2 = iMUser;
    }
}
