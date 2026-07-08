package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.FeedPropPinModel;

/* JADX INFO: renamed from: X.0mdz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404170mdz {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Bundle bundle, CreativeModel creativeModel) {
        String string = bundle.getString("EXTRA_FEED_PROP_PIN");
        if (string != null) {
            creativeModel.feedPropPinModel = new FeedPropPinModel(string);
        }
    }
}
