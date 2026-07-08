package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.ReviewItemDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.ReviewPicsDto;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D1m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332440D1m {
    public static final SimpleDateFormat LIZ = new SimpleDateFormat("MMMM d, yyyy", Locale.US);

    public static C0D4T LIZIZ(ReviewItemDto reviewItemDto) {
        List list;
        String str = reviewItemDto.author;
        Double d = reviewItemDto.star;
        String str2 = reviewItemDto.starStr;
        String strLIZJ = LIZJ(reviewItemDto.timestamp);
        String str3 = reviewItemDto.content;
        ReviewPicsDto reviewPicsDto = reviewItemDto.pics;
        if (reviewPicsDto == null || (list = reviewPicsDto.image) == null) {
            list = C13BV.INSTANCE;
        }
        return LIZ(d, str, str2, strLIZJ, list, str3);
    }

    public static String LIZJ(Long l) {
        if (l != null && l.longValue() != 0) {
            try {
                return LIZ.format(new Date(l.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public static C0D4T LIZ(Double d, String str, String str2, String str3, List list, String str4) {
        String string;
        String string2;
        Float fValueOf;
        String str5;
        if (str4 == null || (string = a0.LJLIIIL(str4).toString()) == null || string.length() <= 0) {
            return null;
        }
        C332560D1y c332560D1yLIZLLL = C0D4H.LIZLLL(str2, d);
        String string3 = UUID.randomUUID().toString();
        if (str == null || (string2 = a0.LJLIIIL(str).toString()) == null || string2.length() <= 0) {
            string2 = null;
        }
        if (c332560D1yLIZLLL != null) {
            fValueOf = Float.valueOf(c332560D1yLIZLLL.LIZ);
            str5 = c332560D1yLIZLLL.LIZIZ;
        } else {
            fValueOf = null;
            str5 = null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String string4 = a0.LJLIIIL((String) it2.next()).toString();
            if (string4.length() > 0) {
                arrayList.add(string4);
            }
        }
        return new C0D4T(string3, "", string2, fValueOf, str5, str3, string, arrayList);
    }
}
