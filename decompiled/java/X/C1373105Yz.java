package X;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05Yz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1373105Yz implements InterfaceC440230HOb<List<? extends C440440HOw>> {
    public final List<C440440HOw> LIZ;
    public final List<String> LIZIZ;
    public final C2252321DDq LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;

    @Override // X.InterfaceC440230HOb
    public final /* bridge */ /* synthetic */ Integer LIZ() {
        return null;
    }

    @Override // X.InterfaceC440230HOb
    public final int LIZIZ() {
        return 0;
    }

    @Override // X.InterfaceC440230HOb
    public final Integer LIZJ() {
        return 2;
    }

    @Override // X.InterfaceC440230HOb
    public final void LJ() {
    }

    @Override // X.InterfaceC440230HOb
    public final void LJFF(Context context, boolean z) {
    }

    @Override // X.InterfaceC440230HOb
    public final String LIZLLL() {
        return C0HOE.SA_MIXED.getParam();
    }

    @Override // X.InterfaceC440230HOb
    public final C05YD<C0HOM<? extends List<? extends C440440HOw>>> getState() {
        return C09IC.LIZIZ(this.LIZJ);
    }

    public final boolean LJI(C440440HOw c440440HOw) {
        List<C440440HOw> list = this.LIZ;
        if (list != null) {
            for (C440440HOw c440440HOw2 : list) {
                if (Intrinsics.LJFF(c440440HOw2.LIZJ, c440440HOw.LIZJ)) {
                    if (c440440HOw2 != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public C1373105Yz(InterfaceC497601wk interfaceC497601wk, List<C440440HOw> list, List<String> list2) {
        Object c1372405Ys;
        this.LIZ = list;
        this.LIZIZ = list2;
        if (list != null) {
            c1372405Ys = new C1372405Ys(list);
        } else {
            c1372405Ys = C1372605Yu.LIZIZ;
        }
        this.LIZJ = C1BNE.LIZ(c1372405Ys);
        this.LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(666));
        this.LJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(667));
        if (list == null && list2 != null) {
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1373005Yy(this, null), 3);
        }
    }
}
