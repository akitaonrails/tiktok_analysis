package X;

import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.FamilyPairingVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07vO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2018007vO extends C2217421BqW implements Function1<C07VU, Unit> {
    public C2018007vO(Object obj) {
        super(1, obj, FamilyPairingVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/content/cell/FamilyPairingCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07VU c07vu) {
        C07VU c07vu2 = c07vu;
        this.receiver.getClass();
        if (c07vu2 instanceof C07VT) {
            Context context = ((C07VT) c07vu2).LIZ;
            if (context != null) {
                ComplianceServiceProvider.LJIIJJI().LJIILLIIL(C1388190mED.LIZ(context), "", false);
            }
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
