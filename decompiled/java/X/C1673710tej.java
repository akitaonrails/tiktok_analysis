package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1673710tej extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1673720tek LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function1<String, Unit> LLILZ;
    public final /* synthetic */ Function1<String, Unit> LLILZIL;
    public final /* synthetic */ Function1<String, Unit> LLILZLL;
    public final /* synthetic */ Function1<C1683130ttv, Unit> LLIZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1673710tej(InterfaceC1673720tek interfaceC1673720tek, String str, Function0<Unit> function0, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Function1<? super String, Unit> function13, Function1<? super C1683130ttv, Unit> function14, Function1<? super Boolean, Unit> function15, Function0<Unit> function02, int i) {
        super(2);
        this.LL = interfaceC1673720tek;
        this.LLILLJJLI = str;
        this.LLILLL = function0;
        this.LLILZ = function1;
        this.LLILZIL = function12;
        this.LLILZLL = function13;
        this.LLIZ = function14;
        this.LLIZLLLIL = function15;
        this.LLJ = function02;
        this.LLJI = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1673660tee.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJI | 1));
        return Unit.LIZ;
    }
}
