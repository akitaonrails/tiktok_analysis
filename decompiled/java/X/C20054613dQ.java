package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS274S0000000_30;
import p2.j1;

/* JADX INFO: renamed from: X.13dQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20054613dQ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ j1 LL;
    public final /* synthetic */ AbstractC20055413dY LLILLJJLI;
    public final /* synthetic */ InterfaceC20053313dD LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ C13B8 LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ float LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20054613dQ(j1 j1Var, AbstractC20055413dY abstractC20055413dY, InterfaceC20053313dD interfaceC20053313dD, long j, C13B8 c13b8, int i, boolean z, float f) {
        super(0);
        this.LL = j1Var;
        this.LLILLJJLI = abstractC20055413dY;
        this.LLILLL = interfaceC20053313dD;
        this.LLILZ = j;
        this.LLILZIL = c13b8;
        this.LLILZLL = i;
        this.LLIZ = z;
        this.LLIZLLLIL = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        j1 j1Var = this.LL;
        AbstractC20055413dY abstractC20055413dYLIZ = C20056013de.LIZ(this.LLILLJJLI, this.LLILLL.LIZ());
        InterfaceC20053313dD interfaceC20053313dD = this.LLILLL;
        long j = this.LLILZ;
        C13B8 c13b8 = this.LLILZIL;
        int i = this.LLILZLL;
        boolean z = this.LLIZ;
        float f = this.LLIZLLLIL;
        AFwS274S0000000_30 aFwS274S0000000_30 = j1.LLLF;
        j1Var.LLIZ(abstractC20055413dYLIZ, interfaceC20053313dD, j, c13b8, i, z, f, false);
        return Unit.LIZ;
    }
}
