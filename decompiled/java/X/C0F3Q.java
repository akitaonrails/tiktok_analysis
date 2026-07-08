package X;

import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.grid.QuickGridModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController;
import com.zhiliaoapp.musically.R;
import ge.i;
import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS56S1000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0F3Q, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F3Q extends i<InterfaceC522500KeO, C0EW2, C0EW9, C0EW3> implements InterfaceC522500KeO, InterfaceC497601wk {
    public static final int LLJJJIL = 8;
    public final C1DRG LLJILJILJ;
    public final C19A3 LLJILLL;
    public final Function0<C0EW9> LLJJ;
    public final Function0<C0EW3> LLJJI;
    public C0EW2 LLJJIII;
    public int LLJJIJI;
    public final CoroutineContext LLJJIJIIJIL;
    public volatile boolean LLJJIJIL;
    public volatile boolean LLJJJ;

    @Override // ge.i
    public int H3() {
        return R.anim.an;
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        this.LLJJIJIL = false;
        this.LLJJJ = false;
        i3(AFwS234S0000000_5.get$arr$(16));
        C0EW2 c0ew2 = this.LLJJIII;
        if (c0ew2 != null) {
            int i = this.LLJJIJI;
            if (i != 0) {
                this.LLJILLL.hide(c0ew2, i);
            } else {
                this.LLJILLL.hide(c0ew2);
            }
        }
    }

    @Override // ge.i
    public Function0<C0EW2> E3() {
        return new AwS549S0100000_5(this, 34);
    }

    public final void H4() {
        MvChoosePhotoScene mvChoosePhotoScene;
        InterfaceC522120Kdm interfaceC522120Kdm;
        View viewLIZLLL;
        VideoImageMixedController videoImageMixedController;
        ShortVideoContext shortVideoContext;
        CreativeModel creativeModel;
        C19A3 c19a3 = this.LLJILLL;
        if (!(c19a3 instanceof MvChoosePhotoScene) || (mvChoosePhotoScene = (MvChoosePhotoScene) c19a3) == null || (interfaceC522120Kdm = mvChoosePhotoScene.videoImageMixedController) == null || (viewLIZLLL = interfaceC522120Kdm.LIZLLL()) == null) {
            return;
        }
        QuickGridModel quickGridModel = new QuickGridModel(false, "", 0, 0);
        quickGridModel.gridTypeExtra = T2().LJ;
        if ((interfaceC522120Kdm instanceof VideoImageMixedController) && (videoImageMixedController = (VideoImageMixedController) interfaceC522120Kdm) != null && (shortVideoContext = videoImageMixedController.LL) != null && (creativeModel = shortVideoContext.creativeModel) != null) {
            creativeModel.quickGridModel = quickGridModel;
        }
        interfaceC522120Kdm.LJJIIJZLJL(viewLIZLLL, false, false, false, true, false, false);
    }

    private final void P4() {
        C23250099c.LIZLLL(this, null, null, new C379510EuL(T2().LIZ.LIZ, this, new ArrayList(), null), 3);
    }

    public final void cancel() {
        this.LLJJIJI = R.anim.ao;
        hide();
    }

    @Override // X.InterfaceC497601wk
    public CoroutineContext getCoroutineContext() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0EW9> o2() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0EW3> w2() {
        return this.LLJJI;
    }

    public final void F4(ArrayList<Bitmap> arrayList) {
        if (arrayList.size() == T2().LIZ.LIZ.size()) {
            this.LLJJJ = true;
            if (this.LLJJIJIL) {
                C01TT.LIZLLL(new AwS406S0200000_5(this, (C0F3Q) arrayList, (ArrayList<Bitmap>) 3));
            } else {
                C01TT.LIZLLL(new AwS406S0200000_5(this, (C0F3Q) arrayList, (ArrayList<Bitmap>) 4));
            }
        }
    }

    @Override // X.InterfaceC522500KeO
    public void Jt0(ArrayList<TikTokMediaModel> arrayList) {
        i3(new AwS584S0100000_5((ArrayList) arrayList, (ArrayList<Bitmap>) 20));
        show();
        P4();
    }

    public final void K4(boolean z) {
        if (z) {
            this.LLJJIJIL = true;
            if (this.LLJJJ) {
                i3(AFwS234S0000000_5.get$arr$(17));
                return;
            }
            return;
        }
        this.LLJJIJIL = true;
    }

    public final void O4(String str) {
        i3(new AwS56S1000000_5(str, 1));
    }

    @Override // X.InterfaceC522500KeO
    public void OL(boolean z) {
        if (z) {
            this.LLJJIJI = R.anim.ao;
        } else {
            this.LLJJIJI = 0;
        }
        hide();
    }

    public C0F3Q(C1DRG c1drg, C19A3 c19a3) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = c19a3;
        this.LLJJ = AFwS191S0000000_5.get$arr$(25);
        this.LLJJI = new AwS549S0100000_5(this, 33);
        this.LLJJIJI = R.anim.ao;
        this.LLJJIJIIJIL = C0PEM.LIZJ;
    }
}
