package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicTrackConfigSetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0g64, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152500g64 extends C09AY implements Function0<Boolean> {
    public C1152500g64() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(LinkMicTrackConfigSetting.INSTANCE.enable());
    }
}
