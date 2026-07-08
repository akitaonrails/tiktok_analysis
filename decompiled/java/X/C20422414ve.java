package X;

import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS321S0300000_31;

/* JADX INFO: renamed from: X.14ve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20422414ve extends AbstractC20422514vf {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        AbstractC20358714lN abstractC20358714lN;
        String containerID2;
        String containerID3;
        InterfaceC20422814vi interfaceC20422814vi = (InterfaceC20422814vi) xBaseParamModel;
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID4 = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ != null && (abstractC20358714lN = (AbstractC20358714lN) c1537480q70LIZIZ.LJFF(C20359714lX.class)) != null) {
            PlayRule playRuleLIZIZ = abstractC20358714lN.LIZIZ(interfaceC20422814vi.getStateId().longValue(), interfaceC20422814vi.getTaskStateData().getName(), "jsb", "");
            if (playRuleLIZIZ != null) {
                InterfaceC20422614vg taskStateData = interfaceC20422814vi.getTaskStateData();
                long jLongValue = taskStateData.getNext().longValue();
                boolean end = taskStateData.getEnd();
                String name = taskStateData.getName();
                String comment = taskStateData.getComment();
                List<Number> prev = taskStateData.getPrev();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(prev, 10));
                Iterator<Number> it2 = prev.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Long.valueOf(it2.next().longValue()));
                }
                C20361314ln c20361314lnLIZLLL = playRuleLIZIZ.LIZLLL(new C20424814w2(jLongValue, end, name, comment, arrayList, taskStateData.getVersion().longValue(), taskStateData.getMinAppVersion().longValue(), taskStateData.getParameter(), ""), "");
                C20365714mV c20365714mV = c20361314lnLIZLLL.LJFF;
                if (c20365714mV != null) {
                    File file = c20365714mV.LIZIZ;
                    if (file != null) {
                        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                        if (interfaceC634840OvC2 != null) {
                            containerID3 = interfaceC634840OvC2.getContainerID();
                        } else {
                            containerID3 = null;
                        }
                        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC20422914vj.class, containerID3);
                        InterfaceC20422914vj interfaceC20422914vj = (InterfaceC20422914vj) xBaseModelLIZJ;
                        InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                        if (interfaceC634840OvC3 != null) {
                            containerID4 = interfaceC634840OvC3.getContainerID();
                        }
                        InterfaceC20422714vh interfaceC20422714vh = (InterfaceC20422714vh) C1909107dp.LIZJ(InterfaceC20422714vh.class, containerID4);
                        interfaceC20422714vh.setDescList(c20361314lnLIZLLL.LJ);
                        interfaceC20422714vh.setContentImagePath(file.toURI().toString());
                        interfaceC20422914vj.setUiConfig(interfaceC20422714vh);
                        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                        return;
                    }
                    Function1<InterfaceC1631620sYq<? super String, ? super String, ? super List<String>, Unit>, Unit> function1 = c20365714mV.LJ;
                    if (function1 != null) {
                        function1.invoke(new AwS321S0300000_31(completionBlock, (CompletionBlock<InterfaceC20422914vj>) this, (C20422414ve) c20361314lnLIZLLL, (C20361314ln) 0));
                        return;
                    }
                }
                InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
                if (interfaceC634840OvC4 != null) {
                    containerID2 = interfaceC634840OvC4.getContainerID();
                } else {
                    containerID2 = null;
                }
                XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC20422914vj.class, containerID2);
                InterfaceC20422914vj interfaceC20422914vj2 = (InterfaceC20422914vj) xBaseModelLIZJ2;
                InterfaceC634840OvC interfaceC634840OvC5 = this.IBridgeSdkContext;
                if (interfaceC634840OvC5 != null) {
                    containerID4 = interfaceC634840OvC5.getContainerID();
                }
                InterfaceC20422714vh interfaceC20422714vh2 = (InterfaceC20422714vh) C1909107dp.LIZJ(InterfaceC20422714vh.class, containerID4);
                interfaceC20422714vh2.setDescList(c20361314lnLIZLLL.LJ);
                interfaceC20422914vj2.setUiConfig(interfaceC20422714vh2);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
                return;
            }
        }
        C2382909Vj.LIZ(completionBlock, -1, null, null, 6);
    }
}
