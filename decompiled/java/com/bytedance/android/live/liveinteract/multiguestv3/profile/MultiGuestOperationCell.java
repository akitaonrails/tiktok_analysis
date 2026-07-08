package com.bytedance.android.live.liveinteract.multiguestv3.profile;

import X.AbstractC495580Jc4;
import X.C01GW;
import X.C0KVU;
import X.C1125430fOP;
import X.C1161920gLG;
import X.C1304700k3Y;
import X.C16FS;
import X.C307001Gy;
import X.C418440Gaw;
import X.C489040JFu;
import X.C495640JcA;
import X.C495870JcX;
import X.C495920Jcc;
import X.C495980Jci;
import X.C496860Je8;
import X.C496890JeB;
import X.C497740JfY;
import X.C500260Jjc;
import X.C749960TbO;
import X.C766270U4b;
import X.C782110Um9;
import X.C784440Upu;
import X.C786410Ut5;
import X.C814420VxA;
import X.C915980Zwa;
import X.C917810ZzX;
import X.C922480a74;
import X.C925600aC6;
import X.C925630aC9;
import X.C927600aFK;
import X.C930540aK4;
import X.C947390alF;
import X.EnumC495590Jc5;
import X.EnumC495780JcO;
import X.EnumC495860JcW;
import X.EnumC496240Jd8;
import X.EnumC496870Je9;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC2183451Acp;
import X.InterfaceC495660JcC;
import X.InterfaceC495890JcZ;
import X.InterfaceC743640TFa;
import Y.ACListenerS142S0100000_7;
import Y.ACListenerS150S0100000_15;
import Y.AObserverS211S0100000_7;
import Y.AUListenerS1S0300002_7;
import Y.AfS143S0200000_7;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkAnchorOpenOrClickUserCardEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorCancelInviteGuestEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomModeratorCancelInviteGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.profile.MultiGuestOperationCell;
import com.bytedance.android.live.profile.service.ILiveProfileService;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestEnableMixModeSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileStyleOptimizeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.GetRoomProfileCardResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiGuestOperationCell extends AbstractC495580Jc4<Boolean> implements GenericLifecycleObserver {
    public User LLJI;
    public InterfaceC495660JcC LLJIJIL;
    public C16FS LLJILJIL;
    public C16FS LLJILJILJ;
    public ValueAnimator LLJILLL;
    public boolean LLJJ;
    public final DataChannel LLJJI;
    public final C01GW LLJJIII;
    public final int LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;
    public final int LLJJJ;
    public final EnumC495780JcO LLJJJIL;
    public final boolean LLJJJJ;
    public final Pair<Boolean, List<EnumC496240Jd8>> LLJJJJJIL;

    @Override // X.AbstractC495790JcP
    public final int LJ() {
        return R.layout.h2z;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        DataChannel dataChannel = this.LLJJI;
        if (dataChannel != null) {
            dataChannel.FQ2(MultiGuestOperationCellDismissEvent.class);
        }
        ValueAnimator valueAnimator = this.LLJILLL;
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
        this.LLJILJIL = c16fs;
        if (c16fs != null) {
            c16fs.setEnabled(true);
            c16fs.j0(LJIJI());
            if (LiveProfileStyleOptimizeSetting.INSTANCE.isNewStyleEnable()) {
                c16fs.setIconAttr(R.attr.e16);
            } else {
                c16fs.setIcon(R.drawable.feo);
            }
            c16fs.setText((CharSequence) null);
        }
        View view2 = this.LLILLL;
        C16FS c16fs2 = view2 != null ? (C16FS) view2.findViewById(R.id.b_2) : null;
        this.LLJILJILJ = c16fs2;
        if (c16fs2 != null) {
            c16fs2.j0(LJIJI());
        }
        if (LiveProfileStyleOptimizeSetting.INSTANCE.isNewStyleEnable()) {
            int i = this.LLILZIL;
            int i2 = this.LLIZLLLIL;
            int i3 = this.LLILZLL;
            int i4 = this.LLIZ;
            this.LLJJIJIL = (((i - (i2 * 2)) - i3) - i4) / i4;
            this.LLJJIJIIJIL = (((i - (i2 * 2)) - (i3 * 2)) - (i4 * 2)) / i4;
        }
    }

    public final C16FS LJIJ() {
        return (C16FS) this.LLJJIII.getValue();
    }

    public final int LJIJI() {
        return LiveProfileStyleOptimizeSetting.INSTANCE.isNewStyleEnable() ? R.style.ak5 : R.style.ak4;
    }

    public final void LJIJJ() {
        C922480a74.LIZ(this.LLJJI, null);
        LJJ("click");
        if (!C496890JeB.LIZ(C930540aK4.LIZJ())) {
            User user = this.LLJI;
            if (user == null) {
                user = null;
            }
            if (user.getSecret() != 1) {
                C495980Jci c495980Jci = this.LL;
                C947390alF.LIZ(c495980Jci.LIZ, c495980Jci.LIZIZ, this.LLJJI, C496860Je8.LIZ, AFwS193S0000000_7.get$arr$(224), new AwS559S0100000_15(this, 390));
                return;
            } else {
                Object[] objArr = new Object[1];
                User user2 = this.LLJI;
                objArr[0] = C0KVU.LIZ(user2 != null ? user2 : null);
                C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131842744, objArr));
                return;
            }
        }
        C766270U4b.LIZLLL(2131842763);
        if (((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJII() == 0) {
            try {
                C1304700k3Y c1304700k3Y = C1304700k3Y.LIZ;
                HashMap map = new HashMap();
                C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                C307001Gy.LIZ().getClass();
                map.put("maxLinkNum", String.valueOf(C927600aFK.LJIIL()));
                map.put("LinkMicSession is null", String.valueOf(C915980Zwa.LJIIIIZZ().LLJLL() != null));
                c1304700k3Y.LJII(30002, "ReachedMaxLinkNum but linkedGuestNum = 0 ", null, map);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final boolean LJIJJLI() {
        User user = this.LLJI;
        if (user == null) {
            user = null;
        }
        EnumC496870Je9 enumC496870Je9LIZIZ = C496890JeB.LIZIZ(user, this.LL.LJ);
        if (enumC496870Je9LIZIZ != EnumC496870Je9.GRAYED) {
            if (enumC496870Je9LIZIZ == EnumC496870Je9.GONE) {
                return false;
            }
            if (!C496890JeB.LIZ(C930540aK4.LIZJ())) {
                User user2 = this.LLJI;
                if ((user2 != null ? user2 : null).getSecret() != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIL() {
        /*
            r9 = this;
            boolean r0 = r9.LLJJ
            r8 = 1
            if (r0 == 0) goto L2e
            com.bytedance.android.live.base.model.user.User r0 = r9.LLJI
            r7 = 0
            if (r0 != 0) goto Lb
            r0 = r7
        Lb:
            boolean r0 = X.C495640JcA.LIZ(r0)
            if (r0 != 0) goto L2e
            X.0Jci r0 = r9.LL
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.LJFF
            long r3 = r0.liveSubOnly
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L2f
            com.bytedance.android.live.base.model.user.User r0 = r9.LLJI
            if (r0 != 0) goto L22
            r0 = r7
        L22:
            com.bytedance.android.live.base.model.user.SubscribeInfo r0 = r0.getSubscribeInfo()
            if (r0 == 0) goto L2f
            boolean r0 = r0.isSubscribed()
            if (r0 != 0) goto L2f
        L2e:
            return r8
        L2f:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r9.LLJJI
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.IsLiveStudioMonitorChannel> r0 = com.bytedance.android.livesdk.dataChannel.IsLiveStudioMonitorChannel.class
            java.lang.Object r1 = r1.gg0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L2e
            com.bytedance.android.live.base.model.user.User r0 = r9.LLJI
            if (r0 == 0) goto L44
            r7 = r0
        L44:
            java.lang.Class<com.bytedance.android.live.liveinteract.api.IInteractService> r0 = com.bytedance.android.live.liveinteract.api.IInteractService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.liveinteract.api.IInteractService r0 = (com.bytedance.android.live.liveinteract.api.IInteractService) r0
            java.util.List r1 = r0.nr2()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L5c
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L5c
        L5a:
            r8 = 0
            return r8
        L5c:
            java.util.Iterator r6 = r1.iterator()
        L60:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r5 = r6.next()
            X.0a8W r5 = (X.C923380a8W) r5
            long r3 = r5.LIZ
            long r1 = r7.getId()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L60
            java.lang.Long r1 = r5.LIZJ
            X.0Jci r0 = r9.LL
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.LJFF
            long r3 = r0.getId()
            if (r1 == 0) goto L2e
            long r1 = r1.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L60
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.profile.MultiGuestOperationCell.LJIL():boolean");
    }

    @Override // X.InterfaceC495840JcU
    public final void cC() {
        ViewGroup viewGroup;
        if (this.LLJIJIL != null) {
            View view = this.LLILLL;
            if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
                return;
            }
            C786410Ut5.LJJJLZIJ(LJIJ(), viewGroup);
        }
    }

    @Override // X.AbstractC495790JcP
    public final EnumC495780JcO LIZLLL() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC495790JcP
    public final boolean LJFF() {
        return this.LLJJJJ;
    }

    @Override // X.AbstractC495790JcP
    public final Pair<Boolean, List<EnumC496240Jd8>> LJI() {
        return this.LLJJJJJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiGuestOperationCell(X.C495920Jcc r4) {
        /*
            r3 = this;
            r3.<init>(r4)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.LJIIJJI
            r3.LLJJI = r0
            kotlin.jvm.internal.AwS551S0100000_7 r1 = new kotlin.jvm.internal.AwS551S0100000_7
            r0 = 4
            r1.<init>(r3, r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r1)
            r3.LLJJIII = r0
            android.content.Context r1 = r4.LIZ
            r0 = 2131106062(0x7f06190e, float:1.7824664E38)
            int r0 = X.C20736316Cj.LJ(r0, r1)
            r3.LLJJIJI = r0
            r0 = 1082130432(0x40800000, float:4.0)
            r3.LLJJIJIIJIL = r0
            r0 = 1084647014(0x40a66666, float:5.2)
            r3.LLJJIJIL = r0
            r0 = 2131887807(0x7f1206bf, float:1.9410232E38)
            r3.LLJJJ = r0
            androidx.lifecycle.LifecycleOwner r0 = r4.LIZIZ
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            r0.addObserver(r3)
            X.0JcO r0 = X.EnumC495780JcO.MULTI_GUEST_OPERATION
            r3.LLJJJIL = r0
            X.0Jcf r1 = r4.LIZJ
            boolean r0 = r1.LJI
            if (r0 != 0) goto L51
            boolean r0 = r1.LIZLLL
            if (r0 != 0) goto L70
            java.lang.Class<com.bytedance.android.live.liveinteract.api.IInteractService> r0 = com.bytedance.android.live.liveinteract.api.IInteractService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.liveinteract.api.IInteractService r0 = (com.bytedance.android.live.liveinteract.api.IInteractService) r0
            boolean r0 = r0.Zf()
            if (r0 == 0) goto L70
        L51:
            com.bytedance.android.livesdk.event.UserProfileEvent r1 = r4.LJIIIIZZ
            boolean r0 = r1.linkInRoomEnable
            if (r0 == 0) goto L70
            X.0Jcf r0 = r4.LIZJ
            boolean r0 = r0.LJII
            if (r0 != 0) goto L70
            boolean r0 = r1.coHostEnable
            if (r0 != 0) goto L70
            r0 = 1
        L62:
            r3.LLJJJJ = r0
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.13BV r0 = X.C13BV.INSTANCE
            r2.<init>(r1, r0)
            r3.LLJJJJJIL = r2
            return
        L70:
            r0 = 0
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.profile.MultiGuestOperationCell.<init>(X.0Jcc):void");
    }

    public final void LJIIZILJ(final boolean z) {
        this.LL.LIZLLL.dismiss();
        C495980Jci c495980Jci = this.LL;
        final Room room = c495980Jci.LJFF;
        C782110Um9 c782110Um9 = new C782110Um9(c495980Jci.LIZ);
        c782110Um9.LJIIZILJ(2131843354);
        c782110Um9.LJIILIIL(2131843356, new InterfaceC743640TFa() { // from class: X.0JeE
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
                new C927240aEk("cancelInviteAlert", "cancelBtn").LIZ();
                User user = null;
                if (z) {
                    MultiGuestOperationCell multiGuestOperationCell = this;
                    DataChannel dataChannel = multiGuestOperationCell.LLJJI;
                    User user2 = multiGuestOperationCell.LLJI;
                    if (user2 == null) {
                        user2 = null;
                    }
                    dataChannel.LC0(LinkInRoomModeratorCancelInviteGuestEvent.class, new C918510a0f(user2, room.getId(), "user_profile", 3));
                } else {
                    MultiGuestOperationCell multiGuestOperationCell2 = this;
                    DataChannel dataChannel2 = multiGuestOperationCell2.LLJJI;
                    User user3 = multiGuestOperationCell2.LLJI;
                    if (user3 == null) {
                        user3 = null;
                    }
                    dataChannel2.LC0(LinkInRoomAnchorCancelInviteGuestEvent.class, new C918480a0c(user3, room.getId(), "user_profile", 3, null, 224));
                }
                long ownerUserId = room.getOwnerUserId();
                User user4 = this.LLJI;
                if (user4 != null) {
                    user = user4;
                }
                long id = user.getId();
                long id2 = room.getId();
                boolean z2 = z;
                C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                C307001Gy.LIZ().getClass();
                C925600aC6.LJIIJJI(ownerUserId, id, id2, z2, true, C927600aFK.LJII());
            }
        });
        c782110Um9.LJIIJ(2131843353, new InterfaceC743640TFa() { // from class: X.0Je7
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        C786410Ut5.E4(c782110Um9.LIZ());
        long ownerUserId = room.getOwnerUserId();
        User user = this.LLJI;
        if (user == null) {
            user = null;
        }
        long id = user.getId();
        long id2 = room.getId();
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        C925600aC6.LJIIJJI(ownerUserId, id, id2, z, false, C927600aFK.LJII());
    }

    public final void LJJ(String str) {
        boolean z;
        boolean z2;
        String str2;
        C16FS c16fs;
        User user = this.LLJI;
        User user2 = null;
        if (user == null) {
            user = null;
        }
        EnumC496870Je9 enumC496870Je9LIZIZ = C496890JeB.LIZIZ(user, this.LL.LJ);
        C16FS c16fs2 = this.LLJILJIL;
        if (c16fs2 != null && c16fs2.getVisibility() == 0 && enumC496870Je9LIZIZ != EnumC496870Je9.DISCONNECTED) {
            User user3 = this.LLJI;
            if (user3 == null) {
                user3 = null;
            }
            long id = user3.getId();
            boolean z3 = this.LLJJ;
            User user4 = this.LLJI;
            if (user4 == null) {
                user4 = null;
            }
            FollowInfo followInfo = user4.getFollowInfo();
            if (followInfo != null && (followInfo.getFollowStatus() == 2 || followInfo.getFollowStatus() == 3)) {
                z = true;
            } else {
                z = false;
            }
            User user5 = this.LLJI;
            if (user5 != null) {
                user2 = user5;
            }
            FollowInfo followInfo2 = user2.getFollowInfo();
            if (followInfo2 != null && (followInfo2.getFollowStatus() == 2 || followInfo2.getFollowStatus() == 1)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (LJIJJLI() && (c16fs = this.LLJILJIL) != null && c16fs.getVisibility() == 0) {
                str2 = "abnormal";
            } else {
                str2 = "normal";
            }
            this.LLJJI.LC0(LinkAnchorOpenOrClickUserCardEvent.class, new C925630aC9(z3, id, z, str, str2, z2));
        }
    }

    public final void LJJI(boolean z) {
        boolean z2;
        ViewGroup.LayoutParams layoutParams;
        User user;
        EnumC495590Jc5 enumC495590Jc5;
        ValueAnimator valueAnimatorOfFloat;
        C16FS c16fs;
        C16FS c16fs2;
        User user2 = this.LLJI;
        User user3 = null;
        if (user2 == null) {
            user2 = null;
        }
        EnumC496870Je9 enumC496870Je9LIZIZ = C496890JeB.LIZIZ(user2, this.LL.LJ);
        C16FS c16fs3 = this.LLJILJIL;
        if (c16fs3 != null) {
            C786410Ut5.LLJJJ(c16fs3, 0);
        }
        C16FS c16fs4 = this.LLJILJIL;
        if (c16fs4 != null) {
            c16fs4.setEnabled(true);
        }
        LiveProfileStyleOptimizeSetting liveProfileStyleOptimizeSetting = LiveProfileStyleOptimizeSetting.INSTANCE;
        if (liveProfileStyleOptimizeSetting.isNewStyleEnable() && (c16fs2 = this.LLJILJIL) != null) {
            C786410Ut5.j5(c16fs2, 1.0f);
        }
        if (LJIL()) {
            C16FS c16fs5 = this.LLJILJIL;
            if (c16fs5 != null) {
                C786410Ut5.LLJJJ(c16fs5, 8);
            }
        } else if (enumC496870Je9LIZIZ == EnumC496870Je9.DISCONNECTED) {
            C16FS c16fs6 = this.LLJILJIL;
            if (c16fs6 != null) {
                c16fs6.setText(2131843832);
            }
            C16FS c16fs7 = this.LLJILJIL;
            if (c16fs7 != null) {
                c16fs7.setIcon(this.LLJJIJI);
            }
            C16FS c16fs8 = this.LLJILJIL;
            if (c16fs8 != null) {
                c16fs8.j0(LJIJI());
            }
            C16FS c16fs9 = this.LLJILJIL;
            if (c16fs9 != null) {
                C495870JcX c495870JcX = InterfaceC495890JcZ.LJJLL;
                ACListenerS150S0100000_15 aCListenerS150S0100000_15 = new ACListenerS150S0100000_15(this, 153);
                C495980Jci c495980Jci = this.LL;
                EnumC495860JcW enumC495860JcW = EnumC495860JcW.OPERATION;
                c495870JcX.getClass();
                C495870JcX.LIZIZ(c16fs9, aCListenerS150S0100000_15, false, c495980Jci, enumC495860JcW, "disconnect_guest", null);
            }
        } else {
            int i = 2131843400;
            if (LJIJJLI()) {
                if (liveProfileStyleOptimizeSetting.isNewStyleEnable()) {
                    C16FS c16fs10 = this.LLJILJIL;
                    if (c16fs10 != null) {
                        c16fs10.j0(LJIJI());
                    }
                    C16FS c16fs11 = this.LLJILJIL;
                    if (c16fs11 != null) {
                        C786410Ut5.j5(c16fs11, 0.6f);
                    }
                } else {
                    C16FS c16fs12 = this.LLJILJIL;
                    if (c16fs12 != null) {
                        c16fs12.j0(this.LLJJJ);
                    }
                }
                C16FS c16fs13 = this.LLJILJIL;
                if (c16fs13 != null) {
                    c16fs13.setText(2131843400);
                }
                C16FS c16fs14 = this.LLJILJIL;
                if (c16fs14 != null) {
                    C495870JcX c495870JcX2 = InterfaceC495890JcZ.LJJLL;
                    ACListenerS150S0100000_15 aCListenerS150S0100000_152 = new ACListenerS150S0100000_15(this, 154);
                    C495980Jci c495980Jci2 = this.LL;
                    EnumC495860JcW enumC495860JcW2 = EnumC495860JcW.OPERATION;
                    c495870JcX2.getClass();
                    C495870JcX.LIZIZ(c16fs14, aCListenerS150S0100000_152, false, c495980Jci2, enumC495860JcW2, "unable_invite_guest", null);
                }
            } else if (enumC496870Je9LIZIZ == EnumC496870Je9.ACTIVE) {
                C16FS c16fs15 = this.LLJILJIL;
                if (c16fs15 != null) {
                    User user4 = this.LLJI;
                    if (user4 == null) {
                        user4 = null;
                    }
                    if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).vL1().contains(Long.valueOf(user4.getId()))) {
                        i = 2131852874;
                    }
                    c16fs15.setText(i);
                }
                if (liveProfileStyleOptimizeSetting.isNewStyleEnable()) {
                    C16FS c16fs16 = this.LLJILJIL;
                    if (c16fs16 != null) {
                        c16fs16.setIconAttr(R.attr.e16);
                    }
                } else {
                    C16FS c16fs17 = this.LLJILJIL;
                    if (c16fs17 != null) {
                        c16fs17.setIcon(R.drawable.feo);
                    }
                }
                C16FS c16fs18 = this.LLJILJIL;
                if (c16fs18 != null) {
                    c16fs18.j0(LJIJI());
                }
                C16FS c16fs19 = this.LLJILJIL;
                if (c16fs19 != null) {
                    C495870JcX c495870JcX3 = InterfaceC495890JcZ.LJJLL;
                    ACListenerS142S0100000_7 aCListenerS142S0100000_7 = new ACListenerS142S0100000_7(this, 3);
                    C495980Jci c495980Jci3 = this.LL;
                    EnumC495860JcW enumC495860JcW3 = EnumC495860JcW.OPERATION;
                    c495870JcX3.getClass();
                    C495870JcX.LIZIZ(c16fs19, aCListenerS142S0100000_7, false, c495980Jci3, enumC495860JcW3, "invite_guest", null);
                }
            } else if (LiveSdkMultiGuestEnableMixModeSetting.isEnable() && C917810ZzX.LJIIJ()) {
                C16FS c16fs20 = this.LLJILJIL;
                if (c16fs20 != null) {
                    C786410Ut5.LLJJJ(c16fs20, 0);
                }
            } else {
                C16FS c16fs21 = this.LLJILJIL;
                if (c16fs21 != null) {
                    C786410Ut5.LLJJJ(c16fs21, 8);
                }
            }
        }
        User user5 = this.LLJI;
        if (user5 == null) {
            user5 = null;
        }
        if (!user5.isBlock && user5.isFollowing()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && (c16fs = this.LLJILJIL) != null) {
            c16fs.setText("");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) LJIJ().getLayoutParams();
        C16FS c16fs22 = this.LLJILJIL;
        if (c16fs22 != null) {
            layoutParams = c16fs22.getLayoutParams();
        } else {
            layoutParams = null;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
        C16FS c16fs23 = this.LLJILJIL;
        if (c16fs23 != null && c16fs23.getVisibility() == 0) {
            float f = this.LLJJIJIIJIL;
            float f2 = ((f - 1.0f) / 6) + 1.0f;
            ValueAnimator valueAnimator = this.LLJILLL;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.removeAllListeners();
                valueAnimator.cancel();
            }
            if (z) {
                valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, f);
                valueAnimatorOfFloat.setDuration(300L);
                valueAnimatorOfFloat.setInterpolator(new C1125430fOP());
            } else {
                valueAnimatorOfFloat = null;
            }
            this.LLJILLL = valueAnimatorOfFloat;
            User user6 = this.LLJI;
            if (user6 == null) {
                user6 = null;
            }
            if (!user6.isBlock && user6.isFollowing()) {
                if (z && layoutParams2.weight != 1.0f) {
                    ValueAnimator valueAnimator2 = this.LLJILLL;
                    if (valueAnimator2 != null) {
                        valueAnimator2.addUpdateListener(new AUListenerS1S0300002_7(f2, f, layoutParams3, layoutParams2, this, 0));
                    }
                    ValueAnimator valueAnimator3 = this.LLJILLL;
                    if (valueAnimator3 != null) {
                        valueAnimator3.start();
                    }
                } else {
                    layoutParams3.weight = f;
                    C16FS c16fs24 = this.LLJILJIL;
                    if (c16fs24 != null) {
                        C786410Ut5.x6(c16fs24, layoutParams3);
                    }
                    layoutParams2.weight = 1.0f;
                    C786410Ut5.x6(LJIJ(), layoutParams2);
                }
                C16FS c16fsLJIJ = LJIJ();
                if ((c16fsLJIJ instanceof C16FS) && c16fsLJIJ != null) {
                    c16fsLJIJ.setText("");
                }
            } else if (z && layoutParams2.weight != f) {
                ValueAnimator valueAnimator4 = this.LLJILLL;
                if (valueAnimator4 != null) {
                    valueAnimator4.addUpdateListener(new AUListenerS1S0300002_7(f2, f, layoutParams3, layoutParams2, this, 1));
                }
                ValueAnimator valueAnimator5 = this.LLJILLL;
                if (valueAnimator5 != null) {
                    valueAnimator5.start();
                }
            } else {
                layoutParams3.weight = 1.0f;
                C16FS c16fs25 = this.LLJILJIL;
                if (c16fs25 != null) {
                    C786410Ut5.x6(c16fs25, layoutParams3);
                }
                C16FS c16fs26 = this.LLJILJIL;
                if (c16fs26 != null && c16fs26.getVisibility() == 0) {
                    layoutParams2.weight = f;
                } else {
                    layoutParams2.weight = this.LLJJIJIL;
                }
                C786410Ut5.x6(LJIJ(), layoutParams2);
            }
        } else {
            layoutParams2.weight = this.LLJJIJIL;
            C786410Ut5.x6(LJIJ(), layoutParams2);
        }
        MutableLiveData<List<EnumC495590Jc5>> mutableLiveData = this.LLJ;
        ArrayList arrayList = new ArrayList();
        arrayList.add(EnumC495590Jc5.AT_REPLY);
        User user7 = this.LLJI;
        if (user7 == null) {
            user = null;
        } else {
            user = user7;
        }
        if (user.isBlock) {
            enumC495590Jc5 = EnumC495590Jc5.UNBLOCK;
        } else {
            if (user7 == null) {
                user7 = null;
            }
            if (user7.isFollowing()) {
                enumC495590Jc5 = EnumC495590Jc5.UNFOLLOW;
            } else {
                enumC495590Jc5 = EnumC495590Jc5.FOLLOW;
            }
        }
        arrayList.add(enumC495590Jc5);
        User user8 = this.LLJI;
        if (user8 != null) {
            user3 = user8;
        }
        EnumC496870Je9 enumC496870Je9LIZIZ2 = C496890JeB.LIZIZ(user3, this.LL.LJ);
        if (!LJIL()) {
            if (enumC496870Je9LIZIZ2 == EnumC496870Je9.DISCONNECTED) {
                arrayList.add(EnumC495590Jc5.DISCONNECT_GUEST);
            } else if (LJIJJLI()) {
                arrayList.add(EnumC495590Jc5.UNABLE_INVITE_GUEST);
            } else if (enumC496870Je9LIZIZ2 == EnumC496870Je9.ACTIVE) {
                arrayList.add(EnumC495590Jc5.INVITE_GUEST);
            }
        }
        mutableLiveData.setValue(arrayList);
        LJJ("show");
    }

    @Override // X.AbstractC495790JcP
    public final boolean LJIIIZ(User user, Object obj) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        this.LLJI = user;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams.setMarginStart((int) C497740JfY.LIZIZ(8.0f));
        layoutParams.leftMargin = layoutParams.getMarginStart();
        layoutParams.setMarginEnd((int) C497740JfY.LIZIZ(16.0f));
        layoutParams.rightMargin = layoutParams.getMarginEnd();
        C489040JFu c489040JFuLj2 = ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).Lj2((C495920Jcc) this.LL, user);
        this.LLJIJIL = c489040JFuLj2;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (c489040JFuLj2 == null) {
            c489040JFuLj2 = null;
        }
        c489040JFuLj2.LIZ(-1, layoutParams, (ViewGroup) this.LLILLL);
        InterfaceC495660JcC interfaceC495660JcC = this.LLJIJIL;
        if (interfaceC495660JcC == null) {
            interfaceC495660JcC = null;
        }
        interfaceC495660JcC.getFollowStatus().observe(this.LL.LIZIZ, new AObserverS211S0100000_7(this, 34));
        this.LLJJ = Intrinsics.LJFF(obj, Boolean.TRUE);
        LJJI(false);
        if (C495640JcA.LIZ(user)) {
            C500260Jjc.LJIILIIL(this.LLJILJILJ);
        } else {
            C500260Jjc.LLFFF(this.LLJILJILJ);
        }
        C16FS c16fs = this.LLJILJILJ;
        if (c16fs != null) {
            C495870JcX c495870JcX = InterfaceC495890JcZ.LJJLL;
            ACListenerS142S0100000_7 aCListenerS142S0100000_7 = new ACListenerS142S0100000_7(this, 172);
            C495980Jci c495980Jci = this.LL;
            EnumC495860JcW enumC495860JcW = EnumC495860JcW.OPERATION;
            c495870JcX.getClass();
            C495870JcX.LIZIZ(c16fs, aCListenerS142S0100000_7, false, c495980Jci, enumC495860JcW, "at_reply", null);
        }
        C16FS c16fs2 = this.LLJILJIL;
        if (c16fs2 == null || c16fs2.getVisibility() != 0) {
            C16FS c16fs3 = this.LLJILJILJ;
            if (c16fs3 != null) {
                layoutParams2 = c16fs3.getLayoutParams();
            }
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                marginLayoutParams.leftMargin = marginLayoutParams.getMarginStart();
            }
        }
        C784440Upu.LIZ().LIZJ(this.LL.LIZIZ, C749960TbO.class).LIZJ(new AfS143S0200000_7((Object) this, (EmoteModel) user, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 15));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    @Override // X.AbstractC495790JcP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(webcast.api.room.GetRoomProfileCardResponse.ResponseData r18, X.InterfaceC1364105Vn<? super java.lang.Boolean> r19) {
        /*
            r17 = this;
            r5 = r19
            boolean r0 = r5 instanceof X.C496830Je5
            r1 = r17
            if (r0 == 0) goto L24
            r4 = r5
            X.0Je5 r4 = (X.C496830Je5) r4
            int r3 = r4.LLILLL
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L24
            int r3 = r3 - r2
            r4.LLILLL = r3
        L16:
            java.lang.Object r5 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L2a
            goto L82
        L24:
            X.0Je5 r4 = new X.0Je5
            r4.<init>(r1, r5)
            goto L16
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r5)
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostAppContext> r0 = com.bytedance.android.livesdkapi.host.IHostAppContext.class
            X.006A r6 = X.C1161920gLG.LIZJ(r0)     // Catch: java.lang.Throwable -> L9b
            com.bytedance.android.livesdkapi.host.IHostAppContext r6 = (com.bytedance.android.livesdkapi.host.IHostAppContext) r6     // Catch: java.lang.Throwable -> L9b
            X.0Ism r5 = X.C480460Ism.LIZ()     // Catch: java.lang.Throwable -> L9b
            java.lang.Class<com.bytedance.android.livesdk.chatroom.api.LinkApi> r0 = com.bytedance.android.livesdk.chatroom.api.LinkApi.class
            r5.getClass()     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r7 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Throwable -> L9b
            com.bytedance.android.livesdk.chatroom.api.LinkApi r7 = (com.bytedance.android.livesdk.chatroom.api.LinkApi) r7     // Catch: java.lang.Throwable -> L9b
            X.0Jci r0 = r1.LL     // Catch: java.lang.Throwable -> L9b
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.LJFF     // Catch: java.lang.Throwable -> L9b
            long r8 = r0.getId()     // Catch: java.lang.Throwable -> L9b
            int r0 = r6.appId()     // Catch: java.lang.Throwable -> L9b
            long r10 = (long) r0     // Catch: java.lang.Throwable -> L9b
            int r0 = r6.liveId()     // Catch: java.lang.Throwable -> L9b
            long r12 = (long) r0     // Catch: java.lang.Throwable -> L9b
            X.0Jci r0 = r1.LL     // Catch: java.lang.Throwable -> L9b
            long r14 = r0.LJII     // Catch: java.lang.Throwable -> L9b
            X.0Jcf r0 = r0.LIZJ     // Catch: java.lang.Throwable -> L9b
            boolean r0 = r0.LJI     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L6b
            r16 = 1
            goto L6d
        L6b:
            r16 = 2
        L6d:
            X.11Kz r1 = r7.checkOthersPermission(r8, r10, r12, r14, r16)     // Catch: java.lang.Throwable -> L9b
            X.11RO r0 = X.C11S5.LIZ()     // Catch: java.lang.Throwable -> L9b
            X.11Ks r0 = r1.LJJIJIIJI(r0)     // Catch: java.lang.Throwable -> L9b
            r4.LLILLL = r3     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r5 = X.C500260Jjc.LJJJJLI(r0, r4)     // Catch: java.lang.Throwable -> L9b
            if (r5 != r2) goto L85
            return r2
        L82:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L9b
        L85:
            com.bytedance.android.live.liveinteract.multilive.model.HostCheckOtherAudienceMultiGuestPermissionResponse r5 = (com.bytedance.android.live.liveinteract.multilive.model.HostCheckOtherAudienceMultiGuestPermissionResponse) r5     // Catch: java.lang.Throwable -> L9b
            com.bytedance.android.live.liveinteract.multilive.model.HostCheckOtherAudienceMultiGuestPermissionResponse$ResponseData r0 = r5.data     // Catch: java.lang.Throwable -> L9b
            r4 = 0
            if (r0 == 0) goto L94
            com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo r0 = r0.otherPermissionInfo     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L94
            long r1 = r0.errCode     // Catch: java.lang.Throwable -> L9b
            goto L96
        L94:
            r1 = 0
        L96:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L9f
            goto La0
        L9b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L9f:
            r3 = 0
        La0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.profile.MultiGuestOperationCell.LJIILJJIL(webcast.api.room.GetRoomProfileCardResponse$ResponseData, X.05Vn):java.lang.Object");
    }

    @Override // X.AbstractC495790JcP
    public final Object LJIILL(GetRoomProfileCardResponse.ResponseData responseData, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return LJIILJJIL(responseData, interfaceC1364105Vn);
    }
}
