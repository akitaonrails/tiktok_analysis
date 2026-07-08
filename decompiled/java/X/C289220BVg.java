package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0BVg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C289220BVg {
    public static final C289220BVg LIZ = new C289220BVg();
    public static Boolean LIZIZ;

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (Intrinsics.LJFF(LIZIZ, Boolean.TRUE)) {
            return true;
        }
        if (videoPublishEditModel == null) {
            if (((Boolean) C0ADT.LIZ.getValue()).booleanValue() && C1416310mxZ.LJIILIIL(videoPublishEditModel)) {
                return true;
            }
            return false;
        }
        if (((Boolean) C0ADT.LIZ.getValue()).booleanValue() && C1416310mxZ.LJIILIIL(videoPublishEditModel)) {
            return true;
        }
        if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate && ((Boolean) C259080ADi.LIZ.getValue()).booleanValue() && C1416310mxZ.LJIILIIL(videoPublishEditModel)) {
            return true;
        }
        return false;
    }
}
