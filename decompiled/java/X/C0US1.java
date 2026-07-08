package X;

import Y.AcS495S0100000_12;
import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.preview.onetap.OneTapGoLiveManager;
import com.bytedance.android.livesdk.livesetting.linkmic.GroupChatGoLiveAgeVerifySafeSwitch;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0US1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0US1 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ OneTapGoLiveManager LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0US1(OneTapGoLiveManager oneTapGoLiveManager, boolean z, boolean z2) {
        super(0);
        this.LL = oneTapGoLiveManager;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context;
        if (GroupChatGoLiveAgeVerifySafeSwitch.INSTANCE.enable() && this.LL.LJJIIJZLJL("guide_create_info", null, false)) {
            this.LL.LJJII(0, "create_info_age_verify_block");
            DataChannelGlobal.LLILZ.IQ2(C930910aKf.class);
            this.LL.LJIIIZ();
        } else if (this.LLILLJJLI && this.LLILLL) {
            OneTapGoLiveManager oneTapGoLiveManager = this.LL;
            if (!oneTapGoLiveManager.LLJJLIIIJLLLLLLLZ) {
                oneTapGoLiveManager.LJJIII();
            } else if (oneTapGoLiveManager.LLJL) {
                oneTapGoLiveManager.LJIIIZ();
                C20441214yg.LIZIZ("OneTapGoLiveManager", "show go live alert");
                WeakReference<Context> weakReference = oneTapGoLiveManager.LLJLILLLLZIIL;
                if (weakReference != null && (context = weakReference.get()) != null) {
                    C782110Um9 c782110Um9 = new C782110Um9(context);
                    c782110Um9.LIZJ = C497740JfY.LJIJI(2131853934);
                    c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131853932));
                    c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131853933), new AcS495S0100000_12(oneTapGoLiveManager, 54));
                    c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131853931), new InterfaceC743640TFa() { // from class: X.0USO
                        @Override // X.InterfaceC743640TFa
                        public final void LIZ(LiveDialog liveDialog) {
                            liveDialog.dismiss();
                        }
                    });
                    c782110Um9.LJIILL = false;
                    C786410Ut5.E4(c782110Um9.LIZ());
                }
            } else {
                C20441214yg.LIZIZ("OneTapGoLiveManager", "closeRoomAsAudienceAndStartLive");
                C781270Ukn.LJIIJ().finishLivePlayActivityAndGoLiveActivity();
                oneTapGoLiveManager.LJJIII();
            }
        } else {
            OneTapGoLiveManager oneTapGoLiveManager2 = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parse_create_info_error_");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append('_');
            sbLIZ.append(this.LLILLL);
            oneTapGoLiveManager2.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            C20441214yg.LJ("OneTapGoLiveManager", "oneTapGoLive failed,roomCreateInfoSucc && notNeedApplyOrApplySuccis false");
        }
        return Unit.LIZ;
    }
}
