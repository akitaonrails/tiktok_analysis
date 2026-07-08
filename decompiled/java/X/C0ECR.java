package X;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.SpeedFragment;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.common.SpeedNormalFragment;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.curve.CurveSpeedFragment;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: renamed from: X.0ECR, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ECR extends FragmentStateAdapter {
    public final boolean LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;

    public final CurveSpeedFragment LLLILZLLLI() {
        return (CurveSpeedFragment) this.LLJILJIL.getValue();
    }

    public final SpeedNormalFragment LLLJ() {
        return (SpeedNormalFragment) this.LLJIJIL.getValue();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLJI ? 2 : 1;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LLLII(int i) {
        if (i == 0) {
            return LLLJ();
        }
        return LLLILZLLLI();
    }

    public C0ECR(SpeedFragment speedFragment, boolean z) {
        super(speedFragment);
        this.LLJI = z;
        this.LLJIJIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(328));
        this.LLJILJIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(327));
    }
}
