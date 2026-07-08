package X;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.live.OecLivePreviewRoomData;
import com.ss.android.ugc.aweme.feed.model.live.PreviewBenefitPoint;
import com.ss.android.ugc.aweme.feed.model.live.PreviewPromotionInfo;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0cEO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003900cEO implements InterfaceC999030c6X {
    public ViewGroup LIZ;

    public static void LIZIZ(PreviewBenefitPoint previewBenefitPoint, SpannableString spannableString) {
        Integer numLIZ;
        int length;
        String str = previewBenefitPoint.textColor;
        if (str != null && (numLIZ = C104300aP.LIZ(str)) != null) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(numLIZ.intValue());
            String str2 = previewBenefitPoint.text;
            if (str2 != null) {
                length = str2.length();
            } else {
                length = 0;
            }
            C786410Ut5.p2(spannableString, foregroundColorSpan, 0, length, 18);
        }
    }

    public static void LIZJ(View view, OecLivePreviewRoomData oecLivePreviewRoomData) {
        TuxTextView tuxTextView;
        PreviewPromotionInfo previewPromotionInfo;
        PreviewBenefitPoint previewBenefitPoint;
        Integer numLIZ;
        if (view != null && (tuxTextView = (TuxTextView) view.findViewById(R.id.gly)) != null) {
            if (oecLivePreviewRoomData != null && (previewPromotionInfo = oecLivePreviewRoomData.previewPromotionInfo) != null && (previewBenefitPoint = previewPromotionInfo.firstLine) != null) {
                Integer num = previewBenefitPoint.textFont;
                if (num != null) {
                    int iIntValue = num.intValue();
                    InterfaceC1003930cER.LJIILIIL.getClass();
                    tuxTextView.setTuxFont(C1003920cEQ.LIZ(iIntValue));
                }
                String str = previewBenefitPoint.textColor;
                if (str != null && (numLIZ = C104300aP.LIZ(str)) != null) {
                    tuxTextView.setTextColor(numLIZ.intValue());
                }
                tuxTextView.setText(previewBenefitPoint.text);
                tuxTextView.setMinTextSize(14.0f);
                C337180DJs.LIZJ(tuxTextView);
            } else {
                C337180DJs.LIZ(tuxTextView);
            }
            C423280Gik.LIZ(tuxTextView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0256 A[Catch: Exception -> 0x02ab, TryCatch #0 {Exception -> 0x02ab, blocks: (B:137:0x0248, B:139:0x0256, B:141:0x025a, B:143:0x025e, B:146:0x0263, B:148:0x02a6), top: B:242:0x0248 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a6 A[Catch: Exception -> 0x02ab, TRY_LEAVE, TryCatch #0 {Exception -> 0x02ab, blocks: (B:137:0x0248, B:139:0x0256, B:141:0x025a, B:143:0x025e, B:146:0x0263, B:148:0x02a6), top: B:242:0x0248 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0139 A[PHI: r11 r12 r13
      0x0139: PHI (r11v14 com.ss.android.ugc.aweme.feed.model.live.PreviewBenefitPoint) = 
      (r11v10 com.ss.android.ugc.aweme.feed.model.live.PreviewBenefitPoint)
      (r11v15 com.ss.android.ugc.aweme.feed.model.live.PreviewBenefitPoint)
     binds: [B:93:0x017a, B:62:0x0135] A[DONT_GENERATE, DONT_INLINE]
      0x0139: PHI (r12v8 int) = (r12v4 int), (r12v9 int) binds: [B:93:0x017a, B:62:0x0135] A[DONT_GENERATE, DONT_INLINE]
      0x0139: PHI (r13v12 com.ss.android.ugc.aweme.feed.model.live.ProductImage) = 
      (r13v8 com.ss.android.ugc.aweme.feed.model.live.ProductImage)
      (r13v13 com.ss.android.ugc.aweme.feed.model.live.ProductImage)
     binds: [B:93:0x017a, B:62:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173 A[PHI: r14
      0x0173: PHI (r14v9 int) = (r14v8 int), (r14v14 int), (r14v14 int) binds: [B:86:0x0170, B:80:0x0161, B:82:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017d A[PHI: r11 r12 r13
      0x017d: PHI (r11v11 com.ss.android.ugc.aweme.feed.model.live.PreviewBenefitPoint) = 
      (r11v10 com.ss.android.ugc.aweme.feed.model.live.PreviewBenefitPoint)
      (r11v14 com.ss.android.ugc.aweme.feed.model.live.PreviewBenefitPoint)
     binds: [B:93:0x017a, B:64:0x013b] A[DONT_GENERATE, DONT_INLINE]
      0x017d: PHI (r12v5 int) = (r12v4 int), (r12v8 int) binds: [B:93:0x017a, B:64:0x013b] A[DONT_GENERATE, DONT_INLINE]
      0x017d: PHI (r13v9 com.ss.android.ugc.aweme.feed.model.live.ProductImage) = 
      (r13v8 com.ss.android.ugc.aweme.feed.model.live.ProductImage)
      (r13v12 com.ss.android.ugc.aweme.feed.model.live.ProductImage)
     binds: [B:93:0x017a, B:64:0x013b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0186  */
    @Override // X.InterfaceC999030c6X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.widget.FrameLayout r18, com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r19) {
        /*
            Method dump skipped, instruction units count: 1155
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1003900cEO.LIZ(android.widget.FrameLayout, com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct):void");
    }
}
