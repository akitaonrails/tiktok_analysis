package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.WikipediaExtra;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import java.util.Map;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS77S0500000_16;

/* JADX INFO: renamed from: X.0dsV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067210dsV {
    public static final void LIZ(Context context, WikipediaInfo wikipediaInfo, Map<String, String> map, Map<String, String> map2) {
        String keyword;
        Integer status;
        String warningMsg;
        String lang = wikipediaInfo.getLang();
        if (lang != null && lang.length() != 0 && (keyword = wikipediaInfo.getKeyword()) != null && keyword.length() != 0) {
            AwS77S0500000_16 awS77S0500000_16 = new AwS77S0500000_16(wikipediaInfo, (WikipediaInfo) map, (Map<String, String>) wikipediaInfo, (WikipediaInfo) context, (Context) map2, (Map<String, String>) 1);
            WikipediaExtra extra = wikipediaInfo.getExtra();
            if (extra != null && (status = extra.getStatus()) != null && status.intValue() != 0) {
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                WikipediaExtra extra2 = wikipediaInfo.getExtra();
                String warningMsg2 = null;
                if (extra2 != null) {
                    warningMsg = extra2.getWarningMsg();
                } else {
                    warningMsg = null;
                }
                if (TextUtils.isEmpty(warningMsg)) {
                    warningMsg2 = context.getString(2131858543);
                } else {
                    WikipediaExtra extra3 = wikipediaInfo.getExtra();
                    if (extra3 != null) {
                        warningMsg2 = extra3.getWarningMsg();
                    }
                }
                c1397580mTM.LIZIZ(warningMsg2);
                C985403tE.LIZ(c1397580mTM, new AwS595S0100000_16(awS77S0500000_16, 192));
                new C1397510mTF(c1397580mTM).LIZLLL();
                return;
            }
            awS77S0500000_16.invoke();
        }
    }
}
