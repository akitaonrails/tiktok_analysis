package X;

import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictData;

/* JADX INFO: renamed from: X.0vUL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage", f = "DistrictFragment.kt", l = {2033}, m = "updateUI")
public final class C1744150vUL extends AbstractC23140094w {
    public DistrictData LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ DistrictPage LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1744150vUL(DistrictPage districtPage, InterfaceC1364105Vn<? super C1744150vUL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = districtPage;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DistrictPage@aef9.updateUI$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objAS = this.LLILZIL.aS(null, 0, this);
        C1C7U.LIZIZ("DistrictPage@aef9.updateUI$1");
        return objAS;
    }
}
