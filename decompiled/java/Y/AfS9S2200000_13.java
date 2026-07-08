package Y;

import X.C09JN;
import X.C0XO2;
import X.C0XT7;
import X.C0XYD;
import X.C0XYO;
import X.C0XZJ;
import X.C1C7U;
import X.C2097908Jt;
import X.C849260XTg;
import X.C852170Xbr;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public class AfS9S2200000_13 implements C09JN {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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
        }
    }

    public static final void accept$0(AfS9S2200000_13 afS9S2200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.forceChangePassword$2");
        ((SetPasswordMobHelper) afS9S2200000_13.l2).LIZ(true, afS9S2200000_13.s0, ((C0XYD) afS9S2200000_13.l3).getMobParams().LJJLIIIJJI(), ((C0XYD) afS9S2200000_13.l3).getMobParams().LLIIJI(), ((C0XYD) afS9S2200000_13.l3).getMobParams().PR(), 0, ((C0XYD) afS9S2200000_13.l3).getMobParams(), afS9S2200000_13.s1);
        C1C7U.LIZIZ("NetworkHelper@8b8f.forceChangePassword$2");
    }

    public static final void accept$1(AfS9S2200000_13 afS9S2200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.forceChangePassword$3");
        ((SetPasswordMobHelper) afS9S2200000_13.l2).LIZ(true, afS9S2200000_13.s0, ((C0XYD) afS9S2200000_13.l3).getMobParams().LJJLIIIJJI(), ((C0XYD) afS9S2200000_13.l3).getMobParams().LLIIJI(), ((C0XYD) afS9S2200000_13.l3).getMobParams().PR(), ((C0XZJ) ((Throwable) obj)).getErrorCode(), ((C0XYD) afS9S2200000_13.l3).getMobParams(), afS9S2200000_13.s1);
        C1C7U.LIZIZ("NetworkHelper@8b8f.forceChangePassword$3");
    }

    public static final void accept$2(AfS9S2200000_13 afS9S2200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.emailCodeLogin$2");
        C0XT7 c0xt7 = (C0XT7) obj;
        BaseAccountFlowFragment mobParams = ((C0XYD) afS9S2200000_13.l2).getMobParams();
        Fragment fragment = (Fragment) afS9S2200000_13.l3;
        C852170Xbr.LJIILL(C852170Xbr.LIZ, fragment.getArguments(), 0, mobParams.LJJLIIIJJI(), mobParams.LLIIJI(), afS9S2200000_13.s0, mobParams.RR(), 13, mobParams.PR(), afS9S2200000_13.s1, false, 512);
        C852170Xbr.LJIIL(false, "email", mobParams, ((C849260XTg) c0xt7.LJIIIZ).LJIIIZ, C2097908Jt.LIZJ(new Pair("send_type", "code_and_link")));
        C0XYO c0xyo = C0XYO.LIZ;
        Fragment fragment2 = (Fragment) afS9S2200000_13.l3;
        C0XYD c0xyd = (C0XYD) afS9S2200000_13.l2;
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.LOGIN;
        EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
        C0XO2 c0xo2 = ((C849260XTg) c0xt7.LJIIIZ).LJIIIZ;
        c0xyo.getClass();
        C0XYO.LIZJ(fragment2, c0xyd, enumC852660Xce, enumC852910Xd3LLJJLIIIJLLLLLLLZ, null, c0xo2);
        C1C7U.LIZIZ("NetworkHelper@8b8f.emailCodeLogin$2");
    }

    public static final void accept$3(AfS9S2200000_13 afS9S2200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.emailCodeLogin$3");
        C0XZJ c0xzj = (C0XZJ) ((Throwable) obj);
        BaseAccountFlowFragment mobParams = ((C0XYD) afS9S2200000_13.l2).getMobParams();
        Fragment fragment = (Fragment) afS9S2200000_13.l3;
        C852170Xbr.LJIILL(C852170Xbr.LIZ, fragment.getArguments(), c0xzj.getErrorCode(), mobParams.LJJLIIIJJI(), mobParams.LLIIJI(), afS9S2200000_13.s0, mobParams.RR(), 13, mobParams.PR(), afS9S2200000_13.s1, false, 512);
        if (c0xzj.getErrorCode() != 8038) {
            C852170Xbr.LJIIIIZZ(false, c0xzj.getErrorCode(), "email", mobParams, C2097908Jt.LIZJ(new Pair("send_type", "code_and_link")));
        }
        C1C7U.LIZIZ("NetworkHelper@8b8f.emailCodeLogin$3");
    }

    public AfS9S2200000_13(Object obj, Object obj2, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj2;
        this.l3 = obj;
        this.s0 = str;
        this.s1 = str2;
    }
}
