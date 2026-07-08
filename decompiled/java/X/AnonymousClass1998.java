package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;

/* JADX INFO: renamed from: X.1998, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1998 {
    public static C214932199m LIZ(Bundle bundle, boolean z, boolean z2, boolean z3) {
        C214932199m c214932199m;
        if (z2) {
            c214932199m = new C214901198h();
        } else {
            c214932199m = new C214932199m();
        }
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJJI("child_scene_class_name", SAFFragmentRootScene.class.getName(), bundle2);
        C786410Ut5.LJJIIZI(bundle2, bundle, "child_scene_class_arguments");
        bundle2.putBoolean("child_scene_class_should_create", z);
        bundle2.putBoolean("enable_scene_restore", z3);
        c214932199m.mArguments = bundle2;
        return c214932199m;
    }
}
