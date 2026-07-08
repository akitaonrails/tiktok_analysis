package X;

import android.os.SystemClock;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.appsetting.AppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0VXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799290VXb {
    public static void LIZ(RecyclerView recyclerView, EditText editText) {
        List<String> emailLoginDomainSettings;
        AnonymousClass0317 anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        C799300VXc.LIZ.getClass();
        ArrayList arrayList = null;
        try {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = AppSettingDependencyService.createIAppSettingDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IAppSettingDependencyService.class.getName();
                if (anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAppSettingDependencyService.class);
            }
            emailLoginDomainSettings = ((IAppSettingDependencyService) anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin).getEmailLoginDomainSettings();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getDomainRecommendation error: ");
            sbLIZ.append(e.getMessage());
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!(true ^ emailLoginDomainSettings.isEmpty())) {
            emailLoginDomainSettings = C799300VXc.LIZIZ;
            if (emailLoginDomainSettings != null) {
            }
            new C0DKG(recyclerView, arrayList, new AwS584S0100000_5(editText, 25));
        }
        List listLJJJJLI = C13LP.LJJJJLI(emailLoginDomainSettings);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJJJLI, 10));
        for (String strLIZIZ : (ArrayList) listLJJJJLI) {
            if (!a0.LJJIIZI(strLIZIZ, e3.g, false)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('@');
                sbLIZ2.append(strLIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            arrayList2.add(strLIZIZ);
        }
        arrayList = new ArrayList(arrayList2);
        new C0DKG(recyclerView, arrayList, new AwS584S0100000_5(editText, 25));
    }
}
