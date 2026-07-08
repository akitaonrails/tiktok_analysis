package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.SmartIntent;
import com.ss.android.ugc.aweme.ecommerce.dependency.deeplink.DeeplinkDependencyService;
import com.ss.android.ugc.aweme.ecommerce.performance.EcPerfSceneConfig;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.deeplink.IDeeplinkDependencyService;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0vTg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractActivityC1743740vTg extends BaseActivity implements InterfaceC836750Ws5, InterfaceC1739450vMl, InterfaceC1743770vTj, InterfaceC1722210uux {
    public InterfaceC342470Dbh LL;
    public long LLILLJJLI = -1;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 4));
    public long LLILZ = -1;

    @Override // X.InterfaceC1739450vMl
    public boolean Pp(Map<String, String> map) {
        return false;
    }

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public void Q3(C1748770vbn c1748770vbn) {
    }

    @Override // X.InterfaceC1722210uux
    @InterfaceC1294060jmO
    public String getBtmCode() {
        return null;
    }

    @Override // X.InterfaceC1164530gPT
    public void onEvent(String str, String str2) {
    }

    @Override // X.InterfaceC1748820vbs
    public final void sh() {
    }

    public final EcPerfSceneConfig LLLLZI() {
        return (EcPerfSceneConfig) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        InterfaceC1748810vbr interfaceC1748810vbrLIZJ = C960603pE.LIZJ(this);
        return interfaceC1748810vbrLIZJ == null ? C960603pE.LIZ(getIntent(), this) : interfaceC1748810vbrLIZJ;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public void finish() {
        AnonymousClass0317 anonymousClass0317CreateIDeeplinkDependencyServicebyMonsterPlugin;
        super.finish();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIDeeplinkDependencyServicebyMonsterPlugin = DeeplinkDependencyService.createIDeeplinkDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IDeeplinkDependencyService.class.getName(), anonymousClass0317CreateIDeeplinkDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIDeeplinkDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIDeeplinkDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIDeeplinkDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IDeeplinkDependencyService.class);
        }
        ((IDeeplinkDependencyService) anonymousClass0317CreateIDeeplinkDependencyServicebyMonsterPlugin).onFinish(this);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, android.app.Activity
    public final Intent getIntent() {
        Intent intent = super.getIntent();
        if (intent == null || !(!SmartIntent.isSmartIntent(intent))) {
            return intent;
        }
        Intent intentSmartIntent = SmartIntent.smartIntent(intent);
        setIntent(intentSmartIntent);
        return intentSmartIntent;
    }

    @Override // X.InterfaceC1748820vbs
    public String getPageName() {
        return getClass().getSimpleName();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onDestroy() {
        String str;
        super.onDestroy();
        C1743750vTh.LIZ(this);
        if (!C0NWT.LIZ() || LLLLZI() == null) {
            return;
        }
        C054G c054g = C0NTE.LIZ;
        EcPerfSceneConfig ecPerfSceneConfigLLLLZI = LLLLZI();
        if (ecPerfSceneConfigLLLLZI == null || (str = ecPerfSceneConfigLLLLZI.sceneName) == null) {
            str = "";
        }
        C0NWX c0nwx = C0NWX.EXIT;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("out_");
        EcPerfSceneConfig ecPerfSceneConfigLLLLZI2 = LLLLZI();
        sbLIZ.append(ecPerfSceneConfigLLLLZI2 != null ? ecPerfSceneConfigLLLLZI2.sceneName : null);
        C0NTE.LIZ(str, c0nwx, LLLLLZL((int) (SystemClock.elapsedRealtime() - this.LLILZ), C2188811AlT.LIZIZ(sbLIZ)));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        super.onResume();
        this.LLILLJJLI = SystemClock.elapsedRealtime();
    }

    @Override // X.InterfaceC1748820vbs
    public final Map<String, String> Aa() {
        return C988803tm.LIZIZ;
    }

    public void LLLLZIL() {
        C1756030vnV.LIZ(this);
    }

    @Override // X.InterfaceC1748810vbr
    public final List<String> getRegisteredLane() {
        return C988803tm.LIZ;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        this.LLILZ = SystemClock.elapsedRealtime();
        if (C0NWT.LIZ() && LLLLZI() != null) {
            C054G c054g = C0NTE.LIZ;
            EcPerfSceneConfig ecPerfSceneConfigLLLLZI = LLLLZI();
            if (ecPerfSceneConfigLLLLZI == null || (str = ecPerfSceneConfigLLLLZI.sceneName) == null) {
                str = "";
            }
            C0NWX c0nwx = C0NWX.ENTER;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enter_");
            EcPerfSceneConfig ecPerfSceneConfigLLLLZI2 = LLLLZI();
            if (ecPerfSceneConfigLLLLZI2 != null) {
                str2 = ecPerfSceneConfigLLLLZI2.sceneName;
            } else {
                str2 = null;
            }
            sbLIZ.append(str2);
            C0NTE.LIZ(str, c0nwx, LLLLLZL(0, C2188811AlT.LIZIZ(sbLIZ)));
        }
        super.onCreate(bundle);
        activityConfiguration(AFwS241S0000000_10.get$arr$(0));
        LLLLZIL();
        C1722200uuw.LIZ(this);
        mG(null, null);
        LLLLZLL(getWindow().getDecorView(), null, null);
        getSupportFragmentManager().LJIIJ();
    }

    @Override // X.InterfaceC836750Ws5
    public final void setActivityResultListener(InterfaceC342470Dbh interfaceC342470Dbh) {
        this.LL = interfaceC342470Dbh;
    }

    public final Map LLLLLZL(int i, String str) {
        String str2;
        Pair[] pairArr = new Pair[3];
        EcPerfSceneConfig ecPerfSceneConfigLLLLZI = LLLLZI();
        if (ecPerfSceneConfigLLLLZI == null || (str2 = ecPerfSceneConfigLLLLZI.sceneName) == null) {
            str2 = "";
        }
        pairArr[0] = new Pair("page_name", str2);
        pairArr[1] = new Pair("scene_name", str);
        pairArr[2] = new Pair("stay_time", Integer.valueOf(i));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // X.InterfaceC1740480vOQ
    public final void mG(View view, LifecycleOwner lifecycleOwner) {
        C1756050vnX.LIZ(this, view, lifecycleOwner);
    }

    public final void LLLLZLL(View view, Function0<Unit> function0, Function0<Unit> function02) {
        C1756050vnX.LIZJ(view, this, function0, function02);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC342470Dbh interfaceC342470Dbh = this.LL;
        if (interfaceC342470Dbh != null) {
            interfaceC342470Dbh.onActivityResult(i, i2, intent);
        }
    }
}
