package X;

import com.ss.android.ugc.aweme.portrait.customize.model.PortraitRecommendedItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tiK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675940tiK extends C09AY implements Function1<C0MAE, Unit> {
    public final /* synthetic */ InterfaceC1665500tRU<PortraitRecommendedItem> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function1<Integer, Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ C1675930tiJ LLIZLLLIL;
    public final /* synthetic */ Function1<Integer, Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1675940tiK(InterfaceC1665500tRU<PortraitRecommendedItem> interfaceC1665500tRU, boolean z, boolean z2, Function0<Unit> function0, Function1<? super Integer, Unit> function1, Function0<Unit> function02, Function0<Unit> function03, C1675930tiJ c1675930tiJ, Function1<? super Integer, Unit> function12) {
        super(1);
        this.LL = interfaceC1665500tRU;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = function0;
        this.LLILZIL = function1;
        this.LLILZLL = function02;
        this.LLIZ = function03;
        this.LLIZLLLIL = c1675930tiJ;
        this.LLJ = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0MAE c0mae) {
        InterfaceC1665500tRU<PortraitRecommendedItem> interfaceC1665500tRU = this.LL;
        c0mae.LIZJ(interfaceC1665500tRU.size(), null, new C5183020f((List) interfaceC1665500tRU, (List<Function1<Function1<? super Boolean, Unit>, Unit>>) 350), new C19719212De(-1091073711, new C1675950tiL(interfaceC1665500tRU, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ), true));
        return Unit.LIZ;
    }
}
