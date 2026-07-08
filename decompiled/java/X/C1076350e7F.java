package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IMainService;

/* JADX INFO: renamed from: X.0e7F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1076350e7F {
    public static Intent LIZ(Context context) {
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi(IMainService.class);
        if (iMainService != null) {
            return new Intent(context, iMainService.getMainActivityClass());
        }
        return new Intent();
    }
}
