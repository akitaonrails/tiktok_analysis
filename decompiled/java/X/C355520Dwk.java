package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Dwk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C355520Dwk extends C09AY implements Function1<C348100Dkm, Unit> {
    public final /* synthetic */ FilterBean LL;
    public final /* synthetic */ FilterBean LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ C1455870nzN<T> LLILZ;
    public final /* synthetic */ C358650E4h LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C355520Dwk(FilterBean filterBean, FilterBean filterBean2, float f, C1455870nzN<T> c1455870nzN, C358650E4h c358650E4h) {
        super(1);
        this.LL = filterBean;
        this.LLILLJJLI = filterBean2;
        this.LLILLL = f;
        this.LLILZ = c1455870nzN;
        this.LLILZIL = c358650E4h;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C348100Dkm c348100Dkm) {
        C348290Dl5 c348290Dl5 = new C348290Dl5(EnumC356230Dxt.COLOR_NO_COMPOSER);
        FilterBean filterBean = this.LL;
        FilterBean filterBean2 = this.LLILLJJLI;
        float f = this.LLILLL;
        C1455870nzN<T> c1455870nzN = this.LLILZ;
        C358650E4h c358650E4h = this.LLILZIL;
        c348290Dl5.LIZIZ = filterBean.getFilterFolder();
        c348290Dl5.LJ = filterBean2.getFilterFolder();
        c348290Dl5.LJII = filterBean.getResId();
        c348290Dl5.LJI = f;
        c348290Dl5.LIZLLL = true;
        c348290Dl5.LIZJ = C1453210nv5.LIZLLL(filterBean, c1455870nzN.k5().getValue().LIZ(filterBean, c358650E4h), c358650E4h);
        c348290Dl5.LJFF = C1453210nv5.LIZLLL(filterBean2, c1455870nzN.k5().getValue().LIZ(filterBean2, c358650E4h), c358650E4h);
        c348100Dkm.LJII().LJJJ(c348290Dl5);
        return Unit.LIZ;
    }
}
