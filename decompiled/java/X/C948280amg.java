package X;

import Y.ARunnableS102S0100000_2;
import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0amg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948280amg extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ C948300ami LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1<AbstractC948140amS, Unit> LLILLL;
    public final /* synthetic */ Handler LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;
    public final /* synthetic */ C05P0<Boolean> LLILZLL;
    public final /* synthetic */ C05P0<Boolean> LLIZ;
    public final /* synthetic */ C05P0<Boolean> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C948280amg(C948300ami c948300ami, String str, Function1<? super AbstractC948140amS, Unit> function1, Handler handler, Function1<? super Boolean, Unit> function12, C05P0<Boolean> c05p0, C05P0<Boolean> c05p02, C05P0<Boolean> c05p03) {
        super(1);
        this.LL = c948300ami;
        this.LLILLJJLI = str;
        this.LLILLL = function1;
        this.LLILZ = handler;
        this.LLILZIL = function12;
        this.LLILZLL = c05p0;
        this.LLIZ = c05p02;
        this.LLIZLLLIL = c05p03;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        this.LLILZLL.setValue(Boolean.TRUE);
        C942270acz.LIZIZ(this.LL.LIZLLL, iIntValue, "click", "change", this.LLILLJJLI);
        this.LLILLL.invoke(new C948110amP(iIntValue));
        C05P0<Boolean> c05p0 = this.LLIZ;
        Boolean bool = Boolean.FALSE;
        c05p0.setValue(bool);
        C786410Ut5.LJLIIL(150L, this.LLILZ, new ARunnableS102S0100000_2(this.LLIZLLLIL, 91));
        this.LLILZIL.invoke(bool);
        return Unit.LIZ;
    }
}
