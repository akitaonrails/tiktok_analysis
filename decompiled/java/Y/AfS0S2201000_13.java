package Y;

import X.C09JN;
import X.C0XT7;
import X.C0XYD;
import X.C0XZ4;
import X.C0XZJ;
import X.C1C7U;
import X.C849550XUj;
import X.C852170Xbr;
import X.EnumC852910Xd3;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes14.dex */
public class AfS0S2201000_13 implements C09JN {
    public final int $t;
    public int i4;
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

    public static final void accept$0(AfS0S2201000_13 afS0S2201000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.sendPhoneCode$2");
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        T t = ((C0XT7) obj).LJIIIZ;
        c852170Xbr.getClass();
        Bundle bundleLJ = C852170Xbr.LJ(t);
        C852170Xbr.LJIIZILJ(((C0XYD) afS0S2201000_13.l2).getMobParams().getArguments(), bundleLJ);
        String strLJJLIIIJJI = ((C0XYD) afS0S2201000_13.l2).getMobParams().LJJLIIIJJI();
        String strLLIIJI = ((C0XYD) afS0S2201000_13.l2).getMobParams().LLIIJI();
        String strPR = ((C0XYD) afS0S2201000_13.l2).getMobParams().PR();
        String str = afS0S2201000_13.s0;
        int i = afS0S2201000_13.i4;
        String str2 = afS0S2201000_13.s1;
        String strRR = ((C0XYD) afS0S2201000_13.l2).getMobParams().RR();
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        EnumC852910Xd3 enumC852910Xd3 = (EnumC852910Xd3) afS0S2201000_13.l3;
        c0xz4.getClass();
        C852170Xbr.LJIILJJIL(c852170Xbr, strLJJLIIIJJI, strLLIIJI, strPR, 0, str, i, "text", null, str2, null, null, null, strRR, C0XZ4.LJJII(enumC852910Xd3), null, null, null, null, bundleLJ, null, 1551872);
        C1C7U.LIZIZ("NetworkHelper@8b8f.sendPhoneCode$2");
    }

    public static final void accept$1(AfS0S2201000_13 afS0S2201000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.sendPhoneCode$3");
        C0XZJ c0xzj = (C0XZJ) ((Throwable) obj);
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        String strLJJLIIIJJI = ((C0XYD) afS0S2201000_13.l2).getMobParams().LJJLIIIJJI();
        String strLLIIJI = ((C0XYD) afS0S2201000_13.l2).getMobParams().LLIIJI();
        String strPR = ((C0XYD) afS0S2201000_13.l2).getMobParams().PR();
        int errorCode = c0xzj.getErrorCode();
        String str = afS0S2201000_13.s0;
        int i = afS0S2201000_13.i4;
        String errorMsg = c0xzj.getErrorMsg();
        String str2 = afS0S2201000_13.s1;
        String strRR = ((C0XYD) afS0S2201000_13.l2).getMobParams().RR();
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        EnumC852910Xd3 enumC852910Xd3 = (EnumC852910Xd3) afS0S2201000_13.l3;
        c0xz4.getClass();
        C852170Xbr.LJIILJJIL(c852170Xbr, strLJJLIIIJJI, strLLIIJI, strPR, errorCode, str, i, "text", errorMsg, str2, null, null, null, strRR, C0XZ4.LJJII(enumC852910Xd3), null, null, null, null, null, null, 2076160);
        C1C7U.LIZIZ("NetworkHelper@8b8f.sendPhoneCode$3");
    }

    public static final void accept$2(AfS0S2201000_13 afS0S2201000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.verifyEmailCode$2");
        C852170Xbr.LJIILL(C852170Xbr.LIZ, ((Fragment) afS0S2201000_13.l2).getArguments(), 0, "register", ((C0XYD) afS0S2201000_13.l3).getMobParams().LLIIJI(), afS0S2201000_13.s0, ((C0XYD) afS0S2201000_13.l3).getMobParams().RR(), Integer.valueOf(afS0S2201000_13.i4), ((C0XYD) afS0S2201000_13.l3).getMobParams().PR(), afS0S2201000_13.s1, false, 512);
        C852170Xbr.LJIIL(true, "email", ((C0XYD) afS0S2201000_13.l3).getMobParams(), ((C849550XUj) obj).LJIIJ, null);
        C1C7U.LIZIZ("NetworkHelper@8b8f.verifyEmailCode$2");
    }

    public static final void accept$3(AfS0S2201000_13 afS0S2201000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.sendVoiceCode$2");
        C0XZJ c0xzj = (C0XZJ) ((Throwable) obj);
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        String strLJJLIIIJJI = ((C0XYD) afS0S2201000_13.l2).getMobParams().LJJLIIIJJI();
        String strLLIIJI = ((C0XYD) afS0S2201000_13.l2).getMobParams().LLIIJI();
        String strPR = ((C0XYD) afS0S2201000_13.l2).getMobParams().PR();
        int errorCode = c0xzj.getErrorCode();
        String str = afS0S2201000_13.s0;
        int i = afS0S2201000_13.i4;
        String errorMsg = c0xzj.getErrorMsg();
        String str2 = afS0S2201000_13.s1;
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        EnumC852910Xd3 enumC852910Xd3 = (EnumC852910Xd3) afS0S2201000_13.l3;
        c0xz4.getClass();
        C852170Xbr.LJIILJJIL(c852170Xbr, strLJJLIIIJJI, strLLIIJI, strPR, errorCode, str, i, "voice", errorMsg, str2, null, null, null, null, C0XZ4.LJJII(enumC852910Xd3), null, null, null, null, null, null, 2080256);
        C1C7U.LIZIZ("NetworkHelper@8b8f.sendVoiceCode$2");
    }

    public AfS0S2201000_13(Object obj, Object obj2, String str, int i, String str2, int i2) {
        this.$t = i2;
        this.l2 = obj;
        this.l3 = obj2;
        this.s0 = str;
        this.i4 = i;
        this.s1 = str2;
    }
}
