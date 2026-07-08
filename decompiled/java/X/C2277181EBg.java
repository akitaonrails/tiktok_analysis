package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EBg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2277181EBg extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C2277251EBn LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2277181EBg(int i, C2277251EBn c2277251EBn, long j, long j2) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = c2277251EBn;
        this.LLILLL = j;
        this.LLILZ = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC2277241EBm interfaceC2277241EBm;
        if (this.LL == 36 && (interfaceC2277241EBm = this.LLILLJJLI.LIZ) != null) {
            interfaceC2277241EBm.LJJIJ(this.LLILLL, this.LLILZ);
        }
        return Unit.LIZ;
    }
}
