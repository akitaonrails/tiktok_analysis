package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.ss.android.ugc.aweme.discover.model.SearchActivityCardBgData;

/* JADX INFO: renamed from: X.0P9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640260P9k {
    public static final C19EG LIZIZ(View view) {
        Context context = view.getContext();
        if (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof C19EG) {
            return (C19EG) context;
        }
        return null;
    }

    public static final String LIZ(SearchActivityCardBgData searchActivityCardBgData, int i) {
        int iIntValue;
        Integer activityBgRange = searchActivityCardBgData.getActivityBgRange();
        if (activityBgRange != null) {
            iIntValue = activityBgRange.intValue();
        } else {
            iIntValue = -1;
        }
        if (i < iIntValue) {
            return searchActivityCardBgData.getActivityBgColor();
        }
        return null;
    }
}
