package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0CHa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C311000CHa {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2839));

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!((Boolean) LIZ.getValue()).booleanValue() || videoPublishEditModel.creativeModel.draftInfoModel.isDraft || C0CHQ.LIZ().getAccountService().LIZ() || C1428470nHB.LJJLIL(videoPublishEditModel)) {
            return false;
        }
        return true;
    }
}
