package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0cHk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.media.impl.view.recommendv2.RecommendMusicItemViewHolderV2$bindUiState$1$stateFlow$1", f = "RecommendMusicItemViewHolderV2.kt", l = {}, m = "invokeSuspend")
public final class C1005980cHk extends C09AX implements InterfaceC1631620sYq<C1006040cHq, Integer, InterfaceC1364105Vn<? super C1839120xxW>, Object> {
    public /* synthetic */ C1006040cHq LL;
    public /* synthetic */ int LLILLJJLI;

    public C1005980cHk(InterfaceC1364105Vn<? super C1005980cHk> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecommendMusicItemViewHolderV2@a069.bindUiState$1$stateFlow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(this.LLILLJJLI, this.LL.LIZ);
        C1C7U.LIZIZ("RecommendMusicItemViewHolderV2@a069.bindUiState$1$stateFlow$1");
        return objLJJJLZIJ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1006040cHq c1006040cHq, Integer num, InterfaceC1364105Vn<? super C1839120xxW> interfaceC1364105Vn) {
        int iIntValue = num.intValue();
        C1005980cHk c1005980cHk = new C1005980cHk(interfaceC1364105Vn);
        c1005980cHk.LL = c1006040cHq;
        c1005980cHk.LLILLJJLI = iIntValue;
        return c1005980cHk.invokeSuspend(Unit.LIZ);
    }
}
