package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Dm4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348900Dm4 extends C09AY implements Function1<C348100Dkm, Unit> {
    public final /* synthetic */ FilterBean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ float LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C348900Dm4(float f, FilterBean filterBean, boolean z) {
        super(1);
        this.LL = filterBean;
        this.LLILLJJLI = z;
        this.LLILLL = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C348100Dkm c348100Dkm) {
        C348100Dkm c348100Dkm2 = c348100Dkm;
        if (c348100Dkm2.LJ().LIZIZ() != null) {
            c348100Dkm2.LJ().LJIJ(null, true, false);
        }
        C348290Dl5 c348290Dl5 = new C348290Dl5(EnumC356230Dxt.COLOR_NO_COMPOSER);
        c348290Dl5.LIZIZ = this.LL.getFilterFolder();
        boolean z = this.LLILLJJLI;
        if (z) {
            c348290Dl5.LIZJ = this.LLILLL;
        } else {
            c348290Dl5.LIZJ = 1.0f;
        }
        c348290Dl5.LIZLLL = z;
        c348290Dl5.LJII = this.LL.getResId();
        c348100Dkm2.LJII().LJJJ(c348290Dl5);
        return Unit.LIZ;
    }
}
