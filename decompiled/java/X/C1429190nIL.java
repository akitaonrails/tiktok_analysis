package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nIL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429190nIL extends AbstractC1429240nIQ {
    public final C1429160nII LIZIZ;

    @Override // X.InterfaceC1429290nIV
    public final boolean LIZIZ() {
        return Intrinsics.LJFF(this.LIZIZ.LJ, Boolean.TRUE) || this.LIZIZ.LIZLLL != null;
    }

    @Override // X.InterfaceC1429290nIV
    public final EnumC1429270nIT getTaskType() {
        return EnumC1429270nIT.FETCH_MUSIC;
    }

    public C1429190nIL(C1429160nII c1429160nII) {
        this.LIZIZ = c1429160nII;
    }

    @Override // X.AbstractC1429240nIQ
    public final void LIZJ(final InterfaceC1429300nIW interfaceC1429300nIW) {
        final boolean z;
        String str = this.LIZIZ.LIZJ;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str2 = this.LIZIZ.LIZIZ;
        if (str2 != null && str2.length() != 0) {
            C0CHQ.LIZ().LJJJJL().requestMusic(this.LIZIZ.LIZIZ, new InterfaceC1416890myV() { // from class: X.0nIK
                @Override // X.InterfaceC1416890myV
                public final void LIZIZ(Exception exc) {
                    String strLIZIZ;
                    C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("FetchMusicTask onLoadMusicFail: ");
                    if (exc != null) {
                        strLIZIZ = C13SZ.LIZIZ(exc);
                    } else {
                        strLIZIZ = null;
                    }
                    sbLIZ.append(strLIZIZ);
                    C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                    C1429190nIL c1429190nIL = this.LIZ;
                    c1429190nIL.LIZIZ.LJIIIZ = exc;
                    InterfaceC1429300nIW interfaceC1429300nIW2 = interfaceC1429300nIW;
                    if (interfaceC1429300nIW2 != null) {
                        c1429190nIL.LIZLLL(interfaceC1429300nIW2, z);
                    }
                }

                @Override // X.InterfaceC1416890myV
                public final void LIZLLL(AVMusic aVMusic) {
                    String musicId;
                    C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("FetchMusicTask onLoadMusicSuccess: music: musicId = ");
                    String str3 = null;
                    if (aVMusic != null) {
                        musicId = aVMusic.getMusicId();
                    } else {
                        musicId = null;
                    }
                    sbLIZ.append(musicId);
                    sbLIZ.append(", musicName = ");
                    if (aVMusic != null) {
                        str3 = aVMusic.musicName;
                    }
                    sbLIZ.append(str3);
                    C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                    if (aVMusic == null) {
                        this.LIZ.LIZIZ.LJIIIZ = new Exception("music is null");
                        InterfaceC1429300nIW interfaceC1429300nIW2 = interfaceC1429300nIW;
                        if (interfaceC1429300nIW2 != null) {
                            this.LIZ.LIZLLL(interfaceC1429300nIW2, z);
                            return;
                        }
                        return;
                    }
                    C1429190nIL c1429190nIL = this.LIZ;
                    c1429190nIL.LIZIZ.LIZLLL = aVMusic;
                    InterfaceC1429300nIW interfaceC1429300nIW3 = interfaceC1429300nIW;
                    if (interfaceC1429300nIW3 != null) {
                        c1429190nIL.LJFF(interfaceC1429300nIW3);
                    }
                }
            });
            return;
        }
        this.LIZIZ.LJIIIZ = new Exception("musicId is null or empty");
        if (interfaceC1429300nIW != null) {
            LIZLLL(interfaceC1429300nIW, z);
        }
    }
}
