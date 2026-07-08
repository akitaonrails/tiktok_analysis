package X;

import android.view.SurfaceView;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bI5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967750bI5 extends C09AY implements Function0<C965470bEP> {
    public final /* synthetic */ C2181461AZc LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967750bI5(C2181461AZc c2181461AZc) {
        super(0);
        this.LL = c2181461AZc;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0bEP] */
    @Override // kotlin.jvm.functions.Function0
    public final C965470bEP invoke() {
        final C2181461AZc c2181461AZc = this.LL;
        return new InterfaceC964830bDN() { // from class: X.0bEP
            @Override // X.InterfaceC964830bDN
            public final void LIZLLL(String str, LinkLayerRTCMessage linkLayerRTCMessage) {
            }

            @Override // X.InterfaceC964830bDN
            public final void LJFF(long j, String str, Long l) {
            }

            @Override // X.InterfaceC964830bDN
            public final void onUserJoined(String str) {
            }

            @Override // X.InterfaceC964830bDN
            public final void LIZJ() {
                C2181391AYv c2181391AYv = c2181461AZc.LLILLJJLI;
                if (c2181391AYv != null) {
                    c2181391AYv.LLJILJIL.LJI("business", true);
                }
            }

            @Override // X.InterfaceC964830bDN
            public final void LIZIZ(String str, SurfaceView surfaceView) {
                C2181461AZc c2181461AZc2 = c2181461AZc;
                if (!c2181461AZc2.LLIILII()) {
                    ((ArrayList) c2181461AZc2.LLL).add(new RunnableC965960bFC(c2181461AZc2, str, surfaceView));
                    return;
                }
                c2181461AZc2.LLJJLIIIJLLLLLLLZ(str, surfaceView);
            }

            @Override // X.InterfaceC964830bDN
            public final void LJ(C945320ahu c945320ahu, InterfaceC940430aa1 interfaceC940430aa1, boolean z) {
                c2181461AZc.LLJJJIL(c945320ahu, interfaceC940430aa1, false, 1);
            }

            @Override // X.InterfaceC964830bDN
            public final void LIZ(EnumC964810bDL enumC964810bDL, String str, SurfaceView surfaceView, InterfaceC1268870j7l interfaceC1268870j7l) {
                if (c2181461AZc.LJJJI()) {
                    if (enumC964810bDL == EnumC964810bDL.FIRST_REMOTE_VIDEO_FRAME) {
                        c2181461AZc.LLJZIJLIL(str, surfaceView);
                    }
                } else {
                    if (surfaceView == null) {
                        return;
                    }
                    c2181461AZc.LLJZIJLIL(str, surfaceView);
                }
            }
        };
    }
}
