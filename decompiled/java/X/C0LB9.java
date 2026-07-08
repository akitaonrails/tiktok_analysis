package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.cut_ui.CutSource;

/* JADX INFO: renamed from: X.0LB9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LB9 {
    public static /* synthetic */ void LIZ(ITemplateResourceService iTemplateResourceService, Context context, CutSource cutSource, C1428840nHm c1428840nHm, LifecycleOwner lifecycleOwner, int i) {
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        Integer num = null;
        if ((i & 8) != 0) {
            lifecycleOwner2 = null;
        }
        if ((i & 16) != 0) {
            num = -1;
        }
        iTemplateResourceService.LJFF(context, cutSource, c1428840nHm, lifecycleOwner2, num);
    }
}
