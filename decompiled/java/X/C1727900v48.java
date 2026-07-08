package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.PcsCountryInputCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0v48, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1727900v48 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsCountryInputCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1727900v48(PcsCountryInputCell pcsCountryInputCell) {
        super(0);
        this.LL = pcsCountryInputCell;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String selectedCountry;
        PcsCountryInputCell pcsCountryInputCell = this.LL;
        C1727880v46 c1727880v46 = pcsCountryInputCell.LLILZIL;
        if (c1727880v46 == null || (selectedCountry = c1727880v46.getSelectedCountry()) == null) {
            selectedCountry = "";
        }
        pcsCountryInputCell.T5(selectedCountry);
        return Unit.LIZ;
    }
}
