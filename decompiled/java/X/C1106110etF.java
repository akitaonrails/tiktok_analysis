package X;

import Y.ALAdapterS13S0100000_17;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.toolbar.BroadcastToolbarUnloadEvent;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomShareCountChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostSuggestionTooltipSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleOptimize;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarNoTitleShareCountEnable;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarUIConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarUIConfigOpt;
import com.bytedance.android.livesdk.livesetting.other.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastLiveLogOpt;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayActivityLeaksOptSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveTooltipAlogSetting;
import com.bytedance.android.livesdk.model.message.RoomUserSeqMessage;
import com.bytedance.android.livesdk.model.message.ShareGuideMessage;
import com.bytedance.android.livesdk.share.LiveShareIconOptSetting;
import com.bytedance.android.livesdk.sheet.LiveRepostGuideFragment;
import com.bytedance.android.livesdk.story.LiveShareToStoryLearningFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0etF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106110etF implements InterfaceViewOnClickListenerC1102800enu, OnMessageListener {
    public static final Long LLLIZZ = 17L;
    public InterfaceC1103130eoR LL;
    public boolean LLILLJJLI;
    public String LLILLL;
    public boolean LLILZ;
    public Room LLILZIL;
    public AnimatorSet LLILZLL;
    public ObjectAnimator LLIZ;
    public final LiveMode LLIZLLLIL;
    public C19EG LLJ;
    public Context LLJI;
    public DataChannel LLJIJIL;
    public LifecycleOwner LLJILJIL;
    public IMessageManager LLJILLL;
    public LiveIconView LLJJ;
    public GlobalHookDialogFragment LLJJI;
    public C481340IuC LLJJIII;
    public boolean LLJJIJI;
    public C20743416Fc LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public C498770JhD LLJLIL;
    public C11JF LLJLL;
    public ViewOutlineProvider LLJLLIL;
    public ImageView.ScaleType LLJZ;
    public C1103170eoV LLLFFI;
    public boolean LLLFZ;
    public C1084590eKX LLLIIIIL;
    public final C11NJ LLJILJILJ = new C11NJ();
    public boolean LLJJIJIIJIL = false;
    public boolean LLJJJJ = false;
    public AbstractC1106180etM LLJJJJJIL = null;
    public AbstractC1106180etM LLJJJJLIIL = null;
    public boolean LLJJL = false;
    public boolean LLJJLIIIJLLLLLLLZ = false;
    public boolean LLJL = false;
    public boolean LLJLILLLLZIIL = false;
    public boolean LLJLLL = false;
    public boolean LLJZIJLIL = false;
    public int LLL = -2;
    public int LLLF = -2;
    public final C1151470g4P LLLFF = new C1151470g4P(2);
    public boolean LLLI = false;
    public boolean LLLII = false;
    public InterfaceC481170Itv LLLIIII = null;
    public C498820JhI LLLIIIL = null;
    public final int LLLIIL = LiveTooltipAlogSetting.INSTANCE.getToolbarBehaviorDelay();
    public final long LLLIILIL = ((long) LiveCoHostSuggestionTooltipSetting.INSTANCE.getTooltipDelay()) * 1000;
    public boolean LLLIL = false;
    public boolean LLLILZ = false;
    public FrameLayout LLLILZJ = null;
    public boolean LLLILZLLLI = true;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void dK(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean dj() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ long g0() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void mx(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    public final void LIZ() {
        C11JF c11jf = this.LLJLL;
        if (c11jf != null && !c11jf.isDisposed()) {
            this.LLJLL.dispose();
        }
        this.LLJLL = null;
        LiveIconView liveIconView = this.LLJJ;
        if (liveIconView != null) {
            liveIconView.animate().cancel();
        }
    }

    public final void LIZIZ() {
        LiveIconView liveIconView = this.LLJJ;
        if (liveIconView == null) {
            return;
        }
        Animation animation = liveIconView.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        AnimatorSet animatorSet = this.LLILZLL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimator = this.LLIZ;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.LLJJ.clearAnimation();
        LJIILIIL();
    }

    public final Room LIZLLL() {
        return (Room) this.LLJIJIL.gg0(RoomChannel.class);
    }

    public final boolean LJFF() {
        DataChannel dataChannel = this.LLJIJIL;
        if (dataChannel != null) {
            return ((Boolean) dataChannel.gg0(C0TZM.class)).booleanValue();
        }
        return false;
    }

    public final boolean LJI() {
        Room room = this.LLILZIL;
        return (room == null || room.getOwner() == null || this.LLILZIL.getOwner().getSecret() != 1) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII() {
        /*
            r6 = this;
            X.0JhD r0 = r6.LLJLIL
            if (r0 == 0) goto Laa
            long r3 = r0.LLILZ
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto Laa
            long r3 = java.lang.System.currentTimeMillis()
            X.0JhD r0 = r6.LLJLIL
            long r0 = r0.LLILZ
            long r3 = r3 - r0
            r1 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto La0
            java.lang.String r5 = "bubble_guide"
        L1d:
            java.lang.Class<com.bytedance.android.live.liveinteract.api.IInteractService> r0 = com.bytedance.android.live.liveinteract.api.IInteractService.class
            X.006A r2 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.liveinteract.api.IInteractService r2 = (com.bytedance.android.live.liveinteract.api.IInteractService) r2
            java.lang.String r3 = "user"
            if (r2 == 0) goto L9d
            java.lang.String r4 = r2.No2()
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r0 = r0.getCurrentUserId()
            X.0JG7 r1 = r2.c10(r0)
            X.0JG7 r0 = X.C0JG7.GUEST_AUDIENCE
            if (r1 != r0) goto L43
            java.lang.String r3 = "guest"
        L43:
            java.lang.String r0 = "livesdk_share_panel_show"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r6.LLJIJIL
            r2.LJIJJLI(r0)
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r0 = r0.getCurrentUserId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "user_id"
            r2.LJJII(r1, r0)
            java.lang.String r1 = "panel_source"
            java.lang.String r0 = "share_panel"
            r2.LJJII(r0, r1)
            java.lang.String r0 = "is_bubble_enter"
            r2.LJJII(r5, r0)
            java.lang.String r0 = "multi_tool"
            r2.LJJII(r4, r0)
            qo2.w r0 = qo2.w.LIZ
            r0.getClass()
            java.lang.String r1 = qo2.w.LJIJI()
            java.lang.String r0 = "request_id"
            r2.LJJII(r1, r0)
            java.lang.String r0 = "user_type"
            r2.LJJII(r3, r0)
            boolean r0 = r6.LLILZ
            if (r0 == 0) goto L99
            java.lang.String r1 = "enter_from_merge"
            java.lang.String r0 = "camera"
            r2.LJJII(r0, r1)
            java.lang.String r1 = "event_page"
            java.lang.String r0 = "live_take_detail"
            r2.LJJII(r0, r1)
        L99:
            r2.LIZ()
            return
        L9d:
            java.lang.String r4 = ""
            goto L43
        La0:
            r1 = 15000(0x3a98, double:7.411E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto Laa
            java.lang.String r5 = "ten_seconds_enter"
            goto L1d
        Laa:
            java.lang.String r5 = "self_guide"
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1106110etF.LJII():void");
    }

    public final void LJIIIIZZ() {
        if (((IGameService) C1161920gLG.LIZJ(IGameService.class)).NQ(this.LLJIJIL, C0UX6.RED_DOT_AUDIENCE_SHARE_BUTTON_GAME_POINTS)) {
            RedDotExtensionKt.LJI(this.LL.findViewById(R.id.y7r), this.LLJILJIL, null, C0UX6.RED_DOT_AUDIENCE_SHARE_BUTTON_GAME_POINTS, null);
        }
    }

    public final void LJIIIZ() {
        ((IGameService) C1161920gLG.LIZJ(IGameService.class)).lU0();
        if (!(C753430Tgz.LJIIJJI(this.LLJIJIL) && LJFF())) {
            C0UX6 c0ux6 = C0UX6.RED_DOT_AUDIENCE_MODERATOR_GUESSING_GAME;
            RedDotExtensionKt.LJIILL(c0ux6, false);
            RedDotExtensionKt.LJFF(c0ux6);
            this.LLJJL = false;
        } else if (this.LL != null) {
            C0UX6 c0ux62 = C0UX6.RED_DOT_AUDIENCE_MODERATOR_GUESSING_GAME;
            if (!RedDotExtensionKt.LJ(c0ux62) && !this.LLJJL) {
                RedDotExtensionKt.LJIILL(c0ux62, true);
                String currentId = c0ux62.getCurrentId();
                if (TextUtils.isEmpty(currentId)) {
                    currentId = c0ux62.getIds()[0];
                }
                RedDotExtensionKt.LJIIL(c0ux62, CardStruct.IStatusCode.DEFAULT, currentId);
                LifecycleOwner lifecycleOwner = this.LLJILJIL;
                RedDotExtensionKt.LJI(null, lifecycleOwner, null, C0UX6.RED_DOT_AUDIENCE_MODERATOR_GUESSING_GAME, null);
                RedDotExtensionKt.LJI(null, lifecycleOwner, null, C0UX6.RED_DOT_AUDIENCE_SHARE_MODERATOR_SETTING, null);
                RedDotExtensionKt.LJI(this.LL.findViewById(R.id.y7r), lifecycleOwner, null, C0UX6.RED_DOT_AUDIENCE_SHARE_BUTTON, null);
                this.LLJJL = true;
            }
        }
        ((IGameService) C1161920gLG.LIZJ(IGameService.class)).na1();
        if (!C01C6.LIZ(this.LLJIJIL)) {
            C0UX6 c0ux63 = C0UX6.RED_DOT_AUDIENCE_MODERATOR_GUIDE_TIPS;
            RedDotExtensionKt.LJIILL(c0ux63, false);
            RedDotExtensionKt.LJFF(c0ux63);
            this.LLJJLIIIJLLLLLLLZ = false;
        } else if (this.LL != null) {
            C0UX6 c0ux64 = C0UX6.RED_DOT_AUDIENCE_MODERATOR_GUIDE_TIPS;
            if (!RedDotExtensionKt.LJ(c0ux64) && !this.LLJJLIIIJLLLLLLLZ) {
                RedDotExtensionKt.LJIILL(c0ux64, true);
                String currentId2 = c0ux64.getCurrentId();
                if (TextUtils.isEmpty(currentId2)) {
                    currentId2 = c0ux64.getIds()[0];
                }
                RedDotExtensionKt.LJIIL(c0ux64, CardStruct.IStatusCode.DEFAULT, currentId2);
                LifecycleOwner lifecycleOwner2 = this.LLJILJIL;
                RedDotExtensionKt.LJI(null, lifecycleOwner2, null, C0UX6.RED_DOT_AUDIENCE_MODERATOR_GUIDE_TIPS, null);
                RedDotExtensionKt.LJI(null, lifecycleOwner2, null, C0UX6.RED_DOT_AUDIENCE_SHARE_MODERATOR_SETTING, null);
                RedDotExtensionKt.LJI(this.LL.findViewById(R.id.y7r), lifecycleOwner2, null, C0UX6.RED_DOT_AUDIENCE_SHARE_BUTTON, null);
                this.LLJJLIIIJLLLLLLLZ = true;
            }
        }
        LJIIIIZZ();
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void LLILLJJLI() {
        if (LiveToolbarIconStyleOptimize.INSTANCE.enable()) {
            AbstractC1106180etM abstractC1106180etM = this.LLJJJJLIIL;
            if (abstractC1106180etM != null && abstractC1106180etM.getVisibility() == 0) {
                return;
            }
            AbstractC1106180etM abstractC1106180etM2 = this.LLJJJJJIL;
            if (abstractC1106180etM2 != null && abstractC1106180etM2.getVisibility() == 0) {
                return;
            }
        }
        LiveIconView liveIconView = this.LLJJ;
        if (liveIconView != null) {
            liveIconView.setIconAttr(R.attr.cre);
            this.LLJJ.setIconTint(C20736316Cj.LIZIZ(R.attr.exs, this.LLJI));
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void LLILZ() {
        if (LiveToolbarIconStyleOptimize.INSTANCE.enable()) {
            AbstractC1106180etM abstractC1106180etM = this.LLJJJJLIIL;
            if (abstractC1106180etM != null && abstractC1106180etM.getVisibility() == 0) {
                return;
            }
            AbstractC1106180etM abstractC1106180etM2 = this.LLJJJJJIL;
            if (abstractC1106180etM2 != null && abstractC1106180etM2.getVisibility() == 0) {
                return;
            }
        }
        LiveIconView liveIconView = this.LLJJ;
        if (liveIconView != null) {
            liveIconView.setIconAttr(R.attr.cre);
            this.LLJJ.setIconTint(C20736316Cj.LIZIZ(R.attr.exs, this.LLJI));
        }
    }

    public final void LJIILIIL() {
        LJIILL();
        this.LLILLJJLI = false;
        this.LLILLL = null;
        if (this.LLJJ != null) {
            C786410Ut5.Zb(this.LLJJ, 1.0f);
            LiveIconView liveIconView = this.LLJJ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(liveIconView);
            liveIconView.setScaleY(1.0f);
            C786410Ut5.nd(this.LLJJ, 0.0f);
        }
        if (this.LLLILZJ != null) {
            C786410Ut5.Pb(this.LLLILZJ, 1.0f);
            C786410Ut5.qc(this.LLLILZJ, 1.0f);
            C786410Ut5.fd(this.LLLILZJ, 0.0f);
        }
    }

    public final void LJIILJJIL() {
        ViewGroup.LayoutParams layoutParams;
        LIZ();
        this.LLJLILLLLZIIL = false;
        C498770JhD c498770JhD = this.LLJLIL;
        if (c498770JhD != null) {
            c498770JhD.LLILLL = false;
        }
        LiveIconView liveIconView = this.LLJJ;
        if (liveIconView != null && (layoutParams = liveIconView.getLayoutParams()) != null) {
            layoutParams.width = this.LLL;
            layoutParams.height = this.LLLF;
            C786410Ut5.w6(this.LLJJ, layoutParams);
        }
        LiveIconView liveIconView2 = this.LLJJ;
        if (liveIconView2 != null) {
            ViewOutlineProvider viewOutlineProvider = this.LLJLLIL;
            if (viewOutlineProvider != null) {
                liveIconView2.setOutlineProvider(viewOutlineProvider);
            }
            this.LLJJ.setClipToOutline(this.LLJLLL);
            ImageView.ScaleType scaleType = this.LLJZ;
            if (scaleType != null) {
                this.LLJJ.setScaleType(scaleType);
            }
            this.LLJJ.invalidateOutline();
        }
        LJIILL();
        FrameLayout frameLayout = this.LLLILZJ;
        if (frameLayout != null && (frameLayout instanceof C1103540ep6)) {
            C1103540ep6 c1103540ep6 = (C1103540ep6) frameLayout;
            if (this.LLJZIJLIL) {
                c1103540ep6.LIZ();
            } else {
                c1103540ep6.setBackground(null);
            }
        }
        if (this.LLJJ != null) {
            C786410Ut5.i5(this.LLJJ, 1.0f);
        }
    }

    public final void LJIILL() {
        LiveIconView liveIconView;
        final boolean z = false;
        if (!LJFF() && (liveIconView = this.LLJJ) != null) {
            liveIconView.setIcon(R.drawable.es0);
            if (this.LLJJIJIIJIL || !LiveToolbarNoTitleShareCountEnable.INSTANCE.isEnable()) {
                return;
            }
            C786410Ut5.LLJJIJIL(this.LLJJ, 8);
            AbstractC1106180etM abstractC1106180etM = this.LLJJJJLIIL;
            if (abstractC1106180etM != null) {
                if (abstractC1106180etM.getVisibility() != 0) {
                    C786410Ut5.Y1(this.LLJJJJLIIL, 0);
                    return;
                }
                return;
            }
            if (LiveToolbarUIConfigOpt.INSTANCE.shareWithTextOpt()) {
                final EnumC1102980eoC enumC1102980eoCLIZIZ = C1102950eo9.LIZIZ(this.LLJIJIL);
                final Context context = this.LLJI;
                this.LLJJJJLIIL = new AbstractC1106180etM(enumC1102980eoCLIZIZ, context) { // from class: X.0etS
                    public final EnumC1102980eoC LL;
                    public final boolean LLILLJJLI;
                    public final int LLILLL;
                    public String LLILZ;
                    public float LLILZIL;
                    public float LLILZLL;
                    public float LLIZ;
                    public float LLIZLLLIL;
                    public float LLJ;
                    public final int LLJI;
                    public Paint LLJIJIL;
                    public Paint LLJILJIL;
                    public final Path LLJILJILJ;
                    public Bitmap LLJILLL;
                    public C20743516Fd LLJJ;
                    public Drawable LLJJI;
                    public Drawable LLJJIII;

                    public final void LIZIZ() {
                        float fMeasureText;
                        Paint.FontMetricsInt fontMetricsInt;
                        Paint.FontMetricsInt fontMetricsInt2;
                        Paint paint;
                        if (this.LLJIJIL == null || this.LLJILJIL == null) {
                            Paint paint2 = new Paint(1);
                            C1119920fFW.LIZLLL(getContext(), paint2, 11, OppoPermissionPopupMaskDelayExp.DEFAULT);
                            paint2.setColor(C20736316Cj.LIZIZ(R.attr.exs, getContext()));
                            paint2.setStyle(Paint.Style.FILL);
                            paint2.setTextSize((int) C497740JfY.LIZIZ(9.0f));
                            paint2.setAntiAlias(true);
                            this.LLJIJIL = paint2;
                            Paint paint3 = new Paint(1);
                            paint3.setColor(C20736316Cj.LIZIZ(R.attr.exm, getContext()));
                            paint3.setStyle(Paint.Style.STROKE);
                            paint3.setStrokeWidth((int) C497740JfY.LIZIZ(3.0f));
                            paint3.setTextSize((int) C497740JfY.LIZIZ(9.0f));
                            paint3.setAntiAlias(true);
                            this.LLJILJIL = paint3;
                        }
                        if (this.LL != EnumC1102980eoC.DEFAULT && this.LLILLL == 1 && (paint = this.LLJIJIL) != null) {
                            int length = this.LLILZ.length();
                            paint.setTextSize((int) (length != 1 ? (length == 2 || length == 3) ? C497740JfY.LIZIZ(10.0f) : C497740JfY.LIZIZ(9.0f) : C497740JfY.LIZIZ(11.0f)));
                        }
                        Paint paint4 = this.LLJIJIL;
                        float f = 0.0f;
                        if (paint4 == null || this.LLILZ.length() <= 0) {
                            fMeasureText = 0.0f;
                        } else {
                            String str = this.LLILZ;
                            fMeasureText = paint4.measureText(str, 0, str.length());
                        }
                        this.LLILZIL = fMeasureText;
                        Paint paint5 = this.LLJIJIL;
                        this.LLILZLL = (paint5 == null || (fontMetricsInt2 = paint5.getFontMetricsInt()) == null) ? 0.0f : fontMetricsInt2.descent - fontMetricsInt2.ascent;
                        Paint paint6 = this.LLJIJIL;
                        if (paint6 != null && (fontMetricsInt = paint6.getFontMetricsInt()) != null) {
                            int i = fontMetricsInt.descent;
                            f = ((i - fontMetricsInt.ascent) / 2) - i;
                        }
                        this.LLIZ = f;
                    }

                    @Override // android.view.View
                    public final void onAttachedToWindow() {
                        super.onAttachedToWindow();
                        if (this.LL == EnumC1102980eoC.DEFAULT) {
                            this.LLJILLL = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.erx);
                        } else {
                            C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.cre, getContext());
                            if (c20743516FdLIZLLL != null) {
                                c20743516FdLIZLLL.setTint(C20736316Cj.LIZIZ(R.attr.exs, getContext()));
                            } else {
                                c20743516FdLIZLLL = null;
                            }
                            this.LLJJ = c20743516FdLIZLLL;
                            this.LLJJI = getContext().getDrawable(R.drawable.ery);
                            this.LLJJIII = getContext().getDrawable(R.drawable.erz);
                        }
                        LIZIZ();
                    }

                    @Override // android.view.View
                    public final void onDetachedFromWindow() {
                        super.onDetachedFromWindow();
                        this.LLJIJIL = null;
                        this.LLJILJIL = null;
                        this.LLJILJILJ.reset();
                        this.LLJILLL = null;
                        this.LLJJ = null;
                        this.LLJJIII = null;
                    }

                    @Override // X.AbstractC1106180etM
                    public final void LIZ(Integer num) {
                        String strLIZIZ;
                        if (this.LLILLL != 2 && num != null && num.intValue() > 0) {
                            int iIntValue = num.intValue();
                            if (this.LL == EnumC1102980eoC.DEFAULT) {
                                strLIZIZ = C1850730yGF.LJIIIZ(iIntValue);
                            } else {
                                long j = iIntValue;
                                if (j < 1000) {
                                    strLIZIZ = String.valueOf(j);
                                } else if (j <= 100000) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(C341701Uh.LIZ("%.1f", Double.valueOf((j * 1.0d) / 1000.0d)));
                                    sbLIZ.append("K");
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                } else if (j < 1000000) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(C341701Uh.LIZ("%d", Long.valueOf(j / 1000)));
                                    sbLIZ2.append("K");
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                } else if (j <= 100000000) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(C341701Uh.LIZ("%.1f", Double.valueOf((j * 1.0d) / 1000000.0d)));
                                    sbLIZ3.append("M");
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                                } else if (j < 1000000000) {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append(C341701Uh.LIZ("%d", Long.valueOf(j / 1000000)));
                                    sbLIZ4.append("M");
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                                } else if (j <= 100000000000L) {
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append(C341701Uh.LIZ("%.1f", Double.valueOf((j * 1.0d) / 1.0E9d)));
                                    sbLIZ5.append("B");
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                                } else {
                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                    sbLIZ6.append(C341701Uh.LIZ("%d", Long.valueOf(j / 1000000000)));
                                    sbLIZ6.append("B");
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                                }
                            }
                            if (!Intrinsics.LJFF(this.LLILZ, strLIZIZ)) {
                                this.LLILZ = strLIZIZ;
                                LIZIZ();
                                invalidate();
                            }
                        }
                    }

                    @Override // android.view.View
                    public final void onDraw(Canvas canvas) {
                        float fLIZIZ;
                        Drawable drawable;
                        float f;
                        float fLIZIZ2;
                        float fLIZIZ3;
                        float fLIZIZ4;
                        float f2;
                        Paint paint;
                        super.onDraw(canvas);
                        float fLIZIZ5 = 0.0f;
                        if (this.LL == EnumC1102980eoC.DEFAULT) {
                            if (!this.LLILLJJLI && !((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
                                fLIZIZ3 = 0.0f;
                            } else {
                                fLIZIZ3 = (int) C497740JfY.LIZIZ(4.0f);
                            }
                            this.LLIZLLLIL = fLIZIZ3;
                            if (!this.LLILLJJLI && !((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
                                f2 = 0.0f;
                            } else {
                                if (this.LLILZ.length() <= 1) {
                                    fLIZIZ4 = C497740JfY.LIZIZ(6.0f);
                                } else {
                                    fLIZIZ4 = C497740JfY.LIZIZ(4.0f);
                                }
                                f2 = (int) fLIZIZ4;
                            }
                            this.LLJ = f2;
                            float width = (getWidth() - this.LLILZIL) - this.LLJ;
                            float height = (getHeight() - this.LLIZ) - this.LLIZLLLIL;
                            float f3 = width - this.LLJI;
                            float height2 = ((getHeight() - this.LLILZLL) - this.LLIZLLLIL) - 0.0f;
                            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
                            if (this.LLILZ.length() > 0) {
                                canvas.clipRect(f3, height2, getWidth(), getHeight(), Region.Op.DIFFERENCE);
                            }
                            Bitmap bitmap = this.LLJILLL;
                            if (bitmap != null) {
                                canvas.drawBitmap(bitmap, (getWidth() - bitmap.getWidth()) / 2.0f, (getHeight() - bitmap.getHeight()) / 2.0f, this.LLJIJIL);
                            }
                            canvas.restoreToCount(iSaveLayer);
                            if (this.LLILZ.length() > 0 && (paint = this.LLJIJIL) != null) {
                                canvas.drawText(this.LLILZ, width, height, paint);
                                return;
                            }
                            return;
                        }
                        if (this.LLILLL == 1) {
                            int iLIZIZ = (int) C497740JfY.LIZIZ(4.0f);
                            int length = this.LLILZ.length();
                            if (length != 0) {
                                if (length != 1) {
                                    drawable = this.LLJJIII;
                                    fLIZIZ5 = (int) C497740JfY.LIZIZ(-1.0f);
                                    fLIZIZ2 = C497740JfY.LIZIZ(1.0f);
                                } else {
                                    drawable = this.LLJJI;
                                    fLIZIZ2 = C497740JfY.LIZIZ(-2.0f);
                                }
                                f = (int) fLIZIZ2;
                            } else {
                                drawable = this.LLJJ;
                                f = 0.0f;
                            }
                            if (drawable != null) {
                                int i = (int) fLIZIZ5;
                                drawable.setBounds((getWidth() - ((int) C497740JfY.LIZIZ(24.0f))) / 2, ((getHeight() - ((int) C497740JfY.LIZIZ(24.0f))) / 2) + i, (getWidth() + ((int) C497740JfY.LIZIZ(24.0f))) / 2, ((getHeight() + ((int) C497740JfY.LIZIZ(24.0f))) / 2) + i);
                                drawable.draw(canvas);
                            }
                            if (this.LLILZ.length() <= 0) {
                                return;
                            }
                            float width2 = (((getWidth() + ((int) C497740JfY.LIZIZ(24.0f))) / 2) + f) - this.LLILZIL;
                            float height3 = ((((getHeight() + ((int) C497740JfY.LIZIZ(24.0f))) / 2) + iLIZIZ) + fLIZIZ5) - this.LLIZ;
                            Paint paint2 = this.LLJIJIL;
                            if (paint2 == null) {
                                return;
                            }
                            canvas.drawText(this.LLILZ, width2, height3, paint2);
                            return;
                        }
                        if (!this.LLILLJJLI && !((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
                            fLIZIZ = 0.0f;
                        } else {
                            fLIZIZ = (int) C497740JfY.LIZIZ(4.0f);
                        }
                        this.LLIZLLLIL = fLIZIZ;
                        if (this.LLILLJJLI || ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
                            fLIZIZ5 = (int) C497740JfY.LIZIZ(6.0f);
                        }
                        this.LLJ = fLIZIZ5;
                        float width3 = (getWidth() - this.LLILZIL) - this.LLJ;
                        float height4 = (getHeight() - this.LLIZ) - this.LLIZLLLIL;
                        C20743516Fd c20743516Fd = this.LLJJ;
                        if (c20743516Fd != null) {
                            c20743516Fd.setBounds((getWidth() - ((int) C497740JfY.LIZIZ(24.0f))) / 2, (getHeight() - ((int) C497740JfY.LIZIZ(24.0f))) / 2, (getWidth() + ((int) C497740JfY.LIZIZ(24.0f))) / 2, (getHeight() + ((int) C497740JfY.LIZIZ(24.0f))) / 2);
                            c20743516Fd.draw(canvas);
                        }
                        Paint paint3 = this.LLJIJIL;
                        if (paint3 != null) {
                            String str = this.LLILZ;
                            paint3.getTextPath(str, 0, str.length(), width3, height4, this.LLJILJILJ);
                        }
                        if (this.LLILZ.length() <= 0) {
                            return;
                        }
                        Paint paint4 = this.LLJILJIL;
                        if (paint4 != null) {
                            canvas.drawPath(this.LLJILJILJ, paint4);
                        }
                        Paint paint5 = this.LLJIJIL;
                        if (paint5 == null) {
                            return;
                        }
                        canvas.drawText(this.LLILZ, width3, height4, paint5);
                    }

                    {
                        super(context, null, 0);
                        this.LL = enumC1102980eoCLIZIZ;
                        this.LLILLJJLI = C497740JfY.LJIL();
                        this.LLILLL = LiveShareIconOptSetting.INSTANCE.getValue();
                        this.LLILZ = "";
                        this.LLJI = (int) C497740JfY.LIZIZ(1.0f);
                        this.LLJILJILJ = new Path();
                    }
                };
            } else {
                final Context context2 = this.LLJI;
                this.LLJJJJLIIL = new AbstractC1106180etM(context2, z) { // from class: X.0etT
                    public final boolean LL;
                    public Bitmap LLILLJJLI;
                    public Bitmap LLILLL;
                    public Paint LLILZ;
                    public Path LLILZIL;
                    public int LLILZLL;
                    public int LLIZ;
                    public int LLIZLLLIL;
                    public final int LLJ = 11;
                    public final int LLJI = 500;

                    public static /* synthetic */ void getFontWeight$annotations() {
                    }

                    @Override // android.view.View
                    public final void onAttachedToWindow() {
                        Bitmap bitmapCreateBitmap;
                        super.onAttachedToWindow();
                        if (this.LLILLJJLI == null && this.LL) {
                            Drawable drawableLIZ = LiveToolbarUIConfig.optimizeBackground() ? C1106260etU.LIZ(getContext()) : C800330VaR.LIZIZ(getContext(), R.drawable.e_f);
                            if (drawableLIZ == null) {
                                bitmapCreateBitmap = null;
                            } else if (drawableLIZ instanceof BitmapDrawable) {
                                bitmapCreateBitmap = ((BitmapDrawable) drawableLIZ).getBitmap();
                            } else {
                                int iLIZIZ = (int) C497740JfY.LIZIZ(C1099730eix.LIZJ(C497740JfY.LJIL(), false));
                                int iLIZIZ2 = (int) C497740JfY.LIZIZ(C1099730eix.LIZIZ(C497740JfY.LJIL(), false));
                                bitmapCreateBitmap = Bitmap.createBitmap(iLIZIZ, iLIZIZ2, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                drawableLIZ.setBounds(0, 0, iLIZIZ, iLIZIZ2);
                                drawableLIZ.draw(canvas);
                            }
                            this.LLILLJJLI = bitmapCreateBitmap;
                        }
                        if (this.LLILLL == null) {
                            this.LLILLL = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.erx);
                        }
                        if (this.LLILZ == null) {
                            this.LLILZ = new Paint(1);
                        }
                        if (this.LLILZIL == null) {
                            this.LLILZIL = new Path();
                        }
                    }

                    @Override // android.view.View
                    public final void onDetachedFromWindow() {
                        super.onDetachedFromWindow();
                        this.LLILZ = null;
                        this.LLILZIL = null;
                        this.LLILLJJLI = null;
                        this.LLILLL = null;
                    }

                    @Override // X.AbstractC1106180etM
                    public final void LIZ(Integer num) {
                        if (num != null) {
                            num.intValue();
                            this.LLILZLL = num.intValue();
                        }
                        invalidate();
                    }

                    @Override // android.view.View
                    public final void onDraw(Canvas canvas) {
                        float fLIZJ;
                        float fLIZJ2;
                        float f;
                        Paint paint;
                        Paint.FontMetricsInt fontMetricsInt;
                        Paint paint2;
                        Bitmap bitmap;
                        super.onDraw(canvas);
                        Paint paint3 = this.LLILZ;
                        if (paint3 != null) {
                            paint3.reset();
                        }
                        if (this.LLIZ <= 0 || this.LLIZLLLIL <= 0) {
                            this.LLIZ = getWidth();
                            this.LLIZLLLIL = getHeight();
                        }
                        float fLIZJ3 = 0.0f;
                        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, this.LLIZ, this.LLIZLLLIL, null, 31);
                        if (this.LL && (bitmap = this.LLILLJJLI) != null) {
                            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.LLILZ);
                        }
                        Paint paint4 = this.LLILZ;
                        if (paint4 != null) {
                            paint4.setColor(-1);
                        }
                        Paint paint5 = this.LLILZ;
                        if (paint5 != null) {
                            paint5.setStyle(Paint.Style.FILL);
                        }
                        String strLJIIIZ = C1850730yGF.LJIIIZ(this.LLILZLL);
                        int i = this.LLIZ;
                        Paint paint6 = this.LLILZ;
                        int iMeasureText = 0;
                        if (strLJIIIZ != null && strLJIIIZ.length() != 0 && paint6 != null) {
                            C1119920fFW.LIZLLL(getContext(), paint6, this.LLJ, this.LLJI);
                            paint6.setTextSize(C12ES.LIZJ(9.0f, getContext()));
                            iMeasureText = (int) paint6.measureText(strLJIIIZ, 0, strLJIIIZ.length());
                        }
                        float f2 = i - iMeasureText;
                        if (this.LL) {
                            fLIZJ = C12ES.LIZJ(20.0f, getContext());
                        } else {
                            fLIZJ = C12ES.LIZJ(14.0f, getContext());
                        }
                        float fLIZJ4 = C12ES.LIZJ(1.0f, getContext());
                        if (this.LL) {
                            if (String.valueOf(this.LLILZLL).length() == 1) {
                                fLIZJ2 = C12ES.LIZJ(6.0f, getContext());
                            } else {
                                fLIZJ2 = C12ES.LIZJ(3.0f, getContext());
                            }
                        } else {
                            fLIZJ2 = 0.0f;
                        }
                        if (this.LLILZLL > 0) {
                            Path path = this.LLILZIL;
                            if (path != null) {
                                path.reset();
                            }
                            Path path2 = this.LLILZIL;
                            if (path2 != null) {
                                path2.moveTo(0.0f, 0.0f);
                                path2.lineTo(this.LLIZ, 0.0f);
                                path2.lineTo(this.LLIZ, fLIZJ);
                                float f3 = (f2 - fLIZJ4) - fLIZJ2;
                                path2.lineTo(f3, fLIZJ);
                                path2.lineTo(f3, this.LLIZLLLIL);
                                path2.lineTo(0.0f, this.LLIZLLLIL);
                                path2.lineTo(0.0f, 0.0f);
                            }
                            Path path3 = this.LLILZIL;
                            if (path3 != null) {
                                canvas.clipPath(path3);
                            }
                        }
                        Bitmap bitmap2 = this.LLILLL;
                        if (bitmap2 != null) {
                            if (this.LL && (paint2 = this.LLILZ) != null) {
                                paint2.setAlpha(178);
                            }
                            canvas.drawBitmap(bitmap2, (this.LLIZ - bitmap2.getWidth()) / 2.0f, (this.LLIZLLLIL - bitmap2.getHeight()) / 2.0f, this.LLILZ);
                        }
                        canvas.restoreToCount(iSaveLayer);
                        Paint paint7 = this.LLILZ;
                        if (paint7 != null && (fontMetricsInt = paint7.getFontMetricsInt()) != null) {
                            f = fontMetricsInt.descent - fontMetricsInt.ascent;
                        } else {
                            f = 0.0f;
                        }
                        float fLIZJ5 = fLIZJ - C12ES.LIZJ(1.0f, getContext());
                        if (this.LLILZLL > 0) {
                            if (this.LL && (paint = this.LLILZ) != null) {
                                paint.setAlpha(191);
                            }
                            if (!this.LL) {
                                fLIZJ3 = C12ES.LIZJ(0.5f, getContext());
                            }
                            Paint paint8 = this.LLILZ;
                            if (paint8 != null) {
                                canvas.drawText(strLJIIIZ, (f2 - fLIZJ2) + fLIZJ3, fLIZJ5 + f, paint8);
                            }
                        }
                    }

                    {
                        this.LL = true;
                        this.LL = z;
                    }
                };
            }
            FrameLayout frameLayout = (FrameLayout) this.LL.getContentView();
            this.LLLILZJ = frameLayout;
            if (frameLayout != null) {
                if (this.LLJJJJLIIL.getParent() != null) {
                    C786410Ut5.LJJJLZIJ(this.LLJJJJLIIL, (ViewGroup) this.LLJJJJLIIL.getParent());
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C497740JfY.LIZIZ(32.0f), (int) C497740JfY.LIZIZ(24.0f));
                layoutParams.gravity = 17;
                this.LLLILZJ.addView(this.LLJJJJLIIL, layoutParams);
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDefaultIconView sharePanelSetting:0 mIsAnchor:");
        sbLIZ.append(this.LLILZ);
        C20441214yg.LIZIZ("voice_chat", C2188811AlT.LIZIZ(sbLIZ));
        Integer numLIZ = C1102840eny.LIZ(EnumC1102750enp.SHARE);
        LiveIconView liveIconView2 = this.LLJJ;
        if (liveIconView2 != null && numLIZ != null) {
            liveIconView2.setIcon(numLIZ.intValue());
        }
        if (this.LLJJIJIIJIL) {
            return;
        }
        if (LiveToolbarNoTitleShareCountEnable.INSTANCE.isEnable()) {
            C786410Ut5.LLJJIJIL(this.LLJJ, 8);
            AbstractC1106180etM abstractC1106180etM2 = this.LLJJJJJIL;
            final boolean z2 = true;
            if (abstractC1106180etM2 == null) {
                if (LiveToolbarUIConfigOpt.INSTANCE.shareWithTextOpt()) {
                    final EnumC1102980eoC enumC1102980eoCLIZIZ2 = C1102950eo9.LIZIZ(this.LLJIJIL);
                    final Context context3 = this.LLJI;
                    this.LLJJJJJIL = new AbstractC1106180etM(enumC1102980eoCLIZIZ2, context3) { // from class: X.0etS
                        public final EnumC1102980eoC LL;
                        public final boolean LLILLJJLI;
                        public final int LLILLL;
                        public String LLILZ;
                        public float LLILZIL;
                        public float LLILZLL;
                        public float LLIZ;
                        public float LLIZLLLIL;
                        public float LLJ;
                        public final int LLJI;
                        public Paint LLJIJIL;
                        public Paint LLJILJIL;
                        public final Path LLJILJILJ;
                        public Bitmap LLJILLL;
                        public C20743516Fd LLJJ;
                        public Drawable LLJJI;
                        public Drawable LLJJIII;

                        public final void LIZIZ() {
                            float fMeasureText;
                            Paint.FontMetricsInt fontMetricsInt;
                            Paint.FontMetricsInt fontMetricsInt2;
                            Paint paint;
                            if (this.LLJIJIL == null || this.LLJILJIL == null) {
                                Paint paint2 = new Paint(1);
                                C1119920fFW.LIZLLL(getContext(), paint2, 11, OppoPermissionPopupMaskDelayExp.DEFAULT);
                                paint2.setColor(C20736316Cj.LIZIZ(R.attr.exs, getContext()));
                                paint2.setStyle(Paint.Style.FILL);
                                paint2.setTextSize((int) C497740JfY.LIZIZ(9.0f));
                                paint2.setAntiAlias(true);
                                this.LLJIJIL = paint2;
                                Paint paint3 = new Paint(1);
                                paint3.setColor(C20736316Cj.LIZIZ(R.attr.exm, getContext()));
                                paint3.setStyle(Paint.Style.STROKE);
                                paint3.setStrokeWidth((int) C497740JfY.LIZIZ(3.0f));
                                paint3.setTextSize((int) C497740JfY.LIZIZ(9.0f));
                                paint3.setAntiAlias(true);
                                this.LLJILJIL = paint3;
                            }
                            if (this.LL != EnumC1102980eoC.DEFAULT && this.LLILLL == 1 && (paint = this.LLJIJIL) != null) {
                                int length = this.LLILZ.length();
                                paint.setTextSize((int) (length != 1 ? (length == 2 || length == 3) ? C497740JfY.LIZIZ(10.0f) : C497740JfY.LIZIZ(9.0f) : C497740JfY.LIZIZ(11.0f)));
                            }
                            Paint paint4 = this.LLJIJIL;
                            float f = 0.0f;
                            if (paint4 == null || this.LLILZ.length() <= 0) {
                                fMeasureText = 0.0f;
                            } else {
                                String str = this.LLILZ;
                                fMeasureText = paint4.measureText(str, 0, str.length());
                            }
                            this.LLILZIL = fMeasureText;
                            Paint paint5 = this.LLJIJIL;
                            this.LLILZLL = (paint5 == null || (fontMetricsInt2 = paint5.getFontMetricsInt()) == null) ? 0.0f : fontMetricsInt2.descent - fontMetricsInt2.ascent;
                            Paint paint6 = this.LLJIJIL;
                            if (paint6 != null && (fontMetricsInt = paint6.getFontMetricsInt()) != null) {
                                int i = fontMetricsInt.descent;
                                f = ((i - fontMetricsInt.ascent) / 2) - i;
                            }
                            this.LLIZ = f;
                        }

                        @Override // android.view.View
                        public final void onAttachedToWindow() {
                            super.onAttachedToWindow();
                            if (this.LL == EnumC1102980eoC.DEFAULT) {
                                this.LLJILLL = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.erx);
                            } else {
                                C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.cre, getContext());
                                if (c20743516FdLIZLLL != null) {
                                    c20743516FdLIZLLL.setTint(C20736316Cj.LIZIZ(R.attr.exs, getContext()));
                                } else {
                                    c20743516FdLIZLLL = null;
                                }
                                this.LLJJ = c20743516FdLIZLLL;
                                this.LLJJI = getContext().getDrawable(R.drawable.ery);
                                this.LLJJIII = getContext().getDrawable(R.drawable.erz);
                            }
                            LIZIZ();
                        }

                        @Override // android.view.View
                        public final void onDetachedFromWindow() {
                            super.onDetachedFromWindow();
                            this.LLJIJIL = null;
                            this.LLJILJIL = null;
                            this.LLJILJILJ.reset();
                            this.LLJILLL = null;
                            this.LLJJ = null;
                            this.LLJJIII = null;
                        }

                        @Override // X.AbstractC1106180etM
                        public final void LIZ(Integer num) {
                            String strLIZIZ;
                            if (this.LLILLL != 2 && num != null && num.intValue() > 0) {
                                int iIntValue = num.intValue();
                                if (this.LL == EnumC1102980eoC.DEFAULT) {
                                    strLIZIZ = C1850730yGF.LJIIIZ(iIntValue);
                                } else {
                                    long j = iIntValue;
                                    if (j < 1000) {
                                        strLIZIZ = String.valueOf(j);
                                    } else if (j <= 100000) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append(C341701Uh.LIZ("%.1f", Double.valueOf((j * 1.0d) / 1000.0d)));
                                        sbLIZ2.append("K");
                                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                    } else if (j < 1000000) {
                                        StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                                        sbLIZ22.append(C341701Uh.LIZ("%d", Long.valueOf(j / 1000)));
                                        sbLIZ22.append("K");
                                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ22);
                                    } else if (j <= 100000000) {
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append(C341701Uh.LIZ("%.1f", Double.valueOf((j * 1.0d) / 1000000.0d)));
                                        sbLIZ3.append("M");
                                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                                    } else if (j < 1000000000) {
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append(C341701Uh.LIZ("%d", Long.valueOf(j / 1000000)));
                                        sbLIZ4.append("M");
                                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                                    } else if (j <= 100000000000L) {
                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                        sbLIZ5.append(C341701Uh.LIZ("%.1f", Double.valueOf((j * 1.0d) / 1.0E9d)));
                                        sbLIZ5.append("B");
                                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                                    } else {
                                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                        sbLIZ6.append(C341701Uh.LIZ("%d", Long.valueOf(j / 1000000000)));
                                        sbLIZ6.append("B");
                                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                                    }
                                }
                                if (!Intrinsics.LJFF(this.LLILZ, strLIZIZ)) {
                                    this.LLILZ = strLIZIZ;
                                    LIZIZ();
                                    invalidate();
                                }
                            }
                        }

                        @Override // android.view.View
                        public final void onDraw(Canvas canvas) {
                            float fLIZIZ;
                            Drawable drawable;
                            float f;
                            float fLIZIZ2;
                            float fLIZIZ3;
                            float fLIZIZ4;
                            float f2;
                            Paint paint;
                            super.onDraw(canvas);
                            float fLIZIZ5 = 0.0f;
                            if (this.LL == EnumC1102980eoC.DEFAULT) {
                                if (!this.LLILLJJLI && !((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
                                    fLIZIZ3 = 0.0f;
                                } else {
                                    fLIZIZ3 = (int) C497740JfY.LIZIZ(4.0f);
                                }
                                this.LLIZLLLIL = fLIZIZ3;
                                if (!this.LLILLJJLI && !((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
                                    f2 = 0.0f;
                                } else {
                                    if (this.LLILZ.length() <= 1) {
                                        fLIZIZ4 = C497740JfY.LIZIZ(6.0f);
                                    } else {
                                        fLIZIZ4 = C497740JfY.LIZIZ(4.0f);
                                    }
                                    f2 = (int) fLIZIZ4;
                                }
                                this.LLJ = f2;
                                float width = (getWidth() - this.LLILZIL) - this.LLJ;
                                float height = (getHeight() - this.LLIZ) - this.LLIZLLLIL;
                                float f3 = width - this.LLJI;
                                float height2 = ((getHeight() - this.LLILZLL) - this.LLIZLLLIL) - 0.0f;
                                int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
                                if (this.LLILZ.length() > 0) {
                                    canvas.clipRect(f3, height2, getWidth(), getHeight(), Region.Op.DIFFERENCE);
                                }
                                Bitmap bitmap = this.LLJILLL;
                                if (bitmap != null) {
                                    canvas.drawBitmap(bitmap, (getWidth() - bitmap.getWidth()) / 2.0f, (getHeight() - bitmap.getHeight()) / 2.0f, this.LLJIJIL);
                                }
                                canvas.restoreToCount(iSaveLayer);
                                if (this.LLILZ.length() > 0 && (paint = this.LLJIJIL) != null) {
                                    canvas.drawText(this.LLILZ, width, height, paint);
                                    return;
                                }
                                return;
                            }
                            if (this.LLILLL == 1) {
                                int iLIZIZ = (int) C497740JfY.LIZIZ(4.0f);
                                int length = this.LLILZ.length();
                                if (length != 0) {
                                    if (length != 1) {
                                        drawable = this.LLJJIII;
                                        fLIZIZ5 = (int) C497740JfY.LIZIZ(-1.0f);
                                        fLIZIZ2 = C497740JfY.LIZIZ(1.0f);
                                    } else {
                                        drawable = this.LLJJI;
                                        fLIZIZ2 = C497740JfY.LIZIZ(-2.0f);
                                    }
                                    f = (int) fLIZIZ2;
                                } else {
                                    drawable = this.LLJJ;
                                    f = 0.0f;
                                }
                                if (drawable != null) {
                                    int i = (int) fLIZIZ5;
                                    drawable.setBounds((getWidth() - ((int) C497740JfY.LIZIZ(24.0f))) / 2, ((getHeight() - ((int) C497740JfY.LIZIZ(24.0f))) / 2) + i, (getWidth() + ((int) C497740JfY.LIZIZ(24.0f))) / 2, ((getHeight() + ((int) C497740JfY.LIZIZ(24.0f))) / 2) + i);
                                    drawable.draw(canvas);
                                }
                                if (this.LLILZ.length() <= 0) {
                                    return;
                                }
                                float width2 = (((getWidth() + ((int) C497740JfY.LIZIZ(24.0f))) / 2) + f) - this.LLILZIL;
                                float height3 = ((((getHeight() + ((int) C497740JfY.LIZIZ(24.0f))) / 2) + iLIZIZ) + fLIZIZ5) - this.LLIZ;
                                Paint paint2 = this.LLJIJIL;
                                if (paint2 == null) {
                                    return;
                                }
                                canvas.drawText(this.LLILZ, width2, height3, paint2);
                                return;
                            }
                            if (!this.LLILLJJLI && !((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
                                fLIZIZ = 0.0f;
                            } else {
                                fLIZIZ = (int) C497740JfY.LIZIZ(4.0f);
                            }
                            this.LLIZLLLIL = fLIZIZ;
                            if (this.LLILLJJLI || ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
                                fLIZIZ5 = (int) C497740JfY.LIZIZ(6.0f);
                            }
                            this.LLJ = fLIZIZ5;
                            float width3 = (getWidth() - this.LLILZIL) - this.LLJ;
                            float height4 = (getHeight() - this.LLIZ) - this.LLIZLLLIL;
                            C20743516Fd c20743516Fd = this.LLJJ;
                            if (c20743516Fd != null) {
                                c20743516Fd.setBounds((getWidth() - ((int) C497740JfY.LIZIZ(24.0f))) / 2, (getHeight() - ((int) C497740JfY.LIZIZ(24.0f))) / 2, (getWidth() + ((int) C497740JfY.LIZIZ(24.0f))) / 2, (getHeight() + ((int) C497740JfY.LIZIZ(24.0f))) / 2);
                                c20743516Fd.draw(canvas);
                            }
                            Paint paint3 = this.LLJIJIL;
                            if (paint3 != null) {
                                String str = this.LLILZ;
                                paint3.getTextPath(str, 0, str.length(), width3, height4, this.LLJILJILJ);
                            }
                            if (this.LLILZ.length() <= 0) {
                                return;
                            }
                            Paint paint4 = this.LLJILJIL;
                            if (paint4 != null) {
                                canvas.drawPath(this.LLJILJILJ, paint4);
                            }
                            Paint paint5 = this.LLJIJIL;
                            if (paint5 == null) {
                                return;
                            }
                            canvas.drawText(this.LLILZ, width3, height4, paint5);
                        }

                        {
                            super(context3, null, 0);
                            this.LL = enumC1102980eoCLIZIZ2;
                            this.LLILLJJLI = C497740JfY.LJIL();
                            this.LLILLL = LiveShareIconOptSetting.INSTANCE.getValue();
                            this.LLILZ = "";
                            this.LLJI = (int) C497740JfY.LIZIZ(1.0f);
                            this.LLJILJILJ = new Path();
                        }
                    };
                } else {
                    final Context context4 = this.LLJI;
                    this.LLJJJJJIL = new AbstractC1106180etM(context4, z2) { // from class: X.0etT
                        public final boolean LL;
                        public Bitmap LLILLJJLI;
                        public Bitmap LLILLL;
                        public Paint LLILZ;
                        public Path LLILZIL;
                        public int LLILZLL;
                        public int LLIZ;
                        public int LLIZLLLIL;
                        public final int LLJ = 11;
                        public final int LLJI = 500;

                        public static /* synthetic */ void getFontWeight$annotations() {
                        }

                        @Override // android.view.View
                        public final void onAttachedToWindow() {
                            Bitmap bitmapCreateBitmap;
                            super.onAttachedToWindow();
                            if (this.LLILLJJLI == null && this.LL) {
                                Drawable drawableLIZ = LiveToolbarUIConfig.optimizeBackground() ? C1106260etU.LIZ(getContext()) : C800330VaR.LIZIZ(getContext(), R.drawable.e_f);
                                if (drawableLIZ == null) {
                                    bitmapCreateBitmap = null;
                                } else if (drawableLIZ instanceof BitmapDrawable) {
                                    bitmapCreateBitmap = ((BitmapDrawable) drawableLIZ).getBitmap();
                                } else {
                                    int iLIZIZ = (int) C497740JfY.LIZIZ(C1099730eix.LIZJ(C497740JfY.LJIL(), false));
                                    int iLIZIZ2 = (int) C497740JfY.LIZIZ(C1099730eix.LIZIZ(C497740JfY.LJIL(), false));
                                    bitmapCreateBitmap = Bitmap.createBitmap(iLIZIZ, iLIZIZ2, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                                    drawableLIZ.setBounds(0, 0, iLIZIZ, iLIZIZ2);
                                    drawableLIZ.draw(canvas);
                                }
                                this.LLILLJJLI = bitmapCreateBitmap;
                            }
                            if (this.LLILLL == null) {
                                this.LLILLL = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.erx);
                            }
                            if (this.LLILZ == null) {
                                this.LLILZ = new Paint(1);
                            }
                            if (this.LLILZIL == null) {
                                this.LLILZIL = new Path();
                            }
                        }

                        @Override // android.view.View
                        public final void onDetachedFromWindow() {
                            super.onDetachedFromWindow();
                            this.LLILZ = null;
                            this.LLILZIL = null;
                            this.LLILLJJLI = null;
                            this.LLILLL = null;
                        }

                        @Override // X.AbstractC1106180etM
                        public final void LIZ(Integer num) {
                            if (num != null) {
                                num.intValue();
                                this.LLILZLL = num.intValue();
                            }
                            invalidate();
                        }

                        @Override // android.view.View
                        public final void onDraw(Canvas canvas) {
                            float fLIZJ;
                            float fLIZJ2;
                            float f;
                            Paint paint;
                            Paint.FontMetricsInt fontMetricsInt;
                            Paint paint2;
                            Bitmap bitmap;
                            super.onDraw(canvas);
                            Paint paint3 = this.LLILZ;
                            if (paint3 != null) {
                                paint3.reset();
                            }
                            if (this.LLIZ <= 0 || this.LLIZLLLIL <= 0) {
                                this.LLIZ = getWidth();
                                this.LLIZLLLIL = getHeight();
                            }
                            float fLIZJ3 = 0.0f;
                            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, this.LLIZ, this.LLIZLLLIL, null, 31);
                            if (this.LL && (bitmap = this.LLILLJJLI) != null) {
                                canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.LLILZ);
                            }
                            Paint paint4 = this.LLILZ;
                            if (paint4 != null) {
                                paint4.setColor(-1);
                            }
                            Paint paint5 = this.LLILZ;
                            if (paint5 != null) {
                                paint5.setStyle(Paint.Style.FILL);
                            }
                            String strLJIIIZ = C1850730yGF.LJIIIZ(this.LLILZLL);
                            int i = this.LLIZ;
                            Paint paint6 = this.LLILZ;
                            int iMeasureText = 0;
                            if (strLJIIIZ != null && strLJIIIZ.length() != 0 && paint6 != null) {
                                C1119920fFW.LIZLLL(getContext(), paint6, this.LLJ, this.LLJI);
                                paint6.setTextSize(C12ES.LIZJ(9.0f, getContext()));
                                iMeasureText = (int) paint6.measureText(strLJIIIZ, 0, strLJIIIZ.length());
                            }
                            float f2 = i - iMeasureText;
                            if (this.LL) {
                                fLIZJ = C12ES.LIZJ(20.0f, getContext());
                            } else {
                                fLIZJ = C12ES.LIZJ(14.0f, getContext());
                            }
                            float fLIZJ4 = C12ES.LIZJ(1.0f, getContext());
                            if (this.LL) {
                                if (String.valueOf(this.LLILZLL).length() == 1) {
                                    fLIZJ2 = C12ES.LIZJ(6.0f, getContext());
                                } else {
                                    fLIZJ2 = C12ES.LIZJ(3.0f, getContext());
                                }
                            } else {
                                fLIZJ2 = 0.0f;
                            }
                            if (this.LLILZLL > 0) {
                                Path path = this.LLILZIL;
                                if (path != null) {
                                    path.reset();
                                }
                                Path path2 = this.LLILZIL;
                                if (path2 != null) {
                                    path2.moveTo(0.0f, 0.0f);
                                    path2.lineTo(this.LLIZ, 0.0f);
                                    path2.lineTo(this.LLIZ, fLIZJ);
                                    float f3 = (f2 - fLIZJ4) - fLIZJ2;
                                    path2.lineTo(f3, fLIZJ);
                                    path2.lineTo(f3, this.LLIZLLLIL);
                                    path2.lineTo(0.0f, this.LLIZLLLIL);
                                    path2.lineTo(0.0f, 0.0f);
                                }
                                Path path3 = this.LLILZIL;
                                if (path3 != null) {
                                    canvas.clipPath(path3);
                                }
                            }
                            Bitmap bitmap2 = this.LLILLL;
                            if (bitmap2 != null) {
                                if (this.LL && (paint2 = this.LLILZ) != null) {
                                    paint2.setAlpha(178);
                                }
                                canvas.drawBitmap(bitmap2, (this.LLIZ - bitmap2.getWidth()) / 2.0f, (this.LLIZLLLIL - bitmap2.getHeight()) / 2.0f, this.LLILZ);
                            }
                            canvas.restoreToCount(iSaveLayer);
                            Paint paint7 = this.LLILZ;
                            if (paint7 != null && (fontMetricsInt = paint7.getFontMetricsInt()) != null) {
                                f = fontMetricsInt.descent - fontMetricsInt.ascent;
                            } else {
                                f = 0.0f;
                            }
                            float fLIZJ5 = fLIZJ - C12ES.LIZJ(1.0f, getContext());
                            if (this.LLILZLL > 0) {
                                if (this.LL && (paint = this.LLILZ) != null) {
                                    paint.setAlpha(191);
                                }
                                if (!this.LL) {
                                    fLIZJ3 = C12ES.LIZJ(0.5f, getContext());
                                }
                                Paint paint8 = this.LLILZ;
                                if (paint8 != null) {
                                    canvas.drawText(strLJIIIZ, (f2 - fLIZJ2) + fLIZJ3, fLIZJ5 + f, paint8);
                                }
                            }
                        }

                        {
                            this.LL = true;
                            this.LL = z2;
                        }
                    };
                }
            } else if (abstractC1106180etM2.getVisibility() != 0) {
                C786410Ut5.Y1(this.LLJJJJJIL, 0);
                this.LLJJJJJIL.LIZ(null);
            }
            FrameLayout frameLayout2 = (FrameLayout) this.LL.findViewById(R.id.y7a);
            this.LLLILZJ = frameLayout2;
            if (frameLayout2 != null) {
                if (LiveToolbarUIConfigOpt.INSTANCE.shareWithText()) {
                    FrameLayout frameLayout3 = this.LLLILZJ;
                    if (frameLayout3 instanceof C1103540ep6) {
                        frameLayout3.setBackground(null);
                    }
                }
                if (this.LLJJJJJIL.getParent() != null) {
                    C786410Ut5.LJJJLZIJ(this.LLJJJJJIL, (ViewGroup) this.LLJJJJJIL.getParent());
                }
                this.LLLILZJ.addView(this.LLJJJJJIL, new C19ME((int) C497740JfY.LIZIZ(C1099730eix.LIZJ(true, false)), (int) C497740JfY.LIZIZ(C1099730eix.LIZJ(true, false))));
            }
        }
        if (LiveToolbarUIConfigOpt.INSTANCE.overlayTextOnTheShare()) {
            if (this.LLJJJ > 0) {
                C500260Jjc.LLFFF(this.LLJJIJIL);
            }
        } else {
            C20743416Fc c20743416Fc = this.LLJJIJIL;
            if (c20743416Fc != null) {
                C786410Ut5.LLJJJJLIIL(c20743416Fc, 8);
            }
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean f1() {
        return ToolBarButtonWithTextExperiment.hasText();
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
        LLILLJJLI();
    }

    public final void LIZJ(View view) {
        if (!Boolean.TRUE.equals(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Tn(LLLIZZ.longValue()))) {
            return;
        }
        C20441214yg.LIZIZ("CoHostSuggestionToolTip", "Enqueueing");
        C785230UrB c785230UrB = new C785230UrB(view);
        String strLJIJI = C497740JfY.LJIJI(2131856544);
        Objects.requireNonNull(strLJIJI);
        c785230UrB.LJIJJ = strLJIJI;
        c785230UrB.LJIILL = new C521980KdY(this, 4);
        c785230UrB.LJIILLIIL = new C521970KdX(this, 4);
        C1113800f5e.LIZ.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.COHOST_SUGGESTION_SHARE_BUBBLE, this.LLJIJIL);
    }

    public final void LJ(Context context) {
        String strNo2;
        String str;
        String str2;
        InterfaceC1103130eoR interfaceC1103130eoR;
        if (LJIIZILJ(context)) {
            InterfaceC1106030et7.j7.LJFF(Boolean.TRUE);
            LJIIJ(Boolean.valueOf(this.LLILZ));
            if (!this.LLJJJJ) {
                if (!this.LLILZ && (interfaceC1103130eoR = this.LL) != null && interfaceC1103130eoR.findViewById(R.id.y7r) != null && this.LL.findViewById(R.id.y7r).getVisibility() == 0) {
                    RedDotExtensionKt.LIZ(C0UX6.RED_DOT_AUDIENCE_SHARE_BUTTON);
                    RedDotExtensionKt.LIZ(C0UX6.RED_DOT_AUDIENCE_SHARE_BUTTON_GAME_POINTS);
                }
                EnumC1102750enp.SHARE.setRedDotVisible(this.LLJIJIL, false);
            } else {
                this.LLJJJJ = false;
            }
            if (this.LLILLJJLI && !C2093608Ic.LJ(this.LLILLL)) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_share_button_click");
                c474500IjALIZ.LJIJJLI(this.LLJIJIL);
                c474500IjALIZ.LJJII(this.LLILLL, "share_platform");
                c474500IjALIZ.LIZ();
            }
            if (this.LLILLJJLI && this.LLILZ) {
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_anchor_share_button_click");
                c474500IjALIZ2.LJIJJLI(this.LLJIJIL);
                c474500IjALIZ2.LJJII("chat_merge", "share_platform");
                c474500IjALIZ2.LIZ();
            }
            if (this.LLILLJJLI) {
                LIZIZ();
            }
            if (!this.LLILZ) {
                if (LiveBroadcastLiveLogOpt.INSTANCE.canReport(0.001d)) {
                    C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_click_more_button");
                    c474500IjALIZ3.LJIJJLI(this.LLJIJIL);
                    c474500IjALIZ3.LJJII(Integer.valueOf(LJI() ? 1 : 0), "is_private_room");
                    c474500IjALIZ3.LIZ();
                }
                if (C1161920gLG.LIZJ(IInteractService.class) != null) {
                    strNo2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2();
                } else {
                    strNo2 = "";
                }
                User user = (User) this.LLJIJIL.gg0(RoomUserChannel.class);
                if (user != null && user.getUserAttr() != null && user.getUserAttr().isAdmin) {
                    str = "administrator";
                } else {
                    str = "normal";
                }
                int i = !RedDotExtensionKt.LJ(C0UX6.RED_DOT_SHARE_PANEL_SUGGEST_CREATOR_ENTRANCE) ? 1 : 0;
                if (this.LLLII) {
                    str2 = "suggest_creator";
                } else {
                    str2 = "icon";
                }
                C474500IjA c474500IjALIZ4 = C0IJT.LIZ("livesdk_live_audience_share_panel_show");
                c474500IjALIZ4.LJIJJLI(this.LLJIJIL);
                c474500IjALIZ4.LJJII("click", "action_type");
                c474500IjALIZ4.LJJII(str2, "enter_from");
                c474500IjALIZ4.LJJII(strNo2, "multi_tool");
                c474500IjALIZ4.LJJII(Integer.valueOf(i), "if_red_node_show");
                c474500IjALIZ4.LJJII(str, "audience_type");
                c474500IjALIZ4.LIZ();
            }
        }
    }

    public final void LJIIJ(Boolean bool) {
        String str;
        String strNo2;
        String strUq0;
        String str2;
        String str3;
        String str4;
        String str5;
        HashMap map = new HashMap();
        if (bool.booleanValue()) {
            map.put("request_page", "live_room");
            if (this.LLJJIJI) {
                str5 = "more";
            } else {
                str5 = "detail_bottom_bar";
            }
            map.put("position", str5);
            if (this.LLILZIL.existedTtlsGoods) {
                map.put("is_local_service_live", "1");
            }
            map.put("have_red_dot", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(EnumC1102750enp.SHARE.isRedDotShowing(this.LLJIJIL))) ? 1 : 0));
            str2 = "anchor_share_click";
        } else {
            Integer num = (Integer) this.LLJIJIL.gg0(RoomShareCountChannel.class);
            if (this.LLLII) {
                str = "suggest_creator";
            } else {
                str = "icon";
            }
            if (num == null) {
                num = 0;
            }
            map.put("share_num", num.toString());
            if (C1161920gLG.LIZJ(IInteractService.class) != null) {
                strNo2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2();
                strUq0 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Uq0(UserService.getInstance().user().getCurrentUserId());
            } else {
                strNo2 = "";
                strUq0 = "user";
            }
            try {
                User user = (User) this.LLJIJIL.gg0(RoomUserChannel.class);
                Objects.requireNonNull(user);
                if (user.getUserAttr().isAdmin) {
                    str3 = "administrator";
                } else {
                    str3 = "normal";
                }
                map.put("audience_type", str3);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Error:");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJ("toolbarShareBehavior", C2188811AlT.LIZIZ(sbLIZ));
            }
            map.put("multi_tool", strNo2);
            map.put("user_type", strUq0);
            map.put("enter_from", str);
            str2 = "user_share_click";
        }
        if (this.LLLILZ) {
            str4 = "long_press";
        } else {
            str4 = "click";
        }
        this.LLLILZ = false;
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str2);
        c474500IjALIZ.LJIJJLI(this.LLJIJIL);
        c474500IjALIZ.LJJII(C354201Zc.LIZ(this.LLILZIL.getStreamType()), "live_type");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(str4, "method");
        c474500IjALIZ.LIZ();
    }

    public final void LJIIJJI(C1084590eKX c1084590eKX) {
        String str;
        if (this.LLILZIL == null) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_interactive_motion_show");
        c474500IjALIZ.LJIJJLI(this.LLJIJIL);
        c474500IjALIZ.LJJII("share", "interactive_type");
        if (c1084590eKX.LIZJ) {
            str = "for_old";
        } else {
            str = "for_new";
        }
        c474500IjALIZ.LJJII(str, "interactive_sub_type");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLILZIL.getOwnerUserId()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLILZIL.getId()), "room_id");
        c474500IjALIZ.LIZ();
    }

    public final void LJIIL(C1084590eKX c1084590eKX) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_interaction_guide_show");
        c474500IjALIZ.LJIJJLI(this.LLJIJIL);
        c474500IjALIZ.LJJII("share", "guide_type");
        c474500IjALIZ.LJJII(c1084590eKX.LIZIZ, "guide_id");
        c474500IjALIZ.LJJII("", "guide_text");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0414 A[Catch: JSONException -> 0x0441, TryCatch #0 {JSONException -> 0x0441, blocks: (B:137:0x040e, B:139:0x0414, B:140:0x0419, B:141:0x043b), top: B:187:0x040e }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x043b A[Catch: JSONException -> 0x0441, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0441, blocks: (B:137:0x040e, B:139:0x0414, B:140:0x0419, B:141:0x043b), top: B:187:0x040e }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0521  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIZILJ(final android.content.Context r32) {
        /*
            Method dump skipped, instruction units count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1106110etF.LJIIZILJ(android.content.Context):boolean");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2;
        if (this.LLJLILLLLZIIL) {
            C498770JhD c498770JhD = this.LLJLIL;
            if (c498770JhD != null) {
                c498770JhD.LJ();
            }
            LJIILJJIL();
            return;
        }
        if (this.LLJL) {
            DataChannel dataChannel = this.LLJIJIL;
            if (dataChannel != null && (fragmentManager2 = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                SheetOptions sheetOptions = new SheetOptions();
                sheetOptions.LIZ(0, null);
                sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
                C19322110iZ.LIZLLL(fragmentManager2, LiveShareToStoryLearningFragment.class, "LiveShareToStoryLearningFragment", sheetOptions, null);
            }
            this.LLJL = false;
            return;
        }
        C498770JhD c498770JhD2 = this.LLJLIL;
        if (c498770JhD2 != null && c498770JhD2.LLILLL) {
            c498770JhD2.LLILLL = false;
            DataChannel dataChannel2 = this.LLJIJIL;
            if (dataChannel2 != null && (fragmentManager = (FragmentManager) dataChannel2.gg0(C1082960eHu.class)) != null) {
                String str = LiveRepostGuideFragment._pnsPageId;
                if (C474350Iiv.LIZ(fragmentManager, new InterfaceC474360Iiw() { // from class: X.0etK
                    @Override // X.InterfaceC474360Iiw
                    public final void LIZJ() {
                        C1106110etF c1106110etF = this.LIZ;
                        c1106110etF.onClick(c1106110etF.LL.LJ());
                    }
                }, "share_panel", null)) {
                    return;
                }
            }
        }
        LJ(view.getContext());
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (this.LLJLILLLLZIIL) {
            return;
        }
        if (iMessage instanceof ShareGuideMessage) {
            if (this.LLILZ) {
                ShareGuideMessage shareGuideMessage = (ShareGuideMessage) iMessage;
                if (this.LLJI != null) {
                    Room room = this.LLILZIL;
                    if ((room != null && room.getOwner() != null && ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).Sl1()) || this.LLIZLLLIL != LiveMode.VIDEO) {
                        return;
                    }
                    LJIILLIIL(shareGuideMessage, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
                    return;
                }
                return;
            }
            return;
        }
        if (!(iMessage instanceof RoomUserSeqMessage) || ((RoomUserSeqMessage) iMessage).mTotal <= 100 || !this.LLILLJJLI) {
            return;
        }
        LIZIZ();
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean x0(View view) {
        this.LLLILZ = true;
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        InterfaceC1085480eLy interfaceC1085480eLyO41;
        InterfaceC1103130eoR interfaceC1103130eoR2 = this.LL;
        if (interfaceC1103130eoR2 != null && interfaceC1103130eoR2.findViewById(R.id.y7r) != null) {
            C786410Ut5.LJLLLLLL(8, this.LL.findViewById(R.id.y7r));
        }
        if (this.LLJJJJLIIL != null) {
            this.LLJJJJLIIL = null;
        }
        if (this.LLJJJJJIL != null) {
            this.LLJJJJJIL = null;
        }
        if (this.LLLILZJ != null) {
            this.LLLILZJ = null;
        }
        LIZIZ();
        LIZ();
        IMessageManager iMessageManager = this.LLJILLL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        dataChannel.LC0(BroadcastToolbarUnloadEvent.class, EnumC1102750enp.SHARE);
        dataChannel.zQ2(this);
        if (this.LLILZ) {
            DataChannelGlobal.LLILZ.zQ2(this);
        }
        AnimatorSet animatorSet = this.LLILZLL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimator = this.LLIZ;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.LLJILJILJ.LJ();
        this.LLLIIIIL = null;
        C498770JhD c498770JhD = this.LLJLIL;
        if (c498770JhD != null) {
            Room roomLIZLLL = LIZLLL();
            ((Handler) c498770JhD.LLJ.getValue()).removeCallbacksAndMessages(null);
            c498770JhD.LLILZIL.LJ();
            if (roomLIZLLL != null && (interfaceC1085480eLyO41 = ((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).O41(roomLIZLLL.getId())) != null) {
                interfaceC1085480eLyO41.LJIL(c498770JhD);
            }
            c498770JhD.LLILZLL = null;
            c498770JhD.LLIZLLLIL = null;
            c498770JhD.LL = null;
            c498770JhD.LLIZ = null;
        }
        C1103170eoV c1103170eoV = this.LLLFFI;
        if (c1103170eoV != null) {
            c1103170eoV.LIZJ = null;
        }
        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).qg1(dataChannel, EnumC1120860fH2.SHARE_GUIDE_BUBBLE.getKey());
        this.LLLFZ = false;
        this.LLLIL = false;
        if (interfaceC1103130eoR.LJ() != null) {
            interfaceC1103130eoR.LJ().setAccessibilityDelegate(null);
        }
        if (LivePlayActivityLeaksOptSetting.enableToolbarShareBehaviorLeakOpt()) {
            this.LLJILJIL = null;
            this.LLJ = null;
            this.LLJI = null;
            this.LLJIJIL = null;
            this.LL = null;
        }
        C498820JhI c498820JhI = this.LLLIIIL;
        if (c498820JhI != null) {
            c498820JhI.LJFF = false;
            DataChannelGlobal.LLILZ.JQ2(C952020asi.class, Boolean.FALSE);
            c498820JhI.LJI.removeCallbacksAndMessages(null);
        }
    }

    public final void LJIILLIIL(ShareGuideMessage shareGuideMessage, final int i) {
        C1305440k4k c1305440k4kLIZIZ;
        Context context = this.LLJI;
        String str = null;
        if (context != null) {
            c1305440k4kLIZIZ = C1305440k4k.LIZIZ(context);
        } else {
            c1305440k4kLIZIZ = null;
        }
        String str2 = "";
        if (c1305440k4kLIZIZ != null) {
            str = (String) c1305440k4kLIZIZ.LIZLLL("live.mt.lastest.share.channel", EnumC1305450k4l.STRING, "");
        }
        if (((IHostShare) C1161920gLG.LIZJ(IHostShare.class)).isImChannel(str)) {
            ((IHostShare) C1161920gLG.LIZJ(IHostShare.class)).getUrlModelAndShowAnim(new C1106170etL(this, i));
            return;
        }
        Pair<String, Drawable> breathShareAnimShareRes = ((IHostShare) C1161920gLG.LIZJ(IHostShare.class)).getBreathShareAnimShareRes(this.LLJ, str, shareGuideMessage.shareChannel);
        if (breathShareAnimShareRes != null) {
            if (!C2093608Ic.LJ((String) breathShareAnimShareRes.first)) {
                str2 = (String) breathShareAnimShareRes.first;
            }
            this.LLILLL = str2;
            final Drawable drawable = (Drawable) breathShareAnimShareRes.second;
            if (drawable != null) {
                C1105770esh.LIZ().LIZ(new AbstractC1105780esi() { // from class: X.0etH
                    @Override // X.InterfaceC1105760esg
                    public final void call() {
                        C19EG c19eg;
                        C1106110etF c1106110etF = this.LLILZ;
                        Drawable drawable2 = drawable;
                        long j = i;
                        c1106110etF.getClass();
                        C1105740ese c1105740eseLIZ = C1105770esh.LIZ();
                        c1105740eseLIZ.LIZIZ = false;
                        c1105740eseLIZ.LIZLLL = null;
                        c1105740eseLIZ.LIZIZ();
                        if (c1106110etF.LLJJ == null || (c19eg = c1106110etF.LLJ) == null || c19eg.isFinishing() || C2093608Ic.LIZJ(c1106110etF.LLILLL, "copy") || c1106110etF.LJI() || c1106110etF.LLILLJJLI) {
                            return;
                        }
                        c1106110etF.LLILLJJLI = true;
                        if (!C2093608Ic.LJ(c1106110etF.LLILLL)) {
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_share_button_show");
                            c474500IjALIZ.LJIJJLI(c1106110etF.LLJIJIL);
                            c474500IjALIZ.LJJII(c1106110etF.LLILLL, "share_platform");
                            c474500IjALIZ.LIZ();
                            if (c1106110etF.LLILZ) {
                                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_anchor_share_button_show");
                                c474500IjALIZ2.LJIJJLI(c1106110etF.LLJIJIL);
                                c474500IjALIZ2.LJJII(c1106110etF.LLILLL, "share_platform");
                                c474500IjALIZ2.LIZ();
                            }
                        }
                        c1106110etF.LLJJ.setIcon(drawable2);
                        long j2 = j != -1 ? (j * 1000) / 600 : -1L;
                        c1106110etF.LLILZLL = new AnimatorSet();
                        LiveIconView liveIconView = c1106110etF.LLJJ;
                        Property property = View.SCALE_X;
                        float[] fArr = new float[2];
                        fArr[0] = c1106110etF.LLJJIJIIJIL ? 1.05f : 1.5f;
                        fArr[1] = 0.9f;
                        c1106110etF.LLIZ = ObjectAnimator.ofFloat(liveIconView, (Property<LiveIconView, Float>) property, fArr).setDuration(600L);
                        LiveIconView liveIconView2 = c1106110etF.LLJJ;
                        Property property2 = View.SCALE_Y;
                        float[] fArr2 = new float[2];
                        fArr2[0] = c1106110etF.LLJJIJIIJIL ? 1.05f : 1.5f;
                        fArr2[1] = 0.9f;
                        ObjectAnimator duration = ObjectAnimator.ofFloat(liveIconView2, (Property<LiveIconView, Float>) property2, fArr2).setDuration(600L);
                        c1106110etF.LLIZ.setRepeatMode(2);
                        duration.setRepeatMode(2);
                        if (c1106110etF.LLILZ) {
                            int i2 = (int) j2;
                            c1106110etF.LLIZ.setRepeatCount(i2);
                            duration.setRepeatCount(i2);
                        } else {
                            c1106110etF.LLIZ.setRepeatCount(-1);
                            duration.setRepeatCount(-1);
                        }
                        c1106110etF.LLILZLL.playTogether(c1106110etF.LLIZ, duration);
                        c1106110etF.LLIZ.addListener(new ALAdapterS13S0100000_17(c1106110etF, 76));
                        c1106110etF.LLILZLL.start();
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x037e  */
    @Override // X.InterfaceViewOnClickListenerC1102800enu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WH(X.InterfaceC1103130eoR r20, com.bytedance.ies.sdk.datachannel.DataChannel r21) {
        /*
            Method dump skipped, instruction units count: 1293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1106110etF.WH(X.0eoR, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    public C1106110etF(C19EG c19eg, Context context, LiveMode liveMode, LifecycleOwner lifecycleOwner) {
        this.LLJ = c19eg;
        this.LLJI = context;
        this.LLIZLLLIL = liveMode;
        this.LLJILJIL = lifecycleOwner;
    }
}
