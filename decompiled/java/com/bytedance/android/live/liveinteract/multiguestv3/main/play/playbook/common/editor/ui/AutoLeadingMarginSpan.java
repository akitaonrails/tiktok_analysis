package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.ui;

import X.C497740JfY;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes7.dex */
public final class AutoLeadingMarginSpan extends LeadingMarginSpan.Standard {
    public static final int $stable = 8;

    @Override // android.text.style.LeadingMarginSpan.Standard, android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (z && C497740JfY.LJJ()) {
            int width = layout.getWidth();
            canvas.save();
            canvas.clipRect(0, i3, width - getLeadingMargin(true), i5);
            canvas.restore();
            return;
        }
        super.drawLeadingMargin(canvas, paint, i, i2, i3, i4, i5, charSequence, i6, i7, z, layout);
    }
}
