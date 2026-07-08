package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0p78, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1499120p78 implements Iterator {
    public final int LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public final /* synthetic */ C1499130p79 LLILZ;

    public final void LIZ() {
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        C1499130p79 c1499130p79 = this.LLILZ;
        int i = c1499130p79.LLILLL - 1;
        c1499130p79.LLILLL = i;
        if (i > 0 || !c1499130p79.LLILZ) {
            return;
        }
        c1499130p79.LLILZ = false;
        int size = ((ArrayList) c1499130p79.LL).size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (ListProtector.get(c1499130p79.LL, size) == null) {
                ListProtector.remove(c1499130p79.LL, size);
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C1499130p79 c1499130p79 = this.LLILZ;
        if (c1499130p79.LLILZIL) {
            c1499130p79.LLILLJJLI.getClass();
        }
        int i = this.LLILLJJLI;
        while (i < this.LL && ListProtector.get(this.LLILZ.LL, i) == null) {
            i++;
        }
        if (i < this.LL) {
            return true;
        }
        LIZ();
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [E, java.lang.Object] */
    @Override // java.util.Iterator
    public final E next() {
        C1499130p79 c1499130p79 = this.LLILZ;
        if (c1499130p79.LLILZIL) {
            c1499130p79.LLILLJJLI.getClass();
        }
        while (true) {
            int i = this.LLILLJJLI;
            if (i >= this.LL || ListProtector.get(this.LLILZ.LL, i) != null) {
                break;
            }
            this.LLILLJJLI++;
        }
        int i2 = this.LLILLJJLI;
        if (i2 >= this.LL) {
            LIZ();
            throw new NoSuchElementException();
        }
        C1499130p79 c1499130p792 = this.LLILZ;
        this.LLILLJJLI = i2 + 1;
        return ListProtector.get(c1499130p792.LL, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public C1499120p78(C1499130p79 c1499130p79) {
        this.LLILZ = c1499130p79;
        c1499130p79.LLILLL++;
        this.LL = ((ArrayList) c1499130p79.LL).size();
    }
}
