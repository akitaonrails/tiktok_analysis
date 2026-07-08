package X;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubOnlySpacePreviewSetting;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0JoX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503310JoX extends C502700JnY {
    public final View LL;
    public final SubSpaceFeedVM LLILLJJLI;
    public final C16F5 LLILLL;
    public final C1324720kZq LLILZ;

    public C503310JoX(View view, SubSpaceFeedVM subSpaceFeedVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceFeedVM;
        this.LLILLL = (C16F5) view.findViewById(R.id.joq);
        this.LLILZ = (C1324720kZq) view.findViewById(R.id.h2q);
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
    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
        C503230JoP c503230JoP;
        C504510JqT c504510JqT;
        int i;
        boolean z;
        int i2;
        CharSequence charSequenceLJIJI;
        int i3;
        if ((abstractC503810JpL instanceof C503230JoP) && (c503230JoP = (C503230JoP) abstractC503810JpL) != null) {
            if (interfaceC2753014t instanceof C504510JqT) {
                c504510JqT = (C504510JqT) interfaceC2753014t;
            } else {
                c504510JqT = null;
            }
            ViewGroup.LayoutParams layoutParams = this.LL.getLayoutParams();
            layoutParams.height = c503230JoP.LIZ;
            C786410Ut5.W5(this.LL, layoutParams);
            this.LL.requestLayout();
            if (this.LLILLJJLI.zQ2()) {
                C16F5 c16f5 = this.LLILLL;
                if (c504510JqT != null) {
                    z = c504510JqT.LLILZIL;
                } else {
                    z = false;
                }
                if (LiveSubOnlySpacePreviewSetting.INSTANCE.enable() && !z) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (this.LLILLJJLI.DQ2()) {
                        i3 = 2131856647;
                    } else {
                        i3 = 2131849263;
                    }
                    String strLJIJI = C497740JfY.LJIJI(i3);
                    String strSubstring = strLJIJI.substring(a0.LJJJ(strLJIJI, e3.e, 0, false, 6) + 1, a0.LJJJ(strLJIJI, e3.f, 0, false, 6));
                    String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(strLJIJI, e3.e, "", false), e3.f, "", false);
                    int iLJJJ = a0.LJJJ(strLJJIFFI, strSubstring, 0, false, 6);
                    spannableStringBuilder.append((CharSequence) strLJJIFFI);
                    try {
                        C1119920fFW.LJIIIIZZ(spannableStringBuilder, iLJJJ, strSubstring.length() + iLJJJ, 33, 500);
                        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ezs, this.LL.getContext())), iLJJJ, strSubstring.length() + iLJJJ, 33);
                        C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0JoY
                            @Override // android.text.style.ClickableSpan
                            public final void onClick(View view) {
                                String str;
                                String secUid = UserService.getInstance().user().getCurrentUser().getSecUid();
                                if (secUid == null) {
                                    secUid = "";
                                }
                                Pair[] pairArr = new Pair[3];
                                pairArr[0] = new Pair("use_mock_data", "true");
                                pairArr[1] = new Pair("hide_bottom_post", "true");
                                if (this.LL.LLILLJJLI.DQ2()) {
                                    str = "true";
                                } else {
                                    str = "false";
                                }
                                pairArr[2] = new Pair("is_super_fans", str);
                                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(view.getContext(), C508940Jxc.LJ(secUid, "preview", "1", "true", C2097608Jq.LJIIJ(pairArr)));
                            }

                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                            public final void updateDrawState(TextPaint textPaint) {
                                textPaint.setUnderlineText(false);
                            }
                        }, iLJJJ, strSubstring.length() + iLJJJ, 33);
                        charSequenceLJIJI = spannableStringBuilder;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        charSequenceLJIJI = spannableStringBuilder;
                    }
                } else {
                    if (this.LLILLJJLI.DQ2()) {
                        i2 = 2131856660;
                    } else {
                        i2 = 2131844317;
                    }
                    charSequenceLJIJI = C497740JfY.LJIJI(i2);
                }
                c16f5.setText(charSequenceLJIJI);
                this.LLILLL.setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                C16F5 c16f52 = this.LLILLL;
                if (this.LLILLJJLI.DQ2()) {
                    i = 2131856661;
                } else {
                    i = 2131856528;
                }
                c16f52.setText(C497740JfY.LJIJI(i));
            }
            C1143680frq.LJFF(this.LLILZ, "tiktok_live_subscription_demand_1", "ttlive_sub_only_space_creator_voice.png", ImageView.ScaleType.CENTER_CROP, null);
        }
    }
}
