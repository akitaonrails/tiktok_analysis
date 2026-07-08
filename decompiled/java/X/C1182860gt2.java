package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizToastModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gt2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182860gt2 {
    public static final C1182860gt2 LIZ = new C1182860gt2();

    public static void LIZJ(C1389890mGx c1389890mGx, PoiQuizToastModel poiQuizToastModel) {
        c1389890mGx.LJFF(R.raw.icon_exclamation_mark_circle_fill);
        c1389890mGx.LJII(R.attr.a1h);
        c1389890mGx.LJIIJ(poiQuizToastModel.toastText);
        c1389890mGx.LJ(Integer.valueOf(R.style.y0));
        c1389890mGx.LJIIJJI();
    }

    public static void LIZ(C1389910mGz c1389910mGz, PoiQuizToastModel poiQuizToastModel, Function0 function0) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_exclamation_mark_circle_fill;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c1389910mGz.LJIIL(c419910GdJ);
        AwS227S0300000_18 awS227S0300000_18 = new AwS227S0300000_18(c1389910mGz, poiQuizToastModel, function0, 67);
        C1360890lWB c1360890lWB = c1389910mGz.LIZ;
        c1360890lWB.LJ = awS227S0300000_18;
        c1360890lWB.LIZIZ = 4;
        c1360890lWB.LIZLLL = 3;
        c1389910mGz.LJIIJ(poiQuizToastModel.toastText);
        c1389910mGz.LJI(R.style.y0);
        c1389910mGz.LJIIJJI();
    }

    public static void LIZIZ(Activity activity, List list, EnumC1178460glw enumC1178460glw, Function0 function0) {
        Object next;
        if (activity != null && list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((PoiQuizToastModel) next).scene, enumC1178460glw.getValue())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PoiQuizToastModel poiQuizToastModel = (PoiQuizToastModel) next;
            if (poiQuizToastModel != null) {
                String str = poiQuizToastModel.style;
                if (Intrinsics.LJFF(str, EnumC341510Da9.TOP_TOAST.getValue())) {
                    LIZJ(new C1389890mGx(activity), poiQuizToastModel);
                } else {
                    if (!Intrinsics.LJFF(str, EnumC341510Da9.BOTTOM_TOAST.getValue())) {
                        return;
                    }
                    LIZ(new C1389910mGz(activity), poiQuizToastModel, function0);
                }
            }
        }
    }
}
