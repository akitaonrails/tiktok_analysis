package X;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Icon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;

/* JADX INFO: renamed from: X.038L, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C038L {
    public static Image LIZIZ(Icon icon, Context context) {
        Image icon2;
        if (C1744700vVE.LJ(context, null)) {
            icon2 = icon.getIconDark();
        } else {
            icon2 = icon.getIcon();
        }
        if (icon2 == null) {
            return icon.getIcon();
        }
        return icon2;
    }

    public static final Integer LIZ(CustomColor customColor, Context context, Boolean bool) {
        try {
            if (C1744700vVE.LJ(context, bool)) {
                String str = customColor.darkColor;
                if (str != null) {
                    return Integer.valueOf(Color.parseColor(str));
                }
            } else {
                String str2 = customColor.color;
                if (str2 != null) {
                    return Integer.valueOf(Color.parseColor(str2));
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }
}
