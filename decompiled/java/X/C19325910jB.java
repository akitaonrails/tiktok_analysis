package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.ss.android.ugc.aweme.music.ui.MusicLandingPageViewModel;

/* JADX INFO: renamed from: X.10jB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19325910jB extends AbstractC1542070qEP {
    public Context LLILLJJLI;
    public MusicLandingPageViewModel LLILLL;

    @Override // X.AbstractC1542070qEP, X.InterfaceC1163130gND
    public final void release() {
        this.LLILLJJLI = null;
    }

    @Override // X.InterfaceC1163110gNB
    public final View LJJL() {
        Context context = this.LLILLJJLI;
        if (context == null) {
            return null;
        }
        C19326510jH c19326510jH = new C19326510jH(context);
        C418570Gb9 c418570Gb9 = c19326510jH.LL;
        C418570Gb9 c418570Gb92 = c418570Gb9 != null ? c418570Gb9 : null;
        c418570Gb92.LIZ();
        c418570Gb92.LLJJ = true;
        c418570Gb92.LLJILJIL = true;
        c418570Gb92.postInvalidate();
        return c19326510jH;
    }

    @Override // X.AbstractC1542070qEP
    public final void LIZ(SparkContext sparkContext) {
        Object objLJJIJLIJ = sparkContext.LJJIJLIJ();
        C19EG c19eg = null;
        if (objLJJIJLIJ != null && (objLJJIJLIJ instanceof SparkActivity)) {
            c19eg = (C19EG) objLJJIJLIJ;
        }
        this.LLILLL = (MusicLandingPageViewModel) ViewModelProviders.of(c19eg).get(MusicLandingPageViewModel.class);
    }

    @Override // X.InterfaceC1163110gNB
    public final void LJIIJ(Context context) {
        this.LLILLJJLI = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1163110gNB
    public final View LJJJLIIL(final InterfaceC1051240dSk interfaceC1051240dSk) {
        C19327010jM c19327010jM;
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = "no_internet";
        Context context = this.LLILLJJLI;
        MusicLandingPageViewModel musicLandingPageViewModel = null;
        if (context != null) {
            c19327010jM = new C19327010jM(context);
            c19327010jM.setCurrentStatus$anchor_business_release((String) c259800zU.element);
            c19327010jM.setCurrentStatusView$anchor_business_release(new InterfaceC19326810jK() { // from class: X.10jA
                @Override // X.InterfaceC19326810jK
                public final void LIZ() {
                    interfaceC1051240dSk.refresh();
                    c259800zU.element = "safe";
                    C19325710j9 c19325710j9 = C19325710j9.LIZ;
                    c19325710j9.getClass();
                    C19325710j9.LIZIZ = "safe";
                    MusicLandingPageViewModel musicLandingPageViewModel2 = this.LLILLL;
                    if (musicLandingPageViewModel2 == null) {
                        musicLandingPageViewModel2 = null;
                    }
                    musicLandingPageViewModel2.vQ2(c259800zU.element);
                    c19325710j9.getClass();
                    C19325710j9.LJ = false;
                }
            });
        } else {
            c19327010jM = null;
        }
        C19325710j9.LIZ.getClass();
        if (C19325710j9.LJ) {
            C19325710j9.LJ = false;
            T t = c259800zU.element;
            C19325710j9.LIZIZ = (String) t;
            MusicLandingPageViewModel musicLandingPageViewModel2 = this.LLILLL;
            if (musicLandingPageViewModel2 != null) {
                musicLandingPageViewModel = musicLandingPageViewModel2;
            }
            musicLandingPageViewModel.vQ2((String) t);
        }
        return c19327010jM;
    }
}
