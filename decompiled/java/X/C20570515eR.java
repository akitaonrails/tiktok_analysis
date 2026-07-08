package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.video.PillarBoxVideoInfo;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15eR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20570515eR extends AbstractC20570315eP {
    public final View LJIIIZ;
    public final C01GW LJIIJ;
    public final boolean LJIIJJI;
    public final C01GW LJIIL;
    public boolean LJIILIIL;
    public float LJIILJJIL;
    public float LJIILL;
    public float LJIILLIIL;

    @Override // X.AbstractC20570315eP
    public final void LJI() {
        this.LJIILIIL = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(boolean r14) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20570515eR.LJII(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a3  */
    @Override // X.AbstractC20570315eP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(float r24, float r25, boolean r26, X.C20571215eY r27) {
        /*
            Method dump skipped, instruction units count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20570515eR.LJFF(float, float, boolean, X.15eY):void");
    }

    public C20570515eR(Aweme aweme, InterfaceC583650Mup interfaceC583650Mup, View view, IScreenComponentAbility iScreenComponentAbility, View view2, View view3) {
        PillarBoxVideoInfo pillarBoxVideoInfo;
        super(aweme, interfaceC583650Mup, view, iScreenComponentAbility, view3);
        this.LJIIIZ = view2;
        this.LJIIJ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS221S0000000_31.get$arr$(491));
        this.LJIIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(490));
        if (C287450BOl.LIZ()) {
            Video video = aweme.getVideo();
            boolean z = false;
            if (video != null && video.getWidth() != 0 && (((pillarBoxVideoInfo = video.getPillarBoxVideoInfo()) == null || !C1074904Ih.LIZ(pillarBoxVideoInfo)) && video.getHeight() / video.getWidth() >= 1.3333334f)) {
                z = true;
            }
            this.LJIIJJI = z;
        }
    }
}
