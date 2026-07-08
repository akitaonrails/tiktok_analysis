package X;

import android.os.Bundle;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.tiktok.forestx.RequestParamsX;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0q5N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class RunnableC1536470q5N implements Runnable {
    public final /* synthetic */ C1536520q5S LL;
    public final /* synthetic */ C1299260jum<Bundle> LLILLJJLI;
    public final /* synthetic */ AbstractC1299910jvp<String> LLILLL;
    public final /* synthetic */ long LLILZ;

    public RunnableC1536470q5N(C1536520q5S c1536520q5S, C1299260jum<Bundle> c1299260jum, AbstractC1299910jvp<String> abstractC1299910jvp, long j) {
        this.LL = c1536520q5S;
        this.LLILLJJLI = c1299260jum;
        this.LLILLL = abstractC1299910jvp;
        this.LLILZ = j;
    }

    public final void LIZ() {
        IResourceServiceX iResourceServiceX = this.LL.LIZ;
        if (iResourceServiceX == null) {
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LynxKitI18nProvider request ");
            sbLIZ.append(this.LLILLJJLI.LIZ);
            sbLIZ.append(", but resourceService is null");
            C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, null, 4);
            return;
        }
        String str = this.LLILLJJLI.LIZ;
        if (u.LJJIIJZLJL(str, "__", false) || u.LJIIZILJ(str, "__", false) || a0.LJJLIIIJILLIZJL(str, new String[]{"__"}, 0, 6).size() != 3 || str == null) {
            return;
        }
        C1299260jum<Bundle> c1299260jum = this.LLILLJJLI;
        AbstractC1299910jvp<String> abstractC1299910jvp = this.LLILLL;
        C1536520q5S c1536520q5S = this.LL;
        long j = this.LLILZ;
        String string = c1299260jum.LIZIZ.getString("access_key");
        C1299970jvv c1299970jvv = new C1299970jvv(abstractC1299910jvp);
        boolean z = C1536390q5F.LIZ;
        Iterator<String> it2 = ((u.LJJIIJZLJL(str, "https://", false) || u.LJJIIJZLJL(str, "http://", false)) ? Collections.singletonList(str) : Forest.Companion.assembleGeckoCDNUrlList(C1535630q41.LJIIJJI, str, "lang.json", EnumC1534520q2E.I18N)).iterator();
        RequestParams requestParams = new RequestParams(EnumC1533980q1M.LYNX_I18N);
        if (string != null) {
            requestParams.accessKey = string;
        }
        requestParams.channel = str;
        requestParams.bundle = "lang.json";
        requestParams.waitGeckoUpdate = false;
        requestParams.waitLowStorageUpdate = true;
        requestParams.loadToMemory = true;
        requestParams.needLocalFile = Boolean.FALSE;
        C1537480q70 c1537480q70 = c1536520q5S.LIZIZ;
        if (c1537480q70 != null) {
            requestParams.customParams.put("rl_container_uuid", c1537480q70.containerId);
            requestParams.customParams.put("hybrid_channel", "Lynx_i18n_Forest");
            requestParams.customParams.put("source_location", "com.bytedance.lynx.hybrid.resource.LynxKitI18nProvider.request");
        }
        LIZIZ(c1536520q5S, iResourceServiceX, requestParams, string, str, c1299970jvv, j, it2, it2.hasNext() ? it2.next() : C1536390q5F.LIZ(str));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LynxKitI18nProvider@41bf.request$runnable$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxKitI18nProvider@41bf.request$runnable$1");
    }

    public static final void LIZIZ(C1536520q5S c1536520q5S, IResourceServiceX iResourceServiceX, RequestParams requestParams, String str, String str2, Function2<? super byte[], ? super String, Unit> function2, long j, Iterator<String> it2, String str3) {
        C1533020pzo c1533020pzoLJIILJJIL;
        C1537480q70 c1537480q70 = c1536520q5S.LIZIZ;
        if (c1537480q70 != null && (c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL(c1537480q70, false, null, 3)) != null) {
            RequestParamsX requestParamsX = new RequestParamsX(EnumC1533980q1M.LYNX_I18N, byte[].class);
            if (str != null) {
                requestParamsX.accessKey = str;
            }
            requestParamsX.channel = str2;
            requestParamsX.bundle = "lang.json";
            requestParamsX.waitGeckoUpdate = false;
            requestParamsX.waitLowStorageUpdate = true;
            requestParamsX.source = "LynxKitI18nProvider";
            String str4 = c1536520q5S.LIZIZ.containerId;
            requestParamsX.groupId = str4;
            requestParamsX.customParams = C2097608Jq.LJIIJ(new Pair("rl_container_uuid", str4), new Pair("hybrid_channel", "Lynx_i18n_Forest"), new Pair("source_location", "com.bytedance.lynx.hybrid.resource.LynxKitI18nProvider.request"));
            c1533020pzoLJIILJJIL.LIZ(str3, requestParamsX, new C1536480q5O(function2, c1536520q5S, j, it2, iResourceServiceX, requestParams, str, str2));
            return;
        }
        iResourceServiceX.fetchResourceAsyncIfNeed(str3, requestParams, new C1536490q5P(function2, c1536520q5S, j, it2, iResourceServiceX, requestParams, str, str2));
    }
}
