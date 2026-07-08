package X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAnimationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cYy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1016660cYy {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Interpolator LIZ(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1536602315:
                if (str.equals("TUX_easeOvershoot")) {
                    return C1619980sG4.LJIILJJIL();
                }
                return null;
            case -1243722766:
                if (str.equals("TUX_easeOutCubic")) {
                    return C1619980sG4.LJIIIZ();
                }
                return null;
            case -1230794137:
                if (str.equals("TUX_easeOutQuart")) {
                    return new DecelerateInterpolator(2.0f);
                }
                return null;
            case -1230786573:
                if (str.equals("TUX_easeOutQuint")) {
                    return C1619980sG4.LJIIJJI();
                }
                return null;
            case -824569726:
                if (str.equals("TUX_easeInBack")) {
                    return C0GY9.LIZIZ(0.36f, 0.0f, 0.66f, -0.56f);
                }
                return null;
            case -824457843:
                if (str.equals("TUX_easeInExpo")) {
                    return new AccelerateInterpolator(3.0f);
                }
                return null;
            case -824103710:
                if (str.equals("TUX_easeInQuad")) {
                    return C1619980sG4.LJII();
                }
                return null;
            case -824055256:
                if (str.equals("TUX_easeInSine")) {
                    return C0GY9.LIZIZ(0.12f, 0.0f, 0.39f, 0.0f);
                }
                return null;
            case -165133229:
                if (str.equals("TUX_easeInOut")) {
                    return C1619980sG4.LIZLLL();
                }
                return null;
            case 209660687:
                if (str.equals("TUX_easeInCubic")) {
                    return C1619980sG4.LIZJ();
                }
                return null;
            case 222589316:
                if (str.equals("TUX_easeInQuart")) {
                    return new AccelerateInterpolator(2.0f);
                }
                return null;
            case 222596880:
                if (str.equals("TUX_easeInQuint")) {
                    return new AccelerateInterpolator(2.5f);
                }
                return null;
            case 1038830263:
                if (str.equals("TUX_easeInOutCubic")) {
                    return C1619980sG4.LJ();
                }
                return null;
            case 1051758892:
                if (str.equals("TUX_easeInOutQuart")) {
                    return C0GY9.LIZIZ(0.76f, 0.0f, 0.24f, 1.0f);
                }
                return null;
            case 1051766456:
                if (str.equals("TUX_easeInOutQuint")) {
                    return C0GY9.LIZIZ(0.83f, 0.0f, 0.17f, 1.0f);
                }
                return null;
            case 1483851583:
                if (str.equals("TUX_easeOutBack")) {
                    return C1619980sG4.LJIIIIZZ();
                }
                return null;
            case 1483963466:
                if (str.equals("TUX_easeOutExpo")) {
                    return C1619980sG4.LJIIJ();
                }
                return null;
            case 1484317599:
                if (str.equals("TUX_easeOutQuad")) {
                    return C0GY9.LIZIZ(0.5f, 1.0f, 0.89f, 1.0f);
                }
                return null;
            case 1484366053:
                if (str.equals("TUX_easeOutSine")) {
                    return C1619980sG4.LJIIL();
                }
                return null;
            case 1696141541:
                if (str.equals("TUX_easeInOutExpo")) {
                    return C0GY9.LIZIZ(0.87f, 0.0f, 0.13f, 1.0f);
                }
                return null;
            case 1696495674:
                if (str.equals("TUX_easeInOutQuad")) {
                    return C1619980sG4.LJFF();
                }
                return null;
            case 1696544128:
                if (str.equals("TUX_easeInOutSine")) {
                    return C1619980sG4.LJI();
                }
                return null;
            case 2012213869:
                if (str.equals("TUX_linear")) {
                    return new LinearInterpolator();
                }
                return null;
            case 2141713685:
                if (str.equals("TUX_easeOutStandard")) {
                    return C1619980sG4.LJIILIIL();
                }
                return null;
            default:
                return null;
        }
    }

    public static AnoleComponentAnimationModel LIZIZ(List list) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            AnoleComponentAnimationModel anoleComponentAnimationModel = (AnoleComponentAnimationModel) next;
            if (LIZLLL(anoleComponentAnimationModel) && (C1014540cVY.LIZ(anoleComponentAnimationModel.type) instanceof AbstractC1014550cVZ)) {
                obj = next;
                break;
            }
        }
        return (AnoleComponentAnimationModel) obj;
    }

    public static boolean LIZJ(AnoleComponentAppearModel anoleComponentAppearModel) {
        List<AnoleComponentAnimationModel> list = anoleComponentAppearModel.animations;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (AnoleComponentAnimationModel anoleComponentAnimationModel : list) {
                if (LIZLLL(anoleComponentAnimationModel)) {
                    arrayList.add(anoleComponentAnimationModel);
                }
            }
            return !arrayList.isEmpty();
        }
        return false;
    }

    public static boolean LIZLLL(AnoleComponentAnimationModel anoleComponentAnimationModel) {
        if (anoleComponentAnimationModel.duration > 0) {
            return true;
        }
        return false;
    }

    public static List LJ(AbstractC1014560cVa abstractC1014560cVa, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            AnoleComponentAnimationModel anoleComponentAnimationModel = (AnoleComponentAnimationModel) obj;
            if (LIZLLL(anoleComponentAnimationModel) && Intrinsics.LJFF(C1014540cVY.LIZ(anoleComponentAnimationModel.type), abstractC1014560cVa)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
