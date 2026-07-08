package X;

import com.ss.android.ugc.aweme.net.model.ScopeEnum;

/* JADX INFO: renamed from: X.0X1T, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X1T {
    public static boolean LIZ(int i) {
        if (i != ScopeEnum.ALL.getScope() && i != ScopeEnum.ONLINE.getScope()) {
            return false;
        }
        return true;
    }
}
