package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0EpZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376550EpZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C376460EpQ LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function2<Boolean, Boolean, Unit> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C376550EpZ(C376460EpQ c376460EpQ, String str, String str2, Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z) {
        super(0);
        this.LL = c376460EpQ;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = function2;
        this.LLILZIL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJIIIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
        return Unit.LIZ;
    }
}
