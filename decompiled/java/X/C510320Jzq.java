package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.chatroom.api.UpdateTips;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Jzq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510320Jzq extends C09AY implements Function1<C514770KGt, Unit> {
    public final /* synthetic */ C0KBE LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C510320Jzq(C0KBE c0kbe, String str) {
        super(1);
        this.LL = c0kbe;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C514770KGt c514770KGt) {
        String str;
        ForegroundColorSpan foregroundColorSpan;
        Integer numLIZJ;
        final UpdateTips updateTips = c514770KGt.LJIIJJI;
        if (updateTips != null && (str = updateTips.desc) != null && str.length() != 0) {
            String str2 = this.LLILLJJLI;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("subscription_change_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII("sov_paywall", "enter_from");
            c474500IjALIZ.LJJII(str2, "creator_id");
            c474500IjALIZ.LJJII("learn_more", "click_type");
            c474500IjALIZ.LJJII("live_split", "update_type");
            c474500IjALIZ.LIZ();
            C16F5 c16f5 = this.LL.LL;
            if (c16f5 != null) {
                final String str3 = this.LLILLJJLI;
                C500260Jjc.LLFFF(c16f5);
                final Context context = c16f5.getContext();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(updateTips.desc);
                sbLIZ.append(updateTips.btnText);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
                try {
                    final C238400w2 c238400w2 = new C238400w2();
                    ClickableSpan clickableSpan = new ClickableSpan() { // from class: X.0Jzp
                        @Override // android.text.style.ClickableSpan
                        public final void onClick(View view) {
                            String str4 = str3;
                            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("subscription_change_click");
                            c474500IjALIZ2.LJIL();
                            c474500IjALIZ2.LJJII("sov_paywall", "enter_from");
                            c474500IjALIZ2.LJJII(str4, "creator_id");
                            c474500IjALIZ2.LJJII("learn_more", "click_type");
                            c474500IjALIZ2.LJJII("live_split", "update_type");
                            c474500IjALIZ2.LIZ();
                            if (Math.abs(c238400w2.element - System.currentTimeMillis()) < 800) {
                                return;
                            }
                            c238400w2.element = System.currentTimeMillis();
                            C495520Jby c495520Jby = new C495520Jby(updateTips.schemaUrl);
                            Context context2 = context;
                            if (context2 != null) {
                                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context2, c495520Jby.LIZLLL());
                            }
                        }

                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public final void updateDrawState(TextPaint textPaint) {
                            textPaint.setUnderlineText(false);
                        }
                    };
                    int iLJJJ = a0.LJJJ(spannableStringBuilder, updateTips.btnText, 0, false, 6);
                    int length = updateTips.btnText.length() + iLJJJ;
                    C786410Ut5.q2(spannableStringBuilder, clickableSpan, iLJJJ, length, 18);
                    C1119920fFW.LJ(context, spannableStringBuilder, iLJJJ, length, 33, 7, 500);
                    if (context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.ezq, context)) == null) {
                        foregroundColorSpan = null;
                    } else {
                        foregroundColorSpan = new ForegroundColorSpan(numLIZJ.intValue());
                    }
                    C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, iLJJJ, length, 33);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1CC2.LIZ("build spannable error", e);
                }
                c16f5.setText(spannableStringBuilder);
                c16f5.setMovementMethod(LinkMovementMethod.getInstance());
            }
        } else {
            C16F5 c16f52 = this.LL.LL;
            if (c16f52 != null) {
                C500260Jjc.LJIILIIL(c16f52);
            }
        }
        return Unit.LIZ;
    }
}
