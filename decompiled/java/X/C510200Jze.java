package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubPrivilegeDetailPopup;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.common.PrivilegeBottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510200Jze extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ SubPrivilegeDetailPopup LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C510200Jze(SubPrivilegeDetailPopup subPrivilegeDetailPopup) {
        super(1);
        this.LL = subPrivilegeDetailPopup;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        PrivilegeBottomSheetBehavior<ConstraintLayout> privilegeBottomSheetBehavior = this.LL.LLJI;
        if (privilegeBottomSheetBehavior != null) {
            privilegeBottomSheetBehavior.LJJJI = zBooleanValue;
        }
        return Unit.LIZ;
    }
}
