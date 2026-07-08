package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: renamed from: X.0rcn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595630rcn {
    public Bitmap LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public UrlModel LJ;
    public InterfaceC1600660rku LJFF;
    public EnumC1595610rcl LJI;
    public final boolean LJII;

    public C1595630rcn(boolean z, int i, String str, boolean z2, int i2) {
        EnumC1595610rcl enumC1595610rcl;
        z = (i2 & 2) != 0 ? false : z;
        i = (i2 & 4) != 0 ? -1 : i;
        str = (i2 & 8) != 0 ? "" : str;
        if ((i2 & 64) != 0) {
            enumC1595610rcl = EnumC1595610rcl.NO_REFRESH;
        } else {
            enumC1595610rcl = null;
        }
        z2 = (i2 & 128) != 0 ? false : z2;
        this.LIZ = null;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = str;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = enumC1595610rcl;
        this.LJII = z2;
    }
}
