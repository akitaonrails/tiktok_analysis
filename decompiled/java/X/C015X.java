package X;

import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.015X, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C015X {
    public static LiveMode LIZ = LiveMode.VIDEO;
    public static final C01GW<IGamePartnershipService> LIZIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(62));
    public static final C015W LIZJ = new InterfaceC1141530foN() { // from class: X.015W
        @Override // X.InterfaceC1141530foN
        public final void mh2(C262100zr c262100zr) {
            if (Intrinsics.LJFF(c262100zr.LIZ, "shouldUpdateGamePartnershipBCToggle")) {
                C20441214yg.LIZIZ("GamePartnershipBeforeLiveUtil", "onReceiveJsEvent  shouldUpdateGamePartnershipBCToggle");
                C197400pQ c197400pQFy0 = C015V.LIZJ().fy0();
                if (c197400pQFy0 != null) {
                    c197400pQFy0.LIZIZ(C015X.LIZ, "js_event");
                }
            }
        }
    };
}
