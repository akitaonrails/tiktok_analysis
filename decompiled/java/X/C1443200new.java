package X;

import Y.ACListenerS156S0100000_22;
import Y.ARunnableS55S0300000_22;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0new, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443200new implements InterfaceC1445880njG {
    public final C19EG LL;
    public final AwemeDraft LLILLJJLI;
    public final InterfaceC1442990neb LLILLL;
    public final View LLILZ;
    public ImageView LLILZIL;
    public ImageView LLILZLL;

    @Override // X.InterfaceC1445880njG
    public final void setText(String str, String str2) {
    }

    @Override // X.InterfaceC1445880njG
    public final void LIZ(Bitmap bitmap) {
        C0MZ9.LJIIIIZZ(this.LLILLJJLI, null, new IEffectService.OnVideoCoverCallback() { // from class: X.0ney
            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverFailed(int i) {
            }

            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverSuccess(Bitmap bitmap2) {
                C1443200new c1443200new = this.LIZ;
                ImageView imageView = c1443200new.LLILZIL;
                if (imageView != null) {
                    HandlerHook.viewPost(imageView, new ARunnableS55S0300000_22(imageView, bitmap2, c1443200new, 5));
                }
            }
        });
        C20684815ws.LJIILLIIL("tns_ags_float_post_ban", new C0LAB().LIZ);
    }

    @Override // X.InterfaceC1445880njG
    public final void LIZIZ(boolean z, boolean z2) {
        if (this.LLILLL.isShowing()) {
            C0CHQ.LIZ().getPublishService().LJIIL();
            C1436830nUf.LJIJI(new C572660Md6(this.LLILLJJLI));
            C1444780nhU.LIZ();
            C201955140j.LJIIL("Publish | remove recover path by dismiss panel");
        }
    }

    public C1443200new(C19EG c19eg, AwemeDraft awemeDraft, InterfaceC1442990neb interfaceC1442990neb, View view) {
        this.LL = c19eg;
        this.LLILLJJLI = awemeDraft;
        this.LLILLL = interfaceC1442990neb;
        this.LLILZ = view;
        this.LLILZIL = (ImageView) view.findViewById(R.id.ld7);
        this.LLILZLL = (ImageView) view.findViewById(R.id.lc0);
        TextView textView = (TextView) view.findViewById(R.id.tv_tips);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19eg.getString(2131844955));
        sbLIZ.append(' ');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String string = c19eg.getString(2131858245);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ2));
        C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0nex
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view2) {
                ComplianceServiceProvider.LJFF().jumpToAgsStatusPage(this.LL.LL, "float_post");
                this.LL.LLILLL.LJIILIIL(false, false);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }
        }, strLIZIZ.length(), spannableStringBuilder.length(), 18);
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(c19eg.getResources().getColor(R.color.ct)), strLIZIZ.length(), spannableStringBuilder.length(), 18);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(new LinkMovementMethod());
        C786410Ut5.Q7(this.LLILZLL, new ACListenerS156S0100000_22(this, 26));
    }
}
