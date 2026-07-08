package X;

import Y.ARunnableS107S0100000_7;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerMediaListSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0IK4, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IK4 extends C0IOH {
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ LiveRoomFragment LLJI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        if (LiveInnerMediaListSetting.INSTANCE.enableTransmitMediaList()) {
            this.LLJI.NS();
        }
        super.notifyDataSetChanged();
        HandlerHook.viewPost(this.LLJI.LLLJIL, new ARunnableS107S0100000_7(this, 88));
        LiveRoomFragment liveRoomFragment = this.LLJI;
        liveRoomFragment.LLJJL.add(Integer.valueOf(liveRoomFragment.LLLLIIL.getCount()));
    }

    @Override // X.C0IOH, androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        if (this.LLJI.LLLFFI && LiveInnerMediaListSetting.INSTANCE.enableTransmitMediaList()) {
            this.LLJI.NS();
        }
        InterfaceC466370IQp interfaceC466370IQp = (InterfaceC466370IQp) super.LJJI(i, viewGroup);
        interfaceC466370IQp.FP(this.LLJI);
        if (interfaceC466370IQp.getFragment() != null) {
            interfaceC466370IQp.Eq().mRoomsData.enterLiveSource = this.LLJ;
            if (LiveRoomFragment.kS(interfaceC466370IQp)) {
                C0IXL c0ixl = (C0IXL) DataChannelGlobal.LLILZ.gg0(C1148430fzV.class);
                if (c0ixl != null && interfaceC466370IQp.Eq() != null && interfaceC466370IQp.Eq().mRoomsData != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("1953 contextLog.setEnterMethod=");
                    sbLIZ.append(interfaceC466370IQp.Eq().mRoomsData.enterMethod);
                    C20441214yg.LIZIZ("LiveRoomFragment", C2188811AlT.LIZIZ(sbLIZ));
                    c0ixl.LIZIZ = interfaceC466370IQp.Eq().mRoomsData.enterFromMerge;
                    c0ixl.LIZ = interfaceC466370IQp.Eq().mRoomsData.enterMethod;
                }
            } else {
                interfaceC466370IQp.Eq().mRoomsData.enterFromMerge = this.LLJI.LLJJ;
                interfaceC466370IQp.Eq().mRoomsData.enterMethod = this.LLJI.LLJILLL;
            }
            interfaceC466370IQp.Eq().mSearchData.isFromSearch = this.LLJI.hS();
            interfaceC466370IQp.Eq().mRoomsData.isMixLive = this.LLJI.iS();
            if (this.LLJI.LLLLIIIILLL instanceof C0ISJ) {
                interfaceC466370IQp.Eq().mRoomsData.sceneId = "1005";
            }
        }
        return interfaceC466370IQp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IK4(LiveRoomFragment liveRoomFragment, FragmentManager fragmentManager, C0IOL c0iol, String str) {
        super(fragmentManager, c0iol);
        this.LLJI = liveRoomFragment;
        this.LLJ = str;
    }
}
