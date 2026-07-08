package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.liveroom.RoomListener;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0IJm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464520IJm implements InterfaceC463580IFw {
    public final /* synthetic */ RoomListener LIZ;

    public final boolean LIZIZ() {
        return this.LIZ.previewEnter;
    }

    public C464520IJm(RoomListener roomListener) {
        this.LIZ = roomListener;
    }

    public final void LIZ(final C0IIQ c0iiq) {
        final AbstractC1387200mCc abstractC1387200mCcLJJIIJZLJL;
        ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).Iy(null);
        C01GW<C463900IHc> c01gw = C463900IHc.LJIIJJI;
        C0IFB.LIZ().LIZIZ();
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        if (linkCrossRoomDataHolder != null) {
            linkCrossRoomDataHolder.LIZJ("LivePlayActivity_Destory");
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder2 = LinkCrossRoomDataHolder.LJLLI;
        if (linkCrossRoomDataHolder2 != null) {
            linkCrossRoomDataHolder2.LIZIZ = null;
        }
        LinkCrossRoomDataHolder.LJLLI = null;
        if (LinkCrossRoomDataHolder.LJLLLL) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LJIIIIZZ("LivePlayActivity_Destory");
        }
        this.LIZ.sendIncentiveLog();
        this.LIZ.trySendRoomLists(c0iiq.reason);
        LiveRoomFragment liveRoomFragment = this.LIZ.fragment;
        if (liveRoomFragment != null && (abstractC1387200mCcLJJIIJZLJL = C520010KaN.LJJIIJZLJL(liveRoomFragment)) != null) {
            C0IIS.LIZIZ("exit_room_container");
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            dataChannelGlobal.JQ2(C930810aKV.class, Boolean.FALSE);
            final C0IKY c0iky = (C0IKY) dataChannelGlobal.gg0(C931310aLJ.class);
            if (c0iky != null) {
                C0IXL c0ixl = (C0IXL) dataChannelGlobal.gg0(C1148430fzV.class);
                if (c0ixl != null) {
                    c0iky.LIZLLL.put("from_drawer_tab", c0ixl.LJJIIZ);
                }
                ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).showAcePhoneBindDialog(this.LIZ.fragment.getActivity(), c0iky, new C10JP() { // from class: X.0IJq
                    @Override // X.C10JP
                    public final void LIZIZ() {
                        this.LIZLLL.LIZ.finishActivity(abstractC1387200mCcLJJIIJZLJL, c0iiq);
                    }

                    @Override // X.C10JP
                    public final void onDismiss() {
                        this.LIZLLL.LIZ.finishActivity(abstractC1387200mCcLJJIIJZLJL, c0iiq);
                    }

                    @Override // X.C10JP
                    public final void onShow() {
                        C464570IJr.LIZ(c0iky, C0IK0.WatchLiveEnd.enterMethod);
                        C464570IJr.LIZJ(c0iky);
                    }

                    @Override // X.C10JP
                    public final void LIZ(String str) {
                        c0iky.LIZLLL.put("click_status", str);
                        C464570IJr.LIZIZ(c0iky);
                    }
                });
            } else {
                this.LIZ.finishActivity(abstractC1387200mCcLJJIIJZLJL, c0iiq);
            }
        }
        C463160IEg.LIZ(c0iiq);
    }
}
