package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0S1B, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S1B {
    public static /* synthetic */ void LIZ(AvatarComponentView avatarComponentView, String str, Object obj, LifecycleOwner lifecycleOwner, boolean z, Function1 function1, int i) {
        Function1 function12 = function1;
        boolean z2 = z;
        if ((i & 16) != 0) {
            z2 = true;
        }
        if ((i & 32) != 0) {
            function12 = null;
        }
        avatarComponentView.LJIIIIZZ(lifecycleOwner, obj, str, function12, false, z2);
    }
}
