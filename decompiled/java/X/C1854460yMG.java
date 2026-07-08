package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0yMG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854460yMG {
    public static final boolean LIZ(String str) {
        if (C123100dR.LIZ(str) && C2137908Zd.LIZJ.LJFF(str)) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(String str) {
        if (!C123100dR.LIZ(str)) {
            return false;
        }
        if (!u.LJJIIJZLJL(str, "content", false) && !u.LJJIIJZLJL(str, "file:", false)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(BaseImage baseImage) {
        if (C123100dR.LIZ(baseImage.uri) && !LIZIZ(baseImage.uri) && !LIZ(baseImage.uri)) {
            return true;
        }
        return false;
    }
}
