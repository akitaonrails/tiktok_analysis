package X;

import Y.ACListenerS152S0100000_17;
import Y.ALAdapterS13S0100000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.widget.SimpleLiveTextView;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveBeingAtConfigSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.u;
import wh6.AbS698S0100000_17;

/* JADX INFO: renamed from: X.0f1M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1111140f1M extends AbstractC1110760f0k<C1110640f0Y> implements InterfaceC1112700f3s {
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final SimpleLiveTextView LLILZLL;
    public final C421320Gfa LLIZ;
    public final C21627319kV LLIZLLLIL;
    public final User LLJ;
    public C21538619Qy LLJI;
    public boolean LLJIJIL;
    public final boolean LLJILJIL;
    public ValueAnimator LLJILJILJ;
    public ValueAnimator LLJILLL;
    public final ViewGroup LLJJ;

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
    public final void P5() {
        if (!this.LLJILJIL) {
            C21538619Qy c21538619Qy = this.LLJI;
            if (c21538619Qy != null) {
                int[] iArr = new int[2];
                iArr[0] = this.LLILZ ? C20736316Cj.LIZIZ(R.attr.c8k, this.itemView.getContext()) : C20736316Cj.LIZIZ(R.attr.ez9, this.itemView.getContext());
                iArr[1] = 0;
                c21538619Qy.setGradientColors(iArr);
                return;
            }
            return;
        }
        C21538619Qy c21538619Qy2 = this.LLJI;
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

    @Override // X.InterfaceC1112700f3s
    public final InterfaceC1112320f3G i4() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC1111020f1A
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        this.LLJIJIL = false;
    }

    @Override // X.AbstractC1111020f1A
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C21538619Qy c21538619Qy = this.LLJI;
        if (c21538619Qy != null) {
            C786410Ut5.LLJJL(c21538619Qy, 8);
        }
        ValueAnimator valueAnimator = this.LLJILJILJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LLJILLL;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // X.InterfaceC1112700f3s
    public final void LLZLLLL(boolean z) {
        Boolean boolValueOf;
        C1110330f03 c1110330f03;
        String string;
        MESSAGE message;
        C1110640f0Y c1110640f0Y = this.LLILLJJLI;
        Boolean boolValueOf2 = null;
        if (c1110640f0Y != null && c1110640f0Y.LJJIFFI != null) {
            if (c1110640f0Y != null) {
                boolValueOf = Boolean.valueOf(c1110640f0Y.LJIL.isHistoryMessage);
            } else {
                boolValueOf = null;
            }
            if (!C500260Jjc.LJJIFFI(boolValueOf)) {
                String str = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.mentionMsgId;
                AbstractC1110800f0o abstractC1110800f0o = this.LLILLJJLI;
                if (abstractC1110800f0o != null && (message = abstractC1110800f0o.LJIL) != 0) {
                    string = Long.valueOf(message.getMessageId()).toString();
                } else {
                    string = null;
                }
                if (!u.LJIJI(string, str, false)) {
                    return;
                }
            }
            if (!this.LLJIJIL) {
                C1110640f0Y c1110640f0Y2 = this.LLILLJJLI;
                if (c1110640f0Y2 != null && (c1110330f03 = c1110640f0Y2.LJJI) != null) {
                    boolValueOf2 = Boolean.valueOf(c1110330f03.LIZ);
                }
                if (!C500260Jjc.LJJJI(boolValueOf2)) {
                    if (this.LLJI == null) {
                        if (this.LLJILJIL) {
                            C21538619Qy c21538619Qy = new C21538619Qy(this.LLJJ.getContext());
                            this.LLJI = c21538619Qy;
                            this.LLJJ.addView(c21538619Qy, -1);
                        } else {
                            C21538619Qy c21538619Qy2 = new C21538619Qy(this.LLJJ.getContext());
                            c21538619Qy2.setBottomStartRadius(C497740JfY.LJIIIZ(R.dimen.avf));
                            c21538619Qy2.setTopStartRadius(c21538619Qy2.getBottomStartRadius());
                            this.LLJI = c21538619Qy2;
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
                        P5();
                        ValueAnimator valueAnimator = this.LLJILJILJ;
                        if (valueAnimator != null) {
                            valueAnimator.addListener(new ALAdapterS13S0100000_17(this, 128));
                        }
                        ValueAnimator valueAnimator2 = this.LLJILLL;
                        if (valueAnimator2 != null) {
                            valueAnimator2.addListener(new ALAdapterS13S0100000_17(this, 129));
                        }
                    }
                    this.LLJIJIL = true;
                    C1110640f0Y c1110640f0Y3 = this.LLILLJJLI;
                    if (c1110640f0Y3 != null) {
                        c1110640f0Y3.LJJII = SystemClock.elapsedRealtime();
                        if (!z) {
                            C786410Ut5.LJLIIL(LiveBeingAtConfigSetting.getValue().flagReadThreshold, C473410IhP.LIZ(), c1110640f0Y3.LJJIII);
                        } else {
                            c1110640f0Y3.LLJLIL();
                        }
                    }
                    if (this.LL != null) {
                        C21538619Qy c21538619Qy3 = this.LLJI;
                        if (c21538619Qy3 != null) {
                            C786410Ut5.LLJJL(c21538619Qy3, 0);
                        }
                        C21538619Qy c21538619Qy4 = this.LLJI;
                        if (c21538619Qy4 != null) {
                            C786410Ut5.n5(c21538619Qy4, 0.0f);
                        }
                        if (this.LLJILJIL) {
                            ValueAnimator duration = ValueAnimator.ofFloat(0.3f, 1.0f).setDuration(700L);
                            duration.setInterpolator(C1619980sG4.LIZLLL());
                            duration.addUpdateListener(new AUListenerS266S0100000_17(this, 167));
                            duration.start();
                            this.LLJILJILJ = duration;
                            ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(1500L);
                            duration2.setInterpolator(C1619980sG4.LIZLLL());
                            duration2.addUpdateListener(new AUListenerS266S0100000_17(this, 168));
                            duration2.setStartDelay(1700L);
                            duration2.start();
                            this.LLJILLL = duration2;
                        } else {
                            ValueAnimator duration3 = ValueAnimator.ofFloat(0.0f, 1.0f, 0.0f, 1.0f, 0.0f).setDuration(1000L);
                            duration3.addUpdateListener(new AUListenerS266S0100000_17(this, 169));
                            duration3.start();
                            this.LLJILJILJ = duration3;
                            ValueAnimator duration4 = ValueAnimator.ofFloat(0.0f, 1.0f, 0.0f, 1.0f, 0.0f).setDuration(1000L);
                            duration4.addUpdateListener(new AUListenerS266S0100000_17(this, 170));
                            duration4.setStartDelay(2000L);
                            duration4.start();
                            this.LLJILLL = duration4;
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

    public final void R5(C1110640f0Y c1110640f0Y) {
        float fLIZIZ;
        float fLIZIZ2;
        int i;
        int i2;
        C421320Gfa c421320Gfa = this.LLIZ;
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (this.LLILZIL) {
            fLIZIZ = C418440Gaw.LIZIZ(20);
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(16);
        }
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(fLIZIZ);
        if (this.LLILZIL) {
            fLIZIZ2 = C418440Gaw.LIZIZ(20);
        } else {
            fLIZIZ2 = C418440Gaw.LIZIZ(16);
        }
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(fLIZIZ2);
        c1110640f0Y.getClass();
        c419910GdJ.LIZ = R.raw.icon_headphone_sparkle_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ey7);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LLIZ.getContext());
        C384050F3z c384050F3z = new C384050F3z();
        if (this.LLILZIL) {
            i = 32;
        } else {
            i = 28;
        }
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i));
        if (this.LLILZIL) {
            i2 = 32;
        } else {
            i2 = 28;
        }
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.exq);
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        c421320Gfa.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(this.LLIZ.getContext())));
    }

    @Override // X.AbstractC1111020f1A
    public final /* bridge */ /* synthetic */ void L5(C1109770ez9 c1109770ez9, InterfaceC1112060f2q interfaceC1112060f2q) {
    }

    @Override // X.AbstractC1111020f1A
    public final void N5(final C1109770ez9 c1109770ez9, InterfaceC1112060f2q interfaceC1112060f2q, List list) {
        C1110640f0Y c1110640f0Y = (C1110640f0Y) interfaceC1112060f2q;
        super.N5(c1109770ez9, c1110640f0Y, list);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('@');
        sbLIZ.append(C0KVU.LIZLLL(this.LLJ));
        sbLIZ.append(' ');
        spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
        spannableStringBuilder.append(c1110640f0Y.getContent());
        this.LLILZLL.setText(this.LLIZLLLIL.LJ(spannableStringBuilder, new InterfaceC21543319St() { // from class: X.0f1j
            @Override // X.InterfaceC21543319St
            public final boolean LIZ(int i, CharSequence charSequence) {
                return c1109770ez9.LIZJ;
            }
        }));
        ImageModel imageModelLJLLLLLL = c1110640f0Y.LJLLLLLL();
        if (imageModelLJLLLLLL != null) {
            C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(imageModelLJLLLLLL.getUrls());
            c1324610kZfLIZJ.LJI = -1;
            c1324610kZfLIZJ.LJII = -1;
            c1324610kZfLIZJ.LJIIL = new C1151770g4t(this, c1110640f0Y, 2);
            c1324610kZfLIZJ.LJJI(this.LLIZ);
        } else {
            R5(c1110640f0Y);
        }
        if (list.size() > 0) {
            for (Object obj : list) {
                if (obj instanceof C1111440f1q) {
                    LLZLLLL(((C1111440f1q) obj).LIZ);
                    return;
                }
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ai_reply_audience_show");
        c474500IjALIZ.LJIJJLI(c1109770ez9.LJIIIZ);
        c474500IjALIZ.LJJII(Long.valueOf(c1110640f0Y.LJIL.getMessageId()), "msg_id");
        c474500IjALIZ.LIZ();
    }

    public C1111140f1M(View view, boolean z, boolean z2, boolean z3) throws Throwable {
        boolean z4;
        RoomAuthStatus roomAuthStatus;
        super(view);
        this.LLILZ = z;
        this.LLILZIL = z2;
        SimpleLiveTextView simpleLiveTextView = (SimpleLiveTextView) view.findViewById(R.id.text);
        this.LLILZLL = simpleLiveTextView;
        C421320Gfa c421320Gfa = (C421320Gfa) view.findViewById(R.id.k55);
        this.LLIZ = c421320Gfa;
        this.LLIZLLLIL = C21627319kV.LIZJ();
        this.LLJ = (User) UserService.getInstance().user().getCurrentUser();
        this.LLJI = (C21538619Qy) view.findViewById(R.id.bnu);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.commentmention == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.LLJILJIL = z4;
        this.LLJJ = (ViewGroup) view.findViewById(R.id.m6p);
        ViewOnLongClickListenerC1151640g4g viewOnLongClickListenerC1151640g4g = new ViewOnLongClickListenerC1151640g4g(this, 12);
        C786410Ut5.I7(new AbS698S0100000_17(this, 23, 42), c421320Gfa);
        c421320Gfa.setOnLongClickListener(viewOnLongClickListenerC1151640g4g);
        C1570050qxX.LIZ(new ACListenerS152S0100000_17(this, 206), view);
        view.setOnLongClickListener(viewOnLongClickListenerC1151640g4g);
        C1152540g68.LIZJ(simpleLiveTextView, z3, z);
        P5();
    }
}
