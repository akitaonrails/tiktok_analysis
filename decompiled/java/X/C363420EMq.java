package X;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLEStyText;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyle;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TypefaceStyle;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0EMq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363420EMq {
    public static final C363420EMq LIZ = new C363420EMq();

    public static int LJI(int i) {
        if (i == -8861530) {
            return -16732005;
        }
        if (i == -3559425) {
            return -4935681;
        }
        if (i == -469015) {
            return -2988141;
        }
        return i;
    }

    public static void LIZLLL(NLEStyText nLEStyText, TextStickerData textStickerData) {
        int i;
        if (nLEStyText.hasBackground() && nLEStyText.getBackground()) {
            if (Color.alpha((int) nLEStyText.getBackgroundColor()) < 255) {
                textStickerData.setBgMode(3);
                int backgroundColor = (int) nLEStyText.getBackgroundColor();
                textStickerData.setColor(Color.rgb((16711680 & backgroundColor) >> 16, (65280 & backgroundColor) >> 8, backgroundColor & 255));
            } else {
                textStickerData.setBgMode(2);
                textStickerData.setColor((int) nLEStyText.getBackgroundColor());
            }
            if (nLEStyText.getBackgroundColor() == nLEStyText.getTextColor()) {
                if (((int) nLEStyText.getBackgroundColor()) == -1) {
                    nLEStyText.setTextColor(-16777216L);
                } else {
                    nLEStyText.setTextColor(-1L);
                }
            }
            textStickerData.setColor((int) nLEStyText.getTextColor());
            return;
        }
        textStickerData.setColor((int) nLEStyText.getTextColor());
        if (nLEStyText.hasOutline() && nLEStyText.getOutline()) {
            i = 4;
        } else {
            i = 1;
        }
        textStickerData.setBgMode(i);
    }

    public static void LJ(NLEStyText nLEStyText, TextStickerData textStickerData) {
        String strLJJJJJL;
        String strLJJJJJL2;
        TextStyleModel textStyle = textStickerData.getTextStyle();
        if (textStyle != null && textStyle.isEffectStyle) {
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            nLEResourceNode.setResourceId(C0FGD.LIZ(textStyle.styleResId, textStyle.stylePanel));
            nLEStyText.setFlower(nLEResourceNode);
        }
        int color = textStickerData.getColor();
        if (color != -16732005) {
            if (color == -2988141) {
                color = -469015;
            }
        } else {
            color = -8861530;
        }
        int i = 2;
        if (textStickerData.getBgMode() != 2 && textStickerData.getBgMode() != 3) {
            nLEStyText.setTextColor(color);
        } else {
            nLEStyText.setBackground(true);
        }
        if (textStickerData.getBgMode() == 2) {
            nLEStyText.setBackgroundColor(color);
            if (textStickerData.getColor() == -1) {
                nLEStyText.setTextColor(-16777216L);
            } else {
                nLEStyText.setTextColor(-1L);
            }
        } else if (textStickerData.getBgMode() == 3) {
            nLEStyText.setBackgroundColor(C0F9I.LIZJ(color, color));
            nLEStyText.setTextColor(-1L);
        }
        if (textStickerData.getBgMode() == 4) {
            nLEStyText.setOutline(true);
            nLEStyText.setOutlineColor(C0F9I.LJI(4, textStickerData.getColor()).getSecond().intValue());
            nLEStyText.setOutlineWidth(0.14285715f);
        } else {
            nLEStyText.setOutline(false);
        }
        int align = textStickerData.getAlign();
        if (align != 1) {
            if (align != 3) {
                i = 1;
            }
        } else {
            i = 0;
        }
        nLEStyText.setAlignType(i);
        int fontSize = textStickerData.getFontSize();
        nLEStyText.setFontSize((C814420VxA.LIZIZ(C418440Gaw.LJ(Integer.valueOf(fontSize))) * 72) / DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        nLEStyText.setExtra("biz_font_size_in_adapt", String.valueOf(((C418440Gaw.LJ(Integer.valueOf(fontSize)) * 72.0f) / DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL) * (720.0f / textStickerData.getVideoWidth())));
        nLEStyText.setFont(new NLEResourceNode());
        if (C123100dR.LIZ(textStickerData.getFontResId())) {
            String fontPanel = textStickerData.getFontPanel();
            if (fontPanel != null && fontPanel.length() != 0) {
                strLJJJJJL2 = textStickerData.getFontPanel();
            } else {
                strLJJJJJL2 = EffectPlatform.LJJJJJL();
            }
            nLEStyText.getFont().setResourceId(C0FGD.LIZ(textStickerData.getFontResId(), strLJJJJJL2));
            nLEStyText.getFont().setExtra("biz_res_id", nLEStyText.getFont().getResourceId());
        }
        if (!textStickerData.getInlineTextStyles().isEmpty()) {
            List<InlineRichTextStyleData> inlineTextStyles = textStickerData.getInlineTextStyles();
            ArrayList arrayList = new ArrayList();
            for (InlineRichTextStyleData inlineRichTextStyleData : inlineTextStyles) {
                if (inlineRichTextStyleData.inlineStyle instanceof TypefaceStyle) {
                    arrayList.add(inlineRichTextStyleData);
                }
            }
            ArrayList<InlineRichTextStyle> arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((InlineRichTextStyleData) it2.next()).inlineStyle);
            }
            for (InlineRichTextStyle inlineRichTextStyle : arrayList2) {
                String fontPanel2 = textStickerData.getFontPanel();
                if (fontPanel2 != null && fontPanel2.length() != 0) {
                    strLJJJJJL = textStickerData.getFontPanel();
                } else {
                    strLJJJJJL = EffectPlatform.LJJJJJL();
                }
                ((TypefaceStyle) inlineRichTextStyle).fontResId = C0FGD.LIZ(textStickerData.getFontResId(), strLJJJJJL);
            }
            nLEStyText.setExtra("biz_inline_text_style", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), textStickerData.getInlineTextStyles()));
        }
        if (!C0F9I.LIZ.contains(Integer.valueOf(color))) {
            nLEStyText.supportMoreColor(true);
        }
    }

    public static Long LJFF(String str, NLENode nLENode) {
        Long lValueOf = null;
        if (nLENode.getExtra(str) == null) {
            return null;
        }
        try {
            lValueOf = Long.valueOf(CastLongProtector.parseLong(nLENode.getExtra(str)));
            return lValueOf;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return lValueOf;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f A[PHI: r3
      0x005f: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v7 java.lang.String), (r3v7 java.lang.String) binds: [B:33:0x005c, B:10:0x0017, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c4 A[PHI: r8
      0x00c4: PHI (r8v2 java.lang.String) = (r8v0 java.lang.String), (r8v3 java.lang.String) binds: [B:62:0x00c2, B:60:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00df A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r15, com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker r16, X.C389400FOo r17, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r18) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363420EMq.LIZ(com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData, com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker, X.0FOo, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):void");
    }

    public static void LIZIZ(TextStickerData textStickerData, NLEStyText nLEStyText, Context context, boolean z, boolean z2) {
        int i;
        int i2 = 1;
        if (nLEStyText.hasBackground() && nLEStyText.getBackground()) {
            if (Color.alpha((int) nLEStyText.getBackgroundColor()) < 255) {
                textStickerData.setBgMode(3);
                int backgroundColor = (int) nLEStyText.getBackgroundColor();
                textStickerData.setColor(LJI(Color.rgb((16711680 & backgroundColor) >> 16, (65280 & backgroundColor) >> 8, backgroundColor & 255)));
            } else {
                textStickerData.setBgMode(2);
                textStickerData.setColor(LJI((int) nLEStyText.getBackgroundColor()));
            }
        } else {
            textStickerData.setColor(LJI((int) nLEStyText.getTextColor()));
            if (nLEStyText.hasOutline() && nLEStyText.getOutline()) {
                i = 4;
            } else {
                i = 1;
            }
            textStickerData.setBgMode(i);
        }
        int alignType = nLEStyText.getAlignType();
        if (alignType != 0) {
            if (alignType != 2) {
                i2 = 2;
            } else {
                i2 = 3;
            }
        }
        textStickerData.setAlign(i2);
        Long lLJFF = LJFF("biz_font_size_in_pt", nLEStyText);
        if (lLJFF != null) {
            textStickerData.setFontSize((int) ((lLJFF.longValue() * ((long) DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)) / ((long) (C814420VxA.LIZIZ(C418440Gaw.LJ(1)) * 72))));
        } else if (z) {
            textStickerData.setFontSize((int) ((nLEStyText.getFontSize() * ((long) DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)) / ((long) (C814420VxA.LIZIZ(C418440Gaw.LJ(1)) * 72))));
        } else if (z2) {
            textStickerData.setFontSize((int) nLEStyText.getFontSize());
        } else {
            textStickerData.setFontSize((int) ((nLEStyText.getFontSize() * ((long) DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)) / ((long) 72)));
        }
        if (textStickerData.getFontSize() <= 0) {
            textStickerData.setFontSize(28);
        }
        int screenWidth = ScreenUtils.getScreenWidth(context);
        String extra = nLEStyText.getExtra("biz_font_size_in_adapt");
        if (C123100dR.LIZ(extra)) {
            try {
                textStickerData.setFontSize(C814420VxA.LIZIZ(((((CastFloatProtector.parseFloat(extra) * DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL) / 72.0f) / 720.0f) * screenWidth) / C418440Gaw.LJ(1)));
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                textStickerData.setFontSize(28);
            }
        }
    }
}
