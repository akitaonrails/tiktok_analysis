package X;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0K2Y, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K2Y extends C0K3V {
    public final View LL;
    public final SubSpaceFeedVM LLILLJJLI;
    public final TuxTextView LLILLL;
    public final C417410GYh LLILZ;

    public C0K2Y(View view, SubSpaceFeedVM subSpaceFeedVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceFeedVM;
        this.LLILLL = (TuxTextView) view.findViewById(R.id.joq);
        this.LLILZ = (C417410GYh) view.findViewById(R.id.h2q);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        C0K2N c0k2n;
        C511370K3r c511370K3r;
        boolean z;
        CharSequence charSequence;
        CharSequence charSequence2;
        if ((abstractC511160K2w instanceof C0K2N) && (c0k2n = (C0K2N) abstractC511160K2w) != null) {
            if (interfaceC2753014t instanceof C511370K3r) {
                c511370K3r = (C511370K3r) interfaceC2753014t;
            } else {
                c511370K3r = null;
            }
            ViewGroup.LayoutParams layoutParams = this.LL.getLayoutParams();
            layoutParams.height = c0k2n.LIZ;
            C786410Ut5.W5(this.LL, layoutParams);
            this.LL.requestLayout();
            if (this.LLILLJJLI.AQ2()) {
                TuxTextView tuxTextView = this.LLILLL;
                if (c511370K3r != null) {
                    z = c511370K3r.LLILZIL;
                } else {
                    z = false;
                }
                if (C0K7G.LIZLLL() && !z) {
                    String strLJII = C511520K4g.LJII(2131849263);
                    if (strLJII == null) {
                        strLJII = "";
                    }
                    charSequence = "";
                    if (strLJII.length() != 0) {
                        String strSubstring = strLJII.substring(a0.LJJJ(strLJII, e3.e, 0, false, 6) + 1, a0.LJJJ(strLJII, e3.f, 0, false, 6));
                        String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(strLJII, e3.e, "", false), e3.f, "", false);
                        int iLJJJ = a0.LJJJ(strLJJIFFI, strSubstring, 0, false, 6);
                        int length = strSubstring.length() + iLJJJ;
                        SpannableStringBuilder spannableStringBuilderLIZ = C510740K1g.LIZ(strLJJIFFI, 51, AFwS237S0000000_7.get$arr$(312));
                        C510740K1g.LIZLLL(spannableStringBuilderLIZ, iLJJJ, length, 52, false, 33);
                        C510740K1g.LIZJ(spannableStringBuilderLIZ, new ForegroundColorSpan(C426930God.LIZ(R.attr.a1j, this.LL.getContext())), iLJJJ, length, 33);
                        C510740K1g.LIZJ(spannableStringBuilderLIZ, new C521550Kcr(this, 9), iLJJJ, length, 33);
                        charSequence2 = spannableStringBuilderLIZ;
                        charSequence = charSequence2;
                    }
                    tuxTextView.setText(charSequence);
                    TuxTextView tuxTextView2 = this.LLILLL;
                    tuxTextView2.LLJJ = true;
                    tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                } else {
                    String strLJII2 = C511520K4g.LJII(2131839606);
                    charSequence2 = strLJII2;
                    charSequence = "";
                    if (strLJII2 != null) {
                        charSequence = charSequence2;
                    }
                    tuxTextView.setText(charSequence);
                    TuxTextView tuxTextView22 = this.LLILLL;
                    tuxTextView22.LLJJ = true;
                    tuxTextView22.setMovementMethod(LinkMovementMethod.getInstance());
                }
            } else {
                TuxTextView tuxTextView3 = this.LLILLL;
                String strLJII3 = C511520K4g.LJII(2131839607);
                String str = "";
                if (strLJII3 != null) {
                    str = strLJII3;
                }
                tuxTextView3.setText(str);
            }
            C511430K3x c511430K3x = C511430K3x.LIZ;
            C417410GYh c417410GYh = this.LLILZ;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
            c511430K3x.getClass();
            C511430K3x.LIZIZ(c417410GYh, "tiktok_live_subscription_demand_1", "ttlive_sub_only_space_creator_voice.png", scaleType, null);
        }
    }
}
