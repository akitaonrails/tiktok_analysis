package X;

import Y.ARunnableS104S0100000_4;
import Y.AfS173S0100000_4;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReplyContent;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReplyText;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS39S0010000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wmH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1793710wmH extends FrameLayout {
    public final View LL;
    public final View LLILLJJLI;
    public final EditText LLILLL;
    public final RadiusLayout LLILZ;
    public final TuxNavBar LLILZIL;
    public final TuxTextView LLILZLL;
    public final View LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final View LLJ;
    public C1793720wmI LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJILLL;
    public C1790990wht LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;

    public final void LIZLLL() {
        LJII(false);
        String validText = getValidText();
        C1790990wht c1790990wht = this.LLJJ;
        Function2<String, IMQuickReply, Unit> function2 = c1790990wht.LIZIZ;
        if (function2 != null) {
            function2.invoke(validText, c1790990wht.LIZ);
        }
    }

    private final C1793730wmJ getKeyBoardListener() {
        return (C1793730wmJ) this.LLJJIII.getValue();
    }

    private final C1864790ycv getTextWatcher() {
        return (C1864790ycv) this.LLJJI.getValue();
    }

    private final String getValidText() {
        String string = C2204961BRm.LLJILLL(this.LLILLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLZ2c33z6iVbp72oMpFhU7rN0JBeGrZrLJ0g6WBVtjdL6eYIj", null)).toString();
        int length = string.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.LJI(string.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return string.subSequence(i, length + 1).toString();
    }

    public final void LIZIZ() {
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        C1793720wmI c1793720wmI = this.LLJI;
        if (c1793720wmI != null) {
            View view = c1793720wmI.LIZ;
            if (view != null && c1793720wmI.LIZLLL != null) {
                C786410Ut5.C3(view.getViewTreeObserver(), c1793720wmI.LIZLLL);
            }
            c1793720wmI.LIZJ = null;
        }
        C0DLH.LIZ(getContext(), this.LLILLL);
    }

    public final void LIZJ() {
        IMQuickReplyContent iMQuickReplyContent;
        IMQuickReplyText iMQuickReplyText;
        String validText = getValidText();
        if (validText.length() != 0) {
            IMQuickReply iMQuickReply = this.LLJJ.LIZ;
            if (!Intrinsics.LJFF(validText, (iMQuickReply == null || (iMQuickReplyContent = iMQuickReply.content) == null || (iMQuickReplyText = iMQuickReplyContent.text) == null) ? null : iMQuickReplyText.text)) {
                C1397580mTM c1397580mTM = new C1397580mTM(getContext());
                c1397580mTM.LJI(getContext().getString(2131830391));
                c1397580mTM.LIZIZ(getContext().getString(2131830390));
                C985403tE.LIZ(c1397580mTM, new AwS606S0100000_27(this, 356));
                new C1397510mTF(c1397580mTM).LIZLLL();
                return;
            }
        }
        LIZIZ();
        Function1<String, Unit> function1 = this.LLJJ.LIZJ;
        if (function1 != null) {
            function1.invoke("direct_close");
        }
    }

    public C1793710wmH(C19EG c19eg) {
        super(c19eg, null, 0);
        this.LLJJ = new C1790990wht(null, null, null);
        this.LLJJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1117));
        this.LLJJIII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1116));
        View viewSd = C786410Ut5.Sd(R.layout.cf7, C786410Ut5.ne(c19eg), this);
        this.LL = viewSd;
        this.LLILLL = (EditText) viewSd.findViewById(R.id.so3);
        this.LLILLJJLI = viewSd.findViewById(R.id.snv);
        this.LLILZ = (RadiusLayout) viewSd.findViewById(R.id.so4);
        this.LLILZIL = (TuxNavBar) viewSd.findViewById(R.id.so8);
        this.LLILZLL = (TuxTextView) viewSd.findViewById(R.id.snt);
        this.LLIZ = viewSd.findViewById(R.id.snr);
        this.LLIZLLLIL = (TuxTextView) viewSd.findViewById(R.id.sns);
        this.LLJ = viewSd.findViewById(R.id.snq);
    }

    public final void LJ(Editable editable) {
        int iIntValue;
        int iIntValue2;
        String validText = getValidText();
        if (validText.length() > 500) {
            CharSequence charSequenceSubSequence = editable.subSequence(0, 501);
            this.LLILLL.removeTextChangedListener(getTextWatcher());
            this.LLILLL.setText(charSequenceSubSequence);
            this.LLILLL.addTextChangedListener(getTextWatcher());
            this.LLILLL.setSelection(charSequenceSubSequence.length());
            LJI(true);
            LJII(false);
            return;
        }
        if (validText.length() >= 450) {
            int length = validText.length();
            TuxTextView tuxTextView = this.LLIZLLLIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(length);
            sbLIZ.append("/500");
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
            if (!this.LLJILJIL) {
                this.LLJILJIL = true;
                this.LLJIJIL = true;
                C786410Ut5.LJLLLLLL(0, this.LLJ);
                C786410Ut5.LLLLZLL(this.LLILZLL, 8);
                C786410Ut5.LJLLLLLL(8, this.LLIZ);
                RadiusLayout radiusLayout = this.LLILZ;
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, getContext());
                if (numLIZJ != null) {
                    iIntValue2 = numLIZJ.intValue();
                } else {
                    iIntValue2 = 0;
                }
                radiusLayout.setBackgroundColor(iIntValue2);
                this.LLILZ.LIZJ(false);
            }
            LJII(LJFF(validText));
            return;
        }
        if (this.LLJIJIL) {
            this.LLJIJIL = false;
            this.LLJILJIL = false;
            C786410Ut5.LJLLLLLL(8, this.LLJ);
            RadiusLayout radiusLayout2 = this.LLILZ;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, getContext());
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = 0;
            }
            radiusLayout2.setBackgroundColor(iIntValue);
            this.LLILZ.LIZJ(false);
        }
        LJII(LJFF(validText));
    }

    public final boolean LJFF(String str) {
        String str2;
        IMQuickReply iMQuickReply;
        IMQuickReplyContent iMQuickReplyContent;
        IMQuickReplyText iMQuickReplyText;
        C1790990wht c1790990wht = this.LLJJ;
        if (c1790990wht != null && (iMQuickReply = c1790990wht.LIZ) != null && (iMQuickReplyContent = iMQuickReply.content) != null && (iMQuickReplyText = iMQuickReplyContent.text) != null) {
            str2 = iMQuickReplyText.text;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str, str2) || str.length() <= 0 || Intrinsics.LJFF(str, this.LLJILJILJ)) {
            return false;
        }
        return true;
    }

    public final void LJI(boolean z) {
        int iIntValue;
        int iIntValue2;
        this.LLJIJIL = true;
        int i = 0;
        this.LLJILJIL = false;
        C786410Ut5.LJLLLLLL(0, this.LLJ);
        RadiusLayout radiusLayout = this.LLILZ;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        radiusLayout.setBackgroundColor(iIntValue);
        RadiusLayout radiusLayout2 = this.LLILZ;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zs, getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        radiusLayout2.LIZIZ(iIntValue2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0, 0);
        this.LLILZ.LIZJ(true);
        C786410Ut5.LLLLZLL(this.LLILZLL, 0);
        C786410Ut5.LJLLLLLL(0, this.LLIZ);
        this.LLILZLL.setText(2131830807);
        this.LLIZLLLIL.setText("501/500");
        TuxTextView tuxTextView = this.LLIZLLLIL;
        if (!z) {
            i = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i);
    }

    public final void LJII(boolean z) {
        this.LLILZIL.LJJ(new AwS39S0010000_27(z, 20), "save_nav");
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
    public final void LIZ(C19EG c19eg, Lifecycle lifecycle, View view, C1790990wht c1790990wht) {
        String str;
        IMQuickReplyContent iMQuickReplyContent;
        IMQuickReplyText iMQuickReplyText;
        this.LLJJ = c1790990wht;
        TuxNavBar tuxNavBar = this.LLILZIL;
        C0OM1 c0om1 = new C0OM1();
        C1250300ido c1250300ido = new C1250300ido();
        c1250300ido.LIZJ = getContext().getString(2131830806);
        c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
        c1250300ido.LJ = true;
        c1250300ido.LIZ(new AwS571S0100000_27(this, 1112));
        int iIntValue = 0;
        c0om1.LJ(c1250300ido);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getContext().getString(2131830802);
        c0om1.LIZJ = c1250250idj;
        C1250300ido c1250300ido2 = new C1250300ido();
        c1250300ido2.LIZJ = getContext().getString(2131830808);
        c1250300ido2.LIZIZ = "save_nav";
        c1250300ido2.LIZLLL = EnumC638250P1r.PRIMARY;
        c1250300ido2.LJ = true;
        c1250300ido2.LIZ = new AbstractC1786050wZv() { // from class: X.0waV
            @Override // X.AbstractC1786050wZv
            public final void LIZIZ() {
                this.LIZJ.LIZLLL();
            }

            {
                super(1000L);
            }
        };
        c0om1.LIZIZ(c1250300ido2);
        c0om1.LIZLLL = false;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        c0om1.LIZJ(iIntValue);
        tuxNavBar.setNavActions(c0om1);
        boolean z = C786410Ut5.F2(c19eg, "input_method") instanceof InputMethodManager;
        this.LLILLL.addTextChangedListener(getTextWatcher());
        C1793720wmI c1793720wmI = new C1793720wmI(view);
        this.LLJI = c1793720wmI;
        c1793720wmI.LIZJ = getKeyBoardListener();
        if (c1793720wmI.LIZLLL != null) {
            C786410Ut5.x3(view.getViewTreeObserver(), c1793720wmI.LIZLLL);
        }
        this.LLILLL.setCursorVisible(true);
        IMQuickReply iMQuickReply = this.LLJJ.LIZ;
        if (iMQuickReply == null || (iMQuickReplyContent = iMQuickReply.content) == null || (iMQuickReplyText = iMQuickReplyContent.text) == null || (str = iMQuickReplyText.text) == null) {
            str = "";
        }
        this.LLILLL.setText(str);
        this.LLILLL.setSelection(str.length());
        LJII(LJFF(str));
        HandlerHook.viewPost(this, new ARunnableS104S0100000_4(this, 68));
        C1906580ziK.LIZJ().LIZ().LJLLLL(lifecycle, new AfS173S0100000_4(this, 16));
    }
}
