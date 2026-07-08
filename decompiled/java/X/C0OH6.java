package X;

import com.ss.android.ugc.aweme.mix.services.IPlaylistETService;
import com.ss.android.ugc.aweme.mix.services.PlaylistETServiceImpl;

/* JADX INFO: renamed from: X.0OH6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OH6 implements IPlaylistETService {
    public static final C0OH6 LIZIZ = new C0OH6();
    public final /* synthetic */ IPlaylistETService LIZ;

    @Override // com.ss.android.ugc.aweme.mix.services.IPlaylistETService
    public final <T> T LIZ(T t, String str) {
        return (T) this.LIZ.LIZ(t, str);
    }

    public C0OH6() {
        IPlaylistETService iPlaylistETService;
        Object objLIZ = C04TD.LIZ(IPlaylistETService.class, false);
        if (objLIZ != null) {
            iPlaylistETService = (IPlaylistETService) objLIZ;
        } else {
            if (C04TD.q2 == null) {
                synchronized (IPlaylistETService.class) {
                    if (C04TD.q2 == null) {
                        C04TD.q2 = new PlaylistETServiceImpl();
                    }
                }
            }
            iPlaylistETService = C04TD.q2;
        }
        this.LIZ = iPlaylistETService;
    }
}
