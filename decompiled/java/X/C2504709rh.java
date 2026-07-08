package X;

import com.bef.effectsdk.EffectSDKUtils;
import com.ss.android.ttve.nativePort.TEJNIConfig;

/* JADX INFO: renamed from: X.09rh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2504709rh {
    public static final void LIZ() {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_ve_delay_jni", true, false)) {
            TEJNIConfig.setDelayJNIAB(true);
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_effect_delay_jni", true, false)) {
            EffectSDKUtils.setJniLazyLoad(true);
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_effect_ab_bundle_optimization", true, false)) {
            EffectSDKUtils.setAbBundleOptimization(true);
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_skip_register_editor_units", true, false)) {
            TEJNIConfig.setSkipRegisterEditorUnits(true);
        }
    }
}
