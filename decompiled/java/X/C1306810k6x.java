package X;

import com.bytedance.android.starship.strategy.repository.ContainerInput;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0k6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306810k6x extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Map<String, ContainerInput> LL;
    public final /* synthetic */ Function1<C1307030k7J, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1306810k6x(Map<String, ContainerInput> map, Function1<? super C1307030k7J, Unit> function1) {
        super(0);
        this.LL = map;
        this.LLILLJJLI = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1306510k6T c1306510k6T = C1306510k6T.LIZ;
        EnumC1306820k6y enumC1306820k6y = EnumC1306820k6y.COLD_START;
        c1306510k6T.getClass();
        C1306510k6T.LIZJ(enumC1306820k6y);
        C1306580k6a.LJI(enumC1306820k6y, this.LL, new C1306840k70(this.LLILLJJLI), new C1306850k71(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
