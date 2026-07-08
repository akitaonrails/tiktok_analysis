package X;

import com.ss.android.ugc.aweme.commercialize.media.impl.utils.ScopedMusicPlayer;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Xs5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.media.impl.viewmodel.RecommendMusicV2ViewModel$bindUiState$1$1", f = "RecommendMusicV2ViewModel.kt", l = {70}, m = "invokeSuspend")
public final class C862230Xs5 extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super AbstractC1839080xxS>, ScopedMusicPlayer, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ ScopedMusicPlayer LLILLL;

    public C862230Xs5(InterfaceC1364105Vn<? super C862230Xs5> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecommendMusicV2ViewModel@69e3.bindUiState$1$1");
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
            InterfaceC346701Wf interfaceC346701Wf = this.LLILLJJLI;
            AnonymousClass0951 anonymousClass0951LIZIZ = C09IC.LIZIZ(this.LLILLL.LLILLL);
            this.LLILLJJLI = null;
            this.LL = 1;
            if (C09IC.LJIILLIIL(this, anonymousClass0951LIZIZ, interfaceC346701Wf) == objLJFF) {
                C1C7U.LIZIZ("RecommendMusicV2ViewModel@69e3.bindUiState$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecommendMusicV2ViewModel@69e3.bindUiState$1$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super AbstractC1839080xxS> interfaceC346701Wf, ScopedMusicPlayer scopedMusicPlayer, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C862230Xs5 c862230Xs5 = new C862230Xs5(interfaceC1364105Vn);
        c862230Xs5.LLILLJJLI = interfaceC346701Wf;
        c862230Xs5.LLILLL = scopedMusicPlayer;
        return c862230Xs5.invokeSuspend(Unit.LIZ);
    }
}
