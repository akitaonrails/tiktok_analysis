package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0cHl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListViewHolder$bindUiState$1$stateFlow$1", f = "CommerceMusicSubstituteMusicListViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C1005990cHl extends C09AX implements InterfaceC1631620sYq<C1006040cHq, Integer, InterfaceC1364105Vn<? super C1839120xxW>, Object> {
    public /* synthetic */ C1006040cHq LL;
    public /* synthetic */ int LLILLJJLI;

    public C1005990cHl(InterfaceC1364105Vn<? super C1005990cHl> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceMusicSubstituteMusicListViewHolder@a057.bindUiState$1$stateFlow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(this.LLILLJJLI, this.LL.LIZ);
        C1C7U.LIZIZ("CommerceMusicSubstituteMusicListViewHolder@a057.bindUiState$1$stateFlow$1");
        return objLJJJLZIJ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1006040cHq c1006040cHq, Integer num, InterfaceC1364105Vn<? super C1839120xxW> interfaceC1364105Vn) {
        int iIntValue = num.intValue();
        C1005990cHl c1005990cHl = new C1005990cHl(interfaceC1364105Vn);
        c1005990cHl.LL = c1006040cHq;
        c1005990cHl.LLILLJJLI = iIntValue;
        return c1005990cHl.invokeSuspend(Unit.LIZ);
    }
}
