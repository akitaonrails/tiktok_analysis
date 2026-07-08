package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LtN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C557270LtN {
    public static /* synthetic */ void LIZ(InterfaceC557280LtO interfaceC557280LtO, Activity activity, VideoPublishEditModel videoPublishEditModel, int i, boolean z, boolean z2, Function1 function1, Bundle bundle, String str, int i2) {
        Function1 function12 = function1;
        String str2 = str;
        boolean z3 = z2;
        boolean z4 = z;
        if ((i2 & 8) != 0) {
            z4 = false;
        }
        if ((i2 & 16) != 0) {
            z3 = false;
        }
        Bundle bundle2 = null;
        if ((i2 & 32) != 0) {
            function12 = null;
        }
        if ((i2 & 64) == 0) {
            bundle2 = bundle;
        }
        if ((i2 & 128) != 0) {
            str2 = "video_edit_page";
        }
        interfaceC557280LtO.LIZ(activity, videoPublishEditModel, z4, z3, function12, bundle2, str2);
    }
}
