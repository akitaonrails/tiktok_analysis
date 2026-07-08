package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O5P, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteRepository$operator$1$mutateFavorite$1$1", f = "VideoFavoriteRepository.kt", l = {}, m = "invokeSuspend")
public final class C0O5P extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0O7A<C0O5L> LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ C0O5K LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ long LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O5P(C0O7A<C0O5L> c0o7a, Function0<Unit> function0, C0O5K c0o5k, Aweme aweme, String str, int i, String str2, boolean z, long j, InterfaceC1364105Vn<? super C0O5P> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0o7a;
        this.LLILLJJLI = function0;
        this.LLILLL = c0o5k;
        this.LLILZ = aweme;
        this.LLILZIL = str;
        this.LLILZLL = i;
        this.LLIZ = str2;
        this.LLIZLLLIL = z;
        this.LLJ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O5P(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BaseResponse baseResponse;
        AwemeStatistics statistics;
        C0O5L c0o5l;
        C1C7U.LIZ("VideoFavoriteRepository@a69d.operator$1$mutateFavorite$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0O79 c0o79 = (C0O79) this.LL;
        if (c0o79 != null && (c0o5l = (C0O5L) c0o79.LJ) != null) {
            baseResponse = c0o5l.LIZ;
        } else {
            baseResponse = null;
        }
        C1206780hVc.LIZJ("/aweme/v1/aweme/collect/", "net", baseResponse);
        Function0<Unit> function0 = this.LLILLJJLI;
        if (function0 != null) {
            function0.invoke();
        } else {
            C0O5K c0o5k = this.LLILLL;
            Aweme aweme = this.LLILZ;
            String str = this.LLILZIL;
            int i = this.LLILZLL;
            boolean z = this.LLIZLLLIL;
            long j = this.LLJ;
            c0o5k.getClass();
            if (aweme.getCollectStatus() != i) {
                aweme.setCollectStatus(i);
                ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Br(i, aweme.getAid());
                if (((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(aweme.getAid()) == null) {
                    if (i == 1) {
                        AwemeStatistics statistics2 = aweme.getStatistics();
                        if (statistics2 != null) {
                            statistics2.setCollectCount(j + 1);
                        }
                        C313310CPx.LIZ.getClass();
                    } else if (j > 0 && (statistics = aweme.getStatistics()) != null) {
                        statistics.setCollectCount(j - 1);
                    }
                }
                C1440005kM.LIZ(new C737030Svd(54, aweme));
                C1440005kM.LIZ(new C731710Sn3(aweme.getAid(), aweme.getCollectStatus(), false));
                C1440005kM.LIZ(new AnonymousClass0345(aweme.getAid(), aweme.getCollectStatus(), aweme.getAwemeType()));
                if (!TextUtils.equals(str, "from_duet_mode") && !TextUtils.equals(str, "from_duet_mode_detail")) {
                    IFavoriteService iFavoriteService = (IFavoriteService) ServiceManager.get().getService(IFavoriteService.class);
                    aweme.getAid();
                    iFavoriteService.LJ();
                }
                if (!Keva.getRepo("collect").getBoolean("first_favourite_success", false) && !z) {
                    Keva.getRepo("collect").storeBoolean("first_favourite_success", true);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoFavoriteRepository@a69d.operator$1$mutateFavorite$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
