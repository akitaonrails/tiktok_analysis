package X;

import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;

/* JADX INFO: renamed from: X.0Dma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349220Dma {
    public static final boolean LIZ(AudioEnhanceParam audioEnhanceParam) {
        if (!audioEnhanceParam.getEnableOriginEnhance() && !audioEnhanceParam.getEnableMusicEnhance()) {
            return false;
        }
        return true;
    }
}
