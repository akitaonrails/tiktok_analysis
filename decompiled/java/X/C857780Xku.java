package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Xku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857780Xku {
    public static List LIZIZ(String str, List list) {
        List<String> listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL("#AskTikTok #TikTokDoYourMagic", new String[]{" "}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (String str2 : listLJJLIIIJILLIZJL) {
            int iLJJJ = a0.LJJJ(str, str2, 0, false, 6);
            if (iLJJJ >= 0) {
                int length = str2.length() + iLJJJ;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) it2.next();
                        if (aVTextExtraStruct.isTransient() || iLJJJ >= aVTextExtraStruct.end || length <= aVTextExtraStruct.start) {
                        }
                    }
                }
                AVTextExtraStruct aVTextExtraStruct2 = new AVTextExtraStruct();
                aVTextExtraStruct2.type = 1;
                aVTextExtraStruct2.hashTagName = a0.LJJJJZ("#", str2);
                aVTextExtraStruct2.start = iLJJJ;
                aVTextExtraStruct2.end = length;
                arrayList.add(aVTextExtraStruct2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZJ(java.lang.String r3, java.util.List r4) {
        /*
            X.0XlC r1 = new X.0XlC
            r1.<init>()
            X.0Xlz r0 = new X.0Xlz
            r0.<init>(r1)
            r0.LJI(r3, r4)
            X.13E8 r4 = r0.LIZ()
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r4, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r4.iterator()
        L20:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r1.next()
            X.0Xlm r0 = (X.AbstractC858320Xlm) r0
            java.lang.String r0 = r0.LJIILL(r3)
            r2.add(r0)
            goto L20
        L34:
            java.util.Iterator r3 = r2.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r2 = r3.next()
        L42:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r0)
            goto L42
        L5f:
            if (r2 != 0) goto L63
        L61:
            java.lang.String r2 = ""
        L63:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r4.iterator()
        L6c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r0 = r1.next()
            X.0Xlm r0 = (X.AbstractC858320Xlm) r0
            java.util.List r0 = r0.LJI()
            X.C19719612Di.LJJI(r0, r3)
            goto L6c
        L80:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C857780Xku.LIZJ(java.lang.String, java.util.List):kotlin.Pair");
    }

    public static Pair LIZ(Context context, VideoPublishEditModel videoPublishEditModel, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('@');
        sbLIZ.append(context.getString(2131824810, videoPublishEditModel.creativeModel.text2ImageModel.fromUserName));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(context.getString(2131824809));
        sbLIZ2.append(' ');
        sbLIZ2.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        if (z && videoPublishEditModel.creativeModel.text2ImageModel.isHelpText) {
            strLIZIZ2 = C572160McI.LIZ(strLIZIZ2);
        }
        return new Pair(strLIZIZ, strLIZIZ2);
    }
}
