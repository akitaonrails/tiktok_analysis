package X;

import android.os.Bundle;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import defpackage.c;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0cWR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015090cWR extends c {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        String string;
        SparkContext sparkContext;
        Bundle bundle;
        c.a aVar = (c.a) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (containerID = interfaceC634840OvC.getContainerID()) != null) {
            aVar.getStatus().intValue();
            C1014730cVr.LLLLII.put(containerID, Integer.valueOf(aVar.getStatus().intValue()));
            try {
                SparkContext.Companion.getClass();
                C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
                Integer numValueOf = null;
                if ((c1537480q70LIZIZ instanceof SparkContext) && (sparkContext = (SparkContext) c1537480q70LIZIZ) != null && (bundle = (Bundle) sparkContext.LJFF(Bundle.class)) != null) {
                    string = bundle.getString("key_anole_bundle_component_type");
                    numValueOf = Integer.valueOf(bundle.getInt("key_anole_bundle_component_instance_hashcode"));
                    if (string != null && numValueOf != null) {
                        C1014730cVr.LLLLIIIILLL.put(Integer.valueOf(numValueOf.intValue()), new C1015050cWN(string, aVar.getStatus().intValue()));
                    }
                } else {
                    string = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("componentType = ");
                sbLIZ.append(string);
                sbLIZ.append(", componentHashCode = ");
                sbLIZ.append(numValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C1440005kM.LIZ(new C1641406bk(getName(), containerID, aVar));
        }
    }
}
