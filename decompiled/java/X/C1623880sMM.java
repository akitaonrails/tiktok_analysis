package X;

import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sMM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1623880sMM {
    public static final C1623880sMM LIZ = new C1623880sMM();
    public static final ShortVideoContext LIZIZ;
    public static C1622050sJP LIZJ;

    static {
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        shortVideoContext.shootWay = "chat_shoot";
        LIZIZ = shortVideoContext;
    }

    public static void LIZJ(String str) {
        C201955140j.LIZLLL(C201967140v.LIZIZ, "IMStickerResolution", str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZIZ(Integer num, String str) {
        C0L9X c0l9x;
        switch (str.hashCode()) {
            case -1149187101:
                if (!str.equals("SUCCESS")) {
                    return;
                }
                c0l9x = C0L9X.SUCCESS;
                break;
                break;
            case -1031784143:
                if (!str.equals("CANCELLED")) {
                    return;
                }
                c0l9x = C0L9X.CANCELLED;
                break;
                break;
            case 79219778:
                if (!str.equals("START")) {
                    return;
                }
                c0l9x = C0L9X.START;
                break;
                break;
            case 2066319421:
                if (!str.equals("FAILED")) {
                    return;
                }
                c0l9x = C0L9X.FAILED;
                break;
                break;
            default:
                return;
        }
        C539630LEj.LIZIZ(num, c0l9x);
    }

    public static C1622050sJP LIZ(ShortVideoContext shortVideoContext, Function0 function0, final InterfaceC1631630sYr interfaceC1631630sYr) {
        C1650200t2o c1650200t2o = new C1650200t2o() { // from class: X.0sMP
            @Override // X.C1650200t2o, X.InterfaceC1650190t2n
            public InterfaceC2254081DKk St2() {
                final InterfaceC1631630sYr<Integer, Long, Long, String, Unit> interfaceC1631630sYr2 = interfaceC1631630sYr;
                return new C1661430tKv() { // from class: X.0sMO
                    @Override // X.InterfaceC2254081DKk
                    public final void sendEffectMsg(int i, long j, long j2, String str) {
                        interfaceC1631630sYr2.invoke(Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), str);
                    }
                };
            }
        };
        C1622050sJP c1622050sJP = new C1622050sJP(null);
        c1622050sJP.LIZ(new C1632490saF(c1650200t2o));
        c1622050sJP.LIZ(new C1632500saG(c1650200t2o));
        C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
        c1622050sJP.LIZ(new C1407660mjc(c1650200t2o, c2213981Bky.getApplicationContext()));
        c1622050sJP.LIZ(new C1407680mje(c1650200t2o, c2213981Bky.getApplicationContext()));
        c1622050sJP.LIZ(new C1663440tOA(c1650200t2o));
        c1622050sJP.LIZ(new C1410020mnQ(c1650200t2o, new AwS569S0100000_25(function0, (Function0<Unit>) 174)));
        c1622050sJP.LIZ(new C1643700ssK(c1650200t2o, shortVideoContext, new AwS569S0100000_25(function0, (Function0<Unit>) 175)));
        return c1622050sJP;
    }
}
