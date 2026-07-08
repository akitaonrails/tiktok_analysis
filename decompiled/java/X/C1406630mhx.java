package X;

import c1b.m;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RichBlock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.XLEcRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.XLLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0mhx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406630mhx {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(RichBlock richBlock, int i, m mVar) {
        List<LogisticLinkRichText> list;
        ArrayList arrayList = new ArrayList();
        Integer num = richBlock.richBlockType;
        int value = EnumC1406660mi0.RICH_TEXT.getValue();
        if (num != null && num.intValue() == value) {
            if (richBlock.ecRichText != null) {
                arrayList.add(new C1406720mi6((CharSequence) null, "text", (Integer) null, 0, (String) null, (LogisticLinkRichText) null, richBlock.ecRichText, false, mVar, 381));
            } else if (richBlock.linkRichText != null) {
                RichTextUtil richTextUtil = RichTextUtil.LIZ;
                LogisticLinkRichText logisticLinkRichText = richBlock.linkRichText;
                richTextUtil.getClass();
                arrayList.add(new C1406720mi6((CharSequence) RichTextUtil.LIZJ(logisticLinkRichText), "text", (Integer) null, 0, (String) null, richBlock.linkRichText, (ECRichText) null, false, mVar, 444));
                return arrayList;
            }
        } else {
            int value2 = EnumC1406660mi0.IMAGE.getValue();
            int i2 = 0;
            if (num != null && num.intValue() == value2) {
                Image image = richBlock.image;
                if (image != null) {
                    C1334210kp9.LIZ(image, EnumC1769850w9n.PDP_DESC, null, null, Integer.valueOf(i), null, 204);
                }
                Image image2 = richBlock.image;
                if (image2 != null && image2.getUrls() != null) {
                    arrayList.add(new C1406700mi4(richBlock.image, false, mVar, 14));
                    return arrayList;
                }
            } else {
                int value3 = EnumC1406660mi0.XL_TEXT.getValue();
                if (num != null && num.intValue() == value3) {
                    XLEcRichText xLEcRichText = richBlock.xlEcRichText;
                    if (xLEcRichText != null) {
                        List<ECRichText> list2 = xLEcRichText.liTexts;
                        if (list2 != null) {
                            Integer num2 = xLEcRichText.xlType;
                            int value4 = EnumC1153640g7u.UL.getValue();
                            if (num2 != null && num2.intValue() == value4) {
                                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                                Iterator<ECRichText> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(new C1406720mi6((CharSequence) null, "ul", (Integer) null, 0, (String) null, (LogisticLinkRichText) null, it2.next(), false, mVar, 381));
                                }
                                arrayList.addAll(arrayList2);
                                return arrayList;
                            }
                            Integer num3 = xLEcRichText.xlType;
                            int value5 = EnumC1153640g7u.OL.getValue();
                            if (num3 != null && num3.intValue() == value5) {
                                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                                Iterator<ECRichText> it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    i2++;
                                    arrayList3.add(new C1406720mi6((CharSequence) null, "ol", (Integer) null, i2, (String) null, (LogisticLinkRichText) null, it3.next(), false, mVar, 373));
                                }
                                arrayList.addAll(arrayList3);
                                return arrayList;
                            }
                        }
                    } else {
                        XLLinkRichText xLLinkRichText = richBlock.xlLinkRichText;
                        if (xLLinkRichText != null && (list = xLLinkRichText.liTexts) != null) {
                            Integer num4 = xLLinkRichText.xlType;
                            int value6 = EnumC1153640g7u.UL.getValue();
                            if (num4 != null && num4.intValue() == value6) {
                                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list, 10));
                                for (LogisticLinkRichText logisticLinkRichText2 : list) {
                                    RichTextUtil.LIZ.getClass();
                                    arrayList4.add(new C1406720mi6((CharSequence) RichTextUtil.LIZJ(logisticLinkRichText2), "ul", (Integer) null, 0, (String) null, logisticLinkRichText2, (ECRichText) null, false, mVar, 444));
                                }
                                arrayList.addAll(arrayList4);
                                return arrayList;
                            }
                            Integer num5 = xLLinkRichText.xlType;
                            int value7 = EnumC1153640g7u.OL.getValue();
                            if (num5 != null && num5.intValue() == value7) {
                                ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list, 10));
                                for (LogisticLinkRichText logisticLinkRichText3 : list) {
                                    i2++;
                                    RichTextUtil.LIZ.getClass();
                                    arrayList5.add(new C1406720mi6((CharSequence) RichTextUtil.LIZJ(logisticLinkRichText3), "ol", (Integer) null, i2, (String) null, logisticLinkRichText3, (ECRichText) null, false, mVar, 436));
                                }
                                arrayList.addAll(arrayList5);
                                return arrayList;
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
