package X;

import com.ss.android.ugc.aweme.experiment.LiveFYPSkylightUnfoldModel;
import java.util.List;

/* JADX INFO: renamed from: X.0AvX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C278330AvX {
    public static boolean LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C278310AvV());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C278350AvZ());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C278300AvU());

    public static boolean LIZIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static boolean LIZ(String str) {
        List<String> list = ((LiveFYPSkylightUnfoldModel) C278340AvY.LIZIZ.getValue()).goLiveMergeBtnScene;
        if (list != null && !list.isEmpty() && str != null && str.length() != 0) {
            if (!list.contains(str)) {
                return false;
            }
            return ((Boolean) LIZJ.getValue()).booleanValue();
        }
        return ((Boolean) LIZJ.getValue()).booleanValue();
    }
}
