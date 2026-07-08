package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.mix.createmix.GuideCreateFragment;

/* JADX INFO: renamed from: X.0HXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C442680HXm {
    public static GuideCreateFragment LIZ(String str, String str2) {
        GuideCreateFragment guideCreateFragment = new GuideCreateFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", str, bundle);
        C786410Ut5.LJJJI("enter_method", str2, bundle);
        bundle.putBoolean("half_create_name", false);
        guideCreateFragment.setArguments(bundle);
        return guideCreateFragment;
    }
}
