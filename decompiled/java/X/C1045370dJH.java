package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0dJH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045370dJH {
    public static boolean LIZIZ(Aweme aweme) {
        if (!C1017070cZd.LJJLIIJ(aweme) || aweme.getAwemeRawAd().getOmVast() == null || C1045220dJ2.LIZLLL(aweme) == null || C1045220dJ2.LIZLLL(aweme) == null) {
            return false;
        }
        return true;
    }

    public static String LIZLLL(Aweme aweme) {
        String str;
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str3 = "";
        if (!LIZIZ(aweme)) {
            str = "";
        } else {
            str = C1045220dJ2.LIZLLL(aweme).javascriptResource;
        }
        sbLIZ.append(str);
        if (!LIZIZ(aweme)) {
            str2 = "";
        } else {
            str2 = C1045220dJ2.LIZLLL(aweme).vender;
        }
        sbLIZ.append(str2);
        if (LIZIZ(aweme)) {
            str3 = C1045220dJ2.LIZLLL(aweme).verificationParameters;
        }
        sbLIZ.append(str3);
        return MD5Utils.getMD5String(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static boolean LIZ(int i, int i2, View view) {
        if (view == null || view.getHeight() <= i * 0.8f || view.getWidth() <= i2 * 0.8f) {
            return false;
        }
        return true;
    }

    public static List LIZJ(int i, int i2, View view) {
        ArrayList arrayList = new ArrayList();
        if (LIZ(i, i2, view)) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i3);
                if (LIZ(i, i2, view)) {
                    arrayList.add(childAt);
                }
                arrayList.addAll(LIZJ(i, i2, childAt));
            }
        }
        return arrayList;
    }
}
