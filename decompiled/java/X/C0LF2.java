package X;

import android.os.Bundle;
import android.os.IBinder;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.IBinderWrapper;

/* JADX INFO: renamed from: X.0LF2, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LF2 {
    public static AbstractBinderC539700LEq LIZ(Bundle bundle, String str) {
        IBinder iBinder;
        if (bundle == null) {
            return null;
        }
        IBinderWrapper iBinderWrapper = (IBinderWrapper) bundle.getParcelable(str);
        if (iBinderWrapper != null) {
            iBinder = iBinderWrapper.iBinder;
        } else {
            iBinder = null;
        }
        if (!(iBinder instanceof AbstractBinderC539700LEq)) {
            return null;
        }
        return (AbstractBinderC539700LEq) iBinder;
    }
}
