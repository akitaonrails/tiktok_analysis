package Y;

import X.C1428470nHB;
import X.C1428780nHg;
import X.C1428790nHh;
import X.C1455250nyN;
import X.C1455260nyO;
import X.InterfaceC1487280oo2;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: loaded from: classes23.dex */
public class AkS328S0200000_22 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS328S0200000_22 akS328S0200000_22, Object obj) {
        C1428780nHg c1428780nHg = (C1428780nHg) akS328S0200000_22.l0;
        C1428790nHh c1428790nHh = (C1428790nHh) akS328S0200000_22.l1;
        c1428780nHg.getClass();
        return C1428780nHg.LIZJ((C1428790nHh) obj, c1428790nHh);
    }

    public static final Object apply$1(AkS328S0200000_22 akS328S0200000_22, Object obj) {
        Bitmap bitmapJ = (Bitmap) obj;
        InterfaceC1487280oo2 interfaceC1487280oo2 = (InterfaceC1487280oo2) akS328S0200000_22.l0;
        VideoPublishEditModel videoPublishEditModel = ((C1455260nyO) akS328S0200000_22.l1).LLLFZ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        if (C1428470nHB.LLIIIJ(videoPublishEditModel)) {
            bitmapJ = ((C1455260nyO) akS328S0200000_22.l1).j(bitmapJ);
        }
        return Bitmap.createScaledBitmap((Bitmap) interfaceC1487280oo2.apply(bitmapJ), 270, 480, true);
    }

    public static final Object apply$2(AkS328S0200000_22 akS328S0200000_22, Object obj) {
        Bitmap bitmapLLLZIIL = (Bitmap) obj;
        InterfaceC1487280oo2 interfaceC1487280oo2 = (InterfaceC1487280oo2) akS328S0200000_22.l0;
        if (C1428470nHB.LLIIIJ(((C1455250nyN) akS328S0200000_22.l1).getEditModel())) {
            bitmapLLLZIIL = ((C1455250nyN) akS328S0200000_22.l1).LLLZIIL(bitmapLLLZIIL);
        }
        return Bitmap.createScaledBitmap((Bitmap) interfaceC1487280oo2.apply(bitmapLLLZIIL), 270, 480, true);
    }

    public AkS328S0200000_22(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
