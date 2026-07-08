package X;

import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.BoardItemPosition;
import com.bytedance.android.livesdk.model.BoardItemTransform;
import com.bytedance.android.livesdk.model.Paragraph;
import com.bytedance.android.livesdk.model.RichTextContent;
import com.bytedance.android.livesdk.model.RichTextStyle;

/* JADX INFO: renamed from: X.00Ga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C049800Ga {
    public static BoardItem LIZIZ() {
        BoardItem boardItem = new BoardItem();
        boardItem.boardItemType = 5;
        RichTextContent richTextContent = new RichTextContent();
        RichTextStyle richTextStyle = new RichTextStyle();
        richTextStyle.type = 3;
        richTextStyle.name = "single_paragraph_item_style";
        LIZ(richTextStyle);
        richTextContent.styles = C1697810uHb.LJIILJJIL(richTextStyle);
        richTextContent.paragraphs = C1697810uHb.LJIILJJIL(new Paragraph());
        richTextContent.itemStyleRef = "single_paragraph_item_style";
        boardItem.richTextContent = richTextContent;
        BoardItemPosition boardItemPosition = new BoardItemPosition();
        boardItemPosition.percentageX = 50L;
        boardItemPosition.percentageY = 50L;
        boardItem.canvasPosition = boardItemPosition;
        BoardItemTransform boardItemTransform = new BoardItemTransform();
        boardItemTransform.scale = 1.0f;
        boardItem.transform = boardItemTransform;
        return boardItem;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.bytedance.android.livesdk.model.RichTextStyle r6) {
        /*
            int r0 = r6.fontSize
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            r5 = 0
            r3 = 1
            if (r0 == 0) goto Lbb
            r0 = 1
        Lf:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb7
            int r0 = r1.intValue()
        L1d:
            r6.fontSize = r0
            float r0 = r6.lineSpacing
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            float r0 = r2.floatValue()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb4
            r0 = 1
        L2f:
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb2
            float r0 = r2.floatValue()
        L3f:
            r6.lineSpacing = r0
            com.bytedance.android.livesdk.model.FlowSpec r4 = r6.flowSpec
            if (r4 != 0) goto L4a
            com.bytedance.android.livesdk.model.FlowSpec r4 = new com.bytedance.android.livesdk.model.FlowSpec
            r4.<init>()
        L4a:
            com.bytedance.android.livesdk.model.SizeSpec r2 = r4.width
            if (r2 == 0) goto L9d
            com.bytedance.android.livesdk.model.MeasureSpec r0 = r2.maxSize
            if (r0 == 0) goto L9b
            float r0 = r0.value
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L9b
        L58:
            r6.flowSpec = r4
            int r0 = r6.textStyle
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r1 = r2.intValue()
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 == r0) goto L99
            r0 = 1
        L69:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L97
            int r0 = r2.intValue()
        L77:
            r6.textStyle = r0
            int r0 = r6.contentAlignX
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 == 0) goto L86
            r5 = 1
        L86:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L94
            int r3 = r1.intValue()
        L94:
            r6.contentAlignX = r3
            return
        L97:
            r0 = 0
            goto L77
        L99:
            r0 = 0
            goto L69
        L9b:
            if (r2 != 0) goto La2
        L9d:
            com.bytedance.android.livesdk.model.SizeSpec r2 = new com.bytedance.android.livesdk.model.SizeSpec
            r2.<init>()
        La2:
            com.bytedance.android.livesdk.model.MeasureSpec r1 = new com.bytedance.android.livesdk.model.MeasureSpec
            r1.<init>()
            r1.mode = r3
            r0 = 1117782016(0x42a00000, float:80.0)
            r1.value = r0
            r2.maxSize = r1
            r4.width = r2
            goto L58
        Lb2:
            r0 = 0
            goto L3f
        Lb4:
            r0 = 0
            goto L2f
        Lb7:
            r0 = 24
            goto L1d
        Lbb:
            r0 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C049800Ga.LIZ(com.bytedance.android.livesdk.model.RichTextStyle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01c9 A[PHI: r4
      0x01c9: PHI (r4v18 java.lang.Float) = (r4v17 java.lang.Float), (r4v20 java.lang.Float) binds: [B:95:0x01ad, B:100:0x01c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0232 A[PHI: r3
      0x0232: PHI (r3v15 java.lang.String) = (r3v10 java.lang.String), (r3v8 java.lang.String) binds: [B:37:0x00a8, B:32:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[PHI: r3
      0x004b: PHI (r3v1 java.lang.Integer) = (r3v0 java.lang.Integer), (r3v18 java.lang.Integer) binds: [B:10:0x002c, B:19:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec A[PHI: r4
      0x00ec: PHI (r4v3 java.lang.Float) = (r4v2 java.lang.Float), (r4v27 java.lang.Float) binds: [B:46:0x00d0, B:51:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0128 A[PHI: r5
      0x0128: PHI (r5v1 java.lang.Integer) = (r5v0 java.lang.Integer), (r5v4 java.lang.Integer) binds: [B:57:0x0109, B:66:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0162 A[PHI: r4
      0x0162: PHI (r4v8 java.lang.Integer) = (r4v7 java.lang.Integer), (r4v24 java.lang.Integer) binds: [B:72:0x0143, B:81:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.android.livesdk.model.RichTextStyle LIZJ(com.bytedance.android.livesdk.model.RichTextStyle r6, com.bytedance.android.livesdk.model.RichTextStyle r7) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C049800Ga.LIZJ(com.bytedance.android.livesdk.model.RichTextStyle, com.bytedance.android.livesdk.model.RichTextStyle):com.bytedance.android.livesdk.model.RichTextStyle");
    }
}
