package X;

import android.content.Context;
import android.os.Message;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.model.LiveEventInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorCreateRetryCountSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.user.ApplyLivePermission;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UQ6, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UQ6 implements InterfaceC1141530foN {
    public static final /* synthetic */ int LLJJI = 0;
    public final DataChannel LL;
    public final Fragment LLILLJJLI;
    public final Context LLILLL;
    public final C01GW LLILZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 827));
    public final DetailLivePermission LLILZIL;
    public final ApplyLivePermission LLILZLL;
    public final Map<String, Boolean> LLIZ;
    public final int LLIZLLLIL;
    public int LLJ;
    public Message LLJI;
    public LiveMode LLJIJIL;
    public Function0<Unit> LLJILJIL;
    public Function1<? super Room, Unit> LLJILJILJ;
    public C11PR<String> LLJILLL;
    public boolean LLJJ;

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        LiveMode liveMode;
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        if (Intrinsics.LJFF(c262100zr.LIZ, "ttlive_apply_success")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            String strLJFF2 = null;
            if (interfaceC1107590evd != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "");
            } else {
                strLJFF = null;
            }
            if (Intrinsics.LJFF(strLJFF, "success")) {
                InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                if (interfaceC1107590evd2 != null) {
                    this.LLIZ.put(interfaceC1107590evd2.getString("mode"), Boolean.TRUE);
                    SparkContext sparkContext = C771930UPv.LIZ;
                    if (sparkContext != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ()) != null) {
                        interfaceC1059280dfiLJJIJLIJ.close();
                    }
                    C766270U4b.LIZJ(C500260Jjc.LJ(this.LLILLL), C497740JfY.LJIJI(2131842664));
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_live_access_apply_success");
                    c474500IjALIZ.LJIJJLI(this.LL);
                    DataChannel dataChannel = this.LL;
                    if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
                        strLJFF2 = C354201Zc.LIZ(liveMode);
                    }
                    c474500IjALIZ.LJJII(strLJFF2, "live_type");
                    c474500IjALIZ.LIZ();
                    return;
                }
                return;
            }
            InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
            if (interfaceC1107590evd3 != null) {
                strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd3, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "");
            }
            if (!Intrinsics.LJFF(strLJFF2, "hit-risk")) {
                return;
            }
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131842662));
        }
    }

    public final void LIZIZ(C0UQ8 c0uq8, Function0<Unit> function0) {
        Boolean boolValueOf;
        long j;
        boolean z;
        LiveEventInfo liveEventInfo;
        C781270Ukn.LJIIJ().finishLivePlayActivityAndGoLiveActivity();
        if (c0uq8 != null) {
            boolValueOf = Boolean.valueOf(c0uq8.LJIIIIZZ(this.LLILLJJLI));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIJIL(boolValueOf)) {
            return;
        }
        if (C468960IaE.LIZ((Hashtag) this.LL.gg0(HashtagChangedChannel.class))) {
            C0UKZ.LLJJIJIL.LJFF(Boolean.TRUE);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        RoomCreateInfo roomCreateInfo = (RoomCreateInfo) this.LL.gg0(RoomCreateInfoChannel.class);
        if (roomCreateInfo != null && (liveEventInfo = roomCreateInfo.mLiveEventInfo) != null) {
            j = liveEventInfo.id;
        } else {
            j = 0;
        }
        dataChannelGlobal.JQ2(C930700aKK.class, Long.valueOf(j));
        RoomCreateInfo roomCreateInfo2 = (RoomCreateInfo) this.LL.gg0(RoomCreateInfoChannel.class);
        if (roomCreateInfo2 != null) {
            z = roomCreateInfo2.isNewAnchor;
        } else {
            z = false;
        }
        dataChannelGlobal.JQ2(C930800aKU.class, Boolean.valueOf(z));
        function0.invoke();
    }

    public C0UQ6(Context context, Fragment fragment, DataChannel dataChannel) {
        this.LL = dataChannel;
        this.LLILLJJLI = fragment;
        this.LLILLL = context;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        this.LLILZIL = (DetailLivePermission) dataChannelGlobal.gg0(C168F.class);
        this.LLILZLL = (ApplyLivePermission) dataChannelGlobal.gg0(C168D.class);
        this.LLIZ = new LinkedHashMap();
        this.LLIZLLLIL = LiveAnchorCreateRetryCountSetting.INSTANCE.retryCount();
        if (C500260Jjc.LJJIJLIJ()) {
            C1548820qPI.LIZLLL("ttlive_apply_success", this);
        }
    }

    public static void LIZLLL(int i, DataChannel dataChannel, int i2) {
        C0UTQ c0utq = (C0UTQ) DataChannelGlobal.LLILZ.gg0(C931280aLG.class);
        if (c0utq != null) {
            c0utq.LJI = i;
            c0utq.LJIIIZ = System.currentTimeMillis();
            c0utq.LJIIJ = i2;
        }
        C0UTP.LIZ.LIZLLL(dataChannel, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        if (r19 != r2) goto L42;
     */
    /* JADX WARN: Type inference failed for: r1v17, types: [X.0UQ4, X.0foN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.os.Message r18, com.bytedance.android.livesdkapi.depend.model.live.LiveMode r19, kotlin.jvm.functions.Function0<kotlin.Unit> r20, kotlin.jvm.functions.Function1<? super com.bytedance.android.livesdkapi.depend.model.live.Room, kotlin.Unit> r21, X.C11PR<java.lang.String> r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 1640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UQ6.LIZJ(android.os.Message, com.bytedance.android.livesdkapi.depend.model.live.LiveMode, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, X.11PR, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.Integer r24, java.lang.Boolean r25, X.C0UQ8 r26, X.C16FS r27, com.bytedance.android.livesdkapi.depend.model.live.LiveMode r28, boolean r29, kotlin.jvm.functions.Function0 r30, kotlin.jvm.functions.Function0 r31) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UQ6.LIZ(java.lang.Integer, java.lang.Boolean, X.0UQ8, X.16FS, com.bytedance.android.livesdkapi.depend.model.live.LiveMode, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void");
    }
}
