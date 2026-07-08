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
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.hashtag.HashTagStickerModel;
import com.zhiliaoapp.musically.R;
import java.lang.Character;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11rE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19630611rE extends AbstractC19588311kP<HashTagStickerModel> {
    public C1664680tQA<HashTagStickerModel> LLILZIL;
    public LifecycleOwner LLILZLL;
    public C19631011rI LLIZ;
    public TextView LLIZLLLIL;
    public ViewGroup LLJ;
    public boolean LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public int LLJJJJ;

    private final int getIconPaddingBottom() {
        return ((Number) this.LLJILLL.getValue()).intValue();
    }

    private final int getIconPaddingEnd() {
        return ((Number) this.LLJILJIL.getValue()).intValue();
    }

    private final int getIconPaddingStart() {
        return ((Number) this.LLJIJIL.getValue()).intValue();
    }

    private final int getIconPaddingTop() {
        return ((Number) this.LLJILJILJ.getValue()).intValue();
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
        if (textView2 == null) {
            textView2 = null;
        }
        int paddingRight = textView2.getPaddingRight();
        C19631011rI c19631011rI = this.LLIZ;
        if (c19631011rI == null) {
            c19631011rI = null;
        }
        int paddingLeft2 = c19631011rI.getPaddingLeft();
        C19631011rI c19631011rI2 = this.LLIZ;
        return this.LLJJJJ - (((paddingLeft + paddingRight) + paddingLeft2) + (c19631011rI2 != null ? c19631011rI2 : null).getPaddingRight());
    }

    private final int getMinTextSize() {
        return ((Number) this.LLJJJIL.getValue()).intValue();
    }

    private final int getTextPaddingBottom() {
        return ((Number) this.LLJJIJI.getValue()).intValue();
    }

    private final int getTextPaddingEnd() {
        return ((Number) this.LLJJI.getValue()).intValue();
    }

    private final int getTextPaddingStart() {
        return ((Number) this.LLJJ.getValue()).intValue();
    }

    private final int getTextPaddingTop() {
        return ((Number) this.LLJJIII.getValue()).intValue();
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
        C19631011rI c19631011rI = this.LLIZ;
        if (c19631011rI == null) {
            c19631011rI = null;
        }
        c19631011rI.setPadding(getTextPaddingStart(), getTextPaddingTop(), getTextPaddingEnd(), getTextPaddingBottom());
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
        C19631011rI c19631011rI = this.LLIZ;
        if (c19631011rI == null) {
            c19631011rI = null;
        }
        c19631011rI.setPadding(getTextPaddingEnd(), getTextPaddingTop(), getTextPaddingStart(), getTextPaddingBottom());
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

    public final EditText getTitleEditText() {
        C19631011rI c19631011rI = this.LLIZ;
        if (c19631011rI != null) {
            return c19631011rI;
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
        this.LLJJIJIIJIL = z;
    }

    public final void LJIIIIZZ() {
        FrameLayout.LayoutParams layoutParams;
        boolean z = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d5b, this, true) instanceof LinearLayout;
        this.LLJ = (ViewGroup) findViewById(R.id.jh5);
        TextView textView = (TextView) findViewById(R.id.zt6);
        this.LLIZLLLIL = textView;
        if (textView == null) {
            textView = null;
        }
        textView.setTypeface(C786410Ut5.v4(getContext().getAssets(), "mention_and_hashtag.ttf"));
        C19631011rI c19631011rI = (C19631011rI) findViewById(R.id.he9);
        this.LLIZ = c19631011rI;
        if (c19631011rI == null) {
            c19631011rI = null;
        }
        c19631011rI.setHint(getContext().getResources().getString(2131829853));
        if (this.LLJI) {
            ViewGroup viewGroup = this.LLJ;
            if (viewGroup == null) {
                viewGroup = null;
            }
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            viewGroup.setBackground(c384050F3z.LIZ(getContext()));
            C19631011rI c19631011rI2 = this.LLIZ;
            if (c19631011rI2 == null) {
                c19631011rI2 = null;
            }
            c19631011rI2.setTuxFont(13);
            TextView textView2 = this.LLIZLLLIL;
            if (textView2 == null) {
                textView2 = null;
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_color_hashtag;
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
            textView4.setText("#");
        }
        setTextSize(getMaxTextSize());
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (!(layoutParams2 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams2) == null) {
            return;
        }
        layoutParams.gravity = 17;
    }

    public C19630611rE(Context context) {
        super(0, 8, context, (AttributeSet) null);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 994));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 993));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 995));
        this.LLJILLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 991));
        this.LLJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3156));
        this.LLJJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 999));
        this.LLJJIII = C452501pT.LIZIZ(new AwS573S0100000_29(this, LSPassThroughRecordSizeConfig.DEFAULT));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 998));
        this.LLJJIJIIJIL = getLayoutDirection() == 1;
        this.LLJJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 996));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 997));
    }

    public static void LIZIZ(C19630611rE c19630611rE) throws Throwable {
        String string;
        String string2;
        float fMeasureText;
        TextView textView = c19630611rE.LLIZLLLIL;
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
        C19631011rI c19631011rI = c19630611rE.LLIZ;
        if (c19631011rI == null) {
            c19631011rI = null;
        }
        Editable editableF = C2204961BRm.F(c19631011rI, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUMDA5xjmzgUIpIcyWbiyvlya5zbwz+5UyyEAZ1e5PFIyw=", null));
        if (editableF != null) {
            string2 = editableF.toString();
        } else {
            string2 = null;
        }
        if ((!c19630611rE.LLJI && (string == null || string.length() == 0)) || string2 == null || string2.length() == 0) {
            c19630611rE.setTextSize(c19630611rE.getMaxTextSize());
            C19631011rI c19631011rI2 = c19630611rE.LLIZ;
            if (c19631011rI2 != null) {
                textView2 = c19631011rI2;
            }
            textView2.setHint(c19630611rE.getContext().getResources().getString(2131829853));
            return;
        }
        C19631011rI c19631011rI3 = c19630611rE.LLIZ;
        if (c19631011rI3 == null) {
            c19631011rI3 = null;
        }
        c19631011rI3.setHint("");
        if (string == null) {
            string = "";
        }
        C19631011rI c19631011rI4 = c19630611rE.LLIZ;
        if (c19631011rI4 == null) {
            c19631011rI4 = null;
        }
        TextPaint textPaint = new TextPaint(c19631011rI4.getPaint());
        TextView textView3 = c19630611rE.LLIZLLLIL;
        if (textView3 != null) {
            textView2 = textView3;
        }
        TextPaint textPaint2 = new TextPaint(textView2.getPaint());
        int maxTextWidth = c19630611rE.getMaxTextWidth();
        int maxTextSize = c19630611rE.getMaxTextSize();
        int minTextSize = c19630611rE.getMinTextSize();
        if (minTextSize <= maxTextSize) {
            while (true) {
                float fLJIILLIIL = C12ES.LJIILLIIL(maxTextSize, c19630611rE.getContext());
                textPaint2.setTextSize(fLJIILLIIL);
                if (c19630611rE.LLJI) {
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
            maxTextSize = c19630611rE.getMinTextSize();
        } else {
            maxTextSize = c19630611rE.getMinTextSize();
        }
        c19630611rE.setTextSize(maxTextSize);
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
            C19631011rI c19631011rI = this.LLIZ;
            TextView textView = null;
            if (c19631011rI == null) {
                c19631011rI = null;
            }
            float f = i;
            c19631011rI.setTextSize(f);
            TextView textView2 = this.LLIZLLLIL;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setTextSize((22.0f / getMaxTextSize()) * f);
            if (this.LLJI) {
                float maxTextSize = (f * 1.0f) / getMaxTextSize();
                TextView textView3 = this.LLIZLLLIL;
                if (textView3 == null) {
                    textView3 = null;
                }
                C786410Ut5.Mb(maxTextSize, textView3);
                TextView textView4 = this.LLIZLLLIL;
                if (textView4 != null) {
                    textView = textView4;
                }
                C786410Ut5.nc(maxTextSize, textView);
            }
        }
    }

    public final void LJII(StickerModel stickerModel) {
        C19591211ks interactStickerContainerCommonParam;
        Function1<String, Typeface> function1;
        Typeface typefaceInvoke;
        if (stickerModel instanceof HashTagStickerModel) {
            this.LLJJJJ = C12ES.LJIIJ(getContext()) - (((int) C12ES.LIZJ(8.0f, getContext())) * 2);
            LJIIIIZZ();
            LJFF();
            C19631011rI c19631011rI = this.LLIZ;
            C19631011rI c19631011rI2 = null;
            if (c19631011rI == null) {
                c19631011rI = null;
            }
            c19631011rI.clearFocus();
            C19631011rI c19631011rI3 = this.LLIZ;
            if (c19631011rI3 == null) {
                c19631011rI3 = null;
            }
            c19631011rI3.setClickable(false);
            C19631011rI c19631011rI4 = this.LLIZ;
            if (c19631011rI4 == null) {
                c19631011rI4 = null;
            }
            c19631011rI4.setFocusable(false);
            C19631011rI c19631011rI5 = this.LLIZ;
            if (c19631011rI5 == null) {
                c19631011rI5 = null;
            }
            c19631011rI5.setMode(true);
            HashTagStickerModel hashTagStickerModel = (HashTagStickerModel) stickerModel;
            LJIIJ(hashTagStickerModel.getHashtagName());
            if (!this.LLJI && (interactStickerContainerCommonParam = getInteractStickerContainerCommonParam()) != null && (function1 = interactStickerContainerCommonParam.LJIIIZ) != null && (typefaceInvoke = function1.invoke("Neon")) != null) {
                C19631011rI c19631011rI6 = this.LLIZ;
                if (c19631011rI6 != null) {
                    c19631011rI2 = c19631011rI6;
                }
                c19631011rI2.setTypeface(typefaceInvoke);
            }
            String hashtagName = hashTagStickerModel.getHashtagName();
            if (hashtagName != null) {
                if (LJIIIZ(hashtagName)) {
                    if (!this.LLJJIJIIJIL) {
                        LJ();
                        this.LLJJIJIIJIL = true;
                        return;
                    }
                    return;
                }
                if (!this.LLJJIJIIJIL) {
                    return;
                }
                LIZLLL();
                this.LLJJIJIIJIL = false;
            }
        }
    }

    public final void LJIIJ(String str) {
        int length;
        C19631011rI c19631011rI = this.LLIZ;
        C19631011rI c19631011rI2 = null;
        if (c19631011rI == null) {
            c19631011rI = null;
        }
        if (Intrinsics.LJFF(String.valueOf(C2204961BRm.F(c19631011rI, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUMDA5xjmzgUIpIcyWbiyvlya5zbwz+5UyyEAZ1e5PFIyw=", null))), str)) {
            return;
        }
        C19631011rI c19631011rI3 = this.LLIZ;
        if (c19631011rI3 == null) {
            c19631011rI3 = null;
        }
        c19631011rI3.setText(str);
        C19631011rI c19631011rI4 = this.LLIZ;
        if (c19631011rI4 == null) {
            c19631011rI4 = null;
        }
        c19631011rI4.setHint("");
        C19631011rI c19631011rI5 = this.LLIZ;
        if (c19631011rI5 != null) {
            c19631011rI2 = c19631011rI5;
        }
        if (str != null) {
            length = str.length();
        } else {
            length = 0;
        }
        c19631011rI2.setSelection(Math.min(50, length));
        LIZIZ(this);
    }

    public C19630611rE(C19EG c19eg, C19591211ks c19591211ks) {
        super(0, c19eg, (AttributeSet) null, c19591211ks);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 994));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 993));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 995));
        this.LLJILLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 991));
        this.LLJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3156));
        this.LLJJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 999));
        this.LLJJIII = C452501pT.LIZIZ(new AwS573S0100000_29(this, LSPassThroughRecordSizeConfig.DEFAULT));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 998));
        this.LLJJIJIIJIL = getLayoutDirection() == 1;
        this.LLJJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 996));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 997));
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        boolean useCapsuleStyle;
        HashTagStickerModel hashTagStickerModel;
        this.LLILZ = interactStickerStruct;
        if ((stickerModel instanceof HashTagStickerModel) && (hashTagStickerModel = (HashTagStickerModel) stickerModel) != null) {
            useCapsuleStyle = hashTagStickerModel.getUseCapsuleStyle();
        } else {
            useCapsuleStyle = false;
        }
        this.LLJI = useCapsuleStyle;
        LJII(stickerModel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJI(LifecycleOwner lifecycleOwner, C1664680tQA c1664680tQA) {
        this.LLILZIL = c1664680tQA;
        this.LLILZLL = lifecycleOwner;
        this.LLJI = ((HashTagStickerModel) c1664680tQA.LIZ).getUseCapsuleStyle();
        this.LLJJJJ = C12ES.LJIIJ(getContext()) - (((int) C12ES.LIZJ(8.0f, getContext())) * 2);
        LJIIIIZZ();
        LJFF();
        C19631011rI c19631011rI = this.LLIZ;
        LifecycleOwner lifecycleOwner2 = null;
        if (c19631011rI == null) {
            c19631011rI = null;
        }
        c19631011rI.addTextChangedListener(new C19773412Ya(this, 20));
        C1664680tQA<HashTagStickerModel> c1664680tQA2 = this.LLILZIL;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        LiveState<V> liveStateLIZ = c1664680tQA2.LIZ(new C2217371BqR() { // from class: X.11np
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((HashTagStickerModel) obj).getEditable());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((HashTagStickerModel) obj).setEditable(((Boolean) obj2).booleanValue());
            }
        });
        LifecycleOwner lifecycleOwner3 = this.LLILZLL;
        if (lifecycleOwner3 == null) {
            lifecycleOwner3 = null;
        }
        liveStateLIZ.LJIIIZ(lifecycleOwner3, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 721));
        C1664680tQA<HashTagStickerModel> c1664680tQA3 = this.LLILZIL;
        if (c1664680tQA3 == null) {
            c1664680tQA3 = null;
        }
        LiveState<V> liveStateLIZ2 = c1664680tQA3.LIZ(new C2217371BqR() { // from class: X.11nr
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((HashTagStickerModel) obj).getHashtagName();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((HashTagStickerModel) obj).setHashtagName((String) obj2);
            }
        });
        LifecycleOwner lifecycleOwner4 = this.LLILZLL;
        if (lifecycleOwner4 == null) {
            lifecycleOwner4 = null;
        }
        liveStateLIZ2.LJIIIZ(lifecycleOwner4, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 722));
        C1664680tQA<HashTagStickerModel> c1664680tQA4 = this.LLILZIL;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        LiveState<V> liveStateLIZ3 = c1664680tQA4.LIZ(new C2217381BqS() { // from class: X.11nq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((HashTagStickerModel) obj).getVisible());
            }
        });
        LifecycleOwner lifecycleOwner5 = this.LLILZLL;
        if (lifecycleOwner5 != null) {
            lifecycleOwner2 = lifecycleOwner5;
        }
        liveStateLIZ3.LJIIIZ(lifecycleOwner2, Lifecycle.State.STARTED, new AwS598S0100000_19(this, 804));
    }
}
