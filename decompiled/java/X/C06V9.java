package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.assem.PcsServicePlusOptinLoadingAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06V9, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06V9 extends C09AY implements Function2<UIAssem, EnumC1823680xYc, Unit> {
    public final /* synthetic */ PcsServicePlusOptinLoadingAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06V9(PcsServicePlusOptinLoadingAssem pcsServicePlusOptinLoadingAssem) {
        super(2);
        this.LL = pcsServicePlusOptinLoadingAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, EnumC1823680xYc enumC1823680xYc) {
        if (enumC1823680xYc == EnumC1823680xYc.LOADING) {
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
