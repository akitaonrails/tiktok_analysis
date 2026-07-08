package X;

import Y.AComparatorS25S0000000_6;
import android.content.Context;
import android.text.style.ClickableSpan;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0Gwg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431920Gwg {
    public static final ClickableSpan LIZ(ClickableSpan[] clickableSpanArr, Context context) {
        if (clickableSpanArr.length > 1) {
            AComparatorS25S0000000_6 aComparatorS25S0000000_6 = new AComparatorS25S0000000_6(8);
            if (clickableSpanArr.length > 1) {
                Arrays.sort(clickableSpanArr, aComparatorS25S0000000_6);
            }
        }
        if (context == null) {
            return clickableSpanArr[0];
        }
        ArrayList arrayList = new ArrayList();
        for (ClickableSpan clickableSpan : clickableSpanArr) {
            if (clickableSpan instanceof AbstractC431930Gwh) {
                clickableSpan.getClass();
            }
            arrayList.add(clickableSpan);
        }
        if (arrayList.isEmpty()) {
            return clickableSpanArr[0];
        }
        return (ClickableSpan) ListProtector.get(arrayList, 0);
    }
}
