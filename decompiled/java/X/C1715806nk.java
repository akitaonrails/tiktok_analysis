package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import java.util.Map;

/* JADX INFO: renamed from: X.06nk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1715806nk {
    public final DataSource LIZ;
    public final InterfaceC1715506nh LIZIZ;
    public final Map<String, Bitmap> LIZJ;
    public final boolean LIZLLL;
    public final C1715706nj LJ;

    public /* synthetic */ C1715806nk(DataSource dataSource, C1715706nj c1715706nj, int i) {
        this(dataSource, null, null, false, (i & 16) != 0 ? null : c1715706nj);
    }

    public C1715806nk(DataSource dataSource, InterfaceC1715506nh interfaceC1715506nh, Map<String, Bitmap> map, boolean z, C1715706nj c1715706nj) {
        this.LIZ = dataSource;
        this.LIZIZ = interfaceC1715506nh;
        this.LIZJ = map;
        this.LIZLLL = z;
        this.LJ = c1715706nj;
    }
}
