package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0O31, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.movie.anchor.MovieTokAnchorBusinessService$handleIconClick$1$1$2", f = "MovieTokAnchorBusinessService.kt", l = {}, m = "invokeSuspend")
public final class C0O31 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C613440O4g LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ AnchorCommonStruct LLILZ;
    public final /* synthetic */ C0O7A<? extends C0O3E> LLILZIL;
    public final /* synthetic */ InterfaceC497601wk LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O31(C0O7A c0o7a, AnchorCommonStruct anchorCommonStruct, C613440O4g c613440O4g, String str, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC497601wk interfaceC497601wk, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c613440O4g;
        this.LLILLL = str;
        this.LLILZ = anchorCommonStruct;
        this.LLILZIL = c0o7a;
        this.LLILZLL = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        boolean z = this.LL;
        C613440O4g c613440O4g = this.LLILLJJLI;
        String str = this.LLILLL;
        return new C0O31(this.LLILZIL, this.LLILZ, c613440O4g, str, interfaceC1364105Vn, this.LLILZLL, z);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        String keyword;
        String str;
        String str2;
        String str3;
        BaseResponse baseResponse;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        C1C7U.LIZ("MovieTokAnchorBusinessService@ff9f.handleIconClick$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!Intrinsics.LJFF(Boolean.valueOf(this.LL), this.LLILLJJLI.LIZIZ)) {
            this.LLILLJJLI.LIZIZ = Boolean.valueOf(this.LL);
            C613440O4g c613440O4g = this.LLILLJJLI;
            String str4 = this.LLILLL;
            Boolean bool = c613440O4g.LIZIZ;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = this.LL;
            }
            c613440O4g.LJIIL(Boolean.valueOf(zBooleanValue), str4);
            boolean zBooleanValue2 = this.LLILLJJLI.LIZIZ.booleanValue();
            String str5 = this.LLILLL;
            AnchorCommonStruct anchorCommonStruct = this.LLILZ;
            if (anchorCommonStruct == null || (keyword = anchorCommonStruct.getKeyword()) == null) {
                keyword = "";
            }
            C0O3E c0o3e = (C0O3E) ((C0O79) this.LLILZIL).LJ;
            if (zBooleanValue2) {
                str = "favorite_topic";
            } else {
                str = "cancel_favorite_movie";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (zBooleanValue2) {
                str2 = "favorite_from";
            } else {
                str2 = "cancel_from";
            }
            c2344009Gk.LJIIIIZZ(str2, "movie_panel_show");
            c2344009Gk.LJIIIIZZ("movie_id", str5);
            c2344009Gk.LJIIIIZZ("movie_title", keyword);
            c2344009Gk.LJIIIIZZ("category", "movie");
            if ((c0o3e instanceof C613300O3s) && (baseResponse = ((C613300O3s) c0o3e).LIZ) != null && (serverTimeExtra = baseResponse.extra) != null) {
                str3 = serverTimeExtra.logid;
            } else {
                str3 = null;
            }
            LogPbBean logPbBean = new LogPbBean();
            logPbBean.setImprId(str3);
            c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZ(logPbBean));
            C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
        }
        C2296808zG.LIZJ(this.LLILZLL, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MovieTokAnchorBusinessService@ff9f.handleIconClick$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
