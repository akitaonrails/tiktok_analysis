package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689350u3x extends C09AY implements InterfaceC1631620sYq<InterfaceC1686920u02, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function1<String, Unit> LLILZ;
    public final /* synthetic */ C1685640txy LLILZIL;
    public final /* synthetic */ C594750NUj LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1689350u3x(Context context, boolean z, boolean z2, Function1<? super String, Unit> function1, C1685640txy c1685640txy, C594750NUj c594750NUj) {
        super(3);
        this.LL = context;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = function1;
        this.LLILZIL = c1685640txy;
        this.LLILZLL = c594750NUj;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(InterfaceC1686920u02 interfaceC1686920u02, InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 17) == 16 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            C1689210u3j.LJIIIZ(0, interfaceC1680500tpg2, this.LL.getString(2131827550));
            C1689210u3j.LJIIIIZZ(6, 0, interfaceC1680500tpg2, C13Z4.LIZJ(1922509792, new C1689360u3y(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL), interfaceC1680500tpg2));
        }
        return Unit.LIZ;
    }
}
