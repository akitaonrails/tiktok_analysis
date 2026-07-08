package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0S9g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C716660S9g extends LinearLayout {
    public final TuxTextView LL;
    public final TuxTextView LLILLJJLI;
    public boolean LLILLL;

    public C716660S9g(Context context) {
        this(context, null, 0);
    }

    public final void setCurrentNum(int i) {
        this.LL.setText(String.valueOf(i));
    }

    public final void setHolderSelected(boolean z) {
        this.LLILLL = z;
    }

    public final void setTotalNum(int i) {
        this.LLILLJJLI.setText(String.valueOf(i));
    }

    public C716660S9g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (C07HB.LIZ()) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            C1440005kM.LIZ(new C2037407yW(z, this.LLILLL));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0097 A[PHI: r10
      0x0097: PHI (r10v1 int) = (r10v0 int), (r10v3 int) binds: [B:13:0x0094, B:8:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C716660S9g(android.content.Context r15, android.util.AttributeSet r16, int r17) {
        /*
            r14 = this;
            r12 = 0
            r0 = r16
            r14.<init>(r15, r0, r12)
            r11 = 17
            r14.setGravity(r11)
            r14.setOrientation(r12)
            if (r15 == 0) goto L93
            r0 = 2131099668(0x7f060014, float:1.7811696E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r15)
            if (r0 == 0) goto L93
            int r10 = r0.intValue()
        L1d:
            r0 = 2131100549(0x7f060385, float:1.7813483E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r15)
            if (r0 == 0) goto L97
            int r13 = r0.intValue()
        L2a:
            com.bytedance.tux.input.TuxTextView r9 = new com.bytedance.tux.input.TuxTextView
            android.content.Context r0 = r14.getContext()
            r8 = 0
            r7 = 6
            r9.<init>(r0, r8, r7, r12)
            r6 = 71
            r9.setTuxFont(r6)
            r9.setGravity(r11)
            r9.setTextColor(r13)
            r5 = 1094713344(0x41400000, float:12.0)
            r9.setTextSize(r5)
            java.lang.String r0 = "1"
            r9.setText(r0)
            r4 = 1073741824(0x40000000, float:2.0)
            r3 = 0
            r9.setShadowLayer(r4, r3, r4, r10)
            r14.LL = r9
            com.bytedance.tux.input.TuxTextView r2 = new com.bytedance.tux.input.TuxTextView
            android.content.Context r0 = r14.getContext()
            r2.<init>(r0, r8, r7, r12)
            r2.setTuxFont(r6)
            r2.setGravity(r11)
            r2.setTextColor(r13)
            r2.setTextSize(r5)
            java.lang.String r0 = " / "
            r2.setText(r0)
            r2.setShadowLayer(r4, r3, r4, r10)
            com.bytedance.tux.input.TuxTextView r1 = new com.bytedance.tux.input.TuxTextView
            android.content.Context r0 = r14.getContext()
            r1.<init>(r0, r8, r7, r12)
            r1.setTuxFont(r6)
            r1.setGravity(r11)
            r1.setTextColor(r13)
            r1.setTextSize(r5)
            r1.setShadowLayer(r4, r3, r4, r10)
            r14.LLILLJJLI = r1
            r14.addView(r9)
            r14.addView(r2)
            r14.addView(r1)
            return
        L93:
            r10 = 0
            if (r15 == 0) goto L97
            goto L1d
        L97:
            r13 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C716660S9g.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
