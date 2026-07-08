package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS124S0201000_25;

/* JADX INFO: renamed from: X.0tnh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679270tnh extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Function2<InterfaceC1680500tpg, Integer, Unit> LLILLL;
    public final /* synthetic */ InterfaceC1631620sYq<InterfaceC1679150tnV, InterfaceC1680500tpg, Integer, Unit> LLILZ;
    public final /* synthetic */ Function2<InterfaceC1680500tpg, Integer, Unit> LLILZIL;
    public final /* synthetic */ Function2<InterfaceC1680500tpg, Integer, Unit> LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ InterfaceC1631620sYq<C1675080tgw, InterfaceC1680500tpg, Integer, Unit> LLJ;
    public final /* synthetic */ C1679310tnl LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1679270tnh(boolean z, int i, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1631620sYq<? super InterfaceC1679150tnV, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function23, int i2, int i3, InterfaceC1631620sYq<? super C1675080tgw, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq2, C1679310tnl c1679310tnl) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = i;
        this.LLILLL = function2;
        this.LLILZ = interfaceC1631620sYq;
        this.LLILZIL = function22;
        this.LLILZLL = function23;
        this.LLIZ = i2;
        this.LLIZLLLIL = i3;
        this.LLJ = interfaceC1631620sYq2;
        this.LLJI = c1679310tnl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 11) == 2 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            boolean z = this.LL;
            int i = this.LLILLJJLI;
            Function2<InterfaceC1680500tpg, Integer, Unit> function2 = this.LLILLL;
            InterfaceC1631620sYq<InterfaceC1679150tnV, InterfaceC1680500tpg, Integer, Unit> interfaceC1631620sYq = this.LLILZ;
            C19719212De c19719212DeLIZIZ = C13Z4.LIZIZ(interfaceC1680500tpg2, 533782017, new AwS124S0201000_25((InterfaceC1631620sYq) this.LLJ, (InterfaceC1631620sYq<? super C1675080tgw, ? super InterfaceC1680500tpg, ? super Integer, Unit>) this.LLJI, (C1679310tnl) this.LLIZ, 12));
            Function2<InterfaceC1680500tpg, Integer, Unit> function22 = this.LLILZIL;
            Function2<InterfaceC1680500tpg, Integer, Unit> function23 = this.LLILZLL;
            int i2 = this.LLIZ;
            C1679240tne.LIZIZ(z, i, function2, interfaceC1631620sYq, c19719212DeLIZIZ, function22, function23, interfaceC1680500tpg2, ((i2 >> 21) & 14) | 24576 | ((i2 >> 15) & 112) | (i2 & 896) | ((this.LLIZLLLIL >> 12) & 7168) | (458752 & i2) | ((i2 << 9) & 3670016));
        }
        return Unit.LIZ;
    }
}
