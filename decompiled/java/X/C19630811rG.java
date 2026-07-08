package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.mention.MentionStickerModel;
import com.zhiliaoapp.musically.R;
import java.lang.Character;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.11rG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19630811rG extends AbstractC19588311kP<MentionStickerModel> {
    public C1664680tQA<MentionStickerModel> LLILZIL;
    public LifecycleOwner LLILZLL;
    public C19631011rI LLIZ;
    public TextView LLIZLLLIL;
    public ViewGroup LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public int LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public int LLJJJJ;

    private final int getIconPaddingBottom() {
        return ((Number) this.LLJJ.getValue()).intValue();
    }

    private final int getIconPaddingEnd() {
        return ((Number) this.LLJILJILJ.getValue()).intValue();
    }

    private final int getIconPaddingStart() {
        return ((Number) this.LLJILJIL.getValue()).intValue();
    }

    private final int getIconPaddingTop() {
        return ((Number) this.LLJILLL.getValue()).intValue();
    }

    private final int getMaxTextSize() {
        return ((Number) this.LLJJJ.getValue()).intValue();
    }

    private final int getMaxTextWidth() {
        TextView textView = this.LLIZLLLIL;
        if (textView == null) {
            textView = null;
        }
        int paddingLeft = textView.getPaddingLeft();
        TextView textView2 = this.LLIZLLLIL;
        return this.LLJJJJ - (((paddingLeft + (textView2 != null ? textView2 : null).getPaddingRight()) + getEditText().getPaddingLeft()) + getEditText().getPaddingRight());
    }

    private final int getMinTextSize() {
        return ((Number) this.LLJJJIL.getValue()).intValue();
    }

    private final int getTextPaddingBottom() {
        return ((Number) this.LLJJIJIIJIL.getValue()).intValue();
    }

    private final int getTextPaddingEnd() {
        return ((Number) this.LLJJIII.getValue()).intValue();
    }

    private final int getTextPaddingStart() {
        return ((Number) this.LLJJI.getValue()).intValue();
    }

    private final int getTextPaddingTop() {
        return ((Number) this.LLJJIJI.getValue()).intValue();
    }

    public final void LIZLLL() {
        ViewGroup viewGroup = this.LLJ;
        if (viewGroup == null) {
            viewGroup = null;
        }
        TextView textView = this.LLIZLLLIL;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.LJJJLZIJ(textView, viewGroup);
        TextView textView2 = this.LLIZLLLIL;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setPadding(getIconPaddingStart(), getIconPaddingTop(), getIconPaddingEnd(), getIconPaddingBottom());
        getEditText().setPadding(getTextPaddingStart(), getTextPaddingTop(), getTextPaddingEnd(), getTextPaddingBottom());
        if (getLayoutDirection() == 1) {
            ViewGroup viewGroup2 = this.LLJ;
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            TextView textView3 = this.LLIZLLLIL;
            viewGroup2.addView(textView3 != null ? textView3 : null, 1);
            return;
        }
        ViewGroup viewGroup3 = this.LLJ;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        TextView textView4 = this.LLIZLLLIL;
        viewGroup3.addView(textView4 != null ? textView4 : null, 0);
    }

    public final void LJ() {
        ViewGroup viewGroup = this.LLJ;
        if (viewGroup == null) {
            viewGroup = null;
        }
        TextView textView = this.LLIZLLLIL;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.LJJJLZIJ(textView, viewGroup);
        TextView textView2 = this.LLIZLLLIL;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setPadding(getIconPaddingEnd(), getIconPaddingTop(), getIconPaddingStart(), getIconPaddingBottom());
        getEditText().setPadding(getTextPaddingEnd(), getTextPaddingTop(), getTextPaddingStart(), getTextPaddingBottom());
        if (getLayoutDirection() == 1) {
            ViewGroup viewGroup2 = this.LLJ;
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            TextView textView3 = this.LLIZLLLIL;
            viewGroup2.addView(textView3 != null ? textView3 : null, 0);
            return;
        }
        ViewGroup viewGroup3 = this.LLJ;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        TextView textView4 = this.LLIZLLLIL;
        viewGroup3.addView(textView4 != null ? textView4 : null, 1);
    }

    public final C19631011rI getEditText() {
        C19631011rI c19631011rI = this.LLIZ;
        if (c19631011rI != null) {
            return c19631011rI;
        }
        return null;
    }

    public final EditText getTitleEditText() {
        if (this.LLIZ != null) {
            return getEditText();
        }
        return null;
    }

    public final void LJFF() {
        boolean z = false;
        if (getLayoutDirection() == 1) {
            LJ();
            z = true;
        } else {
            LIZLLL();
        }
        this.LLJI = z;
    }

    public final void LJIIIIZZ() {
        FrameLayout.LayoutParams layoutParams;
        boolean z = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d6e, this, true) instanceof LinearLayout;
        this.LLJ = (ViewGroup) findViewById(R.id.o77);
        TextView textView = (TextView) findViewById(R.id.ztc);
        this.LLIZLLLIL = textView;
        if (textView == null) {
            textView = null;
        }
        textView.setTypeface(C786410Ut5.v4(getContext().getAssets(), "mention_and_hashtag.ttf"));
        setEditText((C19631011rI) findViewById(R.id.heb));
        getEditText().setHint(getContext().getResources().getString(2131829855));
        if (this.LLJIJIL) {
            ViewGroup viewGroup = this.LLJ;
            if (viewGroup == null) {
                viewGroup = null;
            }
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            viewGroup.setBackground(c384050F3z.LIZ(getContext()));
            getEditText().setTuxFont(13);
            TextView textView2 = this.LLIZLLLIL;
            if (textView2 == null) {
                textView2 = null;
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_color_mention;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
            tuxIconDrawableLIZ.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            textView2.setCompoundDrawables(tuxIconDrawableLIZ, null, null, null);
            TextView textView3 = this.LLIZLLLIL;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setText("");
        } else {
            TextView textView4 = this.LLIZLLLIL;
            if (textView4 == null) {
                textView4 = null;
            }
            textView4.setText(e3.g);
        }
        setTextSize(getMaxTextSize());
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (!(layoutParams2 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams2) == null) {
            return;
        }
        layoutParams.gravity = 17;
    }

    public C19630811rG(Context context) {
        super(0, 8, context, (AttributeSet) null);
        this.LLJI = getLayoutDirection() == 1;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1022));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1020));
        this.LLJILLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1023));
        this.LLJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1018));
        this.LLJJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3168));
        this.LLJJIII = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1028));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1014));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1027));
        this.LLJJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1025));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1026));
    }

    public static void LIZIZ(C19630811rG c19630811rG) throws Throwable {
        String string;
        String string2;
        float fMeasureText;
        TextView textView = c19630811rG.LLIZLLLIL;
        TextView textView2 = null;
        if (textView == null) {
            textView = null;
        }
        CharSequence text = textView.getText();
        if (text != null) {
            string = text.toString();
        } else {
            string = null;
        }
        Editable editableF = C2204961BRm.F(c19630811rG.getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUMDA5xjmzgVY5VbziVgivgzbNvUnwbDpofiiVT1Slxnhs=", null));
        if (editableF != null) {
            string2 = editableF.toString();
        } else {
            string2 = null;
        }
        if ((!c19630811rG.LLJIJIL && (string == null || string.length() == 0)) || string2 == null || string2.length() == 0) {
            c19630811rG.setTextSize(c19630811rG.getMaxTextSize());
            c19630811rG.getEditText().setHint(c19630811rG.getContext().getResources().getString(2131829855));
            return;
        }
        c19630811rG.getEditText().setHint("");
        if (string == null) {
            string = "";
        }
        TextPaint textPaint = new TextPaint(c19630811rG.getEditText().getPaint());
        TextView textView3 = c19630811rG.LLIZLLLIL;
        if (textView3 != null) {
            textView2 = textView3;
        }
        TextPaint textPaint2 = new TextPaint(textView2.getPaint());
        int maxTextWidth = c19630811rG.getMaxTextWidth();
        int maxTextSize = c19630811rG.getMaxTextSize();
        int minTextSize = c19630811rG.getMinTextSize();
        if (minTextSize <= maxTextSize) {
            while (true) {
                float fLJIILLIIL = C12ES.LJIILLIIL(maxTextSize, c19630811rG.getContext());
                textPaint2.setTextSize(fLJIILLIIL);
                if (c19630811rG.LLJIJIL) {
                    fMeasureText = ((Number) C1919207fS.LJIIL.getValue()).intValue();
                } else {
                    fMeasureText = textPaint2.measureText(string);
                }
                textPaint.setTextSize(fLJIILLIIL);
                if (fMeasureText + textPaint.measureText(string2.toUpperCase(Locale.getDefault())) >= maxTextWidth) {
                    if (maxTextSize == minTextSize) {
                        break;
                    } else {
                        maxTextSize--;
                    }
                } else {
                    break;
                }
            }
            maxTextSize = c19630811rG.getMinTextSize();
        } else {
            maxTextSize = c19630811rG.getMinTextSize();
        }
        c19630811rG.setTextSize(maxTextSize);
    }

    public static final boolean LJIIIZ(String str) {
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(str.charAt(0));
        if (!Intrinsics.LJFF(unicodeBlockOf, Character.UnicodeBlock.ARABIC) && !Intrinsics.LJFF(unicodeBlockOf, Character.UnicodeBlock.HEBREW) && !Intrinsics.LJFF(unicodeBlockOf, Character.UnicodeBlock.THAANA) && !Intrinsics.LJFF(unicodeBlockOf, Character.UnicodeBlock.SYRIAC) && !Intrinsics.LJFF(unicodeBlockOf, Character.UnicodeBlock.MANDAIC) && !Intrinsics.LJFF(unicodeBlockOf, Character.UnicodeBlock.SAMARITAN) && !Intrinsics.LJFF(unicodeBlockOf, Character.UnicodeBlock.NKO)) {
            return false;
        }
        return true;
    }

    private final void setTextSize(int i) {
        if (this.LLJJIJIL != i) {
            this.LLJJIJIL = i;
            float f = i;
            getEditText().setTextSize(f);
            TextView textView = this.LLIZLLLIL;
            TextView textView2 = null;
            if (textView == null) {
                textView = null;
            }
            textView.setTextSize((22.0f / getMaxTextSize()) * f);
            if (this.LLJIJIL) {
                float maxTextSize = (f * 1.0f) / getMaxTextSize();
                TextView textView3 = this.LLIZLLLIL;
                if (textView3 == null) {
                    textView3 = null;
                }
                C786410Ut5.Mb(maxTextSize, textView3);
                TextView textView4 = this.LLIZLLLIL;
                if (textView4 != null) {
                    textView2 = textView4;
                }
                C786410Ut5.nc(maxTextSize, textView2);
            }
        }
    }

    public final void LJII(StickerModel stickerModel) {
        String userName;
        C19591211ks interactStickerContainerCommonParam;
        Function1<String, Typeface> function1;
        Typeface typefaceInvoke;
        String strLIZIZ;
        if (stickerModel instanceof MentionStickerModel) {
            this.LLJJJJ = C12ES.LJIIJ(getContext()) - (((int) C12ES.LIZJ(8.0f, getContext())) * 2);
            LJIIIIZZ();
            LJFF();
            getEditText().clearFocus();
            getEditText().setClickable(false);
            getEditText().setFocusable(false);
            getEditText().setMode(true);
            MentionStickerModel mentionStickerModel = (MentionStickerModel) stickerModel;
            if (mentionStickerModel.getUser() != null) {
                if (mentionStickerModel.getUseNickName()) {
                    strLIZIZ = C19630911rH.LIZ(mentionStickerModel.getUser());
                } else {
                    strLIZIZ = C19630911rH.LIZIZ(mentionStickerModel.getUser());
                }
                LJIIJ(strLIZIZ);
            } else {
                if (mentionStickerModel.getUseNickName()) {
                    userName = mentionStickerModel.getNickname();
                } else {
                    userName = mentionStickerModel.getUserName();
                }
                LJIIJ(userName);
            }
            if (!this.LLJIJIL && (interactStickerContainerCommonParam = getInteractStickerContainerCommonParam()) != null && (function1 = interactStickerContainerCommonParam.LJIIIZ) != null && (typefaceInvoke = function1.invoke("Neon")) != null) {
                getEditText().setTypeface(typefaceInvoke);
            }
            if (LJIIIZ(String.valueOf(C2204961BRm.F(getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUMDA5xjmzgVY5VbziVgivgzbNvUnwbDpofiiVT1Slxnhs=", null))))) {
                if (!this.LLJI) {
                    LJ();
                    this.LLJI = true;
                    return;
                }
                return;
            }
            if (!this.LLJI) {
                return;
            }
            LIZLLL();
            this.LLJI = false;
        }
    }

    public final void LJIIJ(String str) {
        int length;
        if (Intrinsics.LJFF(String.valueOf(C2204961BRm.F(getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUMDA5xjmzgVY5VbziVgivgzbNvUnwbDpofiiVT1Slxnhs=", null))), str)) {
            return;
        }
        getEditText().setText(str);
        getEditText().setHint("");
        C19631011rI editText = getEditText();
        if (str != null) {
            length = str.length();
        } else {
            length = 0;
        }
        editText.setSelection(Math.min(50, length));
        LIZIZ(this);
    }

    public final void setEditText(C19631011rI c19631011rI) {
        this.LLIZ = c19631011rI;
    }

    public C19630811rG(C19EG c19eg, C19591211ks c19591211ks) {
        super(0, c19eg, (AttributeSet) null, c19591211ks);
        this.LLJI = getLayoutDirection() == 1;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1022));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1020));
        this.LLJILLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1023));
        this.LLJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1018));
        this.LLJJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3168));
        this.LLJJIII = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1028));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1014));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1027));
        this.LLJJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1025));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1026));
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        boolean useCapsuleStyle;
        MentionStickerModel mentionStickerModel;
        this.LLILZ = interactStickerStruct;
        if ((stickerModel instanceof MentionStickerModel) && (mentionStickerModel = (MentionStickerModel) stickerModel) != null) {
            useCapsuleStyle = mentionStickerModel.getUseCapsuleStyle();
        } else {
            useCapsuleStyle = false;
        }
        this.LLJIJIL = useCapsuleStyle;
        LJII(stickerModel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJI(LifecycleOwner lifecycleOwner, C1664680tQA c1664680tQA) {
        this.LLILZIL = c1664680tQA;
        this.LLILZLL = lifecycleOwner;
        this.LLJIJIL = ((MentionStickerModel) c1664680tQA.LIZ).getUseCapsuleStyle();
        this.LLJJJJ = C12ES.LJIIJ(getContext()) - (((int) C12ES.LIZJ(8.0f, getContext())) * 2);
        LJIIIIZZ();
        LJFF();
        getEditText().addTextChangedListener(new C19773412Ya(this, 22));
        C1664680tQA<MentionStickerModel> c1664680tQA2 = this.LLILZIL;
        LifecycleOwner lifecycleOwner2 = null;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        LiveState<V> liveStateLIZ = c1664680tQA2.LIZ(new C2217371BqR() { // from class: X.0oGR
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((MentionStickerModel) obj).getEditable());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((MentionStickerModel) obj).setEditable(((Boolean) obj2).booleanValue());
            }
        });
        LifecycleOwner lifecycleOwner3 = this.LLILZLL;
        if (lifecycleOwner3 == null) {
            lifecycleOwner3 = null;
        }
        liveStateLIZ.LJIIIZ(lifecycleOwner3, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 760));
        C1664680tQA<MentionStickerModel> c1664680tQA3 = this.LLILZIL;
        if (c1664680tQA3 == null) {
            c1664680tQA3 = null;
        }
        LiveState<V> liveStateLIZ2 = c1664680tQA3.LIZ(new C2217371BqR() { // from class: X.0oGS
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((MentionStickerModel) obj).getUser();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((MentionStickerModel) obj).setUser((User) obj2);
            }
        });
        LifecycleOwner lifecycleOwner4 = this.LLILZLL;
        if (lifecycleOwner4 == null) {
            lifecycleOwner4 = null;
        }
        liveStateLIZ2.LJIIIZ(lifecycleOwner4, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 761));
        C1664680tQA<MentionStickerModel> c1664680tQA4 = this.LLILZIL;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        LiveState<V> liveStateLIZ3 = c1664680tQA4.LIZ(new C2217371BqR() { // from class: X.0oGT
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((MentionStickerModel) obj).getNickname();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((MentionStickerModel) obj).setNickname((String) obj2);
            }
        });
        LifecycleOwner lifecycleOwner5 = this.LLILZLL;
        if (lifecycleOwner5 == null) {
            lifecycleOwner5 = null;
        }
        liveStateLIZ3.LJIIIZ(lifecycleOwner5, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 762));
        C1664680tQA<MentionStickerModel> c1664680tQA5 = this.LLILZIL;
        if (c1664680tQA5 == null) {
            c1664680tQA5 = null;
        }
        LiveState<V> liveStateLIZ4 = c1664680tQA5.LIZ(new C2217371BqR() { // from class: X.11rJ
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((MentionStickerModel) obj).getUserName();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((MentionStickerModel) obj).setUserName((String) obj2);
            }
        });
        LifecycleOwner lifecycleOwner6 = this.LLILZLL;
        if (lifecycleOwner6 == null) {
            lifecycleOwner6 = null;
        }
        liveStateLIZ4.LJIIIZ(lifecycleOwner6, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 763));
        C1664680tQA<MentionStickerModel> c1664680tQA6 = this.LLILZIL;
        if (c1664680tQA6 == null) {
            c1664680tQA6 = null;
        }
        LiveState<V> liveStateLIZ5 = c1664680tQA6.LIZ(new C2217381BqS() { // from class: X.11rC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((MentionStickerModel) obj).getVisible());
            }
        });
        LifecycleOwner lifecycleOwner7 = this.LLILZLL;
        if (lifecycleOwner7 != null) {
            lifecycleOwner2 = lifecycleOwner7;
        }
        liveStateLIZ5.LJIIIZ(lifecycleOwner2, Lifecycle.State.STARTED, new AwS598S0100000_19(this, 810));
    }
}
