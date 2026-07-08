package X;

import android.os.Handler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS269S0300000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tzc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686660tzc implements InterfaceC1686690tzf, InterfaceC20035313aJ {
    public final C1672050tc3 LL;
    public Handler LLILLJJLI;
    public final C20029113Yj LLILLL = new C20029113Yj(new AwS604S0100000_25(this, 761));
    public boolean LLILZ = true;
    public final AwS604S0100000_25 LLILZIL = new AwS604S0100000_25(this, 762);
    public final List<C1685770tyB> LLILZLL = new ArrayList();

    @Override // X.InterfaceC20035313aJ
    public final void LJ() {
    }

    @Override // X.InterfaceC20035313aJ
    public final void LIZLLL() {
        C13Y8 c13y8 = this.LLILLL.LJII;
        if (c13y8 != null) {
            c13y8.dispose();
        }
        this.LLILLL.LIZIZ();
    }

    @Override // X.InterfaceC20035313aJ
    public final void LJFF() {
        C20029113Yj c20029113Yj = this.LLILLL;
        c20029113Yj.getClass();
        c20029113Yj.LJII = C13YI.LIZLLL(c20029113Yj.LIZLLL);
    }

    public C1686660tzc(C1672050tc3 c1672050tc3) {
        this.LL = c1672050tc3;
    }

    @Override // X.InterfaceC1686690tzf
    public final boolean LIZJ(List<? extends InterfaceC1673370teB> list) {
        if (this.LLILZ || list.size() != ((ArrayList) this.LLILZLL).size()) {
            return true;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Object objLJJJ = ((InterfaceC1676340tiy) ListProtector.get(list, i)).LJJJ();
                if (!(objLJJJ instanceof C1685770tyB)) {
                    objLJJJ = null;
                }
                if (!Intrinsics.LJFF(objLJJJ, ListProtector.get(this.LLILZLL, i))) {
                    return true;
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1686690tzf
    public final void LIZ(C2267041DoM c2267041DoM, List<? extends InterfaceC1673370teB> list) {
        Iterator it2 = ((ArrayList) this.LL.LIZ).iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(c2267041DoM);
        }
        ((ArrayList) this.LLILZLL).clear();
        this.LLILLL.LIZLLL(Unit.LIZ, new AwS269S0300000_25((List) list, (List<? extends InterfaceC1673370teB>) c2267041DoM, (C2267041DoM) this, (C1686660tzc) 18), this.LLILZIL);
        this.LLILZ = false;
    }
}
