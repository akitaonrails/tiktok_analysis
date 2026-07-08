package X;

import com.ss.android.ugc.tools.infosticker.repository.internal.collect.InfoStickerCollectListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sdq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.tools.infosticker.repository.internal.collect.InfoStickerCollectListViewModel$requestData$6", f = "InfoStickerCollectListViewModel.kt", l = {189, 192, 209}, m = "invokeSuspend")
public final class C1634720sdq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ InfoStickerCollectListViewModel LLILLL;
    public final /* synthetic */ C1634770sdv LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1634720sdq(InfoStickerCollectListViewModel infoStickerCollectListViewModel, C1634770sdv c1634770sdv, InterfaceC1364105Vn<? super C1634720sdq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = infoStickerCollectListViewModel;
        this.LLILZ = c1634770sdv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1634720sdq(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r7 = "InfoStickerCollectListViewModel@520b.requestData$6"
            X.C1C7U.LIZ(r7)
            java.lang.Object r1 = X.C099R.LJFF()
            int r3 = r14.LLILLJJLI
            r2 = 3
            r0 = 2
            r4 = 1
            if (r3 == 0) goto L1f
            if (r3 == r4) goto L3e
            if (r3 == r0) goto L8f
            if (r3 != r2) goto Lb2
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
            r9 = 0
            r10 = 0
            r12 = 30
            r14.LLILLJJLI = r4
            r13 = r9
            java.lang.Object r5 = r8.LIZIZ(r9, r10, r12, r13, r14)
            if (r5 != r1) goto L47
            X.C1C7U.LIZIZ(r7)
            return r1
        L3e:
            X.C155000ia.LIZIZ(r15)
            X.00o6 r15 = (X.C189200o6) r15
            java.lang.Object r5 = r15.m10unboximpl()
        L47:
            X.0sdv r9 = r14.LLILZ
            com.ss.android.ugc.tools.infosticker.repository.internal.collect.InfoStickerCollectListViewModel r10 = r14.LLILLL
            boolean r3 = X.C189200o6.m8isSuccessimpl(r5)
            if (r3 == 0) goto L94
            r11 = r5
            com.ss.android.ugc.tools.infosticker.repository.internal.repository.InfoStickerPanelCollectData r11 = (com.ss.android.ugc.tools.infosticker.repository.internal.repository.InfoStickerPanelCollectData) r11
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Asset> r4 = r11.assetList
            java.util.ArrayList r12 = new java.util.ArrayList
            r3 = 10
            int r3 = X.C15438062q.LJIJJ(r4, r3)
            r12.<init>(r3)
            java.util.Iterator r4 = r4.iterator()
        L65:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L79
            java.lang.Object r3 = r4.next()
            com.ss.android.ugc.effectmanager.effect.model.Asset r3 = (com.ss.android.ugc.effectmanager.effect.model.Asset) r3
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = X.C1415070mvZ.LIZ(r3)
            r12.add(r3)
            goto L65
        L79:
            X.08ps r3 = X.C2108108Nr.LIZ
            X.0sdt r8 = new X.0sdt
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r14.LL = r5
            r14.LLILLJJLI = r0
            java.lang.Object r0 = X.C23250099c.LJI(r14, r3, r8)
            if (r0 != r1) goto L94
            X.C1C7U.LIZIZ(r7)
            return r1
        L8f:
            java.lang.Object r5 = r14.LL
            X.C155000ia.LIZIZ(r15)
        L94:
            com.ss.android.ugc.tools.infosticker.repository.internal.collect.InfoStickerCollectListViewModel r6 = r14.LLILLL
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r5)
            if (r0 == 0) goto L19
            X.08ps r4 = X.C2108108Nr.LIZ
            X.0sdp r3 = new X.0sdp
            r0 = 0
            r3.<init>(r6, r0)
            r14.LL = r5
            r14.LLILLJJLI = r2
            java.lang.Object r0 = X.C23250099c.LJI(r14, r4, r3)
            if (r0 != r1) goto L19
            X.C1C7U.LIZIZ(r7)
            return r1
        Lb2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1634720sdq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
