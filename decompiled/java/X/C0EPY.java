package X;

import android.app.Activity;
import android.graphics.Rect;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EPY, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EPY {
    public final Activity LIZ;
    public final InterfaceC1446740nke LIZIZ;
    public final InterfaceC1452170ntP LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function0<Unit> LJ;
    public final MutableLiveData<C1452730nuJ> LJFF;
    public Pair<Long, Long> LJI;
    public int LJII = -1;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 95));
    public final float LJIIIZ;

    public final int LIZ() {
        return ((ScreenUtils.getFullScreenHeight(this.LIZ) - ((int) C12ES.LIZJ(this.LJIIIZ + 44.0f, this.LIZ))) - ScreenUtils.getStatusBarHeight(this.LIZ)) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(this.LIZ);
    }

    public final void LIZIZ(Rect rect) {
        if (rect != null) {
            int i = rect.left;
            if (i > 0 || rect.top > 0 || rect.right > 0 || rect.bottom > 0) {
                this.LIZJ.setDisplayPos(i, rect.top, rect.right, rect.bottom);
            }
        }
    }

    public C0EPY(C19EG c19eg, InterfaceC1446740nke interfaceC1446740nke, InterfaceC1452170ntP interfaceC1452170ntP, AwS549S0100000_5 awS549S0100000_5, AwS549S0100000_5 awS549S0100000_52) {
        this.LIZ = c19eg;
        this.LIZIZ = interfaceC1446740nke;
        this.LIZJ = interfaceC1452170ntP;
        this.LIZLLL = awS549S0100000_5;
        this.LJ = awS549S0100000_52;
        this.LJFF = interfaceC1446740nke.vW1();
        this.LJIIIZ = C12ES.LJIILJJIL(ScreenUtils.getScreenHeight(C0CHQ.LIZ) * 0.35f, c19eg) + 72.0f;
    }
}
