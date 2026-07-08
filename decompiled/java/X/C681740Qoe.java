package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qoe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C681740Qoe extends AbstractC681750Qof {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object next;
        String containerID;
        InterfaceC681810Qol interfaceC681810Qol = (InterfaceC681810Qol) xBaseParamModel;
        try {
            if (interfaceC681810Qol.getDeleteAll()) {
                C681730Qod.LJIILIIL().LIZ();
            } else {
                String keyword = interfaceC681810Qol.getKeyword();
                if (keyword != null) {
                    Iterator it2 = ((ArrayList) C681730Qod.LJIILIIL().LJFF()).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(((MusicSearchHistory) next).keyword, keyword)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    MusicSearchHistory musicSearchHistory = (MusicSearchHistory) next;
                    if (musicSearchHistory != null) {
                        C681730Qod.LJIILIIL().LIZIZ(musicSearchHistory);
                    } else {
                        throw new IllegalArgumentException("target delete history not found");
                    }
                } else {
                    throw new NullPointerException("no keyword param when deleting one history");
                }
            }
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC681780Qoi.class, containerID);
            ((InterfaceC681780Qoi) xBaseModelLIZJ).setCode(1);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2382909Vj.LIZ(completionBlock, 0, String.valueOf(e.getMessage()), null, 4);
        }
    }
}
