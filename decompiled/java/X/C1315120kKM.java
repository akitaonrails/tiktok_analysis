package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0kKM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315120kKM implements LineBackgroundSpan {
    public int LL;
    public int LLILLJJLI;
    public boolean LLILLL = true;
    public HashMap<Integer, int[]> LLILZ;
    public final C1313270kHN LLILZIL;

    public C1315120kKM(int i, int i2, C1313270kHN c1313270kHN) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILZIL = c1313270kHN;
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        HashMap<Integer, int[]> map;
        int[] iArr;
        T t;
        if (this.LLILZIL != null && (map = this.LLILZ) != null && this.LLILLL && map.containsKey(Integer.valueOf(i8)) && (iArr = this.LLILZ.get(Integer.valueOf(i8))) != null && iArr.length == 2 && (t = this.LLILZIL.LIZIZ) != 0) {
            t.setBounds(Math.min(iArr[0], iArr[1]), i3, Math.max(iArr[0], iArr[1]), i5);
            ((BackgroundDrawable) this.LLILZIL.LIZIZ).draw(canvas);
        }
    }
}
