package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.share.settings.EnhanceSharePanelUIConfig;
import com.ss.android.ugc.aweme.share.settings.ImSectionConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0leT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1366030leT {
    public static final C1366030leT LIZ = new C1366030leT();
    public static final AtomicInteger LIZIZ = new AtomicInteger();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(507));

    public static boolean LJI() {
        C844470XAv.LIZ.getClass();
        return C14KQ.LJ(C844470XAv.LIZ()) < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(OppoPermissionPopupMaskDelayExp.DEFAULT)));
    }

    public static int LJ() {
        Context contextLIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ == null || (contextLIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        return Math.min(C12ES.LJIIJ(contextLIZ), C12ES.LJIIIIZZ(contextLIZ));
    }

    public static int LIZ(Integer num) {
        int iIntValue;
        int iIntValue2;
        Integer num2;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = LIZIZ.get();
        }
        if (iIntValue == 0) {
            Keva keva = (Keva) LIZJ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key_im_contact_size_");
            sbLIZ.append(C461720I8s.LIZIZ());
            iIntValue = keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        }
        int i = iIntValue + 1;
        ImSectionConfig imSectionConfigLIZJ = C1371040lmY.LIZJ();
        if (imSectionConfigLIZJ != null && (num2 = imSectionConfigLIZJ.verticalImRowCount) != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 4;
        }
        return (int) Math.ceil((((double) i) * 1.0d) / ((double) iIntValue2));
    }

    public static int LIZLLL(Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 71;
        }
        C844470XAv.LIZ.getClass();
        TuxTextView tuxTextView = new TuxTextView(C844470XAv.LIZ(), null, 6, 0);
        tuxTextView.setTuxFont(iIntValue);
        tuxTextView.setMaxLines(2);
        tuxTextView.setMinLines(2);
        tuxTextView.setText(" \n ");
        tuxTextView.measure(0, 0);
        return tuxTextView.getMeasuredHeight();
    }

    public static boolean LJFF(Integer num) {
        float fFloatValue;
        float fFloatValue2;
        Float f;
        Float f2;
        EnhanceSharePanelUIConfig enhanceSharePanelUIConfigLIZIZ = C1371040lmY.LIZIZ();
        if (enhanceSharePanelUIConfigLIZIZ != null && (f2 = enhanceSharePanelUIConfigLIZIZ.prohibitHandleDeviceScore) != null) {
            fFloatValue = f2.floatValue();
        } else {
            fFloatValue = -1.0f;
        }
        ImSectionConfig imSectionConfigLIZJ = C1371040lmY.LIZJ();
        if (imSectionConfigLIZJ != null && (f = imSectionConfigLIZJ.defaultMaxDisplayScale) != null) {
            fFloatValue2 = f.floatValue();
        } else {
            fFloatValue2 = 1.9f;
        }
        if (LIZ(num) > fFloatValue2) {
            C0CF8.LIZ.getClass();
            if (C0CF8.LIZ() >= fFloatValue) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static int LIZJ(C1362230lYL c1362230lYL, Integer num) {
        int iIntValue;
        Integer num2 = c1362230lYL.LJ;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        return LIZIZ(iIntValue, c1362230lYL.LJIIL, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), LIZLLL(c1362230lYL.LJIIZILJ), c1362230lYL.LJIJJLI, num);
    }

    public static int LIZIZ(int i, int i2, int i3, int i4, int i5, Integer num) {
        float fFloatValue;
        Float f;
        int iLIZ = LIZ(num);
        ImSectionConfig imSectionConfigLIZJ = C1371040lmY.LIZJ();
        if (imSectionConfigLIZJ != null && (f = imSectionConfigLIZJ.defaultMaxDisplayScale) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.9f;
        }
        if (iLIZ > fFloatValue) {
            return (int) (i + (i2 * fFloatValue) + ((i3 + i4 + i5) * ((float) Math.floor(fFloatValue))));
        }
        return -2;
    }
}
