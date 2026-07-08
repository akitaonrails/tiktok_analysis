package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701790Rft extends C09AY implements Function1<InterfaceC699620RcO, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701790Rft(String str, boolean z, boolean z2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC699620RcO interfaceC699620RcO) {
        interfaceC699620RcO.LIZIZ(this.LL, "STANDARD", Boolean.valueOf(this.LLILLJJLI), Boolean.valueOf(this.LLILLL), null, null);
        return Unit.LIZ;
    }
}
