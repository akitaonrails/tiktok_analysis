package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0Qm9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.suggest.api.EcSearchHistoryWordsApi", f = "EcSearchHistoryWordsApi.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "fetchHistoryWordsWithImage")
public final class C680190Qm9 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C680200QmA LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C680190Qm9(C680200QmA c680200QmA, InterfaceC1364105Vn<? super C680190Qm9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c680200QmA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcSearchHistoryWordsApi@fd18.fetchHistoryWordsWithImage$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("EcSearchHistoryWordsApi@fd18.fetchHistoryWordsWithImage$1");
        return objLIZ;
    }
}
