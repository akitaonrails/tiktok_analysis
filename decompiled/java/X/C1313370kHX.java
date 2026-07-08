package X;

import android.util.SparseArray;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableArray;

/* JADX INFO: renamed from: X.0kHX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313370kHX implements Cloneable {
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

    public C1313370kHX() {
        this.LLJILJIL = -1;
        this.LLJILLL = -1;
        this.LLJJI = -1;
    }

    public C1313370kHX(C1313370kHX c1313370kHX) {
        this.LLJILJIL = -1;
        this.LLJILLL = -1;
        this.LLJJI = -1;
        this.LL = c1313370kHX.LL;
        this.LLILLJJLI = c1313370kHX.LLILLJJLI;
        this.LLILLL = c1313370kHX.LLILLL;
        this.LLILZ = c1313370kHX.LLILZ;
        this.LLILZIL = c1313370kHX.LLILZIL;
        this.LLILZLL = c1313370kHX.LLILZLL;
        this.LLIZ = c1313370kHX.LLIZ;
        this.LLIZLLLIL = c1313370kHX.LLIZLLLIL;
        this.LLJ = c1313370kHX.LLJ;
        this.LLJI = c1313370kHX.LLJI;
        this.LLJIJIL = c1313370kHX.LLJIJIL;
        this.LLJILJIL = c1313370kHX.LLJILJIL;
        this.LLJILJILJ = c1313370kHX.LLJILJILJ;
        this.LLJILLL = c1313370kHX.LLJILLL;
        this.LLJJ = c1313370kHX.LLJJ;
        this.LLJJI = c1313370kHX.LLJJI;
    }

    public static C1313370kHX LIZLLL(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        if (readableArray.size() != 13) {
            LynxLog.DTHROW(null);
        }
        C1313370kHX c1313370kHX = new C1313370kHX();
        c1313370kHX.LL = readableArray.getString(0);
        c1313370kHX.LLILLJJLI = (long) readableArray.getDouble(1);
        int iLIZJ = c1313370kHX.LIZJ(2, readableArray);
        int i = iLIZJ + 1;
        c1313370kHX.LLILLL = (long) readableArray.getDouble(iLIZJ);
        int i2 = i + 1;
        c1313370kHX.LLJIJIL = readableArray.getInt(i) - 1;
        int i3 = i2 + 1;
        c1313370kHX.LLJILJILJ = readableArray.getInt(i2);
        c1313370kHX.LLJILJIL = readableArray.getInt(i3);
        c1313370kHX.LLJILLL = readableArray.getInt(i3 + 1);
        return c1313370kHX;
    }

    public final boolean LIZ(C1313370kHX c1313370kHX) {
        if (c1313370kHX != null && this.LL.equals(c1313370kHX.LL) && this.LLILLJJLI == c1313370kHX.LLILLJJLI && this.LLILLL == c1313370kHX.LLILLL && this.LLILZ == c1313370kHX.LLILZ && this.LLILZIL == c1313370kHX.LLILZIL && this.LLILZLL == c1313370kHX.LLILZLL && this.LLIZ == c1313370kHX.LLIZ && this.LLIZLLLIL == c1313370kHX.LLIZLLLIL && this.LLJ == c1313370kHX.LLJ && this.LLJI == c1313370kHX.LLJI && this.LLJIJIL == c1313370kHX.LLJIJIL && this.LLJILJIL == c1313370kHX.LLJILJIL && this.LLJILJILJ == c1313370kHX.LLJILJILJ && this.LLJJ == c1313370kHX.LLJJ) {
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

    public static void LIZIZ(SparseArray<C1313370kHX> sparseArray, int i, int i2) {
        if (sparseArray.indexOfKey(i) >= 0 && sparseArray.indexOfKey(i2) >= 0) {
            if (sparseArray.get(i).LLJJI < sparseArray.get(i2).LLJJI) {
                sparseArray.remove(i);
            } else {
                sparseArray.remove(i2);
            }
        }
    }
}
