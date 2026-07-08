package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12EZ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12EZ extends C19721612Ec {
    @Override // X.C19721612Ec
    public final void LLLILZLLLI() {
    }

    @Override // X.C19721612Ec
    public final void LLLIZZ() {
    }

    @Override // X.C19721612Ec
    public final Integer LLLILZ() {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
    }

    @Override // X.C19721612Ec
    public final void LLLIL() {
        setTheme(R.style.adz);
    }

    @Override // X.C19721612Ec
    public final void LLLII(View view) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, view.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        if (tuxNavBar != null) {
            tuxNavBar.setNavBackground(iIntValue);
        }
        RecyclerView recyclerView = this.LLJILJILJ;
        if (recyclerView != null) {
            recyclerView.setBackgroundColor(iIntValue);
        }
    }

    @Override // X.C19721612Ec
    public final void LLLIILIL(TuxNavBar tuxNavBar) {
        tuxNavBar.LJIIZILJ(false);
    }

    public C12EZ(VideoPublishViewModel videoPublishViewModel, C193M c193m) {
        super(videoPublishViewModel, c193m);
    }
}
