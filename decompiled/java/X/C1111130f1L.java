package X;

import Y.ALAdapterS13S0100000_17;
import Y.ATListenerS450S0100000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.dynamicstrategy.PsInteractiveCount;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorIconSizeSetting;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceIconSizeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveBackupMessageOfflineTestSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatLineMarginSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenAvatarLoadSceneSampleRateSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenClickCloseKeyboardSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS413S0200000_12;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0f1L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1111130f1L extends AbstractC1111060f1E<AbstractC1110520f0M<? extends AbstractC1136060ffY>> implements InterfaceC1112700f3s {
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final View LLIZLLLIL;
    public final TextView LLJ;
    public final C1110070ezd LLJI;
    public final C0KVZ LLJIJIL;
    public final C0KVZ LLJILJIL;
    public final C421320Gfa LLJILJILJ;
    public C21538619Qy LLJILLL;
    public final ViewGroup LLJJ;
    public final View LLJJI;
    public final View LLJJIII;
    public final boolean LLJJIJI;
    public final int LLJJIJIIJIL;
    public final int LLJJIJIL;
    public final int LLJJJ;
    public final SpannableStringBuilder LLJJJIL;
    public final C21627319kV LLJJJJ;
    public boolean LLJJJJJIL;
    public final Drawable LLJJJJLIIL;
    public final C20743516Fd LLJJL;
    public final C20743516Fd LLJJLIIIJLLLLLLLZ;
    public final C416760GVu LLJL;
    public AbstractC1136060ffY LLJLIL;
    public ValueAnimator LLJLILLLLZIIL;
    public ValueAnimator LLJLL;
    public boolean LLJLLIL;
    public int LLJLLL;
    public final HashSet<String> LLJZ;
    public final HashSet<Long> LLJZIJLIL;
    public boolean LLL;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void U5() {
        if (!this.LLJJJJJIL) {
            C21538619Qy c21538619Qy = this.LLJILLL;
            if (c21538619Qy != null) {
                int[] iArr = new int[2];
                iArr[0] = this.LLILZIL ? C20736316Cj.LIZIZ(R.attr.c8k, this.itemView.getContext()) : C20736316Cj.LIZIZ(R.attr.ez9, this.itemView.getContext());
                iArr[1] = 0;
                c21538619Qy.setGradientColors(iArr);
                return;
            }
            return;
        }
        C21538619Qy c21538619Qy2 = this.LLJILLL;
        if (c21538619Qy2 != null) {
            c21538619Qy2.setBottomStartRadius(0.0f);
            c21538619Qy2.setTopStartRadius(0.0f);
            C19ME c19me = new C19ME(-1, 0);
            c19me.setMargins(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            c19me.startToStart = 0;
            c19me.endToEnd = 0;
            c19me.topToTop = 0;
            c19me.bottomToBottom = 0;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21538619Qy2);
            c21538619Qy2.setLayoutParams(c19me);
            c21538619Qy2.setGradientColors(new int[]{0, C20736316Cj.LIZIZ(R.attr.cd0, this.itemView.getContext()), 0});
        }
    }

    @Override // X.AbstractC1111020f1A, X.InterfaceC1111030f1B
    public final int V0() {
        return this.LLJI.getLineCount();
    }

    public final void V5() {
        DataChannel dataChannel;
        C1109770ez9 c1109770ez9 = this.LL;
        if (c1109770ez9 != null && (dataChannel = c1109770ez9.LJIIIZ) != null) {
            dataChannel.FQ2(PsInteractiveCount.class);
        }
        C1109770ez9 c1109770ez92 = this.LL;
        if (c1109770ez92 != null) {
            AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o = this.LLILLJJLI;
            C1111350f1h c1111350f1h = new C1111350f1h();
            c1111350f1h.LJFF = "comment";
            c1111350f1h.LIZ = "report_message";
            c1111350f1h.LIZIZ = "long_press";
            c1109770ez92.LJII(abstractC1110800f0o, c1111350f1h);
        }
    }

    public final void a6() throws Throwable {
        if (this.LLILZLL) {
            return;
        }
        C1152540g68.LIZIZ(this.LLJI, this.LLIZ, this.LLILZIL, this.LLL);
        C1152540g68.LIZLLL(this.LLJ, this.LLIZ, this.LLILZIL, this.LLL);
    }

    @Override // X.InterfaceC1112700f3s
    public final InterfaceC1112320f3G i4() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC1111020f1A
    public final void LLIILZL() {
        Animatable animatable;
        super.LLIILZL();
        AbstractC1113530f5D abstractC1113530f5D = this.LLILZ;
        if (abstractC1113530f5D != null) {
            abstractC1113530f5D.LJIIIIZZ();
        }
        Object obj = this.LLJJJJLIIL;
        if ((obj instanceof Animatable) && (animatable = (Animatable) obj) != null) {
            animatable.stop();
        }
        this.LLJJJIL.clear();
        this.LLJI.setText("");
        this.LLJLIL = null;
        C0KVZ c0kvz = this.LLJIJIL;
        if (c0kvz != null) {
            c0kvz.LIZ();
        }
        C0KVZ c0kvz2 = this.LLJILJIL;
        if (c0kvz2 != null) {
            c0kvz2.LIZ();
        }
    }

    @Override // X.AbstractC1111020f1A
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        this.LLJLLIL = false;
    }

    @Override // X.AbstractC1111020f1A
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C21538619Qy c21538619Qy = this.LLJILLL;
        if (c21538619Qy != null) {
            C786410Ut5.LLJJL(c21538619Qy, 8);
        }
        ValueAnimator valueAnimator = this.LLJLILLLLZIIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LLJLL;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // X.InterfaceC1112700f3s
    public final void LLZLLLL(boolean z) {
        Boolean boolValueOf;
        C1110330f03 c1110330f03LJJJIL;
        String string;
        AbstractC1110520f0M abstractC1110520f0M = this.LLILLJJLI;
        Boolean boolValueOf2 = null;
        if (abstractC1110520f0M != null && abstractC1110520f0M.LJJIJL() != null) {
            AbstractC1110800f0o abstractC1110800f0o = this.LLILLJJLI;
            if (abstractC1110800f0o != null) {
                boolValueOf = Boolean.valueOf(abstractC1110800f0o.LJIL.isHistoryMessage);
            } else {
                boolValueOf = null;
            }
            if (!C500260Jjc.LJJIFFI(boolValueOf)) {
                String str = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.mentionMsgId;
                AbstractC1136060ffY abstractC1136060ffY = this.LLJLIL;
                if (abstractC1136060ffY != null) {
                    string = Long.valueOf(abstractC1136060ffY.getMessageId()).toString();
                } else {
                    string = null;
                }
                if (!u.LJIJI(string, str, false)) {
                    return;
                }
            }
            if (!this.LLJLLIL) {
                AbstractC1110520f0M abstractC1110520f0M2 = this.LLILLJJLI;
                if (abstractC1110520f0M2 != null && (c1110330f03LJJJIL = abstractC1110520f0M2.LJJJIL()) != null) {
                    boolValueOf2 = Boolean.valueOf(c1110330f03LJJJIL.LIZ);
                }
                if (!C500260Jjc.LJJJI(boolValueOf2)) {
                    if (this.LLJILLL == null) {
                        if (this.LLJJJJJIL) {
                            C21538619Qy c21538619Qy = new C21538619Qy(this.LLJJ.getContext());
                            this.LLJILLL = c21538619Qy;
                            this.LLJJ.addView(c21538619Qy, -1);
                        } else {
                            C21538619Qy c21538619Qy2 = new C21538619Qy(this.LLJJ.getContext());
                            c21538619Qy2.setBottomStartRadius(C497740JfY.LJIIIZ(R.dimen.avf));
                            c21538619Qy2.setTopStartRadius(c21538619Qy2.getBottomStartRadius());
                            this.LLJILLL = c21538619Qy2;
                            ConstraintLayout constraintLayout = (ConstraintLayout) this.LLJJ;
                            C19ME c19me = new C19ME(-1, 0);
                            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                            c19me.setMargins(iLIZIZ2, iLIZIZ, iLIZIZ2, iLIZIZ);
                            c19me.startToStart = 0;
                            c19me.endToEnd = 0;
                            c19me.topToTop = 0;
                            c19me.bottomToBottom = 0;
                            constraintLayout.addView(c21538619Qy2, -1, c19me);
                        }
                        U5();
                        ValueAnimator valueAnimator = this.LLJLILLLLZIIL;
                        if (valueAnimator != null) {
                            valueAnimator.addListener(new ALAdapterS13S0100000_17(this, 130));
                        }
                        ValueAnimator valueAnimator2 = this.LLJLL;
                        if (valueAnimator2 != null) {
                            valueAnimator2.addListener(new ALAdapterS13S0100000_17(this, 131));
                        }
                    }
                    this.LLJLLIL = true;
                    AbstractC1110520f0M abstractC1110520f0M3 = this.LLILLJJLI;
                    if (abstractC1110520f0M3 != null) {
                        abstractC1110520f0M3.LLLF(z);
                    }
                    if (this.LL != null) {
                        C21538619Qy c21538619Qy3 = this.LLJILLL;
                        if (c21538619Qy3 != null) {
                            C786410Ut5.LLJJL(c21538619Qy3, 0);
                        }
                        C21538619Qy c21538619Qy4 = this.LLJILLL;
                        if (c21538619Qy4 != null) {
                            C786410Ut5.n5(c21538619Qy4, 0.0f);
                        }
                        if (this.LLJJJJJIL) {
                            ValueAnimator duration = ValueAnimator.ofFloat(0.3f, 1.0f).setDuration(700L);
                            duration.setInterpolator(C1619980sG4.LIZLLL());
                            duration.addUpdateListener(new AUListenerS266S0100000_17(this, 163));
                            duration.start();
                            this.LLJLILLLLZIIL = duration;
                            ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(1500L);
                            duration2.setInterpolator(C1619980sG4.LIZLLL());
                            duration2.addUpdateListener(new AUListenerS266S0100000_17(this, 164));
                            duration2.setStartDelay(1700L);
                            duration2.start();
                            this.LLJLL = duration2;
                        } else {
                            ValueAnimator duration3 = ValueAnimator.ofFloat(0.0f, 1.0f, 0.0f, 1.0f, 0.0f).setDuration(1000L);
                            duration3.addUpdateListener(new AUListenerS266S0100000_17(this, 165));
                            duration3.start();
                            this.LLJLILLLLZIIL = duration3;
                            ValueAnimator duration4 = ValueAnimator.ofFloat(0.0f, 1.0f, 0.0f, 1.0f, 0.0f).setDuration(1000L);
                            duration4.addUpdateListener(new AUListenerS266S0100000_17(this, 166));
                            duration4.setStartDelay(2000L);
                            duration4.start();
                            this.LLJLL = duration4;
                        }
                        C1109770ez9 c1109770ez9 = this.LL;
                        if (c1109770ez9 != null) {
                            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_highlight_message_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                            c474500IjALIZIZ.LJIJJLI(c1109770ez9.LJIIIZ);
                            c474500IjALIZIZ.LIZ();
                        }
                    }
                }
            }
        }
    }

    public final void S5(AbstractC1110520f0M<? extends AbstractC1136060ffY> abstractC1110520f0M) {
        List arrayList;
        Collection<AbstractC498530Jgp<? extends AbstractC521080Kc6>> collectionLLJLILLLLZIIL = abstractC1110520f0M.LLJLILLLLZIIL();
        C520950Kbt c520950Kbt = abstractC1110520f0M.LJJII;
        if (c520950Kbt == null || (arrayList = c520950Kbt.LJ) == null) {
            arrayList = new ArrayList();
        }
        if (collectionLLJLILLLLZIIL.isEmpty()) {
            C0KVZ c0kvz = this.LLJIJIL;
            if (c0kvz != null) {
                C786410Ut5.LLJZ(c0kvz, 8);
            }
        } else {
            C0KVZ c0kvz2 = this.LLJIJIL;
            if (c0kvz2 != null) {
                C786410Ut5.LLJZ(c0kvz2, 0);
            }
        }
        C0KVZ c0kvz3 = this.LLJIJIL;
        if (c0kvz3 != null) {
            c0kvz3.setBadges(C19719512Dh.LIZIZ(collectionLLJLILLLLZIIL));
        }
        if (arrayList.isEmpty()) {
            C0KVZ c0kvz4 = this.LLJILJIL;
            if (c0kvz4 != null) {
                C786410Ut5.LLJZ(c0kvz4, 8);
            }
        } else {
            C0KVZ c0kvz5 = this.LLJILJIL;
            if (c0kvz5 != null) {
                C786410Ut5.LLJZ(c0kvz5, 0);
            }
        }
        C0KVZ c0kvz6 = this.LLJILJIL;
        if (c0kvz6 != null) {
            c0kvz6.setBadges(C19719512Dh.LIZIZ(arrayList));
        }
    }

    public final int T5(C1109770ez9 c1109770ez9) {
        int value;
        if (c1109770ez9.LJJ) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        }
        if (this.LLILZIL) {
            if (this.LLIZ) {
                value = LivePublicScreenUiConfigAnchorIconSizeSetting.INSTANCE.getValue();
            } else {
                value = LivePublicScreenUiConfigAudienceIconSizeSetting.INSTANCE.getValue();
            }
            return (int) C497740JfY.LIZIZ(value);
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    }

    public final void X5(int i) {
        if (i > 0) {
            if (this.LLJLLL != i) {
                this.LLJLLL = i;
                View view = this.LLJJI;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJLLL)));
                    C786410Ut5.W5(view, marginLayoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            return;
        }
        int value = LiveChatLineMarginSetting.INSTANCE.getValue();
        if (value < 0 || this.LLJLLL == value) {
            return;
        }
        this.LLJLLL = value;
        View view2 = this.LLJJI;
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(value)));
            C786410Ut5.W5(view2, marginLayoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void R5(View view, boolean z) {
        ViewGroup viewGroup = this.LLJJ;
        if ((viewGroup instanceof ConstraintLayout) && viewGroup != null) {
            View view2 = new View(viewGroup.getContext());
            if (LivePublicScreenClickCloseKeyboardSetting.INSTANCE.marginCanNotCloseKeyboard(this.LLIZ)) {
                view2.setOnTouchListener(new ATListenerS450S0100000_17(this, 22));
            }
            C19ME c19me = new C19ME(0, 0);
            if (z) {
                c19me.bottomToTop = view.getId();
                c19me.topToTop = 0;
            } else {
                c19me.topToBottom = view.getId();
                c19me.bottomToBottom = 0;
            }
            c19me.startToStart = view.getId();
            c19me.endToEnd = view.getId();
            viewGroup.addView(view2, c19me);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1111060f1E
    public final void P5(final C1109770ez9 c1109770ez9, AbstractC1110800f0o abstractC1110800f0o, List list) throws Throwable {
        boolean z;
        boolean z2;
        int iLIZIZ;
        Animatable animatable;
        Boolean boolValueOf;
        ChatMessage chatMessage;
        String idStr;
        boolean z3;
        String str;
        Long lValueOf;
        Long lValueOf2;
        boolean z4;
        User.EnigmaInfo enigmaInfo;
        AbstractC1110520f0M abstractC1110520f0M;
        User userLJJIJL;
        int iLJJJ;
        C416770GVv c416770GVv;
        Animatable animatable2;
        Animatable animatable3;
        C416770GVv c416770GVv2;
        Integer num;
        RoomAuthStatus roomAuthStatus;
        AbstractC1110520f0M abstractC1110520f0M2 = (AbstractC1110520f0M) abstractC1110800f0o;
        this.LLJLIL = abstractC1110520f0M2.LJIL;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        boolean z5 = false;
        if (room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.commentmention == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJJJJIL = z;
        U5();
        if (list.size() > 0) {
            for (Object obj : list) {
                if (obj instanceof C1111440f1q) {
                    LLZLLLL(((C1111440f1q) obj).LIZ);
                    return;
                }
                if (obj instanceof C1110550f0P) {
                    S5(abstractC1110520f0M2);
                    return;
                }
                if (obj instanceof C1111110f1J) {
                    boolean z6 = this.LLL;
                    boolean z7 = ((C1111110f1J) obj).LIZ;
                    if (z6 == z7) {
                        return;
                    }
                    this.LLL = z7;
                    a6();
                    return;
                }
                if (obj instanceof C1110300f00) {
                    this.LLJJJIL.clear();
                    this.LLJJJIL.append(abstractC1110520f0M2.getContent());
                    this.LLJI.setText(this.LLJJJJ.LJ(this.LLJJJIL, new InterfaceC21543319St() { // from class: X.0f1k
                        @Override // X.InterfaceC21543319St
                        public final boolean LIZ(int i, CharSequence charSequence) {
                            return c1109770ez9.LIZJ;
                        }
                    }));
                    S5(abstractC1110520f0M2);
                    return;
                }
                if (obj instanceof C1110290ezz) {
                    this.LLJJJIL.clear();
                    this.LLJJJIL.append(abstractC1110520f0M2.getContent());
                    this.LLJI.setText(this.LLJJJJ.LJ(this.LLJJJIL, new InterfaceC21543319St() { // from class: X.0f1k
                        @Override // X.InterfaceC21543319St
                        public final boolean LIZ(int i, CharSequence charSequence) {
                            return c1109770ez9.LIZJ;
                        }
                    }));
                    return;
                } else if (obj instanceof C1111510f1x) {
                    obj.getClass();
                    X5(0);
                }
            }
        } else {
            S5(abstractC1110520f0M2);
        }
        boolean z8 = this.LLL;
        boolean z9 = c1109770ez9.LJJIIZI;
        if (z8 != z9) {
            this.LLL = z9;
            a6();
        }
        if (this.LLJJIJI && (num = (Integer) DataChannelGlobal.LLILZ.gg0(C1148050fyt.class)) != null) {
            X5(num.intValue());
        }
        AbstractC1136060ffY abstractC1136060ffY = this.LLJLIL;
        if ((abstractC1136060ffY instanceof ChatMessage) && ((ChatMessage) abstractC1136060ffY).LIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLJJJIL.clear();
        if (z2) {
            iLIZIZ = this.LLJJIJIIJIL;
        } else if (this.LLILZIL && !this.LLILZLL) {
            iLIZIZ = this.LLJJJ;
        } else {
            iLIZIZ = this.LLJJIJIL;
        }
        if (LiveBackupMessageOfflineTestSetting.INSTANCE.getValue() && abstractC1110520f0M2.LJJJJJ()) {
            iLIZIZ = C20736316Cj.LIZIZ(R.attr.c5p, this.itemView.getContext());
        }
        String str2 = "";
        if (abstractC1110520f0M2 instanceof InterfaceC759280TqQ) {
            SpannableStringBuilder spannableStringBuilder = this.LLJJJIL;
            CharSequence content = abstractC1110520f0M2.getContent();
            if (content != null) {
                InterfaceC759280TqQ interfaceC759280TqQ = (InterfaceC759280TqQ) abstractC1110520f0M2;
                if (interfaceC759280TqQ.LJLLL() && !TextUtils.isEmpty(interfaceC759280TqQ.LJLJLLL()) && (content = interfaceC759280TqQ.LJLJLLL()) == null) {
                    content = "";
                }
                spannableStringBuilder.append(content);
                if (z2) {
                    Object[] objArr = new Object[1];
                    C20743516Fd c20743516Fd = this.LLJJLIIIJLLLLLLLZ;
                    if (c20743516Fd != null) {
                        c20743516Fd.setBounds(0, 0, T5(c1109770ez9), T5(c1109770ez9));
                    }
                    C20743516Fd c20743516Fd2 = this.LLJJLIIIJLLLLLLLZ;
                    if (c20743516Fd2 != null) {
                        c416770GVv2 = new C416770GVv(c20743516Fd2);
                        c416770GVv2.LLILZ = C497740JfY.LJIIIZ(R.dimen.avp);
                    } else {
                        c416770GVv2 = null;
                    }
                    objArr[0] = c416770GVv2;
                    List listLJIILJJIL = C1697810uHb.LJIILJJIL(objArr);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((char) 65532);
                    C0JCF.LIZ(new AwS418S0200000_17(this, (C1111130f1L) abstractC1110520f0M2, (AbstractC1110520f0M<? extends AbstractC1136060ffY>) 146), null, null, null, spannableStringBuilder2, listLJIILJJIL);
                    spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                }
                if (interfaceC759280TqQ.LJIILLIIL()) {
                    List listLJIILJJIL2 = C1697810uHb.LJIILJJIL(this.LLJL);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    spannableStringBuilder3.append((char) 65532);
                    C0JCF.LIZ(null, null, null, null, spannableStringBuilder3, listLJIILJJIL2);
                    spannableStringBuilder.append((CharSequence) spannableStringBuilder3);
                    Object obj2 = this.LLJJJJLIIL;
                    if ((obj2 instanceof Animatable) && (animatable3 = (Animatable) obj2) != null) {
                        animatable3.start();
                    }
                } else {
                    Object obj3 = this.LLJJJJLIIL;
                    if ((obj3 instanceof Animatable) && (animatable2 = (Animatable) obj3) != null) {
                        animatable2.stop();
                    }
                    if (interfaceC759280TqQ.LJLLL()) {
                        C20743516Fd c20743516Fd3 = this.LLJJL;
                        if (c20743516Fd3 != null) {
                            c20743516Fd3.setBounds(0, 0, T5(c1109770ez9), T5(c1109770ez9));
                        }
                        C20743516Fd c20743516Fd4 = this.LLJJL;
                        if (c20743516Fd4 != null) {
                            c416770GVv = new C416770GVv(c20743516Fd4);
                            c416770GVv.LLILZ = C497740JfY.LJIIIZ(R.dimen.avp);
                        } else {
                            c416770GVv = null;
                        }
                        if (!(c1109770ez9.LJIIJJI instanceof C1112070f2r)) {
                            List listLJIILJJIL3 = C1697810uHb.LJIILJJIL(c416770GVv);
                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                            spannableStringBuilder4.append((char) 65532);
                            C0JCF.LIZ(new AwS413S0200000_12(c1109770ez9, abstractC1110520f0M2, 80), null, null, null, spannableStringBuilder4, listLJIILJJIL3);
                            spannableStringBuilder.append((CharSequence) spannableStringBuilder4);
                        }
                    }
                }
            }
        } else {
            Object obj4 = this.LLJJJJLIIL;
            if ((obj4 instanceof Animatable) && (animatable = (Animatable) obj4) != null) {
                animatable.stop();
            }
            this.LLJJJIL.append(abstractC1110520f0M2.getContent());
        }
        this.LLJ.setText(abstractC1110520f0M2.LLJLL());
        this.LLJI.setTextColor(iLIZIZ);
        if ((!C1111450f1r.LIZ) && (abstractC1110520f0M = this.LLILLJJLI) != null && abstractC1110520f0M.LJJIJL() != null) {
            Object[] objArr2 = new Object[1];
            AbstractC1110520f0M abstractC1110520f0M3 = this.LLILLJJLI;
            if (abstractC1110520f0M3 != null) {
                userLJJIJL = abstractC1110520f0M3.LJJIJL();
            } else {
                userLJJIJL = null;
            }
            objArr2[0] = C0KVU.LIZ(userLJJIJL);
            String strJ4 = C786410Ut5.j4("@%s", Arrays.copyOf(objArr2, 1));
            if (!TextUtils.isEmpty(strJ4) && (iLJJJ = a0.LJJJ(this.LLJJJIL, strJ4, 0, false, 6)) != -1) {
                C786410Ut5.q2(this.LLJJJIL, new ForegroundColorSpan(this.LLJJIJIIJIL), iLJJJ, strJ4.length() + iLJJJ, 33);
            }
        }
        this.LLJI.setText(this.LLJJJJ.LJ(this.LLJJJIL, new InterfaceC21543319St() { // from class: X.0f1k
            @Override // X.InterfaceC21543319St
            public final boolean LIZ(int i, CharSequence charSequence) {
                return c1109770ez9.LIZJ;
            }
        }));
        ImageModel imageModelLJLLLLLL = abstractC1110520f0M2.LJLLLLLL();
        if (imageModelLJLLLLLL != null) {
            C1324610kZf c1324610kZfLJIILJJIL = C1819620xS4.LIZ().LJIILJJIL(-1, -1);
            if (LivePublicScreenAvatarLoadSceneSampleRateSetting.shouldPassAvatarScene()) {
                c1324610kZfLJIILJJIL.LJIIIIZZ("chat_vh_avatar", imageModelLJLLLLLL.getUrls());
            } else {
                c1324610kZfLJIILJJIL.LIZJ(imageModelLJLLLLLL.getUrls());
            }
            c1324610kZfLJIILJJIL.LJIIL = new C1151780g4u(this, 5);
            c1324610kZfLJIILJJIL.LJJI(this.LLJILJILJ);
        } else {
            C439101nJ.LJ(R.drawable.eu1, this.LLJILJILJ);
        }
        User user = abstractC1110520f0M2.getUser();
        if (user != null && (enigmaInfo = user.enigmaInfo) != null) {
            boolValueOf = Boolean.valueOf(enigmaInfo.isEnigmaMaskOn);
        } else {
            boolValueOf = null;
        }
        boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
        if (c1109770ez9.LJI) {
            C421320Gfa c421320Gfa = this.LLJILJILJ;
            PublicAreaMessageCommon publicAreaMessageCommonLLIIII = abstractC1110520f0M2.LLIIII();
            if (publicAreaMessageCommonLLIIII != null && publicAreaMessageCommonLLIIII.isAnchorMarked && !zLJJJI) {
                z4 = true;
            } else {
                z4 = false;
            }
            c421320Gfa.setDrawAnchorMark(z4);
        }
        MESSAGE message = abstractC1110520f0M2.LJIL;
        if (!(message instanceof ChatMessage) || (chatMessage = (ChatMessage) message) == null) {
            return;
        }
        if (chatMessage.quickChatScene == 3 && !this.LLJZ.contains(chatMessage.LL)) {
            this.LLJZ.add(chatMessage.LL);
            Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (room2 != null && room2.getOwnerUserId() == interfaceC500940JkiUser.getCurrentUserId()) {
                z3 = true;
            } else {
                z3 = false;
            }
            String str3 = "user";
            if (chatMessage.userInfo.getId() == interfaceC500940JkiUser.getCurrentUserId()) {
                str = "user";
            } else {
                str = "other";
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_first_gift_quick_comment_message_show");
            if (!z3) {
                EnterRoomConfig enterRoomConfig = C0IL2.LIZ.LIZ().mEnterRoomConfig;
                c474500IjALIZ.LJJII(enterRoomConfig.mRoomsData.enterFromMerge, "enter_from_merge");
                c474500IjALIZ.LJJII(enterRoomConfig.mRoomsData.enterMethod, "enter_method");
            }
            if (room2 != null) {
                lValueOf = Long.valueOf(room2.getId());
            } else {
                lValueOf = null;
            }
            c474500IjALIZ.LJJII(lValueOf, "room_id");
            if (room2 != null) {
                lValueOf2 = Long.valueOf(room2.getOwnerUserId());
            } else {
                lValueOf2 = null;
            }
            c474500IjALIZ.LJJII(lValueOf2, "anchor_id");
            c474500IjALIZ.LJJII(Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()), "user_id");
            if (z3) {
                str3 = "anchor";
            }
            c474500IjALIZ.LJJII(str3, "user_type");
            c474500IjALIZ.LJJII(str, "see_from");
            c474500IjALIZ.LIZ();
        }
        if (!(abstractC1110520f0M2 instanceof C1110310f01) || this.LLJZIJLIL.contains(Long.valueOf(chatMessage.chatId)) || chatMessage.isLocalInsertMsg) {
            return;
        }
        C1110310f01 c1110310f01 = (C1110310f01) abstractC1110520f0M2;
        User user2 = chatMessage.userInfo;
        if (user2 != null && (idStr = user2.getIdStr()) != null) {
            str2 = idStr;
        }
        if (c1110310f01.getUser() == null || c1110310f01.getUser().enigmaInfo == null || !c1110310f01.getUser().enigmaInfo.isEnigmaMaskOn) {
            return;
        }
        if (UserService.getInstance().user().getCurrentUserId() == c1110310f01.LJIILIIL.LJIL) {
            z5 = true;
        }
        C01CC.LIZJ("chat", str2, null, z5);
        this.LLJZIJLIL.add(Long.valueOf(chatMessage.chatId));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Upu] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    public final void W5(String str, String str2, String str3) {
        User user;
        long messageId;
        Object objGg0;
        String str4;
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII;
        ?? arrayList;
        PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo;
        PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic;
        PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo2;
        List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list;
        DataChannel dataChannel;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        C1111420f1o c1111420f1o;
        DataChannel dataChannel2;
        C1109770ez9 c1109770ez9 = this.LL;
        if (c1109770ez9 != null && (dataChannel2 = c1109770ez9.LJIIIZ) != null) {
            dataChannel2.FQ2(PsInteractiveCount.class);
        }
        AbstractC1110790f0n abstractC1110790f0n = this.LLILLJJLI;
        if (abstractC1110790f0n != null && (user = abstractC1110790f0n.getUser()) != null) {
            ?? LIZ = C784440Upu.LIZ();
            UserProfileEvent userProfileEvent = new UserProfileEvent(user.getId(), str);
            AbstractC1136060ffY abstractC1136060ffY = this.LLJLIL;
            long j = 0;
            if (abstractC1136060ffY != null) {
                messageId = abstractC1136060ffY.getMessageId();
            } else {
                messageId = 0;
            }
            userProfileEvent.msgId = messageId;
            AbstractC1110790f0n abstractC1110790f0n2 = this.LLILLJJLI;
            if (abstractC1110790f0n2 != null && (c1111420f1o = abstractC1110790f0n2.LJIJ) != null) {
                j = c1111420f1o.LIZ;
            }
            userProfileEvent.releaseId = j;
            AbstractC1136060ffY abstractC1136060ffY2 = this.LLJLIL;
            String strLJJLIIIJ = null;
            text = null;
            text = null;
            Text text = null;
            strLJJLIIIJ = null;
            if (abstractC1136060ffY2 instanceof ChatMessage) {
                userProfileEvent.content = ((ChatMessage) abstractC1136060ffY2).content;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ChatViewHolder, showProfile, (message as ChatMessage).userInfo.enigmaInfo?.isEnigmaMaskOn == true = ");
                User.EnigmaInfo enigmaInfo = ((ChatMessage) this.LLJLIL).userInfo.enigmaInfo;
                if (enigmaInfo != null) {
                    boolValueOf = Boolean.valueOf(enigmaInfo.isEnigmaMaskOn);
                } else {
                    boolValueOf = null;
                }
                sbLIZ.append(boolValueOf);
                sbLIZ.append("  isMockMessage = ");
                AbstractC1136060ffY abstractC1136060ffY3 = this.LLJLIL;
                if (abstractC1136060ffY3 != null) {
                    boolValueOf2 = Boolean.valueOf(abstractC1136060ffY3.isLocalInsertMsg);
                } else {
                    boolValueOf2 = null;
                }
                sbLIZ.append(boolValueOf2);
                C20441214yg.LIZIZ("ChatViewHolder", C2188811AlT.LIZIZ(sbLIZ));
                userProfileEvent.setEnigmaOutside(((ChatMessage) this.LLJLIL).userInfo.enigmaInfo);
            }
            userProfileEvent.enigmaEnterFrom = "chat";
            userProfileEvent.mSource = "live_comment";
            userProfileEvent.clickMethod = "normal";
            userProfileEvent.mReportType = "report_message";
            userProfileEvent.mShowEntrance = "comment_area";
            userProfileEvent.mClickUserPosition = str2;
            C1109770ez9 c1109770ez92 = this.LL;
            if (c1109770ez92 != null && (dataChannel = c1109770ez92.LJIIIZ) != null) {
                objGg0 = dataChannel.gg0(LiveExtendedScreenStatus.class);
            } else {
                objGg0 = null;
            }
            if (objGg0 == EnumC1083260eIO.SHOW) {
                userProfileEvent.mEventPage = "live_extended_comment_filed";
                AbstractC1110790f0n abstractC1110790f0n3 = this.LLILLJJLI;
                if (abstractC1110790f0n3 != null && !C500260Jjc.LJJIFFI(Boolean.valueOf(abstractC1110790f0n3.LJIIIZ.LIZ))) {
                    PublicAreaMessageCommon publicAreaMessageCommonLLIIII2 = abstractC1110790f0n3.LLIIII();
                    if (publicAreaMessageCommonLLIIII2 != null && (creatorSuccessInfo2 = publicAreaMessageCommonLLIIII2.creatorSuccessInfo) != null && (list = creatorSuccessInfo2.tags) != null) {
                        arrayList = new ArrayList();
                        Iterator<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> it2 = list.iterator();
                        while (it2.hasNext()) {
                            Text text2 = it2.next().tagText;
                            if (text2 != null) {
                                arrayList.add(text2);
                            }
                        }
                    } else {
                        arrayList = C13BV.INSTANCE;
                    }
                    PublicAreaMessageCommon publicAreaMessageCommonLLIIII3 = abstractC1110790f0n3.LLIIII();
                    if (publicAreaMessageCommonLLIIII3 != null && (creatorSuccessInfo = publicAreaMessageCommonLLIIII3.creatorSuccessInfo) != null && (topic = creatorSuccessInfo.topic) != null) {
                        text = topic.topicText;
                    }
                    List listLJLIL = C13LP.LJLIL(C1697810uHb.LJIIL(text), arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = ((ArrayList) listLJLIL).iterator();
                    while (it3.hasNext()) {
                        String str5 = ((Text) it3.next()).key;
                        if (str5 != null) {
                            arrayList2.add(str5);
                        }
                    }
                    strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LJJJJI(arrayList2), ",", null, null, 0, null, null, 62);
                }
                userProfileEvent.crmLabel = strLJJLIIIJ;
            }
            userProfileEvent.setFromLiveModule("comment_icon");
            C1109770ez9 c1109770ez93 = this.LL;
            if (c1109770ez93 != null && c1109770ez93.LJI) {
                if (userProfileEvent.trackExtra == null) {
                    userProfileEvent.trackExtra = new LinkedHashMap();
                }
                Map<String, String> map = userProfileEvent.trackExtra;
                AbstractC1110790f0n abstractC1110790f0n4 = this.LLILLJJLI;
                if (abstractC1110790f0n4 != null && (publicAreaMessageCommonLLIIII = abstractC1110790f0n4.LLIIII()) != null && publicAreaMessageCommonLLIIII.isAnchorMarked) {
                    str4 = "1";
                } else {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("click_is_marked_user", str4);
            }
            LIZ.LIZIZ(userProfileEvent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x02cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1111130f1L(android.view.View r21, X.AbstractC1113530f5D r22, boolean r23, boolean r24, boolean r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1111130f1L.<init>(android.view.View, X.0f5D, boolean, boolean, boolean):void");
    }
}
