package X;

import android.graphics.drawable.GradientDrawable;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.assem.PcsServicePlusOptinBottomAssem;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: renamed from: X.0x9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1808250x9j extends C09AY implements Function2<UIAssem, SMBOptInQualificationResponse.ResponseData, Unit> {
    public final /* synthetic */ PcsServicePlusOptinBottomAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1808250x9j(PcsServicePlusOptinBottomAssem pcsServicePlusOptinBottomAssem) {
        super(2);
        this.LL = pcsServicePlusOptinBottomAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, SMBOptInQualificationResponse.ResponseData responseData) {
        String strLJIJI;
        SMBOptInQualificationResponse.ResponseData responseData2 = responseData;
        C197039127h c197039127h = this.LL.LLJJIJIIJIL;
        if (c197039127h != null) {
            if (responseData2 != null && responseData2.leadsOptInStatus == 1) {
                strLJIJI = C497740JfY.LJIJI(2131856047);
            } else {
                strLJIJI = C497740JfY.LJIJI(2131856046);
            }
            c197039127h.setText(strLJIJI);
            GradientDrawable gradientDrawable = new GradientDrawable();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ey7, c197039127h.getContext());
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
            if (numLIZJ != null) {
                gradientDrawable.setColor(numLIZJ.intValue());
            }
            c197039127h.setBackground(gradientDrawable);
        }
        return Unit.LIZ;
    }
}
