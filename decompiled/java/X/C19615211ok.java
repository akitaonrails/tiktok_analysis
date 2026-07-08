package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.ui.state.LiveState;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.poll.PollStickerModel;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.11ok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19615211ok extends AbstractC19588311kP<PollStickerModel> {
    public C1842280y2c LLILZIL;
    public C1842280y2c LLILZLL;
    public C1842280y2c LLIZ;
    public final View LLIZLLLIL;
    public C1664680tQA<PollStickerModel> LLJ;
    public LifecycleOwner LLJI;

    public final void LIZIZ() {
        C1842280y2c c1842280y2c = this.LLILZLL;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, getContext());
        int iIntValue = numLIZJ != null ? numLIZJ.intValue() : 0;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(22.0d)));
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.oz, getContext());
        C2275691E5n.LIZ(iIntValue, iLIZIZ, numLIZJ2 != null ? numLIZJ2.intValue() : 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.0d))), c1842280y2c);
        C1842280y2c c1842280y2c2 = this.LLIZ;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ee, getContext());
        int iIntValue2 = numLIZJ3 != null ? numLIZJ3.intValue() : 0;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(22.0d)));
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.oz, getContext());
        C2275691E5n.LIZ(iIntValue2, iLIZIZ2, numLIZJ4 != null ? numLIZJ4.intValue() : 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.0d))), c1842280y2c2);
    }

    public final C1842280y2c getPollStickerOptionFirstEditText() {
        return this.LLILZLL;
    }

    public final C1842280y2c getPollStickerOptionSecondText() {
        return this.LLIZ;
    }

    public final C1842280y2c getPollStickerTitleEditText() {
        return this.LLILZIL;
    }

    public C19615211ok(Context context) {
        super(0, 8, context, (AttributeSet) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ibi, this, true);
        this.LLILZIL = (C1842280y2c) viewTd.findViewById(R.id.hdv);
        this.LLILZLL = (C1842280y2c) viewTd.findViewById(R.id.hdt);
        this.LLIZ = (C1842280y2c) viewTd.findViewById(R.id.hdu);
        this.LLIZLLLIL = viewTd.findViewById(R.id.mf3);
    }

    public final void setEditTextEditable(boolean z) {
        C1842280y2c c1842280y2c = this.LLILZIL;
        c1842280y2c.setEnabled(z);
        c1842280y2c.setFocusable(z);
        c1842280y2c.setFocusableInTouchMode(z);
        C1842280y2c c1842280y2c2 = this.LLILZLL;
        c1842280y2c2.setEnabled(z);
        c1842280y2c2.setFocusable(z);
        c1842280y2c2.setFocusableInTouchMode(z);
        C1842280y2c c1842280y2c3 = this.LLIZ;
        c1842280y2c3.setEnabled(z);
        c1842280y2c3.setFocusable(z);
        c1842280y2c3.setFocusableInTouchMode(z);
    }

    public final void setPollStickerOptionFirstEditText(C1842280y2c c1842280y2c) {
        this.LLILZLL = c1842280y2c;
    }

    public final void setPollStickerOptionSecondText(C1842280y2c c1842280y2c) {
        this.LLIZ = c1842280y2c;
    }

    public final void setPollStickerTitleEditText(C1842280y2c c1842280y2c) {
        this.LLILZIL = c1842280y2c;
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        String optionText;
        String optionText2;
        this.LLILZ = interactStickerStruct;
        PollStruct pollStruct = interactStickerStruct.getPollStruct();
        if (pollStruct == null) {
            return;
        }
        setEditTextEditable(false);
        this.LLILZIL.setMode(true);
        this.LLILZLL.setMode(true);
        this.LLIZ.setMode(true);
        if (pollStruct.getQuestion().length() > 0) {
            this.LLILZIL.setText(pollStruct.getQuestion());
        } else {
            C786410Ut5.i1(this.LLILZIL, 8);
        }
        C1842280y2c c1842280y2c = this.LLILZLL;
        PollStruct.OptionsBean optionsBean = (PollStruct.OptionsBean) C13LP.LJJJLZIJ(0, pollStruct.getOptions());
        String str = "";
        if (optionsBean == null || (optionText = optionsBean.getOptionText()) == null) {
            optionText = "";
        }
        c1842280y2c.setText(optionText);
        C1842280y2c c1842280y2c2 = this.LLIZ;
        PollStruct.OptionsBean optionsBean2 = (PollStruct.OptionsBean) C13LP.LJJJLZIJ(1, pollStruct.getOptions());
        if (optionsBean2 != null && (optionText2 = optionsBean2.getOptionText()) != null) {
            str = optionText2;
        }
        c1842280y2c2.setText(str);
        C19591311kt c19591311kt = C19591311kt.LIZ;
        C1842280y2c c1842280y2c3 = this.LLILZIL;
        c19591311kt.getClass();
        C19591311kt.LJIIIIZZ(c1842280y2c3, 10.0d);
        C19591311kt.LJIIIIZZ(this.LLILZLL, 20.0d);
        C19591311kt.LJIIIIZZ(this.LLIZ, 20.0d);
        LIZIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(LifecycleOwner lifecycleOwner, C1664680tQA c1664680tQA) {
        this.LLJ = c1664680tQA;
        this.LLJI = lifecycleOwner;
        final C1842280y2c c1842280y2c = this.LLILZIL;
        c1842280y2c.addTextChangedListener(new TextWatcher(c1842280y2c) { // from class: X.11BS
            public final EditText LL;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            {
                this.LL = c1842280y2c;
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                if (C390240FRu.LIZIZ(this.LL, 3)) {
                    EditText editText = this.LL;
                    editText.setSelection(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUPDAF066IbW2yRJJJGPjS58Uvl43U=", null)).length());
                }
                EditText editText2 = this.LL;
                C11BU.LIZ = C390240FRu.LIZ(editText2, editText2.getMaxWidth());
                EditText editText3 = this.LL;
                editText3.setSelection(C2204961BRm.LLJILLL(editText3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUPDAF066IbW2yRJJJGPjS58Uvl43U=", null)).length());
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C19591311kt c19591311kt = C19591311kt.LIZ;
                EditText editText = this.LL;
                c19591311kt.getClass();
                C19591311kt.LJIIIIZZ(editText, 10.0d);
            }
        });
        final C1842280y2c c1842280y2c2 = this.LLILZLL;
        final C1842280y2c c1842280y2c3 = this.LLIZ;
        c1842280y2c2.addTextChangedListener(new TextWatcher(c1842280y2c2, c1842280y2c3) { // from class: X.11BR
            public final EditText LL;
            public final EditText LLILLJJLI;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                if (C390240FRu.LIZIZ(this.LL, 1)) {
                    EditText editText = this.LL;
                    editText.setSelection(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUPDAF067kCW2mbHqNbMheP5Fzu7m43", null)).length());
                }
                String strValueOf = String.valueOf(editable);
                if (a0.LJJIZ(strValueOf, '\r', 0, false, 6) >= 0 || a0.LJJIZ(strValueOf, '\n', 0, false, 6) >= 0) {
                    this.LL.setText(u.LJJIFFI(u.LJJIFFI(strValueOf, "\r", "", false), "\n", "", false));
                    EditText editText2 = this.LL;
                    editText2.setSelection(C2204961BRm.LLJILLL(editText2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUPDAF067kCW2mbHqNbMheP5Fzu7m43", null)).length());
                    EditText editText3 = this.LLILLJJLI;
                    if (editText3 != null) {
                        editText3.setFocusable(true);
                        editText3.setFocusableInTouchMode(true);
                        editText3.requestFocus();
                        KeyboardUtils.LIZJ(editText3.getContext(), editText3);
                        editText3.setSelection(C2204961BRm.LLJILLL(editText3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38Ju7d/GKSURBhp+x8qZP6SnHXi+X1BvYYJMTzwSHrRBzrfETw==", null)).length());
                    }
                }
            }

            {
                this.LL = c1842280y2c2;
                this.LLILLJJLI = c1842280y2c3;
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C19591311kt c19591311kt = C19591311kt.LIZ;
                EditText editText = this.LL;
                c19591311kt.getClass();
                C19591311kt.LJIIIIZZ(editText, 20.0d);
            }
        });
        final C1842280y2c c1842280y2c4 = this.LLIZ;
        LifecycleOwner lifecycleOwner2 = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        c1842280y2c4.addTextChangedListener(new TextWatcher(c1842280y2c4, objArr) { // from class: X.11BR
            public final EditText LL;
            public final EditText LLILLJJLI;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                if (C390240FRu.LIZIZ(this.LL, 1)) {
                    EditText editText = this.LL;
                    editText.setSelection(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUPDAF067kCW2mbHqNbMheP5Fzu7m43", null)).length());
                }
                String strValueOf = String.valueOf(editable);
                if (a0.LJJIZ(strValueOf, '\r', 0, false, 6) >= 0 || a0.LJJIZ(strValueOf, '\n', 0, false, 6) >= 0) {
                    this.LL.setText(u.LJJIFFI(u.LJJIFFI(strValueOf, "\r", "", false), "\n", "", false));
                    EditText editText2 = this.LL;
                    editText2.setSelection(C2204961BRm.LLJILLL(editText2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUPDAF067kCW2mbHqNbMheP5Fzu7m43", null)).length());
                    EditText editText3 = this.LLILLJJLI;
                    if (editText3 != null) {
                        editText3.setFocusable(true);
                        editText3.setFocusableInTouchMode(true);
                        editText3.requestFocus();
                        KeyboardUtils.LIZJ(editText3.getContext(), editText3);
                        editText3.setSelection(C2204961BRm.LLJILLL(editText3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38Ju7d/GKSURBhp+x8qZP6SnHXi+X1BvYYJMTzwSHrRBzrfETw==", null)).length());
                    }
                }
            }

            {
                this.LL = c1842280y2c4;
                this.LLILLJJLI = objArr;
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C19591311kt c19591311kt = C19591311kt.LIZ;
                EditText editText = this.LL;
                c19591311kt.getClass();
                C19591311kt.LJIIIIZZ(editText, 20.0d);
            }
        });
        C19591311kt c19591311kt = C19591311kt.LIZ;
        C1842280y2c c1842280y2c5 = this.LLILZIL;
        c19591311kt.getClass();
        C19591311kt.LJIIIIZZ(c1842280y2c5, 10.0d);
        C19591311kt.LJIIIIZZ(this.LLILZLL, 20.0d);
        C19591311kt.LJIIIIZZ(this.LLIZ, 20.0d);
        LIZIZ();
        this.LLILZIL.setOnKeyListener(new View.OnKeyListener() { // from class: X.11BT
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (66 == i && keyEvent.getAction() == 0 && C11BU.LIZ >= 3) {
                    return true;
                }
                return false;
            }
        });
        C1664680tQA<PollStickerModel> c1664680tQA2 = this.LLJ;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        LiveState<V> liveStateLIZ = c1664680tQA2.LIZ(new C2217381BqS() { // from class: X.11om
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((PollStickerModel) obj).getVisible());
            }
        });
        LifecycleOwner lifecycleOwner3 = this.LLJI;
        if (lifecycleOwner3 == null) {
            lifecycleOwner3 = null;
        }
        liveStateLIZ.LJIIIZ(lifecycleOwner3, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 673));
        C1664680tQA<PollStickerModel> c1664680tQA3 = this.LLJ;
        if (c1664680tQA3 == null) {
            c1664680tQA3 = null;
        }
        LiveState<V> liveStateLIZ2 = c1664680tQA3.LIZ(new C2217381BqS() { // from class: X.11ol
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((PollStickerModel) obj).getEditable());
            }
        });
        LifecycleOwner lifecycleOwner4 = this.LLJI;
        if (lifecycleOwner4 == null) {
            lifecycleOwner4 = null;
        }
        liveStateLIZ2.LJIIIZ(lifecycleOwner4, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 674));
        C1664680tQA<PollStickerModel> c1664680tQA4 = this.LLJ;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        LiveState<V> liveStateLIZ3 = c1664680tQA4.LIZ(new C2217381BqS() { // from class: X.11oj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((PollStickerModel) obj).getClickable());
            }
        });
        LifecycleOwner lifecycleOwner5 = this.LLJI;
        if (lifecycleOwner5 == null) {
            lifecycleOwner5 = null;
        }
        liveStateLIZ3.LJIIIZ(lifecycleOwner5, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 675));
        C1664680tQA<PollStickerModel> c1664680tQA5 = this.LLJ;
        if (c1664680tQA5 == null) {
            c1664680tQA5 = null;
        }
        LiveState<V> liveStateLIZ4 = c1664680tQA5.LIZ(new C2217371BqR() { // from class: X.0oGK
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((PollStickerModel) obj).getQuestion();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((PollStickerModel) obj).setQuestion((String) obj2);
            }
        });
        LifecycleOwner lifecycleOwner6 = this.LLJI;
        if (lifecycleOwner6 == null) {
            lifecycleOwner6 = null;
        }
        liveStateLIZ4.LJIIIZ(lifecycleOwner6, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 676));
        C1664680tQA<PollStickerModel> c1664680tQA6 = this.LLJ;
        if (c1664680tQA6 == null) {
            c1664680tQA6 = null;
        }
        LiveState<V> liveStateLIZ5 = c1664680tQA6.LIZ(new C2217371BqR() { // from class: X.0oGM
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((PollStickerModel) obj).getOption1();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((PollStickerModel) obj).setOption1((String) obj2);
            }
        });
        LifecycleOwner lifecycleOwner7 = this.LLJI;
        if (lifecycleOwner7 == null) {
            lifecycleOwner7 = null;
        }
        liveStateLIZ5.LJIIIZ(lifecycleOwner7, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 671));
        C1664680tQA<PollStickerModel> c1664680tQA7 = this.LLJ;
        if (c1664680tQA7 == null) {
            c1664680tQA7 = null;
        }
        LiveState<V> liveStateLIZ6 = c1664680tQA7.LIZ(new C2217371BqR() { // from class: X.0oGL
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((PollStickerModel) obj).getOption2();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((PollStickerModel) obj).setOption2((String) obj2);
            }
        });
        LifecycleOwner lifecycleOwner8 = this.LLJI;
        if (lifecycleOwner8 != null) {
            lifecycleOwner2 = lifecycleOwner8;
        }
        liveStateLIZ6.LJIIIZ(lifecycleOwner2, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 672));
    }
}
