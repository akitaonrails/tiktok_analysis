package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sZK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.ui.MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt$provideEffectDownloadObservable$2$downloadEffectRes$1$finish$1$1", f = "MusicAndEffectDownloadExtension.kt", l = {494, 499}, m = "invokeSuspend")
public final class C1631920sZK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1635410sex LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;
    public final /* synthetic */ C11PR<C1661140tKS> LLILZ;
    public final /* synthetic */ C09AJ<C1661050tKJ> LLILZIL;
    public final /* synthetic */ IAVEffectService LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Map<String, String> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1631920sZK(InterfaceC1635410sex interfaceC1635410sex, Effect effect, C11PR<C1661140tKS> c11pr, C09AJ<C1661050tKJ> c09aj, IAVEffectService iAVEffectService, String str, Map<String, String> map, InterfaceC1364105Vn<? super C1631920sZK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1635410sex;
        this.LLILLL = effect;
        this.LLILZ = c11pr;
        this.LLILZIL = c09aj;
        this.LLILZLL = iAVEffectService;
        this.LLIZ = str;
        this.LLIZLLLIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1631920sZK(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectDownloadObservable$2$downloadEffectRes$1$finish$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectDownloadObservable$2$downloadEffectRes$1$finish$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectDownloadObservable$2$downloadEffectRes$1$finish$1$1");
            return unit2;
        }
        C155000ia.LIZIZ(obj);
        if (this.LLILLJJLI.LJIIIIZZ(this.LLILLL)) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1631940sZM c1631940sZM = new C1631940sZM(this.LLILLL, this.LLILZ, this.LLILZIL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1631940sZM) == objLJFF) {
                C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectDownloadObservable$2$downloadEffectRes$1$finish$1$1");
                return objLJFF;
            }
            Unit unit22 = Unit.LIZ;
            C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectDownloadObservable$2$downloadEffectRes$1$finish$1$1");
            return unit22;
        }
        C1DFH c1dfh2 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
        C1631930sZL c1631930sZL = new C1631930sZL(this.LLILLJJLI, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLILZ, this.LLILZIL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq2, c1631930sZL) == objLJFF) {
            C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectDownloadObservable$2$downloadEffectRes$1$finish$1$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectDownloadObservable$2$downloadEffectRes$1$finish$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
