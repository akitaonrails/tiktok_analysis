package X;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tRc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665580tRc extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1665500tRU<InterfaceC1627880sSo> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZIL;
    public final /* synthetic */ Function1<MotionEvent, Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1665580tRc(InterfaceC1665500tRU<? extends InterfaceC1627880sSo> interfaceC1665500tRU, int i, float f, float f2, InterfaceC1685750ty9 interfaceC1685750ty9, Function1<? super MotionEvent, Unit> function1, Function0<Unit> function0, int i2) {
        super(2);
        this.LL = interfaceC1665500tRU;
        this.LLILLJJLI = i;
        this.LLILLL = f;
        this.LLILZ = f2;
        this.LLILZIL = interfaceC1685750ty9;
        this.LLILZLL = function1;
        this.LLIZ = function0;
        this.LLIZLLLIL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1666200tSc.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZLLLIL | 1));
        return Unit.LIZ;
    }
}
