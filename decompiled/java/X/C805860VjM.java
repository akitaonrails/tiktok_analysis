package X;

import com.ss.android.ugc.aweme.im.sdk.notification.outapppushwsreconnect.OutAppPushDmCompensationManager;
import com.ss.android.ugc.aweme.im.service.IOutAppPushDmCompensationManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VjM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C805860VjM extends C09AY implements Function0<IOutAppPushDmCompensationManager> {
    public C805860VjM() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final IOutAppPushDmCompensationManager invoke() {
        if (C805820VjI.LIZ().upload_event) {
            return OutAppPushDmCompensationManager.LIZLLL();
        }
        return null;
    }
}
