package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01iW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM$callUpdateBtnLiveSubOnlyApi$1$1$1$3", f = "SubOnlyLiveSettingDialogVM.kt", l = {294, 297, 312}, m = "invokeSuspend")
public final class C409401iW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C470590Icr<Object>>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Room LLILLL;
    public final /* synthetic */ SubOnlyLiveSettingDialogVM LLILZ;
    public final /* synthetic */ C291001Au<Boolean> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C409401iW(Room room, SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM, C291001Au<Boolean> c291001Au, InterfaceC1364105Vn<? super C409401iW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = room;
        this.LLILZ = subOnlyLiveSettingDialogVM;
        this.LLILZIL = c291001Au;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C409401iW c409401iW = new C409401iW(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c409401iW.LLILLJJLI = obj;
        return c409401iW;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r20
            java.lang.String r11 = "SubOnlyLiveSettingDialogVM@b5ff.callUpdateBtnLiveSubOnlyApi$1$1$1$3"
            X.C1C7U.LIZ(r11)
            java.lang.Object r4 = X.C099R.LJFF()
            r5 = r19
            int r0 = r5.LL
            r3 = 0
            r2 = 3
            r8 = 2
            r7 = 1
            if (r0 == 0) goto L28
            if (r0 == r7) goto L53
            if (r0 == r8) goto L8d
            if (r0 != r2) goto Laf
            java.lang.Object r7 = r5.LLILLJJLI
            X.C155000ia.LIZIZ(r1)
        L20:
            X.00o6 r0 = X.C189200o6.m1boximpl(r7)
            X.C1C7U.LIZIZ(r11)
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            com.bytedance.android.livesdkapi.depend.model.live.Room r6 = r5.LLILLL
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Throwable -> L5d
            java.lang.Class<com.bytedance.android.live.adminsetting.RoomSwitchApi> r0 = com.bytedance.android.live.adminsetting.RoomSwitchApi.class
            r1.getClass()     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r12 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Throwable -> L5d
            com.bytedance.android.live.adminsetting.RoomSwitchApi r12 = (com.bytedance.android.live.adminsetting.RoomSwitchApi) r12     // Catch: java.lang.Throwable -> L5d
            long r13 = r6.getId()     // Catch: java.lang.Throwable -> L5d
            r15 = 12
            r17 = 0
            r16 = r7
            X.11NZ r0 = r12.updateSwitch(r13, r15, r16, r17)     // Catch: java.lang.Throwable -> L5d
            r5.LL = r7     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r1 = X.C11UD.LIZLLL(r0, r5)     // Catch: java.lang.Throwable -> L5d
            if (r1 != r4) goto L56
            goto Lb7
        L53:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L5d
        L56:
            r7 = r1
            X.0Icr r7 = (X.C470590Icr) r7     // Catch: java.lang.Throwable -> L5d
            X.C189200o6.m2constructorimpl(r7)     // Catch: java.lang.Throwable -> L5d
            goto L69
        L5d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r7 = new X.00Yq
            r7.<init>(r0)
            X.C189200o6.m2constructorimpl(r7)
        L69:
            com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM r10 = r5.LLILZ
            X.01Au<java.lang.Boolean> r9 = r5.LLILZIL
            boolean r0 = X.C189200o6.m8isSuccessimpl(r7)
            if (r0 == 0) goto L92
            r6 = r7
            X.0Icr r6 = (X.C470590Icr) r6
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.01iZ r0 = new X.01iZ
            r0.<init>(r6, r10, r9, r3)
            r5.LLILLJJLI = r7
            r5.LL = r8
            java.lang.Object r0 = X.C23250099c.LJI(r5, r1, r0)
            if (r0 != r4) goto L92
            X.C1C7U.LIZIZ(r11)
            return r4
        L8d:
            java.lang.Object r7 = r5.LLILLJJLI
            X.C155000ia.LIZIZ(r1)
        L92:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r7)
            if (r0 == 0) goto L20
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.01iY r0 = new X.01iY
            r0.<init>(r3)
            r5.LLILLJJLI = r7
            r5.LL = r2
            java.lang.Object r0 = X.C23250099c.LJI(r5, r1, r0)
            if (r0 != r4) goto L20
            X.C1C7U.LIZIZ(r11)
            return r4
        Laf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb7:
            X.C1C7U.LIZIZ(r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C409401iW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C470590Icr<Object>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
