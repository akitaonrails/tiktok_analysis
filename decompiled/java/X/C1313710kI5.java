package X;

import android.util.SparseArray;
import com.bytedance.sdui.render.bridge.ReadableArray;

/* JADX INFO: renamed from: X.0kI5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313710kI5 implements Cloneable {
    public String LL;
    public long LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public final int LLJJ;
    public int LLJJI;

    public C1313710kI5() {
        this.LLJILJIL = -1;
        this.LLJILLL = -1;
        this.LLJJI = -1;
    }

    public C1313710kI5(C1313710kI5 c1313710kI5) {
        this.LLJILJIL = -1;
        this.LLJILLL = -1;
        this.LLJJI = -1;
        this.LL = c1313710kI5.LL;
        this.LLILLJJLI = c1313710kI5.LLILLJJLI;
        this.LLILLL = c1313710kI5.LLILLL;
        this.LLILZ = c1313710kI5.LLILZ;
        this.LLILZIL = c1313710kI5.LLILZIL;
        this.LLILZLL = c1313710kI5.LLILZLL;
        this.LLIZ = c1313710kI5.LLIZ;
        this.LLIZLLLIL = c1313710kI5.LLIZLLLIL;
        this.LLJ = c1313710kI5.LLJ;
        this.LLJI = c1313710kI5.LLJI;
        this.LLJIJIL = c1313710kI5.LLJIJIL;
        this.LLJILJIL = c1313710kI5.LLJILJIL;
        this.LLJILJILJ = c1313710kI5.LLJILJILJ;
        this.LLJILLL = c1313710kI5.LLJILLL;
        this.LLJJ = c1313710kI5.LLJJ;
        this.LLJJI = c1313710kI5.LLJJI;
    }

    public final boolean LIZ(C1313710kI5 c1313710kI5) {
        if (c1313710kI5 != null && this.LL.equals(c1313710kI5.LL) && this.LLILLJJLI == c1313710kI5.LLILLJJLI && this.LLILLL == c1313710kI5.LLILLL && this.LLILZ == c1313710kI5.LLILZ && this.LLILZIL == c1313710kI5.LLILZIL && this.LLILZLL == c1313710kI5.LLILZLL && this.LLIZ == c1313710kI5.LLIZ && this.LLIZLLLIL == c1313710kI5.LLIZLLLIL && this.LLJ == c1313710kI5.LLJ && this.LLJI == c1313710kI5.LLJI && this.LLJIJIL == c1313710kI5.LLJIJIL && this.LLJILJIL == c1313710kI5.LLJILJIL && this.LLJILJILJ == c1313710kI5.LLJILJILJ && this.LLJJ == c1313710kI5.LLJJ) {
            return true;
        }
        return false;
    }

    public final int LIZJ(int i, ReadableArray readableArray) {
        if (readableArray != null && readableArray.size() >= 6) {
            this.LLILZIL = readableArray.getInt(i);
            this.LLJI = readableArray.getInt(i + 1);
            this.LLILZLL = (float) readableArray.getDouble(i + 2);
            this.LLIZ = (float) readableArray.getDouble(i + 3);
            this.LLIZLLLIL = (float) readableArray.getDouble(i + 4);
            this.LLJ = (float) readableArray.getDouble(i + 5);
            return i + 6;
        }
        this.LLILZIL = 0;
        this.LLJI = 0;
        this.LLILZLL = 0.0f;
        this.LLIZ = 0.0f;
        this.LLIZLLLIL = 0.0f;
        this.LLJ = 0.0f;
        return i;
    }

    public static void LIZIZ(SparseArray<C1313710kI5> sparseArray, int i, int i2) {
        if (sparseArray.indexOfKey(i) >= 0 && sparseArray.indexOfKey(i2) >= 0) {
            if (sparseArray.get(i).LLJJI < sparseArray.get(i2).LLJJI) {
                sparseArray.remove(i);
            } else {
                sparseArray.remove(i2);
            }
        }
    }
}
