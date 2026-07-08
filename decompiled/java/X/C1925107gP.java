package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.07gP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1925107gP {
    public final String LIZ;

    public static boolean LIZ(char c) {
        if (c == '!' || c == '$' || c == '^' || c == '~') {
            return true;
        }
        switch (c) {
            case '<':
            case '=':
            case BaseNotice.CREATOR /* 62 */:
            case '?':
                return true;
            default:
                return false;
        }
    }

    public C1925107gP(String str) {
        this.LIZ = str;
    }
}
