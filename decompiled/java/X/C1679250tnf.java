package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tnf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679250tnf extends C09AY implements InterfaceC1631620sYq<InterfaceC1685750ty9, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Function2<InterfaceC1680500tpg, Integer, Unit> LLILZLL;
    public final /* synthetic */ InterfaceC1631620sYq<InterfaceC1679150tnV, InterfaceC1680500tpg, Integer, Unit> LLIZ;
    public final /* synthetic */ Function2<InterfaceC1680500tpg, Integer, Unit> LLIZLLLIL;
    public final /* synthetic */ Function2<InterfaceC1680500tpg, Integer, Unit> LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ InterfaceC1631620sYq<C1675080tgw, InterfaceC1680500tpg, Integer, Unit> LLJIJIL;
    public final /* synthetic */ C1679310tnl LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1679250tnf(long j, long j2, int i, boolean z, int i2, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1631620sYq<? super InterfaceC1679150tnV, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function23, int i3, InterfaceC1631620sYq<? super C1675080tgw, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq2, C1679310tnl c1679310tnl) {
        super(3);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = i;
        this.LLILZ = z;
        this.LLILZIL = i2;
        this.LLILZLL = function2;
        this.LLIZ = interfaceC1631620sYq;
        this.LLIZLLLIL = function22;
        this.LLJ = function23;
        this.LLJI = i3;
        this.LLJIJIL = interfaceC1631620sYq2;
        this.LLJILJIL = c1679310tnl;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        int i;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            if (interfaceC1680500tpg2.LJJIIJ(interfaceC1685750ty92)) {
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 91) == 18 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            long j = this.LL;
            long j2 = this.LLILLJJLI;
            C19719212De c19719212DeLIZIZ = C13Z4.LIZIZ(interfaceC1680500tpg2, -1128984656, new C1679270tnh(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLILLL, this.LLJIJIL, this.LLJILJIL));
            int i2 = this.LLILLL >> 9;
            C1678670tmj.LIZ(interfaceC1685750ty92, null, j, j2, null, 0.0f, c19719212DeLIZIZ, interfaceC1680500tpg2, (iIntValue & 14) | 1572864 | (i2 & 896) | (i2 & 7168), 50);
        }
        return Unit.LIZ;
    }
}
