package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hpf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.VoiceChanger$startFilterVoiceChange$1", f = "VoiceChanger.kt", l = {416}, m = "invokeSuspend")
public final class C1219210hpf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19536511c3 LLILLJJLI;
    public final /* synthetic */ InterfaceC1219340hps LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219210hpf(C19536511c3 c19536511c3, InterfaceC1219340hps interfaceC1219340hps, String str, int i, InterfaceC1364105Vn<? super C1219210hpf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19536511c3;
        this.LLILLL = interfaceC1219340hps;
        this.LLILZ = str;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1219210hpf(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VoiceChanger@2446.startFilterVoiceChange$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1DFH c1dfh = C0PEM.LIZ;
            C1219240hpi c1219240hpi = new C1219240hpi(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfh, c1219240hpi) == objLJFF) {
                C1C7U.LIZIZ("VoiceChanger@2446.startFilterVoiceChange$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VoiceChanger@2446.startFilterVoiceChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
