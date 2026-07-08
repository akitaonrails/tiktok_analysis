package X;

import android.text.TextPaint;

/* JADX INFO: renamed from: X.14IP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14IP implements C14IQ {
    public static final ThreadLocal<StringBuilder> LIZIZ = new ThreadLocal<>();
    public final TextPaint LIZ;

    public C14IP() {
        TextPaint textPaint = new TextPaint();
        this.LIZ = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
