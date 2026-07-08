package X;

import android.app.Activity;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0VYO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class C0VYO implements C0VYN {
    public static final String LIZ(Activity activity) {
        if (activity instanceof ActivityC21503719Dn) {
            String rootFragmentClsName = ((ActivityC21503719Dn) activity).getRootFragmentClsName();
            if (!TextUtils.isEmpty(rootFragmentClsName)) {
                return rootFragmentClsName;
            }
        }
        return activity.getClass().getName();
    }
}
