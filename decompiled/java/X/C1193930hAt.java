package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: X.0hAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193930hAt {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, String str) {
        C1193850hAl.LIZ(context, new Intent("android.intent.action.DIAL", Uri.fromParts("tel", str, null)), "phone", null, null, null);
    }
}
