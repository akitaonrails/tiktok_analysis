package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01iV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM$callUpdateBtnLiveSubOnlyApi$1$1$1$1", f = "SubOnlyLiveSettingDialogVM.kt", l = {247, 250, 254}, m = "invokeSuspend")
public final class C409301iV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C470590Icr<Object>>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Room LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ SubOnlyLiveSettingDialogVM LLILZLL;
    public final /* synthetic */ DataChannel LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C409301iV(Room room, int i, long j, SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM, DataChannel dataChannel, InterfaceC1364105Vn<? super C409301iV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = room;
        this.LLILZ = i;
        this.LLILZIL = j;
        this.LLILZLL = subOnlyLiveSettingDialogVM;
        this.LLIZ = dataChannel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C409301iV c409301iV = new C409301iV(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c409301iV.LLILLJJLI = obj;
        return c409301iV;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r4 = r16
            java.lang.String r7 = "SubOnlyLiveSettingDialogVM@b5ff.callUpdateBtnLiveSubOnlyApi$1$1$1$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r1 = X.C099R.LJFF()
            int r3 = r15.LL
            r2 = 3
            r0 = 2
            r12 = 1
            if (r3 == 0) goto L25
            if (r3 == r12) goto L4e
            if (r3 == r0) goto L8b
            if (r3 != r2) goto Lb0
            java.lang.Object r5 = r15.LLILLJJLI
            X.C155000ia.LIZIZ(r4)
        L1d:
            X.00o6 r0 = X.C189200o6.m1boximpl(r5)
            X.C1C7U.LIZIZ(r7)
            return r0
        L25:
            X.C155000ia.LIZIZ(r4)
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r15.LLILLL
            int r11 = r15.LLILZ
            long r13 = r15.LLILZIL
            X.0Ism r4 = X.C480460Ism.LIZ()     // Catch: java.lang.Throwable -> L58
            java.lang.Class<com.bytedance.android.live.adminsetting.RoomSwitchApi> r3 = com.bytedance.android.live.adminsetting.RoomSwitchApi.class
            r4.getClass()     // Catch: java.lang.Throwable -> L58
            java.lang.Object r8 = X.C480460Ism.LIZLLL(r3)     // Catch: java.lang.Throwable -> L58
            com.bytedance.android.live.adminsetting.RoomSwitchApi r8 = (com.bytedance.android.live.adminsetting.RoomSwitchApi) r8     // Catch: java.lang.Throwable -> L58
            long r9 = r5.getId()     // Catch: java.lang.Throwable -> L58
            X.11NZ r3 = r8.updateSwitch(r9, r11, r12, r13)     // Catch: java.lang.Throwable -> L58
            r15.LL = r12     // Catch: java.lang.Throwable -> L58
            java.lang.Object r4 = X.C11UD.LIZLLL(r3, r15)     // Catch: java.lang.Throwable -> L58
            if (r4 != r1) goto L51
            goto Lb8
        L4e:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L58
        L51:
            r5 = r4
            X.0Icr r5 = (X.C470590Icr) r5     // Catch: java.lang.Throwable -> L58
            X.C189200o6.m2constructorimpl(r5)     // Catch: java.lang.Throwable -> L58
            goto L64
        L58:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.00Yq r5 = new X.00Yq
            r5.<init>(r3)
            X.C189200o6.m2constructorimpl(r5)
        L64:
            com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM r9 = r15.LLILZLL
            com.bytedance.android.livesdkapi.depend.model.live.Room r11 = r15.LLILLL
            com.bytedance.ies.sdk.datachannel.DataChannel r12 = r15.LLIZ
            boolean r3 = X.C189200o6.m8isSuccessimpl(r5)
            if (r3 == 0) goto L90
            r10 = r5
            X.0Icr r10 = (X.C470590Icr) r10
            X.1DFH r3 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0JZb r8 = new X.0JZb
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r15.LLILLJJLI = r5
            r15.LL = r0
            java.lang.Object r0 = X.C23250099c.LJI(r15, r3, r8)
            if (r0 != r1) goto L90
            X.C1C7U.LIZIZ(r7)
            return r1
        L8b:
            java.lang.Object r5 = r15.LLILLJJLI
            X.C155000ia.LIZIZ(r4)
        L90:
            com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM r6 = r15.LLILZLL
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r5)
            if (r0 == 0) goto L1d
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r4 = X.C2107308Nj.LIZ
            X.01iX r3 = new X.01iX
            r0 = 0
            r3.<init>(r6, r0)
            r15.LLILLJJLI = r5
            r15.LL = r2
            java.lang.Object r0 = X.C23250099c.LJI(r15, r4, r3)
            if (r0 != r1) goto L1d
            X.C1C7U.LIZIZ(r7)
            return r1
        Lb0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb8:
            X.C1C7U.LIZIZ(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C409301iV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C470590Icr<Object>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
