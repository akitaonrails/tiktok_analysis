package X;

import com.ss.android.ugc.aweme.templateselect.TemplateSelectionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1673700tei extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ TemplateSelectionViewModel LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ Function1<String, Unit> LLILLL;
    public final /* synthetic */ Function1<String, Unit> LLILZ;
    public final /* synthetic */ Function1<String, Unit> LLILZIL;
    public final /* synthetic */ Function1<C1683130ttv, Unit> LLILZLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1673700tei(TemplateSelectionViewModel templateSelectionViewModel, Function0<Unit> function0, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Function1<? super String, Unit> function13, Function1<? super C1683130ttv, Unit> function14, Function1<? super Boolean, Unit> function15, Function0<Unit> function02, int i) {
        super(2);
        this.LL = templateSelectionViewModel;
        this.LLILLJJLI = function0;
        this.LLILLL = function1;
        this.LLILZ = function12;
        this.LLILZIL = function13;
        this.LLILZLL = function14;
        this.LLIZ = function15;
        this.LLIZLLLIL = function02;
        this.LLJ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1673660tee.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJ | 1));
        return Unit.LIZ;
    }
}
