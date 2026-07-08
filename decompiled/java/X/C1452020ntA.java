package X;

import Y.ACListenerS156S0100000_22;
import Y.AObserverS225S0100000_22;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ntA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452020ntA extends Scene implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C1DRG LLJI;
    public final SingleImageData LLJIJIL;
    public final InterfaceC1450280nqM LLJILJIL;
    public final InterfaceC1451050nrb LLJILJILJ;
    public final Function0<Unit> LLJILLL;
    public View LLJJ;
    public TuxIconView LLJJI;
    public TuxTextView LLJJIII;
    public ConstraintLayout LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1452020ntA.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final void LLLIIIIL() {
        LivePhotoPreviewMode livePhotoPreviewMode;
        SrcLiveVideoInfo srcLiveInfo = this.LLJIJIL.getSrcLiveInfo();
        if (srcLiveInfo == null || (livePhotoPreviewMode = srcLiveInfo.getLivePhotoPreviewMode()) == null) {
            return;
        }
        int i = C1413260mse.LIZ[livePhotoPreviewMode.ordinal()];
        if (i == 1) {
            TuxIconView tuxIconView = this.LLJJI;
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_live_photo_slash;
                Context sceneContext = getSceneContext();
                c419910GdJ.LIZLLL = sceneContext != null ? C1308910kAL.LIZJ(R.attr.ee, sceneContext) : null;
                tuxIconView.setTuxIcon(c419910GdJ);
            }
            TuxTextView tuxTextView = this.LLJJIII;
            if (tuxTextView != null) {
                tuxTextView.setText(2131836578);
                return;
            }
            return;
        }
        if (i == 2) {
            TuxIconView tuxIconView2 = this.LLJJI;
            if (tuxIconView2 != null) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_live_photo;
                Context sceneContext2 = getSceneContext();
                c419910GdJ2.LIZLLL = sceneContext2 != null ? C1308910kAL.LIZJ(R.attr.ee, sceneContext2) : null;
                tuxIconView2.setTuxIcon(c419910GdJ2);
            }
            TuxTextView tuxTextView2 = this.LLJJIII;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(2131829940);
                return;
            }
            return;
        }
        if (i == 3) {
            TuxIconView tuxIconView3 = this.LLJJI;
            if (tuxIconView3 != null) {
                C419910GdJ c419910GdJ3 = new C419910GdJ();
                c419910GdJ3.LIZ = R.raw.icon_live_photo_unlimited;
                Context sceneContext3 = getSceneContext();
                c419910GdJ3.LIZLLL = sceneContext3 != null ? C1308910kAL.LIZJ(R.attr.ee, sceneContext3) : null;
                tuxIconView3.setTuxIcon(c419910GdJ3);
            }
            TuxTextView tuxTextView3 = this.LLJJIII;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(2131836577);
            }
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJJ = requireViewById(R.id.mwx);
        this.LLJJI = (TuxIconView) requireViewById(R.id.n9h);
        this.LLJJIII = (TuxTextView) requireViewById(R.id.title);
        LLLIIIIL();
        View view = this.LLJJ;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS156S0100000_22(this, 8), view);
        }
        LiveData<C1456890o11> liveDataYh = this.LLJILJILJ.Yh();
        if (liveDataYh != null) {
            liveDataYh.observe(this, new AObserverS225S0100000_22(this, 22));
        }
        this.LLJILJIL.Nb0();
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout;
        setTheme(R.style.y0);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.d3b, viewGroup, false);
        if (viewTd instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) viewTd;
        } else {
            constraintLayout = null;
        }
        this.LLJJIJI = constraintLayout;
        return viewTd;
    }

    public static void LLLII(ConstraintLayout constraintLayout, View view, int i, int i2) {
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        c19mb.LJIIIZ(view.getId(), 6, 0, 6, i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        c19mb.LJIIIZ(view.getId(), 3, 0, 3, i2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        c19mb.LIZIZ(constraintLayout);
    }

    public C1452020ntA(C1DRG c1drg, SingleImageData singleImageData, C1452060ntE c1452060ntE, InterfaceC1451050nrb interfaceC1451050nrb, Function0 function0) {
        this.LLJI = c1drg;
        this.LLJIJIL = singleImageData;
        this.LLJILJIL = c1452060ntE;
        this.LLJILJILJ = interfaceC1451050nrb;
        this.LLJILLL = function0;
        C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
    }
}
