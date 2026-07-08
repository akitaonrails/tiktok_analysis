package X;

import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;

/* JADX INFO: renamed from: X.0zvp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1914950zvp {
    public static boolean LIZ(EnumC1876780ywG enumC1876780ywG, CollectConsentParam collectConsentParam) {
        if (collectConsentParam.skipCheckConsentStatus || enumC1876780ywG != EnumC1876780ywG.APPROVE) {
            return true;
        }
        return false;
    }
}
