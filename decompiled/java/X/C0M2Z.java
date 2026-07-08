package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS409S0200000_8;

/* JADX INFO: renamed from: X.0M2Z, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M2Z extends C09AY implements InterfaceC1631620sYq<InterfaceC1669590tY5, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C0M2A LL;
    public final /* synthetic */ C0M22 LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ Set<String> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M2Z(C0M2A c0m2a, C0M22 c0m22, float f, boolean z, AwS409S0200000_8 awS409S0200000_8, Set set) {
        super(3);
        this.LL = c0m2a;
        this.LLILLJJLI = c0m22;
        this.LLILLL = f;
        this.LLILZ = z;
        this.LLILZIL = awS409S0200000_8;
        this.LLILZLL = set;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(InterfaceC1669590tY5 interfaceC1669590tY5, InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        boolean z;
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 17) == 16 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            C0M2A c0m2a = this.LL;
            C0M22 c0m22 = this.LLILLJJLI;
            if (!c0m2a.LIZIZ.isEmpty()) {
                List<C0M0P> list = this.LL.LIZIZ;
                Set<String> set = this.LLILZLL;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<C0M0P> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (!set.contains(it2.next().LJ)) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                C1666710tTR.LJFF(c0m2a, c0m22, z, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1680500tpg2, 0);
            } else {
                z = false;
                C1666710tTR.LJFF(c0m2a, c0m22, z, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1680500tpg2, 0);
            }
        }
        return Unit.LIZ;
    }
}
