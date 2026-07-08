package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.broadcast.obs.ObsBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerLayoutShouldFillSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerLayoutShouldNotFillSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerNewLayoutTopicIdSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UYH, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UYH implements InterfaceC480570Isx {
    public final Room LIZ;
    public final ObsBroadcastFragment LIZIZ;
    public final DataChannel LIZJ;
    public C0IEB LIZLLL;
    public View LJ;
    public C1324720kZq LJFF;
    public C1324720kZq LJI;
    public C0UPV LJII;
    public boolean LJIIIIZZ;
    public C20856616jU LJIIIZ;
    public final boolean LJIIJ;
    public boolean LJIIJJI;
    public final C19EG LJIIL;
    public View LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;

    @Override // X.InterfaceC480570Isx
    public final void LIZIZ(C945320ahu c945320ahu) {
    }

    @Override // X.InterfaceC480570Isx
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC480570Isx
    public final void LJ(C945320ahu c945320ahu) {
    }

    @Override // X.InterfaceC480570Isx
    public final void LJFF(long j, long j2) {
    }

    @Override // X.InterfaceC480570Isx
    public final void LJI() {
    }

    @Override // X.InterfaceC480570Isx
    public final void LJII() {
    }

    @Override // X.InterfaceC480570Isx
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC480570Isx
    public final void LJIIJ(String str) {
    }

    @Override // X.InterfaceC480570Isx
    public final void LJIIJJI() {
    }

    @Override // X.InterfaceC480570Isx
    public final void LJIILJJIL(String str) {
    }

    @Override // X.InterfaceC480570Isx
    public final void LLLIL() {
    }

    @Override // X.InterfaceC480570Isx
    public final /* synthetic */ void LLZZLLIL(C1281010jRL c1281010jRL) {
    }

    public final void LJIILLIIL() {
        if (this.LJIIL != null) {
            C0UPV c0upv = this.LJII;
            if (c0upv == null) {
                C19EG c19eg = this.LJIIL;
                String strLIZLLL = (String) C13LP.LJJJLL(this.LIZ.getStreamUrl().pushUrlList);
                if (strLIZLLL == null) {
                    strLIZLLL = this.LIZ.getStreamUrl().LIZLLL();
                }
                c0upv = new C0UPV(c19eg, this.LIZ, strLIZLLL);
            }
            this.LJII = c0upv;
            C500260Jjc.LJJLIIIJLLLLLLLZ(c0upv);
        }
    }

    @Override // X.InterfaceC480570Isx
    public final void LJJLIIIJ() {
        if (this.LJIIIIZZ) {
            return;
        }
        C500260Jjc.LLFFF(this.LJFF);
        C500260Jjc.LLFFF(this.LJ);
        C500260Jjc.LJIILIIL(this.LJI);
    }

    public final void LJIILL() {
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            C1819620xS4.LIZ().LJIIIZ(this.LIZ.background).LJJI(this.LJI);
        } else {
            C1121670fIL.LJI(this.LIZ.background, this.LJI);
        }
    }

    @Override // X.InterfaceC480570Isx
    public final void LIZ(Exception exc) {
        LJIILIIL(-1, exc.toString());
        C773220UUu c773220UUu = C773220UUu.LIZ;
        AwS591S0100000_12 awS591S0100000_12 = new AwS591S0100000_12(exc, 8);
        c773220UUu.getClass();
        C773220UUu.LJIIL(awS591S0100000_12);
    }

    public final void LJIIL(boolean z) {
        C11JF c11jf;
        C0UPV c0upv = this.LJII;
        if (c0upv != null) {
            C500260Jjc.LJJLIIIJL(c0upv);
        }
        if (z) {
            C0UPV c0upv2 = this.LJII;
            if (c0upv2 != null && (c11jf = c0upv2.LLJJJJJIL) != null && !c11jf.isDisposed()) {
                c0upv2.LLJJJJJIL.dispose();
            }
            this.LJII = null;
        }
    }

    @Override // X.InterfaceC480570Isx
    public final void LIZJ(long j, long j2) {
        C500260Jjc.LJIILIIL(this.LJFF);
        C500260Jjc.LJIILIIL(this.LJ);
        C500260Jjc.LLFFF(this.LJI);
        ObsBroadcastFragment obsBroadcastFragment = this.LIZIZ;
        C0UZ9 c0uz9 = obsBroadcastFragment.LLJJ;
        if (c0uz9 == null) {
            c0uz9 = null;
        }
        c0uz9.LJIIL();
        C0UZV c0uzv = obsBroadcastFragment.LLIZLLLIL;
        if (c0uzv != null) {
            c0uzv.kt();
        }
        C760160Trq c760160TrqLIZJ = C759970TrX.LIZJ("ttlive_start_play_obs_all");
        c760160TrqLIZJ.LJI = true;
        c760160TrqLIZJ.LJIIIZ();
        if (this.LJIIJ) {
            if (this.LJIILJJIL) {
                this.LJIILJJIL = false;
                C773220UUu c773220UUu = C773220UUu.LIZ;
                AwS591S0100000_12 awS591S0100000_12 = new AwS591S0100000_12(this, 9);
                c773220UUu.getClass();
                C773220UUu.LJIIL(awS591S0100000_12);
                return;
            }
            C773220UUu c773220UUu2 = C773220UUu.LIZ;
            AFwS245S0000000_12 aFwS245S0000000_12 = AFwS245S0000000_12.get$arr$(0);
            c773220UUu2.getClass();
            C773220UUu.LJIIL(aFwS245S0000000_12);
        }
    }

    @Override // X.InterfaceC480570Isx
    public final void LJIIIZ(int i, String str) {
        LJIILIIL(i, str);
    }

    public final void LJIILIIL(int i, String str) {
        if (this.LJIIJJI) {
            return;
        }
        this.LJIIJJI = true;
        C760160Trq c760160TrqLIZIZ = C759970TrX.LIZIZ("ttlive_play_obs_error");
        c760160TrqLIZIZ.LJFF(Integer.valueOf(i), "error_code");
        c760160TrqLIZIZ.LJII("error_msg", str);
        c760160TrqLIZIZ.LJI(Long.valueOf(this.LIZ.getOwnerUserId()), "user_id");
        c760160TrqLIZIZ.LJII("stream_data", this.LIZ.getMultiStreamData());
        c760160TrqLIZIZ.LJIIIZ();
    }

    @Override // X.InterfaceC480570Isx
    public final void onVideoSizeChanged(int i, int i2) {
        FrameLayout.LayoutParams layoutParams;
        long jLongValue;
        int height;
        Long l;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C1331070kk5 hierarchy;
        View viewFindViewById;
        View viewFindViewById2;
        ViewGroup.LayoutParams layoutParams3 = null;
        if (i > i2) {
            C20856616jU c20856616jU = this.LJIIIZ;
            if (c20856616jU != null) {
                layoutParams2 = c20856616jU.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                int iLJIIJ = C12ES.LJIIJ(this.LJIIL);
                marginLayoutParams.width = iLJIIJ;
                marginLayoutParams.height = (i2 * iLJIIJ) / i;
                marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(130.0f);
                C20856616jU c20856616jU2 = this.LJIIIZ;
                if (c20856616jU2 != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20856616jU2);
                    c20856616jU2.setLayoutParams(marginLayoutParams);
                }
                if (!this.LJIILL) {
                    View view = this.LJIILIIL;
                    if (view != null && (viewFindViewById2 = view.findViewById(R.id.kvx)) != null) {
                        C786410Ut5.LJLLLLLL(8, viewFindViewById2);
                    }
                    View view2 = this.LJIILIIL;
                    if (view2 != null && (viewFindViewById = view2.findViewById(R.id.sfo)) != null) {
                        C786410Ut5.LJLLLLLL(8, viewFindViewById);
                    }
                    if (this.LIZ.background != null) {
                        LJIILL();
                        this.LJIILL = true;
                        return;
                    }
                    C1324720kZq c1324720kZq = this.LJI;
                    if (c1324720kZq != null && (hierarchy = c1324720kZq.getHierarchy()) != null) {
                        hierarchy.LJIJ(null, 1);
                    }
                    C1324720kZq c1324720kZq2 = this.LJI;
                    if (c1324720kZq2 == null) {
                        return;
                    }
                    c1324720kZq2.setBackgroundColor(-16777216);
                    return;
                }
                return;
            }
            return;
        }
        C20856616jU c20856616jU3 = this.LJIIIZ;
        if (c20856616jU3 != null) {
            layoutParams3 = c20856616jU3.getLayoutParams();
        }
        if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams3) != null) {
            boolean zLJIILLIIL = C13LQ.LJIILLIIL(String.valueOf(this.LIZ.getOwnerUserId()), LivePlayerLayoutShouldFillSetting.INSTANCE.getValue());
            boolean zLJIILLIIL2 = C13LQ.LJIILLIIL(String.valueOf(this.LIZ.getOwnerUserId()), LivePlayerLayoutShouldNotFillSetting.INSTANCE.getValue());
            long[] value = LivePlayerNewLayoutTopicIdSetting.INSTANCE.getValue();
            Hashtag hashtag = this.LIZ.hashtag;
            if (hashtag != null && (l = hashtag.id) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = -1;
            }
            if (!C13LQ.LJIILL(jLongValue, value) ? zLJIILLIIL2 : !zLJIILLIIL) {
                if (i > 0 && i2 > 0 && this.LJIIIZ != null) {
                    C1324720kZq c1324720kZq3 = this.LJFF;
                    if (c1324720kZq3 != null) {
                        height = c1324720kZq3.getHeight();
                    } else {
                        height = 0;
                    }
                    int iLJIIZILJ = C497740JfY.LJIIZILJ();
                    if (height > 0 && iLJIIZILJ > 0) {
                        float f = i;
                        float f2 = i2;
                        int i3 = (int) ((iLJIIZILJ / f) * f2);
                        int iLIZIZ = (int) C497740JfY.LIZIZ(130.0f);
                        if (i3 + iLIZIZ <= height) {
                            layoutParams.topMargin = iLIZIZ;
                            layoutParams.width = iLJIIZILJ;
                            layoutParams.height = i3;
                            layoutParams.gravity = 1;
                        } else if (i3 <= height) {
                            layoutParams.topMargin = 0;
                            layoutParams.width = iLJIIZILJ;
                            layoutParams.height = i3;
                            layoutParams.gravity = 17;
                        } else {
                            layoutParams.topMargin = 0;
                            layoutParams.width = (int) (f * (height / f2));
                            layoutParams.height = height;
                            layoutParams.gravity = 1;
                        }
                    }
                }
            }
            C20856616jU c20856616jU4 = this.LJIIIZ;
            if (c20856616jU4 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20856616jU4);
                c20856616jU4.setLayoutParams(layoutParams);
            }
            if (this.LJIILL) {
                return;
            }
            int iLJIIIIZZ = C12ES.LJIIIIZZ(this.LJIIL);
            if (iLJIIIIZZ != 0) {
                float fLJIIJ = C12ES.LJIIJ(this.LJIIL) / iLJIIIIZZ;
                if (this.LIZ.background != null) {
                    LJIILL();
                } else if (LiveImageLoaderModuleSetting.useImageModule()) {
                    C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(this.LIZ.getOwner().getAvatarThumb());
                    c1324610kZfLJIIIZ.LJIIZILJ = fLJIIJ;
                    c1324610kZfLJIIIZ.LJIJ = 5;
                    c1324610kZfLJIIIZ.LJJI(this.LJI);
                } else {
                    C1121670fIL.LJII(this.LJI, this.LIZ.getOwner().getAvatarThumb(), new C1291830jin(fLJIIJ));
                }
            }
            this.LJIILL = true;
        }
    }

    public C0UYH(Room room, ObsBroadcastFragment obsBroadcastFragment, DataChannel dataChannel) {
        boolean z;
        this.LIZ = room;
        this.LIZIZ = obsBroadcastFragment;
        this.LIZJ = dataChannel;
        if (room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIJ = z;
        this.LJIIL = obsBroadcastFragment.getActivity();
        this.LJIILJJIL = true;
    }
}
