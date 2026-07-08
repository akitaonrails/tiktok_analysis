package Y;

import X.C2188811AlT;
import X.C529740Kq4;
import X.C529760Kq6;
import X.C529770Kq7;
import X.C529810KqB;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AObjectS70S0201000_8 implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS70S0201000_8 aObjectS70S0201000_8) {
        C529760Kq6 c529760Kq6 = (C529760Kq6) aObjectS70S0201000_8.l0;
        int i = aObjectS70S0201000_8.i2;
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) aObjectS70S0201000_8.l1;
        c529760Kq6.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("user selected item, position(include header) = ");
        sbLIZ.append(i);
        sbLIZ.append(", choosePhotoScene=");
        sbLIZ.append(c529760Kq6.LLIZLLLIL.LLJLILLLLZIIL);
        sbLIZ.append(", model = ");
        sbLIZ.append(tikTokMediaModel);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AObjectS70S0201000_8 aObjectS70S0201000_8) {
        C529760Kq6 c529760Kq6 = (C529760Kq6) aObjectS70S0201000_8.l0;
        int i = aObjectS70S0201000_8.i2;
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) aObjectS70S0201000_8.l1;
        c529760Kq6.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("user clicked item, position(include header) = ");
        sbLIZ.append(i);
        sbLIZ.append(", choosePhotoScene=");
        sbLIZ.append(c529760Kq6.LLIZLLLIL.LLJLILLLLZIIL);
        sbLIZ.append(", model = ");
        sbLIZ.append(tikTokMediaModel);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AObjectS70S0201000_8 aObjectS70S0201000_8) {
        C529770Kq7 c529770Kq7 = (C529770Kq7) aObjectS70S0201000_8.l0;
        int i = aObjectS70S0201000_8.i2;
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) aObjectS70S0201000_8.l1;
        c529770Kq7.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("user clicked item, position(include header) = ");
        sbLIZ.append(i);
        sbLIZ.append(", choosePhotoScene=");
        sbLIZ.append(c529770Kq7.LLIZLLLIL.LLJLILLLLZIIL);
        sbLIZ.append(", model = ");
        sbLIZ.append(tikTokMediaModel);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AObjectS70S0201000_8 aObjectS70S0201000_8) {
        C529810KqB c529810KqB = (C529810KqB) aObjectS70S0201000_8.l0;
        int i = aObjectS70S0201000_8.i2;
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) aObjectS70S0201000_8.l1;
        c529810KqB.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("user selected item, position(include header) = ");
        sbLIZ.append(i);
        sbLIZ.append(", choosePhotoScene=");
        sbLIZ.append(c529810KqB.LLIZ.LLJLILLLLZIIL);
        sbLIZ.append(", model = ");
        sbLIZ.append(tikTokMediaModel);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AObjectS70S0201000_8 aObjectS70S0201000_8) {
        C529740Kq4 c529740Kq4 = (C529740Kq4) aObjectS70S0201000_8.l0;
        int i = aObjectS70S0201000_8.i2;
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) aObjectS70S0201000_8.l1;
        c529740Kq4.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("user clicked item, position(include header) = ");
        sbLIZ.append(i);
        sbLIZ.append(", choosePhotoScene=");
        sbLIZ.append(c529740Kq4.LLJLILLLLZIIL);
        sbLIZ.append(", model = ");
        sbLIZ.append(tikTokMediaModel);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AObjectS70S0201000_8(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
