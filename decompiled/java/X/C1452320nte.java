package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS24S0401000_22;
import kotlin.jvm.internal.AwS76S0301000_22;

/* JADX INFO: renamed from: X.0nte, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452320nte extends C09AY implements Function1<C1453190nv3, Unit> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ C1453160nv0 LLILLJJLI;
    public final /* synthetic */ C1452090ntH<Object> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C013C LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1452320nte(int i, C1452090ntH c1452090ntH, C1453160nv0 c1453160nv0, C013C c013c, C013C c013c2) {
        super(1);
        this.LL = c013c;
        this.LLILLJJLI = c1453160nv0;
        this.LLILLL = c1452090ntH;
        this.LLILZ = i;
        this.LLILZIL = c013c2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1453190nv3 c1453190nv3) {
        C1453190nv3 c1453190nv32 = c1453190nv3;
        c1453190nv32.LIZ = new AwS76S0301000_22(this.LL, (C013C) this.LLILLJJLI, (C1453160nv0) this.LLILLL, (C1452090ntH<Object>) this.LLILZ, 1);
        C013C c013c = this.LL;
        C1452090ntH<Object> c1452090ntH = this.LLILLL;
        c1453190nv32.LIZIZ = new AwS24S0401000_22(this.LLILZ, c1452090ntH, this.LLILLJJLI, c013c, this.LLILZIL, 0);
        return Unit.LIZ;
    }
}
