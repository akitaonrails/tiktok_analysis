package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xoh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833650xoh extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1833650xoh(String str, Function0 function0, Function0 function02, boolean z) {
        super(0);
        this.LL = function0;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.invoke();
        if (this.LLILLJJLI) {
            C1833640xog c1833640xog = C1833640xog.LIZ;
            String str = this.LLILLL;
            c1833640xog.getClass();
            C1833640xog.LIZIZ("click", "confirm", str);
        }
        this.LLILZ.invoke();
        return Unit.LIZ;
    }
}
