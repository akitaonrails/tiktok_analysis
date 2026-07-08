package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0HAs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1.CommerceMusicSubstituteMusicVideoViewHolder$bindUiState$stateFlow$1", f = "CommerceMusicSubstituteMusicVideoViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C436760HAs extends C09AX implements InterfaceC1631620sYq<C436790HAv, Integer, InterfaceC1364105Vn<? super C1786400waU>, Object> {
    public /* synthetic */ C436790HAv LL;
    public /* synthetic */ int LLILLJJLI;

    public C436760HAs(InterfaceC1364105Vn<? super C436760HAs> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceMusicSubstituteMusicVideoViewHolder@7f75.bindUiState$stateFlow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(this.LLILLJJLI, this.LL.LIZ);
        C1C7U.LIZIZ("CommerceMusicSubstituteMusicVideoViewHolder@7f75.bindUiState$stateFlow$1");
        return objLJJJLZIJ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C436790HAv c436790HAv, Integer num, InterfaceC1364105Vn<? super C1786400waU> interfaceC1364105Vn) {
        int iIntValue = num.intValue();
        C436760HAs c436760HAs = new C436760HAs(interfaceC1364105Vn);
        c436760HAs.LL = c436790HAv;
        c436760HAs.LLILLJJLI = iIntValue;
        return c436760HAs.invokeSuspend(Unit.LIZ);
    }
}
