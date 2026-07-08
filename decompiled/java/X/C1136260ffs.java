package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ffs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136260ffs extends C09AY implements Function1<InterfaceC1136020ffU, C1140170fmB> {
    public final /* synthetic */ C1135810ff9 LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C1140170fmB LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1136260ffs(C1135810ff9 c1135810ff9, long j, int i, C1140170fmB c1140170fmB) {
        super(1);
        this.LL = c1135810ff9;
        this.LLILLJJLI = j;
        this.LLILLL = i;
        this.LLILZ = c1140170fmB;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1140170fmB invoke(InterfaceC1136020ffU interfaceC1136020ffU) {
        InterfaceC1136020ffU interfaceC1136020ffU2 = interfaceC1136020ffU;
        if (Intrinsics.LJFF(interfaceC1136020ffU2, this.LL) || interfaceC1136020ffU2.getGiftId() == this.LLILLJJLI) {
            interfaceC1136020ffU2.LJJI().LJIILL = this.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateLynxGiftResourceStatus success, otherMessageQueue: ");
            sbLIZ.append(this.LLILLL);
            C1133910fc5.LIZLLL("GiftTrayMessageQueue", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1140170fmB c1140170fmB = this.LLILZ;
        c1140170fmB.LIZ(false, true, false);
        return c1140170fmB;
    }
}
