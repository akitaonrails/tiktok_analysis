package Y;

import X.C09JN;
import X.C0XT7;
import X.C0XZ2;
import X.C1234920iF0;
import X.C1255780ime;
import X.C1256130inD;
import X.C19EG;
import X.C1BVK;
import X.C1C7U;
import X.C786410Ut5;
import X.C849450XTz;
import X.C854460XfY;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.account.login.v2.base.AvailableWaysViewModel;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailLinkVerifyFragment;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.HashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class AfS85S0101000_19 implements C09JN {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS85S0101000_19 afS85S0101000_19, Object obj) {
        Bundle arguments;
        C1C7U.LIZ("EmailLinkVerifyFragment@2352.sendCode$1");
        C0XT7 c0xt7 = (C0XT7) obj;
        C0XZ2.LIZJ(((EmailLinkVerifyFragment) afS85S0101000_19.l0).getEmail(), (C849450XTz) c0xt7.LJIIIZ);
        String strLIZ = C0XZ2.LIZ((C849450XTz) c0xt7.LJIIIZ);
        if (strLIZ != null) {
            EmailLinkVerifyFragment emailLinkVerifyFragment = (EmailLinkVerifyFragment) afS85S0101000_19.l0;
            C854460XfY c854460XfY = C854460XfY.LIZ;
            Bundle arguments2 = emailLinkVerifyFragment.getArguments();
            c854460XfY.getClass();
            if (arguments2 != null) {
                C786410Ut5.LJJJI("passport_ticket", strLIZ, arguments2);
            }
            C19EG activity = emailLinkVerifyFragment.getActivity();
            if (activity != null && C1234920iF0.LIZIZ(emailLinkVerifyFragment).shouldGetAvailableWays) {
                ((AvailableWaysViewModel) ViewModelProviders.of(activity).get(AvailableWaysViewModel.class)).wQ2(emailLinkVerifyFragment.getEmail(), strLIZ, emailLinkVerifyFragment.getEnterFrom(), emailLinkVerifyFragment.getEnterMethod(), emailLinkVerifyFragment.PR(), emailLinkVerifyFragment.RR());
            }
        }
        EmailLinkVerifyFragment emailLinkVerifyFragment2 = (EmailLinkVerifyFragment) afS85S0101000_19.l0;
        int i = afS85S0101000_19.i1;
        emailLinkVerifyFragment2.getClass();
        if ((i == 23 || i == 13) && (arguments = ((EmailLinkVerifyFragment) afS85S0101000_19.l0).getArguments()) != null) {
            arguments.putBoolean("is_register", false);
        }
        ((EmailLinkVerifyFragment) afS85S0101000_19.l0).kT();
        C1C7U.LIZIZ("EmailLinkVerifyFragment@2352.sendCode$1");
    }

    public static final void accept$1(AfS85S0101000_19 afS85S0101000_19, Object obj) {
        C1C7U.LIZ("TaskApiUtilsKt@ac6a.requestTaskActionInternal$1");
        ((Function2) afS85S0101000_19.l0).invoke(Integer.valueOf(afS85S0101000_19.i1 - 1), obj);
        C1C7U.LIZIZ("TaskApiUtilsKt@ac6a.requestTaskActionInternal$1");
    }

    public static final void accept$2(AfS85S0101000_19 afS85S0101000_19, Object obj) {
        C1C7U.LIZ("TaskApiUtilsKt@ac6a.requestTaskActionInternal$2");
        ((Function2) afS85S0101000_19.l0).invoke(Integer.valueOf(afS85S0101000_19.i1 - 1), obj);
        C1C7U.LIZIZ("TaskApiUtilsKt@ac6a.requestTaskActionInternal$2");
    }

    public static final void accept$3(AfS85S0101000_19 afS85S0101000_19, Object obj) {
        C1C7U.LIZ("TaskApiUtilsKt@ac6a.requestTaskReportInternal$1");
        ((Function2) afS85S0101000_19.l0).invoke(Integer.valueOf(afS85S0101000_19.i1 - 1), obj);
        C1C7U.LIZIZ("TaskApiUtilsKt@ac6a.requestTaskReportInternal$1");
    }

    public static final void accept$4(AfS85S0101000_19 afS85S0101000_19, Object obj) {
        C1C7U.LIZ("TaskApiUtilsKt@ac6a.requestTaskReportInternal$2");
        ((Function2) afS85S0101000_19.l0).invoke(Integer.valueOf(afS85S0101000_19.i1 - 1), obj);
        C1C7U.LIZIZ("TaskApiUtilsKt@ac6a.requestTaskReportInternal$2");
    }

    public static final void accept$5(AfS85S0101000_19 afS85S0101000_19, Object obj) {
        C1255780ime c1255780ime = (C1255780ime) afS85S0101000_19.l0;
        int i = afS85S0101000_19.i1;
        FeedItemList feedItemList = (FeedItemList) obj;
        if (c1255780ime.LLILZLL.equals(c1255780ime.LLILLL)) {
            C1256130inD.LIZ.getClass();
            if (i != C1256130inD.LIZ()) {
                c1255780ime.LLILZLL = c1255780ime.LLILLL;
                return;
            }
        }
        c1255780ime.LLILZLL = c1255780ime.LLILLL;
        ((HashMap) c1255780ime.LLIZ).put(Integer.valueOf(i), c1255780ime.LLILZLL);
        C1BVK.LIZIZ().LIZ(c1255780ime.mHandler, new ACallableS424S0100000_19(feedItemList, 13), 0);
    }

    public AfS85S0101000_19(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
