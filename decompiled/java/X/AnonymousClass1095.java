package X;

import com.ss.android.ugc.aweme.compliance.privacy.settings.video.v2.PromoteVideoVisibilitySettingFragment;
import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1095, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class AnonymousClass1095 extends C09AY implements Function0<C103L> {
    public AnonymousClass1095(PromoteVideoVisibilitySettingFragment promoteVideoVisibilitySettingFragment) {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C103L invoke() {
        SoftReference<C103L> softReference = C10AV.LIZ;
        C103L c103l = softReference != null ? softReference.get() : null;
        C10AV.LIZ = null;
        return c103l == null ? new C103L("", new C103N(""), 0, null, null, 60) : c103l;
    }
}
