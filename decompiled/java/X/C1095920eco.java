package X;

import Y.ARunnableS117S0100000_17;
import Y.AfS1S1200100_12;
import Y.AfS43S1200000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.LiveMainFrameworkUpdateTopOneLineCheckLogReportSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubAnchorEntranceGuidePageSettings;
import com.bytedance.android.livesdk.livesetting.level.FansClubCustomizeCapsuleSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubPanelV2Settings;
import com.bytedance.android.livesdk.livesetting.level.FansClubSuperFanEmoteCapsuleSetting;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.revenue.level.api.event.EntranceCommonGuideEvent;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubEvent;
import com.bytedance.android.livesdk.revenue.level.api.event.NewSuperFansEvent;
import com.bytedance.android.livesdk.revenue.level.api.event.OpenFansClubEntranceView;
import com.bytedance.android.livesdk.revenue.level.api.event.SuperFansGuideEvent;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.watch.OrientationChangeEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS596S0100000_17;
import wh6.AbS698S0100000_17;

/* JADX INFO: renamed from: X.0eco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1095920eco extends C1095950ecr {
    public final ViewGroup LJIIL;
    public final InterfaceC1095350ebt LJIILIIL;
    public final LifecycleOwner LJIILJJIL;
    public final DataChannel LJIILL;
    public final ImageView LJIILLIIL;
    public final ImageView LJIIZILJ;
    public final C16F5 LJIJ;
    public final C16F5 LJIJI;
    public final C1295960jpS LJIJJ;
    public AnimatorSet LJIJJLI;
    public C1095940ecq LJIL;
    public boolean LJJ;
    public final C1096050ed1 LJJI = new C1096050ed1();
    public final C1092520eXK LJJIFFI = new C1092520eXK();
    public final C1095960ecs LJJII = new C1095960ecs(this);

    @Override // X.InterfaceC1096360edW
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1096360edW
    public final View LIZJ() {
        return null;
    }

    @Override // X.InterfaceC1096360edW
    public final int LJ() {
        return 0;
    }

    @Override // X.InterfaceC1096360edW
    public final void LJFF() {
    }

    @Override // X.InterfaceC1096360edW
    public final View LJI() {
        return null;
    }

    @Override // X.InterfaceC1096360edW
    public final View LJIIIIZZ() {
        return null;
    }

    @Override // X.InterfaceC1096360edW
    public final void LJIIIZ(boolean z) {
    }

    @Override // X.InterfaceC1096360edW
    public final int LJIIJ() {
        return 0;
    }

    @Override // X.C1095950ecr
    public final void LJIIJJI() {
        DataChannel dataChannel = this.LJIILL;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LJIILJJIL, FansClubEvent.class, new AwS596S0100000_17(this, 265));
        }
        DataChannel dataChannel2 = this.LJIILL;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this.LJIILJJIL, OpenFansClubEntranceView.class, new AwS596S0100000_17(this, 266));
        }
    }

    public final void LJIILLIIL() {
        Boolean bool;
        ViewGroup viewGroup = this.LJIIL;
        if (viewGroup != null) {
            DataChannel dataChannel = this.LJIILL;
            boolean zBooleanValue = (dataChannel == null || (bool = (Boolean) dataChannel.gg0(C0TZM.class)) == null) ? true : bool.booleanValue();
            C1092520eXK c1092520eXK = this.LJJIFFI;
            DataChannel dataChannel2 = this.LJIILL;
            String strLIZLLL = c1092520eXK.LIZLLL(dataChannel2 != null ? C500260Jjc.LJJLIIIJ(dataChannel2) : 0L);
            C1092520eXK c1092520eXK2 = this.LJJIFFI;
            DataChannel dataChannel3 = this.LJIILL;
            Map<String, String> mapLIZJ = c1092520eXK2.LIZJ(dataChannel3 != null ? C500260Jjc.LJJLIIIJ(dataChannel3) : 0L);
            C1095140ebY c1095140ebYUw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
            long j = c1095140ebYUw0 != null ? c1095140ebYUw0.LJII : 0L;
            if (!zBooleanValue) {
                DataChannel dataChannel4 = this.LJIILL;
                if (dataChannel4 != null) {
                    dataChannel4.FQ2(OrientationChangeEvent.class);
                }
                C11NZ.LJLJJLL(300L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS1S1200100_12(viewGroup, this, strLIZLLL, j, 0));
            } else if (!TextUtils.isEmpty(strLIZLLL)) {
                Context context = viewGroup.getContext();
                if (context != null) {
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, strLIZLLL);
                }
            } else if (j == 0) {
                LJIJ(viewGroup);
            } else {
                LJIIZILJ(viewGroup);
            }
            LJIILJJIL(this.LJIILL, true, true, this.LJI, "management_page", null, false, EnumC1095860eci.FANS_CLUB_ANIM_PLUS_TO_ONE_UNKOWN, null, this.LJIIIZ, this.LJIIJ, false, mapLIZJ);
            DataChannel dataChannel5 = this.LJIILL;
            if (LiveMainFrameworkUpdateTopOneLineCheckLogReportSetting.INSTANCE.enableReport()) {
                C235400vY.LIZ(dataChannel5, "livesdk_fans_club_entrance_click_frame_check");
            }
            C1092520eXK c1092520eXK3 = this.LJJIFFI;
            DataChannel dataChannel6 = this.LJIILL;
            long jLJJLIIIJ = dataChannel6 != null ? C500260Jjc.LJJLIIIJ(dataChannel6) : 0L;
            c1092520eXK3.getClass();
            C1092520eXK.LIZIZ(jLJJLIIIJ);
        }
    }

    public final void LJIJI() {
        C12ES.LJIILL(4, this.LJIIZILJ);
        C12ES.LJIILL(8, this.LJIJI);
        C12ES.LJIILL(0, this.LJIJ);
        C1095140ebY c1095140ebY = this.LIZLLL;
        LJIJJLI(c1095140ebY != null ? c1095140ebY.LJII : 0L);
    }

    @Override // X.C1095950ecr, X.InterfaceC1096360edW
    public final void onRelease() {
        ArrayList<Animator> childAnimations;
        C1295960jpS c1295960jpS = this.LJIJJ;
        if (c1295960jpS != null && c1295960jpS.isAnimating()) {
            C1295960jpS c1295960jpS2 = this.LJIJJ;
            if (c1295960jpS2 != null) {
                c1295960jpS2.cancelAnimation();
            }
            C1295960jpS c1295960jpS3 = this.LJIJJ;
            if (c1295960jpS3 != null) {
                c1295960jpS3.removeAllAnimatorListeners();
            }
        }
        AnimatorSet animatorSet = this.LJIJJLI;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LJIJJLI;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.LJIJJLI;
            if (animatorSet3 != null) {
                animatorSet3.removeAllListeners();
            }
        }
        AnimatorSet animatorSet4 = this.LJIJJLI;
        if (animatorSet4 != null && (childAnimations = animatorSet4.getChildAnimations()) != null) {
            Iterator<Animator> it2 = childAnimations.iterator();
            while (it2.hasNext()) {
                it2.next().removeAllListeners();
            }
        }
        this.LJIL = null;
        BPEAHandler bPEAHandler = C1085070eLJ.LIZ;
        bPEAHandler.removeMessages(9);
        bPEAHandler.removeMessages(10);
        bPEAHandler.removeMessages(13);
        this.LJJI.LIZ.clear();
        super.onRelease();
    }

    public static final void LJIIZILJ(View view) {
        Context context;
        if (view != null && (context = view.getContext()) != null) {
            C1094580eae.LIZ.getClass();
            C495520Jby c495520JbyLJIIJ = C1094580eae.LJIIJ("entrance", false);
            c495520JbyLJIIJ.LIZJ("direct_source_page", "entrance");
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(c495520JbyLJIIJ.LIZLLL()));
        }
    }

    @Override // X.InterfaceC1096360edW
    public final void LIZ(C1094740eau c1094740eau) {
        if (c1094740eau == null) {
            return;
        }
        LJIJJ(EnumC1095860eci.FANS_CLUB_ROOM_INFO_ANIM_GUIDE_TYPE, null, c1094740eau);
    }

    @Override // X.InterfaceC1096360edW
    public final void LJII(Object obj) {
        EnumC1096020ecy enumC1096020ecy;
        double dDoubleValue;
        long j;
        if (obj instanceof EnumC1096020ecy) {
            enumC1096020ecy = (EnumC1096020ecy) obj;
        } else {
            enumC1096020ecy = null;
        }
        if (this.LIZJ == enumC1096020ecy) {
            return;
        }
        InterfaceC1095350ebt interfaceC1095350ebt = this.LJIILIIL;
        if (interfaceC1095350ebt != null) {
            C1096340edU c1096340edU = (C1096340edU) interfaceC1095350ebt;
            if (enumC1096020ecy instanceof EnumC1096020ecy) {
                c1096340edU.LJIILL = enumC1096020ecy;
            }
        }
        this.LIZJ = enumC1096020ecy;
        if (enumC1096020ecy != null) {
            int i = C1095890ecl.LIZ[enumC1096020ecy.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    LJIJI();
                }
            } else {
                try {
                    Double dLIZ = InterfaceC1093910eZZ.LLLLLLLZIL.LIZ();
                    if (dLIZ != null) {
                        dDoubleValue = dLIZ.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (((int) dDoubleValue) <= 2) {
                    this.LJI = true;
                    C12ES.LJIILL(4, this.LJIILLIIL);
                    C12ES.LJIILL(0, this.LJIIZILJ);
                    C12ES.LJIILL(4, this.LJIJ);
                    C12ES.LJIILL(8, this.LJIJI);
                    C1095140ebY c1095140ebY = this.LIZLLL;
                    if (c1095140ebY != null) {
                        j = c1095140ebY.LJII;
                    } else {
                        j = 0;
                    }
                    LJIJJLI(j);
                    C786410Ut5.LJLIIL(this.LJII, this.LJ, new ARunnableS117S0100000_17(this, 135));
                } else {
                    LJIJI();
                    C786410Ut5.LJLIIL(this.LJII, this.LJ, new ARunnableS117S0100000_17(this, 136));
                }
            }
        }
        boolean z = !this.LIZIZ;
        LJIILJJIL(this.LJIILL, true, false, this.LJI, "management_page", null, false, EnumC1095860eci.FANS_CLUB_ANIM_PLUS_TO_ONE_UNKOWN, null, false, this.LJIIJ, false, null);
        if (z) {
            DataChannel dataChannel = this.LJIILL;
            if (LiveMainFrameworkUpdateTopOneLineCheckLogReportSetting.INSTANCE.enableReport()) {
                C235400vY.LIZ(dataChannel, "livesdk_fans_club_entrance_show_frame_check");
            }
        }
    }

    public final void LJIJ(View view) {
        String value;
        FansClubAnchorEntranceGuidePageSettings fansClubAnchorEntranceGuidePageSettings = FansClubAnchorEntranceGuidePageSettings.INSTANCE;
        if (TextUtils.isEmpty(fansClubAnchorEntranceGuidePageSettings.getValue())) {
            value = "aweme://roma_redirect/?roma_group_key=roma_schema_group_fans_level_main&roma_page_key=roma_schema_page_anchor_main";
        } else {
            value = fansClubAnchorEntranceGuidePageSettings.getValue();
        }
        C11NZ.LJLJJLL(300L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS43S1200000_17(this, value, view, 0));
    }

    public final void LJIJJLI(long j) {
        C16F5 c16f5 = this.LJIJ;
        if (c16f5 != null) {
            c16f5.setText(C1850730yGF.LIZJ(j).toUpperCase(Locale.ENGLISH));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x037f A[PHI: r10
      0x037f: PHI (r10v17 java.lang.String) = (r10v0 java.lang.String), (r10v24 java.lang.String), (r10v24 java.lang.String), (r10v24 java.lang.String) binds: [B:115:0x037c, B:80:0x0320, B:82:0x0324, B:84:0x0328] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0382 A[PHI: r1 r10
      0x0382: PHI (r1v36 boolean) = (r1v2 boolean), (r1v43 boolean), (r1v43 boolean), (r1v43 boolean) binds: [B:117:0x037f, B:87:0x032e, B:89:0x0332, B:91:0x0336] A[DONT_GENERATE, DONT_INLINE]
      0x0382: PHI (r10v18 java.lang.String) = (r10v17 java.lang.String), (r10v23 java.lang.String), (r10v23 java.lang.String), (r10v23 java.lang.String) binds: [B:117:0x037f, B:87:0x032e, B:89:0x0332, B:91:0x0336] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0386 A[PHI: r1 r6 r10
      0x0386: PHI (r1v37 boolean) = (r1v36 boolean), (r1v42 boolean), (r1v42 boolean), (r1v42 boolean) binds: [B:120:0x0383, B:94:0x033c, B:96:0x0340, B:98:0x0344] A[DONT_GENERATE, DONT_INLINE]
      0x0386: PHI (r6v5 int) = (r6v4 int), (r6v11 int), (r6v11 int), (r6v11 int) binds: [B:120:0x0383, B:94:0x033c, B:96:0x0340, B:98:0x0344] A[DONT_GENERATE, DONT_INLINE]
      0x0386: PHI (r10v19 java.lang.String) = (r10v18 java.lang.String), (r10v22 java.lang.String), (r10v22 java.lang.String), (r10v22 java.lang.String) binds: [B:120:0x0383, B:94:0x033c, B:96:0x0340, B:98:0x0344] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0602 A[PHI: r10
      0x0602: PHI (r10v9 boolean) = (r10v8 boolean), (r10v13 boolean), (r10v13 boolean), (r10v13 boolean) binds: [B:236:0x05fe, B:192:0x048e, B:194:0x0492, B:196:0x0496] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0607 A[PHI: r9 r10
      0x0607: PHI (r9v16 int) = (r9v15 int), (r9v20 int), (r9v20 int), (r9v20 int) binds: [B:239:0x0603, B:199:0x049c, B:201:0x04a0, B:203:0x04a4] A[DONT_GENERATE, DONT_INLINE]
      0x0607: PHI (r10v10 boolean) = (r10v9 boolean), (r10v12 boolean), (r10v12 boolean), (r10v12 boolean) binds: [B:239:0x0603, B:199:0x049c, B:201:0x04a0, B:203:0x04a4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(X.EnumC1095860eci r47, com.bytedance.android.livesdk.livesetting.level.GuidanceConfig r48, X.C1094740eau r49) {
        /*
            Method dump skipped, instruction units count: 1792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1095920eco.LJIJJ(X.0eci, com.bytedance.android.livesdk.livesetting.level.GuidanceConfig, X.0eau):void");
    }

    public C1095920eco(ViewGroup viewGroup, InterfaceC1095350ebt interfaceC1095350ebt, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        ImageView imageView;
        ImageView imageView2;
        C16F5 c16f5;
        C16F5 c16f52;
        C1295960jpS c1295960jpS;
        LinearLayout linearLayout;
        LiveIconView liveIconView;
        C16F5 c16f53;
        ImageView imageView3;
        LinearLayout linearLayout2;
        boolean z;
        Room roomLJJLIIIIJ;
        User owner;
        SubscribeInfo subscribeInfo;
        Boolean boolLIZ;
        Boolean boolLIZ2;
        int i;
        C1095140ebY c1095140ebYTL1;
        long j;
        this.LJIIL = viewGroup;
        this.LJIILIIL = interfaceC1095350ebt;
        this.LJIILJJIL = lifecycleOwner;
        this.LJIILL = dataChannel;
        this.LIZ = true;
        if (viewGroup != null) {
            imageView = (ImageView) viewGroup.findViewById(R.id.l8f);
        } else {
            imageView = null;
        }
        this.LJIILLIIL = imageView;
        if (viewGroup != null) {
            imageView2 = (ImageView) viewGroup.findViewById(R.id.lgm);
        } else {
            imageView2 = null;
        }
        this.LJIIZILJ = imageView2;
        if (viewGroup != null) {
            c16f5 = (C16F5) viewGroup.findViewById(R.id.z9n);
        } else {
            c16f5 = null;
        }
        this.LJIJ = c16f5;
        if (viewGroup != null) {
            c16f52 = (C16F5) viewGroup.findViewById(R.id.z9m);
        } else {
            c16f52 = null;
        }
        this.LJIJI = c16f52;
        if (viewGroup != null) {
            c1295960jpS = (C1295960jpS) viewGroup.findViewById(R.id.lgr);
        } else {
            c1295960jpS = null;
        }
        this.LJIJJ = c1295960jpS;
        if (viewGroup != null) {
            linearLayout = (LinearLayout) viewGroup.findViewById(R.id.wpo);
            liveIconView = (LiveIconView) viewGroup.findViewById(R.id.lwj);
            c16f53 = (C16F5) viewGroup.findViewById(R.id.lwi);
            imageView3 = (ImageView) viewGroup.findViewById(R.id.wpq);
            linearLayout2 = (LinearLayout) viewGroup.findViewById(R.id.ho5);
        } else {
            linearLayout = null;
            liveIconView = null;
            c16f53 = null;
            imageView3 = null;
            linearLayout2 = null;
        }
        if (interfaceC1095350ebt != null) {
            if (c16f52 != null) {
                c16f52.setBackgroundResource(R.drawable.dz1);
            }
            if (linearLayout != null) {
                linearLayout.setBackgroundResource(R.drawable.dz1);
            }
        }
        this.LJIL = new C1095940ecq(interfaceC1095350ebt, imageView2, imageView, c16f5, c16f52, linearLayout, liveIconView, c16f53, imageView3, c1295960jpS, linearLayout2, new C1095980ecu(this), this.LJ);
        if (dataChannel != null) {
            Room room = (Room) dataChannel.gg0(RoomChannel.class);
            if (room != null) {
                IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
                if (iFansClubService != null) {
                    c1095140ebYTL1 = iFansClubService.tL1(room.getOwner());
                } else {
                    c1095140ebYTL1 = null;
                }
                this.LIZLLL = c1095140ebYTL1;
                if (c1095140ebYTL1 != null) {
                    j = c1095140ebYTL1.LJII;
                } else {
                    j = 0;
                }
                this.LJIIIIZZ = j;
            }
            dataChannel.BQ2(lifecycleOwner, NewSuperFansEvent.class, new AwS596S0100000_17(this, 262));
            dataChannel.BQ2(lifecycleOwner, SuperFansGuideEvent.class, new AwS596S0100000_17(this, 263));
            dataChannel.BQ2(lifecycleOwner, EntranceCommonGuideEvent.class, new AwS596S0100000_17(this, 264));
        }
        if (viewGroup != null) {
            C786410Ut5.I7(new AbS698S0100000_17(this, 2), viewGroup);
        }
        if (c16f52 != null) {
            if (FansClubPanelV2Settings.INSTANCE.enableFansClubPanelV2()) {
                i = 2131852337;
            } else {
                i = 2131841656;
            }
            c16f52.setText(C497740JfY.LJIJI(i));
        }
        BPEAHandler bPEAHandler = C1085070eLJ.LIZ;
        if (!C1114730f79.LIZ() || !C500260Jjc.LJIIZILJ(dataChannel) || (((boolLIZ = InterfaceC1106030et7.W8.LIZ()) != null && boolLIZ.booleanValue() && (boolLIZ2 = InterfaceC1106030et7.X8.LIZ()) != null && boolLIZ2.booleanValue()) || C1085070eLJ.LIZ() >= FansClubCustomizeCapsuleSetting.INSTANCE.getValue().showMaxTimes)) {
            z = true;
        } else {
            C1094580eae.LIZ.getClass();
            z = true;
            C495520Jby c495520JbyLJIIJ = C1094580eae.LJIIJ("capsule", true);
            Message messageObtain = Message.obtain();
            messageObtain.what = 9;
            messageObtain.obj = new C07Z5(C500260Jjc.LJJLIIIJ(dataChannel), c495520JbyLJIIJ.LIZLLL());
            C786410Ut5.LJLJLJ(C1085070eLJ.LIZ, messageObtain, FansClubCustomizeCapsuleSetting.INSTANCE.getValue().detectionTime);
        }
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            FansClubSuperFanEmoteCapsuleSetting fansClubSuperFanEmoteCapsuleSetting = FansClubSuperFanEmoteCapsuleSetting.INSTANCE;
            if (fansClubSuperFanEmoteCapsuleSetting.getValue().showMaxTimes > 0 && dataChannel != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) != null && (owner = roomLJJLIIIIJ.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null && subscribeInfo.isAnchorQualified() == z) {
                Boolean boolLIZ3 = InterfaceC1106030et7.Y8.LIZ();
                boolean zBooleanValue = boolLIZ3 != null ? boolLIZ3.booleanValue() : false;
                int iLIZIZ = C1085070eLJ.LIZIZ();
                if (!zBooleanValue && iLIZIZ < fansClubSuperFanEmoteCapsuleSetting.getValue().showMaxTimes) {
                    C495520Jby c495520Jby = new C495520Jby("aweme://roma_redirect/?spark_page=anchor_emote_management&roma_group_key=spark_page_anchor_emote_management&roma_page_key=p&origin_source_page=capsule&source_page=capsule");
                    String strValueOf = String.valueOf(((IRankService) C1161920gLG.LIZJ(IRankService.class)).yy2());
                    Long lValueOf = dataChannel != null ? Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel)) : null;
                    c495520Jby.LIZJ("online_cnt", strValueOf);
                    c495520Jby.LIZJ("room_id", String.valueOf(lValueOf));
                    Message messageObtain2 = Message.obtain();
                    messageObtain2.what = 13;
                    messageObtain2.obj = new C07Z5(C500260Jjc.LJJLIIIJ(dataChannel), c495520Jby.LIZLLL());
                    C786410Ut5.LJLJLJ(C1085070eLJ.LIZ, messageObtain2, fansClubSuperFanEmoteCapsuleSetting.getValue().detectionTime);
                }
            }
        }
    }
}
