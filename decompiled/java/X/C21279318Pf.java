package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSACardsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.EcUgVSAData;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.18Pf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21279318Pf {
    public final Aweme LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final EcUgVSAData LIZLLL;
    public final String LJ;
    public VSACardsResponse.VSACardData LJFF;
    public final Map<String, String> LJI = new LinkedHashMap();
    public final Map<String, Map<String, String>> LJII = new LinkedHashMap();
    public Bitmap LJIIIIZZ;
    public C18PX LJIIIZ;
    public DataCenter LJIIJ;
    public volatile boolean LJIIJJI;
    public volatile boolean LJIIL;
    public volatile boolean LJIILIIL;
    public volatile boolean LJIILJJIL;
    public volatile boolean LJIILL;
    public volatile boolean LJIILLIIL;

    public C21279318Pf(Aweme aweme, String str, long j, EcUgVSAData ecUgVSAData, String str2) {
        this.LIZ = aweme;
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = ecUgVSAData;
        this.LJ = str2;
    }
}
