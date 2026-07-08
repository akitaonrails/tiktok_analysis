package X;

import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.tasm.TemplateData;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0qMo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1547280qMo {
    public static final String LIZ(AbstractC1549150qPp<?, ?> abstractC1549150qPp) {
        InterfaceC1541990qEH interfaceC1541990qEH;
        String str;
        InterfaceC634840OvC interfaceC634840OvC = abstractC1549150qPp.IBridgeSdkContext;
        Object obj = null;
        if (interfaceC634840OvC == null || (interfaceC1541990qEH = (InterfaceC1541990qEH) interfaceC634840OvC.LIZIZ(InterfaceC1541990qEH.class)) == null) {
            return null;
        }
        C1537480q70 hybridContext = interfaceC1541990qEH.getHybridContext();
        String strLJIJI = hybridContext.LJIJI();
        if (hybridContext.usePreload) {
            Map<String, Object> globalProps = interfaceC1541990qEH.getGlobalProps();
            if (globalProps != null) {
                obj = globalProps.get("originUrl");
            }
            if ((obj instanceof String) && (str = (String) obj) != null && (!a0.LJJJIL(str)) && !Intrinsics.LJFF(str, "null")) {
                return str;
            }
        }
        return strLJIJI;
    }

    public static final String LIZIZ(SparkContext sparkContext) {
        Uri uriLIZJ = C1943307jL.LIZJ(sparkContext.LJIJI());
        if (uriLIZJ != null) {
            return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZJ, "target_handler");
        }
        return null;
    }

    public static final TemplateData LIZJ(Pair<String, ? extends Object>... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair<String, ? extends Object> pair : pairArr) {
            Object second = pair.getSecond();
            if (second != null) {
                linkedHashMap.put(pair.getFirst(), second);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return TemplateData.LJIIIIZZ(C1741890vQh.LJIIIIZZ(linkedHashMap));
    }

    public static final void LIZLLL(SparkContext sparkContext, final String str) {
        sparkContext.LJJ(AbstractC1539010q9T.class, new AbstractC1539010q9T() { // from class: X.0qMp
            @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                C1537910q7h c1537910q7h;
                if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                    c1537910q7h.LJIILJJIL = str;
                }
            }
        });
    }

    public static final SparkContext LJ(SparkContext sparkContext, TemplateData templateData) {
        if (templateData != null) {
            C1209090hZL c1209090hZL = new C1209090hZL(templateData, 0);
            sparkContext.getClass();
            sparkContext.LJJ(AbstractC1539010q9T.class, c1209090hZL);
        }
        return sparkContext;
    }

    public static final SparkContext LJFF(SparkContext sparkContext, Pair<String, ? extends Object>... pairArr) {
        LJ(sparkContext, LIZJ((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return sparkContext;
    }
}
