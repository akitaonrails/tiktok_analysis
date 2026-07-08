package X;

import com.bytedance.ies.cutsame.cut_android.SmartMovieAdapter;
import com.ss.android.ugc.aweme.cktemplate.download.WuZhuiDownloader;
import com.ss.android.ugc.aweme.cktemplate.resource.ITemplateResourceDownloaderService;

/* JADX INFO: renamed from: X.0960, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0960 {
    public final C23154095k LIZ;
    public final SmartMovieAdapter LIZIZ;
    public final C23164095u LIZJ;
    public final C095X LIZLLL;

    public AnonymousClass0960(C23154095k c23154095k) {
        WuZhuiDownloader wuZhuiDownloaderLIZ;
        this.LIZ = c23154095k;
        C2294808yw c2294808yw = new C2294808yw(c23154095k);
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        C201955140j.LIZLLL(c1398350mUb, "SmartMovieExt", "init");
        ITemplateResourceDownloaderService iTemplateResourceDownloaderService = AnonymousClass0962.LIZ;
        if (iTemplateResourceDownloaderService != null && iTemplateResourceDownloaderService.LIZIZ()) {
            wuZhuiDownloaderLIZ = iTemplateResourceDownloaderService.LIZ();
        } else {
            wuZhuiDownloaderLIZ = null;
        }
        AnonymousClass0961 anonymousClass0961 = c23154095k.LIZIZ;
        SmartMovieAdapter.DavinciResConfig davinciResConfig = new SmartMovieAdapter.DavinciResConfig(anonymousClass0961.LIZ, anonymousClass0961.LIZIZ, anonymousClass0961.LIZJ, anonymousClass0961.LIZLLL, anonymousClass0961.LJ, anonymousClass0961.LJFF, anonymousClass0961.LJI, anonymousClass0961.LJII, anonymousClass0961.LJIIIIZZ, anonymousClass0961.LJIIIZ, anonymousClass0961.LJIIJ, anonymousClass0961.LJIIJJI, anonymousClass0961.LJIIL, wuZhuiDownloaderLIZ);
        SmartMovieAdapter.Companion.getClass();
        SmartMovieAdapter smartMovieAdapter = new SmartMovieAdapter(davinciResConfig);
        this.LIZIZ = smartMovieAdapter;
        if (c23154095k.LIZLLL) {
            if (c23154095k.LIZIZ.LJIILJJIL.length() == 0) {
                c2294808yw.LIZJ();
            }
        } else {
            c2294808yw.LIZLLL();
        }
        this.LIZJ = new C23164095u(c23154095k, c2294808yw);
        this.LIZLLL = new C095X(c23154095k, smartMovieAdapter);
        C201955140j.LIZLLL(c1398350mUb, "SmartMovieExt", "init done");
    }
}
