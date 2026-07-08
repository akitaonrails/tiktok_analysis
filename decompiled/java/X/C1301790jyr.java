package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.cells.AlphaPlayerVideoFileModel;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.cells.LoadingV2Cell;

/* JADX INFO: renamed from: X.0jyr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.cells.LoadingV2Cell", f = "LoadingV2Cell.kt", l = {247, 248}, m = "obtainDataSource")
public final class C1301790jyr extends AbstractC23140094w {
    public AlphaPlayerVideoFileModel LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LoadingV2Cell LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1301790jyr(LoadingV2Cell loadingV2Cell, InterfaceC1364105Vn<? super C1301790jyr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = loadingV2Cell;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoadingV2Cell@95b8.obtainDataSource$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objP5 = this.LLILLL.P5(null, this);
        C1C7U.LIZIZ("LoadingV2Cell@95b8.obtainDataSource$1");
        return objP5;
    }
}
