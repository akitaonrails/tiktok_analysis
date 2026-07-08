package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.projection.MediaProjectionConfig;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import com.bytedance.android.live.publicscreen.api.BackToAppEvent;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.EnableTTCaptureSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatTipsOptimize;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Ucm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776300Ucm implements InterfaceC777850UfH {
    public final GameBroadcastFragment LL;
    public final DataChannel LLILLJJLI;
    public InterfaceC769940UIe LLILLL;
    public final C0UZ9 LLILZ;
    public final InterfaceC778270Ufx LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public C785760Us2 LLJ;
    public boolean LLJI;

    @Override // X.InterfaceC777850UfH
    public final void LJI(AbstractC777950UfR abstractC777950UfR) {
    }

    public static Bitmap LIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public final void LIZJ(int i) {
        Object objJ2;
        MediaProjectionManager mediaProjectionManager;
        Intent intentLIZJ;
        C19EG activity;
        if (EnableTTCaptureSetting.INSTANCE.enable()) {
            GameBroadcastFragment gameBroadcastFragment = this.LL;
            if (gameBroadcastFragment != null && (activity = gameBroadcastFragment.getActivity()) != null) {
                objJ2 = C786410Ut5.J2(activity, "media_projection");
            } else {
                objJ2 = null;
            }
            if ((objJ2 instanceof MediaProjectionManager) && (mediaProjectionManager = (MediaProjectionManager) objJ2) != null) {
                try {
                    Cert certFindCert = CertProviderManagerKt.findCert("bpea-screen_capture_intent_resume", 1476411393);
                    if (Build.VERSION.SDK_INT >= 34) {
                        C20441214yg.LIZIZ("GameLivePauseController", "getScreenCaptureIntent when sdk version greater than 34.");
                        intentLIZJ = C0TPX.LIZIZ(mediaProjectionManager, MediaProjectionConfig.createConfigForDefaultDisplay(), certFindCert);
                    } else {
                        C20441214yg.LIZIZ("GameLivePauseController", "getScreenCaptureIntent when sdk version smaller than 34.");
                        intentLIZJ = C0TPX.LIZJ(mediaProjectionManager, certFindCert);
                    }
                    GameBroadcastFragment gameBroadcastFragment2 = this.LL;
                    if (gameBroadcastFragment2 != null) {
                        C1701330uNH.LIZ(intentLIZJ, gameBroadcastFragment2);
                        C2204961BRm.LLLIIL(gameBroadcastFragment2, intentLIZJ, i, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MyFf9A4/HWWwV5Kt9lP0Hf23rV1vA733n5SgSRESUMvfb8F+W+ZdvcmssqLulnDLIEsXg20b5kUF8KWq/5Rw==", null));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("create capture intent exception, msg: ");
                    sbLIZ.append(e.getMessage());
                    C20441214yg.LJ("GameLivePauseController", C2188811AlT.LIZIZ(sbLIZ));
                    this.LLIZ = false;
                    this.LLIZLLLIL = false;
                }
            }
        }
    }

    public final void LIZIZ(Bitmap bitmap, Cert cert) {
        if (bitmap != null) {
            InterfaceC769940UIe interfaceC769940UIe = this.LLILLL;
            if (interfaceC769940UIe != null) {
                interfaceC769940UIe.n3(bitmap, cert);
                return;
            }
            return;
        }
        InterfaceC769940UIe interfaceC769940UIe2 = this.LLILLL;
        if (interfaceC769940UIe2 == null) {
            return;
        }
        interfaceC769940UIe2.LJIILL(cert);
    }

    public final void LIZLLL(int i, boolean z) {
        InterfaceC778270Ufx interfaceC778270Ufx;
        if (!z) {
            LIZJ(i);
            return;
        }
        if (i == 2001) {
            this.LLIZ = true;
        } else if (i == 2002) {
            this.LLIZLLLIL = true;
        }
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            C777840UfG.LJII(new AbstractC777950UfR() { // from class: X.0UfD
                public final EnumC777930UfP LJ = EnumC777930UfP.PRIORITY_TYPE_P0;
                public final EnumC777480Ueg LJFF = EnumC777480Ueg.PERMISSION;
                public final CharSequence LJI = C497740JfY.LJIJI(2131853388);

                {
                    this.LIZIZ = new AbstractC777790UfB() { // from class: X.0UfE
                        public final EnumC777770Uf9 LIZ = EnumC777770Uf9.BACK;

                        @Override // X.AbstractC777790UfB
                        public final EnumC777770Uf9 LIZ() {
                            return this.LIZ;
                        }
                    };
                    this.LIZ = new AbstractC777790UfB() { // from class: X.0UfC
                        public final EnumC777770Uf9 LIZ = EnumC777770Uf9.CIRCLE_WARNING_WHITE;

                        @Override // X.AbstractC777790UfB
                        public final EnumC777770Uf9 LIZ() {
                            return this.LIZ;
                        }
                    };
                }

                @Override // X.AbstractC777950UfR
                public final EnumC777930UfP LIZJ() {
                    return this.LJ;
                }

                @Override // X.AbstractC777950UfR
                public final CharSequence LIZLLL() {
                    return this.LJI;
                }

                @Override // X.AbstractC777950UfR
                public final EnumC777480Ueg LJ() {
                    return this.LJFF;
                }
            });
            return;
        }
        String strLJIJI = C497740JfY.LJIJI(2131853388);
        if (strLJIJI == null || (interfaceC778270Ufx = this.LLILZIL) == null) {
            return;
        }
        interfaceC778270Ufx.LJIIIZ(EnumC778100Ufg.IVE_TIP_MESSAGE_PERMISSION_ERROR.ordinal(), null, strLJIJI, null, true);
    }

    @Override // X.InterfaceC777850UfH
    public final void LJII(AbstractC777950UfR abstractC777950UfR, EnumC778130Ufj enumC778130Ufj) {
        DataChannel dataChannel;
        if ((abstractC777950UfR instanceof C777810UfD) && enumC778130Ufj == EnumC778130Ufj.USER_CLICK && (dataChannel = this.LLILLJJLI) != null) {
            dataChannel.FQ2(BackToAppEvent.class);
        }
    }

    public C776300Ucm(GameBroadcastFragment gameBroadcastFragment, DataChannel dataChannel, InterfaceC769940UIe interfaceC769940UIe, C0UZ9 c0uz9, C776870Udh c776870Udh) throws Exception {
        Context context;
        this.LL = gameBroadcastFragment;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = interfaceC769940UIe;
        this.LLILZ = c0uz9;
        this.LLILZIL = c776870Udh;
        if (dataChannel != null) {
            dataChannel.CQ2(PauseLiveChannel.class, this, new C776330Ucp(this));
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        this.LLJ = new C785760Us2(this, 0);
        if (gameBroadcastFragment != null && (context = gameBroadcastFragment.getContext()) != null) {
            C786410Ut5.LJIJJ(context, this.LLJ, intentFilter);
        }
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            C777840UfG.LIZ(EnumC777480Ueg.PERMISSION, this);
        }
    }
}
