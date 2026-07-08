package X;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.ss.android.vesdk.model.BefTextLayout;

/* JADX INFO: renamed from: X.19jU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21621019jU {
    public final TextPaint LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final int LJFF;
    public final float LJI;
    public int LJII;

    public C21621019jU(BefTextLayout befTextLayout) {
        this.LIZIZ = befTextLayout.getLineWidth();
        this.LIZJ = befTextLayout.getLineCount();
        this.LJI = befTextLayout.getLineHeight();
        this.LIZLLL = befTextLayout.getSplit();
        this.LJFF = befTextLayout.getCharSize();
        this.LJ = befTextLayout.getBackColor();
        long textColor = befTextLayout.getTextColor();
        String familyName = befTextLayout.getFamilyName();
        TextPaint textPaint = new TextPaint();
        this.LIZ = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(befTextLayout.getCharSize());
        textPaint.setTypeface(Typeface.create(familyName, 0));
        int i = (int) textColor;
        textPaint.setColor(((i << 24) & (-16777216)) | ((i >> 8) & 16777215));
        textPaint.setLetterSpacing(befTextLayout.getLetterSpacing());
        textPaint.setTextAlign(Paint.Align.LEFT);
    }
}
