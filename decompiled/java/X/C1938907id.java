package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.07id, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1938907id extends AbstractC1901707cd {
    public final float[] LL;
    public int LLILLJJLI;

    @Override // X.AbstractC1901707cd
    public final float LIZ() {
        try {
            float[] fArr = this.LL;
            int i = this.LLILLJJLI;
            this.LLILLJJLI = i + 1;
            return fArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLJJLI < this.LL.length;
    }

    public C1938907id(float[] fArr) {
        this.LL = fArr;
    }
}
