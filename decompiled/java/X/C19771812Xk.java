package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.bpea.cert.token.TokenCert;
import java.util.Iterator;

/* JADX INFO: renamed from: X.12Xk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19771812Xk {
    static {
        new Object() { // from class: X.12Xo
        };
    }

    public static void LIZ(C0HWO[] c0hwoArr, InterfaceC19772112Xn interfaceC19772112Xn) {
        int i;
        if (interfaceC19772112Xn != null) {
            String[] strArr = new String[c0hwoArr.length];
            int[] iArr = new int[c0hwoArr.length];
            int i2 = 0;
            for (C0HWO c0hwo : c0hwoArr) {
                strArr[i2] = c0hwo.LIZ;
                if (c0hwo.LIZIZ == EnumC442280HVy.GRANTED) {
                    i = 0;
                } else {
                    i = -1;
                }
                iArr[i2] = i;
                i2++;
            }
            interfaceC19772112Xn.LIZ(iArr, strArr);
        }
    }

    public static void LIZJ(Activity activity, String[] strArr, InterfaceC19772112Xn interfaceC19772112Xn) {
        if (activity instanceof C19EG) {
            C19514711Wn.LIZIZ.LIZ();
            C19514711Wn c19514711Wn = new C19514711Wn(activity, null);
            Iterator<AbstractC19515011Wq> it2 = C19514711Wn.LIZJ.iterator();
            while (it2.hasNext()) {
                c19514711Wn.LIZ(new C19514911Wp(it2.next()));
            }
            c19514711Wn.LIZIZ(strArr).LIZJ(new C19774312Yj(interfaceC19772112Xn, 1));
            return;
        }
        if (activity.getFragmentManager().findFragmentByTag("permissions") == null) {
            FragmentC19771912Xl fragmentC19771912Xl = new FragmentC19771912Xl();
            Bundle bundle = new Bundle();
            bundle.putStringArray("permissions", strArr);
            fragmentC19771912Xl.setArguments(bundle);
            fragmentC19771912Xl.LL = interfaceC19772112Xn;
            activity.getFragmentManager().beginTransaction().add(fragmentC19771912Xl, "permissions").commitAllowingStateLoss();
        }
    }

    public static void LIZIZ(Activity activity, TokenCert tokenCert, String[] strArr, InterfaceC19772112Xn interfaceC19772112Xn) {
        C19514711Wn.LIZLLL(activity, tokenCert).LIZIZ(strArr).LIZJ(new C19774312Yj(interfaceC19772112Xn, 0));
    }
}
