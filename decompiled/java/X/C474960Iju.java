package X;

import android.widget.CompoundButton;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Iju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.locationservice.ShowLocationUtil$initLocationSwitchInterval$2$clickListener$1$onClick$1$1", f = "ShowLocationUtil.kt", l = {289}, m = "invokeSuspend")
public final class C474960Iju extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DataChannel LLILLJJLI;
    public final /* synthetic */ CompoundButton LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C474960Iju(DataChannel dataChannel, CompoundButton compoundButton, InterfaceC1364105Vn<? super C474960Iju> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dataChannel;
        this.LLILLL = compoundButton;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C474960Iju(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[Catch: Exception -> 0x0073, TryCatch #0 {Exception -> 0x0073, blocks: (B:21:0x004a, B:22:0x004d, B:23:0x004f, B:25:0x0055, B:26:0x005d, B:28:0x0068, B:31:0x006f, B:9:0x001d, B:11:0x0021, B:13:0x002b, B:15:0x002f, B:16:0x0037), top: B:36:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[Catch: Exception -> 0x0073, TryCatch #0 {Exception -> 0x0073, blocks: (B:21:0x004a, B:22:0x004d, B:23:0x004f, B:25:0x0055, B:26:0x005d, B:28:0x0068, B:31:0x006f, B:9:0x001d, B:11:0x0021, B:13:0x002b, B:15:0x002f, B:16:0x0037), top: B:36:0x000d }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "ShowLocationUtil@5031.initLocationSwitchInterval$2$clickListener$1$onClick$1$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r6.LL
            r0 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 != r3) goto L12
            goto L4a
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1a:
            X.C155000ia.LIZIZ(r7)
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r6.LLILLJJLI     // Catch: java.lang.Exception -> L73
            if (r2 == 0) goto L4f
            java.lang.Class<X.0TeM> r1 = X.C751800TeM.class
            java.lang.Object r2 = r2.gg0(r1)     // Catch: java.lang.Exception -> L73
            X.0Tpw r2 = (X.C758980Tpw) r2     // Catch: java.lang.Exception -> L73
            if (r2 == 0) goto L4f
            android.widget.CompoundButton r1 = r6.LLILLL     // Catch: java.lang.Exception -> L73
            if (r1 == 0) goto L42
            boolean r1 = r1.isChecked()     // Catch: java.lang.Exception -> L73
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L73
        L37:
            boolean r1 = X.C500260Jjc.LJJIFFI(r1)     // Catch: java.lang.Exception -> L73
            r6.LL = r3     // Catch: java.lang.Exception -> L73
            java.lang.Object r7 = r2.LJIILLIIL(r1, r6)     // Catch: java.lang.Exception -> L73
            goto L44
        L42:
            r1 = r0
            goto L37
        L44:
            if (r7 != r4) goto L4d
            X.C1C7U.LIZIZ(r5)
            return r4
        L4a:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Exception -> L73
        L4d:
            X.0Icr r7 = (X.C470590Icr) r7     // Catch: java.lang.Exception -> L73
        L4f:
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r6.LLILLJJLI     // Catch: java.lang.Exception -> L73
            android.widget.CompoundButton r1 = r6.LLILLL     // Catch: java.lang.Exception -> L73
            if (r1 == 0) goto L5d
            boolean r0 = r1.isChecked()     // Catch: java.lang.Exception -> L73
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L73
        L5d:
            boolean r0 = X.C500260Jjc.LJJIFFI(r0)     // Catch: java.lang.Exception -> L73
            X.C475020Ik0.LIZIZ(r3, r0, r2)     // Catch: java.lang.Exception -> L73
            android.widget.CompoundButton r1 = r6.LLILLL     // Catch: java.lang.Exception -> L73
            if (r1 == 0) goto L7d
            boolean r0 = r1.isChecked()     // Catch: java.lang.Exception -> L73
            if (r0 == 0) goto L6f
            r3 = 0
        L6f:
            r1.setChecked(r3)     // Catch: java.lang.Exception -> L73
            goto L7d
        L73:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 2131842705(0x7f115691, float:1.9318754E38)
            X.C766270U4b.LIZLLL(r0)
        L7d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C474960Iju.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
