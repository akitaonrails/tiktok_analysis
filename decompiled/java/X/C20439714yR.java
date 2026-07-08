package X;

import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14yR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.collect.CollectMusicManager$initCollectMusicList$1", f = "CollectMusicManager.kt", l = {}, m = "invokeSuspend")
public final class C20439714yR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C20440014yU LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20439714yR(int i, String str, C20440014yU c20440014yU, InterfaceC1364105Vn<? super C20439714yR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = c20440014yU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20439714yR(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("CollectMusicManager@c42d.initCollectMusicList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMusicService iMusicService = (IMusicService) ServiceManager.get().getService(IMusicService.class);
        int i = this.LL;
        String str2 = this.LLILLJJLI;
        IFavoriteService iFavoriteService = (IFavoriteService) this.LLILLL.LJIIIZ.getValue();
        if (iFavoriteService != null && iFavoriteService.LJJIL()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C15O7 c15o7LJJIII = iMusicService.LJJIII(0, 12, i, false, str2, str, null);
        if (c15o7LJJIII != null) {
            c15o7LJJIII.LIZLLL(new C20749016Hg(this.LLILLL, 0));
        }
        this.LLILLL.LJ = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CollectMusicManager@c42d.initCollectMusicList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
