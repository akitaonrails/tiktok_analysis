package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.multiapp.INoticeExService;

/* JADX INFO: renamed from: X.0ijR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1253790ijR implements INoticeExService {
    public static final C1253790ijR LIZIZ = new C1253790ijR();
    public final /* synthetic */ INoticeExService LIZ;

    @Override // com.ss.android.ugc.aweme.multiapp.INoticeExService
    public final Bundle LIZ(Bundle bundle) {
        return this.LIZ.LIZ(bundle);
    }

    @Override // com.ss.android.ugc.aweme.multiapp.INoticeExService
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    public C1253790ijR() {
        INoticeExService iNoticeExService = (INoticeExService) PluggableExtentionKt.pluggableSpi$default(INoticeExService.class, false, false, false, 14, null);
        if (iNoticeExService != null) {
            this.LIZ = iNoticeExService;
        } else {
            "no implementation INoticeExService".toString();
            throw new IllegalStateException("no implementation INoticeExService");
        }
    }
}
