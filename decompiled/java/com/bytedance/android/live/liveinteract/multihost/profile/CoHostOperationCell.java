package com.bytedance.android.live.liveinteract.multihost.profile;

import X.AbstractC495580Jc4;
import X.C01GW;
import X.C1161920gLG;
import X.C11NZ;
import X.C11ON;
import X.C16FS;
import X.C1CC2;
import X.C20441214yg;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C480460Ism;
import X.C489040JFu;
import X.C495920Jcc;
import X.C496280JdC;
import X.C497740JfY;
import X.C500370Jjn;
import X.C521850KdL;
import X.C749070TZx;
import X.C749960TbO;
import X.C784440Upu;
import X.C786410Ut5;
import X.C814420VxA;
import X.C915200ZvK;
import X.C924810aAp;
import X.C955540ayO;
import X.EnumC495780JcO;
import X.EnumC496240Jd8;
import X.InterfaceC1487280oo2;
import X.InterfaceC1631620sYq;
import X.InterfaceC495660JcC;
import X.InterfaceC500500Jk0;
import Y.AObserverS211S0100000_7;
import Y.AfS143S0200000_7;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.multihost.profile.CoHostOperationCell;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.profile.service.ILiveProfileService;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostServerOptVersionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileStyleOptimizeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class CoHostOperationCell extends AbstractC495580Jc4<C500370Jjn> implements GenericLifecycleObserver {
    public final EnumC495780JcO LLJI;
    public final boolean LLJIJIL;
    public final Pair<Boolean, List<EnumC496240Jd8>> LLJILJIL;
    public User LLJILJILJ;
    public InterfaceC495660JcC LLJILLL;
    public final C01GW LLJJ;
    public final int LLJJI;
    public final TuxIconDrawable LLJJIII;
    public final int LLJJIJI;
    public final DataChannel LLJJIJIIJIL;
    public final long LLJJIJIL;
    public final String LLJJJ;
    public final String LLJJJIL;
    public final boolean LLJJJJ;
    public final Map<String, String> LLJJJJJIL;
    public C16FS LLJJJJLIIL;
    public ValueAnimator LLJJL;
    public C500370Jjn LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public boolean LLJLIL;
    public float LLJLILLLLZIIL;

    @Override // X.AbstractC495790JcP
    public final int LJ() {
        return R.layout.gyc;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        ValueAnimator valueAnimator = this.LLJJL;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
    }

    @Override // X.AbstractC495790JcP
    public final void LJIIJ() {
        View view = this.LLILLL;
        C16FS c16fs = view != null ? (C16FS) view.findViewById(R.id.ms3) : null;
        this.LLJJJJLIIL = c16fs;
        if (c16fs != null) {
            c16fs.setEnabled(true);
            c16fs.j0(LiveProfileStyleOptimizeSetting.INSTANCE.isNewStyleEnable() ? R.style.ak5 : R.style.ak4);
            c16fs.setIcon(this.LLJJI);
            c16fs.setText((CharSequence) null);
        }
        if (LiveProfileStyleOptimizeSetting.INSTANCE.isNewStyleEnable()) {
            int i = (this.LLILZIL - (this.LLIZLLLIL * 2)) - this.LLILZLL;
            this.LLJLILLLLZIIL = (i - r0) / this.LLIZ;
        }
        this.LLJL = SystemClock.uptimeMillis();
    }

    public final boolean LJIIZILJ() {
        MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus;
        C500370Jjn c500370Jjn = this.LLJJLIIIJLLLLLLLZ;
        return (c500370Jjn == null || (linkmicStatus = c500370Jjn.LIZIZ) == null || linkmicStatus.blockReason != 0 || Intrinsics.LJFF(this.LLJJJ, "search_stranger") || C924810aAp.LJ().LJIIIZ || ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).o52(this.LLJJIJIIJIL)) ? false : true;
    }

    public final C16FS LJIJ() {
        return (C16FS) this.LLJJ.getValue();
    }

    public final String LJIJI() {
        return this.LL.LJIIIIZZ.battleEnable ? "rank_quick_match" : Intrinsics.LJFF(this.LLJJJIL, "league_match_campaign") ? "league_rank_quick_match" : Intrinsics.LJFF(this.LL.LJIIIIZZ.mClickUserPosition, "music_spotlight") ? "music_spotlight" : "";
    }

    public final C955540ayO LJIJJ() {
        return this.LL.LJIIIIZZ.battleEnable ? C915200ZvK.LIZ(68) : Intrinsics.LJFF(this.LLJJJIL, "league_match_campaign") ? C915200ZvK.LIZ(67) : Intrinsics.LJFF(this.LL.LJIIIIZZ.mClickUserPosition, "music_spotlight") ? C915200ZvK.LIZ(69) : C955540ayO.LIZIZ;
    }

    @Override // X.InterfaceC495840JcU
    public final void cC() {
        ViewGroup viewGroup;
        C20441214yg.LIZIZ("CoHostOperationCell", "onUnbindData");
        if (this.LLJILLL != null) {
            View view = this.LLILLL;
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                C786410Ut5.LJJJLZIJ(LJIJ(), viewGroup);
            }
        }
        this.LLJJIJIIJIL.SX0(C749070TZx.class, new C496280JdC(false));
    }

    public final C11NZ<C500370Jjn> LJJIFFI() {
        int i;
        C480460Ism.LIZ().getClass();
        CoHostApi coHostApi = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
        long id = this.LL.LJFF.getId();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("cohost-arch-version", String.valueOf(CohostServerOptVersionSetting.INSTANCE.getValue()));
        C11ON c11onLJJJJZI = coHostApi.checkPermissionV3(id, true, linkedHashMap).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0Jjl
            /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
            @Override // X.InterfaceC1487280oo2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r3) {
                /*
                    r2 = this;
                    com.bytedance.android.live.network.response.BaseResponse r3 = (com.bytedance.android.live.network.response.BaseResponse) r3
                    T r0 = r3.data
                    com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionResponse r0 = (com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionResponse) r0
                    if (r0 == 0) goto L12
                    boolean r1 = r0.multiHostPermission
                    r0 = 1
                    if (r1 != r0) goto L12
                Ld:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                L12:
                    r0 = 0
                    goto Ld
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C500350Jjl.apply(java.lang.Object):java.lang.Object");
            }
        });
        C480460Ism.LIZ().getClass();
        CoHostApi coHostApi2 = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
        long id2 = this.LL.LJFF.getId();
        String strValueOf = String.valueOf(this.LL.LJII);
        String strValueOf2 = String.valueOf(this.LL.LJIIIIZZ.roomId);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRivalsEntrance. ");
        sbLIZ.append(this.LL.LJIIIIZZ.battleEnable);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLJJJ);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLJJJIL);
        sbLIZ.append(',');
        C20441214yg.LIZIZ("CoHostOperationCell", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LL.LJIIIIZZ.battleEnable || Intrinsics.LJFF(this.LLJJJIL, "league_match_campaign")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("entrance = RivalsEntrance.RivalsEntranceLeagueActivityPageDirectBattle. ");
            sbLIZ2.append(this.LL.LJIIIIZZ.battleEnable);
            sbLIZ2.append(", ");
            sbLIZ2.append(this.LLJJJ);
            C20441214yg.LIZIZ("CoHostOperationCell", C2188811AlT.LIZIZ(sbLIZ2));
            i = 5;
        } else if (Intrinsics.LJFF(this.LL.LJIIIIZZ.mClickUserPosition, "music_spotlight")) {
            C20441214yg.LIZIZ("CoHostOperationCell", "entrance = RivalsEntrance.RivalsEntranceMusicSpotlightRankList");
            i = 6;
        } else {
            C20441214yg.LIZIZ("CoHostOperationCell", "entrance = RivalsEntrance.RivalsEntranceNormal");
            i = 0;
        }
        return C11NZ.LJLLILLLL(c11onLJJJJZI, coHostApi2.getUserLinkmicStatusMultiCoHostSingle(id2, strValueOf, strValueOf2, "", "", "", i).LJJIJLIJ().LJJIIJZLJL(new C521850KdL(this, 0)), new InterfaceC500500Jk0() { // from class: X.0Jjk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC500500Jk0
            public final Object apply(Object obj, Object obj2) {
                MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus;
                Map<Long, MGetUserLinkmicStatusResponse.LinkmicStatus> map;
                Boolean bool = (Boolean) obj;
                MGetUserLinkmicStatusResponse.ResponseData responseData = (MGetUserLinkmicStatusResponse.ResponseData) ((BaseResponse) obj2).data;
                if (responseData != null && (map = responseData.linkmicStatusMap) != null) {
                    linkmicStatus = map.get(Long.valueOf(this.LIZ.LL.LJIIIIZZ.roomId));
                } else {
                    linkmicStatus = null;
                }
                this.LIZ.getClass();
                C496280JdC c496280JdC = new C496280JdC(CoHostOperationCell.LJIL(linkmicStatus));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Set cellData=");
                sbLIZ3.append(c496280JdC);
                C20441214yg.LIZIZ("CoHostOperationCell", C2188811AlT.LIZIZ(sbLIZ3));
                this.LIZ.LLJJIJIIJIL.SX0(C749070TZx.class, c496280JdC);
                return new C500370Jjn(bool.booleanValue(), linkmicStatus);
            }
        });
    }

    @Override // X.AbstractC495790JcP
    public final EnumC495780JcO LIZLLL() {
        return this.LLJI;
    }

    @Override // X.AbstractC495790JcP
    public final boolean LJFF() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC495790JcP
    public final Pair<Boolean, List<EnumC496240Jd8>> LJI() {
        return this.LLJILJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CoHostOperationCell(X.C495920Jcc r4) {
        /*
            r3 = this;
            r3.<init>(r4)
            X.0JcO r0 = X.EnumC495780JcO.CO_HOST_OPERATION
            r3.LLJI = r0
            X.0Jcf r2 = r4.LIZJ
            boolean r0 = r2.LJI
            if (r0 == 0) goto L84
            boolean r0 = r2.LIZLLL
            if (r0 != 0) goto L84
            com.bytedance.android.livesdk.event.UserProfileEvent r1 = r4.LJIIIIZZ
            boolean r0 = r1.coHostEnable
            if (r0 != 0) goto L1b
            boolean r0 = r1.battleEnable
            if (r0 == 0) goto L84
        L1b:
            boolean r0 = r2.LJIIIIZZ
            if (r0 != 0) goto L84
            r0 = 1
        L20:
            r3.LLJIJIL = r0
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.13BV r0 = X.C13BV.INSTANCE
            r2.<init>(r1, r0)
            r3.LLJILJIL = r2
            kotlin.jvm.internal.AwS551S0100000_7 r1 = new kotlin.jvm.internal.AwS551S0100000_7
            r0 = 5
            r1.<init>(r3, r0)
            X.01GW r0 = X.C1935407i4.LIZ(r1)
            r3.LLJJ = r0
            android.content.Context r1 = r4.LIZ
            r0 = 2131105807(0x7f06180f, float:1.7824147E38)
            int r0 = X.C20736316Cj.LJ(r0, r1)
            r3.LLJJI = r0
            X.0GdJ r1 = new X.0GdJ
            r1.<init>()
            r0 = 2130772754(0x7f010312, float:1.7148635E38)
            r1.LIZ = r0
            android.content.Context r0 = r4.LIZ
            com.bytedance.tux.drawable.TuxIconDrawable r0 = r1.LIZ(r0)
            r3.LLJJIII = r0
            r0 = 2131887807(0x7f1206bf, float:1.9410232E38)
            r3.LLJJIJI = r0
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.LJIIJJI
            r3.LLJJIJIIJIL = r0
            com.bytedance.android.livesdk.event.UserProfileEvent r2 = r4.LJIIIIZZ
            long r0 = r2.roomId
            r3.LLJJIJIL = r0
            java.lang.String r0 = r2.mSource
            r3.LLJJJ = r0
            java.lang.String r0 = r2.cardEnterFrom
            r3.LLJJJIL = r0
            boolean r0 = r2.currentHasMultiCoHostPermission
            r3.LLJJJJ = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.mRankInfo
            r3.LLJJJJJIL = r0
            r0 = 1083598438(0x40966666, float:4.7)
            r3.LLJLILLLLZIIL = r0
            androidx.lifecycle.LifecycleOwner r0 = r4.LIZIZ
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            r0.addObserver(r3)
            return
        L84:
            r0 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.profile.CoHostOperationCell.<init>(X.0Jcc):void");
    }

    public static boolean LJIJJLI(UserProfileEvent userProfileEvent) {
        if (!Intrinsics.LJFF(userProfileEvent.clickModule, "weekly_rank") && !Intrinsics.LJFF(userProfileEvent.clickModule, "daily_rank") && !Intrinsics.LJFF(userProfileEvent.clickModule, "hourly_rank") && !Intrinsics.LJFF(userProfileEvent.clickModule, "other_rank")) {
            return false;
        }
        return true;
    }

    public static boolean LJIL(MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus) {
        boolean z;
        boolean z2;
        LiveDirectMatchSetting liveDirectMatchSetting = LiveDirectMatchSetting.INSTANCE;
        int i = liveDirectMatchSetting.getValue().enableQuickMatchFromProfileCard;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableQuickMatchFromProfileCard, setting=");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("CoHostOperationCell", C2188811AlT.LIZIZ(sbLIZ));
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (linkmicStatus != null && liveDirectMatchSetting.isEnabled() && linkmicStatus.playType == 5) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isQuickBattle, isSettingEnabled=");
        sbLIZ2.append(z);
        sbLIZ2.append(", canTargetUserBattleInvite=");
        sbLIZ2.append(z2);
        C20441214yg.LIZIZ("CoHostOperationCell", C2188811AlT.LIZIZ(sbLIZ2));
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public final boolean LJJ(User user) {
        if (!user.isBlock && user.isFollowing()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(boolean r19) {
        /*
            Method dump skipped, instruction units count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.profile.CoHostOperationCell.LJJII(boolean):void");
    }

    @Override // X.AbstractC495790JcP
    public final boolean LJIIIZ(User user, Object obj) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C500370Jjn c500370Jjn = (C500370Jjn) obj;
        this.LLJILJILJ = user;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams.setMarginStart((int) C497740JfY.LIZIZ(8.0f));
        layoutParams.leftMargin = layoutParams.getMarginStart();
        layoutParams.setMarginEnd((int) C497740JfY.LIZIZ(16.0f));
        layoutParams.rightMargin = layoutParams.getMarginEnd();
        C489040JFu c489040JFuLj2 = ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).Lj2((C495920Jcc) this.LL, user);
        this.LLJILLL = c489040JFuLj2;
        if (c489040JFuLj2 == null) {
            c489040JFuLj2 = null;
        }
        c489040JFuLj2.LIZ(-1, layoutParams, (ViewGroup) this.LLILLL);
        InterfaceC495660JcC interfaceC495660JcC = this.LLJILLL;
        if (interfaceC495660JcC == null) {
            interfaceC495660JcC = null;
        }
        interfaceC495660JcC.getFollowStatus().observe(this.LL.LIZIZ, new AObserverS211S0100000_7(this, 0));
        this.LLJJLIIIJLLLLLLLZ = c500370Jjn;
        if (c500370Jjn != null && c500370Jjn.LIZ) {
            LJJII(false);
        } else {
            C16FS c16fs = this.LLJJJJLIIL;
            if (c16fs != null) {
                C786410Ut5.LLJJJ(c16fs, 8);
            }
        }
        C16FS c16fs2 = this.LLJJJJLIIL;
        if (c16fs2 == null || c16fs2.getVisibility() != 0) {
            ViewGroup.LayoutParams layoutParams2 = LJIJ().getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                marginLayoutParams.leftMargin = marginLayoutParams.getMarginStart();
            }
        }
        C784440Upu.LIZ().LIZJ(this.LL.LIZIZ, C749960TbO.class).LIZJ(new AfS143S0200000_7((Object) this, (EmoteModel) user, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 5));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.AbstractC495790JcP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(webcast.api.room.GetRoomProfileCardResponse.ResponseData r6, X.InterfaceC1364105Vn<? super X.C500370Jjn> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C496840Je6
            if (r0 == 0) goto L20
            r4 = r7
            X.0Je6 r4 = (X.C496840Je6) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L49
        L20:
            X.0Je6 r4 = new X.0Je6
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            android.os.SystemClock.uptimeMillis()
            X.11NZ r1 = r5.LJJIFFI()     // Catch: java.lang.Throwable -> L4f
            X.11RO r0 = X.C11S5.LIZ()     // Catch: java.lang.Throwable -> L4f
            X.11Hw r0 = r1.LJL(r0)     // Catch: java.lang.Throwable -> L4f
            r4.LLILLL = r2     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r1 = X.C500260Jjc.LJJJJL(r0, r4)     // Catch: java.lang.Throwable -> L4f
            if (r1 != r3) goto L4c
            return r3
        L49:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L4f
        L4c:
            X.0Jjn r1 = (X.C500370Jjn) r1     // Catch: java.lang.Throwable -> L4f
            return r1
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.profile.CoHostOperationCell.LJIILJJIL(webcast.api.room.GetRoomProfileCardResponse$ResponseData, X.05Vn):java.lang.Object");
    }

    public final void LJJI(int i, long j) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.put("status_delay", i);
            jSONObject2.put("panel_cost", j);
            jSONObject3.put("status_delay", i);
            jSONObject3.put("panel_cost", j);
            jSONObject3.put("room_id", this.LLJJIJIL);
            jSONObject3.put("anchor_id", this.LL.LJII);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1CC2.LJ("ttlive_client_previewcard_linkmicstatus_delay", jSONObject, jSONObject2, jSONObject3);
    }
}
