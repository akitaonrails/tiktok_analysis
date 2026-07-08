package X;

import Y.ARunnableS109S0100000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.14Xe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20280814Xe extends AbstractC20284914Yt {
    public static final /* synthetic */ int LLJJ = 0;
    public boolean LLJI;
    public Option LLJIJIL;
    public IPhotoSlidesAbility LLJILJIL;
    public View LLJILJILJ;
    public final C20293414aq LLJILLL = new C20293414aq("bottom_mask");

    @Override // X.AbstractC20284914Yt, X.InterfaceC690490R6p
    public final void LIZ() {
        this.LLJI = false;
        this.LLJILJIL = null;
    }

    @Override // X.InterfaceC690490R6p
    public final void LJI() {
    }

    @Override // X.InterfaceC690490R6p
    public final void LIZJ() {
        View viewFindViewById;
        View view = this.LLJILJILJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = this.LLJILJILJ;
        if (view2 != null) {
            C786410Ut5.T4(view2, 0.0f);
        }
        View view3 = this.LLJILJILJ;
        if (view3 == null || (viewFindViewById = view3.findViewById(R.id.whg)) == null) {
            return;
        }
        int visibility = viewFindViewById.getVisibility();
        viewFindViewById.setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, viewFindViewById);
    }

    @Override // X.InterfaceC690490R6p
    public final void LJIIIIZZ() {
        if (this.LLJI) {
            C786410Ut5.LJJZZIII(new BPEAHandler(), new ARunnableS109S0100000_9(this, 169));
        }
    }

    @Override // X.InterfaceC690490R6p
    public final boolean isShowing() {
        return this.LLJI;
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC690000R4s
    public final void LJIIJJI(EnumC20283814Yi enumC20283814Yi, Aweme aweme, boolean z) {
        super.LJIIJJI(enumC20283814Yi, aweme, z);
        View view = this.LLJILJILJ;
        if (view != null && view.getVisibility() == 0) {
            C1440005kM.LIZ(new C737030Svd(80, Boolean.FALSE));
            View view2 = this.LLJILJILJ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            IPhotoSlidesAbility iPhotoSlidesAbility = this.LLJILJIL;
            if (iPhotoSlidesAbility != null) {
                iPhotoSlidesAbility.ML0(false);
            }
            this.LLJILJIL = null;
        }
    }

    @Override // X.InterfaceC690490R6p
    public final void LJIIJ(ViewStub viewStub, Context context, Aweme aweme, View view, View view2, View view3, View view4, boolean z, AbstractC19368810q6 abstractC19368810q6) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }
}
