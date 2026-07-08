package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.PcsPhoneInputCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0v4D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1727950v4D extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsPhoneInputCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1727950v4D(PcsPhoneInputCell pcsPhoneInputCell) {
        super(0);
        this.LL = pcsPhoneInputCell;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String fullPhoneNumber;
        PcsPhoneInputCell pcsPhoneInputCell = this.LL;
        C1727920v4A c1727920v4A = pcsPhoneInputCell.LLILZIL;
        if (c1727920v4A == null || (fullPhoneNumber = c1727920v4A.getFullPhoneNumber()) == null) {
            fullPhoneNumber = "";
        }
        pcsPhoneInputCell.T5(fullPhoneNumber);
        return Unit.LIZ;
    }
}
