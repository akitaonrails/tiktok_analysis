package X;

import com.bytedance.android.livesdk.model.Paragraph;
import com.bytedance.android.livesdk.model.RichTextContent;
import com.bytedance.android.livesdk.model.RichTextStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.00GZ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00GZ {
    public static final List<String> LIZ(RichTextContent richTextContent) {
        String str;
        List<RichTextStyle> list = richTextContent.styles;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (RichTextStyle richTextStyle : list) {
            linkedHashMap.put(richTextStyle.name, richTextStyle);
        }
        List<Paragraph> list2 = richTextContent.paragraphs;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<Paragraph> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().styleRef);
        }
        List listLJJJJI = C13LP.LJJJJI(C13LP.LJLIL(Collections.singletonList(richTextContent.itemStyleRef), arrayList));
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = listLJJJJI.iterator();
        while (it3.hasNext()) {
            RichTextStyle richTextStyle2 = (RichTextStyle) linkedHashMap.get(it3.next());
            if (richTextStyle2 != null && (str = richTextStyle2.fontFamily) != null) {
                arrayList2.add(str);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((String) obj).length() > 0) {
                arrayList3.add(obj);
            }
        }
        return C13LP.LJJJJI(arrayList3);
    }
}
