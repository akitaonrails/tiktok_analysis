package X;

import androidx.lifecycle.LiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0o1n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457370o1n extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1457350o1l LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1457370o1n(C1457350o1l c1457350o1l, boolean z, boolean z2, boolean z3) {
        super(0);
        this.LL = c1457350o1l;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1457350o1l c1457350o1l = this.LL;
        LiveData<Void> liveDataWw2 = c1457350o1l.X1().ww2();
        final C1457350o1l c1457350o1l2 = this.LL;
        final boolean z = this.LLILLJJLI;
        final boolean z2 = this.LLILLL;
        final boolean z3 = this.LLILZ;
        liveDataWw2.observe(c1457350o1l, new InterfaceC1441305kZ() { // from class: X.0o1m
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                if (!C0L0X.LIZ(c1457350o1l2.w2().creativeModel) && z && z2 && z3) {
                    c1457350o1l2.LLILZ.LJIIJ(Boolean.TRUE);
                }
            }
        });
        return Unit.LIZ;
    }
}
