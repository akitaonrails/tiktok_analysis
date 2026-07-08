package X;

import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vsB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1758930vsB extends AbstractC1758940vsC {
    public static String LIZJ(String str) {
        if (str != null) {
            for (EnumC1742550vRl enumC1742550vRl : EnumC1742550vRl.values()) {
                if (Intrinsics.LJFF(enumC1742550vRl.getValue(), str)) {
                    return str;
                }
            }
        }
        return EnumC1742550vRl.VIDEO.getValue();
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object parent;
        C2211641BhC c2211641BhCLIZLLL;
        View view;
        PageFinder pageFinderVia;
        ConcurrentHashMap<String, String> concurrentHashMap;
        String containerID;
        View view2;
        ConcurrentHashMap<String, String> concurrentHashMap2;
        View view3;
        View view4;
        InterfaceC1758950vsD interfaceC1758950vsD = (InterfaceC1758950vsD) xBaseParamModel;
        try {
            if (C1956507lT.LIZ().pageSourceEnable == 1) {
                C2211621BhA.LIZ.getClass();
                C2211641BhC c2211641BhC = C2211621BhA.LIZJ;
                if (c2211641BhC != null && c2211641BhC.LJJJ == null && c2211641BhC != null) {
                    c2211641BhC.LJJJ = new ConcurrentHashMap<>();
                }
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null && (view4 = interfaceC634840OvC.getView()) != null) {
                    parent = view4.getParent();
                } else {
                    parent = null;
                }
                if (!(parent instanceof View) || (view3 = (View) parent) == null || (c2211641BhCLIZLLL = C2211621BhA.LIZLLL(view3, null)) == null) {
                    c2211641BhCLIZLLL = C2211621BhA.LIZJ;
                }
                if (interfaceC1758950vsD.isAdd()) {
                    if (c2211641BhCLIZLLL != null && (concurrentHashMap2 = c2211641BhCLIZLLL.LJJJ) != null) {
                        concurrentHashMap2.put("feed_ec_card_price_type", LIZJ(interfaceC1758950vsD.getPriceType()));
                    }
                    C1766870w4z c1766870w4z = C1766870w4z.LIZ;
                    InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC2 != null) {
                        view2 = interfaceC634840OvC2.getView();
                    } else {
                        view2 = null;
                    }
                    List listSingletonList = Collections.singletonList(PageFinder.via(view2));
                    String strLIZJ = LIZJ(interfaceC1758950vsD.getPriceType());
                    c1766870w4z.getClass();
                    C1766870w4z.LJFF("feed_ec_card_price_type", strLIZJ, listSingletonList, false);
                } else {
                    if (c2211641BhCLIZLLL != null && (concurrentHashMap = c2211641BhCLIZLLL.LJJJ) != null) {
                        concurrentHashMap.remove("feed_ec_card_price_type");
                    }
                    C1766870w4z c1766870w4z2 = C1766870w4z.LIZ;
                    InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC3 != null) {
                        view = interfaceC634840OvC3.getView();
                    } else {
                        view = null;
                    }
                    List listSingletonList2 = Collections.singletonList(PageFinder.via(view));
                    c1766870w4z2.getClass();
                    if (C1766870w4z.LIZLLL()) {
                        Iterator it2 = listSingletonList2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            pageFinderVia = (PageFinder) it2.next();
                            if (BtmSDK.INSTANCE.getBtmPageInfoV2(pageFinderVia) != null) {
                                if (pageFinderVia == null) {
                                    break;
                                }
                            }
                        }
                        pageFinderVia = PageFinder.via(BtmSDK.INSTANCE.getCurrentResumedPage());
                        C18BV.LIZ.clearBcmPageParams(pageFinderVia, Collections.singletonList("feed_ec_card_price_type"));
                    }
                }
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC1758960vsE.class);
                InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
                if (interfaceC634840OvC4 != null) {
                    containerID = interfaceC634840OvC4.getContainerID();
                } else {
                    containerID = null;
                }
                completionBlock.onSuccess((XBaseResultModel) C1549500qQO.LIZJ(containerID, c19719912DlLIZ), "success");
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "no enable", null, 4);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2382909Vj.LIZ(completionBlock, 0, "set priceType error", null, 4);
        }
    }
}
