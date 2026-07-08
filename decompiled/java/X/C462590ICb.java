package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;

/* JADX INFO: renamed from: X.0ICb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462590ICb {
    public static final ShapeDrawable LIZ(C462620ICe c462620ICe, Context context) {
        Integer numValueOf;
        C462630ICf c462630ICf = c462620ICe.LIZ;
        float f = c462630ICf.LIZ;
        int iIntValue = 0;
        float f2 = c462630ICf.LIZIZ;
        float f3 = c462630ICf.LIZJ;
        float f4 = c462630ICf.LIZLLL;
        RoundRectShape roundRectShape = new RoundRectShape(new float[]{f, f, f2, f2, f3, f3, f4, f4}, null, null);
        InterfaceC462610ICd interfaceC462610ICd = c462620ICe.LIZIZ;
        if (interfaceC462610ICd instanceof C0ICR) {
            numValueOf = C1308910kAL.LIZJ(((C0ICR) interfaceC462610ICd).LIZ, context);
        } else if (interfaceC462610ICd instanceof C462600ICc) {
            numValueOf = Integer.valueOf(((C462600ICc) interfaceC462610ICd).LIZ);
        } else {
            throw new C1954807lC();
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
        Paint paint = shapeDrawable.getPaint();
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        }
        paint.setColor(iIntValue);
        return shapeDrawable;
    }

    public static final ShapeDrawable LIZIZ(C462620ICe c462620ICe, View view) {
        return LIZ(c462620ICe, view.getContext());
    }
}
