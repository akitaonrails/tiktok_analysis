package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Bh7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C294870Bh7 {
    public static final C294870Bh7 LIZ = new C294870Bh7();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1038));

    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        LIZ.getClass();
        if (((Boolean) LIZIZ.getValue()).booleanValue() || C1416310mxZ.LJIILLIIL(videoPublishEditModel)) {
            return true;
        }
        if (videoPublishEditModel != null && videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            return true;
        }
        return false;
    }
}
