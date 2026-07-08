package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString;
import java.util.Arrays;

/* JADX INFO: renamed from: X.1236, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1236 extends C196926122y {
    public int LJJJJL;
    public int LJJJJLI;

    @Override // X.C196926122y
    public final float LIZLLL() {
        return 20.0f;
    }

    @Override // X.C196926122y
    public final float LJIIJ(float f, float f2, int i) {
        return f + f2;
    }

    @Override // X.C196926122y
    public final int LJIIIZ() {
        Paint.FontMetrics fontMetrics = this.LJJIJ.getFontMetrics();
        return (int) (((int) (fontMetrics.descent - fontMetrics.ascent)) + this.LJJIFFI);
    }

    @Override // X.C196926122y
    public final int LJIIIIZZ() {
        return this.LJJJJLI;
    }

    @Override // X.C196926122y
    public final int LIZIZ(int i) {
        return Math.min(i, this.LJJJJLI);
    }

    @Override // X.C196926122y
    public final TextStickerString[] LIZJ(TextStickerString[] textStickerStringArr) {
        int iLJIIIZ = LJIIIZ();
        if (iLJIIIZ == 0) {
            return textStickerStringArr;
        }
        int i = this.LJJJJL / iLJIIIZ;
        if (textStickerStringArr != null) {
            int length = textStickerStringArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (C123P.LJIIIZ(this.LJJIJ, textStickerStringArr[i2].getStr(), 0, textStickerStringArr[i2].getStr().length()) > this.LJJJJLI) {
                    String str = textStickerStringArr[i2].getStr();
                    TextPaint textPaint = this.LJJIJ;
                    int length2 = str.length();
                    int i3 = 0;
                    int iLJIIIZ2 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            break;
                        }
                        int i4 = i3 + 1;
                        iLJIIIZ2 += C123P.LJIIIZ(textPaint, str, i3, i4);
                        if (iLJIIIZ2 > this.LJJJJLI) {
                            str = str.substring(0, i3);
                            break;
                        }
                        i3 = i4;
                    }
                    textStickerStringArr[i2] = new TextStickerString(str);
                }
            }
        }
        if (textStickerStringArr == null) {
            return null;
        }
        if (textStickerStringArr.length > i && i > 0) {
            return (TextStickerString[]) Arrays.copyOf(textStickerStringArr, i);
        }
        return textStickerStringArr;
    }

    @Override // X.C196926122y
    public final float LIZ(float f, TextStickerString[] textStickerStringArr) {
        int iLJIIIZ = LJIIIZ();
        if (iLJIIIZ == 0) {
            return f;
        }
        int i = (int) (((this.LJJJJL * 4) / 5.0f) / iLJIIIZ);
        if (textStickerStringArr != null && textStickerStringArr.length < i) {
            return (f * 9) / 10.0f;
        }
        return f;
    }

    @Override // X.C196926122y
    public final void LJIIJJI(C196925122x c196925122x, Context context) {
        super.LJIIJJI(c196925122x, context);
        this.LJJJJLI = (int) (C14KQ.LJIIIZ(context) - C12ES.LIZJ(96.0f, context));
    }
}
