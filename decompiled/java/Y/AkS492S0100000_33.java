package Y;

import X.C2177071AIf;
import X.C2177171AIp;
import X.InterfaceC1487280oo2;
import android.graphics.Bitmap;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes34.dex */
public class AkS492S0100000_33 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public AkS492S0100000_33(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS492S0100000_33 akS492S0100000_33, Object obj) {
        ArrayList arrayList = new ArrayList();
        C2177071AIf c2177071AIf = (C2177071AIf) akS492S0100000_33.l0;
        int i = 0;
        for (Object obj2 : (Object[]) obj) {
            if (obj2 instanceof Bitmap) {
                i++;
                arrayList.add(obj2);
            } else {
                arrayList.add(c2177071AIf.LJIIIIZZ());
            }
        }
        Bitmap bitmapLJFF = ((C2177071AIf) akS492S0100000_33.l0).LJFF(arrayList);
        if (i == ((C2177071AIf) akS492S0100000_33.l0).LJI()) {
            C2177071AIf c2177071AIf2 = (C2177071AIf) akS492S0100000_33.l0;
            c2177071AIf2.LJJIJIL = "complete";
            if (c2177071AIf2.LJIIJ) {
                C2177171AIp.LIZ.LIZ(bitmapLJFF, c2177071AIf2.LJIILJJIL());
            }
        }
        return bitmapLJFF;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object apply$1(Y.AkS492S0100000_33 r32, java.lang.Object r33) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AkS492S0100000_33.apply$1(Y.AkS492S0100000_33, java.lang.Object):java.lang.Object");
    }
}
