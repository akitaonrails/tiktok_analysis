package X;

import com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdFoldButtonInfoStruct;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;

/* JADX INFO: renamed from: X.0c58, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998160c58 implements InterfaceC998280c5K {
    public final int LIZ;
    public final Integer LIZIZ;
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

    public C998160c58(Integer num, int i, C998110c53 c998110c53, ViewOnClickListenerC998120c54 viewOnClickListenerC998120c54) {
        int iIntValue;
        Integer numValueOf;
        AdFoldButtonInfoStruct foldButton;
        boolean disableFoldCTA = false;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        this.LIZ = iIntValue;
        if (num != null && num.intValue() == i) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(i);
        }
        this.LIZIZ = numValueOf;
        this.LIZJ = c998110c53;
        this.LIZLLL = viewOnClickListenerC998120c54.LLJILJIL;
        this.LJ = viewOnClickListenerC998120c54.LL.LIZ();
        this.LJFF = viewOnClickListenerC998120c54.LLJILJILJ;
        AdDescriptiveCTAStruct adDescriptiveCTAStruct = viewOnClickListenerC998120c54.LLILZ;
        if (adDescriptiveCTAStruct != null && (foldButton = adDescriptiveCTAStruct.getFoldButton()) != null) {
            disableFoldCTA = foldButton.getDisableFoldCTA();
        }
        this.LJI = disableFoldCTA;
    }
}
