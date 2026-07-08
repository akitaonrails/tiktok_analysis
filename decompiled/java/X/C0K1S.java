package X;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: renamed from: X.0K1S, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K1S {
    public static final C19EG LIZ(Context context) {
        if (context instanceof C19EG) {
            return (C19EG) context;
        }
        if (context instanceof ContextWrapper) {
            return LIZ(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }
}
