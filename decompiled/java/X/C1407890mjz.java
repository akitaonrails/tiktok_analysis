package X;

import com.ss.android.ugc.aweme.ecommerce.compliance.utils.ComplianceDialogActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0mjz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.compliance.utils.ComplianceDialogActivity$initDialog$6", f = "ComplianceDialogActivity.kt", l = {142}, m = "invokeSuspend")
public final class C1407890mjz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ComplianceDialogActivity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407890mjz(ComplianceDialogActivity complianceDialogActivity, InterfaceC1364105Vn<? super C1407890mjz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = complianceDialogActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407890mjz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zLJFF;
        C1C7U.LIZ("ComplianceDialogActivity@8dc9.initDialog$6");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1735240vFy c1735240vFy = C1735240vFy.LIZ;
            C1407900mk0 c1407900mk0 = (C1407900mk0) this.LLILLJJLI.LLJJI.getValue();
            if (c1407900mk0 != null) {
                zLJFF = Intrinsics.LJFF(c1407900mk0.dialogExposureSave, true);
            } else {
                zLJFF = false;
            }
            this.LL = 1;
            if (c1735240vFy.LIZ(zLJFF, this) == objLJFF) {
                C1C7U.LIZIZ("ComplianceDialogActivity@8dc9.initDialog$6");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ComplianceDialogActivity@8dc9.initDialog$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
