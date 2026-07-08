package X;

import Y.ARunnableS1S3100000_31;
import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14iT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20340714iT extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C20340614iS LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20340714iT(C20340614iS c20340614iS, String str, String str2, String str3) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = c20340614iS;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        boolean z;
        boolean zBooleanValue = bool.booleanValue();
        boolean z2 = true;
        if (2 == C19378910rj.LIZ(this.LL, "SLOT_SHOP_BAG_GUIDE_BUBBLE")) {
            z = true;
        } else {
            z = false;
        }
        if (2 != C19378910rj.LIZ(this.LL, "SLOT_BAG_BUBBLE_SHOW")) {
            z2 = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show isVisible: ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", ");
        sbLIZ.append(C20340514iR.LJFF());
        sbLIZ.append(", ");
        sbLIZ.append(C20340514iR.LIZLLL().Iq());
        sbLIZ.append(',');
        sbLIZ.append(z);
        C20340514iR.LJI(C2188811AlT.LIZIZ(sbLIZ));
        if (zBooleanValue) {
            if (!C20340514iR.LIZLLL().Iq() && !C20340514iR.LJFF() && !z && !z2) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C20437114y1(this.LLILLJJLI, this.LL, this.LLILLL, this.LLILZ, null), 3);
                return Unit.LIZ;
            }
            if (C20340514iR.LIZLLL().Iq()) {
                C1120500fGS.LIZ(EnumC1120490fGR.FAIL_HAS_COMPONENT_CONFLICT);
            } else if (C20340514iR.LJFF()) {
                C1120500fGS.LIZ(EnumC1120490fGR.FAIL_PROMOTION_CONTAINER_OPENING);
            } else if (z || z2) {
                C1120500fGS.LIZ(EnumC1120490fGR.FAIL_OTHER_BUBBLE_OPENING);
            }
        } else {
            C1120500fGS.LIZ(EnumC1120490fGR.FAIL_BAG_ICON_HIDE);
        }
        C20340614iS c20340614iS = this.LLILLJJLI;
        ARunnableS1S3100000_31 aRunnableS1S3100000_31 = new ARunnableS1S3100000_31(c20340614iS, this.LL, this.LLILLL, this.LLILZ, 1);
        C1120500fGS.LIZ(EnumC1120490fGR.ADD_REPEAT_TIMER);
        C786410Ut5.LJLIIL(C1120510fGT.LIZ().interval, (Handler) C20340514iR.LIZIZ.getValue(), aRunnableS1S3100000_31);
        c20340614iS.LIZLLL = aRunnableS1S3100000_31;
        C20340514iR.LJI("show is not match show condition");
        return Unit.LIZ;
    }
}
