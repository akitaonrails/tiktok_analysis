package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Yef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879390Yef {
    public static final int LIZ(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (a0.LJJIIZI(str, ":", false)) {
            return AbstractC1711506n3.LIZ;
        }
        return AbstractC1711506n3.LIZIZ;
    }

    public static final UrlModel LIZIZ(C0Y8T c0y8t) {
        String icon;
        C0Y8Y coreInfo = c0y8t.getCoreInfo();
        if (coreInfo == null || (icon = coreInfo.getIcon()) == null || icon.length() <= 0) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(C1697810uHb.LJIILJJIL(icon));
        return urlModel;
    }

    public static final boolean LIZJ(C0Y8T c0y8t) {
        String str;
        Map<String, String> ext;
        if (c0y8t.isSingleChat()) {
            C0Y8Y coreInfo = c0y8t.getCoreInfo();
            String str2 = null;
            if (coreInfo != null && (ext = coreInfo.getExt()) != null) {
                str = ext.get("a:banner_indicator");
            } else {
                str = null;
            }
            if (!Intrinsics.LJFF(str, "tcm")) {
                Map<String, String> localExt = c0y8t.getLocalExt();
                if (localExt != null) {
                    str2 = localExt.get("a:banner_indicator");
                }
                if (Intrinsics.LJFF(str2, "tcm")) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(C0Y8T c0y8t) {
        Map<String, String> localExt;
        String str;
        Map<String, String> ext;
        C0Y8Y coreInfo = c0y8t.getCoreInfo();
        if ((coreInfo == null || (ext = coreInfo.getExt()) == null || (str = ext.get("risk")) == null) && ((localExt = c0y8t.getLocalExt()) == null || (str = localExt.get("risk")) == null)) {
            str = "";
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{":"}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() != 2 || !Intrinsics.LJFF(ListProtector.get(listLJJLIIIJILLIZJL, 1), "high")) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(String str) {
        String str2;
        Map<String, String> ext;
        String str3;
        Map<String, String> ext2;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ == null) {
            return false;
        }
        C0Y8Y coreInfo = c0y8tLIZ.getCoreInfo();
        String str4 = null;
        if (coreInfo == null || (ext2 = coreInfo.getExt()) == null || (str2 = ext2.get("a:create_src")) == null) {
            Map<String, String> localExt = c0y8tLIZ.getLocalExt();
            if (localExt != null) {
                str2 = localExt.get("a:create_src");
            } else {
                str2 = null;
            }
        }
        C0Y8Y coreInfo2 = c0y8tLIZ.getCoreInfo();
        if (coreInfo2 != null && (ext = coreInfo2.getExt()) != null && (str3 = ext.get("a:biz_user_id")) != null) {
            str4 = str3;
        } else {
            Map<String, String> localExt2 = c0y8tLIZ.getLocalExt();
            if (localExt2 != null) {
                str4 = localExt2.get("a:biz_user_id");
            }
        }
        if (!Intrinsics.LJFF(str2, "ttcm") || Intrinsics.LJFF(str4, C461720I8s.LIZIZ())) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(String str) {
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ != null) {
            return LIZJ(c0y8tLIZ);
        }
        return false;
    }
}
