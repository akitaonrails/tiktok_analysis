package X;

import android.text.Spanned;

/* JADX INFO: renamed from: X.0uDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695570uDz {
    public static final boolean LIZ(Spanned spanned, Class<?> cls) {
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }
}
