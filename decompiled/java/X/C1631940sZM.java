package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sZM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.ui.MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt$provideEffectDownloadObservable$2$downloadEffectRes$1$finish$1$1$1", f = "MusicAndEffectDownloadExtension.kt", l = {}, m = "invokeSuspend")
public final class C1631940sZM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Effect LL;
    public final /* synthetic */ C11PR<C1661140tKS> LLILLJJLI;
    public final /* synthetic */ C09AJ<C1661050tKJ> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1631940sZM(Effect effect, C11PR<C1661140tKS> c11pr, C09AJ<C1661050tKJ> c09aj, InterfaceC1364105Vn<? super C1631940sZM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = effect;
        this.LLILLJJLI = c11pr;
        this.LLILLL = c09aj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1631940sZM(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectDownloadObservable$2$downloadEffectRes$1$finish$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1631990sZR.LIZIZ(this.LLILLJJLI, this.LLILLL, this.LL, true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectDownloadObservable$2$downloadEffectRes$1$finish$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
