package X;

import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10Al, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public /* synthetic */ class C19202510Al extends C2217421BqW implements Function0<Boolean> {
    public C19202510Al(C191956107u c191956107u) {
        super(0, c191956107u, C191956107u.class, "shouldContentReusePopup", "shouldContentReusePopup()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        this.receiver.getClass();
        C191880104w.LIZ.getClass();
        boolean z = false;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI = C191880104w.LJIIJJI(0, "content_reuse_batch");
        if (privacySettingsRestrictionItemLJIIJJI != null && privacySettingsRestrictionItemLJIIJJI.resType == 15) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
