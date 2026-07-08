package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0ePm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087840ePm implements C0JGY {
    public static final int LJIILJJIL = (int) C497740JfY.LIZIZ(85.0f);
    public final DataChannel LIZ;
    public final Context LIZIZ;
    public final Room LIZJ;
    public final ViewGroup LIZLLL;
    public boolean LJ;
    public long LJFF;
    public Bitmap LJIIIZ;
    public final long LJIIJ;
    public final int LJIIJJI;
    public C11JF LJIILIIL;
    public final C01GW LJI = C292401Bi.LIZ(new AwS561S0100000_17(this, 624));
    public final C01GW LJII = C292401Bi.LIZ(new AwS561S0100000_17(this, 626));
    public final C01GW LJIIIIZZ = C292401Bi.LIZ(new AwS561S0100000_17(this, 625));
    public final C11NJ LJIIL = new C11NJ();

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r18, long r19) {
        /*
            r17 = this;
            r1 = r17
            X.01GW r0 = r1.LJI
            java.lang.Object r12 = r0.getValue()
            X.0eLy r12 = (X.InterfaceC1085480eLy) r12
            boolean r0 = r12 instanceof com.bytedance.android.livesdk.like.LikeHelper
            if (r0 == 0) goto La2
            com.bytedance.android.livesdk.like.LikeHelper r12 = (com.bytedance.android.livesdk.like.LikeHelper) r12
            if (r12 == 0) goto La2
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r1.LIZJ
            long r7 = r0.getOwnerUserId()
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r5 = r0.getCurrentUserId()
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r1.LIZJ
            com.bytedance.android.livesdkapi.depend.model.live.GroupLiveSession r0 = r0.groupLiveSession
            r2 = 1
            r11 = 0
            if (r0 == 0) goto Lba
            boolean r0 = r0.isGroupLiveSession
            if (r0 != r2) goto Lba
            r4 = 1
        L31:
            java.lang.Class<com.bytedance.android.live.liveinteract.api.IInteractService> r0 = com.bytedance.android.live.liveinteract.api.IInteractService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.liveinteract.api.IInteractService r0 = (com.bytedance.android.live.liveinteract.api.IInteractService) r0
            boolean r3 = r0.UN0()
            r0 = r19
            if (r3 == 0) goto La3
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 != 0) goto Lb8
        L45:
            long r14 = android.os.SystemClock.uptimeMillis()
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r4 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0fzF> r3 = X.C1148270fzF.class
            java.lang.Object r9 = r4.gg0(r3)
            java.lang.String r9 = (java.lang.String) r9
            X.0Ism r4 = X.C480460Ism.LIZ()
            java.lang.Class<com.bytedance.android.livesdk.like.LikeApi> r3 = com.bytedance.android.livesdk.like.LikeApi.class
            r4.getClass()
            java.lang.Object r4 = X.C480460Ism.LIZLLL(r3)
            com.bytedance.android.livesdk.like.LikeApi r4 = (com.bytedance.android.livesdk.like.LikeApi) r4
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r12.LLILLL
            long r5 = r3.getId()
            r13 = r18
            long r7 = (long) r13
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            X.11NZ r4 = r4.like(r5, r7, r9, r10, r11)
            java.lang.Class<com.bytedance.android.livesdk.like.LikeApi> r3 = com.bytedance.android.livesdk.like.LikeApi.class
            X.0ThB r3 = X.C0J1R.LIZJ(r3)
            X.11NZ r4 = r4.LJIILIIL(r3)
            androidx.lifecycle.LifecycleOwner r3 = r12.LL
            X.11L0 r3 = X.C11RD.LJ(r3)
            java.lang.Object r3 = r4.LIZJ(r3)
            X.0J1N r3 = (X.C0J1N) r3
            Y.AfS2S0101100_17 r11 = new Y.AfS2S0101100_17
            r16 = 0
            r11.<init>(r12, r13, r14, r16)
            Y.AfS2S0101100_17 r4 = new Y.AfS2S0101100_17
            r9 = 1
            r5 = r12
            r6 = r13
            r7 = r14
            r4.<init>(r5, r6, r7, r9)
            r3.LIZ(r11, r4)
            r12.LJJIJLIJ()
            r12.LJJIJL(r13, r0, r2)
        La2:
            return
        La3:
            if (r4 == 0) goto La7
            r11 = 2
            goto L45
        La7:
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 == 0) goto L45
            com.bytedance.android.livesdk.livesetting.other.LiveLikeRequestOptSetting r3 = com.bytedance.android.livesdk.livesetting.other.LiveLikeRequestOptSetting.INSTANCE
            boolean r3 = r3.fixMultiGuestAnchorRequest()
            if (r3 == 0) goto Lb8
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 != 0) goto Lb8
            goto L45
        Lb8:
            r11 = 1
            goto L45
        Lba:
            r4 = 0
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1087840ePm.LIZ(int, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1087840ePm(com.bytedance.ies.sdk.datachannel.DataChannel r7, android.content.Context r8, com.bytedance.android.livesdkapi.depend.model.live.Room r9, android.view.ViewGroup r10) {
        /*
            r6 = this;
            r6.<init>()
            r6.LIZ = r7
            r6.LIZIZ = r8
            r6.LIZJ = r9
            r6.LIZLLL = r10
            kotlin.jvm.internal.AwS561S0100000_17 r1 = new kotlin.jvm.internal.AwS561S0100000_17
            r0 = 624(0x270, float:8.74E-43)
            r1.<init>(r6, r0)
            X.01GW r0 = X.C292401Bi.LIZ(r1)
            r6.LJI = r0
            kotlin.jvm.internal.AwS561S0100000_17 r1 = new kotlin.jvm.internal.AwS561S0100000_17
            r0 = 626(0x272, float:8.77E-43)
            r1.<init>(r6, r0)
            X.01GW r0 = X.C292401Bi.LIZ(r1)
            r6.LJII = r0
            kotlin.jvm.internal.AwS561S0100000_17 r1 = new kotlin.jvm.internal.AwS561S0100000_17
            r0 = 625(0x271, float:8.76E-43)
            r1.<init>(r6, r0)
            X.01GW r0 = X.C292401Bi.LIZ(r1)
            r6.LJIIIIZZ = r0
            X.11NJ r0 = new X.11NJ
            r0.<init>()
            r6.LJIIL = r0
            com.bytedance.android.livesdk.livesetting.barrage.DiggParamsSetting r0 = com.bytedance.android.livesdk.livesetting.barrage.DiggParamsSetting.INSTANCE
            com.bytedance.android.livesdk.chatroom.model.LikeConfig r5 = r0.getValue()
            if (r5 == 0) goto L49
            long r3 = r5.tapInterval
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L4b
        L49:
            r3 = 500(0x1f4, double:2.47E-321)
        L4b:
            r6.LJIIJ = r3
            if (r9 == 0) goto L68
            com.bytedance.android.livesdk.model.LikeInfo r0 = r9.likeInfo
            if (r0 == 0) goto L68
            com.bytedance.android.livesdk.model.LikeInfo r0 = r9.likeInfo
            java.lang.Integer r0 = r0.clickCnt
            int r0 = r0.intValue()
            if (r0 <= 0) goto L68
            com.bytedance.android.livesdk.model.LikeInfo r0 = r9.likeInfo
            java.lang.Integer r0 = r0.clickCnt
            int r0 = r0.intValue()
        L65:
            r6.LJIIJJI = r0
            return
        L68:
            if (r5 == 0) goto L6f
            int r0 = r5.showProgressTapCount
            if (r0 <= 0) goto L6f
            goto L65
        L6f:
            r0 = 15
            goto L65
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1087840ePm.<init>(com.bytedance.ies.sdk.datachannel.DataChannel, android.content.Context, com.bytedance.android.livesdkapi.depend.model.live.Room, android.view.ViewGroup):void");
    }
}
