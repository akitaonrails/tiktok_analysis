package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0BVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C289160BVa {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4435));

    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (((Boolean) LIZ.getValue()).booleanValue()) {
            return true;
        }
        if (videoPublishEditModel == null || !videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            return false;
        }
        return ((Boolean) C273590Ant.LIZ.getValue()).booleanValue();
    }
}
