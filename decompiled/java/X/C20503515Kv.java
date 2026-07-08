package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IMusicService;

/* JADX INFO: renamed from: X.15Kv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20503515Kv {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;

    public C20503515Kv(Context context, C20503715Kx c20503715Kx) {
        this.LIZ = (int) C12ES.LIZJ(2.0f, context);
        this.LIZIZ = (int) C12ES.LIZJ(2.0f, context);
        float fLIZJ = (int) C12ES.LIZJ(44.0f, context);
        ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJLL();
        this.LIZJ = (int) (fLIZJ * 0.7f);
        float fLIZJ2 = (int) C12ES.LIZJ(3.0f, context);
        ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJLL();
        this.LIZLLL = (int) (fLIZJ2 * 0.7f);
        this.LJ = (int) C12ES.LIZJ(6.0f, context);
        this.LJFF = (int) C12ES.LIZJ(3.0f, context);
        C12ES.LIZJ(c20503715Kx.LIZ, context);
        C12ES.LJIIJ(context);
    }
}
