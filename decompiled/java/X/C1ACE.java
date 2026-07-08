package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.base.xelements.LynxUILive;
import com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.Map;

/* JADX INFO: renamed from: X.1ACE, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ACE implements InterfaceC21396518oN {
    public boolean LIZ;
    public boolean LIZIZ;
    public C1ADA LIZJ;
    public LynxUILive LIZLLL;
    public int LJI;
    public String LJII;
    public boolean LJIIIIZZ;
    public final LiveRoomStruct LJ = new LiveRoomStruct();
    public boolean LJFF = true;
    public final C1ACD LJIIIZ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).K4(new InterfaceC2175541ACi() { // from class: X.1ACm
        @Override // X.InterfaceC2175541ACi
        public final Integer Dk() {
            return null;
        }

        @Override // X.InterfaceC2175541ACi
        public final boolean LLILLIZIL() {
            return true;
        }

        @Override // X.InterfaceC2175541ACi
        public final void LLLIL() {
        }

        @Override // X.InterfaceC2175541ACi
        public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
        }

        @Override // X.InterfaceC2175541ACi
        public final void LLLLLLIL() {
        }

        @Override // X.InterfaceC2175541ACi
        public final Object Md() {
            return null;
        }

        @Override // X.InterfaceC2175541ACi
        public final void Th(int i, int i2, View view) {
        }

        @Override // X.InterfaceC2175541ACi
        public final boolean U1() {
            return false;
        }

        @Override // X.InterfaceC2175541ACi
        public final boolean We() {
            return true;
        }

        @Override // X.InterfaceC2175541ACi
        public final Object Y7() {
            return null;
        }

        @Override // X.InterfaceC2175541ACi
        public final void o() {
        }

        @Override // X.InterfaceC2175541ACi
        public final void oe(String str) {
        }

        @Override // X.InterfaceC2175541ACi
        public final void sk(String str) {
        }

        @Override // X.InterfaceC2175541ACi
        public final void T5() {
            C1ACE c1ace = this.LL;
            if (c1ace.LJIIIIZZ) {
                return;
            }
            LynxUILive lynxUILive = c1ace.LIZLLL;
            if (lynxUILive != null) {
                lynxUILive.updatePauseFrame(null);
            }
            C1ACE c1ace2 = this.LL;
            if (c1ace2.LIZ) {
                return;
            }
            c1ace2.LIZ = true;
            C1ADA c1ada = c1ace2.LIZJ;
            if (c1ada != null) {
                c1ada.onPlay();
            }
        }

        @Override // X.InterfaceC2175541ACi
        public final void v() {
            C1ACE c1ace = this.LL;
            if (c1ace.LJIIIIZZ || c1ace.LIZIZ) {
                return;
            }
            c1ace.LIZIZ = true;
            C1ADA c1ada = c1ace.LIZJ;
            if (c1ada != null) {
                c1ada.LJII();
            }
        }

        @Override // X.InterfaceC2175541ACi
        /* JADX INFO: renamed from: if */
        public final void mo29if(String str) {
            C1ADA c1ada;
            C1ACE c1ace = this.LL;
            c1ace.LIZ = false;
            c1ace.LIZIZ = false;
            if (!c1ace.LJIIIIZZ && (c1ada = c1ace.LIZJ) != null) {
                c1ada.onEnd();
            }
        }

        @Override // X.InterfaceC2175541ACi
        public final void oc(C945320ahu c945320ahu) {
            String str;
            C1ADA c1ada;
            C1ACE c1ace = this.LL;
            if (!c1ace.LJIIIIZZ && c945320ahu != null && (str = c945320ahu.LIZIZ) != null && (c1ada = c1ace.LIZJ) != null) {
                c1ada.W1(str);
            }
        }

        @Override // X.InterfaceC2175541ACi
        public final void w9(String str) {
            C1ADA c1ada;
            C1ACE c1ace = this.LL;
            c1ace.LIZ = false;
            c1ace.LIZIZ = false;
            if (!c1ace.LJIIIIZZ && (c1ada = c1ace.LIZJ) != null) {
                c1ada.onError(str);
            }
        }
    });

    @Override // X.InterfaceC21396518oN
    public final void LIZIZ() {
        this.LJIIIIZZ = false;
        LJIILJJIL(this.LJFF);
        setScaleType(this.LJI);
        String str = this.LJII;
        if (str != null) {
            LIZJ(str);
        }
    }

    @Override // X.InterfaceC21396518oN
    public final View LIZLLL() {
        C2175491ACd c2175491ACdLJJJJLI = this.LJIIIZ.LJJJJLI();
        Object objLIZIZ = c2175491ACdLJJJJLI != null ? c2175491ACdLJJJJLI.LIZIZ() : null;
        if (objLIZIZ instanceof View) {
            return (View) objLIZIZ;
        }
        return null;
    }

    @Override // X.InterfaceC21396518oN
    public final void destroy() {
        if (this.LJIIIIZZ) {
            return;
        }
        this.LJIIIZ.LJJIJIL("x-live-ng", true);
    }

    @Override // X.InterfaceC21396518oN
    public final String pause() {
        LynxUILive lynxUILive;
        if (this.LJIIIIZZ) {
            return "The live player is shared to the live room, do not execute it.";
        }
        this.LIZ = false;
        this.LIZIZ = false;
        Bitmap bitmapLJIJI = this.LJIIIZ.LJIJI(false);
        if (bitmapLJIJI != null && (lynxUILive = this.LIZLLL) != null) {
            lynxUILive.updatePauseFrame(bitmapLJIJI);
        }
        this.LJIIIZ.LJJJJIZL();
        C1ADA c1ada = this.LIZJ;
        if (c1ada == null) {
            return null;
        }
        c1ada.onPause();
        return null;
    }

    @Override // X.InterfaceC21396518oN
    public final String play() {
        if (this.LJIIIIZZ) {
            return "The live player is shared to the live room, do not execute it.";
        }
        LynxUILive lynxUILive = this.LIZLLL;
        if (lynxUILive == null) {
            return "Internal error.";
        }
        this.LJIIIZ.LJJIIJZLJL(this.LJFF, this.LJ, (FrameLayout) lynxUILive.mView, true, "x-live-ng", null, false, null);
        return null;
    }

    @Override // X.InterfaceC21396518oN
    public final String stop() {
        LynxUILive lynxUILive;
        if (this.LJIIIIZZ) {
            return "The live player is shared to the live room, do not execute it.";
        }
        this.LIZ = false;
        this.LIZIZ = false;
        Bitmap bitmapLJIJI = this.LJIIIZ.LJIJI(false);
        if (bitmapLJIJI != null && (lynxUILive = this.LIZLLL) != null) {
            lynxUILive.updatePauseFrame(bitmapLJIJI);
        }
        this.LJIIIZ.LIZIZ();
        C1ADA c1ada = this.LIZJ;
        if (c1ada == null) {
            return null;
        }
        c1ada.onStop();
        return null;
    }

    @Override // X.InterfaceC21396518oN
    public final void LIZ(LynxUILive lynxUILive) {
        this.LIZLLL = lynxUILive;
        this.LJIIIZ.LJJIJIIJI(this.LJ);
    }

    @Override // X.InterfaceC21396518oN
    public final void LIZJ(String str) {
        this.LJII = str;
        this.LJIIIZ.switchResolution(str, null);
    }

    @Override // X.InterfaceC21396518oN
    public final String LJ(Map<String, ? extends Object> map) {
        Object obj;
        Long lLIZ;
        LynxUILive lynxUILive;
        if (this.LJIIIIZZ) {
            return "The live player is shared to the live room, do not execute it.";
        }
        LynxUILive lynxUILive2 = this.LIZLLL;
        if (lynxUILive2 == null) {
            return "Internal error.";
        }
        if (map != null) {
            obj = map.get("room_id");
        } else {
            obj = null;
        }
        if ((obj instanceof String) && obj != null && (lLIZ = C601990NjJ.LIZ(obj)) != null) {
            long jLongValue = lLIZ.longValue();
            String playerTag = this.LJIIIZ.getPlayerTag();
            String multiStreamData = this.LJ.getMultiStreamData();
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.roomIds = new long[]{jLongValue};
            roomsData.roomId = jLongValue;
            roomsData.enterMethod = "general_search";
            roomsData.sharedEnterFrom = "general_search.mRoomsData.";
            roomsData.enterFromMerge = "general_search";
            enterRoomConfig.mStreamData.sharePullStreamData = multiStreamData;
            roomsData.warmUpPlayerTag = playerTag;
            this.LJIIIIZZ = true;
            this.LJIIIZ.LJJIJLIJ();
            Bitmap bitmapLJIJI = this.LJIIIZ.LJIJI(false);
            if (bitmapLJIJI != null && (lynxUILive = this.LIZLLL) != null) {
                lynxUILive.updatePauseFrame(bitmapLJIJI);
            }
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().watchLive(lynxUILive2.mContext, enterRoomConfig);
            return null;
        }
        return "The room_id param is invalid.";
    }

    @Override // X.InterfaceC21396518oN
    public final void LJFF(C21396618oO c21396618oO) {
        this.LIZJ = c21396618oO;
    }

    @Override // X.InterfaceC21396518oN
    public final void LJI(String str) {
        this.LJ.stream_url = new StreamUrlStruct();
        this.LJ.stream_url.liveCoreSDKData = new LiveCoreSDKData();
        LiveCoreSDKData.PullData pullData = new LiveCoreSDKData.PullData();
        pullData.setStreamData(str);
        this.LJ.stream_url.liveCoreSDKData.setPullData(pullData);
    }

    @Override // X.InterfaceC21396518oN
    public final void LJIILJJIL(boolean z) {
        this.LJFF = z;
        this.LJIIIZ.LJIILJJIL(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000a  */
    @Override // X.InterfaceC21396518oN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setScaleType(int r3) {
        /*
            r2 = this;
            r2.LJI = r3
            if (r3 == 0) goto La
            r1 = 1
            if (r3 == r1) goto Lb
            r1 = 2
            if (r3 == r1) goto Lb
        La:
            r1 = 0
        Lb:
            X.1ACD r0 = r2.LJIIIZ
            X.1ACd r0 = r0.LJJJJLI()
            if (r0 == 0) goto L16
            X.C2175491ACd.LJ(r0, r1)
        L16:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ACE.setScaleType(int):void");
    }
}
