package X;

import com.ss.android.ugc.aweme.music.model.IFetchSimilarMusicCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.service.MusicDetailService$findSimilarMusic$1$1", f = "MusicDetailService.kt", l = {}, m = "invokeSuspend")
public final class C1165280gQg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IFetchSimilarMusicCallback LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165280gQg(IFetchSimilarMusicCallback iFetchSimilarMusicCallback, InterfaceC1364105Vn<? super C1165280gQg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iFetchSimilarMusicCallback;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1165280gQg(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicDetailService@ecb.findSimilarMusic$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.onStart();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicDetailService@ecb.findSimilarMusic$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
