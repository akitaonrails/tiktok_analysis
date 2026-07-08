package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0UVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C773350UVh extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0UTJ LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C773350UVh(C0UTJ c0utj, String str, String str2, boolean z, int i, int i2) {
        super(0);
        this.LL = c0utj;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJJI(true, this.LLILLJJLI, new C915190ZvJ(this.LLILLL, this.LLILZ, 4), this.LLILZIL == 0 ? EnumC20429314wl.MULTI_GUEST : EnumC20429314wl.INTERACT, Integer.valueOf(this.LLILZLL));
        return Unit.LIZ;
    }
}
