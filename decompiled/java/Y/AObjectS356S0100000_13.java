package Y;

import X.C0CBL;
import X.C0CMU;
import X.C0XQ7;
import X.C1161920gLG;
import X.C2193741AtQ;
import X.C2549909yz;
import X.C788320UwA;
import X.C835850Wqd;
import X.C851480Xak;
import X.InterfaceC1041760dDS;
import X.InterfaceC815970Vzf;
import android.os.Bundle;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.kakao.KakaoAuth;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AObjectS356S0100000_13 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public AObjectS356S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS356S0100000_13 aObjectS356S0100000_13, Object obj) {
        C788320UwA c788320UwA = (C788320UwA) aObjectS356S0100000_13.l0;
        C0CMU c0cmu = C0CMU.LIZ;
        if (C0CMU.LIZIZ != C0CBL.EXITED) {
            c788320UwA.LIZIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS356S0100000_13 aObjectS356S0100000_13, Object obj) {
        C788320UwA c788320UwA = (C788320UwA) aObjectS356S0100000_13.l0;
        C0CMU c0cmu = C0CMU.LIZ;
        if (C0CMU.LIZIZ != C0CBL.EXITED) {
            c788320UwA.LIZ(C2549909yz.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS356S0100000_13 aObjectS356S0100000_13, Object obj) {
        C0XQ7.LIZJ().logoutWithLoadingIndicator("user_logout", "user_logout", (Bundle) aObjectS356S0100000_13.l0, null);
        return null;
    }

    public static final Object invoke$3(AObjectS356S0100000_13 aObjectS356S0100000_13, Object obj) {
        InterfaceC1041760dDS interfaceC1041760dDS = (InterfaceC1041760dDS) aObjectS356S0100000_13.l0;
        JSONObject jSONObject = (JSONObject) obj;
        C835850Wqd.LIZ.getClass();
        C835850Wqd.LJFF = C835850Wqd.LIZ(jSONObject);
        C835850Wqd.LIZIZ();
        interfaceC1041760dDS.onSuccess(jSONObject);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS356S0100000_13 aObjectS356S0100000_13, Object obj) {
        InterfaceC1041760dDS interfaceC1041760dDS = (InterfaceC1041760dDS) aObjectS356S0100000_13.l0;
        JSONObject jSONObject = (JSONObject) obj;
        C835850Wqd.LIZ.getClass();
        C835850Wqd.LJFF = C835850Wqd.LIZ(jSONObject);
        C835850Wqd.LIZIZ();
        interfaceC1041760dDS.onSuccess(jSONObject);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS356S0100000_13 aObjectS356S0100000_13, Object obj) {
        boolean z;
        KakaoAuth kakaoAuth = (KakaoAuth) aObjectS356S0100000_13.l0;
        Throwable th = (Throwable) obj;
        kakaoAuth.getClass();
        C2193741AtQ c2193741AtQ = new C2193741AtQ(kakaoAuth.LLILLL.LIZIZ, 2);
        if (th == null) {
            z = true;
        } else {
            z = false;
        }
        c2193741AtQ.LIZ = z;
        c2193741AtQ.LIZIZ = new C851480Xak(new Exception(th));
        kakaoAuth.LLILZIL.xQ2(new AuthResult(c2193741AtQ));
        return null;
    }

    public static final Object invoke$6(AObjectS356S0100000_13 aObjectS356S0100000_13, Object obj) {
        Class hostActivity;
        InterfaceC815970Vzf interfaceC815970Vzf = (InterfaceC815970Vzf) aObjectS356S0100000_13.l0;
        int iIntValue = ((Integer) obj).intValue();
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue != 3) {
                    hostActivity = null;
                } else {
                    hostActivity = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getHostActivity(7);
                }
            } else {
                hostActivity = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getHostActivity(6);
            }
        } else {
            hostActivity = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getHostActivity(5);
        }
        interfaceC815970Vzf.LIZ(hostActivity);
        return Unit.LIZ;
    }
}
