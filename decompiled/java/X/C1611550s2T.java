package X;

import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import defpackage.MiniDramaETInjectServiceImpl;

/* JADX INFO: renamed from: X.0s2T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611550s2T {
    public static final /* synthetic */ C1611550s2T LIZ = new C1611550s2T();

    public static MiniDramaETInjectService LIZ() {
        Object objLIZ = C04TD.LIZ(MiniDramaETInjectService.class, false);
        if (objLIZ != null) {
            return (MiniDramaETInjectService) objLIZ;
        }
        if (C04TD.LIZIZ == null) {
            synchronized (MiniDramaETInjectService.class) {
                if (C04TD.LIZIZ == null) {
                    C04TD.LIZIZ = new MiniDramaETInjectServiceImpl();
                }
            }
        }
        return C04TD.LIZIZ;
    }
}
