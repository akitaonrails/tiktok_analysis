package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sZL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.ui.MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt$provideEffectDownloadObservable$2$downloadEffectRes$1$finish$1$1$2", f = "MusicAndEffectDownloadExtension.kt", l = {}, m = "invokeSuspend")
public final class C1631930sZL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1635410sex LL;
    public final /* synthetic */ IAVEffectService LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ C11PR<C1661140tKS> LLILZIL;
    public final /* synthetic */ C09AJ<C1661050tKJ> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1631930sZL(InterfaceC1635410sex interfaceC1635410sex, IAVEffectService iAVEffectService, String str, Map<String, String> map, C11PR<C1661140tKS> c11pr, C09AJ<C1661050tKJ> c09aj, InterfaceC1364105Vn<? super C1631930sZL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1635410sex;
        this.LLILLJJLI = iAVEffectService;
        this.LLILLL = str;
        this.LLILZ = map;
        this.LLILZIL = c11pr;
        this.LLILZLL = c09aj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1631930sZL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectDownloadObservable$2$downloadEffectRes$1$finish$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IAVEffectService iAVEffectService = this.LLILLJJLI;
        String str = this.LLILLL;
        Map<String, String> map = this.LLILZ;
        C11PR<C1661140tKS> c11pr = this.LLILZIL;
        C09AJ<C1661050tKJ> c09aj = this.LLILZLL;
        InterfaceC1635410sex interfaceC1635410sex = this.LL;
        C1631960sZO c1631960sZO = new C1631960sZO(c11pr, c09aj);
        if (str != null) {
            iAVEffectService.fetchEffectResource(str, true, map, interfaceC1635410sex, c1631960sZO);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectDownloadObservable$2$downloadEffectRes$1$finish$1$1$2");
            return unit;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
