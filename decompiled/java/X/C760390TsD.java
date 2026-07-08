package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TsD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.playbook.PlaybookViewModel$onPlaybookStartSuccess$1", f = "PlaybookViewModel.kt", l = {377, 380, 383}, m = "invokeSuspend")
public final class C760390TsD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DataChannel LLILLJJLI;
    public final /* synthetic */ C0UPF LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760390TsD(C0UPF c0upf, DataChannel dataChannel, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dataChannel;
        this.LLILLL = c0upf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760390TsD(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "PlaybookViewModel@e436.onPlaybookStartSuccess$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r10.LL
            r5 = 0
            java.lang.String r7 = "PlayBookViewModel"
            r3 = 3
            r6 = 2
            r8 = 1
            if (r0 == 0) goto L22
            if (r0 == r8) goto L61
            if (r0 == r6) goto L99
            if (r0 != r3) goto Lb7
            X.C155000ia.LIZIZ(r11)
        L1c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L22:
            X.C155000ia.LIZIZ(r11)
            com.bytedance.android.live.liveinteract.api.IInteractService r1 = X.C781270Ukn.LJIILJJIL()
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r10.LLILLJJLI
            X.0UTJ r0 = r1.Pl1(r0)
            if (r0 == 0) goto L5e
            java.util.List r2 = r0.LJIIZILJ()
            if (r2 == 0) goto L5e
        L37:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onPlaybookStartSuccess, effectIdList: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r7, r0)
            com.bytedance.android.live.effect.api.IEffectService r0 = X.C781270Ukn.LJI()
            X.0UEA r0 = r0.getLiveEffectController()
            r10.LL = r8
            java.lang.Object r11 = r0.LJ(r2, r10)
            if (r11 != r4) goto L64
            X.C1C7U.LIZIZ(r9)
            return r4
        L5e:
            X.13BV r2 = X.C13BV.INSTANCE
            goto L37
        L61:
            X.C155000ia.LIZIZ(r11)
        L64:
            java.util.List r11 = (java.util.List) r11
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onPlaybookStartSuccess, effectList: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r7, r0)
            java.lang.Object r2 = X.C13LP.LJJJLL(r11)
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r2 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r2
            if (r2 == 0) goto L1c
            com.bytedance.android.live.effect.api.IEffectService r0 = X.C781270Ukn.LJI()
            X.0UEA r1 = r0.getLiveEffectController()
            java.lang.String r0 = r2.getResourceId()
            r10.LL = r6
            java.lang.Object r11 = r1.LIZ(r0, r10)
            if (r11 != r4) goto L9c
            X.C1C7U.LIZIZ(r9)
            return r4
        L99:
            X.C155000ia.LIZIZ(r11)
        L9c:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r11 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r11
            if (r11 == 0) goto L1c
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0TsE r1 = new X.0TsE
            X.0UPF r0 = r10.LLILLL
            r1.<init>(r0, r11, r5)
            r10.LL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r10, r2, r1)
            if (r0 != r4) goto L1c
            X.C1C7U.LIZIZ(r9)
            return r4
        Lb7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C760390TsD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
