package X;

import androidx.compose.runtime.s;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13ZI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13ZI implements InterfaceC1680530tpj, Iterable<Object>, C03W4 {
    public int LLILLJJLI;
    public int LLILZ;
    public int LLILZIL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public HashMap<C13Z7, C20031613Zi> LLJI;
    public C20029713Yp<C20036313aT> LLJIJIL;
    public int[] LL = new int[0];
    public Object[] LLILLL = new Object[0];
    public final Object LLILZLL = new Object();
    public ArrayList<C13Z7> LLJ = new ArrayList<>();

    public final void LJ() {
        this.LLJI = new HashMap<>();
    }

    public final C13ZD LJFF() {
        if (this.LLIZ) {
            "Cannot read while a writer is pending".toString();
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.LLILZIL++;
        return new C13ZD(this);
    }

    public final C13ZE LJIIIIZZ() {
        if (!(!this.LLIZ)) {
            s.LIZJ("Cannot start a writer when another writer is pending");
        }
        if (this.LLILZIL > 0) {
            s.LIZJ("Cannot start a writer when a reader is pending");
        }
        this.LLIZ = true;
        this.LLIZLLLIL++;
        return new C13ZE(this);
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new C20030913Zb(0, this.LLILLJJLI, this);
    }

    public final int LIZJ(C13Z7 c13z7) {
        if (!(!this.LLIZ)) {
            s.LIZJ("Use active SlotWriter to determine anchor location instead");
        }
        if (!c13z7.LIZ()) {
            C13D4.LIZ("Anchor refers to a group that was removed");
        }
        return c13z7.LIZ;
    }

    public final boolean LJIIIZ(C13Z7 c13z7) {
        int iLJ;
        if (!c13z7.LIZ() || (iLJ = C13ZA.LJ(this.LLJ, c13z7.LIZ, this.LLILLJJLI)) < 0 || !Intrinsics.LJFF(ListProtector.get(this.LLJ, iLJ), c13z7)) {
            return false;
        }
        return true;
    }
}
