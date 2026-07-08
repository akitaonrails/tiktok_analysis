package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0dYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1054870dYb {
    public final Bundle LIZ;

    public final boolean LIZ() {
        Bundle bundle = this.LIZ;
        if (bundle != null) {
            if (bundle.getInt("web_type") == 1) {
                return true;
            }
            String string = bundle.getString("disable_pop_gesture");
            if (string != null) {
                if (TextUtils.equals(string, CardStruct.IStatusCode.DEFAULT)) {
                    return true;
                }
                TextUtils.equals(string, "1");
            }
        }
        return false;
    }

    public C1054870dYb(Bundle bundle) {
        this.LIZ = bundle;
    }
}
