package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0eh5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.banner.view.NativeBannerViewImpl$startAutoPlay$1", f = "NativeBannerViewImpl.kt", l = {539}, m = "invokeSuspend")
public final class C1098570eh5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public C1098550eh3 LLILLL;
    public int LLILZ;
    public final /* synthetic */ C1098550eh3 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1098570eh5(C1098550eh3 c1098550eh3, InterfaceC1364105Vn<? super C1098570eh5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c1098550eh3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1098570eh5(this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00ab -> B:6:0x001b). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            java.lang.String r16 = "NativeBannerViewImpl@d53e.startAutoPlay$1"
            X.C1C7U.LIZ(r16)
            java.lang.Object r10 = X.C099R.LJFF()
            r9 = r17
            int r1 = r9.LLILZ
            r0 = 1
            if (r1 == 0) goto L42
            if (r1 != r0) goto Lb1
            int r8 = r9.LLILLJJLI
            int r7 = r9.LL
            X.0eh3 r0 = r9.LLILLL
            X.C155000ia.LIZIZ(r18)
        L1b:
            X.15oP r3 = r0.LLJILJIL
            if (r3 == 0) goto L38
            r1 = 0
            r3.setUserInputEnabled(r1)
            X.0ego r2 = r0.LLJJIJIIJIL
            if (r2 == 0) goto L2b
            X.0egf r1 = X.EnumC1098310egf.AUTO_SCROLL
            r2.LLILZIL = r1
        L2b:
            int r1 = r3.getCurrentItem()
            r2 = 1
            int r1 = r1 + 1
            r3.setCurrentItem(r1)
            r3.setUserInputEnabled(r2)
        L38:
            int r8 = r8 + 1
            if (r8 < r7) goto L4b
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r16)
            return r0
        L42:
            X.C155000ia.LIZIZ(r18)
            X.0eh3 r0 = r9.LLILZIL
            r7 = 2147483647(0x7fffffff, float:NaN)
            r8 = 0
        L4b:
            boolean r1 = r0.LLJJIJIL
            r11 = 0
            if (r1 == 0) goto L89
            long r5 = r0.LLJJIII
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 != 0) goto L59
            long r5 = r0.LLJJI
        L59:
            boolean r1 = r0.LLILLL
            if (r1 == 0) goto L9e
            boolean r1 = r0.LLJJJ
            if (r1 == 0) goto L9e
            long r1 = r0.LLJJJIL
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 == 0) goto L9e
            long r1 = r0.LLJJJJ
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 == 0) goto L9e
            android.util.SparseIntArray r14 = r0.LLJJJJLIIL
            int r13 = r14.size()
            r12 = 0
            r15 = 0
        L75:
            if (r12 >= r13) goto L8c
            r14.keyAt(r12)
            int r1 = r14.valueAt(r12)
            long r3 = (long) r1
            long r1 = r0.LLJJJJ
            int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r11 >= 0) goto L86
            r15 = 1
        L86:
            int r12 = r12 + 1
            goto L75
        L89:
            long r5 = r0.LLJJI
            goto L59
        L8c:
            if (r15 == 0) goto L9e
            long r3 = r0.LLJJJIL
            java.util.List<? extends com.bytedance.android.livesdk.model.BannerInRoom> r1 = r0.LLILLJJLI
            int r1 = r1.size()
            long r1 = (long) r1
            long r3 = r3 / r1
            long r1 = r0.LLJJJJJIL
            long r5 = java.lang.Math.max(r3, r1)
        L9e:
            r9.LLILLL = r0
            r9.LL = r7
            r9.LLILLJJLI = r8
            r1 = 1
            r9.LLILZ = r1
            java.lang.Object r1 = X.AnonymousClass0958.LIZIZ(r5, r9)
            if (r1 != r10) goto L1b
            X.C1C7U.LIZIZ(r16)
            return r10
        Lb1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1098570eh5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
