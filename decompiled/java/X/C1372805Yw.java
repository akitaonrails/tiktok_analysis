package X;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05Yw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1372805Yw implements InterfaceC440230HOb<List<? extends C440440HOw>> {
    public final C440440HOw LIZ;
    public final String LIZIZ;
    public final C2252321DDq LIZJ;
    public final C01GW LIZLLL;

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
        return 1;
    }

    @Override // X.InterfaceC440230HOb
    public final void LJ() {
    }

    @Override // X.InterfaceC440230HOb
    public final void LJFF(Context context, boolean z) {
    }

    @Override // X.InterfaceC440230HOb
    public final String LIZLLL() {
        return C0HOE.SA_MUF.getParam();
    }

    @Override // X.InterfaceC440230HOb
    public final C05YD<C0HOM<? extends List<? extends C440440HOw>>> getState() {
        return C09IC.LIZIZ(this.LIZJ);
    }

    public final boolean LJI(C440440HOw c440440HOw) {
        String str;
        C440440HOw c440440HOw2 = this.LIZ;
        if (c440440HOw2 != null) {
            str = c440440HOw2.LIZJ;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, c440440HOw.LIZJ);
    }

    public C1372805Yw(InterfaceC497601wk interfaceC497601wk, C440440HOw c440440HOw, String str) {
        Object c1372405Ys;
        this.LIZ = c440440HOw;
        this.LIZIZ = str;
        if (c440440HOw != null) {
            c1372405Ys = new C1372405Ys(Collections.singletonList(c440440HOw));
        } else {
            c1372405Ys = C1372605Yu.LIZIZ;
        }
        this.LIZJ = C1BNE.LIZ(c1372405Ys);
        this.LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(668));
        if (c440440HOw == null && str != null) {
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1372705Yv(this, null), 3);
        }
    }
}
