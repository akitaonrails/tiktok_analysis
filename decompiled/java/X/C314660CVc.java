package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CVc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.portrait.matting.AIMattingFetcher$fetchAIMattingModels$disposable$1$1", f = "AIMattingFetcher.kt", l = {67}, m = "invokeSuspend")
public final class C314660CVc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0E48 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314660CVc(C0E48 c0e48, InterfaceC1364105Vn<? super C314660CVc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0e48;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314660CVc(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AIMattingFetcher@f0c9.fetchAIMattingModels$disposable$1$1");
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
            C0E48 c0e48 = this.LLILLJJLI;
            this.LL = 1;
            Object objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C353510DtV(c0e48, null));
            if (objLJI != C099R.LJFF()) {
                objLJI = Unit.LIZ;
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("AIMattingFetcher@f0c9.fetchAIMattingModels$disposable$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIMattingFetcher@f0c9.fetchAIMattingModels$disposable$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
