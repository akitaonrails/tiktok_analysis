package com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar;

import X.C09AJ;
import X.C11NJ;
import X.C1555540qa8;
import X.C1558360qeg;
import X.C19EG;
import X.C19FH;
import X.C20441214yg;
import X.C2188811AlT;
import X.C473410IhP;
import X.C916490ZxP;
import X.C923330a8R;
import X.C935950aSn;
import X.C936280aTK;
import X.C946803n0;
import X.InterfaceC1097170eep;
import X.InterfaceC665370Q7z;
import X.InterfaceC934710aQn;
import Y.ARunnableS115S0100000_15;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AvatarOpenCameraEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAvatarLeaveRoomActionEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAvatarReportEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestCreateAvatarEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.AvatarBusinessAbilityImpl;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class AvatarGuestWidget extends LiveWidget {
    public final Activity LL;
    public C936280aTK LLILLJJLI;
    public AvatarBusinessAbilityImpl LLILLL;
    public final C11NJ LLILZ = new C11NJ();
    public ARunnableS115S0100000_15 LLILZIL;

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C20441214yg.LJIIIZ("AvatarGuestWidget", "onDestroy");
        this.dataChannel.FQ2(MultiGuestAvatarLeaveRoomActionEvent.class);
        C936280aTK c936280aTK = this.LLILLJJLI;
        if (c936280aTK != null) {
            C19FH c19fh = c936280aTK.LIZ;
            if (c19fh != null) {
                c19fh.LIZIZ();
            }
            c936280aTK.LIZ = null;
        }
        AvatarBusinessAbilityImpl avatarBusinessAbilityImpl = this.LLILLL;
        if (avatarBusinessAbilityImpl != null) {
            C09AJ<C935950aSn> c09aj = avatarBusinessAbilityImpl.LLIZLLLIL;
            if (c09aj != null) {
                c09aj.onComplete();
            }
            avatarBusinessAbilityImpl.LLIZLLLIL = null;
        }
        this.LLILZ.dispose();
        ARunnableS115S0100000_15 aRunnableS115S0100000_15 = this.LLILZIL;
        if (aRunnableS115S0100000_15 != null) {
            C473410IhP.LJ(aRunnableS115S0100000_15);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Fragment fragmentLIZ;
        MultiGuestDataHolder multiGuestDataHolderLIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate isFragmentActivity:");
        sbLIZ.append(this.LL instanceof C19EG);
        C20441214yg.LJIIIZ("AvatarGuestWidget", C2188811AlT.LIZIZ(sbLIZ));
        Activity activity = this.LL;
        if (activity instanceof C19EG) {
            InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
            if ((interfaceC1097170eep != null && (fragmentLIZ = interfaceC1097170eep.getFragment()) != null) || (fragmentLIZ = C946803n0.LIZ(getView())) != null) {
                InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLIZ, "linkMicScope");
                AvatarBusinessAbilityImpl avatarBusinessAbilityImpl = new AvatarBusinessAbilityImpl(this);
                this.LLILLL = avatarBusinessAbilityImpl;
                C1555540qa8.LIZ(interfaceC665370Q7zLJFF, avatarBusinessAbilityImpl, IAvatarBusinessAbility.class, null);
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.BQ2(this, AvatarOpenCameraEvent.class, new AwS397S0200000_31(this, activity, 15));
                dataChannel.BQ2(this, MultiGuestCreateAvatarEvent.class, new AwS594S0100000_15(this, 376));
                dataChannel.BQ2(this, MultiGuestAvatarReportEvent.class, new AwS594S0100000_15(this, 377));
            }
            C923330a8R c923330a8R = C923330a8R.LIZ;
            if (C923330a8R.LJFF() || (multiGuestDataHolderLIZJ = C916490ZxP.LIZJ()) == null || multiGuestDataHolderLIZJ.LJJJLL != 2 || InterfaceC934710aQn.jc.LIZIZ().booleanValue()) {
                return;
            }
            ARunnableS115S0100000_15 aRunnableS115S0100000_15 = new ARunnableS115S0100000_15(this, 51);
            this.LLILZIL = aRunnableS115S0100000_15;
            C473410IhP.LIZJ(aRunnableS115S0100000_15, 3000L);
        }
    }

    public AvatarGuestWidget(Activity activity) {
        this.LL = activity;
    }
}
