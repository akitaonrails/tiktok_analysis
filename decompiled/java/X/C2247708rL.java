package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08rL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectManager$fetchVoiceEffectWithCategory$1$1$2", f = "AudioEffectManager.kt", l = {}, m = "invokeSuspend")
public final class C2247708rL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC2247808rM LL;
    public final /* synthetic */ RuntimeException LLILLJJLI;
    public final /* synthetic */ C2299808zk LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2247708rL(InterfaceC2247808rM interfaceC2247808rM, RuntimeException runtimeException, C2299808zk c2299808zk, long j, InterfaceC1364105Vn<? super C2247708rL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC2247808rM;
        this.LLILLJJLI = runtimeException;
        this.LLILLL = c2299808zk;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2247708rL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AudioEffectManager@e377.fetchVoiceEffectWithCategory$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC2247808rM interfaceC2247808rM = this.LL;
        String str = "Unknown Error";
        if (interfaceC2247808rM != null) {
            String message = this.LLILLJJLI.getMessage();
            if (message == null) {
                message = "Unknown Error";
            }
            interfaceC2247808rM.LIZIZ(-99999, message);
        }
        C2281251EQx.LIZ.LJII("changer_voice", "", "", false);
        String str2 = this.LLILLL.LIZ;
        long j = this.LLILZ;
        String message2 = this.LLILLJJLI.getMessage();
        if (message2 != null) {
            str = message2;
        }
        C2299808zk.LIZLLL(1, j, -99999, str2, str);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AudioEffectManager@e377.fetchVoiceEffectWithCategory$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
