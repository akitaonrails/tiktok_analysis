package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dr2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.audio.copyrightdetect.NLEAudioUtils$extractAudioList$2$deferredList$1$1", f = "NLEAudioUtils.kt", l = {47}, m = "invokeSuspend")
public final class C351980Dr2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ C351990Dr3 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C351980Dr2(C351990Dr3 c351990Dr3, InterfaceC1364105Vn<? super C351980Dr2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c351990Dr3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C351980Dr2(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("NLEAudioUtils@9f2b.extractAudioList$2$deferredList$1$1");
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
            C352190DrN c352190DrN = C352190DrN.LIZ;
            C351990Dr3 c351990Dr3 = this.LLILLJJLI;
            String str = c351990Dr3.LIZ;
            long j = c351990Dr3.LIZIZ;
            long j2 = c351990Dr3.LIZJ;
            this.LL = 1;
            c352190DrN.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C352200DrO(str, j, j2, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("NLEAudioUtils@9f2b.extractAudioList$2$deferredList$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("NLEAudioUtils@9f2b.extractAudioList$2$deferredList$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
