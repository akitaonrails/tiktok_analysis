package X;

import android.graphics.drawable.Animatable;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: renamed from: X.0rzb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609770rzb {
    public Animatable LIZ;
    public boolean LIZIZ;
    public final EnumC1609700rzU LIZJ;
    public final UrlModel LIZLLL;
    public final String LJ;
    public long LJFF;

    public C1609770rzb(boolean z, EnumC1609700rzU enumC1609700rzU, UrlModel urlModel, String str, int i) {
        z = (i & 2) != 0 ? true : z;
        enumC1609700rzU = (i & 4) != 0 ? null : enumC1609700rzU;
        str = (i & 16) != 0 ? null : str;
        this.LIZ = null;
        this.LIZIZ = z;
        this.LIZJ = enumC1609700rzU;
        this.LIZLLL = urlModel;
        this.LJ = str;
        this.LJFF = 0L;
    }
}
