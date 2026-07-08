package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.video.control.IPhotoModeService;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0N0i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586940N0i {
    public final OnUIPlayListener LIZ;
    public C0N0Y LIZIZ;
    public final C1482640ogY LIZJ;
    public Aweme LIZLLL;
    public String LJ;
    public boolean LJFF;
    public String LJI;
    public String LJII;
    public Map<String, String> LJIIIIZZ;
    public final C586950N0j LJIIIZ;

    public final void LIZJ() {
        C0N0Y c0n0y = this.LIZIZ;
        if (c0n0y == null || !c0n0y.LJLJI(this.LIZ) || 1 == 0) {
            return;
        }
        c0n0y.LJJIJ(null);
    }

    public final String LIZLLL() {
        String str = this.LJ;
        if (str == null || a0.LJJJIL(str)) {
            return null;
        }
        return this.LJ;
    }

    public final void LJ() {
        C0N0Y c0n0y = this.LIZIZ;
        if (c0n0y != null) {
            c0n0y.LIZ();
        }
    }

    public final boolean LJII() {
        Aweme aweme;
        Aweme aweme2;
        AwemeStatus statusSafety;
        return (this.LIZJ.Da() && ((aweme = this.LIZLLL) == null || AwemeExtKt.getStatusSafety(aweme) == null || (aweme2 = this.LIZLLL) == null || (statusSafety = AwemeExtKt.getStatusSafety(aweme2)) == null || !statusSafety.isDelete())) ? false : true;
    }

    public final Video LIZ() {
        Video videoLIZ;
        String strLIZLLL = LIZLLL();
        if (strLIZLLL != null && (videoLIZ = this.LJIIIZ.LIZ(String.class, strLIZLLL)) != null) {
            return videoLIZ;
        }
        Aweme aweme = this.LIZLLL;
        if (aweme != null) {
            return this.LJIIIZ.LIZ(Aweme.class, aweme);
        }
        return null;
    }

    public static void LJI(C586940N0i c586940N0i) {
        Video videoLIZ;
        boolean zLJFF;
        if (!c586940N0i.LJII()) {
            if ((c586940N0i.LIZLLL == null && c586940N0i.LIZLLL() == null) || (videoLIZ = c586940N0i.LIZ()) == null) {
                return;
            }
            C0N0Y c0n0y = c586940N0i.LIZIZ;
            if (c0n0y != null) {
                c0n0y.LJJIJ(c586940N0i.LIZ);
            }
            C0N0Y c0n0y2 = c586940N0i.LIZIZ;
            if (c0n0y2 != null) {
                c0n0y2.setSurface(c586940N0i.LIZJ.getSurface());
            }
            C0N0Y c0n0y3 = c586940N0i.LIZIZ;
            if (c0n0y3 == null) {
                return;
            }
            IPhotoModeService iPhotoModeService = (IPhotoModeService) PluggableExtentionKt.pluggableSpi$default(IPhotoModeService.class, false, false, false, 14, null);
            if (iPhotoModeService != null) {
                zLJFF = Intrinsics.LJFF(iPhotoModeService.LIZ(c586940N0i.LIZLLL), Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            c0n0y3.LJJLIIIJJIZ(videoLIZ, zLJFF, c586940N0i.LIZ, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(int r18) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C586940N0i.LIZIZ(int):boolean");
    }

    public final void LJFF(int i) {
        Video videoLIZ;
        if (LJII()) {
            return;
        }
        if ((this.LIZLLL == null && LIZLLL() == null) || (videoLIZ = LIZ()) == null) {
            return;
        }
        C0N0Y c0n0y = this.LIZIZ;
        if (c0n0y != null) {
            c0n0y.LJJIJ(this.LIZ);
        }
        C0N0Y c0n0y2 = this.LIZIZ;
        if (c0n0y2 != null) {
            c0n0y2.setSurface(this.LIZJ.getSurface());
        }
        C0N0Y c0n0y3 = this.LIZIZ;
        if (c0n0y3 == null) {
            return;
        }
        C1479720obq c1479720obq = new C1479720obq();
        c1479720obq.LIZ.LJIIIIZZ = true;
        SimVideo simVideoLJI = C1481230oeH.LJI(videoLIZ);
        C1479530obX c1479530obX = c1479720obq.LIZ;
        c1479530obX.LIZLLL = simVideoLJI;
        c1479530obX.LJIIJ = true;
        c1479530obX.LJIIJJI = i;
        c1479530obX.LJIILLIIL = this.LJFF;
        c1479530obX.LJLJJL = this.LJI;
        c1479720obq.LIZJ(this.LJII);
        Map<String, String> linkedHashMap = this.LJIIIIZZ;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        C1479530obX c1479530obX2 = c1479720obq.LIZ;
        c1479530obX2.LJLL = linkedHashMap;
        c1479530obX2.LJJL = true;
        c0n0y3.LJJZZIII(c1479720obq.LIZ());
    }

    public C586940N0i(C1473870oSP c1473870oSP, OnUIPlayListener onUIPlayListener) {
        this.LIZ = onUIPlayListener;
        this.LIZJ = C1482640ogY.LJIIIIZZ(c1473870oSP);
        C0N0Y c0n0y = this.LIZIZ;
        if (c0n0y != null) {
            c0n0y.getDuration();
        }
        C0N0Y c0n0y2 = this.LIZIZ;
        if (c0n0y2 != null) {
            c0n0y2.getCurrentPosition();
        }
        C586950N0j c586950N0j = new C586950N0j();
        c586950N0j.LIZ.put(String.class, AFwS240S0000000_9.get$arr$(916));
        c586950N0j.LIZ.put(Aweme.class, AFwS240S0000000_9.get$arr$(917));
        this.LJIIIZ = c586950N0j;
    }
}
