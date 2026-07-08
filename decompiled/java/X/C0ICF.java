package X;

import android.util.Size;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.GifCardReusedUISlot;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ICF, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0ICF {
    public static Size LIZ(Integer num, Integer num2, String str) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4 = -1;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = -1;
        }
        if (num != null) {
            iIntValue4 = num.intValue();
        }
        if (iIntValue > 0 && iIntValue4 > 0) {
            if (iIntValue4 >= iIntValue) {
                iIntValue2 = GifCardReusedUISlot.LLJZIJLIL;
                iIntValue3 = (iIntValue2 * iIntValue) / iIntValue4;
            } else {
                iIntValue3 = GifCardReusedUISlot.LLJZIJLIL;
                iIntValue2 = (iIntValue3 * iIntValue4) / iIntValue;
            }
        } else {
            iIntValue2 = 0;
            iIntValue3 = 0;
        }
        if (str != null && (Intrinsics.LJFF(str.toLowerCase(Locale.getDefault()), "gif") || Intrinsics.LJFF(str.toLowerCase(Locale.getDefault()), "webp"))) {
            iIntValue2 = GifCardReusedUISlot.LLLFFI.getValue().intValue();
            if (iIntValue != 0 && iIntValue4 != 0) {
                iIntValue3 = (iIntValue * iIntValue2) / iIntValue4;
            } else {
                iIntValue3 = iIntValue2;
            }
            C01GW<Integer> c01gw = GifCardReusedUISlot.LLLFF;
            if (iIntValue3 > c01gw.getValue().intValue()) {
                float fIntValue = c01gw.getValue().intValue() / iIntValue3;
                iIntValue3 = c01gw.getValue().intValue();
                iIntValue2 = (int) (iIntValue2 * fIntValue);
            }
        }
        return new Size(iIntValue2, iIntValue3);
    }
}
