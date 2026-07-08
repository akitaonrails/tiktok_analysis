package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.vesdk.VEEditor;

/* JADX INFO: renamed from: X.15Ob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20511915Ob {
    public final /* synthetic */ C15R2 LIZ;

    public final void LIZ() {
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LIZ.LLLIL().creativeModel.musicBuzModel);
        InterfaceC1452170ntP value = this.LIZ.LLLII().g().getValue();
        if (value == null) {
            return;
        }
        int iMin = Math.min((aVMusicExtractAVMusic == null || aVMusicExtractAVMusic.getShootDuration() <= 0) ? Math.min(15000, value.getDuration()) : Math.abs(value.getDuration() - aVMusicExtractAVMusic.getShootDuration()) >= 1000 ? aVMusicExtractAVMusic.getShootDuration() : value.getDuration(), value.getDuration());
        InterfaceC1455860nzM interfaceC1455860nzMLLLII = this.LIZ.LLLII();
        C15R2 c15r2 = this.LIZ;
        int i = c15r2.LLJJJJ;
        C15R7 c15r7 = c15r2.LLJJ;
        if (c15r7 == null) {
            c15r7 = null;
        }
        c15r7.getClass();
        interfaceC1455860nzMLLLII.SX(new C1450120nq6(i, iMin, false));
        int iYf = value.Yf(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, this.LIZ.LLLFF);
        if (iYf != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPlayMusic seek error: ");
            sbLIZ.append(iYf);
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public C20511915Ob(C15R2 c15r2) {
        this.LIZ = c15r2;
    }
}
