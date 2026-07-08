package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0n5F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421070n5F implements InterfaceC1420860n4u {
    public C0NM2 LIZ;
    public final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public String LIZJ;

    @Override // X.InterfaceC1420860n4u
    public final InterfaceC1420860n4u LIZ(C0NM2 c0nm2) {
        this.LIZ = c0nm2;
        return this;
    }

    @Override // X.InterfaceC1420860n4u
    public final void LIZIZ(Context context, String str, StickPointMusicAlg stickPointMusicAlg) {
        C609100Num c609100Num;
        C609100Num c609100Num2;
        C609100Num c609100Num3;
        C609100Num c609100Num4;
        C609100Num c609100Num5;
        C609100Num c609100Num6;
        this.LIZJ = str;
        if (stickPointMusicAlg == null) {
            C0NM2 c0nm2 = this.LIZ;
            if (c0nm2 != null) {
                c0nm2.LIZ(stickPointMusicAlg, false);
                return;
            }
            return;
        }
        C609100Num[] c609100NumArr = new C609100Num[6];
        String veBeatsUrl = stickPointMusicAlg.getVeBeatsUrl();
        if (veBeatsUrl != null && veBeatsUrl.length() > 0) {
            c609100Num = new C609100Num(veBeatsUrl, stickPointMusicAlg.getVeBeatsPath(), "ve-beats");
        } else {
            c609100Num = null;
        }
        c609100NumArr[0] = c609100Num;
        String downBeatsUrl = stickPointMusicAlg.getDownBeatsUrl();
        if (downBeatsUrl != null && downBeatsUrl.length() > 0) {
            c609100Num2 = new C609100Num(downBeatsUrl, stickPointMusicAlg.getDownBeatsPath(), "down-beats");
        } else {
            c609100Num2 = null;
        }
        c609100NumArr[1] = c609100Num2;
        String noStrengthBeatsUrl = stickPointMusicAlg.getNoStrengthBeatsUrl();
        if (noStrengthBeatsUrl != null && noStrengthBeatsUrl.length() > 0) {
            c609100Num3 = new C609100Num(noStrengthBeatsUrl, stickPointMusicAlg.getNoStrengthBeatsPath(), "no-strength-beats");
        } else {
            c609100Num3 = null;
        }
        c609100NumArr[2] = c609100Num3;
        String manModeBeatsUrl = stickPointMusicAlg.getManModeBeatsUrl();
        if (manModeBeatsUrl != null && manModeBeatsUrl.length() > 0) {
            c609100Num4 = new C609100Num(manModeBeatsUrl, stickPointMusicAlg.getManModeBeatsPath(), "man_mode");
        } else {
            c609100Num4 = null;
        }
        c609100NumArr[3] = c609100Num4;
        String musicsyncUrl = stickPointMusicAlg.getMusicsyncUrl();
        if (musicsyncUrl != null && musicsyncUrl.length() > 0) {
            c609100Num5 = new C609100Num(musicsyncUrl, stickPointMusicAlg.getMusicSyncPath(), "music_sync");
        } else {
            c609100Num5 = null;
        }
        c609100NumArr[4] = c609100Num5;
        String chorusUrl = stickPointMusicAlg.getChorusUrl();
        if (chorusUrl != null && chorusUrl.length() > 0) {
            c609100Num6 = new C609100Num(chorusUrl, stickPointMusicAlg.getChorusPath(), "chorus");
        } else {
            c609100Num6 = null;
        }
        c609100NumArr[5] = c609100Num6;
        List listLJIJI = C13LQ.LJIJI(c609100NumArr);
        if (((ArrayList) listLJIJI).isEmpty()) {
            C0NM2 c0nm22 = this.LIZ;
            if (c0nm22 != null) {
                c0nm22.LIZ(stickPointMusicAlg, false);
                return;
            }
            return;
        }
        C23250099c.LIZLLL(this.LIZIZ, null, null, new C0NM0(listLJIJI, this, context, stickPointMusicAlg, null), 3);
    }
}
