package X;

import Y.ACListenerS152S0100000_17;
import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.PinMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import cu0.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS561S0100000_17;
import mr0.d;

/* JADX INFO: renamed from: X.0ezK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1109880ezK<TEXT_MODEL extends d<? extends AbstractC1136060ffY>, PINNED_MODEL extends b<TEXT_MODEL>> extends AbstractC1109840ezG<TEXT_MODEL, PINNED_MODEL> {
    public final boolean LLJJIJIIJIL;
    public final TextView LLJJIJIL;
    public final C1324720kZq LLJJJ;
    public final C1110060ezc LLJJJIL;
    public final View LLJJJJ;
    public final Drawable LLJJJJJIL;
    public final C416760GVu LLJJJJLIIL;
    public final C416770GVv LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;

    public abstract Drawable h6();

    public boolean v6(PINNED_MODEL pinned_model, List<? extends Object> list) {
        return false;
    }

    public final C0KVZ i6() {
        return (C0KVZ) this.LLJL.getValue();
    }

    public void q6() {
        C1109770ez9 c1109770ez9 = this.LL;
        if (!C500260Jjc.LJJJIL(c1109770ez9 != null ? c1109770ez9.LJIIIZ : null)) {
            w6("comment_field", "head", null);
            return;
        }
        IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
        C1109770ez9 c1109770ez92 = this.LL;
        iPublicScreenService.KR(c1109770ez92 != null ? c1109770ez92.LJIIIZ : null);
    }

    public void u6() {
        w6("comment_field", "name", null);
        MODEL model = this.LLJ;
        C499230Jhx.LIZJ(model != 0 ? model.LJIL : null);
    }

    @Override // X.AbstractC1109720ez4
    public final C1110060ezc N5() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC1109840ezG
    public final View b6() {
        return this.LLJJJJ;
    }

    @Override // X.AbstractC1109840ezG
    public void f6(final PINNED_MODEL pinned_model) {
        super.f6(pinned_model);
        if (!(pinned_model instanceof C1109610eyt)) {
            return;
        }
        X5().LIZJ().LJIIZILJ();
        C1109610eyt c1109610eyt = (C1109610eyt) pinned_model;
        if (c1109610eyt.LIZLLL == 1) {
            C0KVZ c0kvzI6 = i6();
            ArrayList arrayList = new ArrayList();
            if (!c1109610eyt.LJIIIZ.LIZJ) {
                c1109610eyt.LJ = true;
                c6().LJII();
                arrayList.add(c6());
                C1109020exw c1109020exw = c1109610eyt.LJIIIZ;
                if (c1109020exw.LJ && c1109020exw.LIZ() > 0) {
                    arrayList.add(V5());
                    V5().LJII();
                }
            } else {
                arrayList.add(W5());
                W5().LJII();
                X5().LJIIIZ();
            }
            c0kvzI6.setBadges(arrayList);
            return;
        }
        C0KVZ c0kvzI62 = i6();
        ArrayList arrayList2 = new ArrayList();
        C1109020exw c1109020exw2 = c1109610eyt.LJIIIZ;
        if (!c1109020exw2.LIZJ) {
            if (!c1109610eyt.LJ) {
                c1109610eyt.LJ = true;
                if (c1109020exw2.LJ) {
                    V5().LIZJ().LJJL = 0;
                    V5().LIZJ().LIZIZ = 0;
                    arrayList2.add(W5());
                    W5().LJIIJ(new InterfaceC1110610f0V() { // from class: X.0ezJ
                        @Override // X.InterfaceC1110610f0V
                        public final void invalidate() {
                            C1109020exw c1109020exw3 = ((C1109610eyt) pinned_model).LJIIIZ;
                            if (!c1109020exw3.LJ || c1109020exw3.LJII <= 0) {
                                return;
                            }
                            this.V5().LIZJ().LIZIZ = -1;
                            this.LLJJJJ.requestLayout();
                            C1110620f0W c1110620f0WLIZJ = this.V5().LIZJ();
                            c1110620f0WLIZJ.LJJL = 0;
                            ((ValueAnimator) c1110620f0WLIZJ.LJJLIIIJJI.getValue()).start();
                        }
                    });
                } else {
                    V5().LJII();
                    c6().LJII();
                    arrayList2.add(c6());
                }
            } else {
                V5().LJII();
                c6().LJII();
                arrayList2.add(c6());
            }
            C1109020exw c1109020exw3 = c1109610eyt.LJIIIZ;
            if (c1109020exw3.LJ && c1109020exw3.LIZ() > 0) {
                arrayList2.add(V5());
            }
        } else {
            arrayList2.add(W5());
            X5().LJIIIZ();
        }
        c0kvzI62.setBadges(arrayList2);
    }

    public void r6(String str) {
        C1109770ez9 c1109770ez9 = this.LL;
        if (c1109770ez9 != null) {
            AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o = this.LLJ;
            C1111350f1h c1111350f1h = new C1111350f1h();
            c1111350f1h.LJFF = str;
            c1111350f1h.LIZ = d6();
            c1111350f1h.LIZIZ = "long_press";
            c1109770ez9.LJII(abstractC1110800f0o, c1111350f1h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1109840ezG, X.AbstractC1109720ez4
    public void T5(PINNED_MODEL pinned_model, List<? extends Object> list) {
        Animatable animatable;
        CharSequence charSequenceLJLJLLL;
        Animatable animatable2;
        Animatable animatable3;
        ImageModel imageModelLJLLLLLL;
        super.T5(pinned_model, list);
        if (v6(pinned_model, list)) {
            return;
        }
        f6(pinned_model);
        final AbstractC1110520f0M abstractC1110520f0M = (AbstractC1110520f0M) this.LLJ;
        if (abstractC1110520f0M != 0) {
            C1109770ez9 c1109770ez9 = this.LL;
            if (c1109770ez9 != null) {
                c1109770ez9.LIZ(this.LLJJIJIL);
            }
            C1109770ez9 c1109770ez92 = this.LL;
            if (c1109770ez92 != null) {
                c1109770ez92.LIZ(this.LLJJJIL);
            }
            this.LLJJIJIL.setText(abstractC1110520f0M.LLJLL());
            MODEL model = this.LLJ;
            if (model != 0 && (imageModelLJLLLLLL = model.LJLLLLLL()) != null) {
                C1121670fIL.LJI(imageModelLJLLLLLL, this.LLJJJ);
            } else {
                C439101nJ.LJ(R.drawable.eu1, this.LLJJJ);
            }
            if (!abstractC1110520f0M.LLJZ().isEmpty()) {
                this.LLJJJIL.setMaxFoldedLinesWithoutRefresh(1);
            } else {
                this.LLJJJIL.setMaxFoldedLinesWithoutRefresh(2);
            }
            boolean z = false;
            CharSequence charSequence = "";
            if (abstractC1110520f0M instanceof InterfaceC759280TqQ) {
                InterfaceC759280TqQ interfaceC759280TqQ = (InterfaceC759280TqQ) abstractC1110520f0M;
                if (interfaceC759280TqQ.LJIILLIIL()) {
                    C1110060ezc c1110060ezc = this.LLJJJIL;
                    CharSequence content = abstractC1110520f0M.getContent();
                    if (content != null) {
                        charSequence = content;
                    }
                    c1110060ezc.setOriginText(charSequence);
                    C1110060ezc c1110060ezc2 = this.LLJJJIL;
                    SpannableString spannableString = new SpannableString(" ");
                    C786410Ut5.p2(spannableString, this.LLJJJJLIIL, 0, 1, 33);
                    c1110060ezc2.setSuffix(spannableString);
                    this.LLJJJIL.setAutoExpand(!pinned_model.LIZJ);
                    this.LLJJJIL.setText(new SpannableStringBuilder(this.LLJJJIL.getOriginText()).append(this.LLJJJIL.getSuffix()));
                    Object obj = this.LLJJJJJIL;
                    if ((obj instanceof Animatable) && (animatable3 = (Animatable) obj) != null) {
                        animatable3.start();
                    }
                } else {
                    Object obj2 = this.LLJJJJJIL;
                    if ((obj2 instanceof Animatable) && (animatable2 = (Animatable) obj2) != null) {
                        animatable2.stop();
                    }
                    if (interfaceC759280TqQ.LJLLL()) {
                        AbstractC1098790ehR abstractC1098790ehR = new AbstractC1098790ehR() { // from class: X.0ezL
                            @Override // X.AbstractC431510Gw1
                            public final void LIZ() {
                            }

                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                            public final void updateDrawState(TextPaint textPaint) {
                            }

                            @Override // X.AbstractC1098790ehR
                            public final void LIZIZ(View view) {
                                DataChannel dataChannel;
                                String str;
                                ((InterfaceC759280TqQ) abstractC1110520f0M).LJJIIJZLJL(false);
                                C1109770ez9 c1109770ez93 = this.LL;
                                if (c1109770ez93 != null) {
                                    c1109770ez93.LJIIIIZZ(abstractC1110520f0M);
                                }
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_undo_translate_comment");
                                C1109770ez9 c1109770ez94 = this.LL;
                                Boolean boolValueOf = null;
                                if (c1109770ez94 != null) {
                                    dataChannel = c1109770ez94.LJIIIZ;
                                } else {
                                    dataChannel = null;
                                }
                                c474500IjALIZ.LJIJJLI(dataChannel);
                                C1109770ez9 c1109770ez95 = this.LL;
                                if (c1109770ez95 != null) {
                                    boolValueOf = Boolean.valueOf(c1109770ez95.LJI);
                                }
                                if (C500260Jjc.LJJJI(boolValueOf)) {
                                    str = "anchor";
                                } else {
                                    str = "user";
                                }
                                c474500IjALIZ.LJJII(str, "user_type");
                                c474500IjALIZ.LJJII(Long.valueOf(abstractC1110520f0M.LLIIJI()), "to_user_id");
                                c474500IjALIZ.LIZ();
                            }
                        };
                        if (!TextUtils.isEmpty(interfaceC759280TqQ.LJLJLLL()) && (charSequenceLJLJLLL = interfaceC759280TqQ.LJLJLLL()) != null) {
                            charSequence = charSequenceLJLJLLL;
                        }
                        boolean z2 = pinned_model.LIZJ;
                        this.LLJJJIL.setOriginText(charSequence);
                        if (!pinned_model.LIZJ) {
                            this.LLJJJIL.setAutoExpand(true);
                        }
                        C1110060ezc c1110060ezc3 = this.LLJJJIL;
                        SpannableString spannableString2 = new SpannableString(" ");
                        C786410Ut5.p2(spannableString2, this.LLJJL, 0, 1, 33);
                        C786410Ut5.p2(spannableString2, abstractC1098790ehR, 0, 1, 33);
                        c1110060ezc3.setSuffix(spannableString2);
                        this.LLJJJIL.setText(new SpannableStringBuilder(this.LLJJJIL.getOriginText()).append(this.LLJJJIL.getSuffix()));
                        z = z2;
                    } else {
                        this.LLJJJIL.setSuffix("");
                        C1110060ezc c1110060ezc4 = this.LLJJJIL;
                        CharSequence content2 = abstractC1110520f0M.getContent();
                        if (content2 != null) {
                            charSequence = content2;
                        }
                        c1110060ezc4.setOriginText(charSequence);
                        C1110060ezc c1110060ezc5 = this.LLJJJIL;
                        c1110060ezc5.setText(c1110060ezc5.getOriginText());
                        this.LLJJJIL.setAutoExpand(!pinned_model.LIZJ);
                    }
                }
            } else {
                this.LLJJJIL.setSuffix("");
                C1110060ezc c1110060ezc6 = this.LLJJJIL;
                CharSequence content3 = abstractC1110520f0M.getContent();
                if (content3 != null) {
                    charSequence = content3;
                }
                c1110060ezc6.setOriginText(charSequence);
                C1110060ezc c1110060ezc7 = this.LLJJJIL;
                c1110060ezc7.setText(c1110060ezc7.getOriginText());
                this.LLJJJIL.setAutoExpand(!pinned_model.LIZJ);
                Object obj3 = this.LLJJJJJIL;
                if ((obj3 instanceof Animatable) && (animatable = (Animatable) obj3) != null) {
                    animatable.stop();
                }
            }
            if (this.LLJJLIIIJLLLLLLLZ && !pinned_model.LJI) {
                pinned_model.LJI = true;
                this.LLJJJIL.setAutoExpand(true);
            }
            show();
            I5(z);
        }
    }

    public AbstractC1109880ezK(View view, C1109770ez9 c1109770ez9, boolean z) {
        float f;
        super(view, c1109770ez9);
        this.LLJJIJIIJIL = z;
        TextView textView = (TextView) view.findViewById(R.id.p09);
        this.LLJJIJIL = textView;
        C1324720kZq c1324720kZq = (C1324720kZq) view.findViewById(R.id.o95);
        this.LLJJJ = c1324720kZq;
        C1110060ezc c1110060ezc = (C1110060ezc) view.findViewById(R.id.eu1);
        this.LLJJJIL = c1110060ezc;
        this.LLJJJJ = view.findViewById(R.id.m4t);
        this.LLJJLIIIJLLLLLLLZ = true;
        c1324720kZq.getHierarchy().LJIJI(0);
        C1098990ehl.LIZ(new ACListenerS152S0100000_17(this, 173), c1324720kZq);
        c1324720kZq.setOnLongClickListener(new ViewOnLongClickListenerC1151640g4g(this, 10));
        textView.setOnLongClickListener(new ViewOnLongClickListenerC1151640g4g(this, 8));
        C1098990ehl.LIZ(new ACListenerS152S0100000_17(this, 172), textView);
        if (C431500Gw0.LJI == null) {
            C431500Gw0.LJI = new C431500Gw0();
        }
        c1110060ezc.setMovementMethod(C431500Gw0.LJI);
        c1110060ezc.setHighlightColor(c1110060ezc.getResources().getColor(R.color.a1d));
        c1110060ezc.setStateChangedListener(this.LLILZIL);
        c1110060ezc.setOnLongClickListener(new ViewOnLongClickListenerC1151640g4g(this, 9));
        Drawable drawableLIZ = C14MI.LIZ(view.getContext(), R.drawable.djr);
        C416770GVv c416770GVv = null;
        if (drawableLIZ != null) {
            drawableLIZ.setBounds(0, 0, (int) C497740JfY.LIZIZ(14.0f), (int) C497740JfY.LIZIZ(10.0f));
            drawableLIZ.setCallback(this.LLJJJIL);
        } else {
            drawableLIZ = null;
        }
        this.LLJJJJJIL = drawableLIZ;
        c1110060ezc.setVerifiedDrawable(drawableLIZ);
        this.LLJJJJLIIL = new C416760GVu(drawableLIZ);
        C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.csa, view.getContext());
        if (c20743516FdLIZLLL != null) {
            c20743516FdLIZLLL.setTint(C20736316Cj.LIZIZ(R.attr.fxc, view.getContext()));
            if (z) {
                f = 24.0f;
            } else {
                f = 10.0f;
            }
            c20743516FdLIZLLL.setBounds(0, 0, (int) C497740JfY.LIZIZ(f), (int) C497740JfY.LIZIZ(z ? 24.0f : 10.0f));
            c416770GVv = new C416770GVv(c20743516FdLIZLLL);
            c416770GVv.LLILZ = C497740JfY.LJIIIZ(R.dimen.avp);
        }
        this.LLJJL = c416770GVv;
        W5().LJIIIIZZ(new InterfaceC1110610f0V(this) { // from class: X.0ezO
            public final /* synthetic */ AbstractC1109880ezK<TEXT_MODEL, PINNED_MODEL> LIZ;

            @Override // X.InterfaceC1110610f0V
            public final void invalidate() {
                this.LIZ.i6().invalidate();
            }

            {
                this.LIZ = this;
            }
        });
        V5().LJIIIIZZ(new InterfaceC1110610f0V(this) { // from class: X.0ezP
            public final /* synthetic */ AbstractC1109880ezK<TEXT_MODEL, PINNED_MODEL> LIZ;

            @Override // X.InterfaceC1110610f0V
            public final void invalidate() {
                this.LIZ.i6().invalidate();
            }

            {
                this.LIZ = this;
            }
        });
        view.setBackground(h6());
        this.LLJL = C452501pT.LIZIZ(new AwS561S0100000_17(view, 612));
    }

    public void w6(String str, String str2, String str3) {
        User user;
        long messageId;
        long j;
        C1109610eyt c1109610eyt;
        C1109020exw c1109020exw;
        PinMessage pinMessage;
        C1109610eyt c1109610eyt2;
        C1109020exw c1109020exw2;
        PinMessage pinMessage2;
        MODEL model = this.LLJ;
        if (model != 0 && (user = model.getUser()) != null) {
            C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
            UserProfileEvent userProfileEvent = new UserProfileEvent(user.getId(), str);
            AbstractC1136060ffY abstractC1136060ffY = this.LLJI;
            long messageId2 = 0;
            if (abstractC1136060ffY != null) {
                messageId = abstractC1136060ffY.getMessageId();
            } else {
                messageId = 0;
            }
            userProfileEvent.msgId = messageId;
            userProfileEvent.clickMethod = "pin";
            userProfileEvent.mSource = str2;
            AbstractC1136060ffY abstractC1136060ffY2 = this.LLJI;
            if (abstractC1136060ffY2 instanceof ChatMessage) {
                ChatMessage chatMessage = (ChatMessage) abstractC1136060ffY2;
                userProfileEvent.content = chatMessage.content;
                userProfileEvent.setEnigmaOutside(chatMessage.userInfo.enigmaInfo);
            }
            userProfileEvent.mReportType = d6();
            C1109610eyt c1109610eyt3 = this.LLILLJJLI;
            if ((c1109610eyt3 instanceof C1109610eyt) && (c1109610eyt2 = c1109610eyt3) != null && (c1109020exw2 = c1109610eyt2.LJIIIZ) != null && (pinMessage2 = c1109020exw2.LJI) != null) {
                j = pinMessage2.pinId;
            } else {
                j = 0;
            }
            userProfileEvent.pinId = j;
            if ((c1109610eyt3 instanceof C1109610eyt) && (c1109610eyt = c1109610eyt3) != null && (c1109020exw = c1109610eyt.LJIIIZ) != null && (pinMessage = c1109020exw.LJI) != null) {
                messageId2 = pinMessage.getMessageId();
            }
            userProfileEvent.pinMsgId = messageId2;
            userProfileEvent.mShowEntrance = "comment_area";
            userProfileEvent.mClickUserPosition = str3;
            c784440UpuLIZ.LIZIZ(userProfileEvent);
        }
    }
}
