package X;

import Y.AcS81S0110000_15;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicApplyHangupSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTopLiveExitSnapshotScaleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestHangupP2EnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TopLiveExitAnimEnableConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TopLiveExitAnimSnapshotRefTypeSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tux.sheet.intro.TuxPanel;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS299S0000000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aVK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937520aVK {
    public static final C937520aVK LIZ = new C937520aVK();
    public static boolean LIZIZ;
    public static int LIZJ;
    public static boolean LIZLLL;
    public static Reference<Bitmap> LJ;
    public static Bitmap LJFF;
    public static long LJI;
    public static long LJII;
    public static int LJIIIIZZ;

    public static void LJIIIIZZ() {
        if (LIZJ != 0) {
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).updateSettingItem("live_inner_push", LIZJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LJFF() {
        Integer num;
        if (LinkMicApplyHangupSetting.isEnable()) {
            return C928400aGc.LIZJ() || ((num = (Integer) C924790aAn.LIZLLL().LIZIZ) != null && num.intValue() == 1);
        }
        return false;
    }

    public static final void LIZ(Bitmap bitmap) {
        LJII = 0L;
        LJI = SystemClock.uptimeMillis();
        if (TopLiveExitAnimSnapshotRefTypeSetting.INSTANCE.isStrongRef()) {
            LJ = null;
            LJFF = bitmap;
        } else if (TopLiveExitAnimSnapshotRefTypeSetting.isSoftRef()) {
            LJFF = null;
            LJ = new SoftReference(bitmap);
        } else {
            LJFF = null;
            LJ = new WeakReference(bitmap);
        }
    }

    public static final Bitmap LIZIZ(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int width = view.getWidth();
        int height = view.getHeight();
        if (width > 0 && height > 0) {
            float value = LiveTopLiveExitSnapshotScaleSetting.INSTANCE.getValue();
            int i = (int) (width * value);
            if (i > 0) {
                width = i;
            }
            int i2 = (int) (height * value);
            if (i2 <= 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("createScaledSnapshot error, targetWidth or targetHeight <= 0, targetWidth = ");
                sbLIZ.append(width);
                sbLIZ.append(", targetHeight = ");
                sbLIZ.append(i2);
                C20441214yg.LJ("MultiGuestMicHangupHelper", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, i2, Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.scale(value, value);
                try {
                    C842150X1x.LIZIZ(canvas, view);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("createScaledSnapshot cost = ");
                    sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    C20441214yg.LIZIZ("MultiGuestMicHangupHelper", C2188811AlT.LIZIZ(sbLIZ2));
                    return bitmapCreateBitmap;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C786410Ut5.LJJJJ(bitmapCreateBitmap);
                    C20441214yg.LJFF("MultiGuestMicHangupHelper", "createScaledSnapshot error", th);
                    return null;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C20441214yg.LJFF("MultiGuestMicHangupHelper", "createScaledSnapshot error", th2);
                return null;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("createScaledSnapshot error, width or height <= 0, width = ");
        sbLIZ3.append(width);
        sbLIZ3.append(", height = ");
        sbLIZ3.append(height);
        C20441214yg.LJ("MultiGuestMicHangupHelper", C2188811AlT.LIZIZ(sbLIZ3));
        return null;
    }

    public static void LIZJ(Bitmap bitmap) {
        Reference<Bitmap> reference;
        if ((bitmap != null || (bitmap = LJFF) != null || ((reference = LJ) != null && (bitmap = reference.get()) != null)) && !bitmap.isRecycled()) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        LJ = null;
        LJFF = null;
        LJI = 0L;
        LJII = 0L;
        LJIIIIZZ = 0;
    }

    public static void LIZLLL(int i, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_exit_anim_play_result");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "result");
        if (!C504670Jqj.LIZIZ(str)) {
            c474500IjALIZ.LJJII(str, "err_reason");
        }
        c474500IjALIZ.LIZ();
    }

    public static final boolean LJ(C465900IOu c465900IOu, C19EG c19eg) {
        String str;
        View viewFindViewById;
        EnterRoomLinkSession enterRoomLinkSessionLIZ;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomLinkSession enterRoomLinkSessionLIZ2;
        EnterRoomConfig enterRoomConfig2;
        EnterRoomConfig.RoomsData roomsData2;
        if (!MultiGuestHangupP2EnableSetting.isEnable()) {
            C20441214yg.LIZIZ("MultiGuestMicHangupHelper", "shouldPlayTopLiveHangoutExitAnim false, exit anim disabled");
            return false;
        }
        C0INV c0inv = C0IL2.LIZ;
        String str2 = null;
        if (c0inv != null && (enterRoomLinkSessionLIZ2 = c0inv.LIZ()) != null && (enterRoomConfig2 = enterRoomLinkSessionLIZ2.mEnterRoomConfig) != null && (roomsData2 = enterRoomConfig2.mRoomsData) != null) {
            str = roomsData2.enterFromMerge;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "live_merge")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("shouldPlayTopLiveHangoutExitAnim false, enterFromMerge = ");
            sbLIZ.append(str);
            C20441214yg.LJ("MultiGuestMicHangupHelper", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        if (c0inv != null && (enterRoomLinkSessionLIZ = c0inv.LIZ()) != null && (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
            str2 = roomsData.isFromMgTopLive;
        }
        boolean zLJFF = Intrinsics.LJFF(str2, "1");
        if ((c465900IOu != null && c465900IOu.LIZLLL) || zLJFF) {
            C20441214yg.LJ("MultiGuestMicHangupHelper", "shouldPlayTopLiveHangoutExitAnim false, event is from hangout internal room");
            return false;
        }
        if (c19eg != null && (viewFindViewById = c19eg.findViewById(R.id.content)) != null) {
            InterfaceC2183451Acp interfaceC2183451Acp = (InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class);
            if ((interfaceC2183451Acp != null && interfaceC2183451Acp.LIZLLL()) || LIZLLL) {
                int width = viewFindViewById.getWidth();
                int height = viewFindViewById.getHeight();
                if (width > 0 && height > 0 && viewFindViewById.isAttachedToWindow()) {
                    if (!TopLiveExitAnimEnableConfigSetting.isEnable()) {
                        C20441214yg.LIZIZ("MultiGuestMicHangupHelper", "shouldPlayTopLiveHangoutExitAnim failed, device score is low enough to play exit anim");
                        return false;
                    }
                    try {
                        Bitmap bitmapLIZIZ = LIZIZ(viewFindViewById);
                        if (bitmapLIZIZ == null) {
                            C20441214yg.LJ("MultiGuestMicHangupHelper", "shouldPlayTopLiveHangoutExitAnim false, createScaledSnapshot failed");
                            return false;
                        }
                        if (!bitmapLIZIZ.isRecycled()) {
                            LIZ(bitmapLIZIZ);
                            LJIIIIZZ = 1;
                            C20441214yg.LIZIZ("MultiGuestMicHangupHelper", "shouldPlayTopLiveHangoutExitAnim true, snapshot created and cached");
                            return true;
                        }
                        C20441214yg.LJ("MultiGuestMicHangupHelper", "shouldPlayTopLiveHangoutExitAnim false, snapshot is recycled");
                        return false;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C20441214yg.LJFF("MultiGuestMicHangupHelper", "shouldPlayTopLiveHangoutExitAnim false, hasApplyingRequest exception", th);
                        return false;
                    }
                }
                C20441214yg.LJ("MultiGuestMicHangupHelper", "shouldPlayTopLiveHangoutExitAnim false, invalid container size");
                return false;
            }
            C20441214yg.LJ("MultiGuestMicHangupHelper", "shouldPlayTopLiveHangoutExitAnim false, no pending apply request");
            return false;
        }
        C20441214yg.LJ("MultiGuestMicHangupHelper", "shouldPlayTopLiveHangoutExitAnim false, container is null");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJI(Context context, FragmentManager fragmentManager, InterfaceC927120aEY interfaceC927120aEY) {
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num != null && num.intValue() == 1 && C917810ZzX.LJIIJ()) {
            C20441214yg.LIZIZ("MultiGuestMicHangupHelper", "showConfirmDialog in waiting state, cohost-x-multi");
            LJII(context, interfaceC927120aEY, true);
            return;
        }
        int cachedSettingItemStatus = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getCachedSettingItemStatus("live_inner_push");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldShowIntroPanel innerPushStatus=");
        sbLIZ.append(cachedSettingItemStatus);
        C20441214yg.LIZIZ("MultiGuestMicHangupHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (LinkMicApplyHangupSetting.isEnable() && cachedSettingItemStatus == 0) {
            C20441214yg.LIZIZ("MultiGuestMicHangupHelper", "shouldShowIntroPanel");
            if (context != null && fragmentManager != null) {
                if (LIZIZ) {
                    C20441214yg.LJ("MultiGuestMicHangupHelper", "is already showing.");
                    return;
                }
                LIZIZ = true;
                LIZJ = 0;
                C928460aGi.LIZIZ("show", "off");
                C1391960mKI c1391960mKI = new C1391960mKI();
                c1391960mKI.LJII = C497740JfY.LJIJI(2131854167);
                c1391960mKI.LJIIIIZZ = C497740JfY.LJIJI(2131854177);
                c1391960mKI.LIZ = false;
                C1391990mKL c1391990mKL = new C1391990mKL();
                c1391990mKL.LIZ(C497740JfY.LJIJI(2131854166));
                c1391990mKL.LIZJ = new AwS629S0100000_15(interfaceC927120aEY, 0);
                c1391960mKI.LJIIJJI = c1391990mKL;
                C1391990mKL c1391990mKL2 = new C1391990mKL();
                c1391990mKL2.LIZ(C497740JfY.LJIJI(2131854164));
                c1391990mKL2.LIZJ = AFwS299S0000000_15.get$arr$(2);
                c1391960mKI.LJIILIIL = c1391990mKL2;
                c1391960mKI.LJIIJ = C13LQ.LJJLL(new AbstractC1391920mKE[]{new C1391900mKC(C497740JfY.LJIJI(2131854176), null, null, false, new CompoundButton.OnCheckedChangeListener() { // from class: X.0aVJ
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("change live_inner_push status = ");
                        sbLIZ2.append(z);
                        C20441214yg.LIZIZ("MultiGuestMicHangupHelper", C2188811AlT.LIZIZ(sbLIZ2));
                        C937520aVK.LIZJ = z ? 1 : 0;
                    }
                })});
                C439850HMp c439850HMpLIZ = c1391960mKI.LIZ();
                DialogInterfaceOnDismissListenerC937500aVI dialogInterfaceOnDismissListenerC937500aVI = new DialogInterface.OnDismissListener() { // from class: X.0aVI
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C20441214yg.LIZIZ("MultiGuestMicHangupHelper", "setOnDismissListener");
                        C937520aVK.LIZIZ = false;
                        C937520aVK.LIZ.getClass();
                        C937520aVK.LJIIIIZZ();
                    }
                };
                TuxPanel tuxPanel = c439850HMpLIZ.LIZ;
                tuxPanel.LLILZIL = dialogInterfaceOnDismissListenerC937500aVI;
                tuxPanel.LLILZLL = new DialogInterface.OnCancelListener() { // from class: X.0aVL
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        C20441214yg.LIZIZ("MultiGuestMicHangupHelper", "setOnCancelListener");
                        C937520aVK.LIZIZ = false;
                    }
                };
                tuxPanel.show(fragmentManager, "multi_guest_intro_panel_tag");
                return;
            }
            return;
        }
        C20441214yg.LIZIZ("MultiGuestMicHangupHelper", "showNormalDialog");
        LJII(context, interfaceC927120aEY, false);
    }

    public static void LJII(Context context, InterfaceC927120aEY interfaceC927120aEY, boolean z) {
        int i;
        if (context == null) {
            return;
        }
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LJIILLIIL = false;
        c782110Um9.LJIILL = false;
        c782110Um9.LJIIZILJ(2131842116);
        if (z) {
            i = 2131842115;
        } else {
            i = 2131854165;
        }
        c782110Um9.LJII(i);
        c782110Um9.LJIILIIL(2131842113, new AcS81S0110000_15(interfaceC927120aEY, z, 0));
        c782110Um9.LJIIJ(2131842114, new InterfaceC743640TFa() { // from class: X.0aEi
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        C786410Ut5.E4(c782110Um9.LIZ());
    }
}
