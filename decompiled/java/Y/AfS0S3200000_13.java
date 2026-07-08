package Y;

import X.C09JN;
import X.C0XYD;
import X.C1C7U;
import X.C846430XIj;
import X.C852170Xbr;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.oneclicklogin.OneClickLoginService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS37S2000000_13;

/* JADX INFO: loaded from: classes14.dex */
public class AfS0S3200000_13 implements C09JN {
    public final int $t;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;
    public String s2;

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

    public static final void accept$0(AfS0S3200000_13 afS0S3200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.emailCheckCode$2");
        C852170Xbr.LJIILL(C852170Xbr.LIZ, ((Fragment) afS0S3200000_13.l3).getArguments(), 0, afS0S3200000_13.s0, ((C0XYD) afS0S3200000_13.l4).getMobParams().LLIIJI(), afS0S3200000_13.s1, ((C0XYD) afS0S3200000_13.l4).getMobParams().RR(), null, null, afS0S3200000_13.s2, false, 704);
        C1C7U.LIZIZ("NetworkHelper@8b8f.emailCheckCode$2");
    }

    public static final void accept$1(AfS0S3200000_13 afS0S3200000_13, Object obj) {
        C1C7U.LIZ("OneClickLoginService@601d.disableTokenForOneClickLogin$3");
        OneClickLoginService oneClickLoginService = (OneClickLoginService) afS0S3200000_13.l3;
        String str = afS0S3200000_13.s0;
        AwS37S2000000_13 awS37S2000000_13 = new AwS37S2000000_13(afS0S3200000_13.s1, afS0S3200000_13.s2, 1);
        oneClickLoginService.getClass();
        OneClickLoginService.LJIJJLI(str, awS37S2000000_13, false);
        if (!C846430XIj.LIZIZ()) {
            ((Function0) afS0S3200000_13.l4).invoke();
        }
        C1C7U.LIZIZ("OneClickLoginService@601d.disableTokenForOneClickLogin$3");
    }

    public AfS0S3200000_13(OneClickLoginService oneClickLoginService, String str, Function0 function0, String str2, int i) {
        this.$t = i;
        this.l3 = oneClickLoginService;
        this.s0 = str;
        this.l4 = function0;
        this.s1 = str2;
        this.s2 = null;
    }

    public AfS0S3200000_13(Fragment fragment, C0XYD c0xyd, String str, String str2, String str3, int i) {
        this.$t = i;
        this.l3 = fragment;
        this.s0 = str;
        this.l4 = c0xyd;
        this.s1 = str2;
        this.s2 = str3;
    }
}
