package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.screenadaption.adaptionparams.ScreenAdaptionResult;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15eP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20570315eP {
    public final Aweme LIZ;
    public final InterfaceC583650Mup LIZIZ;
    public final View LIZJ;
    public final IScreenComponentAbility LIZLLL;
    public final View LJ;
    public final float LJFF;
    public final float LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;

    public abstract void LJFF(float f, float f2, boolean z, C20571215eY c20571215eY);

    public abstract void LJI();

    public final float LIZ() {
        return ((Number) this.LJIIIIZZ.getValue()).floatValue();
    }

    public final View LIZIZ() {
        View view;
        return (!this.LIZIZ.go1() || (view = this.LJ) == null) ? this.LIZIZ.getVideoView() : view;
    }

    public final int LIZJ() {
        int containerHeight;
        ScreenAdaptionResult screenAdaptionResultM82 = this.LIZLLL.M82();
        if (screenAdaptionResultM82 != null) {
            containerHeight = screenAdaptionResultM82.getContainerHeight();
            if (containerHeight == 0) {
            }
            return containerHeight;
        }
        containerHeight = 0;
        AbstractC1879030yzt.LIZ(AFwS221S0000000_31.get$arr$(492));
        return containerHeight;
    }

    public final int LIZLLL() {
        int containerWidth;
        ScreenAdaptionResult screenAdaptionResultM82 = this.LIZLLL.M82();
        if (screenAdaptionResultM82 != null) {
            containerWidth = screenAdaptionResultM82.getContainerWidth();
            if (containerWidth == 0) {
            }
            return containerWidth;
        }
        containerWidth = 0;
        AbstractC1879030yzt.LIZ(AFwS221S0000000_31.get$arr$(493));
        return containerWidth;
    }

    public final int LJ() {
        return this.LIZLLL.eD2();
    }

    public AbstractC20570315eP(Aweme aweme, InterfaceC583650Mup interfaceC583650Mup, View view, IScreenComponentAbility iScreenComponentAbility, View view2) {
        float scaleX;
        this.LIZ = aweme;
        this.LIZIZ = interfaceC583650Mup;
        this.LIZJ = view;
        this.LIZLLL = iScreenComponentAbility;
        this.LJ = view2;
        View viewLIZIZ = LIZIZ();
        if (viewLIZIZ != null) {
            scaleX = viewLIZIZ.getScaleX();
        } else {
            scaleX = 1.0f;
        }
        this.LJFF = scaleX;
        View viewLIZIZ2 = LIZIZ();
        this.LJI = viewLIZIZ2 != null ? viewLIZIZ2.getScaleY() : 1.0f;
        this.LJII = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1516));
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1517));
    }
}
