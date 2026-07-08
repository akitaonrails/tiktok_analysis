package X;

import com.bytedance.lynx.hybrid.info.model.HybridInfo;
import com.bytedance.lynx.hybrid.info.model.TemplateInfo;
import com.ss.android.ugc.aweme.legoImp.HybridInfoColdBootTask;
import com.tiktok.forestx.RequestParamsX;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS73S1000000_23;

/* JADX INFO: renamed from: X.0ptp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529310ptp extends C09AY implements Function1<C1529100ptU, Unit> {
    public final /* synthetic */ C1533020pzo LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ HybridInfoColdBootTask LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1529310ptp(C1533020pzo c1533020pzo, String str, HybridInfoColdBootTask hybridInfoColdBootTask, String str2) {
        super(1);
        this.LL = c1533020pzo;
        this.LLILLJJLI = str;
        this.LLILLL = hybridInfoColdBootTask;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1529100ptU c1529100ptU) {
        List<HybridInfo> list;
        C1529100ptU c1529100ptU2 = c1529100ptU;
        if (c1529100ptU2.LIZ && (list = c1529100ptU2.LIZIZ) != null) {
            C1533020pzo c1533020pzo = this.LL;
            String str = this.LLILLJJLI;
            HybridInfoColdBootTask hybridInfoColdBootTask = this.LLILLL;
            String str2 = this.LLILZ;
            Iterator<HybridInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                TemplateInfo templateInfo = it2.next().templateInfo;
                if (templateInfo != null) {
                    String str3 = templateInfo.resSrc;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("start to fetch TemplateBundle for url: ");
                    sbLIZ.append(str3);
                    C1534250q1n.LJII("CodeCache", C2188811AlT.LIZIZ(sbLIZ), false);
                    RequestParamsX requestParamsX = new RequestParamsX(EnumC1533980q1M.LYNX_TEMPLATE, File.class);
                    requestParamsX.channel = templateInfo.channel;
                    requestParamsX.bundle = templateInfo.bundle;
                    requestParamsX.accessKey = templateInfo.accessKey;
                    requestParamsX.source = str;
                    c1533020pzo.LIZJ(str3, requestParamsX, new AwS73S1000000_23(str, hybridInfoColdBootTask, str2, 5));
                }
            }
        }
        return Unit.LIZ;
    }
}
