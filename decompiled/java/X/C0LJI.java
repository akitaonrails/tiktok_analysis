package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.StoryAlbumComponentService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0LJI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LJI {
    public final String LIZ;
    public final String LIZIZ;
    public final Long LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public String LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public final List<Long> LJIIJ;

    public final void LIZ(long j) {
        if (this.LJIIIIZZ < 0) {
            this.LJIIIIZZ = SystemClock.elapsedRealtime();
            Long l = this.LIZJ;
            if (l != null) {
                l.longValue();
                List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("shoot_way", this.LIZ);
                c2344009Gk.LJIIIIZZ("enter_from", this.LIZIZ);
                c2344009Gk.LJIIIIZZ("type", "social_creation_album");
                String str = this.LJFF;
                if (str == null) {
                    str = "";
                }
                c2344009Gk.LJIIIIZZ("creation_id", str);
                c2344009Gk.LIZJ(this.LJ ? 1 : 0, "has_permission_before");
                c2344009Gk.LIZLLL(this.LIZLLL - this.LIZJ.longValue(), "step5");
                c2344009Gk.LIZLLL(this.LJI - this.LIZLLL, "step1");
                c2344009Gk.LIZLLL(this.LJII - this.LIZLLL, "step2");
                c2344009Gk.LIZLLL(this.LJIIIIZZ - this.LIZLLL, "step3");
                c2344009Gk.LIZLLL(this.LJIIIIZZ - this.LIZLLL, "totaltime");
                c2344009Gk.LIZLLL(this.LJIIIIZZ - this.LIZJ.longValue(), "step4");
                C2341909Fp.LIZ("tool_performance_operation_cost_time", c2344009Gk.LIZ);
            }
            Set services = ServiceManager.get().getServices(StoryAlbumComponentService.class, true);
            if (services != null) {
                Iterator it2 = services.iterator();
                while (it2.hasNext()) {
                    try {
                        ((StoryAlbumComponentService) it2.next()).LIZIZ();
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }
        }
        if (j > 0) {
            this.LJIIJ.add(Long.valueOf(j));
        }
    }

    public C0LJI(String str, String str2, Long l, long j, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = l;
        this.LIZLLL = j;
        this.LJ = z;
        this.LJFF = null;
        this.LJI = -1L;
        this.LJII = -1L;
        this.LJIIIIZZ = -1L;
        this.LJIIIZ = -1L;
        this.LJIIJ = arrayList;
    }
}
