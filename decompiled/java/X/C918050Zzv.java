package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Zzv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918050Zzv extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ InterfaceC955990az7 LL;
    public final /* synthetic */ C955590ayT LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C918050Zzv(InterfaceC955990az7 interfaceC955990az7, C955590ayT c955590ayT, boolean z, long j) {
        super(1);
        this.LL = interfaceC955990az7;
        this.LLILLJJLI = c955590ayT;
        this.LLILLL = z;
        this.LLILZ = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            C955450ayF c955450ayF = C955450ayF.LIZ;
            InterfaceC955990az7 interfaceC955990az7 = this.LL;
            C955590ayT c955590ayT = this.LLILLJJLI;
            boolean z = this.LLILLL;
            long j = this.LLILZ;
            c955450ayF.getClass();
            C955450ayF.LIZ(interfaceC955990az7, c955590ayT, z, j);
        }
        return Unit.LIZ;
    }
}
