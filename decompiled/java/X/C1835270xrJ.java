package X;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.DownloadLiveReplayMethod;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0xrJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1835270xrJ extends AbstractC1835280xrK {
    public static InterfaceC1835320xrO LIZLLL(DownloadInfo downloadInfo, String str) {
        InterfaceC1835320xrO interfaceC1835320xrO = (InterfaceC1835320xrO) C1909107dp.LIZJ(InterfaceC1835320xrO.class, null);
        interfaceC1835320xrO.setUrl(str);
        int iLJIIL = DownloadLiveReplayMethod.LJIIL(downloadInfo.getStatus());
        if (iLJIIL == 2 && !downloadInfo.isDownloaded()) {
            iLJIIL = 0;
        }
        interfaceC1835320xrO.setStatus(Integer.valueOf(iLJIIL));
        interfaceC1835320xrO.setPercent(Double.valueOf(((double) downloadInfo.getDownloadProcess()) / ((double) 100)));
        return interfaceC1835320xrO;
    }

    public final void LIZJ(String str, String str2) {
        C1835210xrD c1835210xrD = new C1835210xrD(str, str2, new C1835290xrL(this));
        if (C500260Jjc.LJJIJIIJIL((Boolean) DataChannelGlobal.LLILZ.gg0(AnonymousClass1689.class))) {
            C1836420xtA.LJFF().LJIIIIZZ(c1835210xrD.LIZIZ(), c1835210xrD);
        }
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1835300xrM interfaceC1835300xrM = (InterfaceC1835300xrM) xBaseParamModel;
        int i = 0;
        if (!interfaceC1835300xrM.getUrls().isEmpty() && !interfaceC1835300xrM.getIds().isEmpty() && interfaceC1835300xrM.getUrls().size() == interfaceC1835300xrM.getIds().size()) {
            ArrayList arrayList = new ArrayList();
            if (!interfaceC1835300xrM.getIds().isEmpty()) {
                for (String str : interfaceC1835300xrM.getIds()) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        String str2 = str;
                        C1836420xtA.LJFF().getClass();
                        DownloadInfo downloadInfoLIZLLL = C1836420xtA.LIZLLL(str2);
                        if (downloadInfoLIZLLL != null) {
                            arrayList.add(LIZLLL(downloadInfoLIZLLL, (String) ListProtector.get(interfaceC1835300xrM.getUrls(), i)));
                        } else {
                            String str3 = (String) ListProtector.get(interfaceC1835300xrM.getUrls(), i);
                            InterfaceC1835320xrO interfaceC1835320xrO = (InterfaceC1835320xrO) C1909107dp.LIZJ(InterfaceC1835320xrO.class, null);
                            interfaceC1835320xrO.setUrl(str3);
                            interfaceC1835320xrO.setStatus(0);
                            interfaceC1835320xrO.setPercent(0);
                            arrayList.add(interfaceC1835320xrO);
                        }
                        LIZJ((String) ListProtector.get(interfaceC1835300xrM.getUrls(), i), str2);
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else if (!interfaceC1835300xrM.getUrls().isEmpty()) {
                for (String str4 : interfaceC1835300xrM.getUrls()) {
                    int i3 = i + 1;
                    if (i >= 0) {
                        String str5 = str4;
                        C1836420xtA.LJFF().getClass();
                        DownloadInfo downloadInfoLIZJ = C1836420xtA.LIZJ(str5);
                        if (downloadInfoLIZJ != null) {
                            arrayList.add(LIZLLL(downloadInfoLIZJ, str5));
                        } else {
                            InterfaceC1835320xrO interfaceC1835320xrO2 = (InterfaceC1835320xrO) C1909107dp.LIZJ(InterfaceC1835320xrO.class, null);
                            interfaceC1835320xrO2.setUrl(str5);
                            interfaceC1835320xrO2.setStatus(0);
                            interfaceC1835320xrO2.setPercent(0);
                            arrayList.add(interfaceC1835320xrO2);
                        }
                        LIZJ(str5, (String) ListProtector.get(interfaceC1835300xrM.getIds(), i));
                        i = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            InterfaceC1835310xrN interfaceC1835310xrN = (InterfaceC1835310xrN) C1909107dp.LIZJ(InterfaceC1835310xrN.class, null);
            interfaceC1835310xrN.setDownloadInfo(arrayList);
            completionBlock.onSuccess(interfaceC1835310xrN, "");
            return;
        }
        completionBlock.onFailure(0, "", null);
    }
}
