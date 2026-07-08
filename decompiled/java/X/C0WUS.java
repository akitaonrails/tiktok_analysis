package X;

import android.app.Activity;
import android.content.IntentFilter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS449S0200000_13;
import kotlin.jvm.internal.AwS627S0100000_13;

/* JADX INFO: renamed from: X.0WUS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WUS extends C0WUU {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
            C0WUT c0wut = new C0WUT(activityLIZLLL);
            c0wut.LJ = new AwS449S0200000_13(c0wut, (C0WUT) completionBlock, (CompletionBlock<C0WUV>) 3);
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startBroadcastReceiver, mCanUseFeature:");
            sbLIZ.append(c0wut.LIZIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LJ(strLIZIZ);
            if (c0wut.LIZIZ) {
                if (c0wut.LIZLLL == null) {
                    c0wut.LIZLLL = new C0W4T(activityLIZLLL, new AwS627S0100000_13(c0wut, 8));
                }
                C0W4T c0w4t = c0wut.LIZLLL;
                if (c0w4t != null) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
                    try {
                        C838410Wul.LJFF(c0w4t.LIZ, c0w4t, intentFilter, 2);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("register exception: ");
                        sbLIZ2.append(e.getMessage());
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        c2341109Fh2.getClass();
                        C2341109Fh.LJ(strLIZIZ2);
                    }
                }
            }
            C2341109Fh c2341109Fh3 = C2341109Fh.LIZ;
            String str = "startVerify, mCanUseFeature:" + c0wut.LIZIZ;
            c2341109Fh3.getClass();
            C2341109Fh.LJ(str);
            if (c0wut.LIZIZ) {
                C2204961BRm.LLLLLJIL(c0wut.LIZJ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnunYepfo60dk/Il0KwsPfMrEirCpa8ytkHPUOqLf+WADP2zGmbkXw==", null)).LIZIZ(new InterfaceC834580Woa() { // from class: X.0W4U
                    @Override // X.InterfaceC834580Woa
                    public final void LIZ(AbstractC835450Wpz<Void> abstractC835450Wpz) {
                        if (abstractC835450Wpz.LJIILJJIL()) {
                            C2341109Fh.LIZ.getClass();
                            C2341109Fh.LJ("Sms Retriever started");
                        } else {
                            C2341109Fh.LIZ.getClass();
                            C2341109Fh.LJ("Failed to start SMS Retriever");
                        }
                    }
                });
            }
        }
    }
}
