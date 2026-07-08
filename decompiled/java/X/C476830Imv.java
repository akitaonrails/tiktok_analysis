package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.feed.api.TopLiveClearModelChannel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.livesetting.feed.LiveForuTopLivesEnterOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveTopTabSwitch;
import com.bytedance.android.livesdk.livesetting.skylight.LiveSkylightStyleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveJumpReturnSkylightAutoOpenSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TopLiveSkylightLoadAsyncSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TopliveSkylightAutoOpenOpt;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.live.skylight.LiveSkylightMatchExperiment;
import java.util.List;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0Imv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476830Imv extends AbstractC476820Imu {
    public boolean LJJLJLI;
    public final C0JAM LJJLL;
    public boolean LJJZ;
    public final C01GW LJJZZI;

    @Override // X.AbstractC476820Imu
    public final C476930In5 LIZJ() {
        return (C476930In5) this.LJJZZI.getValue();
    }

    @Override // X.AbstractC476820Imu
    public final void LJIILL() {
        this.LJJLL.LIZIZ();
        super.LJIILL();
        this.LJJLJLI = false;
    }

    @Override // X.AbstractC476820Imu
    public final EnumC477350Inl LJJI() {
        return LiveSkylightStyleSetting.INSTANCE.getValue().showTitle ? EnumC477350Inl.DEFAULT : EnumC477350Inl.EMPTY_DECOR;
    }

    public final void LJJIJLIJ() {
        List<FeedItem> list;
        BaseListResponse<FeedItem, FeedExtra> baseListResponse = this.LJJJZ;
        if ((baseListResponse == null || (list = baseListResponse.data) == null || !(list.isEmpty() ^ true)) ? false : true) {
            C467730IVv.LIZ(null, Boolean.TRUE, 1);
        } else {
            C467730IVv.LIZ(Boolean.TRUE, null, 2);
        }
    }

    public static boolean LJJIJL(EnumC471750Iej enumC471750Iej) {
        if (enumC471750Iej != EnumC471750Iej.ENTER_TOPLIVE && enumC471750Iej != EnumC471750Iej.IMMEDIATELY_ENTER_REFRESH && enumC471750Iej != EnumC471750Iej.BACK_FROM_LIVE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019 A[PHI: r3
      0x0019: PHI (r3v5 java.lang.String) = (r3v0 java.lang.String), (r3v6 java.lang.String) binds: [B:12:0x0017, B:10:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0021 A[PHI: r3
      0x0021: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String), (r3v5 java.lang.String) binds: [B:12:0x0017, B:14:0x001b, B:16:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC476820Imu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(X.EnumC476910In3 r6) {
        /*
            r5 = this;
            X.0Ina r0 = r5.LJJIL
            if (r0 == 0) goto L68
            X.0In1 r0 = (X.C476890In1) r0
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r2 = r0.LIZ()
        La:
            java.lang.String r1 = "live_merge"
            if (r2 == 0) goto L16
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r2.mRoomsData
            if (r0 == 0) goto L16
            java.lang.String r3 = r0.enterFromMerge
            if (r3 != 0) goto L19
        L16:
            r3 = r1
            if (r2 == 0) goto L21
        L19:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r2.mRoomsData
            if (r0 == 0) goto L21
            java.lang.String r2 = r0.enterMethod
            if (r2 != 0) goto L23
        L21:
            java.lang.String r2 = "live_cover"
        L23:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            if (r0 != 0) goto L31
            X.0In3 r0 = X.EnumC476910In3.ENTER_ROOM
            if (r6 == r0) goto L31
            java.lang.String r0 = "inner_flow_live_cover"
            r2 = r3
            r3 = r0
        L31:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.LJJLI = r0
            java.lang.String r0 = "livesdk_following_cover_close"
            X.0IjA r4 = X.C0IJT.LIZ(r0)
            java.lang.String r1 = "close_type"
            java.lang.String r0 = r6.getReason()
            r4.LJJII(r0, r1)
            java.lang.String r0 = "enter_from_merge"
            r4.LJJII(r3, r0)
            java.lang.String r0 = "enter_method"
            r4.LJJII(r2, r0)
            long r2 = r5.LJJLI
            long r0 = r5.LJJL
            long r2 = r2 - r0
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "following_cover_stay_duration"
            r4.LJJII(r1, r0)
            r4.LIZ()
            r0 = -1
            r5.LJJL = r0
            r5.LJJLI = r0
            return
        L68:
            r2 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C476830Imv.LJIIJJI(X.0In3):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c A[PHI: r5
      0x001c: PHI (r5v5 java.lang.String) = (r5v0 java.lang.String), (r5v6 java.lang.String) binds: [B:12:0x001a, B:10:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0024 A[PHI: r5
      0x0024: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v5 java.lang.String), (r5v5 java.lang.String) binds: [B:12:0x001a, B:14:0x001e, B:16:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC476820Imu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(X.EnumC476920In4 r7) {
        /*
            r6 = this;
            super.LJIIL(r7)
            X.0Ina r0 = r6.LJJIL
            if (r0 == 0) goto L9c
            X.0In1 r0 = (X.C476890In1) r0
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r2 = r0.LIZ()
        Ld:
            java.lang.String r1 = "live_merge"
            if (r2 == 0) goto L19
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r2.mRoomsData
            if (r0 == 0) goto L19
            java.lang.String r5 = r0.enterFromMerge
            if (r5 != 0) goto L1c
        L19:
            r5 = r1
            if (r2 == 0) goto L24
        L1c:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r2.mRoomsData
            if (r0 == 0) goto L24
            java.lang.String r4 = r0.enterMethod
            if (r4 != 0) goto L26
        L24:
            java.lang.String r4 = "live_cover"
        L26:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r5)
            if (r0 != 0) goto L30
            java.lang.String r0 = "inner_flow_live_cover"
            r4 = r5
            r5 = r0
        L30:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.LJJL = r0
            java.lang.String r0 = "livesdk_following_cover_show"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            X.0Imy r0 = r6.LIZLLL()
            r3 = 0
            if (r0 == 0) goto L9a
            int r0 = r0.LJIILJJIL()
        L47:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "room_count"
            r2.LJJII(r1, r0)
            java.lang.String r1 = "show_type"
            java.lang.String r0 = r7.getReason()
            r2.LJJII(r0, r1)
            java.lang.String r0 = "enter_from_merge"
            r2.LJJII(r5, r0)
            java.lang.String r0 = "enter_method"
            r2.LJJII(r4, r0)
            java.lang.String r1 = "cover_position"
            java.lang.String r0 = "up"
            r2.LJJII(r0, r1)
            X.0Imy r1 = r6.LIZLLL()
            if (r1 == 0) goto L98
            X.0Ien r0 = r6.LJ
            int r0 = r1.LJ(r0)
        L76:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "following_room_count"
            r2.LJJII(r1, r0)
            X.0Imy r1 = r6.LIZLLL()
            if (r1 == 0) goto L8b
            X.0Ien r0 = r6.LJ
            int r3 = r1.LJIJI(r0)
        L8b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = "non_following_room_count"
            r2.LJJII(r1, r0)
            r2.LIZ()
            return
        L98:
            r0 = 0
            goto L76
        L9a:
            r0 = 0
            goto L47
        L9c:
            r2 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C476830Imv.LJIIL(X.0In4):void");
    }

    @Override // X.AbstractC476820Imu
    public final void LJIILIIL(List<? extends FeedItem> list) {
        long ownerUserId;
        if (!this.LJJLL.LIZLLL && !list.isEmpty()) {
            this.LJJLL.LJI();
            for (FeedItem feedItem : list) {
                Room room = feedItem.getRoom();
                if (room != null || (room = feedItem.getRoom()) != null) {
                    String strValueOf = String.valueOf(room.getId());
                    User owner = room.getOwner();
                    if (owner != null) {
                        ownerUserId = owner.getId();
                    } else {
                        ownerUserId = room.getOwnerUserId();
                    }
                    String strValueOf2 = String.valueOf(ownerUserId);
                    if (strValueOf.length() > 0 && strValueOf2.length() > 0) {
                        C0JAM c0jam = this.LJJLL;
                        if (c0jam.LIZ()) {
                            ((List) c0jam.LJFF.getValue()).add(strValueOf);
                            ((List) c0jam.LJI.getValue()).add(strValueOf2);
                        }
                    }
                }
            }
            C0JAM c0jam2 = this.LJJLL;
            c0jam2.LJIIJ(null, null, null, c0jam2.LJ(), false);
            this.LJJLL.LIZJ();
        }
    }

    public C476830Imv(C19GS c19gs, LifecycleOwner lifecycleOwner, InterfaceC477100InM interfaceC477100InM, Object obj) {
        super(c19gs, lifecycleOwner, interfaceC477100InM, obj);
        this.LJJLL = C0JAM.LJIIIIZZ.getValue();
        this.LJJZZI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 601));
    }

    public final void LJJIJIL(long j, long j2, String str, boolean z) {
        boolean z2;
        if (!TopLiveSkylightLoadAsyncSetting.INSTANCE.getLoadAsync() && !LiveSkylightMatchExperiment.INSTANCE.enable()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (LiveJumpReturnSkylightAutoOpenSetting.INSTANCE.topliveAutoOpen() && !this.LJJJJZI && z && !LiveForuTopLivesEnterOptSetting.INSTANCE.enableOpenTopLiveImmediately(j2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRoomChangeEvent: openSkylight from ");
            sbLIZ.append(str);
            sbLIZ.append(", roomId: ");
            sbLIZ.append(j);
            sbLIZ.append(" fromToplive=");
            sbLIZ.append(z);
            C20441214yg.LJIIIZ("LiveRoomSkylightManager", C2188811AlT.LIZIZ(sbLIZ));
            LJJIII(true, false, EnumC476920In4.ENTER_ROOM, EnumC476910In3.NULL, true);
            LIZ();
            return;
        }
        if (TopliveSkylightAutoOpenOpt.INSTANCE.getAutoOpenOpt()) {
            if (this.LJJJJZI && LiveForuTopLivesEnterOptSetting.INSTANCE.enableOpenTopLiveImmediately(j2)) {
                LIZ();
                return;
            }
            if (z || !this.LJJJJZI) {
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onRoomChangeEvent: closeSkylight from ");
            sbLIZ2.append(str);
            sbLIZ2.append(", roomId: ");
            sbLIZ2.append(j);
            C20441214yg.LJIIIZ("LiveRoomSkylightManager", C2188811AlT.LIZIZ(sbLIZ2));
            LJJIII(false, true, EnumC476920In4.NULL, EnumC476910In3.ENTER_ROOM, false);
            return;
        }
        if (this.LJJJJZI && LiveForuTopLivesEnterOptSetting.INSTANCE.enableOpenTopLiveImmediately(j2) && z2) {
            LIZ();
            return;
        }
        if (!this.LJJJJZI && LiveForuTopLivesEnterOptSetting.INSTANCE.enableOpenTopLiveImmediately(j2) && !z2 && C474850Ijj.LIZ(this.LJ)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onRoomChangeEvent: openSkylight from ");
            sbLIZ3.append(str);
            sbLIZ3.append(", roomId: ");
            sbLIZ3.append(j);
            C20441214yg.LJIIIZ("LiveRoomSkylightManager", C2188811AlT.LIZIZ(sbLIZ3));
            LJJIII(true, true, EnumC476920In4.ENTER_ROOM, EnumC476910In3.NULL, true);
            LIZ();
            return;
        }
        if (!this.LJJJJZI) {
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("onRoomChangeEvent: closeSkylight from ");
        sbLIZ4.append(str);
        sbLIZ4.append(", roomId: ");
        sbLIZ4.append(j);
        C20441214yg.LJIIIZ("LiveRoomSkylightManager", C2188811AlT.LIZIZ(sbLIZ4));
        LJJIII(false, true, EnumC476920In4.NULL, EnumC476910In3.ENTER_ROOM, false);
    }

    @Override // X.AbstractC476820Imu
    public final void LJJIII(boolean z, boolean z2, EnumC476920In4 enumC476920In4, EnumC476910In3 enumC476910In3, boolean z3) {
        ViewGroup viewGroup;
        boolean z4;
        if (this.LIZ.getRequestedOrientation() != 1 && !((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() && (!this.LJJJJZI || LiveTopTabSwitch.landscapeOptRevertSwitch())) {
            return;
        }
        ValueAnimator valueAnimator = this.LJJIJIIJI;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        ViewGroup viewGroup2 = this.LJIILL;
        if (viewGroup2 == null) {
            if (z3 && this.LJJJJZI != z) {
                View view = this.LJJIIZ;
                if (view != null) {
                    C439101nJ.LJI(view);
                }
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                if (this.LJIJI != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                dataChannelGlobal.HQ2(TopLiveClearModelChannel.class, new C475540Ikq(z, false, -3L, z4));
                LJIILJJIL(z, 0.0f, enumC476920In4, enumC476910In3, true, false);
                return;
            }
            return;
        }
        if (this.LJJJJZI == z && this.LJJLJLI == z) {
            float translationY = viewGroup2.getTranslationY();
            if (!z) {
                if (translationY <= 0.0f) {
                    return;
                }
            } else {
                if (C474850Ijj.LIZ(this.LJ) && (viewGroup = this.LJJIII) != null && viewGroup.getVisibility() == 0) {
                    LJIJ();
                    return;
                }
                return;
            }
        } else {
            if (!z) {
            }
            super.LJJIII(z, z2, enumC476920In4, enumC476910In3, z3);
        }
        InterfaceC477240Ina interfaceC477240Ina = this.LJJIL;
        if (interfaceC477240Ina != null) {
            C476890In1 c476890In1 = (C476890In1) interfaceC477240Ina;
            if (c476890In1.LIZIZ.LLJJ.c1() != null) {
                c476890In1.LIZIZ.LLJJ.c1().LIZLLL(false);
            }
        }
        super.LJJIII(z, z2, enumC476920In4, enumC476910In3, z3);
    }

    @Override // X.AbstractC476820Imu
    public final void LJIILJJIL(boolean z, float f, EnumC476920In4 enumC476920In4, EnumC476910In3 enumC476910In3, boolean z2, boolean z3) {
        if (!z2) {
            if (z && this.LJJLJLI != this.LJJJJZI) {
                LJIL(f);
            }
            this.LJJLJLI = z;
        }
        super.LJIILJJIL(z, f, enumC476920In4, enumC476910In3, z2, z3);
        if (z) {
            LJJIJLIJ();
        }
    }
}
