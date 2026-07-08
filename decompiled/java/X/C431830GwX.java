package X;

import android.content.res.Resources;
import android.text.Layout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0GwX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431830GwX {
    public static List LIZ(C444830HcP c444830HcP, Integer num, Integer num2) {
        int iLIZIZ;
        if (num != null) {
            iLIZIZ = num.intValue();
        } else {
            iLIZIZ = C814420VxA.LIZIZ(c444830HcP.LIZ.getTextSize() / Resources.getSystem().getDisplayMetrics().density);
        }
        ArrayList<Pair> arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        do {
            boolean z = C444830HcP.LJIIJJI;
            int iLIZ = C814420VxA.LIZ((0.857354474131783d * iLIZIZ) + 1.38832501234431d);
            int iLIZ2 = iLIZIZ - C814420VxA.LIZ((Math.log(r0) * 1.32113155603272d) - 2.72287181827213d);
            arrayList.add(new Pair(Integer.valueOf(iLIZ), Integer.valueOf(iLIZIZ)));
            i2++;
            iLIZIZ = iLIZ2;
        } while (i2 < 3);
        if (num2 != null && num2.intValue() != 0) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (Pair pair : arrayList) {
                int iIntValue = ((Number) pair.getFirst()).intValue();
                int iIntValue2 = num2.intValue();
                if (iIntValue < iIntValue2) {
                    iIntValue = iIntValue2;
                }
                Integer numValueOf = Integer.valueOf(iIntValue);
                int iIntValue3 = ((Number) pair.getSecond()).intValue();
                int iIntValue4 = num2.intValue();
                if (iIntValue3 < iIntValue4) {
                    iIntValue3 = iIntValue4;
                }
                arrayList2.add(new Pair(numValueOf, Integer.valueOf(iIntValue3)));
            }
            arrayList = new ArrayList(arrayList2);
            int iIntValue5 = ((Number) ((Pair) ListProtector.get(arrayList, 2)).getFirst()).intValue();
            if (iIntValue5 > num2.intValue()) {
                c444830HcP.LJIIIIZZ = C418440Gaw.LIZIZ(Integer.valueOf(iIntValue5));
                Layout layoutLIZLLL = c444830HcP.LIZLLL();
                c444830HcP.LJIIIIZZ = C418440Gaw.LIZIZ(num2);
                int iCeil = (int) Math.ceil((layoutLIZLLL.getHeight() * 1.0f) / c444830HcP.LIZLLL().getHeight());
                int iFloor = (int) Math.floor(((iIntValue5 - num2.intValue()) * 1.0f) / iCeil);
                float fFloor = (float) Math.floor(num2.intValue() / 17.0f);
                while (i < iCeil) {
                    fFloor /= i + 1.0f;
                    int i3 = i + 1;
                    arrayList.add(new Pair(Integer.valueOf(((iCeil - i3) * iFloor) + num2.intValue()), Integer.valueOf(((iCeil - i) * iFloor) + num2.intValue() + C814420VxA.LIZIZ(fFloor))));
                    i = i3;
                }
            }
        }
        return arrayList;
    }
}
