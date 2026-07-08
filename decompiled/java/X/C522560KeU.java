package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsService;

/* JADX INFO: renamed from: X.0KeU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C522560KeU {
    public static final /* synthetic */ C522560KeU LIZ = new C522560KeU();

    public static LiveRecordingsService LIZ() {
        return (LiveRecordingsService) PluggableExtentionKt.pluggableSpi$default(LiveRecordingsService.class, false, false, false, 14, null);
    }
}
