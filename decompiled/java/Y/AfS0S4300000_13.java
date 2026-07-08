package Y;

import X.C09JN;
import X.C0XGA;
import X.C0XYD;
import X.C0XZ4;
import X.C0XZJ;
import X.C1C7U;
import X.C851430Xaf;
import X.C852810Xct;
import X.EnumC851410Xad;
import X.EnumC852910Xd3;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSmsVerificationResultEvent;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSubmitSmsCodeEvent;

/* JADX INFO: loaded from: classes14.dex */
public class AfS0S4300000_13 implements C09JN {
    public final int $t;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

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

    public static final void accept$0(AfS0S4300000_13 afS0S4300000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.bindMobileNoPassword$2");
        C851430Xaf.LJII(((C0XYD) afS0S4300000_13.l4).getMobParams().LJJLIIIJJI(), 0, "mobile", null, afS0S4300000_13.s0, ((C0XYD) afS0S4300000_13.l4).Qm(), ((C0XYD) afS0S4300000_13.l4).getMobParams().LLIIJI(), afS0S4300000_13.s1, afS0S4300000_13.s2);
        C851430Xaf.LIZ(0, ((C0XYD) afS0S4300000_13.l4).getMobParams().LJJLIIIJJI(), ((C0XYD) afS0S4300000_13.l4).getMobParams().LLIIJI(), "phone", ((C0XYD) afS0S4300000_13.l4).Qm());
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS0S4300000_13.l4).getMobParams().LJJLIIIJJI(), "enter_from");
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS0S4300000_13.l4).getMobParams().LLIIJI(), "enter_method");
        clientSmsVerificationResultEvent.LJIIJJI(EnumC851410Xad.SUCCESS.getValue());
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        EnumC852910Xd3 enumC852910Xd3 = (EnumC852910Xd3) afS0S4300000_13.l5;
        c0xz4.getClass();
        clientSmsVerificationResultEvent.LJIIL(C0XZ4.LJJII(enumC852910Xd3));
        C852810Xct c852810Xct = C852810Xct.LIZ;
        Fragment fragment = (Fragment) afS0S4300000_13.l6;
        c852810Xct.getClass();
        clientSmsVerificationResultEvent.LJI(C852810Xct.LIZ(fragment), "3p_platform");
        clientSmsVerificationResultEvent.LJI(C852810Xct.LIZJ((Fragment) afS0S4300000_13.l6), "config_key");
        clientSmsVerificationResultEvent.LJI(String.valueOf(((C0XGA) obj).LIZLLL), "error_code");
        clientSmsVerificationResultEvent.LJIIJ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJI(afS0S4300000_13.s3, "page");
        clientSmsVerificationResultEvent.LJI(afS0S4300000_13.s2, "enter_position");
        clientSmsVerificationResultEvent.LJIIIIZZ();
        C1C7U.LIZIZ("NetworkHelper@8b8f.bindMobileNoPassword$2");
    }

    public static final void accept$1(AfS0S4300000_13 afS0S4300000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.bindMobileNoPassword$3");
        C0XZJ c0xzj = (C0XZJ) ((Throwable) obj);
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS0S4300000_13.l4).getMobParams().LJJLIIIJJI(), "enter_from");
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS0S4300000_13.l4).getMobParams().LLIIJI(), "enter_method");
        clientSmsVerificationResultEvent.LJIIJJI(EnumC851410Xad.FAILURE.getValue());
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        EnumC852910Xd3 enumC852910Xd3 = (EnumC852910Xd3) afS0S4300000_13.l5;
        c0xz4.getClass();
        clientSmsVerificationResultEvent.LJIIL(C0XZ4.LJJII(enumC852910Xd3));
        C852810Xct c852810Xct = C852810Xct.LIZ;
        Fragment fragment = (Fragment) afS0S4300000_13.l6;
        c852810Xct.getClass();
        clientSmsVerificationResultEvent.LJI(C852810Xct.LIZ(fragment), "3p_platform");
        clientSmsVerificationResultEvent.LJI(C852810Xct.LIZJ((Fragment) afS0S4300000_13.l6), "config_key");
        clientSmsVerificationResultEvent.LJI(String.valueOf(c0xzj.getErrorCode()), "error_code");
        clientSmsVerificationResultEvent.LJIIJ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJI(afS0S4300000_13.s0, "page");
        clientSmsVerificationResultEvent.LJI(afS0S4300000_13.s1, "enter_position");
        clientSmsVerificationResultEvent.LJIIIIZZ();
        C851430Xaf.LJII(((C0XYD) afS0S4300000_13.l4).getMobParams().LJJLIIIJJI(), c0xzj.getErrorCode(), "mobile", c0xzj.getErrorMsg(), afS0S4300000_13.s2, ((C0XYD) afS0S4300000_13.l4).Qm(), ((C0XYD) afS0S4300000_13.l4).getMobParams().LLIIJI(), afS0S4300000_13.s3, afS0S4300000_13.s1);
        C851430Xaf.LIZ(c0xzj.getErrorCode(), ((C0XYD) afS0S4300000_13.l4).getMobParams().LJJLIIIJJI(), ((C0XYD) afS0S4300000_13.l4).getMobParams().LLIIJI(), "phone", ((C0XYD) afS0S4300000_13.l4).Qm());
        C1C7U.LIZIZ("NetworkHelper@8b8f.bindMobileNoPassword$3");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS0S4300000_13(androidx.fragment.app.Fragment r2, X.EnumC852910Xd3 r3, X.C0XYD r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9) {
        /*
            r1 = this;
            r1.$t = r9
            if (r9 == 0) goto L17
            r0 = r1
            r0.l4 = r4
            r0.l5 = r3
            r0.l6 = r2
            r0.s0 = r5
            r0.s1 = r6
            r0.s2 = r7
            r0.s3 = r8
        L13:
            r0.<init>()
            return
        L17:
            r0 = r1
            r0.l4 = r4
            r0.s0 = r5
            r0.s1 = r6
            r0.s2 = r7
            r0.l5 = r3
            r0.l6 = r2
            r0.s3 = r8
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S4300000_13.<init>(androidx.fragment.app.Fragment, X.0Xd3, X.0XYD, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
