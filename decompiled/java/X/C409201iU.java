package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01iU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM$callUpdateBtnLiveSubOnlyApi$1$1$1", f = "SubOnlyLiveSettingDialogVM.kt", l = {259, 283, 316}, m = "invokeSuspend")
public final class C409201iU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C291001Au<Boolean> LLILZIL;
    public final /* synthetic */ Room LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ SubOnlyLiveSettingDialogVM LLJ;
    public final /* synthetic */ DataChannel LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C409201iU(Boolean bool, boolean z, C291001Au<Boolean> c291001Au, Room room, int i, long j, SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM, DataChannel dataChannel, InterfaceC1364105Vn<? super C409201iU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = bool;
        this.LLILZ = z;
        this.LLILZIL = c291001Au;
        this.LLILZLL = room;
        this.LLIZ = i;
        this.LLIZLLLIL = j;
        this.LLJ = subOnlyLiveSettingDialogVM;
        this.LLJI = dataChannel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C409201iU c409201iU = new C409201iU(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c409201iU.LLILLJJLI = obj;
        return c409201iU;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            java.lang.String r9 = "SubOnlyLiveSettingDialogVM@b5ff.callUpdateBtnLiveSubOnlyApi$1$1$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r6 = X.C099R.LJFF()
            r7 = r18
            int r2 = r7.LL
            r5 = 3
            r0 = 2
            r1 = 1
            r4 = 0
            if (r2 == 0) goto L22
            if (r2 == r1) goto L4e
            if (r2 == r0) goto L7c
            if (r2 != r5) goto Lb4
            X.C155000ia.LIZIZ(r19)
        L1c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L22:
            X.C155000ia.LIZIZ(r19)
            java.lang.Object r8 = r7.LLILLJJLI
            X.01wk r8 = (X.InterfaceC497601wk) r8
            X.01iV r10 = new X.01iV
            com.bytedance.android.livesdkapi.depend.model.live.Room r11 = r7.LLILZLL
            int r12 = r7.LLIZ
            long r13 = r7.LLIZLLLIL
            com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM r15 = r7.LLJ
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r7.LLJI
            r17 = r4
            r16 = r0
            r10.<init>(r11, r12, r13, r15, r16, r17)
            X.099G r0 = X.C23250099c.LIZIZ(r8, r4, r4, r10, r5)
            r7.LLILLJJLI = r8
            r7.LL = r1
            java.lang.Object r0 = r0.LJLIIIL(r7)
            if (r0 != r6) goto L55
            X.C1C7U.LIZIZ(r9)
            return r6
        L4e:
            java.lang.Object r8 = r7.LLILLJJLI
            X.01wk r8 = (X.InterfaceC497601wk) r8
            X.C155000ia.LIZIZ(r19)
        L55:
            java.lang.Boolean r1 = r7.LLILLL
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L83
            X.01iT r1 = new X.01iT
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.LLILZLL
            r1.<init>(r0, r4)
            X.099G r1 = X.C23250099c.LIZIZ(r8, r4, r4, r1, r5)
            r7.LLILLJJLI = r8
            r0 = 2
            r7.LL = r0
            java.lang.Object r0 = r1.LJLIIIL(r7)
            if (r0 != r6) goto L83
            X.C1C7U.LIZIZ(r9)
            return r6
        L7c:
            java.lang.Object r8 = r7.LLILLJJLI
            X.01wk r8 = (X.InterfaceC497601wk) r8
            X.C155000ia.LIZIZ(r19)
        L83:
            boolean r0 = r7.LLILZ
            if (r0 == 0) goto L1c
            X.01Au<java.lang.Boolean> r0 = r7.LLILZIL
            if (r0 == 0) goto Lb2
            T r0 = r0.LIZ
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L8f:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto L1c
            X.01iW r3 = new X.01iW
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r7.LLILZLL
            com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM r1 = r7.LLJ
            X.01Au<java.lang.Boolean> r0 = r7.LLILZIL
            r3.<init>(r2, r1, r0, r4)
            X.099G r0 = X.C23250099c.LIZIZ(r8, r4, r4, r3, r5)
            r7.LLILLJJLI = r4
            r7.LL = r5
            java.lang.Object r0 = r0.LJLIIIL(r7)
            if (r0 != r6) goto L1c
            X.C1C7U.LIZIZ(r9)
            return r6
        Lb2:
            r0 = r4
            goto L8f
        Lb4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C409201iU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
