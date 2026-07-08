package X;

import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Da3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341450Da3 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Function2<String, Boolean, Unit> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ ThoughtInfo LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ Function1<Integer, Unit> LLIZLLLIL;
    public final /* synthetic */ Function1<Integer, Unit> LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C341450Da3(String str, Function2<? super String, ? super Boolean, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, String str2, ThoughtInfo thoughtInfo, Function0<Unit> function03, Function1<? super Integer, Unit> function1, Function1<? super Integer, Unit> function12, int i, int i2) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = function2;
        this.LLILLL = function0;
        this.LLILZ = function02;
        this.LLILZIL = str2;
        this.LLILZLL = thoughtInfo;
        this.LLIZ = function03;
        this.LLIZLLLIL = function1;
        this.LLJ = function12;
        this.LLJI = i;
        this.LLJIJIL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1670840ta6.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJI | 1), this.LLJIJIL);
        return Unit.LIZ;
    }
}
