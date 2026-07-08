package Y;

import X.C09JN;
import X.C0XT7;
import X.C0XYD;
import X.C0XZ4;
import X.C0XZJ;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C19EG;
import X.C1C7U;
import X.C852170Xbr;
import X.C985403tE;
import X.EnumC852910Xd3;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS247S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public class AfS0S2301000_13 implements C09JN {
    public final int $t;
    public int i5;
    public Object l2;
    public Object l3;
    public Object l4;
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
        }
    }

    public static final void accept$0(AfS0S2301000_13 afS0S2301000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.verifyEmailCode$3");
        C0XZJ c0xzj = (C0XZJ) ((Throwable) obj);
        C852170Xbr.LJIILL(C852170Xbr.LIZ, ((Fragment) afS0S2301000_13.l2).getArguments(), c0xzj.getErrorCode(), "register", ((C0XYD) afS0S2301000_13.l3).getMobParams().LLIIJI(), afS0S2301000_13.s0, ((C0XYD) afS0S2301000_13.l3).getMobParams().RR(), Integer.valueOf(afS0S2301000_13.i5), ((C0XYD) afS0S2301000_13.l3).getMobParams().PR(), afS0S2301000_13.s1, false, 512);
        C852170Xbr.LJIIIIZZ(true, c0xzj.getErrorCode(), "email", ((C0XYD) afS0S2301000_13.l3).getMobParams(), null);
        Function1 function1 = (Function1) afS0S2301000_13.l4;
        if (function1 != null) {
            function1.invoke(c0xzj);
        }
        C1C7U.LIZIZ("NetworkHelper@8b8f.verifyEmailCode$3");
    }

    public static final void accept$1(AfS0S2301000_13 afS0S2301000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.sendVoiceCode$3");
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        String strLJJLIIIJJI = ((C0XYD) afS0S2301000_13.l2).getMobParams().LJJLIIIJJI();
        String strLLIIJI = ((C0XYD) afS0S2301000_13.l2).getMobParams().LLIIJI();
        String strPR = ((C0XYD) afS0S2301000_13.l2).getMobParams().PR();
        String str = afS0S2301000_13.s0;
        int i = afS0S2301000_13.i5;
        String str2 = afS0S2301000_13.s1;
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        EnumC852910Xd3 enumC852910Xd3 = (EnumC852910Xd3) afS0S2301000_13.l3;
        c0xz4.getClass();
        C852170Xbr.LJIILJJIL(c852170Xbr, strLJJLIIIJJI, strLLIIJI, strPR, 0, str, i, "voice", null, str2, null, null, null, null, C0XZ4.LJJII(enumC852910Xd3), null, null, ((C0XT7) obj).LJIIIZ.LJFF, null, null, null, 1949184);
        C19EG activity = ((Fragment) afS0S2301000_13.l4).getActivity();
        if (activity != null) {
            activity.isFinishing();
        }
        Fragment fragment = (Fragment) afS0S2301000_13.l4;
        String str3 = afS0S2301000_13.s1;
        C19EG activity2 = fragment.getActivity();
        if (activity2 != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(activity2);
            c1397580mTM.LIZIZ(activity2.getString(2131829363, str3));
            C985403tE.LIZ(c1397580mTM, AFwS247S0000000_13.get$arr$(13));
            c1397580mTM.LJII = false;
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
        C1C7U.LIZIZ("NetworkHelper@8b8f.sendVoiceCode$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS0S2301000_13(Object obj, Fragment fragment, C0XYD c0xyd, String str, int i, String str2, Function1<? super C0XZJ, Unit> function1) {
        this.$t = function1;
        this.l2 = obj;
        this.l3 = fragment;
        this.s0 = c0xyd;
        this.i5 = str;
        this.s1 = i;
        this.l4 = str2;
    }
}
