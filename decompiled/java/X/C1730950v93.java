package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardRichText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ColorEntity;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldPromotionInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0v93, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1730950v93 implements InterfaceC1731410v9n {
    public final C428440Gr4 LIZ;
    public Function0<Unit> LJ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1333));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1332));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1330));
    public final List<Integer> LJFF = new ArrayList();

    public C1730950v93(C428440Gr4 c428440Gr4) {
        this.LIZ = c428440Gr4;
        c428440Gr4.setSubLayoutId(R.layout.bub);
    }

    @Override // X.InterfaceC1731410v9n
    public final void LIZ(TemplateItem templateItem) {
        TemplateFieldData templateFieldData;
        TemplateFieldText templateFieldText;
        TemplateFieldData templateFieldData2;
        TemplateFieldText templateFieldText2;
        if (templateItem.getType() != 4) {
            return;
        }
        C1723530ux5.LIZLLL(this.LIZ, templateItem.gy(), new AwS570S0100000_26(this, 1331));
        TemplateField templateField = (TemplateField) C13LP.LJJJLZIJ(0, templateItem.T5());
        if (templateField != null && (templateFieldData2 = templateField.fieldData) != null && (templateFieldText2 = templateFieldData2.fieldText) != null) {
            ((TextView) this.LIZIZ.getValue()).setText(templateFieldText2.content);
            C1723530ux5.LIZJ((TuxTextView) this.LIZIZ.getValue(), templateFieldText2.lineLimit);
        }
        TemplateField templateField2 = (TemplateField) C13LP.LJJJLZIJ(1, templateItem.T5());
        if (templateField2 != null && (templateFieldData = templateField2.fieldData) != null && (templateFieldText = templateFieldData.fieldText) != null) {
            ((TextView) this.LIZJ.getValue()).setText(templateFieldText.content);
            C1723530ux5.LIZJ((TuxTextView) this.LIZJ.getValue(), templateFieldText.lineLimit);
            C1723530ux5.LJ((TuxTextView) this.LIZJ.getValue(), templateFieldText.bgColor, 124);
        }
        LIZLLL(templateItem.T5());
    }

    @Override // X.InterfaceC1731410v9n
    public final void LIZIZ(AwS407S0200000_6 awS407S0200000_6) {
        this.LJ = awS407S0200000_6;
    }

    public final TuxTextView LIZJ(int i) {
        Integer num = (Integer) C13LP.LJJJLZIJ(i - 1, this.LJFF);
        if (num != null) {
            return (TuxTextView) ((View) this.LIZLLL.getValue()).findViewById(num.intValue());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [android.view.View, android.widget.TextView, com.bytedance.tux.input.TuxTextView] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.util.AttributeSet, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
    public final void LIZLLL(List<TemplateField> list) {
        ?? spannableStringBuilder;
        ?? r0;
        ?? next;
        boolean z;
        Integer numLIZJ;
        ?? r02;
        Integer num;
        C1730290v7z.LIZ.getClass();
        int iLJ = C1730290v7z.LJ(list);
        if (((ArrayList) this.LJFF).size() > iLJ) {
            C786410Ut5.LJJJJJL((LinearLayout) this.LIZLLL.getValue());
            ((ArrayList) this.LJFF).clear();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<TemplateField> it2 = list.iterator();
        while (true) {
            spannableStringBuilder = 0;
            r0 = 0;
            if (!it2.hasNext()) {
                break;
            }
            TemplateField next2 = it2.next();
            TemplateFieldPromotionInfo templateFieldPromotionInfo = next2.fieldData.fieldPromotionInfo;
            if (templateFieldPromotionInfo != null && templateFieldPromotionInfo.sort != null && templateFieldPromotionInfo.sort.intValue() > 0) {
                arrayList.add(next2);
            }
        }
        int size = arrayList.size();
        if (1 <= size) {
            int i = 1;
            while (true) {
                Iterator<TemplateField> it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        TemplateFieldPromotionInfo templateFieldPromotionInfo2 = ((TemplateField) next).fieldData.fieldPromotionInfo;
                        if (templateFieldPromotionInfo2 != null && (num = templateFieldPromotionInfo2.sort) != null && num.intValue() == i) {
                            break;
                        }
                    } else {
                        next = spannableStringBuilder;
                        break;
                    }
                }
                TemplateField templateField = (TemplateField) next;
                ?? r03 = r0;
                if (templateField != null) {
                    TemplateFieldData templateFieldData = templateField.fieldData;
                    r03 = r0;
                    if (templateFieldData != null) {
                        TemplateFieldPromotionInfo templateFieldPromotionInfo3 = templateFieldData.fieldPromotionInfo;
                        r03 = r0;
                        if (templateFieldPromotionInfo3 != null) {
                            BillboardRichText billboardRichText = templateFieldPromotionInfo3.richText;
                            r03 = r0;
                            if (billboardRichText != null) {
                                r03 = r0;
                                if (billboardRichText.templateText != null) {
                                    C03DZ.LIZJ((View) this.LIZLLL.getValue());
                                    TuxTextView tuxTextViewLIZJ = LIZJ(i);
                                    ?? r15 = tuxTextViewLIZJ;
                                    if (tuxTextViewLIZJ == null) {
                                        TuxTextView tuxTextView = new TuxTextView(this.LIZ.getContext(), spannableStringBuilder, 6, r0);
                                        int iGenerateViewId = View.generateViewId();
                                        ((ArrayList) this.LJFF).add(Integer.valueOf(iGenerateViewId));
                                        tuxTextView.setId(iGenerateViewId);
                                        tuxTextView.setGravity(17);
                                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                        layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                                        C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 16);
                                        C786410Ut5.R6(tuxTextView, layoutParams);
                                        C1723530ux5.LJ(tuxTextView, new ColorEntity(spannableStringBuilder, "#FFFFFFFF", "#FFFFFFFF"), 124);
                                        ((ViewGroup) this.LIZLLL.getValue()).addView(tuxTextView);
                                        r15 = tuxTextView;
                                    }
                                    BillboardRichText billboardRichText2 = templateFieldPromotionInfo3.richText;
                                    Map<String, BillboardText> map = billboardRichText2.arguments;
                                    if (map != null && !map.isEmpty()) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z) {
                                        r15.setText(billboardRichText2.templateText);
                                        r15.setTuxFont(23);
                                        r15.setTextColorRes(R.attr.a1h);
                                        r02 = r0;
                                    } else {
                                        Context context = r15.getContext();
                                        String str = billboardRichText2.templateText;
                                        if (str != null && str.length() != 0) {
                                            spannableStringBuilder = new SpannableStringBuilder(billboardRichText2.templateText);
                                            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(23, r0), r0, spannableStringBuilder.length(), 17);
                                            C786410Ut5.q2(spannableStringBuilder, new C434230H0z(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), r0, spannableStringBuilder.length(), 17);
                                            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context)) != null) {
                                                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), r0, spannableStringBuilder.length(), 17);
                                            }
                                            Map<String, BillboardText> map2 = billboardRichText2.arguments;
                                            if (map2 != null) {
                                                for (String str2 : map2.keySet()) {
                                                    final BillboardText billboardText = map2.get(str2);
                                                    if (billboardText != null) {
                                                        String str3 = billboardText.text;
                                                        if (str3 == null) {
                                                            str3 = "";
                                                        }
                                                        int length = 0;
                                                        r0 = r0;
                                                        while (true) {
                                                            int iLJJJ = a0.LJJJ(spannableStringBuilder, str2, length, r0, 4);
                                                            if (iLJJJ > -1) {
                                                                length = str2.length() + iLJJJ;
                                                                if (length <= spannableStringBuilder.length() && iLJJJ < length) {
                                                                    spannableStringBuilder.replace(iLJJJ, length, str3);
                                                                    length = str3.length() + iLJJJ;
                                                                    if (iLJJJ < length) {
                                                                        C786410Ut5.q2(spannableStringBuilder, new UnderlineSpan() { // from class: com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.BillboardUIUtil$replaceSpan$1
                                                                            @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
                                                                            public final void updateDrawState(TextPaint textPaint) {
                                                                                textPaint.setColor(ColorProtector.parseColor(billboardText.color));
                                                                            }
                                                                        }, iLJJJ, length, 17);
                                                                    }
                                                                }
                                                                r0 = 0;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        r15.setText(spannableStringBuilder);
                                        r02 = r0;
                                    }
                                    C03DZ.LIZJ(r15);
                                    r03 = r02;
                                }
                            }
                        }
                    }
                }
                if (i == size) {
                    break;
                }
                i++;
                spannableStringBuilder = 0;
                r0 = r03;
            }
        }
        int i2 = size + 1;
        if (i2 > iLJ) {
            return;
        }
        while (true) {
            TuxTextView tuxTextViewLIZJ2 = LIZJ(i2);
            if (tuxTextViewLIZJ2 != null) {
                C03DZ.LIZ(tuxTextViewLIZJ2);
            }
            if (i2 != iLJ) {
                i2++;
            } else {
                return;
            }
        }
    }
}
