package X;

import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.lynx.hybrid.ssr.ILynxSSRDebugger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0qAT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539630qAT {
    public static Pair LIZ(C1537480q70 c1537480q70, HybridSchemaParam hybridSchemaParam) {
        String ssrUrl = hybridSchemaParam.getSsrUrl();
        ILynxSSRDebugger iLynxSSRDebugger = (ILynxSSRDebugger) PluggableExtentionKt.pluggableSpi$default(ILynxSSRDebugger.class, false, false, false, 14, null);
        if (iLynxSSRDebugger != null) {
            iLynxSSRDebugger.LIZIZ();
        }
        ILynxSSRDebugger iLynxSSRDebugger2 = (ILynxSSRDebugger) PluggableExtentionKt.pluggableSpi$default(ILynxSSRDebugger.class, false, false, false, 14, null);
        if (iLynxSSRDebugger2 != null) {
            iLynxSSRDebugger2.LJ();
        }
        ILynxSSRDebugger iLynxSSRDebugger3 = (ILynxSSRDebugger) PluggableExtentionKt.pluggableSpi$default(ILynxSSRDebugger.class, false, false, false, 14, null);
        if (iLynxSSRDebugger3 != null) {
            iLynxSSRDebugger3.LJI();
        }
        InterfaceC1539510qAH.LIZ.getClass();
        InterfaceC1539510qAH interfaceC1539510qAH = C1535760q4E.LIZIZ;
        int iIntValue = 1;
        if (interfaceC1539510qAH != null) {
            Boolean boolValueOf = Boolean.valueOf(interfaceC1539510qAH.LJFF(ssrUrl));
            if (!boolValueOf.booleanValue()) {
                boolValueOf.booleanValue();
                return new Pair(Boolean.FALSE, new C1539910qAv(EnumC1539700qAa.SETTING_DISABLED, null));
            }
        }
        if (c1537480q70 == null) {
            return new Pair(Boolean.FALSE, new C1539910qAv(EnumC1539700qAa.OTHER_NO_REQUEST_REASON, null));
        }
        try {
            C1539620qAS.LIZ.getClass();
            C1539910qAv c1539910qAvLIZ = C1539620qAS.LIZ(c1537480q70, hybridSchemaParam);
            if (c1539910qAvLIZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(ssrUrl);
                sbLIZ.append("] SSR mode is ");
                Integer ssrMode = hybridSchemaParam.getSsrMode();
                if (ssrMode != null) {
                    iIntValue = ssrMode.intValue();
                }
                sbLIZ.append(iIntValue);
                sbLIZ.append(", no need request server.");
                C2188811AlT.LIZIZ(sbLIZ);
                return new Pair(Boolean.FALSE, c1539910qAvLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("SSR mode is ");
            Integer ssrMode2 = hybridSchemaParam.getSsrMode();
            if (ssrMode2 != null) {
                iIntValue = ssrMode2.intValue();
            }
            sbLIZ2.append(iIntValue);
            sbLIZ2.append(", need request server.");
            C2188811AlT.LIZIZ(sbLIZ2);
            return new Pair(Boolean.TRUE, new C1539910qAv(EnumC1539700qAa.NONE, null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                Boolean bool = Boolean.FALSE;
                EnumC1539700qAa enumC1539700qAa = EnumC1539700qAa.OTHER_NO_REQUEST_REASON;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Mode Parse Failed.(");
                sbLIZ3.append(thM5exceptionOrNullimpl.getMessage());
                sbLIZ3.append(')');
                return new Pair(bool, new C1539910qAv(enumC1539700qAa, C2188811AlT.LIZIZ(sbLIZ3)));
            }
            return new Pair(Boolean.FALSE, new C1539910qAv(EnumC1539700qAa.OTHER_NO_REQUEST_REASON, "other reason"));
        }
    }

    public static C1539580qAO LIZIZ(C1537480q70 c1537480q70, LynxView lynxView, IResourceServiceX iResourceServiceX, AbstractC1537870q7d abstractC1537870q7d) {
        InterfaceC1539830qAn.LIZ.getClass();
        if (new C1539730qAd().LIZIZ(c1537480q70, null)) {
            return new C1539580qAO(c1537480q70, lynxView, iResourceServiceX, abstractC1537870q7d);
        }
        if (lynxView == null) {
            return null;
        }
        lynxView.updateGlobalProps(C2097908Jt.LIZJ(new Pair("ssrFallbackMode", EnumC1539700qAa.SETTING_DISABLED)));
        return null;
    }
}
