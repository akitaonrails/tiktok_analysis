package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09JS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09JS {
    public static final C09JS LIZ = new C09JS();

    public static String LIZ(String str) {
        if (str != null && u.LJJIIJZLJL(str, "http", false)) {
            return str;
        }
        if (!LIZJ(str)) {
            return "";
        }
        if (str != null && a0.LJJIIZI(str, "://", false)) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("file://");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final UrlModel LIZIZ(String str) {
        List<String> urlList;
        List<String> urlList2;
        UrlModel urlModel = new UrlModel();
        if (urlModel.getUrlList() == null) {
            urlModel.setUrlList(new ArrayList(1));
        }
        if (str != null && u.LJJIIJZLJL(str, "http", false)) {
            List<String> urlList3 = urlModel.getUrlList();
            if (urlList3 != null) {
                ListProtector.add(urlList3, 0, str);
            }
        } else if (LIZJ(str) && (urlList = urlModel.getUrlList()) != null) {
            ListProtector.add(urlList, 0, str);
        }
        List<String> urlList4 = urlModel.getUrlList();
        if (urlList4 != null && urlList4.isEmpty() && (urlList2 = urlModel.getUrlList()) != null) {
            urlList2.add("error_picture_path");
        }
        return urlModel;
    }

    public static final boolean LIZJ(String str) {
        Object c098200Yq;
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (new C0VSJ(str).exists() || C2400409as.LJIIIZ(C1948707kD.LIZ().getApplicationContext(), UriProtector.parse(str))) {
                z = true;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }
}
