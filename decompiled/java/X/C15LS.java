package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IMusicService;

/* JADX INFO: renamed from: X.15LS, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15LS {
    public final Context LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;

    public final void LIZ(C20503715Kx c20503715Kx) {
        Context context = this.LIZ;
        c20503715Kx.getClass();
        this.LIZIZ = (int) C12ES.LIZJ(2.0f, context);
        this.LIZJ = (int) C12ES.LIZJ(2.0f, this.LIZ);
        float fLIZJ = (int) C12ES.LIZJ(44.0f, this.LIZ);
        ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJLL();
        this.LIZLLL = (int) (fLIZJ * 0.7f);
        float fLIZJ2 = (int) C12ES.LIZJ(3.0f, this.LIZ);
        ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJLL();
        this.LJ = (int) (fLIZJ2 * 0.7f);
        this.LJFF = (int) C12ES.LIZJ(6.0f, this.LIZ);
        this.LJI = (int) C12ES.LIZJ(3.0f, this.LIZ);
        this.LJII = (int) C12ES.LIZJ(c20503715Kx.LIZ, this.LIZ);
        this.LJIIIIZZ = C12ES.LJIIJ(this.LIZ) - this.LJII;
    }

    public C15LS(Context context, C20503715Kx c20503715Kx) {
        this.LIZ = context;
        LIZ(c20503715Kx);
    }
}
