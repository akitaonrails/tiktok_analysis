package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0gkq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitRepository$operator$1", f = "PoiRevisitRepository.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "fetchPoiCardList")
public final class C1177780gkq extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1177770gkp LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1177780gkq(C1177770gkp c1177770gkp, InterfaceC1364105Vn<? super C1177780gkq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1177770gkp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiRevisitRepository@d94.operator$1$fetchPoiCardList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJJJJJL(null, null, this);
        C1C7U.LIZIZ("PoiRevisitRepository@d94.operator$1$fetchPoiCardList$1");
        return objLJJJJJL;
    }
}
