package X;

import Y.AfS186S0100000_17;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.linkmic.LiveLinkMicGiftFlyChannel;
import com.bytedance.android.live.linkmic.LivePublicScreenClipChannel;
import com.bytedance.android.live.linkmic.SmallFlyMicGiftAnimationStartEvent;
import com.bytedance.android.live.linkmic.StopFlyMicGiftAnimationEvent;
import com.bytedance.android.livesdk.dataChannel.ScreenClearEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0eM7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1085570eM7 {
    public final C1085620eMC LIZ = new C1085620eMC();
    public final C1085590eM9 LIZIZ;

    public final void LIZIZ() {
        C1085620eMC c1085620eMC = this.LIZ;
        c1085620eMC.getClass();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.zQ2(c1085620eMC);
        View view = c1085620eMC.LJ;
        if (view != null) {
            view.removeOnLayoutChangeListener(c1085620eMC.LJIIIIZZ);
        }
        InterfaceC420801kM interfaceC420801kM = c1085620eMC.LIZJ;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        C1085590eM9 c1085590eM9 = this.LIZIZ;
        c1085590eM9.getClass();
        dataChannelGlobal.zQ2(c1085590eM9);
        C1091860eWG.LIZ.clear();
        c1085590eM9.LJ.LJ();
        if (!((ArrayList) c1085590eM9.LIZLLL).isEmpty()) {
            for (AnimatorSet animatorSet : (ArrayList) c1085590eM9.LIZLLL) {
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
            }
        }
        c1085590eM9.LJII = null;
        c1085590eM9.LJI = false;
        c1085590eM9.LJFF = null;
    }

    public C1085570eM7(DataChannel dataChannel) {
        this.LIZIZ = new C1085590eM9(dataChannel);
    }

    public final void LIZ(View view, LifecycleOwner lifecycleOwner) {
        View viewFindViewById;
        C1085620eMC c1085620eMC = this.LIZ;
        c1085620eMC.LIZLLL = view;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.sfo);
        } else {
            viewFindViewById = null;
        }
        c1085620eMC.LJ = viewFindViewById;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.DQ2(LivePublicScreenClipChannel.class, c1085620eMC, new C1085610eMB(c1085620eMC));
        if (lifecycleOwner != null) {
            c1085620eMC.LIZJ = C784440Upu.LIZ().LIZJ(lifecycleOwner, C1085120eLO.class).LIZJ(new AfS186S0100000_17(c1085620eMC, 189));
        }
        View view2 = c1085620eMC.LJ;
        if (view2 != null) {
            view2.addOnLayoutChangeListener(c1085620eMC.LJIIIIZZ);
        }
        C1085590eM9 c1085590eM9 = this.LIZIZ;
        c1085590eM9.getClass();
        c1085590eM9.LIZJ = view.getContext();
        c1085590eM9.LIZIZ = (ViewGroup) view.findViewById(R.id.video_animate_container);
        dataChannelGlobal.CQ2(LiveLinkMicGiftFlyChannel.class, c1085590eM9, new C1085580eM8(c1085590eM9));
        dataChannelGlobal.CQ2(SmallFlyMicGiftAnimationStartEvent.class, c1085590eM9, new C1118790fDh(c1085590eM9));
        dataChannelGlobal.CQ2(ScreenClearEvent.class, c1085590eM9, new C1085040eLG(c1085590eM9));
        dataChannelGlobal.CQ2(StopFlyMicGiftAnimationEvent.class, c1085590eM9, new C1085050eLH(c1085590eM9));
    }
}
