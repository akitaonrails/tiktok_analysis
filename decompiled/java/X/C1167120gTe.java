package X;

import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMGameCameraInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gTe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1167120gTe {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Function1<IMGameCameraInfo, Unit> LJFF;

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        Function1<IMGameCameraInfo, Unit> function1 = this.LJFF;
        return iHashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public /* synthetic */ C1167120gTe(String str, String str2, int i, String str3, String str4) {
        this(i, str, str2, str3, str4, null);
    }

    public C1167120gTe(int i, String str, String str2, String str3, String str4, Function1 function1) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = function1;
    }
}
