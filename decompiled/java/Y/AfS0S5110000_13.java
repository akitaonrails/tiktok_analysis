package Y;

import X.C09JN;
import X.C0XZJ;
import X.C1C7U;
import X.C852170Xbr;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes14.dex */
public class AfS0S5110000_13 implements C09JN {
    public final int $t;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;
    public String s3;
    public String s4;
    public boolean z6;

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

    public static final void accept$0(AfS0S5110000_13 afS0S5110000_13, Object obj) {
        Bundle arguments;
        C1C7U.LIZ("NetworkHelper@8b8f.getVerifyEmailMaybe$2");
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        Fragment fragment = (Fragment) afS0S5110000_13.l5;
        if (fragment != null) {
            arguments = fragment.getArguments();
        } else {
            arguments = null;
        }
        C852170Xbr.LJIILL(c852170Xbr, arguments, 0, afS0S5110000_13.s0, afS0S5110000_13.s1, afS0S5110000_13.s2, afS0S5110000_13.s3, null, null, afS0S5110000_13.s4, afS0S5110000_13.z6, 192);
        C1C7U.LIZIZ("NetworkHelper@8b8f.getVerifyEmailMaybe$2");
    }

    public static final void accept$1(AfS0S5110000_13 afS0S5110000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.getVerifyEmailMaybe$3");
        Throwable th = (Throwable) obj;
        Bundle arguments = null;
        if ((th instanceof C0XZJ) && th != null) {
            Fragment fragment = (Fragment) afS0S5110000_13.l5;
            String str = afS0S5110000_13.s0;
            String str2 = afS0S5110000_13.s1;
            String str3 = afS0S5110000_13.s2;
            String str4 = afS0S5110000_13.s3;
            String str5 = afS0S5110000_13.s4;
            boolean z = afS0S5110000_13.z6;
            C852170Xbr c852170Xbr = C852170Xbr.LIZ;
            if (fragment != null) {
                arguments = fragment.getArguments();
            }
            C852170Xbr.LJIILL(c852170Xbr, arguments, ((C0XZJ) th).getErrorCode(), str, str2, str3, str4, null, null, str5, z, 192);
        }
        C1C7U.LIZIZ("NetworkHelper@8b8f.getVerifyEmailMaybe$3");
    }

    public AfS0S5110000_13(Fragment fragment, String str, String str2, String str3, String str4, String str5, boolean z, int i) {
        this.$t = i;
        this.l5 = fragment;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
        this.s4 = str5;
        this.z6 = z;
    }
}
