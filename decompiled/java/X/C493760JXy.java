package X;

import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JXy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493760JXy extends C09AY implements Function0<String> {
    public C493760JXy() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }
}
