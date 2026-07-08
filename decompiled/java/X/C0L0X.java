package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;

/* JADX INFO: renamed from: X.0L0X, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L0X {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(CreativeModel creativeModel) {
        AutoCutModel autoCutModel;
        if (creativeModel != null && (autoCutModel = creativeModel.autoCutModel) != null && autoCutModel.backwardAutoCutProcess) {
            return true;
        }
        return false;
    }
}
