package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TextLinkConfig;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0zfD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904650zfD {
    public static void LIZ(C1360520lVa c1360520lVa, NoticeUITemplate noticeUITemplate, Function2 function2) {
        String str = noticeUITemplate.content;
        if (str == null) {
            str = "";
        }
        int iEnd = 0;
        if (str.length() == 0) {
            return;
        }
        List list = noticeUITemplate.contentTextLinkConfigs;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        int size = list.size();
        Matcher matcher = PatternProtector.compile("\\[\\[text_link_(\\d)\\]\\]").matcher(str);
        while (matcher.find()) {
            if (iEnd != matcher.start()) {
                c1360520lVa.LIZIZ(str.substring(iEnd, matcher.start()));
            }
            iEnd = matcher.end();
            int iIntValue = CastIntegerProtector.valueOf(matcher.group(1)).intValue() - 1;
            if (size > iIntValue && ListProtector.get(list, iIntValue) != null) {
                TextLinkConfig textLinkConfig = (TextLinkConfig) ListProtector.get(list, iIntValue);
                if (function2 == null) {
                    String str2 = textLinkConfig.text;
                    if (str2 != null) {
                        c1360520lVa.LIZIZ(str2);
                    }
                } else {
                    function2.invoke(textLinkConfig, c1360520lVa);
                }
            }
        }
        if (iEnd < str.length()) {
            c1360520lVa.LIZIZ(str.substring(iEnd));
        }
    }
}
