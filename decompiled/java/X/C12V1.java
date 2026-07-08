package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12V1, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12V1 extends C19765512Uz implements InterfaceC19670711xh {
    public final C1DRG LLJJIII;
    public final C19A3 LLJJIJI;
    public final int LLJJIJIIJIL = R.id.i5s;
    public final String LLJJIJIL = "EditCutVideoSpeedScene";

    @Override // X.C19765512Uz
    public final void LLLIIIIL() {
    }

    public final void show() {
        if (!this.LLJJIJI.isAdded(this)) {
            this.LLJJIJI.add(this.LLJJIJIIJIL, this, this.LLJJIJIL);
        }
        if (this.LLJJIJI.isShowing(this)) {
            return;
        }
        this.LLJJIJI.show(this);
    }

    @Override // X.InterfaceC19670711xh
    public final String getTag() {
        return this.LLJJIJIL;
    }

    @Override // X.C19765512Uz, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJILJILJ = (CutMultiVideoViewModel) this.LLJJIII.LJII(CutMultiVideoViewModel.class, null);
        this.LLJILLL = (CutVideoSpeedViewModel) this.LLJJIII.LJII(CutVideoSpeedViewModel.class, null);
    }

    public C12V1(C1DRG c1drg, C12VN c12vn) {
        this.LLJJIII = c1drg;
        this.LLJJIJI = c12vn;
    }
}
