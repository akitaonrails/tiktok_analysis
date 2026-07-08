package Y;

import X.C09JN;
import X.C0XT7;
import X.C0XYD;
import X.C0XZ4;
import X.C0XZJ;
import X.C1C7U;
import X.C851350XaX;
import X.C852170Xbr;
import X.C853660XeG;
import X.EnumC852910Xd3;
import android.os.Bundle;

/* JADX INFO: loaded from: classes14.dex */
public class AfS12S1201000_13 implements C09JN {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final void accept$0(AfS12S1201000_13 afS12S1201000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.sendSmsTicketCode$2");
        C0XZJ c0xzj = (C0XZJ) ((Throwable) obj);
        EnumC852910Xd3 enumC852910Xd3 = (EnumC852910Xd3) afS12S1201000_13.l1;
        if (enumC852910Xd3 == EnumC852910Xd3.INPUT_PHONE_SIGN_UP) {
            C851350XaX.LIZ(Integer.valueOf(c0xzj.getErrorCode()), ((C0XYD) afS12S1201000_13.l2).getMobParams().LLIIJI(), ((C0XYD) afS12S1201000_13.l2).getMobParams().LJJLIIIJJI(), ((C0XYD) afS12S1201000_13.l2).getMobParams().PR(), null, 48);
        } else if (enumC852910Xd3 == EnumC852910Xd3.INPUT_PHONE_LOGIN) {
            C853660XeG c853660XeG = C853660XeG.LIZ;
            String strLLIIJI = ((C0XYD) afS12S1201000_13.l2).getMobParams().LLIIJI();
            c853660XeG.getClass();
            C853660XeG.LIZLLL(false, strLLIIJI, "phone", 0, null, null, null, null, null, null);
        }
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        String strLJJLIIIJJI = ((C0XYD) afS12S1201000_13.l2).getMobParams().LJJLIIIJJI();
        String strLLIIJI2 = ((C0XYD) afS12S1201000_13.l2).getMobParams().LLIIJI();
        String strPR = ((C0XYD) afS12S1201000_13.l2).getMobParams().PR();
        int errorCode = c0xzj.getErrorCode();
        String str = afS12S1201000_13.s0;
        int i = afS12S1201000_13.i3;
        String errorMsg = c0xzj.getErrorMsg();
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        EnumC852910Xd3 enumC852910Xd32 = (EnumC852910Xd3) afS12S1201000_13.l1;
        c0xz4.getClass();
        C852170Xbr.LJIILJJIL(c852170Xbr, strLJJLIIIJJI, strLLIIJI2, strPR, errorCode, str, i, "text", errorMsg, null, null, null, null, null, C0XZ4.LJJII(enumC852910Xd32), null, null, null, null, null, null, 2080256);
        C1C7U.LIZIZ("NetworkHelper@8b8f.sendSmsTicketCode$2");
    }

    public static final void accept$1(AfS12S1201000_13 afS12S1201000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.sendSmsTicketCode$3");
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        T t = ((C0XT7) obj).LJIIIZ;
        c852170Xbr.getClass();
        Bundle bundleLJ = C852170Xbr.LJ(t);
        C852170Xbr.LJIIZILJ(((C0XYD) afS12S1201000_13.l1).getMobParams().getArguments(), bundleLJ);
        String strLJJLIIIJJI = ((C0XYD) afS12S1201000_13.l1).getMobParams().LJJLIIIJJI();
        String strLLIIJI = ((C0XYD) afS12S1201000_13.l1).getMobParams().LLIIJI();
        String strPR = ((C0XYD) afS12S1201000_13.l1).getMobParams().PR();
        String str = afS12S1201000_13.s0;
        int i = afS12S1201000_13.i3;
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        EnumC852910Xd3 enumC852910Xd3 = (EnumC852910Xd3) afS12S1201000_13.l2;
        c0xz4.getClass();
        C852170Xbr.LJIILJJIL(c852170Xbr, strLJJLIIIJJI, strLLIIJI, strPR, 0, str, i, "text", null, null, null, null, null, null, C0XZ4.LJJII(enumC852910Xd3), null, null, null, null, bundleLJ, null, 1555968);
        C1C7U.LIZIZ("NetworkHelper@8b8f.sendSmsTicketCode$3");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS12S1201000_13(int r2, X.EnumC852910Xd3 r3, X.C0XYD r4, java.lang.String r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            if (r6 == 0) goto L11
            r0 = r1
            r0.l1 = r4
            r0.s0 = r5
            r0.i3 = r2
            r0.l2 = r3
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l1 = r3
            r0.l2 = r4
            r0.s0 = r5
            r0.i3 = r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS12S1201000_13.<init>(int, X.0Xd3, X.0XYD, java.lang.String, int):void");
    }
}
