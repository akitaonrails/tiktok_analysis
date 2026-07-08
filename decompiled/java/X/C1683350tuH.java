package X;

import android.content.Context;
import com.ss.android.ugc.aweme.contactselect.ContactSelectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tuH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683350tuH extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ ContactSelectViewModel LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Function2<Context, Integer, String> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ Function1<String, Unit> LLILZLL;
    public final /* synthetic */ C05YD<Integer> LLIZ;
    public final /* synthetic */ Function1<String, Unit> LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;
    public final /* synthetic */ Function1<C1683130ttv, Unit> LLJI;
    public final /* synthetic */ Function1<Boolean, Unit> LLJIJIL;
    public final /* synthetic */ int LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1683350tuH(ContactSelectViewModel contactSelectViewModel, int i, int i2, Function2<? super Context, ? super Integer, String> function2, Function0<Unit> function0, Function1<? super String, Unit> function1, C05YD<Integer> c05yd, Function1<? super String, Unit> function12, Function0<Unit> function02, Function1<? super C1683130ttv, Unit> function13, Function1<? super Boolean, Unit> function14, int i3, int i4) {
        super(2);
        this.LL = contactSelectViewModel;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = function2;
        this.LLILZIL = function0;
        this.LLILZLL = function1;
        this.LLIZ = c05yd;
        this.LLIZLLLIL = function12;
        this.LLJ = function02;
        this.LLJI = function13;
        this.LLJIJIL = function14;
        this.LLJILJIL = i3;
        this.LLJILJILJ = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1683340tuG.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJILJIL | 1), C341440Da2.LIZ(this.LLJILJILJ));
        return Unit.LIZ;
    }
}
