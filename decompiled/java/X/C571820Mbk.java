package X;

import android.content.Context;
import com.ss.android.ugc.aweme.storage.impl.AVDraftStorage;

/* JADX INFO: renamed from: X.0Mbk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571820Mbk {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Context context) {
        if (context == null || C0WYJ.LJFF(context) >= 2147483648L || new AVDraftStorage().LJII(false) / 1048576.0d <= 50.0d) {
            return false;
        }
        return true;
    }
}
