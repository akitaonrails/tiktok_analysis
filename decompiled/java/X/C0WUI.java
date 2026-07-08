package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0WUI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WUI extends C0WUJ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        final C0WUK c0wuk = (C0WUK) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = null;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID = interfaceC634840OvC2.getContainerID();
        }
        final C0WUL c0wul = (C0WUL) C1909107dp.LIZJ(C0WUL.class, containerID);
        if (context == null) {
            c0wul.setShouldShow(-1);
            completionBlock.onSuccess(c0wul, "Unable to check, null context");
            return;
        }
        try {
            new C833200WmM(context).LIZLLL().LIZIZ(new InterfaceC834580Woa() { // from class: X.0W6z
                @Override // X.InterfaceC834580Woa
                public final void LIZ(AbstractC835450Wpz<List<TokenInfo>> abstractC835450Wpz) {
                    String message;
                    boolean z;
                    if (abstractC835450Wpz.LJIILJJIL() && !abstractC835450Wpz.LJIIL()) {
                        List<TokenInfo> listLJIIJ = abstractC835450Wpz.LJIIJ();
                        if (listLJIIJ != null && !listLJIIJ.isEmpty()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            c0wul.setShouldShow(1);
                            completionBlock.onSuccess(c0wul, "");
                            return;
                        }
                        C0WUK c0wuk2 = c0wuk;
                        ArrayList arrayList = new ArrayList();
                        for (TokenInfo tokenInfo : listLJIIJ) {
                            if (Intrinsics.LJFF(tokenInfo.zzc, c0wuk2.getCardLast4())) {
                                arrayList.add(tokenInfo);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            c0wul.setShouldShow(1);
                            completionBlock.onSuccess(c0wul, "");
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (((TokenInfo) it2.next()).zzg == 3) {
                                c0wul.setShouldShow(1);
                                completionBlock.onSuccess(c0wul, "");
                                return;
                            }
                        }
                        c0wul.setShouldShow(0);
                        completionBlock.onSuccess(c0wul, "");
                        return;
                    }
                    Exception excLJIIIZ = abstractC835450Wpz.LJIIIZ();
                    if (excLJIIIZ != null) {
                        message = excLJIIIZ.getMessage();
                    } else {
                        message = null;
                    }
                    c0wul.setShouldShow(-1);
                    CompletionBlock<C0WUL> completionBlock2 = completionBlock;
                    C0WUL c0wul2 = c0wul;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SDK error: ");
                    sbLIZ.append(message);
                    completionBlock2.onSuccess(c0wul2, a0.LJLIIIL(C2188811AlT.LIZIZ(sbLIZ)).toString());
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c0wul.setShouldShow(-1);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Encountered exception: ");
            sbLIZ.append(e.getMessage());
            completionBlock.onSuccess(c0wul, C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
