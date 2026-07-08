package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0ibV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248870ibV {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(632));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(633));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(819));

    public static ProfileComponentUIConfig LIZ(String str) {
        if (!((Boolean) LIZ.getValue()).booleanValue() || str == null || str.length() == 0) {
            return null;
        }
        return (ProfileComponentUIConfig) ((Map) LIZJ.getValue()).get(str);
    }

    public static ProfileComponentUIConfig LIZIZ(Integer num, ProfileComponentUIConfig profileComponentUIConfig) {
        if (num == null) {
            return null;
        }
        num.intValue();
        if (profileComponentUIConfig == null) {
            return null;
        }
        if (num.intValue() != 0) {
            List<Integer> list = profileComponentUIConfig.padding;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list);
            ListProtector.set(arrayList, 0, Integer.valueOf(((Number) ListProtector.get(arrayList, 0)).intValue() + 8));
            return new ProfileComponentUIConfig(arrayList);
        }
        return profileComponentUIConfig;
    }

    public static void LIZJ(View view, ProfileComponentUIConfig profileComponentUIConfig, boolean z, boolean z2) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        if (profileComponentUIConfig != null && view != null && (layoutParams = view.getLayoutParams()) != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            C426750GoL.LJIIL(view, Integer.valueOf(view.getPaddingLeft()), 0, Integer.valueOf(view.getPaddingRight()), 0, 16);
            if (z && (i = layoutParams.height) != -1 && i != -2 && i != -1 && i > 0) {
                layoutParams.height = -2;
            }
            C786410Ut5.W5(view, layoutParams);
            if (z2) {
                C426750GoL.LJIIIZ(view, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(profileComponentUIConfig.getPaddingTop())))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(profileComponentUIConfig.getPaddingBottom())))), false, 16);
            } else {
                C426750GoL.LJIIL(view, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(profileComponentUIConfig.getPaddingTop())))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(profileComponentUIConfig.getPaddingBottom())))), 16);
            }
        }
    }
}
