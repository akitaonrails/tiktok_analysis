package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;

/* JADX INFO: renamed from: X.03KA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03KA {
    public static int LIZJ(Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticUIConfig r8, androidx.constraintlayout.widget.ConstraintLayout r9) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03KA.LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticUIConfig, androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    public static final void LIZIZ(TuxIconView tuxIconView, Icon icon, Context context) {
        int iIntValue;
        boolean z;
        Object c098200Yq;
        Image icon2;
        Integer viewWidth = icon.getViewWidth();
        int iIntValue2 = 16;
        if (viewWidth != null) {
            iIntValue = viewWidth.intValue();
        } else {
            iIntValue = 16;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
        Integer viewHeight = icon.getViewHeight();
        if (viewHeight != null) {
            iIntValue2 = viewHeight.intValue();
        }
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2)));
        ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
        layoutParams.width = iLIZIZ;
        layoutParams.height = iLIZIZ2;
        C786410Ut5.W5(tuxIconView, layoutParams);
        String token = icon.getToken();
        if (token != null && token.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            try {
                c098200Yq = C2248361CzK.LJFF(context, token);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            C698190Ra5 c698190Ra5 = (C698190Ra5) c098200Yq;
            if (c698190Ra5 != null) {
                tuxIconView.setIconRes(c698190Ra5.LIZ);
                Integer num = c698190Ra5.LIZIZ;
                if (num != null) {
                    tuxIconView.setTintColor(num.intValue());
                    return;
                } else {
                    tuxIconView.LIZ();
                    return;
                }
            }
        }
        tuxIconView.LIZ();
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        if (C1744700vVE.LJ(context, null)) {
            icon2 = icon.getIconDark();
        } else {
            icon2 = icon.getIcon();
        }
        c1326790kdB.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(icon2);
        c1331670kl3LIZLLL.LJJI(tuxIconView);
        C786410Ut5.h3(c1331670kl3LIZLLL);
    }
}
