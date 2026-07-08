package X;

import android.content.Context;
import android.net.Uri;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0drg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066700drg {
    public static final C1066700drg LIZ = new C1066700drg();

    public static void LJ(C1066710drh c1066710drh, Map map) {
        String aid;
        Uri.Builder builder = new Uri.Builder();
        Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ((String) map.get("aweme_id"));
        Uri.Builder builderAppendQueryParameter = builder.appendQueryParameter("report_type", (String) map.get("report_type")).appendQueryParameter("owner_id", (String) map.get("owner_id")).appendQueryParameter("enter_from", (String) map.get("enter_from")).appendQueryParameter("reported_url", c1066710drh.LJ()).appendQueryParameter("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        if (awemeLLILZ == null || (aid = awemeLLILZ.getAid()) == null) {
            aid = "";
        }
        builderAppendQueryParameter.appendQueryParameter("object_id", aid);
        ComplianceServiceProvider.LJJ().LIZIZ(C1537820q7Y.LIZLLL(), builder);
    }

    public static C1247530iZL LIZ(int i, int i2, Function0 function0) {
        C1247530iZL c1247530iZL = new C1247530iZL();
        c1247530iZL.LIZJ(i);
        c1247530iZL.LIZIZ(i2);
        c1247530iZL.LIZ(new AwS595S0100000_16(function0, (Function0<Unit>) 344));
        return c1247530iZL;
    }

    public static List LIZJ(Context context, C1066710drh c1066710drh, Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LIZIZ(context, R.raw.icon_flag, R.string.s65, new AwS417S0200000_16(c1066710drh, (C1066710drh) map, (Map<String, String>) 92)));
        if (((Boolean) C2273111Dy9.LIZJ.getValue()).booleanValue()) {
            arrayList.add(LIZIZ(context, R.raw.icon_compass, 2131838803, new AwS417S0200000_16(c1066710drh, (C1066710drh) map, (Map<String, String>) 93)));
        }
        if (((Boolean) C2273111Dy9.LIZLLL.getValue()).booleanValue()) {
            arrayList.add(LIZIZ(context, R.raw.icon_link, 2131847874, new AwS417S0200000_16(c1066710drh, (C1066710drh) map, (Map<String, String>) 94)));
        }
        return arrayList;
    }

    public static List LIZLLL(Context context, C1066710drh c1066710drh, Map map) {
        return C1697810uHb.LJIILJJIL(LIZIZ(context, R.raw.icon_flag, R.string.s65, new AwS417S0200000_16(c1066710drh, (C1066710drh) map, (Map<String, String>) 95)));
    }

    public static C12O0 LIZIZ(Context context, int i, int i2, Function0 function0) {
        String string;
        if (context == null || (string = context.getString(i2)) == null) {
            string = "";
        }
        return new C12O0(string, i, new AwS560S0100000_16(function0, (Function0<Unit>) 859));
    }
}
