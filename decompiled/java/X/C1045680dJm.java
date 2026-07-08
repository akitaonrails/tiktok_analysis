package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.vast.model.AdVerification;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0dJm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045680dJm {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(Aweme aweme) {
        if (!AwemeExtKt.isAdTraffic(aweme) || aweme.getAwemeRawAd().getOmVast() == null || C1045030dIj.LIZ(aweme) == null || C1045030dIj.LIZ(aweme) == null) {
            return false;
        }
        return true;
    }

    public static String LIZLLL(Aweme aweme) {
        AdVerification adVerificationLIZ;
        String str;
        if (!LIZIZ(aweme) || (adVerificationLIZ = C1045030dIj.LIZ(aweme)) == null || (str = adVerificationLIZ.javascriptResource) == null) {
            return "";
        }
        return str;
    }

    public static String LJ(Aweme aweme) {
        AdVerification adVerificationLIZ;
        String str;
        if (!LIZIZ(aweme) || (adVerificationLIZ = C1045030dIj.LIZ(aweme)) == null || (str = adVerificationLIZ.vender) == null) {
            return "";
        }
        return str;
    }

    public static boolean LIZ(int i, int i2, View view) {
        if (view.getHeight() > i * 0.8f && view.getWidth() > i2 * 0.8f) {
            return true;
        }
        return false;
    }

    public static List LIZJ(int i, int i2, View view) {
        ArrayList arrayList = new ArrayList();
        if (LIZ(i, i2, view)) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
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
