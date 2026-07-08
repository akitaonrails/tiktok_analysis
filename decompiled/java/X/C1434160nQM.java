package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;

/* JADX INFO: renamed from: X.0nQM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434160nQM {
    public static final boolean LIZ(CreativeModel creativeModel) {
        DMMediaModel dMMediaModel = creativeModel.dmMediaModel;
        if (dMMediaModel != null && dMMediaModel.groupShotData != null) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(CreativeModel creativeModel) {
        DMMediaModel dMMediaModel = creativeModel.dmMediaModel;
        if (dMMediaModel != null) {
            if (dMMediaModel.type == 3 || dMMediaModel.type == 1) {
                return true;
            }
            return false;
        }
        return false;
    }
}
