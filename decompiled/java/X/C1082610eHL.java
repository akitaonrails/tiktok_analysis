package X;

import com.bytedance.android.livesdk.dataChannel.PublicScreenHeightInsufficient;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGiftTrayRequestOptFirstLayoutSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0eHL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1082610eHL extends C2217421BqW implements InterfaceC1685420txc<Integer, Boolean, Boolean, Boolean, Boolean, Unit> {
    public C1082610eHL(C1082620eHM c1082620eHM) {
        super(5, c1082620eHM, C1082620eHM.class, "onBottomSectionLayoutChange", "onBottomSectionLayoutChange$liveroomfunction_impl_release(IZZZZ)V", 0);
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        int iIntValue = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        boolean zBooleanValue3 = bool3.booleanValue();
        boolean zBooleanValue4 = bool4.booleanValue();
        C1082620eHM c1082620eHM = (C1082620eHM) this.receiver;
        if (!zBooleanValue2 || (!c1082620eHM.LLJZ && !C500260Jjc.LJJJI((Boolean) c1082620eHM.LL.getDataChannel().gg0(PublicScreenHeightInsufficient.class)))) {
            c1082620eHM.LLJJJ = iIntValue;
            c1082620eHM.LLJJJJLIIL = zBooleanValue;
            c1082620eHM.LLJLL = zBooleanValue3;
            c1082620eHM.LLJLLIL = zBooleanValue4;
            ConstraintProperty constraintPropertyById = c1082620eHM.LL.getConstraintPropertyById(c1082620eHM.getId());
            if (constraintPropertyById != null) {
                c1082620eHM.LIZLLL(constraintPropertyById);
            }
            if (LiveGiftTrayRequestOptFirstLayoutSetting.INSTANCE.getValue()) {
                C1082620eHM.LIZJ(c1082620eHM, false, !c1082620eHM.LLJLLL, 1);
            } else {
                C1082620eHM.LIZJ(c1082620eHM, false, false, 3);
            }
            c1082620eHM.LLJLLL = false;
        }
        return Unit.LIZ;
    }
}
