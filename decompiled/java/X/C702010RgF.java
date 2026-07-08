package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RgF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C702010RgF extends C09AY implements Function1<C700950ReX, Unit> {
    public final /* synthetic */ C701370RfD LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C700950ReX LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C702010RgF(C701370RfD c701370RfD, String str, int i, C700950ReX c700950ReX) {
        super(1);
        this.LL = c701370RfD;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = c700950ReX;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C700950ReX c700950ReX) {
        this.LL.LIZ(this.LLILLJJLI, this.LLILLL, EnumC197200pO.ONLINE, this.LLILZ, c700950ReX);
        return Unit.LIZ;
    }
}
