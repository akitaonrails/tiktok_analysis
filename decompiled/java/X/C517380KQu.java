package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioLoadingAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C517380KQu extends C09AY implements Function2<UIAssem, C0KUR, Unit> {
    public final /* synthetic */ PcsServiceBioLoadingAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C517380KQu(PcsServiceBioLoadingAssem pcsServiceBioLoadingAssem) {
        super(2);
        this.LL = pcsServiceBioLoadingAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C0KUR c0kur) {
        if (c0kur == C0KUR.IS_LOADING) {
            C1390410mHn c1390410mHn = this.LL.LLJJIJI;
            if (c1390410mHn != null) {
                c1390410mHn.LIZJ();
            }
            ConstraintLayout constraintLayout = this.LL.LLJJIII;
            if (constraintLayout != null) {
                C500260Jjc.LLFFF(constraintLayout);
            }
        } else {
            C1390410mHn c1390410mHn2 = this.LL.LLJJIJI;
            if (c1390410mHn2 != null) {
                c1390410mHn2.LIZLLL();
            }
            ConstraintLayout constraintLayout2 = this.LL.LLJJIII;
            if (constraintLayout2 != null) {
                C500260Jjc.LJIILIIL(constraintLayout2);
            }
        }
        return Unit.LIZ;
    }
}
