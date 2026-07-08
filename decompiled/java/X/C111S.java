package X;

import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviFeature;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviStaticImage;
import java.util.List;

/* JADX INFO: renamed from: X.111S, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C111S {
    public final String LIZ;
    public final String LIZIZ;
    public final List<ProfileNaviFeature> LIZJ;
    public final ProfileNaviStaticImage LIZLLL;

    public C111S() {
        throw null;
    }

    public C111S(String str, String str2, List list, ProfileNaviStaticImage profileNaviStaticImage, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
        this.LIZLLL = profileNaviStaticImage;
    }
}
