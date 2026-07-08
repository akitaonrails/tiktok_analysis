package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0ezD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1109810ezD {
    public final View LIZ;
    public final C1110060ezc LIZIZ;
    public final ImageView LIZJ;
    public final Handler LIZLLL;
    public final Runnable LJ;
    public final Function0<C1109600eys<?>> LJFF;
    public final Function0<C1109770ez9> LJI;
    public final Function0<C1109020exw> LJII;
    public final Function0<Unit> LJIIIIZZ;
    public boolean LJIIJ;
    public AwS561S0100000_17 LJIIL;
    public CharSequence LJIIIZ = "";
    public final C1109800ezC LJIIJJI = new AbstractC1098790ehR() { // from class: X.0ezC
        @Override // X.AbstractC431510Gw1
        public final void LIZ() {
        }

        @Override // X.AbstractC1098790ehR
        public final void LIZIZ(View view) {
            C1109810ezD c1109810ezD = this.LLILZIL;
            if (c1109810ezD.LIZIZ.LLLIZZ) {
                c1109810ezD.LIZJ("extent");
            } else {
                c1109810ezD.LIZJ("fold");
            }
            this.LLILZIL.LJIIIIZZ.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setUnderlineText(false);
        }
    };

    public final void LIZIZ() {
        C500260Jjc.LJIILIIL(this.LIZJ);
        this.LIZIZ.setAnimEndCallback(new AwS418S0200000_17((Function0) this.LIZIZ.getAnimEndCallback(), (Function0<Unit>) this, (C1109810ezD) 4));
        this.LIZIZ.setStateChangedListener(new AwS596S0100000_17(this, 21));
    }

    public final void LIZJ(String str) {
        DataChannel dataChannel;
        Room room;
        DataChannel dataChannel2;
        Boolean boolValueOf;
        String str2;
        Room room2;
        C1109770ez9 c1109770ez9Invoke = this.LJI.invoke();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pin_comment_platform_click");
        User user = null;
        if (c1109770ez9Invoke != null) {
            dataChannel = c1109770ez9Invoke.LJIIIZ;
        } else {
            dataChannel = null;
        }
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (c1109770ez9Invoke != null) {
            room = c1109770ez9Invoke.LJII;
            dataChannel2 = c1109770ez9Invoke.LJIIIZ;
        } else {
            room = null;
            dataChannel2 = null;
        }
        c474500IjALIZ.LJJII(C0KYR.LIZIZ(room, dataChannel2), "admin_type");
        if (c1109770ez9Invoke != null) {
            boolValueOf = Boolean.valueOf(c1109770ez9Invoke.LJJ);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str2, "is_extended_comment_filed");
        if (c1109770ez9Invoke != null) {
            room2 = c1109770ez9Invoke.LJII;
        } else {
            room2 = null;
        }
        C1109020exw c1109020exwInvoke = this.LJII.invoke();
        if (c1109020exwInvoke != null) {
            user = c1109020exwInvoke.LIZIZ;
        }
        c474500IjALIZ.LJJII(C0KYR.LIZ(user, room2), "pin_user");
        c474500IjALIZ.LJJII(str, "click_type");
        c474500IjALIZ.LIZ();
    }

    public final void LIZ(boolean z, boolean z2, boolean z3) {
        CharSequence charSequenceAppend;
        int i;
        SpannableString spannableString;
        Drawable drawableMutate;
        this.LJIIJ = z;
        C1110060ezc c1110060ezc = this.LIZIZ;
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.LJIIIZ);
            if (z2) {
                i = R.drawable.c16;
            } else {
                i = R.drawable.c17;
            }
            Drawable drawableLIZ = C14MI.LIZ(this.LIZ.getContext(), i);
            if (drawableLIZ != null && (drawableMutate = drawableLIZ.mutate()) != null) {
                int iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
                drawableMutate.setBounds(0, 0, iLIZIZ, iLIZIZ);
                C416770GVv c416770GVv = new C416770GVv(drawableMutate);
                c416770GVv.LLILZ = C497740JfY.LJIIIZ(R.dimen.avp);
                spannableString = new SpannableString(" ");
                C786410Ut5.p2(spannableString, c416770GVv, 0, 1, 33);
                C786410Ut5.p2(spannableString, this.LJIIJJI, 0, 1, 33);
            } else {
                spannableString = new SpannableString("");
            }
            charSequenceAppend = spannableStringBuilder.append((CharSequence) spannableString);
        } else {
            charSequenceAppend = this.LJIIIZ;
        }
        c1110060ezc.setSuffix(charSequenceAppend);
        if (z3) {
            this.LIZIZ.LJJLIIIJLLLLLLLZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0ezC] */
    public C1109810ezD(View view, C1110060ezc c1110060ezc, ImageView imageView, Handler handler, Runnable runnable, Function0<? extends C1109600eys<?>> function0, Function0<C1109770ez9> function02, Function0<C1109020exw> function03, Function0<Unit> function04) {
        this.LIZ = view;
        this.LIZIZ = c1110060ezc;
        this.LIZJ = imageView;
        this.LIZLLL = handler;
        this.LJ = runnable;
        this.LJFF = function0;
        this.LJI = function02;
        this.LJII = function03;
        this.LJIIIIZZ = function04;
    }
}
