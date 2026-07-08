package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext.PipoRichText;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext.PipoRichTextAttribute;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext.PipoTextAttribute;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0uea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712060uea extends LinearLayout {
    public final TuxTextView LL;

    public C1712060uea(Context context) {
        super(context, null, 0);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(71);
        tuxTextView.setTextColorRes(R.attr.a1j);
        tuxTextView.setMovementMethod(C431260Gvc.LIZ);
        this.LL = tuxTextView;
        setOrientation(1);
        setPadding(C1722120uuo.LIZJ(16), C1722120uuo.LIZJ(4), C1722120uuo.LIZJ(16), C1722120uuo.LIZJ(12));
        addView(tuxTextView, new LinearLayout.LayoutParams(-1, -2));
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
    public final void LIZ(PipoRichText pipoRichText, final C1708990uZd c1708990uZd) {
        String str;
        PipoRichTextAttribute value;
        PipoTextAttribute pipoTextAttribute;
        String str2;
        int iLJJJ;
        PipoTextAttribute pipoTextAttribute2;
        final String str3;
        if (pipoRichText != null && (str = pipoRichText.template) != null && (!a0.LJJJIL(str))) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            Map<String, PipoRichTextAttribute> mapLJ = pipoRichText.arguments;
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            for (Map.Entry<String, PipoRichTextAttribute> entry : mapLJ.entrySet()) {
                String key = entry.getKey();
                if (!(!a0.LJJJIL(key))) {
                    key = null;
                }
                String str4 = key;
                if (str4 != null && (value = entry.getValue()) != null && (pipoTextAttribute = value.textAttribute) != null && (str2 = pipoTextAttribute.text) != null && (!a0.LJJJIL(str2)) && (iLJJJ = a0.LJJJ(spannableStringBuilder, str4, 0, false, 6)) >= 0) {
                    spannableStringBuilder.replace(iLJJJ, str4.length() + iLJJJ, (CharSequence) str2);
                    int length = str2.length() + iLJJJ;
                    if (length <= spannableStringBuilder.length()) {
                        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(72, false), iLJJJ, length, 17);
                        PipoRichTextAttribute value2 = entry.getValue();
                        if (value2 != null && (pipoTextAttribute2 = value2.textAttribute) != null && (str3 = pipoTextAttribute2.link) != null && (!a0.LJJJIL(str3))) {
                            C786410Ut5.q2(spannableStringBuilder, new AbstractC426530Gnz() { // from class: X.0ufd
                                public final /* synthetic */ String LLILZ = null;

                                @Override // android.text.style.ClickableSpan
                                public final void onClick(View view) {
                                    C1714410uiN.LIZLLL(C1714410uiN.LIZ, this.LL.getContext(), str3, null, false, null, c1708990uZd, this.LLILZ, null, null, 828);
                                }

                                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                public final void updateDrawState(TextPaint textPaint) {
                                    int iIntValue;
                                    super.updateDrawState(textPaint);
                                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1i, this.LL.getContext());
                                    if (numLIZJ != null) {
                                        iIntValue = numLIZJ.intValue();
                                    } else {
                                        iIntValue = 0;
                                    }
                                    textPaint.setColor(iIntValue);
                                    textPaint.setUnderlineText(false);
                                }
                            }, iLJJJ, length, 17);
                        }
                    }
                }
            }
            if (!a0.LJJJIL(spannableStringBuilder)) {
                int visibility = getVisibility();
                setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, this);
                this.LL.setText(spannableStringBuilder);
                setClickable(false);
                C786410Ut5.hb(this);
                return;
            }
        }
        int visibility2 = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, this);
        this.LL.setText((CharSequence) null);
        setClickable(false);
        C786410Ut5.hb(this);
    }
}
