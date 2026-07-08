package X;

import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0cek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020240cek {
    public static final /* synthetic */ int LIZ = 0;

    public static final C1020230cej LIZ(String str, String str2, CommonAdData commonAdData) {
        String strValueOf;
        if (commonAdData == null) {
            return new C1020230cej("", "", "", null, null);
        }
        Long creativeId = commonAdData.getCreativeId();
        if (creativeId == null) {
            return new C1020230cej("", "", "", null, null);
        }
        creativeId.longValue();
        if (commonAdData.getGroupId() == null) {
            strValueOf = CardStruct.IStatusCode.DEFAULT;
        } else {
            strValueOf = String.valueOf(commonAdData.getGroupId());
        }
        C1020230cej c1020230cejLIZIZ = LIZIZ(str, str2, String.valueOf(commonAdData.getCreativeId()), commonAdData.getLogExtra(), strValueOf);
        c1020230cejLIZIZ.LIZIZ(Integer.valueOf(commonAdData.getChargeType()), "charge_type");
        c1020230cejLIZIZ.LIZIZ(Integer.valueOf(commonAdData.getSystemOrigin()), "system_origin");
        synchronized (C1019240cd8.class) {
            List<InterfaceC1020260cem> list = C1019240cd8.LIZJ;
            if (((ArrayList) list).isEmpty()) {
                return c1020230cejLIZIZ;
            }
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                try {
                    ((InterfaceC1020260cem) it2.next()).LIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            return c1020230cejLIZIZ;
        }
    }

    public static final C1020230cej LIZIZ(String str, String str2, String str3, String str4, String str5) {
        return new C1020230cej(str, str2, str3, str5, str4);
    }
}
