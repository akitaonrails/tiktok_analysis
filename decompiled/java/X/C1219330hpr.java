package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hpr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.svc.StreamVoiceChanger$startVoiceChangeByStream$2$1$1", f = "StreamVoiceChanger.kt", l = {}, m = "invokeSuspend")
public final class C1219330hpr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1219340hps LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219330hpr(InterfaceC1219340hps interfaceC1219340hps, String str, InterfaceC1364105Vn<? super C1219330hpr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1219340hps;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1219330hpr(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreamVoiceChanger@6d6a.startVoiceChangeByStream$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZLLL(3, new C19536611c4((Map) null, (List) null, 11, 14));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreamVoiceChanger@6d6a.startVoiceChangeByStream$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
