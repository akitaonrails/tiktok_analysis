package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ttve.model.VEMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.15R6, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15R6 {
    public static void LIZ(VEMusicWaveBean vEMusicWaveBean) {
        float[] waveBean;
        if (vEMusicWaveBean != null && (waveBean = vEMusicWaveBean.getWaveBean()) != null) {
            if (waveBean.length == 0) {
                return;
            }
            int length = waveBean.length;
            for (int i = 0; i < length; i++) {
                if (Float.isNaN(waveBean[i])) {
                    waveBean[i] = 0.0f;
                }
            }
        }
    }

    public static C15RD LIZJ(Context context) {
        C15RD c15rd = new C15RD();
        if (context == null) {
            return c15rd;
        }
        c15rd.LIZJ = (int) C12ES.LIZJ(16.0f, context);
        c15rd.LIZIZ = (int) C12ES.LIZJ(6.0f, context);
        c15rd.LIZ = (int) C12ES.LIZJ(10.0f, context);
        c15rd.LJII = -1073741824;
        c15rd.LJI = -1;
        c15rd.LJ = (int) C12ES.LIZJ(4.0f, context);
        c15rd.LJFF = (int) C12ES.LIZJ(2.0f, context);
        c15rd.LJIIIIZZ = (int) C12ES.LIZJ(11.0f, context);
        c15rd.LIZLLL = (int) C12ES.LIZJ(8.0f, context);
        return c15rd;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean LIZLLL(java.lang.String r10) {
        /*
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean> r3 = X.C15R5.LJII
            java.lang.Object r0 = r3.get(r10)
            com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean r0 = (com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean) r0
            if (r0 == 0) goto Lf
            com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean r0 = X.C15R5.LIZIZ(r0)
            return r0
        Lf:
            java.lang.Class<com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService> r4 = com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService.class
            r5 = 0
            r8 = 14
            r9 = 0
            r6 = r5
            r7 = r5
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService r1 = (com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService) r1
            r4 = 1
            if (r1 == 0) goto L33
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            boolean r0 = r1.LJI(r0)
            if (r0 != r4) goto L33
            r0 = 1
        L30:
            if (r0 != 0) goto L35
            return r9
        L33:
            r0 = 0
            goto L30
        L35:
            X.0nlB r0 = X.C1403010mc7.LIZ
            com.ss.android.ugc.aweme.port.in.IAnotherMusicService r0 = r0.getMusicService()
            int r2 = r0.getMusicDuration(r10)
            r0 = -1
            if (r2 > r0) goto L43
            return r9
        L43:
            r0 = 90000(0x15f90, float:1.26117E-40)
            if (r2 <= r0) goto L49
            return r9
        L49:
            r1 = 2000(0x7d0, float:2.803E-42)
            if (r2 <= 0) goto L65
            X.15R5 r0 = X.C15R5.LJI
            int r0 = r0.LJII(r2, r4)
            if (r0 > 0) goto L67
        L55:
            com.ss.android.ttve.model.VEMusicWaveBean r0 = com.ss.android.vesdk.VEUtils.getMusicWaveData(r10, r5, r1)
            com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean r1 = X.C15R5.LIZJ(r0)
            com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean r0 = X.C15R5.LIZIZ(r1)
            r3.put(r10, r0)
            return r1
        L65:
            r0 = 2000(0x7d0, float:2.803E-42)
        L67:
            r1 = r0
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15R6.LIZLLL(java.lang.String):com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean");
    }

    public static boolean LJ(float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            return false;
        }
        return true;
    }

    public static AVMusicWaveBean LIZIZ(final String str, boolean z, C15R9 c15r9) {
        if (z) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return LIZLLL(str);
        }
        C15O7.LIZJ(new Callable() { // from class: X.15Q9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("MusicWaveHelper$Companion@cc6a.getAvMusicWaveBean$1");
                TextUtils.isEmpty(str);
                AVMusicWaveBean aVMusicWaveBeanLIZLLL = C15R6.LIZLLL(str);
                C1C7U.LIZIZ("MusicWaveHelper$Companion@cc6a.getAvMusicWaveBean$1");
                return aVMusicWaveBeanLIZLLL;
            }
        }).LJ(new C20749016Hg(c15r9, 2), C15O7.LJIIIIZZ, null);
        return null;
    }
}
