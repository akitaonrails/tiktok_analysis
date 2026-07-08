package X;

import android.os.Looper;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.component.phone.ttmobile.CollectMobileFromTTAssem;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0JDF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JDF extends C09AY implements InterfaceC1685420txc<UIAssem, EnumC488160JCk, Boolean, String, String, Unit> {
    public final /* synthetic */ CollectMobileFromTTAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JDF(CollectMobileFromTTAssem collectMobileFromTTAssem) {
        super(5);
        this.LL = collectMobileFromTTAssem;
    }

    @Override // X.InterfaceC1685420txc
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, EnumC488160JCk enumC488160JCk, Boolean bool, String str, String str2) {
        final UIAssem uIAssem2 = uIAssem;
        final EnumC488160JCk enumC488160JCk2 = enumC488160JCk;
        final Boolean bool2 = bool;
        final String str3 = str;
        final String str4 = str2;
        if (this.LL.LLJJIJIL) {
            BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
            final CollectMobileFromTTAssem collectMobileFromTTAssem = this.LL;
            C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.0JDE
                /* JADX WARN: Multi-variable type inference failed */
                public final void LIZ() {
                    int i = C0JDA.LIZ[enumC488160JCk2.ordinal()];
                    if (i == 1) {
                        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("get_result", "success"));
                        for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "a2270.b79668.c8964.d24906", PageFinder.via(C724240Sb0.LJI(uIAssem2)), null, 4, null).entrySet()) {
                            mapLJIIJ.put(entry.getKey(), String.valueOf(entry.getValue()));
                        }
                        collectMobileFromTTAssem.Oo("continue", mapLJIIJ);
                        return;
                    }
                    if (i != 2) {
                        return;
                    }
                    Pair[] pairArr = new Pair[2];
                    String str5 = str3;
                    if (str5 == null) {
                        str5 = "";
                    }
                    pairArr[0] = new Pair("error_code", str5);
                    String str6 = str4;
                    pairArr[1] = new Pair("error_message", str6 != null ? str6 : "");
                    Map mapLJIIJ2 = C2097608Jq.LJIIJ(pairArr);
                    Boolean bool3 = bool2;
                    if (bool3 != null) {
                        mapLJIIJ2.put("get_result", bool3.booleanValue() ? "get_tt_account_fail" : "get_pipo_server_fail");
                    }
                    for (Map.Entry entry2 : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "a2270.b79668.c8964.d24906", PageFinder.via(C724240Sb0.LJI(uIAssem2)), null, 4, null).entrySet()) {
                        mapLJIIJ2.put(entry2.getKey(), String.valueOf(entry2.getValue()));
                    }
                    collectMobileFromTTAssem.Oo("continue", mapLJIIJ2);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CollectMobileFromTTAssem@b73c.onViewCreated$9$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CollectMobileFromTTAssem@b73c.onViewCreated$9$1");
                }
            });
        }
        return Unit.LIZ;
    }
}
