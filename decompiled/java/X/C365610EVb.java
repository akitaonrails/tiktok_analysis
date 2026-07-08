package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EVb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.common.text.pro.base.FakeProgress$start$1", f = "ResourcePagerStates.kt", l = {191}, m = "invokeSuspend")
public final class C365610EVb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C365600EVa LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C365610EVb(C365600EVa c365600EVa, InterfaceC1364105Vn<? super C365610EVb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c365600EVa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C365610EVb(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0047 -> B:6:0x0013). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "FakeProgress@336c.start$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 1
            if (r0 == 0) goto L4d
            if (r0 != r3) goto L57
            X.C155000ia.LIZIZ(r7)
        L13:
            kotlin.ranges.IntRange r2 = new kotlin.ranges.IntRange
            r1 = 0
            r0 = 2
            r2.<init>(r1, r0)
            X.13Lf r0 = X.AbstractC19994813Le.Default
            int r0 = X.C13LZ.LJIIJ(r0, r2)
            X.0EVa r1 = r6.LLILLJJLI
            int r2 = r1.LIZJ
            int r2 = r2 + r0
            int r0 = r1.LIZIZ
            if (r2 <= r0) goto L2a
            r2 = r0
        L2a:
            r1.LIZJ = r2
            kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r1 = r1.LIZLLL
            if (r1 == 0) goto L37
            java.lang.Integer r0 = X.C2286608xc.LJ(r2)
            r1.invoke(r0)
        L37:
            X.0EVa r2 = r6.LLILLJJLI
            int r1 = r2.LIZJ
            int r0 = r2.LIZIZ
            if (r1 >= r0) goto L51
            long r0 = r2.LIZ
            r6.LL = r3
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r6)
            if (r0 != r4) goto L13
            X.C1C7U.LIZIZ(r5)
            return r4
        L4d:
            X.C155000ia.LIZIZ(r7)
            goto L37
        L51:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C365610EVb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
