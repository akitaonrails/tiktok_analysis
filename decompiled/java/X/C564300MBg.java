package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0MBg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564300MBg extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ Function1<Context, T> LL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLJJLI;
    public final /* synthetic */ Function1<T, Unit> LLILLL;
    public final /* synthetic */ Function1<T, Unit> LLILZ;
    public final /* synthetic */ Function1<T, Unit> LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C564300MBg(Function1<? super Context, ? extends T> function1, InterfaceC1685750ty9 interfaceC1685750ty9, Function1<? super T, Unit> function12, Function1<? super T, Unit> function13, Function1<? super T, Unit> function14, int i, int i2) {
        super(2);
        this.LL = function1;
        this.LLILLJJLI = interfaceC1685750ty9;
        this.LLILLL = function12;
        this.LLILZ = function13;
        this.LLILZIL = function14;
        this.LLILZLL = i;
        this.LLIZ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C20084413iE.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZLL | 1), this.LLIZ);
        return Unit.LIZ;
    }
}
