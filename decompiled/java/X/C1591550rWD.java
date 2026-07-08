package X;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: renamed from: X.0rWD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591550rWD extends C09AY implements Function2<Drawable, Drawable, Unit> {
    public final /* synthetic */ C1592450rXf LL;
    public final /* synthetic */ InterfaceC1583870rJp LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1591550rWD(C1592450rXf c1592450rXf, InterfaceC1583870rJp interfaceC1583870rJp) {
        super(2);
        this.LL = c1592450rXf;
        this.LLILLJJLI = interfaceC1583870rJp;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Drawable drawable, Drawable drawable2) {
        Drawable drawable3 = drawable;
        Drawable drawable4 = drawable2;
        C1591980rWu c1591980rWuLJIIJJI = this.LL.LJIIJJI(this.LLILLJJLI.tag());
        if (c1591980rWuLJIIJJI != null) {
            c1591980rWuLJIIJJI.LJII = drawable3;
            c1591980rWuLJIIJJI.LJIIIIZZ = drawable4;
            c1591980rWuLJIIJJI.LIZJ(new AwS603S0100000_24(c1591980rWuLJIIJJI, 100));
        }
        return Unit.LIZ;
    }
}
