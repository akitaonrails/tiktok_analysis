package X;

import android.app.RemoteInput;

/* JADX INFO: renamed from: X.0Vvw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C813660Vvw {
    public static int LIZ(Object obj) {
        return ((RemoteInput) obj).getEditChoicesBeforeSending();
    }

    public static RemoteInput.Builder LIZIZ(RemoteInput.Builder builder, int i) {
        return builder.setEditChoicesBeforeSending(i);
    }
}
