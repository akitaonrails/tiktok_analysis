package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.05Yq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1372205Yq implements InterfaceC440230HOb<List<? extends C440440HOw>> {
    public final List<String> LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(669));
    public final C2252321DDq LIZJ = C1BNE.LIZ(C1372605Yu.LIZIZ);
    public final List<String> LIZLLL = new ArrayList();
    public int LJ = 1;

    @Override // X.InterfaceC440230HOb
    public final int LIZIZ() {
        return 0;
    }

    @Override // X.InterfaceC440230HOb
    public final /* bridge */ /* synthetic */ Integer LIZJ() {
        return null;
    }

    @Override // X.InterfaceC440230HOb
    public final /* bridge */ /* synthetic */ String LIZLLL() {
        return null;
    }

    @Override // X.InterfaceC440230HOb
    public final void LJ() {
    }

    @Override // X.InterfaceC440230HOb
    public final void LJFF(Context context, boolean z) {
    }

    @Override // X.InterfaceC440230HOb
    public final Integer LIZ() {
        C1372405Ys c1372405Ys;
        List list;
        Object value = this.LIZJ.getValue();
        if (!(value instanceof C1372405Ys) || (c1372405Ys = (C1372405Ys) value) == null || (list = (List) c1372405Ys.LIZIZ) == null) {
            return null;
        }
        return Integer.valueOf(list.size());
    }

    @Override // X.InterfaceC440230HOb
    public final C05YD<C0HOM<? extends List<? extends C440440HOw>>> getState() {
        return C09IC.LIZIZ(this.LIZJ);
    }

    public C1372205Yq(InterfaceC497601wk interfaceC497601wk, List<String> list, boolean z) {
        this.LIZ = list;
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1372005Yo(this, z, null), 3);
    }
}
