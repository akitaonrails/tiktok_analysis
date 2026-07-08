package X;

import Y.ARunnableS40S0300000_7;
import Y.ARunnableS76S0200000_7;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewAudienceEndFragmentV2;
import com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0IL9, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IL9 implements InterfaceC1364105Vn<LiveEventModule> {
    public final /* synthetic */ LiveNewAudienceEndFragmentV2 LL;

    @Override // X.InterfaceC1364105Vn
    public final CoroutineContext getContext() {
        return C0PEM.LIZJ;
    }

    public C0IL9(LiveNewAudienceEndFragmentV2 liveNewAudienceEndFragmentV2) {
        this.LL = liveNewAudienceEndFragmentV2;
    }

    @Override // X.InterfaceC1364105Vn
    public final void resumeWith(Object obj) {
        C0ILD c0ild;
        LiveNewAudienceEndFragmentV2 liveNewAudienceEndFragmentV2 = this.LL;
        boolean zO = liveNewAudienceEndFragmentV2.VR().O();
        boolean zPc1 = ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).pc1();
        boolean z = obj instanceof LiveEventModule;
        if (z) {
            c0ild = new C0ILD(Boolean.TRUE, Boolean.FALSE, Boolean.valueOf(zO));
        } else if (liveNewAudienceEndFragmentV2.LLJJJJJIL >= 0 && zPc1) {
            c0ild = new C0ILD(Boolean.FALSE, Boolean.TRUE, Boolean.valueOf(zO));
        } else {
            Boolean bool = Boolean.FALSE;
            c0ild = new C0ILD(bool, bool, Boolean.valueOf(zO));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0ild.LIZ);
        sbLIZ.append(",");
        sbLIZ.append(c0ild.LIZIZ);
        sbLIZ.append(",");
        sbLIZ.append(c0ild.LIZJ);
        C20441214yg.LIZIZ("LiveNewAudienceEndFragmentV2", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            LiveEventModule liveEventModule = (LiveEventModule) obj;
            this.LL.LLJJLIIIJLLLLLLLZ.LJ(String.valueOf(UserService.getInstance().user().getCurrentUserId()), String.valueOf(this.LL.LLILZIL.getOwner().getId()), false, liveEventModule, this.LL);
            C786410Ut5.LJJZZIII(this.LL.LLILZ, new ARunnableS40S0300000_7(liveEventModule, c0ild, this, 3));
            return;
        }
        C786410Ut5.LJJZZIII(this.LL.LLILZ, new ARunnableS76S0200000_7(c0ild, this, 8));
    }
}
