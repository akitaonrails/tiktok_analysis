package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.lightinteract.impl.model.LightInteractionFrequencyControlRule;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.0DhU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C346060DhU implements InterfaceC909670ZmP {
    public static final C346060DhU LIZ = new C346060DhU();
    public static final Map<String, List<String>> LIZIZ = new LinkedHashMap();
    public static final Map<String, LightInteractionFrequencyControlRule> LIZJ = new LinkedHashMap();

    @Override // X.InterfaceC909670ZmP
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC909670ZmP
    public final void LIZIZ(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(X.C346070DhV r17, java.util.List r18) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C346060DhU.LIZLLL(X.0DhV, java.util.List):boolean");
    }

    public static long LJ(long j, long j2) {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.ROOT);
        calendar.setTimeInMillis(((long) LSPassThroughRecordSizeConfig.DEFAULT) * j2);
        return ((long) ((calendar.get(11) * 60 * 60) + (calendar.get(12) * 60) + calendar.get(13))) + (j - j2);
    }

    @Override // X.InterfaceC909670ZmP
    public final boolean LIZJ(Object obj, String str, String str2) {
        if (!(obj instanceof C346070DhV)) {
            return false;
        }
        C346070DhV c346070DhV = (C346070DhV) obj;
        try {
            Map<String, List<String>> map = LIZIZ;
            List<String> listLIZLLL = (List) ((LinkedHashMap) map).get(str);
            if (listLIZLLL == null) {
                listLIZLLL = C051M.LIZLLL(String[].class, str, false);
            }
            map.put(str, listLIZLLL);
            ArrayList arrayList = new ArrayList();
            for (String str3 : listLIZLLL) {
                Map<String, LightInteractionFrequencyControlRule> map2 = LIZJ;
                LightInteractionFrequencyControlRule lightInteractionFrequencyControlRule = (LightInteractionFrequencyControlRule) ((LinkedHashMap) map2).get(str3);
                if (lightInteractionFrequencyControlRule != null || (lightInteractionFrequencyControlRule = (LightInteractionFrequencyControlRule) C051M.LIZIZ(LightInteractionFrequencyControlRule.class, str3)) != null) {
                    map2.put(str3, lightInteractionFrequencyControlRule);
                    arrayList.add(lightInteractionFrequencyControlRule);
                }
            }
            return LIZLLL(c346070DhV, arrayList);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
