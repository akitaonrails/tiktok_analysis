package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveCoreEventForRecoTagConfigSetting;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0IjM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474620IjM extends C09AY implements Function0<Set<? extends String>> {
    public C474620IjM() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends String> invoke() {
        Set<String> whiteList = LiveCoreEventForRecoTagConfigSetting.INSTANCE.getWhiteList();
        if (whiteList != null) {
            return C13LP.LLIIJI(whiteList);
        }
        return null;
    }
}
