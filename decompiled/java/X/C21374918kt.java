package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;

/* JADX INFO: renamed from: X.18kt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21374918kt {
    public static int LIZ(int i, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
