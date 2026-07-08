package X;

import androidx.compose.runtime.s;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: X.13ZQ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13ZQ implements InterfaceC1680530tpj, Iterable<Object>, C03W4 {
    public final C13ZI LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        ArrayList<C13Z7> arrayList;
        int iLJ;
        Object obj;
        C20031613Zi c20031613Zi;
        if (this.LL.LLIZLLLIL != this.LLILLL) {
            C13ZA.LJFF();
        }
        C13ZI c13zi = this.LL;
        int i = this.LLILLJJLI;
        HashMap<C13Z7, C20031613Zi> map = c13zi.LLJI;
        if (map != null) {
            if (!(!c13zi.LLIZ)) {
                s.LIZJ("use active SlotWriter to crate an anchor for location instead");
            }
            if (i >= 0 && i < c13zi.LLILLJJLI && (iLJ = C13ZA.LJ((arrayList = c13zi.LLJ), i, c13zi.LLILLJJLI)) >= 0 && (obj = ListProtector.get(arrayList, iLJ)) != null && (c20031613Zi = map.get(obj)) != null) {
                return new C13ZS(this.LL, this.LLILLJJLI, c20031613Zi, new AbstractC20035913aP() { // from class: X.13aL
                });
            }
        }
        C13ZI c13zi2 = this.LL;
        int i2 = this.LLILLJJLI;
        return new C20030913Zb(i2 + 1, i2 + C13ZA.LIZ(i2, c13zi2.LL), c13zi2);
    }

    public C13ZQ(int i, int i2, C13ZI c13zi) {
        this.LL = c13zi;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }
}
