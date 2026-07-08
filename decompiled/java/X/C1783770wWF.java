package X;

import Y.AgS210S0200000_27;
import com.ss.android.ugc.aweme.commercialize.media.impl.viewmodel.RecommendMusicV2ViewModel;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wWF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.media.impl.viewmodel.RecommendMusicV2ViewModel$bindUiState$1", f = "RecommendMusicV2ViewModel.kt", l = {70}, m = "invokeSuspend")
public final class C1783770wWF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RecommendMusicV2ViewModel LLILLJJLI;
    public final /* synthetic */ MusicDetail LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783770wWF(RecommendMusicV2ViewModel recommendMusicV2ViewModel, MusicDetail musicDetail, InterfaceC1364105Vn<? super C1783770wWF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = recommendMusicV2ViewModel;
        this.LLILLL = musicDetail;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1783770wWF(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecommendMusicV2ViewModel@69e3.bindUiState$1");
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
            C23123094f c23123094fLJJIZ = C09IC.LJJIZ(new C05RH(this.LLILLJJLI.LLILLL), new C862230Xs5(null));
            AgS210S0200000_27 agS210S0200000_27 = new AgS210S0200000_27(this.LLILLJJLI, this.LLILLL, 1);
            this.LL = 1;
            if (c23123094fLJJIZ.collect(agS210S0200000_27, this) == objLJFF) {
                C1C7U.LIZIZ("RecommendMusicV2ViewModel@69e3.bindUiState$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecommendMusicV2ViewModel@69e3.bindUiState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
