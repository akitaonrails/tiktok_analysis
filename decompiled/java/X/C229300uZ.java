package X;

import android.text.Spannable;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.RichTextStyleEditViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.title.CustomizedBoardTitleDoneAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.title.CustomizedBoardTitleDoneViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting.LiveBoardItemMaxInputWordSetting;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.ColorBackground;
import com.bytedance.android.livesdk.model.EdgeInsets;
import com.bytedance.android.livesdk.model.FlowSpec;
import com.bytedance.android.livesdk.model.Paragraph;
import com.bytedance.android.livesdk.model.RichTextContent;
import com.bytedance.android.livesdk.model.RichTextStyle;
import com.bytedance.android.livesdk.model.StrokeStyle;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00uZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C229300uZ extends C09AY implements Function1<C2880019q, Unit> {
    public final /* synthetic */ CustomizedBoardTitleDoneAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C229300uZ(CustomizedBoardTitleDoneAssem customizedBoardTitleDoneAssem) {
        super(1);
        this.LL = customizedBoardTitleDoneAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C2880019q c2880019q) {
        RichTextStyle richTextStyle;
        String str;
        long j;
        long value;
        boolean z;
        int i;
        FlowSpec flowSpec;
        int i2;
        int i3;
        String str2;
        StrokeStyle strokeStyle;
        EdgeInsets edgeInsets;
        ColorBackground colorBackground;
        float f;
        ColorBackground colorBackground2;
        String str3;
        AssemVMLazy assemVMLazy = this.LL.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CustomizedBoardTitleDoneAssem.LLJJIII;
        RichTextStyleEditViewModel richTextStyleEditViewModel = (RichTextStyleEditViewModel) assemVMLazy.getValue();
        C229200uY c229200uY = richTextStyleEditViewModel.getState().LLILLJJLI.LIZ;
        RichTextContent richTextContent = null;
        ColorBackground colorBackground3 = null;
        if (c229200uY != null) {
            Spannable spannable = ((C01DP) richTextStyleEditViewModel.LL.getValue()).LLILLJJLI;
            C229100uX c229100uX = (C229100uX) C13LP.LJJJLZIJ(0, c229200uY.LIZ);
            if (c229100uX != null) {
                richTextStyle = c229100uX.LJ;
            } else {
                richTextStyle = null;
            }
            RichTextStyle richTextStyle2 = c229200uY.LIZIZ;
            if (richTextStyle2 != null) {
                str = richTextStyle2.name;
            } else {
                str = null;
            }
            String str4 = "";
            if (!(!Intrinsics.LJFF(str, "")) || str == null) {
                if (richTextStyle != null) {
                    str = richTextStyle.name;
                } else {
                    str = null;
                }
                if (!(!Intrinsics.LJFF(str, "")) || str == null) {
                    str = "main_item_style";
                }
            }
            Paragraph paragraph = new Paragraph();
            if (c229100uX != null) {
                j = c229100uX.LIZ;
            } else {
                j = 0;
            }
            paragraph.paragraphId = j;
            if (c229100uX != null) {
                value = c229100uX.LIZJ;
            } else {
                value = LiveBoardItemMaxInputWordSetting.INSTANCE.getValue();
            }
            paragraph.maxCharLimit = value;
            Paragraph.TextSpan textSpan = new Paragraph.TextSpan();
            textSpan.text = spannable.toString();
            paragraph.spans = C1697810uHb.LJIILJJIL(textSpan);
            if (c229100uX != null) {
                z = c229100uX.LIZLLL;
            } else {
                z = true;
            }
            paragraph.editable = z;
            RichTextStyle richTextStyle3 = new RichTextStyle();
            richTextStyle3.name = str;
            richTextStyle3.type = 3;
            if (richTextStyle != null) {
                i = richTextStyle.contentAlignX;
            } else {
                RichTextStyle richTextStyle4 = c229200uY.LIZIZ;
                if (richTextStyle4 != null) {
                    i = richTextStyle4.contentAlignX;
                } else {
                    i = 1;
                }
            }
            richTextStyle3.contentAlignX = i;
            if (richTextStyle == null || (flowSpec = richTextStyle.flowSpec) == null) {
                RichTextStyle richTextStyle5 = c229200uY.LIZIZ;
                if (richTextStyle5 != null) {
                    flowSpec = richTextStyle5.flowSpec;
                } else {
                    flowSpec = null;
                }
            }
            richTextStyle3.flowSpec = flowSpec;
            if (richTextStyle != null) {
                i2 = richTextStyle.textStyle;
            } else {
                RichTextStyle richTextStyle6 = c229200uY.LIZIZ;
                if (richTextStyle6 != null) {
                    i2 = richTextStyle6.textStyle;
                } else {
                    i2 = 0;
                }
            }
            richTextStyle3.textStyle = i2;
            if (richTextStyle != null) {
                i3 = richTextStyle.fontSize;
            } else {
                RichTextStyle richTextStyle7 = c229200uY.LIZIZ;
                if (richTextStyle7 != null) {
                    i3 = richTextStyle7.fontSize;
                } else {
                    i3 = 24;
                }
            }
            richTextStyle3.fontSize = i3;
            if (richTextStyle != null && (str3 = richTextStyle.fontFamily) != null) {
                str4 = str3;
            } else {
                RichTextStyle richTextStyle8 = c229200uY.LIZIZ;
                if (richTextStyle8 != null) {
                    str4 = richTextStyle8.fontFamily;
                }
            }
            richTextStyle3.fontFamily = str4;
            if (richTextStyle == null || (str2 = richTextStyle.color) == null) {
                RichTextStyle richTextStyle9 = c229200uY.LIZIZ;
                if (richTextStyle9 != null) {
                    str2 = richTextStyle9.color;
                } else {
                    str2 = "#FFFFFFFF";
                }
            }
            richTextStyle3.color = str2;
            if (richTextStyle == null || (strokeStyle = richTextStyle.stroke) == null) {
                RichTextStyle richTextStyle10 = c229200uY.LIZIZ;
                if (richTextStyle10 != null) {
                    strokeStyle = richTextStyle10.stroke;
                } else {
                    strokeStyle = null;
                }
            }
            richTextStyle3.stroke = strokeStyle;
            if (richTextStyle == null || (edgeInsets = richTextStyle.padding) == null) {
                RichTextStyle richTextStyle11 = c229200uY.LIZIZ;
                if (richTextStyle11 != null) {
                    edgeInsets = richTextStyle11.padding;
                } else {
                    edgeInsets = null;
                }
            }
            richTextStyle3.padding = edgeInsets;
            if (richTextStyle == null || (colorBackground = richTextStyle.colorBackground) == null) {
                RichTextStyle richTextStyle12 = c229200uY.LIZIZ;
                if (richTextStyle12 != null) {
                    colorBackground = richTextStyle12.colorBackground;
                } else {
                    colorBackground = null;
                }
            }
            richTextStyle3.colorBackground = colorBackground;
            if (richTextStyle != null && (colorBackground2 = richTextStyle.inlineBackground) != null) {
                colorBackground3 = colorBackground2;
            } else {
                RichTextStyle richTextStyle13 = c229200uY.LIZIZ;
                if (richTextStyle13 != null) {
                    colorBackground3 = richTextStyle13.inlineBackground;
                }
            }
            richTextStyle3.inlineBackground = colorBackground3;
            if (richTextStyle != null) {
                f = richTextStyle.lineSpacing;
            } else {
                RichTextStyle richTextStyle14 = c229200uY.LIZIZ;
                if (richTextStyle14 != null) {
                    f = richTextStyle14.lineSpacing;
                } else {
                    f = 0.0f;
                }
            }
            richTextStyle3.lineSpacing = f;
            richTextContent = new RichTextContent();
            richTextContent.styles = C1697810uHb.LJIILJJIL(richTextStyle3);
            richTextContent.paragraphs = C1697810uHb.LJIILJJIL(paragraph);
            richTextContent.itemStyleRef = str;
        }
        ((BoardItem) richTextStyleEditViewModel.LLILLL.getValue()).richTextContent = richTextContent;
        CustomizedBoardTitleDoneViewModel customizedBoardTitleDoneViewModelJo = this.LL.Jo();
        customizedBoardTitleDoneViewModelJo.withState(new C1817360xOQ(customizedBoardTitleDoneViewModelJo));
        return Unit.LIZ;
    }
}
