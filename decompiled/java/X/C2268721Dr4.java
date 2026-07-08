package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.video.IActivityNameService;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: renamed from: X.1Dr4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2268721Dr4 implements IActivityNameService {
    public static final C01GW<C2268721Dr4> LIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(448));

    @Override // com.ss.android.ugc.aweme.services.video.IActivityNameService
    public final Class<? extends Activity> getDraftBoxActivity() {
        return DraftBoxActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IActivityNameService
    public final Class<? extends Activity> getVideoRecordPermissionActivityClass() {
        return VideoRecordPermissionActivity.class;
    }
}
