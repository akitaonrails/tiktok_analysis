package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;

/* JADX INFO: renamed from: X.0sNN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624510sNN {
    public static final VEEffectFilterParam LIZ(Effect effect) {
        String unzipPath;
        long jLongValue;
        VEEffectFilterParam vEEffectFilterParam = new VEEffectFilterParam();
        String str = "";
        if (C1624200sMs.LJFF(effect)) {
            if (effect == null) {
                unzipPath = "";
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(effect.getUnzipPath());
                sbLIZ.append("/effect");
                unzipPath = C2188811AlT.LIZIZ(sbLIZ);
            }
        } else {
            unzipPath = effect.getUnzipPath();
        }
        vEEffectFilterParam.effectPath = unzipPath;
        vEEffectFilterParam.useLongId = true;
        Long lLJIILIIL = C2095008Iq.LJIILIIL(effect.getEffectId());
        long jLongValue2 = 0;
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        vEEffectFilterParam.longStickerId = jLongValue;
        Long lLJIILIIL2 = C2095008Iq.LJIILIIL(effect.getEffectId());
        if (lLJIILIIL2 != null) {
            jLongValue2 = lLJIILIIL2.longValue();
        }
        vEEffectFilterParam.longRequestId = jLongValue2;
        vEEffectFilterParam.resId = effect.getResourceId();
        String extra = effect.getExtra();
        if (extra != null) {
            str = extra;
        }
        vEEffectFilterParam.stickerTag = str;
        vEEffectFilterParam.needReload = false;
        if (C1624200sMs.LJIILIIL(effect)) {
            vEEffectFilterParam.effectFilterType = VEEffectFilterParam.EffectFilterType.MUSIC;
        }
        if (C1624200sMs.LJIILJJIL(effect)) {
            vEEffectFilterParam.effectFilterType = VEEffectFilterParam.EffectFilterType.AUDIO_SPEED;
        }
        if (C1624200sMs.LJIIJJI(effect)) {
            vEEffectFilterParam.multicamMode = true;
        }
        return vEEffectFilterParam;
    }
}
