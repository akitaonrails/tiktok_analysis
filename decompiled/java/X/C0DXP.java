package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DXP, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DXP extends AbstractC1585810rMx {
    public final RecyclerView LL;
    public final int LLILLJJLI;
    public final float LLILLL;
    public final Function1<Integer, String> LLILZ;
    public final Function1<Integer, Unit> LLILZIL;
    public final HashSet<String> LLILZLL;

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL() {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DXP.LJJIJIIJIL():void");
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i == 0) {
            LJJIJIIJIL();
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        LJJIJIIJIL();
    }

    public C0DXP(RecyclerView recyclerView, int i, Function1 function1, Function1 function12, int i2) {
        i = (i2 & 2) != 0 ? 0 : i;
        this.LL = recyclerView;
        this.LLILLJJLI = i;
        this.LLILLL = 0.0f;
        this.LLILZ = function1;
        this.LLILZIL = function12;
        this.LLILZLL = new HashSet<>();
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this);
        }
    }
}
