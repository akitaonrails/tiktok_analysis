package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0XUF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XUF {
    public final C0XUL LIZ;
    public final C01GW LIZIZ;

    public C0XUF() {
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        this.LIZ = (C0XUL) C1943907jR.LIZ(C0XPY.LIZIZ, C0XUL.class);
        this.LIZIZ = C452501pT.LIZIZ(new C0XUC());
    }

    public static boolean LIZIZ(String str) {
        if (!C0XUK.LIZ() && !C293990Bfh.LIZ()) {
            return C1533950q1J.LJ(str);
        }
        if (str != null) {
            return true;
        }
        return false;
    }

    public final void LIZJ(List<? extends BaseLoginMethod> list) {
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            BaseLoginMethod baseLoginMethod = (BaseLoginMethod) obj;
            if (baseLoginMethod.isHistoryLogin() || baseLoginMethod.m157isOneClickLogin()) {
                arrayList2.add(obj);
            }
        }
        this.LIZ.LIZJ(GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), arrayList2));
    }

    public static void LIZ(List list, BaseLoginMethod baseLoginMethod) {
        if (baseLoginMethod instanceof PhoneLoginMethod) {
            PhoneLoginMethod phoneLoginMethod = (PhoneLoginMethod) baseLoginMethod;
            if (!C0XUK.LIZ() && !C293990Bfh.LIZ()) {
                String nationalNumber = phoneLoginMethod.getPhoneNumber().getNationalNumber();
                if (nationalNumber != null && nationalNumber.length() != 0) {
                    try {
                        if (CastLongProtector.parseLong(phoneLoginMethod.getPhoneNumber().getNationalNumber()) <= 0) {
                            return;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        ((ArrayList) list).add(baseLoginMethod);
    }
}
