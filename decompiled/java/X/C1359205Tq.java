package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Tq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.view.FullWidthEffectCarouselScene$consumeAllTouches$1$1", f = "FullWidthEffectCarouselScene.kt", l = {615}, m = "invokeSuspend")
public final class C1359205Tq extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;

    public C1359205Tq(InterfaceC1364105Vn<? super C1359205Tq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1359205Tq c1359205Tq = new C1359205Tq(interfaceC1364105Vn);
        c1359205Tq.LLILLL = obj;
        return c1359205Tq;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[LOOP:0: B:7:0x001f->B:9:0x0025, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0040 -> B:6:0x0017). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "FullWidthEffectCarouselScene@94d7.consumeAllTouches$1$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L46
            java.lang.Object r2 = r6.LLILLL
            X.05ZT r2 = (X.C05ZT) r2
            X.C155000ia.LIZIZ(r7)
        L17:
            X.13fT r7 = (X.C20067313fT) r7
            java.util.List<X.13fO> r0 = r7.LIZ
            java.util.Iterator r1 = r0.iterator()
        L1f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r1.next()
            X.13fO r0 = (X.C20066813fO) r0
            r0.LIZ()
            goto L1f
        L2f:
            X.C155000ia.LIZIZ(r7)
            java.lang.Object r2 = r6.LLILLL
            X.05ZT r2 = (X.C05ZT) r2
        L36:
            r6.LLILLL = r2
            r6.LLILLJJLI = r3
            X.13fE r0 = X.EnumC20065813fE.Main
            java.lang.Object r7 = r2.LJJIJIL(r0, r6)
            if (r7 != r4) goto L17
            X.C1C7U.LIZIZ(r5)
            return r4
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1359205Tq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
