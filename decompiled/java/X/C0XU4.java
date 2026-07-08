package X;

import Y.AComparatorS32S0000000_13;
import Y.ARunnableS14S0210000_13;
import Y.ARunnableS1S2210000_13;
import Y.AfS178S0100000_9;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import com.ss.android.ugc.aweme.account.oneclicklogin.OIDCToken;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XU4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XU4 {
    public static final C0XU4 LIZ;
    public static final C0XUF LIZIZ;
    public static C19487011Lw LIZJ;
    public static final C01GW LIZLLL;
    public static volatile List<? extends BaseLoginMethod> LJ;

    static {
        boolean zLJI = MethodIDManager.LJI(72060);
        LIZ = new C0XU4();
        LIZIZ = new C0XUF();
        LIZLLL = C452501pT.LIZIZ(C835330Wpn.LL);
        LJ = C13BV.INSTANCE;
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static boolean LIZ(BaseLoginMethod baseLoginMethod) {
        if (C846430XIj.LIZIZ()) {
            if (!baseLoginMethod.isExpired()) {
                if (baseLoginMethod.getLoginMethodName() != LoginMethodName.DEFAULT || baseLoginMethod.m157isOneClickLogin() || (C293990Bfh.LIZ() && C1533950q1J.LJ(baseLoginMethod.getSuccessfulLoginToken()))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        if (!baseLoginMethod.isExpired()) {
            if (baseLoginMethod.getLoginMethodName() != LoginMethodName.DEFAULT || (C293990Bfh.LIZ() && C1533950q1J.LJ(baseLoginMethod.getSuccessfulLoginToken()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static OIDCToken LIZIZ(String str) {
        C0XUF c0xuf = LIZIZ;
        c0xuf.getClass();
        try {
            Keva keva = (Keva) c0xuf.LIZIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_oidc_key");
            String string = keva.getString(C2188811AlT.LIZIZ(sbLIZ), "");
            if (string != null && string.length() != 0) {
                C1227904rF.LIZ.getClass();
                return (OIDCToken) C1227904rF.LIZIZ(string, OIDCToken.class);
            }
            C0XWJ.LIZ.getClass();
            C0XWJ.LJFF(-3);
            return null;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C0XWJ.LIZ.getClass();
            C0XWJ.LJFF(-4);
            return null;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C0XWJ.LIZ.getClass();
            C0XWJ.LJFF(-5);
            return null;
        }
    }

    public static void LIZJ(List list, boolean z) {
        List listLL = C13LP.LL(C13LP.LJLLLL(new AComparatorS32S0000000_13(21), list), 11);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            BaseLoginMethod baseLoginMethod = (BaseLoginMethod) obj;
            LIZ.getClass();
            if (!(baseLoginMethod instanceof AccountPassLoginMethod) || baseLoginMethod.getLoginMethodName() != LoginMethodName.USER_NAME_PASS || !Intrinsics.LJFF(((AccountPassLoginMethod) baseLoginMethod).isOrgOtp(), Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        LJ = arrayList;
        if (C846430XIj.LIZIZ()) {
            C0XUD.LIZ.getClass();
            C0XUD.LJFF(C0XUD.LIZJ(list), C0XHP.READY);
        }
        C19487011Lw c19487011Lw = LIZJ;
        if (c19487011Lw != null) {
            c19487011Lw.dispose();
        }
        LIZJ = AbstractC19486711Lt.LJIILIIL(new ARunnableS14S0210000_13((Object) listLL, (List<? extends BaseLoginMethod>) z, (boolean) list, (List<? extends BaseLoginMethod>) 2)).LJIJJLI(C11S5.LIZ()).LJI(C0XU5.LIZ).LJIJI(C0N9R.LL, C0N9S.LIZ);
    }

    public static void LJ(String str, String str2, List list, boolean z, final Function0 function0, Function1 function1) {
        List listLL;
        if (list != null) {
            LJ = list;
            C0XUD.LIZ.getClass();
            C0XUD.LJFF(C0XUD.LIZJ(list), C0XHP.READY);
            listLL = C13LP.LL(C13LP.LJLLLL(new AComparatorS32S0000000_13(22), list), 11);
        } else {
            listLL = null;
        }
        C19487011Lw c19487011LwLJIJI = AbstractC19486711Lt.LJIILIIL(new ARunnableS1S2210000_13(str, listLL, str2, list, z, 1)).LJIJJLI(C11S5.LIZ()).LJIJI(new AfS178S0100000_9(function1, (Function1<? super Throwable, Unit>) 55), new InterfaceC781210Ukh() { // from class: X.0N7Q
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        });
        if (list != null) {
            C19487011Lw c19487011Lw = LIZJ;
            if (c19487011Lw != null) {
                c19487011Lw.dispose();
            }
            LIZJ = c19487011LwLJIJI;
        }
    }
}
