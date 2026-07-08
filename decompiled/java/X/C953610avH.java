package X;

import Y.ARunnableS84S0200000_15;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.ToolsTypeStateUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.anchor.NoticeBoardEndEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.anchor.NoticeboardBizLayoutChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.anchor.NoticeboardCreateAndUpdateChannel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AsyncAuxStreamCreateCallback;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AsyncAuxStreamCreateTask;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.GroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InteractAudioVolumeInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRoomDirectMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ListChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS99S1200000_15;
import tikcast.linkmic.controller.ResumeResp;
import webcast.data.multi_guest_play.NoticeboardContent;
import webcast.data.multi_guest_play.NoticeboardReviewInfo;
import webcast.data.multi_guest_social_data.Avatar;
import webcast.data.multilive_biz.BizResumeResponse;
import webcast.im.NoticeboardMessage;

/* JADX INFO: renamed from: X.0avH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953610avH extends AbstractC945630aiP {
    public static final C953670avN LJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJJIFFI;
    public static String LJJII;
    public static final C11PQ<String> LJJIII;
    public static Long LJJIIJ;
    public static String LJJIIJZLJL;
    public static final C11PQ<String> LJJIIZ;
    public static float LJJIIZI;
    public final LifecycleOwner LIZIZ;
    public final Context LIZJ;
    public final C11NJ LIZLLL;
    public final HashMap<String, C953660avM> LJ;
    public final ConcurrentHashMap<Long, EnumC953640avK> LJFF;
    public final C953650avL LJI;
    public SurfaceView LJII;
    public String LJIIIIZZ;
    public long LJIIIZ;
    public volatile C11JF LJIIJ;
    public volatile boolean LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public String LJIILL;
    public boolean LJIILLIIL;
    public final C304201Fw LJIIZILJ;
    public final C922110a6T LJIJ;
    public C953600avG LJIJI;
    public C953600avG LJIJJ;
    public final C462201r2 LJIJJLI;
    public final C987070bnF LJIL;
    public final List<Runnable> LJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C953610avH.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/common/IZoomInterface;", 0);
        C13LE.LIZ.getClass();
        LJJIFFI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LJJI = new C953670avN();
        C11PQ<String> c11pq = new C11PQ<>();
        c11pq.onNext("");
        LJJIII = c11pq;
        C11PQ<String> c11pq2 = new C11PQ<>();
        c11pq2.onNext("");
        LJJIIZ = c11pq2;
        LJJIIZI = 1.0f;
    }

    @Override // X.InterfaceC945610aiN
    public final void LIZ() {
        C500260Jjc.LJJLIIIJILLIZJL(new AwS559S0100000_15(this, 1038));
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01Y0(null), 3);
    }

    @Override // X.InterfaceC945610aiN
    public final void LJI() {
        C500260Jjc.LJJLIIIJILLIZJL(new AwS559S0100000_15(this, 1039));
    }

    @Override // X.AbstractC945630aiP, X.InterfaceC945610aiN
    public final boolean LJII() {
        return ((Boolean) this.LJIILIIL.getValue()).booleanValue();
    }

    public final void LJIIIZ() {
        if (this.LJIIJ != null) {
            C11JF c11jf = this.LJIIJ;
            if (C500260Jjc.LJJIFFI(c11jf != null ? Boolean.valueOf(c11jf.isDisposed()) : null)) {
                C11JF c11jf2 = this.LJIIJ;
                if (c11jf2 != null) {
                    c11jf2.dispose();
                }
                this.LJIIJ = null;
            }
        }
    }

    public final boolean LJIILL() {
        return ((Boolean) this.LJIIL.getValue()).booleanValue();
    }

    public final void LJIIZILJ() {
        C20441214yg.LJIIIZ("NoticeboardController", "prepareSurfaceView");
        if (this.LJII == null) {
            C20441214yg.LJIIIZ("NoticeboardController", "surfaceView is null create new one");
            SurfaceView surfaceView = new SurfaceView(this.LIZJ);
            this.LJII = surfaceView;
            String str = this.LJIILL;
            if (str != null) {
                C20441214yg.LJIIIZ("NoticeboardController", "prepareSurfaceView currentStreamId get success and setAuxStreamView");
                InterfaceC954180awC interfaceC954180awCUU1 = C915980Zwa.LJIIIIZZ().UU1();
                if (interfaceC954180awCUU1 != null) {
                    interfaceC954180awCUU1.LJJIJIL(str, surfaceView);
                }
            }
        }
    }

    @Override // X.AbstractC945630aiP, X.InterfaceC945610aiN
    public final boolean LJIIIIZZ() {
        return LJIILL();
    }

    @Override // X.AbstractC945630aiP, X.InterfaceC945610aiN
    public final C953600avG LIZJ() {
        return this.LJIJI;
    }

    @Override // X.AbstractC945630aiP, X.InterfaceC945610aiN
    public final void LIZIZ(int i) {
        C500260Jjc.LJJLIIIJILLIZJL(new C020L(this, i, 7));
    }

    @Override // X.AbstractC945630aiP, X.InterfaceC945610aiN
    public final void LIZLLL(CreateChannelResult createChannelResult) {
        ResumeResp resumeResp;
        BizResumeResponse bizResumeResponse;
        BizResumeResponse.ResponseData responseData;
        C20441214yg.LJIIIZ("NoticeboardController", "onCreateChannelSuccess");
        this.LJIIJJI = true;
        if (createChannelResult.isResume && (resumeResp = createChannelResult.resumeResp) != null && (bizResumeResponse = resumeResp.multiGuestRespExtra) != null && (responseData = bizResumeResponse.data) != null && responseData.noticeboardContents != null) {
            C20441214yg.LJIIIZ("NoticeboardController", "Found canvas need to resume");
            InterfaceC954180awC interfaceC954180awCUU1 = C915980Zwa.LJIIIIZZ().UU1();
            if (interfaceC954180awCUU1 != null && interfaceC954180awCUU1.LJLLILLLL()) {
                C500260Jjc.LJJLIIIJILLIZJL(new AwS416S0200000_15(this, createChannelResult, 96));
            } else {
                ((ArrayList) this.LJJ).add(new ARunnableS84S0200000_15(this, createChannelResult, 75));
            }
        }
        C915980Zwa.LJIIIIZZ().Fe(this.LJIJ);
    }

    @Override // X.AbstractC945630aiP, X.InterfaceC945610aiN
    public final void LJ(C953600avG c953600avG) {
        C500260Jjc.LJJLIIIJILLIZJL(new AwS416S0200000_15(c953600avG, this, 98));
    }

    @Override // X.AbstractC945630aiP, X.InterfaceC945610aiN
    public final void LJFF(Function1<? super Boolean, Unit> function1) {
        C500260Jjc.LJJLIIIJILLIZJL(new C020Y(this, (C953610avH) function1, (Function1<? super Boolean, Unit>) 39));
    }

    public final void LJIIJ(EnumC487701v9 enumC487701v9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearTask, source=");
        sbLIZ.append(enumC487701v9);
        C20441214yg.LIZIZ("NoticeboardController", C2188811AlT.LIZIZ(sbLIZ));
        ((ArrayList) this.LJJ).clear();
        LJIIIZ();
        LJIJI(enumC487701v9);
        this.LIZLLL.LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {, blocks: (B:9:0x003b, B:11:0x003f, B:12:0x0045, B:14:0x0049, B:15:0x004f, B:17:0x0055, B:19:0x0060, B:22:0x007a), top: B:85:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap LJIILIIL(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C953610avH.LJIILIIL(java.lang.String):android.graphics.Bitmap");
    }

    public final EnumC953640avK LJIILJJIL(Long l) {
        if (l != null || (l = LJJIIJ) != null) {
            EnumC953640avK enumC953640avK = this.LJFF.get(Long.valueOf(l.longValue()));
            if (enumC953640avK != null) {
                return enumC953640avK;
            }
        }
        return EnumC953640avK.UNKNOWN;
    }

    public final void LJIJ(boolean z) {
        this.LJIILLIIL = z;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && C758560TpG.LIZ()) {
            dataChannel.LC0(ToolsTypeStateUpdateEvent.class, new C935490aS3(EnumC936960aUQ.NOTICE_BOARD, z));
        }
    }

    public final void LJIJI(EnumC487701v9 enumC487701v9) {
        C953770avX c953770avXLJIIIZ;
        C20441214yg.LJIIIZ("NoticeboardController", "stopAuxStreamAndClearRecord");
        String str = this.LJIILL;
        if (str != null) {
            if (this.LJIILLIIL) {
                C20441214yg.LJIIIZ("NoticeboardController", "stopAuxStreamAndClearRecord stopAuxStream");
                InterfaceC954180awC interfaceC954180awCUU1 = C915980Zwa.LJIIIIZZ().UU1();
                if (interfaceC954180awCUU1 != null) {
                    interfaceC954180awCUU1.stopAuxStream(str);
                }
            }
            C20441214yg.LJIIIZ("NoticeboardController", "stopAuxStreamAndClearRecord destroyAuxStream");
            InterfaceC954180awC interfaceC954180awCUU12 = C915980Zwa.LJIIIIZZ().UU1();
            if (interfaceC954180awCUU12 != null) {
                interfaceC954180awCUU12.LJIILLIIL(str);
            }
        }
        if (LJJIIJ != null && ((c953770avXLJIIIZ = C953760avW.LIZIZ.LIZ().LJIIIZ()) == null || c953770avXLJIIIZ.LJIIIIZZ != 2)) {
            C11S5.LIZ().LIZIZ(new Runnable() { // from class: X.01r8
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("NoticeboardController@d169.stopAuxStreamAndClearRecord$2");
                    try {
                        C953760avW.LIZIZ.LIZ().LIZJ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("NoticeboardController@d169.stopAuxStreamAndClearRecord$2");
                }
            });
        }
        LJJIIJZLJL = null;
        LJJI.getClass();
        C953670avN.LIZ(null);
        this.LJIILL = null;
        LJJIIJZLJL = null;
        LJIJ(false);
        this.LJIJJ = null;
        this.LJIJI = null;
        HashMap<String, C953660avM> map = this.LJ;
        for (Map.Entry<String, C953660avM> entry : map.entrySet()) {
            String key = entry.getKey();
            Iterator<WeakReference<InterfaceC917550Zz7>> it2 = entry.getValue().LJFF.iterator();
            while (it2.hasNext()) {
                InterfaceC917550Zz7 interfaceC917550Zz7 = it2.next().get();
                if (interfaceC917550Zz7 != null) {
                    interfaceC917550Zz7.LJ(new C916750Zxp(2, 0L, key), EnumC953170auZ.NOTICEBOARD_PROCESS_END, null);
                }
            }
        }
        map.clear();
        LJJI.getClass();
        C953670avN.LIZIZ(null);
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.zW(NoticeboardCreateAndUpdateChannel.class, new C462701r7(null));
        }
        this.LJII = null;
        C953620avI.LJIILIIL(0, this.LJIILL);
        C946850akN.LIZ = false;
        this.LJFF.clear();
        C954080aw2 c954080aw2 = C954080aw2.LIZJ;
        DialogC971200bNe dialogC971200bNe = c954080aw2.LIZIZ;
        if (dialogC971200bNe != null) {
            dialogC971200bNe.LJJIII(EnumC919100a1c.NORMAL);
        }
        c954080aw2.LIZIZ = null;
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null) {
            dataChannel2.LC0(NoticeBoardEndEvent.class, enumC487701v9);
        }
        DataChannel dataChannel3 = this.LIZ;
        if (dataChannel3 != null) {
            dataChannel3.zW(NoticeboardBizLayoutChannel.class, new C945620aiO("", 0.0f, 0.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C953610avH.LJIJJ(java.lang.String):void");
    }

    public final void LJIJJLI(C953600avG c953600avG) {
        boolean z;
        WeakReference<InterfaceC917550Zz7> weakReference;
        Long l = LJJIIJ;
        if (l != null) {
            l.longValue();
            C20441214yg.LJIIIZ("NoticeboardController", "updateNoticeboard begin");
            C19489311Mt c19489311Mt = new C19489311Mt();
            HashMap<String, C953660avM> map = this.LJ;
            String str = c953600avG.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            EnumC937290aUx enumC937290aUx = c953600avG.LIZJ;
            EnumC953330aup enumC953330aup = c953600avG.LIZLLL;
            if (c953600avG.LJ.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            map.put(str, new C953660avM(jCurrentTimeMillis, 0, enumC937290aUx, enumC953330aup, z, new ArrayList(), c19489311Mt, c953600avG.LJIIIZ));
            C953660avM c953660avM = this.LJ.get(c953600avG.LIZ);
            if (c953660avM != null && (weakReference = c953600avG.LJFF) != null) {
                c953660avM.LJFF.add(weakReference);
            }
            C953620avI.LJIIL(this.LJ, this.LIZLLL, c953600avG, c19489311Mt);
            C953620avI.LJIIJ(this.LIZ, this.LIZLLL, new C487001v2(this), c953600avG, 1, c953600avG.LIZIZ, new C020X(c953600avG, this, 1));
        }
    }

    public final void LJIIL(C953600avG c953600avG, Bitmap bitmap) {
        RtcUserInfo rtcUserInfoG0;
        String str;
        InterfaceC954180awC interfaceC954180awCUU1 = C915980Zwa.LJIIIIZZ().UU1();
        if (interfaceC954180awCUU1 != null && (rtcUserInfoG0 = interfaceC954180awCUU1.G0()) != null && (str = rtcUserInfoG0.linkMicId) != null) {
            C20441214yg.LJIIIZ("NoticeboardController", "createNoticeboardActually get bitmap success");
            LJIIJJI(null, bitmap, new AwS99S1200000_15(c953600avG, this, str, 8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(webcast.data.multi_guest_play.NoticeboardContent r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C953610avH.LJIILLIIL(webcast.data.multi_guest_play.NoticeboardContent, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.0a6T] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.01r2] */
    public C953610avH(Context context, LifecycleOwner lifecycleOwner, final DataChannel dataChannel) {
        super(dataChannel);
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = context;
        this.LIZLLL = new C11NJ();
        this.LJ = new HashMap<>();
        this.LJFF = new ConcurrentHashMap<>();
        this.LJI = new C953650avL();
        this.LJIIIIZZ = "";
        this.LJIIIZ = -1L;
        this.LJIIJJI = true;
        this.LJIIL = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(400));
        this.LJIILIIL = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(399));
        this.LJIILJJIL = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(398));
        this.LJIIZILJ = new C304201Fw("ZOOM_SERVICE");
        this.LJIJ = new InterfaceC964770bDH() { // from class: X.0a6T
            @Override // X.InterfaceC964770bDH
            public final void LIZ(long j, C1AZU c1azu) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJFF(C954780axA c954780axA) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJII(long j, C1AZU c1azu, C969700bLE c969700bLE) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJIIJ(String str, C1AZU c1azu, C2231141CUe c2231141CUe) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJIIJJI(String str, SurfaceView surfaceView) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJIIZILJ(String str, SurfaceView surfaceView) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJIJJLI(String str, boolean z) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LJJ(Map<String, String> map) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJI(long j, C1AZU c1azu) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIFFI(int i, int i2, int i3) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LJJIIJ(List<LinkUser> list, List<LinkUser> list2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIIZI(String str, String str2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIJIIJIL(String str, boolean z) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIL(String str, boolean z) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIZ(String str, long j) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJ() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJ() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJJ(String str, float f, float f2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJJL(int i, C965030bDh c965030bDh) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LJJJJZ(List<LinkUser> list, List<LinkUser> list2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJZI(C954780axA c954780axA) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJLIIL(JoinGroupDirectIMModel joinGroupDirectIMModel) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJLL(C954780axA c954780axA) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJLZIJ(Map<String, MicPositionContentInfo> map) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJZ(int i, String str) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIIIJILLIZJL(Avatar avatar, String str) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LJJLIIIJJIZ(String str) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIIIJLJLI() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIL() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLJLI(C966020bFI c966020bFI, ListChangeMessage listChangeMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLL(int i, int i2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJZZI(C965210bDz c965210bDz) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJL(InterfaceC954180awC interfaceC954180awC, P2PGroupChangeMessage p2PGroupChangeMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLI(InterfaceC954180awC interfaceC954180awC, ReplyInviteGroupMessage replyInviteGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLIIIL(InterfaceC954180awC interfaceC954180awC, InviteGroupMessage inviteGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLILLLLZI(InterfaceC954180awC interfaceC954180awC, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJI(InterfaceC954180awC interfaceC954180awC, C949400aoU c949400aoU) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJJI(InterfaceC954180awC interfaceC954180awC, boolean z, LinkCoreError linkCoreError) {
            }

            @Override // X.InterfaceC964770bDH
            public final InterfaceC965500bES LJLJJLL(InterfaceC954180awC interfaceC954180awC) {
                return null;
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJL(InterfaceC954180awC interfaceC954180awC, RtcStartResultMessage rtcStartResultMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJLLL(int i, InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLL(InterfaceC954180awC interfaceC954180awC, PermitApplyGroupMessage permitApplyGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLLILLLL(InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLLL(InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLLLL(InterfaceC954180awC interfaceC954180awC, String str) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJZI(InterfaceC954180awC interfaceC954180awC, JoinRoomDirectMessage joinRoomDirectMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LL(InterfaceC954180awC interfaceC954180awC, LinkCoreError linkCoreError) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLFZ(InterfaceC954180awC interfaceC954180awC, LeaveGroupMessage leaveGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIII(InterfaceC954180awC interfaceC954180awC, GroupChangeMessage groupChangeMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIIILZ(InterfaceC954180awC interfaceC954180awC, String str) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIIJ(InterfaceC954180awC interfaceC954180awC, ApplyMessage applyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIIZ(InterfaceC954180awC interfaceC954180awC, int i) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIL(InterfaceC954180awC interfaceC954180awC, DirectJoinMessage directJoinMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIILZL() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIL(List<LinkUser> list) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLILLIZIL(InterfaceC954180awC interfaceC954180awC, CancelInviteGroupMessage cancelInviteGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLILLJJLI(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIZLLLIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LLJI(String str, boolean z, boolean z2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJIJIL(InterfaceC954180awC interfaceC954180awC, CancelApplyMessage cancelApplyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJJJ(InterfaceC954180awC interfaceC954180awC, CreateChannelMessage createChannelMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJL(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJLLIL(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJZ(InterfaceC954180awC interfaceC954180awC, int i, int i2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLL(InterfaceC954180awC interfaceC954180awC, int i, C967130bH5 c967130bH5, String str, CustomLinkMessage customLinkMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLFFI(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLIIII(long j, InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLIIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLIILIL(InterfaceC954180awC interfaceC954180awC, CancelApplyGroupMessage cancelApplyGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LLLIL(LinkLayerRTCMessage linkLayerRTCMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLILZJ(InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLL(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLIL(InterfaceC954180awC interfaceC954180awC, CancelInviteMessage cancelInviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLJ(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLLLL(List<InteractAudioVolumeInfo> list) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLZZ(InterfaceC954180awC interfaceC954180awC, ApplyGroupMessage applyGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLZ(String str) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIIIJ() {
                Iterator<Runnable> it2 = this.LL.LJJ.iterator();
                while (it2.hasNext()) {
                    it2.next().run();
                }
                ((ArrayList) this.LL.LJJ).clear();
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLII(InterfaceC954180awC interfaceC954180awC, LinkUser linkUser, CustomLinkMessage customLinkMessage) {
                C11S5.LIZ().LIZIZ(new Runnable() { // from class: X.01o4
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("NoticeboardUtils@5337.updateUseTime$1");
                        try {
                            C0KPJ.f1if.LJFF(Long.valueOf(System.currentTimeMillis()));
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("NoticeboardUtils@5337.updateUseTime$1");
                    }
                });
            }
        };
        this.LJIJJLI = new OnMessageListener() { // from class: X.01r2
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                NoticeboardMessage noticeboardMessage;
                if ((iMessage instanceof NoticeboardMessage) && (noticeboardMessage = (NoticeboardMessage) iMessage) != null) {
                    C953610avH c953610avH = this.LL;
                    DataChannel dataChannel2 = dataChannel;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("NoticeboardMessage received messageType=");
                    sbLIZ.append(noticeboardMessage.messageType);
                    C20441214yg.LJIIIZ("NoticeboardController", C2188811AlT.LIZIZ(sbLIZ));
                    int i = noticeboardMessage.messageType;
                    if (i == 1) {
                        NoticeboardContent noticeboardContent = noticeboardMessage.noticeboardContent;
                        if (noticeboardContent != null) {
                            c953610avH.LJIILLIIL(noticeboardContent, "IM_review");
                            return;
                        }
                        return;
                    }
                    if (i != 2) {
                        return;
                    }
                    NoticeboardContent noticeboardContent2 = noticeboardMessage.noticeboardContent;
                    if (noticeboardContent2 != null) {
                        long j = noticeboardContent2.version;
                        if (j <= 0 || j > c953610avH.LJIIIZ) {
                            c953610avH.LJIIIZ = j;
                            NoticeboardReviewInfo noticeboardReviewInfo = noticeboardContent2.lastReviewInfo;
                            if (noticeboardReviewInfo != null) {
                                C953760avW.LIZIZ.LIZ().LJIIZILJ(dataChannel2, new Pair<>(noticeboardReviewInfo.mediaNodeId, Integer.valueOf(noticeboardReviewInfo.reviewStatus)));
                                C953620avI.LJIIIIZZ(Integer.valueOf(noticeboardReviewInfo.reviewStatus));
                            }
                        }
                    }
                    c953610avH.LJIJI(EnumC487701v9.IM);
                }
            }
        };
        this.LJIL = new C987070bnF(this, 6);
        this.LJJ = new ArrayList();
    }

    public final void LJIIJJI(String str, Bitmap bitmap, Function1<? super String, Unit> function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createAuxStreamIfNeed resumeStreamId=");
        sbLIZ.append(str);
        sbLIZ.append(" currentBitmap=");
        sbLIZ.append(bitmap);
        C20441214yg.LJIIIZ("NoticeboardController", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIILL == null) {
            C20441214yg.LJIIIZ("NoticeboardController", "createAuxStreamIfNeed create auxstream");
            final AwS381S0200000_15 awS381S0200000_15 = new AwS381S0200000_15(this, (C953610avH) function1, (Function1<? super String, Unit>) 158);
            C01IN c01in = new C01IN();
            C01IL c01ilLIZIZ = C953620avI.LIZIZ(bitmap);
            C01IM c01imLIZJ = C953620avI.LIZJ(bitmap, false);
            c01in.LIZIZ = c01ilLIZIZ;
            c01in.LIZ = str;
            c01in.LIZJ = c01imLIZJ;
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                interfaceC954180awCLLJLL.LLI(new AsyncAuxStreamCreateTask(c01in, new AsyncAuxStreamCreateCallback() { // from class: X.0avQ
                    @Override // com.bytedance.android.livesdk.comp.api.linkcore.model.AsyncAuxStreamCreateCallback
                    public final void onCreated(C1275750jIr c1275750jIr) {
                        String str2;
                        Function1<String, Unit> function12;
                        C20441214yg.LJIIIZ("NoticeboardController", "createAuxStreamIfNeed create auxstream success. Async");
                        if (c1275750jIr != null && (str2 = c1275750jIr.LIZIZ) != null && (function12 = awS381S0200000_15) != null) {
                            function12.invoke(str2);
                        }
                    }
                }));
            }
        }
    }
}
