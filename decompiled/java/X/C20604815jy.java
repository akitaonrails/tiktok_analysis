package X;

import com.bytedance.ies.powerlist.PowerAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15jy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20604815jy extends C09AY implements Function1<C1891440zJu, Unit> {
    public final /* synthetic */ PowerAdapter LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20604815jy(PowerAdapter powerAdapter) {
        super(1);
        this.LL = powerAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1891440zJu c1891440zJu) {
        C1891440zJu c1891440zJu2 = c1891440zJu;
        if (c1891440zJu2.LIZIZ) {
            PowerAdapter powerAdapter = this.LL;
            C20603715jn c20603715jn = powerAdapter.LLJJJ;
            if (c20603715jn != null && c20603715jn.LJIILL) {
                C991830buv.LIZ(powerAdapter.LL, new AwS575S0100000_31(powerAdapter, 205));
            } else {
                powerAdapter.LLLLLLLLL(new C20604915jz(powerAdapter));
            }
        } else {
            PowerAdapter powerAdapter2 = this.LL;
            C20603715jn c20603715jn2 = powerAdapter2.LLJJJ;
            if (c20603715jn2 != null && c20603715jn2.LJIILL) {
                C991830buv.LIZ(powerAdapter2.LL, new AwS432S0200000_31(c1891440zJu2, powerAdapter2, 36));
            } else {
                powerAdapter2.LLLLLLLLL(new C20604615jw(c1891440zJu2, powerAdapter2));
            }
        }
        return Unit.LIZ;
    }
}
