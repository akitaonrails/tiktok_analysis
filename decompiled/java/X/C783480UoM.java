package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayPriceColorSetting;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0UoM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C783480UoM {
    public static final /* synthetic */ int LIZ = 0;

    public static final long LIZLLL(int i) {
        if (i <= 70) {
            return 2000L;
        }
        if (i < 1751) {
            return 3000L;
        }
        if (1751 > i) {
            return 2000L;
        }
        if (i < 5201) {
            return 4000L;
        }
        return i < 17501 ? Mp4ScreenVideoLoadTimeout.CONTROL : i < 300001 ? 6000L : 7000L;
    }

    public static Drawable LIZIZ(int i, List list) {
        LinkedList linkedList = new LinkedList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            linkedList.addLast(Integer.valueOf(ColorProtector.parseColor((String) it2.next())));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, C13LP.LLII(linkedList));
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        return gradientDrawable;
    }

    public static final Drawable LIZJ(int i, Context context) {
        if (i <= 499) {
            return context.getDrawable(R.drawable.drx);
        }
        if (i <= 9999) {
            return context.getDrawable(R.drawable.dry);
        }
        return context.getDrawable(R.drawable.drw);
    }

    public static final Drawable LIZ(int i, int i2, Context context, boolean z) {
        int iIntValue;
        if (z) {
            if (i <= 499) {
                Drawable drawable = context.getDrawable(R.drawable.ds0);
                if (drawable == null) {
                    return LIZIZ(i2, C1697810uHb.LJIIJJI("#99000000", "#33000000"));
                }
                return drawable;
            }
            if (i <= 9999) {
                Drawable drawable2 = context.getDrawable(R.drawable.ds1);
                if (drawable2 != null) {
                    return drawable2;
                }
                return LIZIZ(i2, C1697810uHb.LJIIJJI("#99000000", "#33000000"));
            }
            Drawable drawable3 = context.getDrawable(R.drawable.drz);
            if (drawable3 != null) {
                return drawable3;
            }
            return LIZIZ(i2, C1697810uHb.LJIIJJI("#99000000", "#33000000"));
        }
        Map<String, List<String>> value = LiveGiftTrayPriceColorSetting.INSTANCE.getValue();
        String str = "1";
        for (String str2 : value.keySet()) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(str2);
            if (numLJIIJJI != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = 0;
            }
            if (iIntValue <= i && iIntValue > CastIntegerProtector.parseInt(str)) {
                str = str2;
            }
        }
        List<String> listLJIIJJI = value.get(str);
        if (listLJIIJJI == null) {
            listLJIIJJI = C1697810uHb.LJIIJJI("#99000000", "#33000000");
        }
        return LIZIZ(i2, listLJIIJJI);
    }
}
