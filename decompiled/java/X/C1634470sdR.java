package X;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

/* JADX INFO: renamed from: X.0sdR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1634470sdR {
    public static final String LIZ(Object obj) {
        ProviderEffectModel providerEffectModel;
        String subtitle;
        if (!(obj instanceof ProviderEffectModel) || (providerEffectModel = (ProviderEffectModel) obj) == null || (subtitle = providerEffectModel.getSubtitle()) == null) {
            return "";
        }
        return subtitle;
    }
}
