package X;

import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import com.ss.android.ugc.tiktok.pns.screen.network.BaseResponse;
import com.ss.android.ugc.tiktok.pns.screen.network.ScreenTimeActionRequest;
import kotlin.Pair;

/* JADX INFO: renamed from: X.10cI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19283210cI {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C19253610Uc());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C19283110cH());

    public static void LIZ(final ScreenTimeActionRequest screenTimeActionRequest, final InterfaceC19284510cV interfaceC19284510cV) {
        C11NZ<BaseResponse> c11nzLIZJ;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC19283610cM interfaceC19283610cM = (InterfaceC19283610cM) LIZ.getValue();
        if (interfaceC19283610cM != null && (c11nzLIZJ = interfaceC19283610cM.LIZJ(screenTimeActionRequest)) != null) {
            c11nzLIZJ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new InterfaceC626120Oh8<BaseResponse>() { // from class: X.10cJ
                @Override // X.InterfaceC626120Oh8
                public final void onComplete() {
                }

                @Override // X.InterfaceC626120Oh8
                public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                }

                @Override // X.InterfaceC626120Oh8
                public final void onError(Throwable th) {
                    interfaceC19284510cV.onFailure();
                }

                @Override // X.InterfaceC626120Oh8
                public final void onNext(BaseResponse baseResponse) {
                    BaseResponse baseResponse2 = baseResponse;
                    if (baseResponse2.getStatusCode() == 0) {
                        interfaceC19284510cV.onSuccess();
                    } else {
                        interfaceC19284510cV.onFailure();
                    }
                    ((PnSDigitalWellbeingSDKService) C19283210cI.LIZIZ.getValue()).LIZ("digital_wellbeing_api", C2097608Jq.LJIIIIZZ(new Pair("status_code", String.valueOf(baseResponse2.getStatusCode())), new Pair("status_message", String.valueOf(baseResponse2.getStatusMsg())), new Pair("api_url", "/tiktok/v1/screen_time/action/"), new Pair("enter_from", screenTimeActionRequest.actionId), new Pair("duration", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis))));
                }
            });
        }
    }
}
