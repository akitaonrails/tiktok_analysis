package X;

import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;

/* JADX INFO: renamed from: X.0vSx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage", f = "DistrictFragment.kt", l = {2115}, m = "onItemClick")
public final class C1743290vSx extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ DistrictPage LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1743290vSx(DistrictPage districtPage, InterfaceC1364105Vn<? super C1743290vSx> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = districtPage;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DistrictPage@aef9.onItemClick$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVR = this.LLILLJJLI.VR(null, false, this);
        C1C7U.LIZIZ("DistrictPage@aef9.onItemClick$1");
        return objVR;
    }
}
