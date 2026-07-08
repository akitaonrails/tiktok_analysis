package X;

import com.ss.android.ugc.tools.infosticker.repository.internal.collect.InfoStickerCollectListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sdr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.tools.infosticker.repository.internal.collect.InfoStickerCollectListViewModel$requestMoreData$7", f = "InfoStickerCollectListViewModel.kt", l = {232, 239, 253}, m = "invokeSuspend")
public final class C1634730sdr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ InfoStickerCollectListViewModel LLILLL;
    public final /* synthetic */ C1634770sdv LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1634730sdr(InfoStickerCollectListViewModel infoStickerCollectListViewModel, C1634770sdv c1634770sdv, InterfaceC1364105Vn<? super C1634730sdr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = infoStickerCollectListViewModel;
        this.LLILZ = c1634770sdv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1634730sdr(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r7 = "InfoStickerCollectListViewModel@520b.requestMoreData$7"
            X.C1C7U.LIZ(r7)
            java.lang.Object r1 = X.C099R.LJFF()
            int r3 = r14.LLILLJJLI
            r2 = 3
            r0 = 2
            r13 = 1
            if (r3 == 0) goto L1f
            if (r3 == r13) goto L40
            if (r3 == r0) goto L91
            if (r3 != r2) goto Lb4
            X.C155000ia.LIZIZ(r15)
        L19:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L1f:
            X.C155000ia.LIZIZ(r15)
            com.ss.android.ugc.tools.infosticker.repository.internal.collect.InfoStickerCollectListViewModel r3 = r14.LLILLL
            X.01GW r3 = r3.LLJJIII
            java.lang.Object r8 = r3.getValue()
            X.0nMk r8 = (X.C1431920nMk) r8
            X.0sdv r3 = r14.LLILZ
            int r9 = r3.LIZJ
            long r10 = r3.LIZLLL
            r12 = 30
            r14.LLILLJJLI = r13
            java.lang.Object r5 = r8.LIZIZ(r9, r10, r12, r13, r14)
            if (r5 != r1) goto L49
            X.C1C7U.LIZIZ(r7)
            return r1
        L40:
            X.C155000ia.LIZIZ(r15)
            X.00o6 r15 = (X.C189200o6) r15
            java.lang.Object r5 = r15.m10unboximpl()
        L49:
            X.0sdv r9 = r14.LLILZ
            com.ss.android.ugc.tools.infosticker.repository.internal.collect.InfoStickerCollectListViewModel r10 = r14.LLILLL
            boolean r3 = X.C189200o6.m8isSuccessimpl(r5)
            if (r3 == 0) goto L96
            r11 = r5
            com.ss.android.ugc.tools.infosticker.repository.internal.repository.InfoStickerPanelCollectData r11 = (com.ss.android.ugc.tools.infosticker.repository.internal.repository.InfoStickerPanelCollectData) r11
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Asset> r4 = r11.assetList
            java.util.ArrayList r12 = new java.util.ArrayList
            r3 = 10
            int r3 = X.C15438062q.LJIJJ(r4, r3)
            r12.<init>(r3)
            java.util.Iterator r4 = r4.iterator()
        L67:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r4.next()
            com.ss.android.ugc.effectmanager.effect.model.Asset r3 = (com.ss.android.ugc.effectmanager.effect.model.Asset) r3
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = X.C1415070mvZ.LIZ(r3)
            r12.add(r3)
            goto L67
        L7b:
            X.08ps r3 = X.C2108108Nr.LIZ
            X.0sds r8 = new X.0sds
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r14.LL = r5
            r14.LLILLJJLI = r0
            java.lang.Object r0 = X.C23250099c.LJI(r14, r3, r8)
            if (r0 != r1) goto L96
            X.C1C7U.LIZIZ(r7)
            return r1
        L91:
            java.lang.Object r5 = r14.LL
            X.C155000ia.LIZIZ(r15)
        L96:
            com.ss.android.ugc.tools.infosticker.repository.internal.collect.InfoStickerCollectListViewModel r6 = r14.LLILLL
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r5)
            if (r0 == 0) goto L19
            X.08ps r4 = X.C2108108Nr.LIZ
            X.0sdu r3 = new X.0sdu
            r0 = 0
            r3.<init>(r6, r0)
            r14.LL = r5
            r14.LLILLJJLI = r2
            java.lang.Object r0 = X.C23250099c.LJI(r14, r4, r3)
            if (r0 != r1) goto L19
            X.C1C7U.LIZIZ(r7)
            return r1
        Lb4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1634730sdr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
