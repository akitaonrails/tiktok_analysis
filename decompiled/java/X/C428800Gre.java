package X;

import android.text.SpannableStringBuilder;
import java.util.Map;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0Gre, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428800Gre {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(608));

    public static SpannableStringBuilder LIZ(int i, boolean z) {
        Object c0gvh;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        if (z) {
            Map map = (Map) LIZ.getValue();
            Integer numValueOf = Integer.valueOf(i);
            c0gvh = map.get(numValueOf);
            if (c0gvh == null) {
                c0gvh = new C0GVH(Integer.valueOf(i));
                map.put(numValueOf, c0gvh);
            }
        } else {
            c0gvh = new C0GVH(Integer.valueOf(i));
        }
        C786410Ut5.q2(spannableStringBuilder, c0gvh, 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }
}
