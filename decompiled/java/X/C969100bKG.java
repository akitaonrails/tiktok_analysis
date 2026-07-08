package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkLoggerBlacklistSetting;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bKG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969100bKG extends C09AY implements Function0<List<? extends String>> {
    public C969100bKG() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        return C13LQ.LJJLL(LinkMicSdkLoggerBlacklistSetting.INSTANCE.getValue());
    }
}
