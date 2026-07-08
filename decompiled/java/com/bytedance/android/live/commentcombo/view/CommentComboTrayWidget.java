package com.bytedance.android.live.commentcombo.view;

import X.AbstractC1098790ehR;
import X.AbstractC755190Tjp;
import X.C01C5;
import X.C01GW;
import X.C0J1N;
import X.C1078480eAg;
import X.C1088200eQM;
import X.C1090040eTK;
import X.C1090090eTP;
import X.C1110530f0N;
import X.C1115360f8A;
import X.C1115380f8C;
import X.C1119920fFW;
import X.C1124870fNV;
import X.C1161920gLG;
import X.C11RD;
import X.C11S5;
import X.C14MI;
import X.C16F5;
import X.C1701940uOG;
import X.C19476611Hw;
import X.C20736316Cj;
import X.C20743516Fd;
import X.C21627319kV;
import X.C2188811AlT;
import X.C2252331DDr;
import X.C416770GVv;
import X.C431500Gw0;
import X.C439101nJ;
import X.C452501pT;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C750640TcU;
import X.C750650TcV;
import X.C750970Td1;
import X.C755020TjY;
import X.C755030TjZ;
import X.C755260Tjw;
import X.C755400TkA;
import X.C775900Uc8;
import X.C786410Ut5;
import X.EnumC1101430elh;
import X.EnumC776080UcQ;
import X.InterfaceC1090070eTN;
import X.InterfaceC1097170eep;
import X.InterfaceC482090IvP;
import Y.AfS186S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.UserWannaSendMessageEvent;
import com.bytedance.android.live.commentcombo.LiveImproveHotCommentsSafetySetting;
import com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget;
import com.bytedance.android.live.commonactionpanel.ISheetPanelService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.publicscreen.impl.api.PublicScreenApi;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.chatroom.model.CommentTray;
import com.bytedance.android.livesdk.dataChannel.CommentComboTrayVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.CommentComboTrayWidgetVisibility;
import com.bytedance.android.livesdk.dataChannel.PublicScreenHeightInsufficient;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdk.model.message.CommentTrayMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.AwS631S0100000_17;
import wh6.AbS698S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public class CommentComboTrayWidget extends AnimatableRecyclableWidget implements InterfaceC1090070eTN {
    public boolean LLILLJJLI;
    public ViewGroup LLILLL;
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public C16F5 LLILZLL;
    public C16F5 LLIZ;
    public LiveIconView LLIZLLLIL;
    public long LLJ;
    public C1090090eTP LLJI;
    public Animator LLJIJIL;
    public boolean LLJJ;
    public Drawable LLJJI;
    public C20743516Fd LLJJIII;
    public C416770GVv LLJJIJI;
    public C416770GVv LLJJIJIIJIL;
    public final String LL = "…";
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 53));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 52));
    public final C21627319kV LLJILLL = C21627319kV.LIZJ();

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.hy1;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final View A1() {
        return !this.LLILLJJLI ? this.LLIZ : this.LLILLL;
    }

    public final void B1() {
        C1110530f0N c1110530f0N;
        C1090090eTP c1090090eTP = this.LLJI;
        if (c1090090eTP == null || c1090090eTP.LJIIIIZZ != 1) {
            if ((C500260Jjc.LJIIZILJ(this.dataChannel) || C01C5.LIZ(this.dataChannel)) && LiveImproveHotCommentsSafetySetting.INSTANCE.getValue() && !C500260Jjc.LJJII(C497740JfY.LIZ)) {
                C1090090eTP c1090090eTP2 = this.LLJI;
                if (c1090090eTP2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Pair(new C755400TkA(), new C755020TjY(new C755030TjZ(null, C500260Jjc.LJIIZILJ(this.dataChannel), C01C5.LIZ(this.dataChannel), C500260Jjc.LJJLIIIIJ(this.dataChannel), this.context, null, UserService.getInstance().user().getCurrentUser(), C500260Jjc.LJII(this.dataChannel), this.dataChannel, c1090090eTP2.LJI ? C497740JfY.LJIJI(2131844580) : C497740JfY.LJIJI(2131844572), new AwS561S0100000_17(this, 54), Boolean.TRUE, null, null))));
                    arrayList.add(new Pair(new AbstractC755190Tjp() { // from class: X.0Tk3
                        {
                            C497740JfY.LJIJI(2131853491);
                            C755200Tjq c755200Tjq = C755360Tk6.LIZ;
                            EnumC755230Tjt enumC755230Tjt = EnumC755230Tjt.SECTION1;
                        }
                    }, ((ISheetPanelService) C1161920gLG.LIZJ(ISheetPanelService.class)).wI2(new C750970Td1(this.context, UserService.getInstance().user().getCurrentUser(), C500260Jjc.LJII(this.dataChannel), this.dataChannel, c1090090eTP2.LIZ, c1090090eTP2.LIZIZ))));
                    arrayList.add(new Pair(new C755260Tjw(), new C750640TcU(new C750650TcV(UserService.getInstance().user().LJIJJLI(), C500260Jjc.LJIIZILJ(this.dataChannel), C01C5.LIZ(this.dataChannel), C500260Jjc.LJJLIIIIJ(this.dataChannel), this.context, null, UserService.getInstance().user().getCurrentUser(), C500260Jjc.LJII(this.dataChannel), this.dataChannel, null, true))));
                    FragmentManager fragmentManagerLJII = C500260Jjc.LJII(this.dataChannel);
                    if (fragmentManagerLJII != null) {
                        ((ISheetPanelService) C1161920gLG.LIZJ(ISheetPanelService.class)).tX(fragmentManagerLJII, arrayList);
                        return;
                    }
                    return;
                }
                return;
            }
            C1090090eTP c1090090eTP3 = this.LLJI;
            if (c1090090eTP3 != null) {
                if (c1090090eTP3.LIZJ == 2) {
                    C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
                    String str = c1090090eTP3.LIZIZ;
                    c1124870fNVLIZJ.getClass();
                    String strLIZIZ = C1124870fNV.LIZIZ(str);
                    if (strLIZIZ == null) {
                        strLIZIZ = "";
                    }
                    c1110530f0N = new C1110530f0N(8, strLIZIZ);
                    c1110530f0N.LJIILLIIL = c1090090eTP3.LIZIZ;
                } else {
                    c1110530f0N = new C1110530f0N(8, c1090090eTP3.LIZIZ);
                }
                ISendCommentEvent.Sender sender = ISendCommentEvent.Sender.COMMENT_COMBO_TRAY;
                sender.getLogArgs().clear();
                sender.getLogArgs().put("comment_tray_id", String.valueOf(this.LLJ));
                c1110530f0N.LJIIJ = sender;
                c1110530f0N.LJIIIZ = "combo_tray";
                this.dataChannel.LC0(UserWannaSendMessageEvent.class, c1110530f0N);
            }
        }
    }

    public final void D1() {
        C1090090eTP c1090090eTP;
        if (C1090040eTK.LLJIJIL == null || (c1090090eTP = C1090040eTK.LLILZIL) == null) {
            return;
        }
        if (c1090090eTP.LJI) {
            c1090090eTP.LJI = false;
            C1090040eTK.LJFF();
            return;
        }
        if (c1090090eTP.LJFF.length() > 0) {
            c1090090eTP.LJI = true;
            C1090040eTK.LJFF();
            return;
        }
        c1090090eTP.LJII = true;
        C1090040eTK.LJFF();
        C480460Ism.LIZ().getClass();
        PublicScreenApi publicScreenApi = (PublicScreenApi) C480460Ism.LIZLLL(PublicScreenApi.class);
        String str = c1090090eTP.LIZIZ;
        Room room = C1090040eTK.LLJI;
        long ownerUserId = room != null ? room.getOwnerUserId() : 0L;
        Room room2 = C1090040eTK.LLJI;
        C19476611Hw c19476611HwLJL = publicScreenApi.translateComment(str, ownerUserId, room2 != null ? room2.getId() : 0L, 0L, 0L, "", "", "").LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C11S5.LIZ());
        DataChannel dataChannel = C1090040eTK.LLJIJIL;
        ((C0J1N) c19476611HwLJL.LIZJ(C11RD.LJ(dataChannel != null ? dataChannel.LLILZ : null))).LIZ(new AfS186S0100000_17(c1090090eTP, 187), new AfS186S0100000_17(c1090090eTP, 188));
    }

    @Override // X.InterfaceC1090070eTN
    public void LJJLIIJ() {
        this.dataChannel.zW(CommentComboTrayWidgetVisibility.class, Boolean.FALSE);
        this.LLJI = null;
        y1();
        animateHide();
    }

    @Override // X.InterfaceC1090070eTN
    public final void LLLLL() {
        Animatable animatable;
        Animatable animatable2;
        C1090090eTP c1090090eTP = this.LLJI;
        if (c1090090eTP != null) {
            if (c1090090eTP.LJII) {
                Object obj = this.LLJJI;
                if ((obj instanceof Animatable) && (animatable2 = (Animatable) obj) != null) {
                    animatable2.start();
                }
            } else {
                Object obj2 = this.LLJJI;
                if ((obj2 instanceof Animatable) && (animatable = (Animatable) obj2) != null) {
                    animatable.stop();
                }
            }
            if (c1090090eTP.LJI) {
                E1(c1090090eTP.LJIIIIZZ, c1090090eTP.LJFF);
            } else {
                E1(c1090090eTP.LJIIIIZZ, c1090090eTP.LIZIZ);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onHideAnimationEnd() {
        if (C1090040eTK.LLILZLL) {
            return;
        }
        hide();
    }

    public void y1() {
        Animator animator = this.LLJIJIL;
        if (animator == null || !animator.isRunning()) {
            return;
        }
        animator.cancel();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        DataChannel dataChannel;
        super.hide();
        if ((this instanceof ExtendedCommentComboTrayWidget) || (dataChannel = this.dataChannel) == null) {
            return;
        }
        dataChannel.zW(CommentComboTrayVisibilityChannel.class, Boolean.FALSE);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        DataChannel dataChannel;
        super.show();
        if ((this instanceof ExtendedCommentComboTrayWidget) || (dataChannel = this.dataChannel) == null) {
            return;
        }
        dataChannel.zW(CommentComboTrayVisibilityChannel.class, Boolean.TRUE);
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onShowAnimationStart() {
        show();
    }

    @Override // X.InterfaceC1090070eTN
    public final void LJLI(long j) {
        StringBuilder sbLIZ;
        Animator animator;
        StringBuilder sbLIZ2;
        if (!this.LLILLJJLI) {
            C16F5 c16f5 = this.LLIZ;
            if (c16f5 != null) {
                if (C497740JfY.LJJ()) {
                    sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(j);
                    sbLIZ2.append((String) this.LLJILJILJ.getValue());
                } else {
                    sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append((String) this.LLJILJILJ.getValue());
                    sbLIZ2.append(j);
                }
                c16f5.setText(C2188811AlT.LIZIZ(sbLIZ2));
            }
        } else {
            C16F5 c16f52 = this.LLILZIL;
            if (c16f52 != null) {
                if (C497740JfY.LJJ()) {
                    sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(' ');
                    sbLIZ.append(j);
                } else {
                    sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(j);
                    sbLIZ.append(' ');
                }
                c16f52.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        y1();
        if (!this.LLJJ && (animator = this.LLJIJIL) != null) {
            animator.start();
        }
    }

    @Override // X.InterfaceC1090070eTN
    public void LLZILL(C1090090eTP c1090090eTP) {
        this.dataChannel.zW(CommentComboTrayWidgetVisibility.class, Boolean.TRUE);
        this.LLJI = c1090090eTP;
        y1();
        C1(c1090090eTP.LIZ, c1090090eTP.LIZIZ, c1090090eTP.LIZJ, c1090090eTP.LIZLLL, c1090090eTP.LJIIIZ, c1090090eTP.LJIIJ, c1090090eTP.LJIIIIZZ, c1090090eTP.LJIIJJI);
        animateShow();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onInit(Object[] objArr) {
        C416770GVv c416770GVv;
        C416770GVv c416770GVv2;
        int iLIZ;
        int iLIZ2;
        this.LLILZLL = (C16F5) findViewById(R.id.yjk);
        this.LLIZ = (C16F5) findViewById(R.id.yji);
        this.LLIZLLLIL = (LiveIconView) findViewById(R.id.yjm);
        C16F5 c16f5 = this.LLIZ;
        if (c16f5 != null) {
            c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, c16f5.getContext()), 2);
        }
        if (this.LLILLJJLI) {
            this.LLILLL = (ViewGroup) findViewById(R.id.e9o);
            this.LLILZ = (C16F5) findViewById(R.id.or0);
            this.LLILZIL = (C16F5) findViewById(R.id.eym);
            C16F5 c16f52 = this.LLILZ;
            if (c16f52 != null) {
                c16f52.setTypeface(C1119920fFW.LIZJ(c16f52.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, c16f52.getContext()), 2);
            }
            C16F5 c16f53 = this.LLILZIL;
            if (c16f53 != null) {
                c16f53.setTypeface(C1119920fFW.LIZJ(c16f53.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, c16f53.getContext()), 2);
            }
        }
        C16F5 c16f54 = this.LLILZLL;
        if (c16f54 != null) {
            c16f54.setMovementMethod(C431500Gw0.LIZ());
        }
        Drawable drawableLIZ = C14MI.LIZ(this.context, R.drawable.djr);
        AnimatorSet animatorSet = null;
        if (drawableLIZ != null) {
            drawableLIZ.setBounds(0, 0, C439101nJ.LIZ(14), C439101nJ.LIZ(10));
            drawableLIZ.setCallback(this.LLILZLL);
        } else {
            drawableLIZ = null;
        }
        this.LLJJI = drawableLIZ;
        if (drawableLIZ != null) {
            c416770GVv = new C416770GVv(drawableLIZ);
            c416770GVv.LL = C439101nJ.LIZ(3);
            c416770GVv.LLILZ = C497740JfY.LJIIIZ(R.dimen.avp);
        } else {
            c416770GVv = null;
        }
        this.LLJJIJI = c416770GVv;
        C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.csa, this.context);
        this.LLJJIII = c20743516FdLIZLLL;
        if (c20743516FdLIZLLL != null) {
            c20743516FdLIZLLL.setTint(C20736316Cj.LIZIZ(R.attr.fxc, this.context));
        }
        C20743516Fd c20743516Fd = this.LLJJIII;
        if (c20743516Fd != null) {
            if (this.LLILLJJLI) {
                iLIZ = C439101nJ.LIZ(14);
            } else {
                iLIZ = C439101nJ.LIZ(12);
            }
            if (this.LLILLJJLI) {
                iLIZ2 = C439101nJ.LIZ(14);
            } else {
                iLIZ2 = C439101nJ.LIZ(12);
            }
            c20743516Fd.setBounds(0, 0, iLIZ, iLIZ2);
        }
        C20743516Fd c20743516Fd2 = this.LLJJIII;
        if (c20743516Fd2 != null) {
            c416770GVv2 = new C416770GVv(c20743516Fd2);
            c416770GVv2.LL = C439101nJ.LIZ(3);
            c416770GVv2.LLILZ = C497740JfY.LJIIIZ(R.dimen.avp);
        } else {
            c416770GVv2 = null;
        }
        this.LLJJIJIIJIL = c416770GVv2;
        if (A1() != null) {
            animatorSet = new AnimatorSet();
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ObjectAnimator.ofFloat(A1(), (Property<View, Float>) View.SCALE_X, 1.5f, 1.0f).setDuration(200L), ObjectAnimator.ofFloat(A1(), (Property<View, Float>) View.SCALE_Y, 1.5f, 1.0f).setDuration(200L), ObjectAnimator.ofFloat(A1(), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(200L));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(ObjectAnimator.ofFloat(A1(), (Property<View, Float>) View.SCALE_X, 1.0f, 1.2f).setDuration(100L), ObjectAnimator.ofFloat(A1(), (Property<View, Float>) View.SCALE_Y, 1.0f, 1.2f).setDuration(100L));
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(A1(), (Property<View, Float>) View.SCALE_X, 1.2f, 1.0f).setDuration(100L), ObjectAnimator.ofFloat(A1(), (Property<View, Float>) View.SCALE_Y, 1.2f, 1.0f).setDuration(100L));
            animatorSet.playSequentially(animatorSet2, animatorSet3, animatorSet4);
        }
        this.LLJIJIL = animatorSet;
        C16F5 c16f55 = this.LLILZLL;
        if (c16f55 != null) {
            C786410Ut5.I7(new AbS698S0100000_17(this, 0, 42), c16f55);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public void onUnload(RecycleSource recycleSource) {
        C1090040eTK.LLILLJJLI = null;
        C1090040eTK.LLJJ = null;
        C1090040eTK.LLJILLL = null;
        y1();
        hide();
        if (LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getEnableCommentComboTrayAnim() && !C500260Jjc.LJIIZILJ(this.dataChannel)) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).ph1(EnumC1101430elh.COMMENT_COMBO_TRAY_ANIM);
        }
    }

    public final void x1(SpannableStringBuilder spannableStringBuilder) {
        Boolean boolValueOf;
        C1090090eTP c1090090eTP = this.LLJI;
        Boolean boolValueOf2 = null;
        if (c1090090eTP != null) {
            boolValueOf = Boolean.valueOf(c1090090eTP.LJII);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((char) 65532);
            C786410Ut5.q2(spannableStringBuilderAppend, this.LLJJIJI, 0, spannableStringBuilderAppend.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilderAppend);
            return;
        }
        C1090090eTP c1090090eTP2 = this.LLJI;
        if (c1090090eTP2 != null) {
            boolValueOf2 = Boolean.valueOf(c1090090eTP2.LJI);
        }
        if (!C500260Jjc.LJJJI(boolValueOf2)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilderAppend2 = new SpannableStringBuilder().append((char) 65532);
        C786410Ut5.q2(spannableStringBuilderAppend2, this.LLJJIJIIJIL, 0, spannableStringBuilderAppend2.length(), 33);
        C786410Ut5.q2(spannableStringBuilderAppend2, new AbstractC1098790ehR() { // from class: X.0eTR
            @Override // X.AbstractC431510Gw1
            public final void LIZ() {
                this.LLILZIL.D1();
            }

            @Override // X.AbstractC1098790ehR
            public final void LIZIZ(View view) {
                this.LLILZIL.D1();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }
        }, 0, spannableStringBuilderAppend2.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableStringBuilderAppend2);
    }

    public final void E1(long j, String str) {
        C16F5 c16f5 = this.LLILZLL;
        if (c16f5 != null) {
            if (j == 1) {
                c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), 500, c16f5.getContext()), 0);
                c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.exp, c16f5.getContext()));
                c16f5.setText(str);
                return;
            }
            c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, c16f5.getContext()), 2);
            C1115360f8A c1115360f8A = C1115380f8C.LIZ;
            C21627319kV c21627319kV = this.LLJILLL;
            if (str == null) {
                str = "";
            }
            C1115380f8C.LIZLLL(new SpannableStringBuilder(c21627319kV.LJFF(str)), c16f5.getResources(), this, new AwS631S0100000_17(this, 46));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public void onLoad(RecycleSource recycleSource, Object[] objArr) {
        Fragment parentFragment;
        Object obj;
        Fragment fragment;
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null && (fragment = interfaceC1097170eep.getFragment()) != null) {
            parentFragment = fragment.getParentFragment();
        } else {
            parentFragment = null;
        }
        C1090040eTK.LLJJ = parentFragment;
        C1090040eTK.LLILLJJLI = this;
        C1090040eTK.LJ();
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C1078480eAg) && (obj = ((C1078480eAg) obj2).LIZ) != null) {
                    if (obj instanceof CommentTrayMessage) {
                        C1090040eTK.LL.onMessage((IMessage) obj);
                    } else if (obj instanceof CommentTray) {
                        CommentTray commentTray = (CommentTray) obj;
                        C1090040eTK.LL.LIZIZ(new C1090090eTP(commentTray.trayId, commentTray.content, commentTray.contentType, commentTray.count, 0L, 0L, null, null, null, null, 8176));
                    }
                }
            }
        }
        this.dataChannel.EQ2(this, PublicScreenHeightInsufficient.class, new AwS596S0100000_17(this, 32));
        if (LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getEnableCommentComboTrayAnim() && !C500260Jjc.LJIIZILJ(this.dataChannel)) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).FA2(EnumC1101430elh.COMMENT_COMBO_TRAY_ANIM, new InterfaceC482090IvP() { // from class: X.0eTQ
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC482090IvP
                public final void LIZ(C0IS4 c0is4) {
                    CommentComboTrayWidget commentComboTrayWidget = this.LIZ;
                    boolean z = true;
                    if (((Number) c0is4.LIZ).intValue() < 1) {
                        z = false;
                    }
                    commentComboTrayWidget.LLJJ = z;
                }
            });
        }
        if (C500260Jjc.LJIIZILJ(this.dataChannel)) {
            AwS596S0100000_17 awS596S0100000_17 = new AwS596S0100000_17(this, 33);
            EnumC776080UcQ enumC776080UcQ = EnumC776080UcQ.HOT_COMMENT_TRAY_EFFECT_BLOCK;
            C2252331DDr c2252331DDr = C775900Uc8.LIZ;
            C775900Uc8.LJ(enumC776080UcQ, false, new AwS618S0100000_4(awS596S0100000_17, 63), 14);
        }
    }

    public SpannableStringBuilder z1(CharSequence charSequence, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(' ');
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ)).append(charSequence);
        C1119920fFW.LJIIIZ(this.context, spannableStringBuilderAppend, 0, str.length(), 33, 9);
        C786410Ut5.q2(spannableStringBuilderAppend, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.c9k, this.context)), 0, str.length(), 33);
        C1119920fFW.LJIIIZ(this.context, spannableStringBuilderAppend, str.length(), spannableStringBuilderAppend.length(), 33, 9);
        C786410Ut5.q2(spannableStringBuilderAppend, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.c9i, this.context)), str.length(), spannableStringBuilderAppend.length(), 33);
        x1(spannableStringBuilderAppend);
        return spannableStringBuilderAppend;
    }

    public final void C1(long j, String str, long j2, long j3, Integer num, Integer num2, long j4, String str2) {
        StringBuilder sbLIZ;
        StringBuilder sbLIZ2;
        Long lValueOf;
        this.LLJ = j;
        if (j2 == 2) {
            C1124870fNV.LIZJ().getClass();
            str = C1124870fNV.LIZIZ(str);
        } else if (j2 != 1) {
            str = "";
        }
        E1(j4, str);
        if (j4 == 1) {
            C500260Jjc.LLFFF(this.LLIZLLLIL);
            C500260Jjc.LJIILIIL(this.LLIZ);
            if (num != null) {
                int iIntValue = num.intValue();
                LiveIconView liveIconView = this.LLIZLLLIL;
                if (liveIconView != null) {
                    liveIconView.setIcon(iIntValue);
                }
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    LiveIconView liveIconView2 = this.LLIZLLLIL;
                    if (liveIconView2 != null) {
                        liveIconView2.setIconTint(iIntValue2);
                    }
                }
                C1088200eQM c1088200eQM = C1088200eQM.LIZ;
                Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.dataChannel);
                if (roomLJJLIIIIJ != null) {
                    lValueOf = Long.valueOf(roomLJJLIIIIJ.getId());
                } else {
                    lValueOf = null;
                }
                c1088200eQM.getClass();
                C1088200eQM.LIZJ(lValueOf, str2, false);
                return;
            }
            return;
        }
        C500260Jjc.LJIILIIL(this.LLIZLLLIL);
        if (!this.LLILLJJLI) {
            C500260Jjc.LLFFF(this.LLIZ);
            C16F5 c16f5 = this.LLIZ;
            if (c16f5 == null) {
                return;
            }
            if (C497740JfY.LJJ()) {
                sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(j3);
                sbLIZ2.append((String) this.LLJILJILJ.getValue());
            } else {
                sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append((String) this.LLJILJILJ.getValue());
                sbLIZ2.append(j3);
            }
            c16f5.setText(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        C16F5 c16f52 = this.LLILZIL;
        if (c16f52 == null) {
            return;
        }
        if (C497740JfY.LJJ()) {
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(' ');
            sbLIZ.append(j3);
        } else {
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(j3);
            sbLIZ.append(' ');
        }
        c16f52.setText(C2188811AlT.LIZIZ(sbLIZ));
    }
}
