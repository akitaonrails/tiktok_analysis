package X;

import Y.ARunnableS0S2100100_13;
import android.text.TextUtils;
import com.bytedance.crash.monitor.CacheManager;
import com.bytedance.crash.monitor.f;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0VeE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C802680VeE extends f {
    public static final ArrayList<C802680VeE> LJIILJJIL = new ArrayList<>();
    public final CacheManager LJIIL;
    public C803540Vfc LJIILIIL;

    @Override // com.bytedance.crash.monitor.f
    public String LIZ() {
        return this.LIZLLL != null ? this.LIZLLL : this.LJIIL.LIZIZ(0L);
    }

    @Override // com.bytedance.crash.monitor.f
    public String LIZIZ() {
        if (this.LJI != null) {
            return this.LJI;
        }
        CacheManager cacheManager = this.LJIIL;
        return cacheManager.LIZJ(".chn").getBefore(cacheManager.LIZ, ".chn", 0L);
    }

    @Override // com.bytedance.crash.monitor.f
    public long LJI() {
        return this.LJ != 0 ? this.LJ : this.LJIIL.LJI(0L);
    }

    @Override // com.bytedance.crash.monitor.f
    public C803540Vfc LJII() {
        C803540Vfc c803540Vfc = this.LJIILIIL;
        if (c803540Vfc != null) {
            return c803540Vfc;
        }
        if (this.LJII == null || this.LJIIIIZZ == 0) {
            CacheManager cacheManager = this.LJIIL;
            if (cacheManager.LJFF == null) {
                cacheManager.LJFF = CacheManager.CachedVersion.getCurrent(cacheManager.LIZ);
            }
            C803540Vfc before = cacheManager.LJFF.getBefore(cacheManager.LIZ, 0L);
            if (before == null) {
                before = new C803540Vfc(0L, 0L, 0L, CardStruct.IStatusCode.DEFAULT);
            }
            this.LJIILIIL = before;
        } else {
            this.LJIILIIL = new C803540Vfc(this.LJIIIIZZ, this.LJIIJ, this.LJIIIZ, this.LJII);
        }
        return this.LJIILIIL;
    }

    @Override // com.bytedance.crash.monitor.f
    public long LJFF() {
        return LJII().LIZIZ;
    }

    @Override // com.bytedance.crash.monitor.f
    public long LJIIIIZZ() {
        return LJII().LIZ;
    }

    @Override // com.bytedance.crash.monitor.f
    public String LJIIIZ() {
        return LJII().LIZLLL;
    }

    public long LJIILJJIL() {
        return LJII().LIZJ;
    }

    public C802680VeE(C802410Vdn c802410Vdn) {
        super(c802410Vdn);
        LJIILJJIL.add(this);
        this.LJIIL = new CacheManager(C0VX9.LJFF());
    }

    @Override // com.bytedance.crash.monitor.f
    public String LIZLLL(String str) {
        if (!TextUtils.isEmpty(this.LJFF)) {
            return this.LJFF;
        }
        String strLJ = this.LJIIL.LJ(0L);
        if (TextUtils.isEmpty(strLJ)) {
            return str;
        }
        return strLJ;
    }

    @Override // com.bytedance.crash.monitor.f
    public final void LJIIJJI(String str) {
        this.LJI = str;
        CacheManager cacheManager = this.LJIIL;
        cacheManager.LIZJ(".chn").update(cacheManager.LIZ, ".chn", str);
    }

    @Override // com.bytedance.crash.monitor.f
    public final void LJIIL(String str) {
        this.LJFF = str;
        CacheManager cacheManager = this.LJIIL;
        cacheManager.LIZJ(".did").update(cacheManager.LIZ, ".did", str);
    }

    public final String LJIILIIL(long j) {
        CacheManager cacheManager = this.LJIIL;
        return cacheManager.LIZJ(".chn").getBefore(cacheManager.LIZ, ".chn", j);
    }

    public final C803540Vfc LJIILL(long j) {
        CacheManager cacheManager = this.LJIIL;
        if (cacheManager.LJFF == null) {
            cacheManager.LJFF = CacheManager.CachedVersion.getCurrent(cacheManager.LIZ);
        }
        return cacheManager.LJFF.getBefore(cacheManager.LIZ, j);
    }

    public final void LJIILLIIL(long j) {
        this.LJ = j;
        CacheManager cacheManager = this.LJIIL;
        cacheManager.LIZJ(".uid").update(cacheManager.LIZ, ".uid", String.valueOf(j));
    }

    public C802680VeE(String str, String str2, long j) {
        super(str, str2, j, 0L);
        LJIILJJIL.add(this);
        CacheManager cacheManager = new CacheManager(C0VX9.LJFF(), str);
        this.LJIIL = cacheManager;
        if (C786410Ut5.u3() == C0VXF.LIZIZ()) {
            cacheManager.LJII(str);
            cacheManager.LJIIIIZZ(j, 0L, 0L, str2);
        } else {
            C0VXF.post(new ARunnableS0S2100100_13(this, str, j, str2, 1));
        }
    }

    public C802680VeE(C802410Vdn c802410Vdn, String str, String str2, long j) {
        super(c802410Vdn, str, str2, j, 0L);
        LJIILJJIL.add(this);
        CacheManager cacheManager = new CacheManager(C0VX9.LJFF(), str);
        this.LJIIL = cacheManager;
        if (C786410Ut5.u3() == C0VXF.LIZIZ()) {
            cacheManager.LJII(str);
            cacheManager.LJIIIIZZ(j, 0L, 0L, str2);
        } else {
            C0VXF.post(new ARunnableS0S2100100_13(this, str, j, str2, 0));
        }
    }
}
