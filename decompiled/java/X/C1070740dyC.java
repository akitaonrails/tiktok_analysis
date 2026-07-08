package X;

import com.ss.android.ugc.aweme.friends.model.BackFromSettingEvent;
import com.ss.android.ugc.aweme.friends.model.SyncContactStatusEvent;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0dyC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1070740dyC {
    public String LIZ = "";

    public C1070740dyC() {
        EventBus.LIZLLL().LJIJJ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBackFromSettingEvent(BackFromSettingEvent backFromSettingEvent) {
        this.LIZ = backFromSettingEvent.enterFrom;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSyncContactStatusEvent(SyncContactStatusEvent syncContactStatusEvent) {
        if (Intrinsics.LJFF(this.LIZ, syncContactStatusEvent.enterFrom) && syncContactStatusEvent.isSuccess && !syncContactStatusEvent.lastValue) {
            C1076010e6h.LIZJ.LJJ();
        }
    }
}
