package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Xkt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857770Xkt {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(String str, List list) {
        Matcher matcher = PatternProtector.compile(C856940XjY.LJ()).matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group();
            Iterator it2 = list.iterator();
            boolean z = true;
            while (it2.hasNext()) {
                AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) it2.next();
                if (!aVTextExtraStruct.isTransient() && Math.max(Math.abs(aVTextExtraStruct.end - iStart), Math.abs(iEnd - aVTextExtraStruct.start)) < Math.abs(iEnd - iStart) + Math.abs(aVTextExtraStruct.end - aVTextExtraStruct.start)) {
                    z = false;
                }
            }
            if (z) {
                AVTextExtraStruct aVTextExtraStruct2 = new AVTextExtraStruct();
                aVTextExtraStruct2.type = 1;
                aVTextExtraStruct2.hashTagName = u.LJJIFFI(strGroup, "#", "", false);
                aVTextExtraStruct2.start = iStart;
                aVTextExtraStruct2.end = iEnd;
                arrayList.add(aVTextExtraStruct2);
            }
        }
        return arrayList;
    }
}
