package X;

import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TTLComponent;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1CoO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241581CoO {
    public static final BaseResponseComponent LIZIZ(C2241571CoN c2241571CoN) {
        TTLComponent tTLComponent;
        C2241591CoP c2241591CoP = c2241571CoN.ttl;
        if (c2241591CoP != null) {
            Long l = c2241591CoP.expired_at;
            if (l == null) {
                l = C2241591CoP.DEFAULT_EXPIRED_AT;
            }
            tTLComponent = new TTLComponent(l.longValue());
        } else {
            tTLComponent = new TTLComponent(0);
        }
        List list = c2241571CoN.context_menu;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        Long l2 = c2241571CoN.min_version;
        if (l2 == null) {
            l2 = C2241571CoN.DEFAULT_MIN_VERSION;
        }
        long jLongValue = l2.longValue();
        Map<String, String> mapLJ = c2241571CoN.extra;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        return new BaseResponseComponent(tTLComponent, list, jLongValue, mapLJ);
    }

    public static final boolean LIZ(BaseResponseComponent baseResponseComponent, C0ZQC c0zqc) {
        switch (C0ZQD.LIZ[c0zqc.ordinal()]) {
            case 1:
                return baseResponseComponent.contentMenus.contains("delete");
            case 2:
                return baseResponseComponent.contentMenus.contains("digg");
            case 3:
                return baseResponseComponent.contentMenus.contains("report");
            case 4:
                return baseResponseComponent.contentMenus.contains("reply");
            case 5:
                return baseResponseComponent.contentMenus.contains("forward");
            case 6:
                return baseResponseComponent.contentMenus.contains("reaction");
            default:
                throw new C1954807lC();
        }
    }
}
