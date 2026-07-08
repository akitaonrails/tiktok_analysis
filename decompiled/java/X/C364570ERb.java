package X;

import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Size;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.NLETextRichContent;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ERb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364570ERb {
    public Pair<String, Size> LIZJ;
    public final int LIZ = C1919207fS.LIZ();
    public final TextPaint LIZIZ = new TextPaint();
    public final float LIZLLL = C418440Gaw.LIZIZ(28);

    public final Size LIZ(NLETextRichContent nLETextRichContent, Float f, float f2, float f3, boolean z) {
        String str;
        String second;
        float f4;
        if (f != null) {
            float fMax = 0.0f;
            if (f.floatValue() > 0.0f) {
                C385070F7x c385070F7x = nLETextRichContent.richTextData;
                if (c385070F7x != null && (str = c385070F7x.textStr) != null) {
                    Pair<String, String> pair = c385070F7x.font;
                    if (pair != null && (second = pair.getSecond()) != null) {
                        if (z) {
                            f4 = 0.0f;
                        } else {
                            f4 = nLETextRichContent.letterSpacing;
                        }
                        float f5 = nLETextRichContent.lineSpacing;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append(second);
                        sbLIZ.append(f4);
                        sbLIZ.append(f5);
                        sbLIZ.append(f2);
                        sbLIZ.append(f3);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        Pair<String, Size> pair2 = this.LIZJ;
                        if (pair2 != null && Intrinsics.LJFF(pair2.getFirst(), strLIZIZ)) {
                            return pair2.getSecond();
                        }
                        TextPaint textPaint = this.LIZIZ;
                        C0EOF.LIZ.getClass();
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C0EOF.LIZIZ;
                        Typeface typefaceX4 = (Typeface) concurrentHashMap.get(second);
                        if (typefaceX4 == null) {
                            typefaceX4 = C786410Ut5.x4(second);
                            concurrentHashMap.put(second, typefaceX4);
                            if (typefaceX4 == null) {
                                return new Size(0, 0);
                            }
                        }
                        textPaint.setTypeface(typefaceX4);
                        textPaint.setTextSize(this.LIZLLL);
                        Iterator it2 = a0.LJJLIIIJ(str, new char[]{'\n'}, false, 0, 6).iterator();
                        while (it2.hasNext()) {
                            fMax = Math.max(fMax, this.LIZIZ.measureText((String) it2.next()) + (this.LIZLLL * f4 * (r9.length() - 1)));
                        }
                        int height = new StaticLayout(str, this.LIZIZ, 536870911, Layout.Alignment.ALIGN_NORMAL, 1.0f, f5 * this.LIZLLL, true).getHeight();
                        float f6 = this.LIZ * 2;
                        Size size = new Size((int) (((((int) fMax) * f2) / f3) + f6), (int) (((height * f2) / f3) + f6));
                        this.LIZJ = new Pair<>(strLIZIZ, size);
                        return size;
                    }
                    return new Size(0, 0);
                }
                return new Size(0, 0);
            }
        }
        return new Size(0, 0);
    }
}
