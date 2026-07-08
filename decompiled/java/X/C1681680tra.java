package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681680tra extends C09AY implements Function1<C0MAE, Unit> {
    public final /* synthetic */ InterfaceC1664360tPe<C1147640fyE> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ Function1<Long, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1681680tra(InterfaceC1664360tPe<C1147640fyE> interfaceC1664360tPe, boolean z, long j, boolean z2, long j2, Function1<? super Long, Unit> function1) {
        super(1);
        this.LL = interfaceC1664360tPe;
        this.LLILLJJLI = z;
        this.LLILLL = j;
        this.LLILZ = z2;
        this.LLILZIL = j2;
        this.LLILZLL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0MAE c0mae) {
        C0MAE c0mae2 = c0mae;
        InterfaceC1664360tPe<C1147640fyE> interfaceC1664360tPe = this.LL;
        c0mae2.LIZJ(interfaceC1664360tPe.size(), new C00HS(new C1147820fyW(), interfaceC1664360tPe), new C00HT(new C1682030ts9(), interfaceC1664360tPe), new C19719212De(-632812321, new C1681690trb(interfaceC1664360tPe, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL), true));
        boolean z = this.LLILLJJLI;
        if (z) {
            c0mae2.LIZIZ("music_gift_load_more_state", "music_gift_load_more_state", new C19719212De(-241794602, new C1681860trs(z), true));
        }
        return Unit.LIZ;
    }
}
