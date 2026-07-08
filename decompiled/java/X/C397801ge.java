package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.Iterator;

/* JADX INFO: renamed from: X.01ge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C397801ge {
    public static final C054G LIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));

    public static final C099G LIZ(Bitmap bitmap, ImageView imageView) {
        Object next;
        int iIntValue;
        Object next2;
        int iIntValue2 = 0;
        Iterator it2 = C1697810uHb.LJIIJJI(Integer.valueOf((imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight()), Integer.valueOf((imageView.getMeasuredWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight())).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((Number) next).intValue() > 0) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Iterator it3 = C1697810uHb.LJIIJJI(Integer.valueOf((imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom()), Integer.valueOf((imageView.getMeasuredHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom())).iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (((Number) next2).intValue() > 0) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        Integer num2 = (Integer) next2;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        return C23250099c.LIZIZ(LIZ, null, null, new C01OX(iIntValue, iIntValue2, bitmap, null), 3);
    }
}
