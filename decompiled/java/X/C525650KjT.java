package X;

import android.content.Intent;
import android.os.Build;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0KjT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525650KjT {
    public static final List<MediaModel> LIZ(Intent intent) {
        ArrayList parcelableArrayListExtra;
        if (Build.VERSION.SDK_INT >= 34) {
            parcelableArrayListExtra = C0LEJ.LIZIZ(intent, "key_choose_media_data", MediaModel.class);
        } else {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        }
        if (parcelableArrayListExtra == null) {
            return C13BV.INSTANCE;
        }
        return parcelableArrayListExtra;
    }
}
