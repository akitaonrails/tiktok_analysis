package X;

import Y.AObjectS349S0100000_5;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import java.util.Set;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0FPT, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FPT {
    public static final String LIZ(NLEModel nLEModel) {
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null) {
            return mainTrack.getExtra("feature_codes");
        }
        return "";
    }

    public static final Set<Integer> LIZIZ(NLEModel nLEModel) {
        String strLIZ = LIZ(nLEModel);
        if (strLIZ.length() <= 2) {
            return C08CX.INSTANCE;
        }
        String strSubstring = strLIZ.substring(1, strLIZ.length() - 1);
        return C09RB.LJJIIJ(C09RB.LJIJI(C09RB.LJIIJJI(new C08LY(new C08LY(a0.LJJJJL(strSubstring, new char[]{','}, false, 0), new AObjectS349S0100000_5(strSubstring, 1)), AFwS234S0000000_5.get$arr$(393))), AFwS234S0000000_5.get$arr$(394)));
    }
}
