package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Xn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", l = {289, 293}, m = "invokeSuspend")
public final class C1369305Xn extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public C20066813fO LLILLJJLI;
    public C20066813fO LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ AbstractC1690640u62 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1369305Xn(AbstractC1690640u62 abstractC1690640u62, InterfaceC1364105Vn<? super C1369305Xn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = abstractC1690640u62;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1369305Xn c1369305Xn = new C1369305Xn(this.LLILZLL, interfaceC1364105Vn);
        c1369305Xn.LLILZIL = obj;
        return c1369305Xn;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0094 -> B:7:0x001a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r10.LLILZ
            r6 = 2
            r5 = 0
            r1 = 1
            if (r0 == 0) goto L57
            if (r0 == r1) goto L6b
            if (r0 != r6) goto L97
            X.13fO r0 = r10.LLILLL
            X.13fO r8 = r10.LLILLJJLI
            java.lang.Object r4 = r10.LLILZIL
            X.05ZT r4 = (X.C05ZT) r4
            X.C155000ia.LIZIZ(r11)
        L1a:
            X.13fT r11 = (X.C20067313fT) r11
            java.util.List<X.13fO> r9 = r11.LIZ
            int r3 = r9.size()
            r2 = 0
        L23:
            if (r2 >= r3) goto L34
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, r2)
            X.13fO r1 = (X.C20066813fO) r1
            boolean r1 = X.C05ZS.LIZIZ(r1)
            if (r1 == 0) goto L3c
            int r2 = r2 + 1
            goto L23
        L34:
            java.util.List<X.13fO> r0 = r11.LIZ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r5)
            X.13fO r0 = (X.C20066813fO) r0
        L3c:
            if (r0 == 0) goto L86
            X.0u62 r4 = r10.LLILZLL
            long r2 = r0.LIZJ
            long r0 = r8.LIZJ
            long r2 = X.C1378605aS.LJFF(r2, r0)
            X.05P0 r1 = r4.LIZJ
            X.05aS r0 = new X.05aS
            r0.<init>(r2)
            X.13FE r1 = (X.C13FE) r1
            r1.setValue(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L57:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r4 = r10.LLILZIL
            X.05ZT r4 = (X.C05ZT) r4
            X.13fE r0 = X.EnumC20065813fE.Initial
            r10.LLILZIL = r4
            r10.LLILZ = r1
            java.lang.Object r11 = X.C1374405Zm.LIZIZ(r4, r5, r0, r10)
            if (r11 != r7) goto L72
            return r7
        L6b:
            java.lang.Object r4 = r10.LLILZIL
            X.05ZT r4 = (X.C05ZT) r4
            X.C155000ia.LIZIZ(r11)
        L72:
            X.13fO r11 = (X.C20066813fO) r11
            X.0u62 r0 = r10.LLILZLL
            X.05P0 r3 = r0.LIZJ
            X.05aS r2 = new X.05aS
            r0 = 0
            r2.<init>(r0)
            X.13FE r3 = (X.C13FE) r3
            r3.setValue(r2)
            r0 = 0
            r8 = r11
        L86:
            X.13fE r1 = X.EnumC20065813fE.Initial
            r10.LLILZIL = r4
            r10.LLILLJJLI = r8
            r10.LLILLL = r0
            r10.LLILZ = r6
            java.lang.Object r11 = r4.LJJIJIL(r1, r10)
            if (r11 != r7) goto L1a
            return r7
        L97:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1369305Xn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
