package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hpn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.svc.StreamVoiceChanger$changeEffect$1", f = "StreamVoiceChanger.kt", l = {}, m = "invokeSuspend")
public final class C1219290hpn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19546311dd LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219290hpn(C19546311dd c19546311dd, InterfaceC1364105Vn<? super C1219290hpn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19546311dd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1219290hpn(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1211030hcT c1211030hcT;
        C1C7U.LIZ("StreamVoiceChanger@6d6a.changeEffect$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1219400hpy c1219400hpy = this.LL.LJIILL;
        if (c1219400hpy != null && (c1211030hcT = c1219400hpy.LIZJ) != null) {
            c1211030hcT.LIZJ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreamVoiceChanger@6d6a.changeEffect$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
