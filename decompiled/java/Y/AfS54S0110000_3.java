package Y;

import X.C09JN;
import X.C1C7U;
import com.ss.android.ugc.aweme.account.login.auth.Failed3PServiceViewModel;

/* JADX INFO: loaded from: classes4.dex */
public class AfS54S0110000_3 implements C09JN {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public AfS54S0110000_3(Failed3PServiceViewModel failed3PServiceViewModel, int i) {
        this.$t = i;
        this.z1 = true;
        this.l0 = failed3PServiceViewModel;
    }

    public static final void accept$0(AfS54S0110000_3 afS54S0110000_3, Object obj) {
        C1C7U.LIZ("Failed3PServiceViewModel@8e10.sendEmailCode$2");
        if (afS54S0110000_3.z1) {
            ((Failed3PServiceViewModel) afS54S0110000_3.l0).LLILLL.postValue(Boolean.TRUE);
        }
        C1C7U.LIZIZ("Failed3PServiceViewModel@8e10.sendEmailCode$2");
    }

    public static final void accept$1(AfS54S0110000_3 afS54S0110000_3, Object obj) {
        C1C7U.LIZ("Failed3PServiceViewModel@8e10.sendMobileCode$2");
        if (afS54S0110000_3.z1) {
            ((Failed3PServiceViewModel) afS54S0110000_3.l0).LLILZIL.postValue(Boolean.TRUE);
        }
        C1C7U.LIZIZ("Failed3PServiceViewModel@8e10.sendMobileCode$2");
    }

    public AfS54S0110000_3(boolean z, Failed3PServiceViewModel failed3PServiceViewModel, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = failed3PServiceViewModel;
    }
}
