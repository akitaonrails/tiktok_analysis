package X;

import Y.AObserverS189S0200000_29;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.pipfeed.components.single.ControlOverlayViewModel;
import com.ss.android.ugc.aweme.pipfeed.components.single.PipStatusViewViewModel;
import com.ss.android.ugc.aweme.pipfeed.vm.PipFeedWindowVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS678S0100000_29;

/* JADX INFO: renamed from: X.10si, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19385010si extends AbstractC19390410ta {
    public ViewGroup LLILZLL;
    public TuxIconView LLIZ;
    public TuxTextView LLIZLLLIL;
    public C1390410mHn LLJ;
    public View LLJI;
    public final C19391010tg LLJIJIL;
    public final C19391010tg LLJILJIL;
    public final C19391010tg LLJILJILJ;
    public final C01GW LLJILLL;

    public final void LJIILL() {
        MutableLiveData<EnumC19384110sZ> mutableLiveData = ((ControlOverlayViewModel) this.LLJILJILJ.getValue()).LLILLL;
        EnumC19384110sZ enumC19384110sZ = EnumC19384110sZ.GONE;
        mutableLiveData.setValue(enumC19384110sZ);
        ((ControlOverlayViewModel) this.LLJILJILJ.getValue()).LLILZ.setValue(enumC19384110sZ);
        ((ControlOverlayViewModel) this.LLJILJILJ.getValue()).LLILZIL.setValue(enumC19384110sZ);
    }

    public final void LJIILLIIL() {
        View view = this.LLILLJJLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            C786410Ut5.T4(view2, 1.0f);
        }
        ViewGroup viewGroup = this.LLILZLL;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C786410Ut5.LJLZ(0, viewGroup);
        C1390410mHn c1390410mHn = this.LLJ;
        if (c1390410mHn == null) {
            c1390410mHn = null;
        }
        C786410Ut5.LLLZZIL(c1390410mHn, 8);
        View view3 = this.LLJI;
        C786410Ut5.LJLLLLLL(4, view3 != null ? view3 : null);
    }

    public C19385010si() {
        super(R.id.qi0);
        this.LLJIJIL = new C19391010tg(C452501pT.LIZIZ(new AwS573S0100000_29(this, 1083)), C13LE.LIZ(PipStatusViewViewModel.class));
        this.LLJILJIL = new C19391010tg(C452501pT.LIZIZ(new AwS573S0100000_29(this, 1083)), C13LE.LIZ(PipFeedWindowVM.class));
        this.LLJILJILJ = new C19391010tg(C452501pT.LIZIZ(new AwS573S0100000_29(this, 1083)), C13LE.LIZ(ControlOverlayViewModel.class));
        this.LLJILLL = C587650N3b.LIZ("StatusViewComponent");
    }

    @Override // X.AbstractC19390410ta
    public final View LJI(Context context) {
        ColorDrawable colorDrawable;
        FrameLayout frameLayout = new FrameLayout(context);
        View viewSd = C786410Ut5.Sd(R.layout.dv6, C786410Ut5.ne(context), null);
        ViewGroup viewGroup = (ViewGroup) viewSd;
        this.LLILZLL = viewGroup;
        C786410Ut5.LJLZ(8, viewGroup);
        frameLayout.addView(viewSd);
        View view = new View(context);
        C786410Ut5.W5(view, new FrameLayout.LayoutParams(-1, -1));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, context);
        if (numLIZJ != null) {
            colorDrawable = new ColorDrawable(numLIZJ.intValue());
        } else {
            colorDrawable = null;
        }
        view.setBackground(colorDrawable);
        C786410Ut5.T4(view, 0.0f);
        C786410Ut5.LJLLLLLL(4, view);
        this.LLJI = view;
        frameLayout.addView(view);
        C786410Ut5.LJZ(0, frameLayout);
        frameLayout.setBackground(null);
        frameLayout.setClickable(false);
        return frameLayout;
    }

    @Override // X.AbstractC19390410ta
    public final void LJIILJJIL(View view) {
        this.LLIZ = (TuxIconView) view.findViewById(R.id.w2f);
        this.LLIZLLLIL = (TuxTextView) view.findViewById(R.id.w2i);
        this.LLJ = (C1390410mHn) view.findViewById(R.id.w2a);
        ((PipStatusViewViewModel) this.LLJIJIL.getValue()).LL.observe(LJIIIIZZ(), new AObserverS189S0200000_29(this, view, 5));
        PipFeedWindowVM pipFeedWindowVM = (PipFeedWindowVM) this.LLJILJIL.getValue();
        ((ArrayList) pipFeedWindowVM.LLILZLL).add(new AwS678S0100000_29(this, 8));
    }
}
