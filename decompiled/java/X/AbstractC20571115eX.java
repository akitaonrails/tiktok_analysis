package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15eX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20571115eX {
    public final Aweme LIZ;
    public final InterfaceC583650Mup LIZIZ;
    public final View LIZJ;
    public final IScreenComponentAbility LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final C01GW LJI;
    public final C01GW LJII;

    public abstract void LIZJ(float f, float f2, boolean z);

    public final float LIZ() {
        return ((Number) this.LJII.getValue()).floatValue();
    }

    public final int LIZIZ() {
        return this.LIZLLL.eD2();
    }

    public AbstractC20571115eX(Aweme aweme, InterfaceC583650Mup interfaceC583650Mup, View view, IScreenComponentAbility iScreenComponentAbility) {
        float scaleX;
        this.LIZ = aweme;
        this.LIZIZ = interfaceC583650Mup;
        this.LIZJ = view;
        this.LIZLLL = iScreenComponentAbility;
        View videoView = interfaceC583650Mup.getVideoView();
        if (videoView != null) {
            scaleX = videoView.getScaleX();
        } else {
            scaleX = 1.0f;
        }
        this.LJ = scaleX;
        View videoView2 = interfaceC583650Mup.getVideoView();
        this.LJFF = videoView2 != null ? videoView2.getScaleY() : 1.0f;
        this.LJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1376));
        this.LJII = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1377));
    }
}
