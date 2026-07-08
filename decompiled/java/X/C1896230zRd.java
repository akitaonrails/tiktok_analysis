package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.touchpoint.api.model.AttributionBody;
import com.bytedance.touchpoint.api.model.AttributionResponse;
import com.bytedance.touchpoint.core.attr.IAttributionApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zRd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1896230zRd {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(495));

    public static void LIZ(final String str, final String str2, final String str3, final String str4, final Function0 function0) {
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        if (strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId != null && strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.length() != 0 && !Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId)) {
            LIZIZ(str, str2, str3, str4, function0);
        } else {
            DeviceRegisterManager.addOnDeviceConfigUpdateListener(new InterfaceC2210981Bg8() { // from class: X.0zRf
                @Override // X.InterfaceC2210981Bg8
                public final void LIZ(boolean z) {
                }

                @Override // X.InterfaceC2210981Bg8
                public final void LIZJ(boolean z) {
                }

                @Override // X.InterfaceC2210981Bg8
                public final void LIZIZ(String str5, String str6) {
                    BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
                    final String str7 = str;
                    final String str8 = str2;
                    final String str9 = str3;
                    final String str10 = str4;
                    final Function0<Unit> function02 = function0;
                    C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.0zRe
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("AttributionManager@215e.requestAfterDidUpdate$deviceConfigUpdateListener$1$onDeviceRegistrationInfoChanged$1");
                            try {
                                C1896230zRd.LIZIZ(str7, str8, str9, str10, function02);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("AttributionManager@215e.requestAfterDidUpdate$deviceConfigUpdateListener$1$onDeviceRegistrationInfoChanged$1");
                        }
                    });
                }
            });
        }
    }

    public static void LIZIZ(final String str, final String str2, final String str3, final String str4, Function0 function0) {
        C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0zRc
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<AttributionResponse> c09aj) {
                C1C7U.LIZ("AttributionManager@215e.requestRecordApi$1");
                try {
                    AttributionResponse attributionResponse = ((IAttributionApi) C1896230zRd.LIZ.getValue()).confirmAttribution(new AttributionBody(str, str2, str3, str4)).get();
                    if (attributionResponse != null && attributionResponse.statusCode == 0) {
                        c09aj.onNext(attributionResponse);
                    }
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    c09aj.onError(e);
                } catch (ExecutionException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    c09aj.onError(e2);
                }
                C1C7U.LIZIZ("AttributionManager@215e.requestRecordApi$1");
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19336510kt(function0, 3));
    }
}
