package X;

import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.LiveBgDialogChannel;
import com.bytedance.android.live.effect.MultiGuestSharedBgActivityTechSetting;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel;
import com.bytedance.android.livesdk.dataChannel.GreenScreenCreatorBlockChannel;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastBackgroundPhase2;
import com.bytedance.android.livesdk.model.ShareBgSoloEffectChannel;
import com.bytedance.android.livesdk.model.SharedEffect;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0U57, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U57 implements C0U5V, View.OnLayoutChangeListener {
    public final Context LL;
    public DataChannel LLILLJJLI;
    public final String LLILLL;
    public View.OnClickListener LLILZ;
    public C0U59 LLILZIL;
    public String LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final View LLJI;
    public final View LLJIJIL;
    public final View LLJILJIL;
    public final View LLJILJILJ;
    public final RunnableC781530UlD LLJILLL;
    public final TextView LLJJ;
    public final View LLJJI;
    public final View LLJJIII;
    public final View LLJJIJI;
    public final ViewGroup LLJJIJIIJIL;
    public Long LLJJIJIL;
    public final BgEffectViewModel LLJJJ;
    public final GridLayoutManager LLJJJIL;
    public LiveEffect LLJJJJ;
    public final C0U5A LLJJJJJIL;
    public InterfaceC767730U9r LLJJJJLIIL;
    public C0U58 LLJJL;
    public C781710UlV LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;

    @Override // X.C0U5V
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.C0U5V
    public final void LIZIZ() {
        C946050aj5 c946050aj5LIZIZ;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zW(LiveBgDialogChannel.class, Boolean.FALSE);
        }
        C0U58 c0u58 = this.LLJJL;
        if (c0u58 != null) {
            long jLIZ = C158B.LIZ();
            Long l = this.LLJJIJIL;
            c0u58.LIZJ((int) (jLIZ - (l != null ? l.longValue() : C158B.LIZ())));
        }
        C0U5A c0u5a = this.LLJJJJJIL;
        DataChannel dataChannel2 = c0u5a.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(c0u5a);
        }
        DataChannelGlobal.LLILZ.zQ2(c0u5a);
        DataChannel dataChannel3 = c0u5a.LLJ;
        if (dataChannel3 != null) {
            dataChannel3.zQ2(c0u5a);
        }
        InterfaceC767730U9r interfaceC767730U9r = this.LLJJJJLIIL;
        if (interfaceC767730U9r != null) {
            interfaceC767730U9r.LJ("livebackground");
        }
        if (LJII()) {
            this.LLJI.removeOnLayoutChangeListener(this);
            this.LLJLIL = 0;
            C767630U9h.LL.EN2("livebackground");
            DataChannel dataChannel4 = this.LLILLJJLI;
            if (dataChannel4 != null) {
                dataChannel4.zW(LiveDialogStatusChannel.class, new C770910ULx(false, 0, hashCode(), EnumC761940Tui.DIALOG_BIZ_SECONDARY_EFFECT_PANEL, EnumC766540U5c.STICKER_EFFECT_PANEL));
            }
        }
        C946060aj6<SharedEffect> c946060aj6LJFF = LJFF();
        if (c946060aj6LJFF == null || (c946050aj5LIZIZ = c946060aj6LJFF.LIZIZ()) == null) {
            return;
        }
        c946050aj5LIZIZ.LIZIZ(1);
    }

    public final C946060aj6<SharedEffect> LJFF() {
        DataChannel dataChannel;
        if (this.LLJ && (dataChannel = this.LLILLJJLI) != null) {
            return (C946060aj6) dataChannel.gg0(ShareBgSoloEffectChannel.class);
        }
        return null;
    }

    public final void LJI() {
        if (((ArrayList) this.LLJJJJJIL.LL).isEmpty()) {
            C500260Jjc.LLFFF(this.LLJJIII);
            TextView textView = this.LLJJ;
            if (textView != null) {
                C500260Jjc.LJIILIIL(textView);
            }
            this.LLJJIJI.clearAnimation();
            C500260Jjc.LJIILIIL(this.LLJJI);
            C500260Jjc.LJIILIIL(this.LLJILLL);
        }
    }

    public final void LJIIIIZZ() {
        C500260Jjc.LLFFF(this.LLJJI);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(2000L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        this.LLJJIJI.startAnimation(rotateAnimation);
    }

    @Override // X.C0U5V
    public final void onDialogBackground() {
        C781710UlV c781710UlV = this.LLJJLIIIJLLLLLLLZ;
        if (c781710UlV != null) {
            c781710UlV.LIZIZ();
        }
        this.LLJJJJJIL.LLILZ = true;
    }

    public final boolean LJII() {
        return LiveBroadcastBackgroundPhase2.enable() && this.LLJ;
    }

    @Override // X.C0U5V
    public final void onDialogForeground() {
        this.LLJJIJIL = Long.valueOf(C158B.LIZ());
        C781710UlV c781710UlV = this.LLJJLIIIJLLLLLLLZ;
        if (c781710UlV != null) {
            c781710UlV.LIZJ(true);
        }
        C0U5A c0u5a = this.LLJJJJJIL;
        c0u5a.LLILZ = false;
        c0u5a.LLLLLLZ();
    }

    @Override // X.C0U5V
    public final View getView() {
        return this.LLJI;
    }

    @Override // X.C0U5V
    public final void LIZLLL(DialogFragment dialogFragment) {
        C946050aj5 c946050aj5LIZIZ;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zW(LiveBgDialogChannel.class, Boolean.TRUE);
        }
        if (this.LLJ) {
            this.LLJJJJ = C767770U9v.LIZIZ();
        }
        this.LLJJJJJIL.LLLLZI(this.LLJJJJ);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(dialogFragment), null, null, new C760770Tsp(this, null), 3);
        if (!this.LLJ) {
            this.LLJJJ.ZQ2("multi", null);
            if (MultiGuestSharedBgActivityTechSetting.INSTANCE.getValue()) {
                BgEffectViewModel bgEffectViewModel = this.LLJJJ;
                bgEffectViewModel.getClass();
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bgEffectViewModel), C0PEM.LIZJ, null, new C760990TtB(bgEffectViewModel, "multi", null, null), 2);
            }
        } else if (LJII()) {
            this.LLJJJ.ZQ2("solo_new", null);
            this.LLJI.addOnLayoutChangeListener(this);
        } else {
            this.LLJJJ.ZQ2("solo", null);
        }
        InterfaceC767730U9r interfaceC767730U9r = this.LLJJJJLIIL;
        if (interfaceC767730U9r != null) {
            interfaceC767730U9r.LJIIJJI("livebackground");
        }
        InterfaceC767730U9r interfaceC767730U9r2 = this.LLJJJJLIIL;
        if (interfaceC767730U9r2 != null) {
            interfaceC767730U9r2.LJIILL(this.LLJJIJIIJIL);
        }
        C0U5A c0u5a = this.LLJJJJJIL;
        DataChannel dataChannel2 = c0u5a.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(MultiLiveRTCLayoutChannel.class, c0u5a, new AwS591S0100000_12(c0u5a, 664));
            dataChannel2.DQ2(GreenScreenCreatorBlockChannel.class, c0u5a, new AwS591S0100000_12(c0u5a, 665));
        }
        DataChannelGlobal.LLILZ.CQ2(BroadcastSceneGlobalChannel.class, c0u5a, new AwS591S0100000_12(c0u5a, 666));
        C946060aj6<SharedEffect> c946060aj6LJFF = LJFF();
        if (c946060aj6LJFF != null && (c946050aj5LIZIZ = c946060aj6LJFF.LIZIZ()) != null) {
            c946050aj5LIZIZ.LJFF(0);
        }
    }

    public static final void LJIIIZ(C0U57 c0u57, C396001gM<LiveEffect> c396001gM) {
        LiveEffect next;
        Iterator<LiveEffect> it2 = c396001gM.LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getResourceId(), c0u57.LLILZLL)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        c0u57.LLJJJJ = next;
        c0u57.LLJJJJJIL.LLLLZI(null);
        LiveEffect liveEffect = c0u57.LLJJJJ;
        if (liveEffect != null) {
            c0u57.LLJJJJJIL.LLLLZ(c0u57.LL, liveEffect);
            return;
        }
        String str = c0u57.LLILZLL;
        if (str != null && !a0.LJJJIL(str)) {
            return;
        }
        c0u57.LLILZLL = "";
        C0U59 c0u59 = c0u57.LLILZIL;
        if (c0u59 == null) {
            return;
        }
        c0u59.LIZ(null, null);
    }

    public C0U57(Context context, DataChannel dataChannel, String str, View.OnClickListener onClickListener, C0U59 c0u59, String str2, boolean z) {
        int i;
        int iLJIIZILJ;
        this.LL = context;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = str;
        this.LLILZ = onClickListener;
        this.LLILZIL = c0u59;
        this.LLILZLL = str2;
        this.LLIZ = z;
        this.LLIZLLLIL = Intrinsics.LJFF(str, "multi");
        boolean zLIZ = C760940Tt6.LIZ(str);
        this.LLJ = zLIZ;
        View viewSd = C786410Ut5.Sd(R.layout.fzq, C786410Ut5.ne(context), null);
        this.LLJI = viewSd;
        ImageView imageView = (ImageView) viewSd.findViewById(R.id.e05);
        TextView textView = (TextView) viewSd.findViewById(R.id.title);
        View viewFindViewById = viewSd.findViewById(R.id.p15);
        this.LLJIJIL = viewFindViewById;
        View viewFindViewById2 = viewSd.findViewById(R.id.bx5);
        this.LLJILJIL = viewFindViewById2;
        View viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) viewSd.findViewById(R.id.bx4));
        this.LLJILJILJ = viewLJLLLL;
        RunnableC781530UlD runnableC781530UlD = (RunnableC781530UlD) viewLJLLLL.findViewById(R.id.eux);
        this.LLJILLL = runnableC781530UlD;
        this.LLJJ = (TextView) viewLJLLLL.findViewById(R.id.xmb);
        View viewFindViewById3 = viewLJLLLL.findViewById(R.id.nnp);
        this.LLJJI = viewFindViewById3;
        View viewFindViewById4 = viewLJLLLL.findViewById(R.id.hc6);
        this.LLJJIII = viewFindViewById4;
        this.LLJJIJI = viewFindViewById3.findViewById(R.id.w4z);
        this.LLJJIJIIJIL = (ViewGroup) viewSd.findViewById(R.id.view_stub);
        BgEffectViewModel bgEffectViewModel = (BgEffectViewModel) C0U61.LIZ(new C766180U3s(new C0UMA("livebackground"), new C0U6F())).get(BgEffectViewModel.class);
        this.LLJJJ = bgEffectViewModel;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 4);
        this.LLJJJIL = gridLayoutManager;
        C0U5A c0u5a = new C0U5A(this.LLILLJJLI, str, bgEffectViewModel);
        c0u5a.LLIZ = new AwS591S0100000_12(this, 1188);
        this.LLJJJJJIL = c0u5a;
        this.LLJL = 3;
        InterfaceC767730U9r interfaceC767730U9r = new InterfaceC767730U9r() { // from class: X.0UEg
            @Override // X.InterfaceC767730U9r
            public final void LJIIL(LiveEffect liveEffect) {
            }

            @Override // X.InterfaceC767730U9r
            public final int LJIILIIL(String str3, String str4) {
                return -1;
            }

            @Override // X.InterfaceC767730U9r
            public final int LJIILLIIL(String str3, String str4) {
                return -1;
            }

            @Override // X.InterfaceC767730U9r
            public final void LJIIZILJ(String str3, String str4) {
            }

            @Override // X.InterfaceC767730U9r
            public final void onDestroy() {
                InterfaceC768930UEh interfaceC768930UEh;
                DataChannel dataChannel2 = this.LIZ.LLILLJJLI;
                if (dataChannel2 != null && (interfaceC768930UEh = (InterfaceC768930UEh) dataChannel2.gg0(C0UA3.class)) != null) {
                    interfaceC768930UEh.onDestroy();
                }
                IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
                if (iEffectService == null || iEffectService.getLiveGoalEffectHelper() == null) {
                    return;
                }
                C0UFI.LJIIIZ = null;
                C0UFI.LJIIJ = null;
            }

            @Override // X.InterfaceC767730U9r
            public final void LJ(String str3) {
                InterfaceC768930UEh interfaceC768930UEh;
                DataChannel dataChannel2 = this.LIZ.LLILLJJLI;
                if (dataChannel2 != null && (interfaceC768930UEh = (InterfaceC768930UEh) dataChannel2.gg0(C0UA3.class)) != null) {
                    interfaceC768930UEh.LJ(str3);
                }
            }

            @Override // X.InterfaceC767730U9r
            public final void LJFF(LiveEffect liveEffect) {
                InterfaceC768930UEh interfaceC768930UEh;
                DataChannel dataChannel2 = this.LIZ.LLILLJJLI;
                if (dataChannel2 != null && (interfaceC768930UEh = (InterfaceC768930UEh) dataChannel2.gg0(C0UA3.class)) != null) {
                    if (interfaceC768930UEh.LJIIIIZZ(liveEffect)) {
                        interfaceC768930UEh.LJFF(liveEffect);
                    } else {
                        interfaceC768930UEh.LIZJ();
                    }
                }
                DataChannel dataChannel3 = this.LIZ.LLILLJJLI;
                if (dataChannel3 != null) {
                    dataChannel3.SX0(C768940UEi.class, Boolean.valueOf(((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).usingSlideGestureEffect()));
                }
                C1276840jKc c1276840jKc = C1276840jKc.LIZ;
                String strValueOf = String.valueOf(liveEffect.getEffectId());
                c1276840jKc.getClass();
                C1276840jKc.LJIIL(strValueOf);
                C1276840jKc.LJIILL(liveEffect.getResourceId());
                C1276840jKc.LJIIJ(liveEffect, false);
            }

            @Override // X.InterfaceC767730U9r
            public final void LJIIJJI(String str3) {
                InterfaceC768930UEh interfaceC768930UEh;
                DataChannel dataChannel2 = this.LIZ.LLILLJJLI;
                if (dataChannel2 != null && (interfaceC768930UEh = (InterfaceC768930UEh) dataChannel2.gg0(C0UA3.class)) != null) {
                    interfaceC768930UEh.LJI(null, str3);
                }
            }

            @Override // X.InterfaceC767730U9r
            public final void LJIILJJIL(LiveEffect liveEffect) {
                InterfaceC768930UEh interfaceC768930UEh;
                DataChannel dataChannel2 = this.LIZ.LLILLJJLI;
                if (dataChannel2 != null && (interfaceC768930UEh = (InterfaceC768930UEh) dataChannel2.gg0(C0UA3.class)) != null && interfaceC768930UEh.LJIIIIZZ(liveEffect)) {
                    interfaceC768930UEh.LIZJ();
                }
                DataChannel dataChannel3 = this.LIZ.LLILLJJLI;
                if (dataChannel3 != null) {
                    dataChannel3.SX0(C768940UEi.class, Boolean.valueOf(((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).usingSlideGestureEffect()));
                }
                C1276840jKc.LIZ.getClass();
                C1276840jKc.LJIIL("");
                C1276840jKc.LJIILL("");
                C1276840jKc.LJIIJ(liveEffect, true);
            }

            @Override // X.InterfaceC767730U9r
            public final void LJIILL(ViewGroup viewGroup) {
                InterfaceC768930UEh interfaceC768930UEh;
                DataChannel dataChannel2 = this.LIZ.LLILLJJLI;
                if (dataChannel2 != null && (interfaceC768930UEh = (InterfaceC768930UEh) dataChannel2.gg0(C0UA3.class)) != null) {
                    interfaceC768930UEh.LJIIIZ(viewGroup, false);
                }
            }
        };
        if (!zLIZ) {
            i = 2131843396;
        } else if (LJII()) {
            i = 2131852648;
        } else {
            i = 2131842511;
        }
        textView.setText(C497740JfY.LJIJI(i));
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 453), viewFindViewById4);
        C500260Jjc.LJIILIIL(viewFindViewById4);
        LJIIIIZZ();
        int iLIZIZ = (int) C497740JfY.LIZIZ(294.0f);
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
            iLJIIZILJ = (int) C497740JfY.LIZIZ(375.0f);
        } else {
            iLJIIZILJ = C497740JfY.LJIIZILJ();
        }
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(14.0f);
        this.LLJL = runnableC781530UlD.getHeight() / (((int) C497740JfY.LIZIZ(60.0f)) + iLIZIZ2);
        runnableC781530UlD.addItemDecoration(new C424270GkL(4, iLIZIZ2, (iLJIIZILJ - iLIZIZ) / 3));
        runnableC781530UlD.setHasFixedSize(true);
        runnableC781530UlD.setAdapter(c0u5a);
        runnableC781530UlD.setLayoutManager(gridLayoutManager);
        runnableC781530UlD.setItemAnimator(null);
        if (zLIZ) {
            this.LLILZIL = new C0U59() { // from class: X.0U5J
                @Override // X.C0U59
                public final void LIZ(LiveEffect liveEffect, LiveEffect liveEffect2) {
                    C946050aj5 c946050aj5LIZIZ;
                    C946050aj5 c946050aj5LIZIZ2;
                    C0U57 c0u57 = this.LIZ;
                    if (c0u57.LLJJJJLIIL != null) {
                        if (liveEffect2 == null) {
                            if (liveEffect != null) {
                                C0UA1.LIZ().lr("livebackground");
                                InterfaceC767730U9r interfaceC767730U9r2 = c0u57.LLJJJJLIIL;
                                if (interfaceC767730U9r2 != null) {
                                    interfaceC767730U9r2.LJIILJJIL(liveEffect);
                                }
                                C946060aj6<SharedEffect> c946060aj6LJFF = c0u57.LJFF();
                                if (c946060aj6LJFF != null && (c946050aj5LIZIZ2 = c946060aj6LJFF.LIZIZ()) != null) {
                                    c946050aj5LIZIZ2.LIZ(new SharedEffect("", "", null));
                                }
                                IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
                                if (iBroadcastService != null) {
                                    iBroadcastService.notifyApplyStatusAndSaveStatus(EnumC773040UUc.BACKGROUND, EnumC771230UNd.APPLY_FINISH, "");
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        C0UA1.LIZ().Gr("livebackground", liveEffect, liveEffect2);
                        InterfaceC767730U9r interfaceC767730U9r3 = c0u57.LLJJJJLIIL;
                        if (interfaceC767730U9r3 != null) {
                            interfaceC767730U9r3.LJFF(liveEffect2);
                        }
                        C946060aj6<SharedEffect> c946060aj6LJFF2 = c0u57.LJFF();
                        if (c946060aj6LJFF2 != null && (c946050aj5LIZIZ = c946060aj6LJFF2.LIZIZ()) != null) {
                            c946050aj5LIZIZ.LIZ(new SharedEffect(liveEffect2.getResourceId(), "", liveEffect2));
                        }
                        C0U5I.LJFF(liveEffect2.getResourceId());
                    }
                }
            };
            C0UA4.LIZIZ = new WeakReference<>(this.LLILZIL);
            this.LLILZ = new ACListenerS147S0100000_12(this, 454);
            this.LLJJJJLIIL = interfaceC767730U9r;
        }
        C786410Ut5.Q7(imageView, new ACListenerS147S0100000_12(this, 455));
        this.LLJJLIIIJLLLLLLLZ = new C781710UlV(1, 0.0d, runnableC781530UlD, new AwS626S0100000_12(this, 72));
        c0u5a.LLJIJIL = this.LLJJL;
        if (LJII()) {
            C500260Jjc.LJIILIIL(viewFindViewById2);
            viewFindViewById.setBackgroundResource(R.drawable.ef4);
            viewLJLLLL.setBackgroundResource(R.drawable.ef2);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        if (LJII() && this.LLJLIL != (height = this.LLJI.getHeight())) {
            this.LLJLIL = height;
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.zW(LiveDialogStatusChannel.class, new C770910ULx(true, height, hashCode(), EnumC761940Tui.DIALOG_BIZ_SECONDARY_EFFECT_PANEL, EnumC766540U5c.STICKER_EFFECT_PANEL));
            }
        }
    }
}
