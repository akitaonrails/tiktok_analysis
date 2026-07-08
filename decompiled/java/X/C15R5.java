package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ttve.model.VEMusicWaveBean;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.vesdk.VEUtils;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: X.15R5, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15R5 {
    public static volatile C15R5 LJI = new C15R5();
    public static final HashMap<String, AVMusicWaveBean> LJII = new HashMap<>();
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;

    public static AVMusicWaveBean LIZIZ(AVMusicWaveBean aVMusicWaveBean) {
        if (aVMusicWaveBean != null && C15R6.LJ(aVMusicWaveBean.getMusicWavePointArray())) {
            AVMusicWaveBean aVMusicWaveBean2 = new AVMusicWaveBean();
            float[] musicWavePointArray = aVMusicWaveBean.getMusicWavePointArray();
            aVMusicWaveBean2.setMusicWavePointArray(Arrays.copyOf(musicWavePointArray, musicWavePointArray.length));
            aVMusicWaveBean2.setMusicPath(aVMusicWaveBean.getMusicPath());
            aVMusicWaveBean2.setMusicLength(aVMusicWaveBean.getMusicLength());
            aVMusicWaveBean2.setVideoLenght(aVMusicWaveBean.getVideoLenght());
            return aVMusicWaveBean2;
        }
        return aVMusicWaveBean;
    }

    public static AVMusicWaveBean LIZJ(VEMusicWaveBean vEMusicWaveBean) {
        if (vEMusicWaveBean != null && C15R6.LJ(vEMusicWaveBean.getWaveBean())) {
            C15R6.LIZ(vEMusicWaveBean);
            AVMusicWaveBean aVMusicWaveBean = new AVMusicWaveBean();
            float[] waveBean = vEMusicWaveBean.getWaveBean();
            aVMusicWaveBean.setMusicWavePointArray(Arrays.copyOf(waveBean, waveBean.length));
            return aVMusicWaveBean;
        }
        return null;
    }

    public static AVMusicWaveBean LIZLLL(AVMusic aVMusic) {
        if (C15R6.LJ(aVMusic.getMusicWaveData())) {
            AVMusicWaveBean aVMusicWaveBean = new AVMusicWaveBean();
            float[] musicWaveData = aVMusic.getMusicWaveData();
            aVMusicWaveBean.setMusicWavePointArray(Arrays.copyOf(musicWaveData, musicWaveData.length));
            return aVMusicWaveBean;
        }
        return null;
    }

    public static void LJ(AVMusicWaveBean aVMusicWaveBean) {
        if (aVMusicWaveBean != null && C15R6.LJ(aVMusicWaveBean.getMusicWavePointArray())) {
            int length = aVMusicWaveBean.getMusicWavePointArray().length;
            for (int i = 0; i < length; i++) {
                if (aVMusicWaveBean.getMusicWavePointArray()[i] < 0.1f) {
                    aVMusicWaveBean.getMusicWavePointArray()[i] = 0.1f;
                }
            }
        }
    }

    public final int LJI(Context context) {
        int iLJIIJ = C12ES.LJIIJ(context) - ((int) C12ES.LIZJ(20.0f, context));
        int i = this.LIZLLL;
        return (iLJIIJ + i) / (i + this.LIZIZ);
    }

    public final void LJIIIIZZ(Context context) {
        this.LIZ = (int) C12ES.LIZJ(3.0f, context);
        this.LIZIZ = (int) C12ES.LIZJ(2.0f, context);
        this.LIZJ = (int) C12ES.LIZJ(90.0f, context);
        this.LIZLLL = (int) C12ES.LIZJ(2.0f, context);
        this.LJFF = C12ES.LJIIJ(context);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.15R9] */
    public static void LJFF(String str, final C15RH c15rh) {
        if (TextUtils.isEmpty(str)) {
            c15rh.LIZ(null);
        } else {
            C15R6.LIZIZ(str, false, new C15RJ() { // from class: X.15R9
                @Override // X.C15RJ
                public final void LIZ(Object obj) {
                    boolean z;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("OLD_DRAFT AudioWaveDataIsNull:");
                    if (obj == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sbLIZ.append(z);
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    C15RH c15rh2 = c15rh;
                    if (c15rh2 != null) {
                        if (obj != null && (obj instanceof AVMusicWaveBean)) {
                            c15rh2.LIZ((AVMusicWaveBean) obj);
                        } else {
                            c15rh2.LIZ(null);
                        }
                    }
                }
            });
        }
    }

    public final int LJII(int i, boolean z) {
        int i2;
        if (this.LIZ + this.LIZIZ > 0 && (i2 = this.LJ) > 0) {
            int i3 = (int) (((this.LJFF + r1) / (r2 + r1)) * 1.0f * ((i * 1.0f) / i2));
            if (!z || i3 >= 2000) {
                return i3;
            }
        }
        return 2000;
    }

    public final void LIZ(AVMusicWaveBean aVMusicWaveBean, long j, long j2) {
        if (j > 0) {
            this.LJ = (int) j;
        }
        int iLJII = LJII((int) j2, false);
        if (aVMusicWaveBean != null && C15R6.LJ(aVMusicWaveBean.getMusicWavePointArray()) && iLJII > 0 && aVMusicWaveBean.getMusicWavePointArray().length > iLJII) {
            VEMusicWaveBean resampleMusicWaveData = VEUtils.getResampleMusicWaveData(aVMusicWaveBean.getMusicWavePointArray(), 0, iLJII);
            C15R6.LIZ(resampleMusicWaveData);
            if (resampleMusicWaveData != null && C15R6.LJ(resampleMusicWaveData.getWaveBean())) {
                float[] waveBean = resampleMusicWaveData.getWaveBean();
                aVMusicWaveBean.setMusicWavePointArray(Arrays.copyOf(waveBean, waveBean.length));
            }
        }
    }
}
