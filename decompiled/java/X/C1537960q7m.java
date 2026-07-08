package X;

import android.net.Uri;
import com.bytedance.forest.chain.fetchers.GeckoXAdapter;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.forestx.RequestParamsX;

/* JADX INFO: renamed from: X.0q7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537960q7m extends AbstractC1301590jyX {
    public final /* synthetic */ C1537480q70 LIZ;

    public C1537960q7m(C1537480q70 c1537480q70) {
        this.LIZ = c1537480q70;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1301590jyX
    public final String LIZJ(C1301600jyY c1301600jyY) {
        Object c098200Yq;
        Uri uriAddCommonParamsForCDNMultiVersionURL;
        c1301600jyY.LIZJ = EnumC1299900jvo.EXACTLY_SYNC;
        C259800zU c259800zU = new C259800zU();
        C1537890q7f c1537890q7f = C1537890q7f.LIZ;
        C1537480q70 c1537480q70 = this.LIZ;
        EnumC1299880jvm enumC1299880jvm = c1301600jyY.LIZIZ;
        if (enumC1299880jvm == null) {
            enumC1299880jvm = EnumC1299880jvm.LynxResourceTypeTemplate;
        }
        c1537890q7f.getClass();
        Object obj = null;
        RequestParamsX requestParamsX = new RequestParamsX(C1537890q7f.LIZLLL(enumC1299880jvm), null, 2, null);
        requestParamsX.groupId = this.LIZ.containerId;
        requestParamsX.source = "new_lynx_resource_interface";
        requestParamsX.onlyLocal = true;
        C1537890q7f.LIZ(c1537480q70, c1301600jyY, null, requestParamsX, new C1537990q7p(c259800zU));
        String str = (String) c259800zU.element;
        if (str == null) {
            String str2 = c1301600jyY.LIZ;
            if (str2 == null) {
                return null;
            }
            if (C1535630q41.LJJIJ) {
                try {
                    c098200Yq = UriProtector.parse(str2);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                Uri uri = (Uri) obj;
                if (uri != null && (uriAddCommonParamsForCDNMultiVersionURL = GeckoXAdapter.Companion.addCommonParamsForCDNMultiVersionURL(str2, uri)) != uri) {
                    return uriAddCommonParamsForCDNMultiVersionURL.toString();
                }
                return str2;
            }
            return str2;
        }
        return str;
    }
}
