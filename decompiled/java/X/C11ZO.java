package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;

/* JADX INFO: renamed from: X.11ZO, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11ZO implements C11ZP, InterfaceC19523111Zt<C11ZP> {
    @Override // X.InterfaceC19523111Zt
    public final C11ZA LJIIIIZZ() {
        return this;
    }

    @Override // X.C11ZP
    public final Object LJIILIIL(Context context, AVMusic aVMusic, C19521711Zf c19521711Zf) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c19521711Zf));
        C1403010mc7.LIZ.getMusicService().LJ("pp_meme_audio", context, aVMusic, 0, false, new InterfaceC1416880myU() { // from class: X.11ZM
            @Override // X.InterfaceC1416880myU
            public final void LIZJ(boolean z) {
            }

            @Override // X.InterfaceC1416880myU
            public final void onProgress(int i) {
            }

            @Override // X.InterfaceC1416880myU
            public final void onStart() {
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZ(Integer num, String str) {
                int iIntValue;
                InterfaceC1364105Vn<C11ZF> interfaceC1364105Vn = c23260099m;
                C11ZF c11zf = new C11ZF();
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                c11zf.LJI = iIntValue;
                if (str == null) {
                    str = "download music error";
                }
                c11zf.LJII = str;
                C189200o6.m2constructorimpl(c11zf);
                interfaceC1364105Vn.resumeWith(c11zf);
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZIZ(String str, MusicWaveBean musicWaveBean) {
                InterfaceC1364105Vn<C11ZF> interfaceC1364105Vn = c23260099m;
                C11ZF c11zf = new C11ZF();
                c11zf.LJFF = str;
                C189200o6.m2constructorimpl(c11zf);
                interfaceC1364105Vn.resumeWith(c11zf);
            }
        }, false);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c19521711Zf);
        }
        return objLIZ;
    }
}
