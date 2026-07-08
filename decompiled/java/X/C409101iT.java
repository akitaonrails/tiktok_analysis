package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01iT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM$callUpdateBtnLiveSubOnlyApi$1$1$1$2", f = "SubOnlyLiveSettingDialogVM.kt", l = {270, 273, 279}, m = "invokeSuspend")
public final class C409101iT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C470590Icr<Object>>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Room LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C409101iT(Room room, InterfaceC1364105Vn<? super C409101iT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = room;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C409101iT c409101iT = new C409101iT(this.LLILLL, interfaceC1364105Vn);
        c409101iT.LLILLJJLI = obj;
        return c409101iT;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r19
            java.lang.String r10 = "SubOnlyLiveSettingDialogVM@b5ff.callUpdateBtnLiveSubOnlyApi$1$1$1$2"
            X.C1C7U.LIZ(r10)
            java.lang.Object r4 = X.C099R.LJFF()
            r5 = r18
            int r0 = r5.LL
            r3 = 0
            r2 = 3
            r7 = 2
            r15 = 1
            if (r0 == 0) goto L28
            if (r0 == r15) goto L51
            if (r0 == r7) goto L89
            if (r0 != r2) goto Lab
            java.lang.Object r8 = r5.LLILLJJLI
            X.C155000ia.LIZIZ(r1)
        L20:
            X.00o6 r0 = X.C189200o6.m1boximpl(r8)
            X.C1C7U.LIZIZ(r10)
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            com.bytedance.android.livesdkapi.depend.model.live.Room r6 = r5.LLILLL
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Throwable -> L5b
            java.lang.Class<com.bytedance.android.live.adminsetting.RoomSwitchApi> r0 = com.bytedance.android.live.adminsetting.RoomSwitchApi.class
            r1.getClass()     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r11 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Throwable -> L5b
            com.bytedance.android.live.adminsetting.RoomSwitchApi r11 = (com.bytedance.android.live.adminsetting.RoomSwitchApi) r11     // Catch: java.lang.Throwable -> L5b
            long r12 = r6.getId()     // Catch: java.lang.Throwable -> L5b
            r14 = 11
            r16 = 0
            X.11NZ r0 = r11.updateSwitch(r12, r14, r15, r16)     // Catch: java.lang.Throwable -> L5b
            r5.LL = r15     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r1 = X.C11UD.LIZLLL(r0, r5)     // Catch: java.lang.Throwable -> L5b
            if (r1 != r4) goto L54
            goto Lb3
        L51:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L5b
        L54:
            r8 = r1
            X.0Icr r8 = (X.C470590Icr) r8     // Catch: java.lang.Throwable -> L5b
            X.C189200o6.m2constructorimpl(r8)     // Catch: java.lang.Throwable -> L5b
            goto L67
        L5b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r8 = new X.00Yq
            r8.<init>(r0)
            X.C189200o6.m2constructorimpl(r8)
        L67:
            com.bytedance.android.livesdkapi.depend.model.live.Room r9 = r5.LLILLL
            boolean r0 = X.C189200o6.m8isSuccessimpl(r8)
            if (r0 == 0) goto L8e
            r6 = r8
            X.0Icr r6 = (X.C470590Icr) r6
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.01iR r0 = new X.01iR
            r0.<init>(r6, r9, r3)
            r5.LLILLJJLI = r8
            r5.LL = r7
            java.lang.Object r0 = X.C23250099c.LJI(r5, r1, r0)
            if (r0 != r4) goto L8e
            X.C1C7U.LIZIZ(r10)
            return r4
        L89:
            java.lang.Object r8 = r5.LLILLJJLI
            X.C155000ia.LIZIZ(r1)
        L8e:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r8)
            if (r0 == 0) goto L20
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.01iS r0 = new X.01iS
            r0.<init>(r3)
            r5.LLILLJJLI = r8
            r5.LL = r2
            java.lang.Object r0 = X.C23250099c.LJI(r5, r1, r0)
            if (r0 != r4) goto L20
            X.C1C7U.LIZIZ(r10)
            return r4
        Lab:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb3:
            X.C1C7U.LIZIZ(r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C409101iT.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C470590Icr<Object>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
