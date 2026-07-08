package X;

import com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdFoldButtonInfoStruct;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;

/* JADX INFO: renamed from: X.0c59, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998170c59 implements InterfaceC998270c5J {
    public final int LIZ;
    public final int LIZIZ;
    public final C998110c53 LIZJ;
    public final C998210c5D LIZLLL;
    public final IVideoPlayTaskManager LJ;
    public final C1000590c93 LJFF;
    public final boolean LJI;

    @Override // X.InterfaceC998220c5E
    public final IVideoPlayTaskManager LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC998220c5E
    public final C998210c5D LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC998220c5E
    public final boolean LIZJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC998220c5E
    public final C998110c53 LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC998220c5E
    public final C1000590c93 getLogger() {
        return this.LJFF;
    }

    public C998170c59(Integer num, Integer num2, C998110c53 c998110c53, ViewOnClickListenerC998120c54 viewOnClickListenerC998120c54) {
        boolean disableFoldCTA;
        AdFoldButtonInfoStruct foldButton;
        this.LIZ = num.intValue();
        this.LIZIZ = num2.intValue();
        this.LIZJ = c998110c53;
        this.LIZLLL = viewOnClickListenerC998120c54.LLJILJIL;
        this.LJ = viewOnClickListenerC998120c54.LL.LIZ();
        this.LJFF = viewOnClickListenerC998120c54.LLJILJILJ;
        AdDescriptiveCTAStruct adDescriptiveCTAStruct = viewOnClickListenerC998120c54.LLILZ;
        if (adDescriptiveCTAStruct != null && (foldButton = adDescriptiveCTAStruct.getFoldButton()) != null) {
            disableFoldCTA = foldButton.getDisableFoldCTA();
        } else {
            disableFoldCTA = false;
        }
        this.LJI = disableFoldCTA;
    }
}
