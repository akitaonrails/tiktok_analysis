package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tYd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669930tYd extends C09AY implements InterfaceC1631630sYr<InterfaceC1669590tY5, Integer, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ List<C941240abK> LL;
    public final /* synthetic */ Function2<C941240abK, Integer, Unit> LLILLJJLI;
    public final /* synthetic */ float LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1669930tYd(List<C941240abK> list, Function2<? super C941240abK, ? super Integer, Unit> function2, float f) {
        super(4);
        this.LL = list;
        this.LLILLJJLI = function2;
        this.LLILLL = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    @Override // X.InterfaceC1631630sYr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.InterfaceC1669590tY5 r12, java.lang.Integer r13, X.InterfaceC1680500tpg r14, java.lang.Integer r15) {
        /*
            r11 = this;
            r8 = r14
            java.lang.Number r13 = (java.lang.Number) r13
            int r2 = r13.intValue()
            X.0tpg r8 = (X.InterfaceC1680500tpg) r8
            java.lang.Number r15 = (java.lang.Number) r15
            int r4 = r15.intValue()
            r0 = r4 & 48
            r3 = 32
            if (r0 != 0) goto L1e
            boolean r0 = r8.LJIJI(r2)
            if (r0 == 0) goto L82
            r0 = 32
        L1d:
            r4 = r4 | r0
        L1e:
            r1 = r4 & 145(0x91, float:2.03E-43)
            r0 = 144(0x90, float:2.02E-43)
            if (r1 != r0) goto L30
            boolean r0 = r8.LIZ()
            if (r0 == 0) goto L30
            r8.LIZJ()
        L2d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            java.util.List<X.0abK> r0 = r11.LL
            int r0 = r0.size()
            if (r2 >= r0) goto L2d
            java.util.List<X.0abK> r0 = r11.LL
            java.lang.Object r5 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            X.0abK r5 = (X.C941240abK) r5
            if (r5 == 0) goto L2d
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r8.LJJIIJZLJL(r0)
            kotlin.jvm.functions.Function2<X.0abK, java.lang.Integer, kotlin.Unit> r0 = r11.LLILLJJLI
            boolean r1 = r8.LJJIIJ(r0)
            r0 = r4 & 112(0x70, float:1.57E-43)
            if (r0 != r3) goto L80
            r0 = 1
        L53:
            r0 = r0 | r1
            kotlin.jvm.functions.Function2<X.0abK, java.lang.Integer, kotlin.Unit> r1 = r11.LLILLJJLI
            java.lang.Object r6 = r8.LJJ()
            if (r0 != 0) goto L65
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L6d
        L65:
            X.0tYe r6 = new X.0tYe
            r6.<init>(r2, r1)
            r8.LJJIJIIJI(r6)
        L6d:
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r8.LJ()
            X.0tyA r1 = X.InterfaceC1685750ty9.LIZ
            float r0 = r11.LLILLL
            X.0ty9 r7 = androidx.compose.foundation.layout.c.LJIILLIIL(r1, r0)
            r9 = 0
            r10 = r9
            X.C1669960tYg.LIZ(r5, r6, r7, r8, r9, r10)
            goto L2d
        L80:
            r0 = 0
            goto L53
        L82:
            r0 = 16
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1669930tYd.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
