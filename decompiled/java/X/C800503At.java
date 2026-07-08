package X;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.03At, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C800503At extends LinearLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public C03B0 LLIZ;
    public CountDownTimer LLIZLLLIL;

    private final SmartImageView getOspPromotionBannerIconFromXml() {
        return (SmartImageView) this.LLILLL.getValue();
    }

    private final TuxIconView getPromotionBannerChevron() {
        return (TuxIconView) this.LLILZ.getValue();
    }

    private final TuxIconView getPromotionBannerDismissButton() {
        return (TuxIconView) this.LLILZLL.getValue();
    }

    private final LinearLayout getPromotionBannerLayout() {
        return (LinearLayout) this.LLILLJJLI.getValue();
    }

    private final TuxTextView getPromotionTextView() {
        return (TuxTextView) this.LL.getValue();
    }

    public final TuxTextView getPromotionCountdownTextView() {
        return (TuxTextView) this.LLILZIL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CountDownTimer countDownTimer = this.LLIZLLLIL;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        C03B0 c03b0 = this.LLIZ;
        if (c03b0 != null) {
            CountDownTimer countDownTimer2 = c03b0.LIZLLL;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
            }
            c03b0.LIZLLL = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setPromotionBannerStyle(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionBanner r4) {
        /*
            r3 = this;
            android.content.Context r2 = r3.getContext()
            if (r2 == 0) goto L28
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BannerStyle r0 = r4.style
            if (r0 == 0) goto L35
            int[] r1 = X.C800603Au.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L31
            r0 = 2
            if (r1 == r0) goto L2d
            r0 = 3
            if (r1 == r0) goto L29
            r0 = 4
            if (r1 != r0) goto L35
            r0 = 2130970685(0x7f04083d, float:1.7550087E38)
        L21:
            android.graphics.drawable.Drawable r0 = X.C800703Av.LIZ(r0, r2)
            r3.setBackground(r0)
        L28:
            return
        L29:
            r0 = 2130970682(0x7f04083a, float:1.7550081E38)
            goto L21
        L2d:
            r0 = 2130970684(0x7f04083c, float:1.7550085E38)
            goto L21
        L31:
            r0 = 2130970683(0x7f04083b, float:1.7550083E38)
            goto L21
        L35:
            r0 = 2130970710(0x7f040856, float:1.7550138E38)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C800503At.setPromotionBannerStyle(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionBanner):void");
    }

    public C800503At(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1620));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1618));
        this.LLILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1615));
        this.LLILZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1616));
        this.LLILZIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1619));
        this.LLILZLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1617));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b29, this, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fa A[PHI: r6 r14
      0x01fa: PHI (r6v3 ??) = (r6v6 ??), (r6v7 ??) binds: [B:57:0x00e2, B:55:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r14v6 java.util.Map) = (r14v10 java.util.Map), (r14v11 java.util.Map) binds: [B:57:0x00e2, B:55:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0227 A[PHI: r14
      0x0227: PHI (r14v1 java.util.Map) = (r14v9 java.util.Map), (r14v21 java.util.Map) binds: [B:49:0x00d1, B:51:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0162  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v52, types: [X.03Ap] */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(final X.C720002rW r27, final com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r28) {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C800503At.LIZ(X.02rW, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel):void");
    }
}
