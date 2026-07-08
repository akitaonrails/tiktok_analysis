package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.AFwS344S0000000_23;
import kotlin.jvm.internal.AwS458S0200000_23;
import kotlin.jvm.internal.AwS672S0100000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0qNm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1547880qNm extends AbstractC1547890qNn {
    public final String LLILLL = "PreloadKitViewMethodIDL";
    public final AFwS344S0000000_23 LLILZ = AFwS344S0000000_23.get$arr$(3);
    public final AFwS344S0000000_23 LLILZIL = AFwS344S0000000_23.get$arr$(2);

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        int iIntValue;
        Integer num;
        InterfaceC1547900qNo interfaceC1547900qNo = (InterfaceC1547900qNo) xBaseParamModel;
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1097680efe c1097680efe = new C1097680efe();
        c1097680efe.LIZ = interfaceC1547900qNo.getBiz();
        Number maxCacheKeyCount = interfaceC1547900qNo.getMaxCacheKeyCount();
        if (maxCacheKeyCount != null) {
            c1097680efe.LIZIZ = ((Integer) maxCacheKeyCount).intValue();
        }
        Number maxPrerenderCountPerCacheKey = interfaceC1547900qNo.getMaxPrerenderCountPerCacheKey();
        if (maxPrerenderCountPerCacheKey != null) {
            c1097680efe.LIZJ = ((Integer) maxPrerenderCountPerCacheKey).intValue();
        }
        Boolean keepAliveWhenUsed = interfaceC1547900qNo.getKeepAliveWhenUsed();
        Boolean bool = Boolean.TRUE;
        c1097680efe.LIZLLL = Intrinsics.LJFF(keepAliveWhenUsed, bool);
        c1097680efe.LJ = Intrinsics.LJFF(interfaceC1547900qNo.getPendingLoad(), bool);
        Number prerenderCheckStatusType = interfaceC1547900qNo.getPrerenderCheckStatusType();
        if ((prerenderCheckStatusType instanceof Integer) && (num = (Integer) prerenderCheckStatusType) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c1097680efe.LJII = iIntValue;
        String matchCacheRegex = interfaceC1547900qNo.getMatchCacheRegex();
        if (matchCacheRegex != null) {
            if (matchCacheRegex.length() < 5) {
                C1530030puz.LIZ(this.LLILLL, "Invalid param, matchCacheRegex too short...", null);
            } else if (!new Regex(matchCacheRegex).containsMatchIn(interfaceC1547900qNo.getCacheKey()) && !C1545590qK5.LIZIZ.LIZLLL(interfaceC1547900qNo.getCacheKey())) {
                C1530030puz.LIZ(this.LLILLL, "Invalid param, matchCacheRegex cannot match the cacheKey, please check...", null);
            } else {
                c1097680efe.LJIIJJI = matchCacheRegex;
            }
        }
        c1097680efe.LJIIIIZZ = new AwS458S0200000_23(this, c1097680efe, 4);
        c1097680efe.LJIJJ = new AwS672S0100000_23(this, 5);
        C1537060q6K.LJIIL(c1097680efe, bool);
        String cacheKey = interfaceC1547900qNo.getCacheKey();
        String biz = interfaceC1547900qNo.getBiz();
        boolean zLJFF = Intrinsics.LJFF(interfaceC1547900qNo.getNow(), bool);
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(interfaceC1547900qNo.getCacheKey());
        C1537060q6K.LJIIJ(cacheKey, biz, sparkContext, new C1537070q6L() { // from class: X.0pkz
            @Override // X.C1537070q6L
            public final void LIZJ(String str, String str2, C1537080q6M c1537080q6M) {
                CompletionBlock<InterfaceC1547910qNp> completionBlock2 = completionBlock;
                String str3 = c1537080q6M.LIZ;
                if (str3 == null) {
                    str3 = "failed";
                }
                C2382909Vj.LIZ(completionBlock2, 0, str3, null, 4);
            }
        }, zLJFF, bool);
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1547910qNp.class, null), "");
    }
}
