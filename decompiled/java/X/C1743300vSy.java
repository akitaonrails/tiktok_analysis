package X;

import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;

/* JADX INFO: renamed from: X.0vSy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage", f = "DistrictFragment.kt", l = {1895, 2330, 1954}, m = "requestDistricts")
public final class C1743300vSy extends AbstractC23140094w {
    public int LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ DistrictPage LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1743300vSy(DistrictPage districtPage, InterfaceC1364105Vn<? super C1743300vSy> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = districtPage;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DistrictPage@aef9.requestDistricts$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objWR = this.LLILZIL.WR(this);
        C1C7U.LIZIZ("DistrictPage@aef9.requestDistricts$1");
        return objWR;
    }
}
