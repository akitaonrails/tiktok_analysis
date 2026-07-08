package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.fragmentcontainer.SubContentFragmentContainer;

/* JADX INFO: renamed from: X.0K4C, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K4C {
    public static SubContentFragmentContainer LIZ(Bundle bundle, String str) {
        SubContentFragmentContainer subContentFragmentContainer = new SubContentFragmentContainer();
        subContentFragmentContainer.LLILLJJLI = str;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        Bundle bundle2 = new Bundle(bundle);
        C786410Ut5.LJJJI("fragment_id", str, bundle2);
        subContentFragmentContainer.setArguments(bundle2);
        return subContentFragmentContainer;
    }
}
