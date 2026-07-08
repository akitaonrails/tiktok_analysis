package X;

import com.bytedance.android.livesdk.model.Paragraph;
import com.bytedance.android.livesdk.model.RichTextContent;
import com.bytedance.android.livesdk.model.RichTextStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.00Gb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C049900Gb {
    public static final /* synthetic */ int LIZLLL = 0;
    public final RichTextContent LIZ;
    public final Map<String, RichTextStyle> LIZIZ;
    public final RichTextStyle LIZJ;

    public final C229200uY LIZ() {
        List<Paragraph> list = this.LIZ.paragraphs;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Paragraph paragraph : list) {
            RichTextStyle richTextStyleLIZJ = C049800Ga.LIZJ((RichTextStyle) ((LinkedHashMap) this.LIZIZ).get(paragraph.styleRef), this.LIZJ);
            C049800Ga.LIZ(richTextStyleLIZJ);
            long j = paragraph.paragraphId;
            List<Paragraph.TextSpan> list2 = paragraph.spans;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<Paragraph.TextSpan> it2 = list2.iterator();
            while (it2.hasNext()) {
                String str = it2.next().text;
                RichTextStyle richTextStyleLIZJ2 = C049800Ga.LIZJ((RichTextStyle) ((LinkedHashMap) this.LIZIZ).get(paragraph.styleRef), richTextStyleLIZJ);
                C049800Ga.LIZ(richTextStyleLIZJ2);
                arrayList2.add(new C050000Gc(str, richTextStyleLIZJ2));
            }
            arrayList.add(new C229100uX(j, arrayList2, paragraph.maxCharLimit, paragraph.editable, richTextStyleLIZJ));
        }
        RichTextStyle richTextStyle = this.LIZJ;
        C049800Ga.LIZ(richTextStyle);
        return new C229200uY(arrayList, richTextStyle);
    }

    public C049900Gb(RichTextContent richTextContent) {
        this.LIZ = richTextContent;
        List<RichTextStyle> list = richTextContent.styles;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (RichTextStyle richTextStyle : list) {
            linkedHashMap.put(richTextStyle.name, richTextStyle);
        }
        this.LIZIZ = linkedHashMap;
        RichTextStyle richTextStyle2 = (RichTextStyle) linkedHashMap.get(this.LIZ.itemStyleRef);
        this.LIZJ = richTextStyle2 == null ? new RichTextStyle() : richTextStyle2;
    }
}
