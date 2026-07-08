package X;

import android.os.Bundle;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0K64, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K64 {
    public static final /* synthetic */ int LIZ = 0;

    public static Bundle LIZ(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        Bundle bundle3 = new Bundle(bundle);
        C786410Ut5.LJJIIJZLJL(bundle3, bundle2);
        String string = bundle2.getString("enter_from");
        if ((string == null || string.length() == 0) && (string = bundle2.getString("enter_from_merge")) == null) {
            string = "";
        }
        C786410Ut5.LJJJI("enter_from", string, bundle3);
        bundle3.putInt("container_id", R.id.wl2);
        return bundle3;
    }
}
