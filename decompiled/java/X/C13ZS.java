package X;

import androidx.compose.runtime.s;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.13ZS, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13ZS implements Iterator<Object>, C03W4 {
    public final C13ZI LL;
    public final int LLILLJJLI;
    public final C20031613Zi LLILLL;
    public final int LLILZ;
    public int LLILZIL;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ArrayList<Object> arrayList = this.LLILLL.LIZIZ;
        return arrayList != null && this.LLILZIL < arrayList.size();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.13aM] */
    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        ArrayList<Object> arrayList = this.LLILLL.LIZIZ;
        if (arrayList != null) {
            int i = this.LLILZIL;
            this.LLILZIL = i + 1;
            obj = ListProtector.get(arrayList, i);
        } else {
            obj = null;
        }
        if (obj instanceof C13Z7) {
            return new C13ZQ(((C13Z7) obj).LIZ, this.LLILZ, this.LL);
        }
        if (obj instanceof C20031613Zi) {
            return new C20031013Zc(this.LL, this.LLILLJJLI, (C20031613Zi) obj, new AbstractC20035913aP() { // from class: X.13aM
            });
        }
        s.LIZLLL("Unexpected group information structure");
        throw new C2197108jB();
    }

    public C13ZS(C13ZI c13zi, int i, C20031613Zi c20031613Zi, AbstractC20035913aP abstractC20035913aP) {
        this.LL = c13zi;
        this.LLILLJJLI = i;
        this.LLILLL = c20031613Zi;
        this.LLILZ = c13zi.LLIZLLLIL;
    }
}
