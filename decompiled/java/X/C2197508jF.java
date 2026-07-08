package X;

import com.ss.android.ugc.aweme.im.push.api.alerttone.model.GetAlertToneResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08jF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.alerttone.helper.AlertToneDataFetcher$fetchAlertConfig$1", f = "AlertToneDataFetcher.kt", l = {77, 81, 83, 87}, m = "invokeSuspend")
public final class C2197508jF extends C09AX implements Function2<InterfaceC346701Wf<? super C189200o6<? extends GetAlertToneResponse>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ EnumC2198508jP LLILZ;
    public final /* synthetic */ C891050YxT LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2197508jF(EnumC2198508jP enumC2198508jP, C891050YxT c891050YxT, InterfaceC1364105Vn<? super C2197508jF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = enumC2198508jP;
        this.LLILZIL = c891050YxT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2197508jF c2197508jF = new C2197508jF(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c2197508jF.LLILLL = obj;
        return c2197508jF;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00b8: INVOKE (r0 I:java.lang.Object) = (r3 I:X.01Wf), (r0 I:java.lang.Object), (r11 I:X.05Vn) INTERFACE call: X.01Wf.emit(java.lang.Object, X.05Vn):java.lang.Object A[MD:(T, X.05Vn<? super kotlin.Unit>):java.lang.Object (m)] (LINE:16777400), block:B:36:0x00a6 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.01Wf] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2197508jF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C189200o6<? extends GetAlertToneResponse>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
