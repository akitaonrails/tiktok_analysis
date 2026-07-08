package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0hcF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1210890hcF implements InterfaceC1210900hcG {
    @Override // X.InterfaceC1210900hcG
    public final String LIZ(String str) {
        if (!TextUtils.isEmpty(str) && !"null".equals(str) && !CardStruct.IStatusCode.DEFAULT.equals(str)) {
            return str;
        }
        return "";
    }
}
