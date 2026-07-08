package X;

import android.app.Activity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0mUC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1398100mUC {
    public static Map<String, String> LIZIZ;
    public static final C1398100mUC LIZ = new C1398100mUC();
    public static final Set<String> LIZJ = new LinkedHashSet();

    public static void LIZ() {
        DialogFragment dialogFragment;
        FragmentManager supportFragmentManager;
        C19EG c19egLIZIZ = LIZIZ();
        Fragment fragmentLJJJJZI = null;
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            fragmentLJJJJZI = supportFragmentManager.LJJJJZI("FundraiserShareSheet");
        }
        if ((fragmentLJJJJZI instanceof TuxSheet) && (dialogFragment = (DialogFragment) fragmentLJJJJZI) != null) {
            dialogFragment.dismiss();
        }
        ComplianceServiceProvider.LJIILL().LIZLLL();
    }

    public static C19EG LIZIZ() {
        C1844400y62 c1844400y62;
        F f;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ instanceof C1397950mTx) {
            C1397950mTx c1397950mTx = (C1397950mTx) abstractC1387200mCcLJ;
            if (c1397950mTx != null) {
                return c1397950mTx.LJ;
            }
            return null;
        }
        if (!(abstractC1387200mCcLJ instanceof C1844400y62) || (c1844400y62 = (C1844400y62) abstractC1387200mCcLJ) == null || (f = c1844400y62.LIZLLL) == 0) {
            return null;
        }
        return f.getActivity();
    }

    public static void LIZLLL(String str) {
        Activity activityLIZIZ;
        LIZJ("fundraiser_amplification_sheet_click", C2097908Jt.LIZJ(new Pair("action", "post")));
        LIZ();
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null) {
            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        String strLJJLIIIJJI = ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJJLIIIJJI();
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.creationId(UUID.randomUUID().toString());
        builder.shootWay("direct_shoot");
        builder.groupId(C1398110mUD.LIZIZ);
        builder.enterFrom("amplify_fundraiser");
        builder.enterMethod(str);
        builder.fromMain(true);
        builder.startRecordTime(System.currentTimeMillis());
        builder.shootExtraData(new ShootExtraData(strLJJLIIIJJI, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777214, null));
        if (activityLIZIZ != null) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncServiceForMainRecordService(activityLIZIZ, "direct_shoot", new C1401820maC(activityLIZIZ, builder, 2));
        }
    }

    public static void LIZJ(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> map2 = LIZIZ;
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C20684815ws.LJIILLIIL(str, linkedHashMap);
    }
}
