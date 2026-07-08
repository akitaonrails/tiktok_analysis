package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05AB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.util.SkylightFriendsStoryDataCenter$tryInitDiskCacheData$1$1", f = "SkylightFriendsStoryDataCenter.kt", l = {}, m = "invokeSuspend")
public final class C05AB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<Boolean, Unit> LL;
    public final /* synthetic */ C1600210rkB LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05AB(C1600210rkB c1600210rkB, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = c1600210rkB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05AB(this.LLILLJJLI, interfaceC1364105Vn, this.LL);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "SkylightFriendsStoryDataCenter@6193.tryInitDiskCacheData$1$1"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r6)
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r3 = r5.LL
            X.0rkB r2 = r5.LLILLJJLI
            com.ss.android.ugc.aweme.base.util.FriendsStoryCacheData r0 = r2.LIZLLL
            if (r0 == 0) goto L2f
            java.lang.String r1 = X.C1600210rkB.LIZIZ()
            java.lang.String r0 = r2.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L2f
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r3.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L2f:
            r1 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05AB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
