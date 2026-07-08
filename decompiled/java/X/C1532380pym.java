package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0pym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532380pym extends C09AY implements Function2<InterfaceC1541240qD4, EnumC1541200qD0, Unit> {
    public final /* synthetic */ C1532310pyf LL;
    public final /* synthetic */ C259800zU<AbstractC1532350pyj<T>> LLILLJJLI;
    public final /* synthetic */ Class<T> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1532380pym(C1532310pyf c1532310pyf, C259800zU<AbstractC1532350pyj<T>> c259800zU, Class<T> cls) {
        super(2);
        this.LL = c1532310pyf;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.InterfaceC1541240qD4 r6, X.EnumC1541200qD0 r7) {
        /*
            r5 = this;
            X.0qD4 r6 = (X.InterfaceC1541240qD4) r6
            X.0pyf r3 = r5.LL
            X.0pyT r2 = r3.LJII
            X.0pyf r6 = (X.C1532310pyf) r6
            X.0pyT r1 = r6.LJII
            if (r1 == 0) goto L11
            if (r1 == r2) goto L11
            if (r2 != 0) goto L32
            r2 = r1
        L11:
            r3.LJII = r2
            X.00zU<X.0pyj<T>> r4 = r5.LLILLJJLI
            X.0pyj r3 = r6.LJII()
            r2 = 0
            if (r3 == 0) goto L30
            java.lang.Class<T> r1 = r5.LLILLL
            java.lang.Class<Type> r0 = r3.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 == 0) goto L30
        L26:
            boolean r0 = r3 instanceof X.AbstractC1532350pyj
            if (r0 == 0) goto L2b
            r2 = r3
        L2b:
            r4.element = r2
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            r3 = r2
            goto L26
        L32:
            X.0pyU r0 = new X.0pyU
            r0.<init>(r1, r2)
            r2 = r0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1532380pym.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
