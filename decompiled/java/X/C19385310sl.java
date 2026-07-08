package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.pipfeed.components.single.ControlOverlayViewModel;
import com.ss.android.ugc.aweme.pipfeed.vm.PipFeedWindowVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.10sl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19385310sl extends AbstractC19390410ta {
    public final C19391010tg LLILZLL;
    public final C19391010tg LLIZ;

    public C19385310sl() {
        super(R.id.qi0);
        this.LLILZLL = new C19391010tg(C452501pT.LIZIZ(new AwS573S0100000_29(this, 1083)), C13LE.LIZ(PipFeedWindowVM.class));
        this.LLIZ = new C19391010tg(C452501pT.LIZIZ(new AwS573S0100000_29(this, 1083)), C13LE.LIZ(ControlOverlayViewModel.class));
    }

    @Override // X.AbstractC19390410ta
    public final View LJI(Context context) {
        return new FrameLayout(context);
    }

    @Override // X.AbstractC19390410ta
    public final void LJIILJJIL(View view) {
        C786410Ut5.I7(new C19385510sn(this), view);
    }
}
