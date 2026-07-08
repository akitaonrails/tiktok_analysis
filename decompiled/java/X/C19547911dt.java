package X;

import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11dt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.svc.StreamVCHandler$cancelStream$1", f = "StreamVCHandler.kt", l = {}, m = "invokeSuspend")
public final class C19547911dt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19547811ds LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19547911dt(C19547811ds c19547811ds, InterfaceC1364105Vn<? super C19547911dt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19547811ds;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19547911dt(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreamVCHandler@8f8c.cancelStream$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C201955140j.LIZIZ("VoiceConversionStream", "cancelStream-->begin");
        InterfaceC19548611e0 interfaceC19548611e0 = this.LL.LIZJ;
        if (interfaceC19548611e0 != null) {
            interfaceC19548611e0.LIZ(EnumC19548111dv.CANCEL);
        }
        int iCancelStreamVCConnet = VEUtils.cancelStreamVCConnet(this.LL.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelStream-->cancelStreamVCConnet result:");
        sbLIZ.append(iCancelStreamVCConnet);
        sbLIZ.append(" handler:");
        sbLIZ.append(this.LL.LIZ);
        sbLIZ.append(",id:");
        sbLIZ.append(C786410Ut5.u3().getId());
        C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreamVCHandler@8f8c.cancelStream$1");
        return unit;
    }
}
