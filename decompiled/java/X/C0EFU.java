package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS619S0100000_5;

/* JADX INFO: renamed from: X.0EFU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EFU extends AbstractC1585810rMx {
    public final RecyclerView LL;
    public final C0EF4 LLILLJJLI;
    public final Function2<EnumC355950DxR, Integer, Unit> LLILZ;
    public final float LLILLL = 0.5f;
    public final HashSet<String> LLILZIL = new HashSet<>();

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL() {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EFU.LJJIJIIJIL():void");
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i == 0) {
            LJJIJIIJIL();
        }
    }

    public C0EFU(RecyclerView recyclerView, C0EF4 c0ef4, AwS619S0100000_5 awS619S0100000_5) {
        this.LL = recyclerView;
        this.LLILLJJLI = c0ef4;
        this.LLILZ = awS619S0100000_5;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this);
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        LJJIJIIJIL();
    }
}
