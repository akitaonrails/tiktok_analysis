package X;

import Y.ACListenerS52S0400000_16;
import Y.ARunnableS116S0100000_16;
import Y.ATListenerS335S0200000_6;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.DisclaimerText;
import com.ss.android.ugc.aweme.component.disclaimercomponent.model.AnoleDisclaimerData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cCw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003000cCw extends AbstractC1014240cV4 {
    public static final String LLJLLL = EnumC1008920cMU.DISCLAIMER.getType();
    public final C01GW LLJLIL;
    public ViewGroup LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxIconView LLJLLIL;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return true;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIILL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnoleDisclaimerComponent,type:");
        sbLIZ.append(this.LL.type);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIJI() {
        super.LJIJI();
        this.LLJLILLLLZIIL = null;
        this.LLJLL = null;
        this.LLJLLIL = null;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Nk(AnoleComponentAppearModel anoleComponentAppearModel) {
        super.Nk(anoleComponentAppearModel);
        View view = this.LLJJIJIL;
        if (view == null) {
            return;
        }
        HandlerHook.viewPost(view, new ARunnableS116S0100000_16(view, 127));
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
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        ViewGroup viewGroup2;
        TuxTextView tuxTextView;
        TuxIconView tuxIconView;
        Aweme aweme;
        ViewGroup viewGroup3;
        TuxTextView tuxTextView2;
        AwemeRawAd awemeRawAd;
        super.Fk(viewGroup, interfaceC1014340cVE);
        this.LLJJI = new C1009390cNF(-1.0d, -2.0d);
        ViewGroup viewGroup4 = this.LLJJIII;
        if (viewGroup4 != null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ), R.layout.pf, viewGroup4, false);
            this.LLJJIJIL = viewTd;
            DisclaimerText disclaimerText = null;
            if (viewTd != null) {
                viewGroup2 = (ViewGroup) viewTd.findViewById(R.id.b4s);
            } else {
                viewGroup2 = null;
            }
            this.LLJLILLLLZIIL = viewGroup2;
            View view = this.LLJJIJIL;
            if (view != null) {
                tuxTextView = (TuxTextView) view.findViewById(R.id.b4t);
            } else {
                tuxTextView = null;
            }
            this.LLJLL = tuxTextView;
            View view2 = this.LLJJIJIL;
            if (view2 != null) {
                tuxIconView = (TuxIconView) view2.findViewById(R.id.b4r);
            } else {
                tuxIconView = null;
            }
            this.LLJLLIL = tuxIconView;
            View view3 = this.LLJJIJIL;
            if (view3 != null) {
                view3.findViewById(R.id.b4q);
            }
            AnoleDisclaimerData anoleDisclaimerData = (AnoleDisclaimerData) this.LLJLIL.getValue();
            if (anoleDisclaimerData != null) {
                Integer num = anoleDisclaimerData.type;
                if (num != null) {
                    if (num.intValue() == 1) {
                        TuxTextView tuxTextView3 = this.LLJLL;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setText(anoleDisclaimerData.pureText);
                        }
                        ViewGroup viewGroup5 = this.LLJLILLLLZIIL;
                        if (viewGroup5 != null) {
                            viewGroup5.setBackgroundColor(0);
                        }
                        TuxIconView tuxIconView2 = this.LLJLLIL;
                        if (tuxIconView2 != null) {
                            tuxIconView2.setTintColorRes(R.attr.ef);
                        }
                        C1003010cCx.LIZ(this, 0);
                        return;
                    }
                    if (num.intValue() == 2) {
                        Activity activity = getActivity();
                        if (activity == null) {
                            return;
                        }
                        C1009340cNA c1009340cNA = this.LLILLJJLI;
                        Object obj = c1009340cNA.LIZJ;
                        if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null || (viewGroup3 = this.LLJLILLLLZIIL) == null || (tuxTextView2 = this.LLJLL) == null || (awemeRawAd = c1009340cNA.LIZLLL) == null) {
                            return;
                        }
                        C1003010cCx.LIZ(this, 12);
                        viewGroup3.setBackgroundColor(C960203pA.LIZ(R.attr.e4, this.LLILZ));
                        tuxTextView2.setTuxFont(62);
                        TuxIconView tuxIconView3 = this.LLJLLIL;
                        if (tuxIconView3 != null) {
                            tuxIconView3.setTintColorRes(R.attr.zi);
                        }
                        List<DisclaimerText> list = anoleDisclaimerData.textList;
                        if (list == null) {
                            return;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        Iterator<DisclaimerText> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            DisclaimerText next = it2.next();
                            if (next.type == 1) {
                                disclaimerText = next;
                                break;
                            }
                        }
                        DisclaimerText disclaimerText2 = disclaimerText;
                        for (DisclaimerText disclaimerText3 : list) {
                            String str = disclaimerText3.text;
                            int i = disclaimerText3.type;
                            if (i == 0) {
                                spannableStringBuilder.append((CharSequence) str);
                            } else if (i == 1) {
                                final ACListenerS52S0400000_16 aCListenerS52S0400000_16 = new ACListenerS52S0400000_16(disclaimerText3, awemeRawAd, (C19EG) activity, aweme, 2);
                                final Context context = tuxTextView2.getContext();
                                ClickableSpan clickableSpan = new ClickableSpan(context, aCListenerS52S0400000_16) { // from class: X.0cCy
                                    public final View.OnClickListener LL;
                                    public final Context LLILLJJLI;

                                    @Override // android.text.style.ClickableSpan
                                    public final void onClick(View view4) {
                                        this.LL.onClick(view4);
                                    }

                                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                    public final void updateDrawState(TextPaint textPaint) {
                                        textPaint.setColor(C960203pA.LIZ(R.attr.zi, this.LLILLJJLI));
                                    }

                                    {
                                        this.LL = aCListenerS52S0400000_16;
                                        this.LLILLJJLI = context;
                                    }
                                };
                                int length = spannableStringBuilder.length();
                                spannableStringBuilder.append((CharSequence) str);
                                C786410Ut5.q2(spannableStringBuilder, clickableSpan, length, str.length() + length, 17);
                            }
                        }
                        tuxTextView2.setText(spannableStringBuilder);
                        tuxTextView2.setOnTouchListener(new ATListenerS335S0200000_6(spannableStringBuilder, tuxTextView2, 1));
                        if (disclaimerText2 == null) {
                            return;
                        }
                        C786410Ut5.K7(viewGroup3, new ACListenerS52S0400000_16(disclaimerText2, awemeRawAd, (C19EG) activity, aweme, 1));
                        return;
                    }
                }
                TuxTextView tuxTextView4 = this.LLJLL;
                if (tuxTextView4 == null) {
                    return;
                }
                tuxTextView4.setText(anoleDisclaimerData.pureText);
            }
        }
    }

    public C1003000cCw(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 661));
    }
}
