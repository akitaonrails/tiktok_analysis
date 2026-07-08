package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountSwitcherLogger;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Xfz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C854730Xfz implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            default:
                return null;
        }
    }

    public static final Object then$0(C854730Xfz c854730Xfz, C15O7 c15o7) {
        JSONObject jSONObject;
        C1C7U.LIZ("UploadALogUtil@5934.doUploadALog$2");
        try {
            if (c15o7.LJIILJJIL() && !TextUtils.isEmpty((CharSequence) c15o7.LJIIL())) {
                C835770WqV c835770WqV = (C835770WqV) c854730Xfz.l0;
                String str = (String) c15o7.LJIIL();
                c835770WqV.getClass();
                jSONObject = C835770WqV.LJ(str, null);
            } else {
                ((C835770WqV) c854730Xfz.l0).getClass();
                jSONObject = C835770WqV.LJ("null", null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Function2 function2 = (Function2) c854730Xfz.l1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("task has error: ");
            String localizedMessage = e.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "unknown error";
            }
            sbLIZ.append(localizedMessage);
            function2.invoke(2, C2188811AlT.LIZIZ(sbLIZ));
            jSONObject = new JSONObject();
        }
        C1C7U.LIZIZ("UploadALogUtil@5934.doUploadALog$2");
        return jSONObject;
    }

    public static final Object then$1(C854730Xfz c854730Xfz, C15O7 c15o7) {
        C1C7U.LIZ("AccountBindingsHelper@c7cd.attemptUnbindEmail$1");
        C854460XfY c854460XfY = C854460XfY.LIZ;
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) c854730Xfz.l0;
        Function1 function1 = (Function1) c854730Xfz.l1;
        c854460XfY.getClass();
        C854460XfY.LJIIL(baseAccountFlowFragment, c15o7, false, function1);
        C1C7U.LIZIZ("AccountBindingsHelper@c7cd.attemptUnbindEmail$1");
        return null;
    }

    public static final Object then$2(C854730Xfz c854730Xfz, C15O7 c15o7) {
        C1C7U.LIZ("AccountBindingsHelper@c7cd.attemptUnbindPhone$1");
        C854460XfY c854460XfY = C854460XfY.LIZ;
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) c854730Xfz.l0;
        Function1 function1 = (Function1) c854730Xfz.l1;
        c854460XfY.getClass();
        C854460XfY.LJIIL(baseAccountFlowFragment, c15o7, true, function1);
        C1C7U.LIZIZ("AccountBindingsHelper@c7cd.attemptUnbindPhone$1");
        return null;
    }

    public static final Object then$3(C854730Xfz c854730Xfz, C15O7 c15o7) {
        boolean z;
        C1C7U.LIZ("AuthSequenceManager@5a17.startSwitchSuccess$2");
        C0XVC.LIZ(null, "AfterSwitchAccountHook", "switch_account");
        IAccountSwitcherLogger iAccountSwitcherLogger = (IAccountSwitcherLogger) PluggableExtentionKt.pluggableSpi$default(IAccountSwitcherLogger.class, false, false, false, 14, null);
        if (iAccountSwitcherLogger != null) {
            iAccountSwitcherLogger.LJ();
        }
        C0XQ5.LJIIJ(((IAccountUserService) c854730Xfz.l0).getCurUser(), true);
        Bundle bundle = (Bundle) c854730Xfz.l1;
        if (C294010Bfj.LIZIZ() != 1 && C294010Bfj.LIZIZ() != 3 && C294010Bfj.LIZIZ() != 4) {
            z = false;
        } else {
            z = true;
        }
        C15O7 c15o7LJ = C0XVM.LIZIZ(bundle, null, z, true).LJ(new C854740Xg0(bundle, 2), C15O7.LJIIIIZZ, null);
        C1C7U.LIZIZ("AuthSequenceManager@5a17.startSwitchSuccess$2");
        return c15o7LJ;
    }

    public C854730Xfz(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
