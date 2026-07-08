package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nIH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429150nIH extends AbstractC1429240nIQ {
    public final C1429160nII LIZIZ;

    @Override // X.InterfaceC1429290nIV
    public final boolean LIZIZ() {
        C1429160nII c1429160nII = this.LIZIZ;
        String str = c1429160nII.LJFF;
        if (Intrinsics.LJFF(c1429160nII.LJ, Boolean.TRUE)) {
            return true;
        }
        if (C123100dR.LIZ(str) && C2286708xd.LIZJ(str)) {
            return true;
        }
        AVMusic aVMusic = this.LIZIZ.LIZLLL;
        if (aVMusic != null) {
            C1428920nHu.LIZ.getClass();
            if (C1428920nHu.LIZJ(aVMusic)) {
                return true;
            }
        }
        return C123100dR.LIZ(this.LIZIZ.LIZJ);
    }

    @Override // X.InterfaceC1429290nIV
    public final EnumC1429270nIT getTaskType() {
        return EnumC1429270nIT.DOWNLOAD_MUSIC_FROM_MODEL;
    }

    public C1429150nIH(C1429160nII c1429160nII) {
        this.LIZIZ = c1429160nII;
    }

    @Override // X.AbstractC1429240nIQ
    public final void LIZJ(final InterfaceC1429300nIW interfaceC1429300nIW) {
        final boolean z;
        C1429160nII c1429160nII = this.LIZIZ;
        AVMusic aVMusic = c1429160nII.LIZLLL;
        String str = c1429160nII.LIZJ;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (aVMusic == null) {
            this.LIZIZ.LJII = -10002;
            this.LIZIZ.LJIIIIZZ = "avMusic is null";
            if (interfaceC1429300nIW != null) {
                LIZLLL(interfaceC1429300nIW, z);
                return;
            }
            return;
        }
        InterfaceC1623990sMX interfaceC1623990sMXLJJJJL = C0CHQ.LIZ().LJJJJL();
        Context context = this.LIZIZ.LIZ;
        if (context == null) {
            context = C0CHQ.LIZ;
        }
        interfaceC1623990sMXLJJJJL.LJ("template_download", context, aVMusic, 0, false, new InterfaceC1416880myU() { // from class: X.0nIJ
            @Override // X.InterfaceC1416880myU
            public final void LIZJ(boolean z2) {
            }

            @Override // X.InterfaceC1416880myU
            public final void onStart() {
            }

            @Override // X.InterfaceC1416880myU
            public final void onProgress(int i) {
                this.LIZ.LIZIZ.LJIIJ = i;
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZ(Integer num, String str2) {
                C1429150nIH c1429150nIH = this.LIZ;
                C1429160nII c1429160nII2 = c1429150nIH.LIZIZ;
                c1429160nII2.LJII = num;
                c1429160nII2.LJIIIIZZ = str2;
                InterfaceC1429300nIW interfaceC1429300nIW2 = interfaceC1429300nIW;
                if (interfaceC1429300nIW2 != null) {
                    c1429150nIH.LIZLLL(interfaceC1429300nIW2, z);
                }
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZIZ(String str2, MusicWaveBean musicWaveBean) {
                C1429150nIH c1429150nIH = this.LIZ;
                C1429160nII c1429160nII2 = c1429150nIH.LIZIZ;
                c1429160nII2.LJFF = str2;
                c1429160nII2.LJ = Boolean.FALSE;
                c1429160nII2.LJI = false;
                InterfaceC1429300nIW interfaceC1429300nIW2 = interfaceC1429300nIW;
                if (interfaceC1429300nIW2 != null) {
                    c1429150nIH.LJFF(interfaceC1429300nIW2);
                }
            }
        }, false);
    }
}
