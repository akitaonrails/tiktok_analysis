package X;

import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: X.0WlS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C832640WlS {
    public static <TResult> void LIZ(Status status, TResult tresult, C835520Wq6<TResult> c835520Wq6) {
        if (status.LJLZ()) {
            c835520Wq6.LIZIZ(tresult);
        } else {
            c835520Wq6.LIZ(new C0W4V(status));
        }
    }

    public static void LIZIZ(Status status, Object obj, C835520Wq6 c835520Wq6) {
        if (status.LJLZ()) {
            c835520Wq6.LIZLLL(obj);
        } else {
            c835520Wq6.LIZJ(new C0W4V(status));
        }
    }
}
