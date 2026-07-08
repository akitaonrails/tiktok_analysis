package X;

import com.ss.android.ugc.aweme.im.streak.api.IStreakService;

/* JADX INFO: renamed from: X.05u9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1500705u9 {
    public static final C1500705u9 LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C054G LIZLLL;
    public volatile C1598406Nq LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1500705u9.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C1500705u9 c1500705u9 = new C1500705u9();
        LIZIZ = c1500705u9;
        C1598406Nq c1598406Nq = c1500705u9.LIZ;
        if (c1598406Nq == null) {
            synchronized (c1500705u9) {
                c1598406Nq = c1500705u9.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c1500705u9.LIZ = c1598406Nq;
                }
            }
        }
        LIZLLL = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
    }

    public static void LIZIZ(C1500705u9 c1500705u9, String str) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        c1500705u9.getClass();
        C23250099c.LIZLLL(LIZLLL, null, null, new C1494405t8(interfaceC1493505szLIZIZ, str, null), 3);
    }

    public static void LIZLLL(C1500705u9 c1500705u9, String str, String str2) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        c1500705u9.getClass();
        C23250099c.LIZLLL(LIZLLL, null, null, new C1494105t5(interfaceC1493505szLIZIZ, str, str2, null), 3);
    }

    public static void LIZJ(C1500705u9 c1500705u9, String str, String str2, String str3, int i) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ;
        String str4;
        String str5 = str2;
        if ((i & 2) != 0) {
            str5 = null;
        }
        if ((i & 8) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        } else {
            interfaceC1493505szLIZIZ = null;
        }
        c1500705u9.getClass();
        if (str5 == null && str3 != null) {
            IStreakService.LJJIIZ.getClass();
            if (C06LY.LIZ().P(str3, true)) {
                str4 = "normal";
            } else {
                str4 = "egg";
            }
        } else {
            str4 = "";
        }
        C23250099c.LIZLLL(LIZLLL, null, null, new C1500505u7(interfaceC1493505szLIZIZ, str, str5, str4, str3, null), 3);
    }

    public static void LIZ(C1500705u9 c1500705u9, String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, int i) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ;
        Integer num3 = num2;
        String str7 = str6;
        String str8 = str5;
        String str9 = str3;
        Integer num4 = num;
        String str10 = str2;
        if ((i & 2) != 0) {
            str10 = null;
        }
        if ((i & 4) != 0) {
            str9 = null;
        }
        if ((i & 16) != 0) {
            str8 = null;
        }
        if ((i & 32) != 0) {
            str7 = null;
        }
        if ((i & 64) != 0) {
            num4 = null;
        }
        if ((i & 128) != 0) {
            num3 = null;
        }
        if ((i & 256) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        } else {
            interfaceC1493505szLIZIZ = null;
        }
        c1500705u9.getClass();
        C23250099c.LIZLLL(LIZLLL, null, null, new C1494705tB(interfaceC1493505szLIZIZ, str, str4, str9, str10, str8, str7, num4, num3, null), 3);
    }
}
