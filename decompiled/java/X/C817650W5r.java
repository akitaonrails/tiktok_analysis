package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C817650W5r {
    public static final boolean LIZ(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 230) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(Uri uri) {
        if (!Intrinsics.LJFF(uri.getHost(), "text_post") || !Intrinsics.LJFF(C13LP.LJJJLZIJ(0, uri.getPathSegments()), "detail")) {
            return false;
        }
        return true;
    }

    public static final void LIZJ(SmartRoute smartRoute, Fragment fragment) {
        Bundle arguments;
        Intent intent;
        if (fragment == null || (arguments = fragment.getArguments()) == null || !LIZIZ(UriProtector.parse(arguments.getString("next_router", "")))) {
            return;
        }
        arguments.remove("next_router");
        C19EG activity = fragment.getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            intent.removeExtra("next_router");
        }
        if (arguments.getInt("is_from_push", 0) == 1) {
            smartRoute.withParam("enter_from", "push");
        }
    }
}
