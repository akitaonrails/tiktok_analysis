package Y;

import X.C09JN;
import X.C0XO3;
import X.C0XQ5;
import X.C0XT7;
import X.C0XUE;
import X.C0XYD;
import X.C0XYO;
import X.C0XZ4;
import X.C0XZJ;
import X.C13LP;
import X.C1C7U;
import X.C293990Bfh;
import X.C850330XXj;
import X.C850920XZq;
import X.C851430Xaf;
import X.C852170Xbr;
import X.EnumC851410Xad;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSmsVerificationResultEvent;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSubmitSmsCodeEvent;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import com.ss.android.ugc.aweme.services.GSMAService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public class AfS65S0201000_13 implements C09JN {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
        }
    }

    public static final void accept$0(AfS65S0201000_13 afS65S0201000_13, Object obj) {
        String string;
        C0XZJ c0xzj;
        C1C7U.LIZ("NetworkHelper@8b8f.checkCode$3");
        Throwable th = (Throwable) obj;
        boolean z = th instanceof C0XZJ;
        if (z) {
            Function1 function1 = (Function1) afS65S0201000_13.l0;
            if (function1 != null) {
                function1.invoke(th);
            }
            C852170Xbr c852170Xbr = C852170Xbr.LIZ;
            C0XYD c0xyd = (C0XYD) afS65S0201000_13.l1;
            c852170Xbr.getClass();
            C852170Xbr.LJII(false, c0xyd);
        }
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS65S0201000_13.l1).getMobParams().LJJLIIIJJI(), "enter_from");
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS65S0201000_13.l1).getMobParams().LLIIJI(), "enter_method");
        clientSmsVerificationResultEvent.LJIIJJI(EnumC851410Xad.FAILURE.getValue());
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        int i = afS65S0201000_13.i2;
        c0xz4.getClass();
        clientSmsVerificationResultEvent.LJIIL(C0XZ4.LJJI(i));
        clientSmsVerificationResultEvent.LJIIJ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        if (!z || (c0xzj = (C0XZJ) th) == null || (string = Integer.valueOf(c0xzj.getErrorCode()).toString()) == null) {
            string = "";
        }
        clientSmsVerificationResultEvent.LJI(string, "error_code");
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS65S0201000_13.l1).getMobParams().RR(), "page");
        clientSmsVerificationResultEvent.LJIIIIZZ();
        C1C7U.LIZIZ("NetworkHelper@8b8f.checkCode$3");
    }

    public static final void accept$1(AfS65S0201000_13 afS65S0201000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.quickSmsLogin$2");
        C850920XZq c850920XZq = (C850920XZq) obj;
        C0XYO c0xyo = C0XYO.LIZ;
        Fragment fragment = (Fragment) afS65S0201000_13.l0;
        C0XYD c0xyd = (C0XYD) afS65S0201000_13.l1;
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.LOGIN;
        EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
        C0XO3 c0xo3 = c850920XZq.LJIIIZ;
        c0xyo.getClass();
        C0XYO.LIZJ(fragment, c0xyd, enumC852660Xce, enumC852910Xd3LLJJLIIIJLLLLLLLZ, null, c0xo3);
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        BaseAccountFlowFragment mobParams = ((C0XYD) afS65S0201000_13.l1).getMobParams();
        C0XO3 c0xo32 = c850920XZq.LJIIIZ;
        c852170Xbr.getClass();
        C852170Xbr.LJIIL(false, "sms_verification", mobParams, c0xo32, null);
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS65S0201000_13.l1).getMobParams().LJJLIIIJJI(), "enter_from");
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS65S0201000_13.l1).getMobParams().LLIIJI(), "enter_method");
        clientSmsVerificationResultEvent.LJIIJJI(EnumC851410Xad.SUCCESS.getValue());
        clientSmsVerificationResultEvent.LJIIL(afS65S0201000_13.i2);
        clientSmsVerificationResultEvent.LJIIJ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJIIIIZZ();
        C1C7U.LIZIZ("NetworkHelper@8b8f.quickSmsLogin$2");
    }

    public static final void accept$2(AfS65S0201000_13 afS65S0201000_13, Object obj) {
        String string;
        C850330XXj c850330XXj;
        C0XO3 c0xo3;
        C1C7U.LIZ("NetworkHelper@8b8f.changeMobileNum$3");
        C0XT7 c0xt7 = (C0XT7) obj;
        C851430Xaf.LIZ(0, ((C0XYD) afS65S0201000_13.l0).getMobParams().LJJLIIIJJI(), "rebind_phone_click", "phone", null);
        String strLJJLIIIJJI = ((C0XYD) afS65S0201000_13.l0).getMobParams().LJJLIIIJJI();
        String strLLIIJI = ((C0XYD) afS65S0201000_13.l0).getMobParams().LLIIJI();
        Bundle arguments = ((BaseAccountFlowFragment) afS65S0201000_13.l1).getArguments();
        if (arguments != null) {
            string = arguments.getString("page");
        } else {
            string = null;
        }
        C851430Xaf.LIZIZ("phone_bind_status", strLJJLIIIJJI, strLLIIJI, string, "changed_to_new_phone");
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS65S0201000_13.l0).getMobParams().LJJLIIIJJI(), "enter_from");
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS65S0201000_13.l0).getMobParams().LLIIJI(), "enter_method");
        clientSmsVerificationResultEvent.LJIIJJI(EnumC851410Xad.SUCCESS.getValue());
        clientSmsVerificationResultEvent.LJIIL(afS65S0201000_13.i2);
        clientSmsVerificationResultEvent.LJIIJ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS65S0201000_13.l0).getMobParams().RR(), "page");
        clientSmsVerificationResultEvent.LJIIIIZZ();
        if (C293990Bfh.LIZ() && c0xt7 != null && (c850330XXj = (C850330XXj) c0xt7.LJIIIZ) != null && (c0xo3 = c850330XXj.LJIIJJI) != null) {
            String uid = C0XQ5.LIZJ().getUid();
            if (uid == null) {
                uid = "";
            }
            C0XUE c0xue = C0XUE.LIZ;
            BaseLoginMethod baseLoginMethod = (BaseLoginMethod) C13LP.LJJJLL(c0xue.LJ(uid));
            if (baseLoginMethod != null && (baseLoginMethod.getLoginMethodName() == LoginMethodName.PHONE_NUMBER_PASS || baseLoginMethod.getLoginMethodName() == LoginMethodName.PHONE_SMS)) {
                baseLoginMethod.setMaskedPhone(c0xo3.LJIIIZ);
                c0xue.LJI(baseLoginMethod, true);
                GSMAService gSMAService = GSMAService.INSTANCE;
                if (Intrinsics.LJFF(gSMAService.getGSMALocalCache(null, null).uid, uid)) {
                    gSMAService.removeGSMALocalCache();
                }
            }
        }
        C1C7U.LIZIZ("NetworkHelper@8b8f.changeMobileNum$3");
    }

    public AfS65S0201000_13(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
