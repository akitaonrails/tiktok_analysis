package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hpk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.VoiceChanger$prefetchVoiceChange$1", f = "VoiceChanger.kt", l = {501}, m = "invokeSuspend")
public final class C1219260hpk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1219270hpl LLILLJJLI;
    public final /* synthetic */ C19536511c3 LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219260hpk(InterfaceC1219270hpl interfaceC1219270hpl, C19536511c3 c19536511c3, String str, InterfaceC1364105Vn<? super C1219260hpk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1219270hpl;
        this.LLILLL = c19536511c3;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1219260hpk(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("VoiceChanger@2446.prefetchVoiceChange$1");
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
            InterfaceC1219270hpl interfaceC1219270hpl = this.LLILLJJLI;
            if (interfaceC1219270hpl != null) {
                interfaceC1219270hpl.onStart();
            }
            C1DFH c1dfh = C0PEM.LIZ;
            C1219250hpj c1219250hpj = new C1219250hpj(this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfh, c1219250hpj);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VoiceChanger@2446.prefetchVoiceChange$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            InterfaceC1219270hpl interfaceC1219270hpl2 = this.LLILLJJLI;
            if (interfaceC1219270hpl2 != null) {
                interfaceC1219270hpl2.onSuccess();
            }
        } else {
            InterfaceC1219270hpl interfaceC1219270hpl3 = this.LLILLJJLI;
            if (interfaceC1219270hpl3 != null) {
                interfaceC1219270hpl3.onFailed();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VoiceChanger@2446.prefetchVoiceChange$1");
        return unit;
    }
}
