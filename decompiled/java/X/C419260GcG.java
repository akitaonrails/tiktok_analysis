package X;

import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0GcG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419260GcG extends LinearLayout {
    public final TuxTextView LL;
    public final TuxTextView LLILLJJLI;

    public final void setCurrentNum(int i) {
        if (i == 0) {
            C786410Ut5.M0(this, 8);
        } else {
            C786410Ut5.M0(this, 0);
            this.LL.setText(String.valueOf(i));
        }
    }

    public final void setTotalNum(int i) {
        if (i <= 1) {
            C786410Ut5.M0(this, 8);
        } else {
            C786410Ut5.M0(this, 0);
        }
        this.LLILLJJLI.setText(String.valueOf(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095 A[PHI: r8
      0x0095: PHI (r8v1 int) = (r8v0 int), (r8v3 int) binds: [B:13:0x0092, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C419260GcG(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r9 = 0
            r12.<init>(r13, r14, r9)
            r10 = 17
            r12.setGravity(r10)
            r12.setOrientation(r9)
            if (r13 == 0) goto L91
            r0 = 2131099668(0x7f060014, float:1.7811696E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r13)
            if (r0 == 0) goto L91
            int r8 = r0.intValue()
        L1b:
            r0 = 2131099768(0x7f060078, float:1.7811899E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r13)
            if (r0 == 0) goto L95
            int r11 = r0.intValue()
        L28:
            com.bytedance.tux.input.TuxTextView r1 = new com.bytedance.tux.input.TuxTextView
            android.content.Context r0 = r12.getContext()
            r7 = 0
            r6 = 6
            r1.<init>(r0, r7, r6, r9)
            r5 = 71
            r1.setTuxFont(r5)
            r1.setGravity(r10)
            r1.setTextColor(r11)
            r4 = 1094713344(0x41400000, float:12.0)
            r1.setTextSize(r4)
            java.lang.String r0 = "1"
            r1.setText(r0)
            r3 = 1073741824(0x40000000, float:2.0)
            r2 = 0
            r1.setShadowLayer(r3, r2, r3, r8)
            r12.LL = r1
            r12.addView(r1)
            com.bytedance.tux.input.TuxTextView r1 = new com.bytedance.tux.input.TuxTextView
            android.content.Context r0 = r12.getContext()
            r1.<init>(r0, r7, r6, r9)
            r1.setTuxFont(r5)
            r1.setGravity(r10)
            r1.setTextColor(r11)
            r1.setTextSize(r4)
            java.lang.String r0 = " / "
            r1.setText(r0)
            r1.setShadowLayer(r3, r2, r3, r8)
            r12.addView(r1)
            com.bytedance.tux.input.TuxTextView r1 = new com.bytedance.tux.input.TuxTextView
            android.content.Context r0 = r12.getContext()
            r1.<init>(r0, r7, r6, r9)
            r1.setTuxFont(r5)
            r1.setGravity(r10)
            r1.setTextColor(r11)
            r1.setTextSize(r4)
            r1.setShadowLayer(r3, r2, r3, r8)
            r12.LLILLJJLI = r1
            r12.addView(r1)
            return
        L91:
            r8 = 0
            if (r13 == 0) goto L95
            goto L1b
        L95:
            r11 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C419260GcG.<init>(android.content.Context, android.util.AttributeSet):void");
    }
}
