package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.PcsPhoneInputCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0v49, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1727910v49 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsPhoneInputCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1727910v49(PcsPhoneInputCell pcsPhoneInputCell) {
        super(0);
        this.LL = pcsPhoneInputCell;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws Throwable {
        String fullPhoneNumber;
        PcsPhoneInputCell pcsPhoneInputCell = this.LL;
        C1727920v4A c1727920v4A = pcsPhoneInputCell.LLILZIL;
        if (c1727920v4A == null || (fullPhoneNumber = c1727920v4A.getFullPhoneNumber()) == null) {
            fullPhoneNumber = "";
        }
        if (pcsPhoneInputCell.P5().BQ2(pcsPhoneInputCell.LLILLL, fullPhoneNumber)) {
            C1727920v4A c1727920v4A2 = pcsPhoneInputCell.LLILZIL;
            if (c1727920v4A2 != null) {
                c1727920v4A2.LLILLJJLI.LIZJ();
            }
        } else {
            pcsPhoneInputCell.T5(fullPhoneNumber);
        }
        return Unit.LIZ;
    }
}
