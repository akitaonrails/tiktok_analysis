package X;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: renamed from: X.0vxS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1762200vxS {
    public float LIZ = 1.0f;

    public final void LIZ(Image image, View view) {
        Float fValueOf;
        float fFloatValue;
        C19ME c19me;
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name = null;
        if (image != null) {
            fValueOf = Float.valueOf(image.getRadio());
        } else {
            fValueOf = null;
        }
        if (fValueOf != null) {
            fFloatValue = fValueOf.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        float fFloatValue2 = new BigDecimal(String.valueOf(fFloatValue)).setScale(2, RoundingMode.HALF_UP).floatValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            float f = 1.0f / fFloatValue2;
            this.LIZ = f;
            int iLIZ = 0;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService).isPad()) {
                iLIZ = C679280Qkg.LIZ(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            }
            ((ViewGroup.MarginLayoutParams) c19me).height = iLIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("h,");
            sbLIZ.append(f);
            c19me.dimensionRatio = C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
