package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.ies.xelement.input.LynxBaseInputView;
import com.bytedance.ies.xelement.input.LynxTextAreaView;
import com.lynx.base.log.LynxLog;
import com.lynx.xelement.input.LynxUIBaseInput;
import com.ss.android.ugc.tools.chat.message.component.AiChatMessageFeatureComponent;
import com.tts.oecverify.BdTuring;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.19Li, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21524019Li implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void afterTextChanged$3(C21524019Li c21524019Li, Editable editable) {
    }

    public static final void beforeTextChanged$0(C21524019Li c21524019Li, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C21524019Li c21524019Li, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$3(C21524019Li c21524019Li, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$4(C21524019Li c21524019Li, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$5(C21524019Li c21524019Li, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$6(C21524019Li c21524019Li, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$8(C21524019Li c21524019Li, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$9(C21524019Li c21524019Li, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C21524019Li c21524019Li, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(C21524019Li c21524019Li, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$4(C21524019Li c21524019Li, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$5(C21524019Li c21524019Li, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Throwable {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
            case 2:
                afterTextChanged$2(this, editable);
                break;
            case 3:
                afterTextChanged$3(this, editable);
                break;
            case 4:
                afterTextChanged$4(this, editable);
                break;
            case 5:
                afterTextChanged$5(this, editable);
                break;
            case 6:
                afterTextChanged$6(this, editable);
                break;
            case 7:
                afterTextChanged$7(this, editable);
                break;
            case 8:
                afterTextChanged$8(this, editable);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                afterTextChanged$9(this, editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                beforeTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                beforeTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                beforeTextChanged$5(this, charSequence, i, i2, i3);
                break;
            case 6:
                beforeTextChanged$6(this, charSequence, i, i2, i3);
                break;
            case 7:
                beforeTextChanged$7(this, charSequence, i, i2, i3);
                break;
            case 8:
                beforeTextChanged$8(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                beforeTextChanged$9(this, charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                onTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                onTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                onTextChanged$5(this, charSequence, i, i2, i3);
                break;
            case 6:
                onTextChanged$6(this, charSequence, i, i2, i3);
                break;
            case 7:
                onTextChanged$7(this, charSequence, i, i2, i3);
                break;
            case 8:
                onTextChanged$8(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onTextChanged$9(this, charSequence, i, i2, i3);
                break;
        }
    }

    public C21524019Li(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(C21524019Li c21524019Li, Editable editable) {
        Boolean boolValueOf;
        String str;
        LynxBaseInputView lynxBaseInputView = (LynxBaseInputView) c21524019Li.l0;
        C21397018oS c21397018oS = null;
        if (lynxBaseInputView.LLJJIJIIJIL && !lynxBaseInputView.LLJJJJJIL && editable != null) {
            C1298720jtu c1298720jtu = lynxBaseInputView.mContext.LLIZ;
            C1289960jfm c1289960jfm = new C1289960jfm(lynxBaseInputView.getSign(), "input");
            c1289960jfm.LIZIZ(editable.toString(), "value");
            C21397018oS c21397018oS2 = lynxBaseInputView.LL;
            if (c21397018oS2 == null) {
                c21397018oS2 = null;
            }
            c1289960jfm.LIZIZ(Integer.valueOf(c21397018oS2.getSelectionEnd()), "cursor");
            c1289960jfm.LIZIZ(Integer.valueOf(editable.toString().length()), "textLength");
            C21397018oS c21397018oS3 = lynxBaseInputView.LL;
            if (c21397018oS3 == null) {
                c21397018oS3 = null;
            }
            if (c21397018oS3.LJIIIIZZ() != null) {
                boolValueOf = Boolean.valueOf(C21397118oT.LIZIZ(editable));
            } else {
                boolValueOf = null;
            }
            c1289960jfm.LIZIZ(boolValueOf, "isComposing");
            C21397018oS c21397018oS4 = lynxBaseInputView.LL;
            if (c21397018oS4 == null) {
                c21397018oS4 = null;
            }
            if (c21397018oS4.getMPasting()) {
                str = "paste";
            } else {
                str = "normal";
            }
            c1289960jfm.LIZIZ(str, "inputType");
            c1298720jtu.LIZIZ(c1289960jfm);
        }
        LynxBaseInputView lynxBaseInputView2 = (LynxBaseInputView) c21524019Li.l0;
        if (lynxBaseInputView2.LLJJJJJIL) {
            lynxBaseInputView2.LLJJJJJIL = false;
        }
        C21397018oS c21397018oS5 = lynxBaseInputView2.LL;
        if (c21397018oS5 != null) {
            c21397018oS = c21397018oS5;
        }
        c21397018oS.setMPasting(false);
    }

    public static final void afterTextChanged$1(C21524019Li c21524019Li, Editable editable) throws Throwable {
        if (C1316940kNI.LIZ()) {
            LynxTextAreaView lynxTextAreaView = (LynxTextAreaView) c21524019Li.l0;
            boolean z = lynxTextAreaView.LLJJJJJIL;
            lynxTextAreaView.LLJJJJJIL = true;
            if (C1316940kNI.LIZ() && lynxTextAreaView.LLLFZ) {
                Pattern pattern = C439900HMu.LIZ;
                C439900HMu.LIZ((TextView) lynxTextAreaView.mView);
            }
            ((LynxTextAreaView) c21524019Li.l0).LLJJJJJIL = z;
        }
        ((LynxTextAreaView) c21524019Li.l0).LJJJJL();
    }

    public static final void afterTextChanged$2(C21524019Li c21524019Li, Editable editable) {
        int selectionStart;
        int selectionEnd;
        boolean z;
        ((LynxUIBaseInput) c21524019Li.l0).LJJIIZI();
        LynxUIBaseInput lynxUIBaseInput = (LynxUIBaseInput) c21524019Li.l0;
        if (lynxUIBaseInput.mView != 0 && editable != null) {
            C1298720jtu c1298720jtu = lynxUIBaseInput.mContext.LLIZ;
            C1289960jfm c1289960jfm = new C1289960jfm(lynxUIBaseInput.getSign(), "input");
            c1289960jfm.LIZIZ(editable.toString(), "value");
            if (lynxUIBaseInput.mView.isFocused()) {
                selectionStart = ((TextView) lynxUIBaseInput.mView).getSelectionStart();
            } else {
                selectionStart = -1;
            }
            if (lynxUIBaseInput.mView.isFocused()) {
                selectionEnd = ((TextView) lynxUIBaseInput.mView).getSelectionEnd();
            } else {
                selectionEnd = -1;
            }
            c1289960jfm.LIZIZ(Integer.valueOf(selectionStart), "selectionStart");
            c1289960jfm.LIZIZ(Integer.valueOf(selectionEnd), "selectionEnd");
            C21396918oR c21396918oR = (C21396918oR) lynxUIBaseInput.mView;
            Boolean boolValueOf = null;
            if (c21396918oR != null) {
                if (!c21396918oR.LLJ) {
                    LynxLog.w("LynxEditText", "InputConnection has not been initialized yet ");
                } else if (c21396918oR.LLIZLLLIL != null) {
                    int composingSpanStart = BaseInputConnection.getComposingSpanStart(editable);
                    int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(editable);
                    if (composingSpanStart != -1 && composingSpanEnd != -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolValueOf = Boolean.valueOf(z);
                }
            }
            c1289960jfm.LIZIZ(boolValueOf, "isComposing");
            c1298720jtu.LIZIZ(c1289960jfm);
        }
    }

    public static final void afterTextChanged$4(C21524019Li c21524019Li, Editable editable) {
        int length;
        int length2 = 0;
        if (editable != null && (length = editable.length()) > 0 && editable != null && editable.charAt(length - 1) == '\n') {
            editable.delete(length - 1, length);
        }
        C214848196g c214848196g = (C214848196g) c21524019Li.l0;
        if (editable != null) {
            length2 = editable.length();
        }
        c214848196g.LJJI(length2);
    }

    public static final void afterTextChanged$5(C21524019Li c21524019Li, Editable editable) {
        C21405318pn c21405318pn = (C21405318pn) c21524019Li.l0;
        c21405318pn.setIndicatorVisible(c21405318pn.LLILLL.invoke().booleanValue());
    }

    public static final void afterTextChanged$6(C21524019Li c21524019Li, Editable editable) {
        int length;
        String string;
        String string2;
        if (editable != null && (string2 = editable.toString()) != null) {
            length = string2.length();
        } else {
            length = 0;
        }
        int i = C342380DbY.LIZ().inputMaxLength;
        if (length > i) {
            View view = (View) ((C21296918Vz) c21524019Li.l0).LLJJJIL.getValue();
            if (view != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(view);
                c1389890mGx.LJIIJ(C21291518Tx.LJ(EnumC21291418Tw.INPUT_TEXT_LIMIT_TOAST, new Object[0]));
                c1389890mGx.LJIIJJI();
            }
            C0I7D c0i7dLLLLLLJ = ((C21296918Vz) c21524019Li.l0).LLLLLLJ();
            if (c0i7dLLLLLLJ != null) {
                if (editable != null) {
                    string = editable.subSequence(0, i).toString();
                } else {
                    string = null;
                }
                c0i7dLLLLLLJ.setText(string);
                c0i7dLLLLLLJ.setSelection(i);
            }
        }
    }

    public static final void afterTextChanged$7(C21524019Li c21524019Li, Editable editable) {
        if (editable != null) {
            C21359118iL c21359118iL = (C21359118iL) c21524019Li.l0;
            if (c21359118iL.LL != null) {
                if (c21359118iL.LLIZLLLIL != -1) {
                    int length = editable.toString().length();
                    C21359118iL c21359118iL2 = (C21359118iL) c21524019Li.l0;
                    if (length >= c21359118iL2.LLIZLLLIL) {
                        C1638280sja.LIZLLL(C21366318jV.LIZLLL, c21359118iL2.LL.getContext(), ((C21359118iL) c21524019Li.l0).LLIZ).LIZ();
                        editable.delete(editable.length() - 1, editable.length());
                        ((C21359118iL) c21524019Li.l0).LL.setText(editable);
                        ((C21359118iL) c21524019Li.l0).LL.setSelection(editable.length());
                        return;
                    }
                }
                InterfaceC21359018iK interfaceC21359018iK = ((C21359118iL) c21524019Li.l0).LLILZLL;
                if (interfaceC21359018iK == null) {
                    return;
                }
                interfaceC21359018iK.LIZIZ(editable.toString());
            }
        }
    }

    public static final void afterTextChanged$8(C21524019Li c21524019Li, Editable editable) {
        if (editable != null) {
            C21359218iM c21359218iM = (C21359218iM) c21524019Li.l0;
            if (c21359218iM.LLILZLL != null) {
                String str = c21359218iM.LLJ;
                if ((str != null && str.length() <= ((C21359218iM) c21524019Li.l0).LLIZLLLIL) || ((C21359218iM) c21524019Li.l0).LLIZLLLIL <= 0) {
                    ((C21359218iM) c21524019Li.l0).LLILZLL.LIZIZ(editable.toString());
                }
            }
        }
    }

    public static final void afterTextChanged$9(C21524019Li c21524019Li, Editable editable) {
        EditText editText;
        if (editable != null && (editText = ((C21358818iI) c21524019Li.l0).LL) != null) {
            int selectionEnd = editText.getSelectionEnd();
            int length = editable.toString().length();
            C21358818iI c21358818iI = (C21358818iI) c21524019Li.l0;
            int i = c21358818iI.LLIZLLLIL;
            if (1 <= i && i < length) {
                editable.delete(i, length);
                ((C21358818iI) c21524019Li.l0).LL.setText(editable);
                C21358818iI c21358818iI2 = (C21358818iI) c21524019Li.l0;
                int i2 = c21358818iI2.LLIZLLLIL;
                if (selectionEnd > i2) {
                    selectionEnd = (selectionEnd - length) + i2;
                }
                c21358818iI2.LL.setSelection(selectionEnd);
                C1638280sja.LIZLLL(C21366318jV.LIZLLL, ((C21358818iI) c21524019Li.l0).LL.getContext(), ((C21358818iI) c21524019Li.l0).LLIZ).LIZ();
                return;
            }
            InterfaceC21359018iK interfaceC21359018iK = c21358818iI.LLILZLL;
            if (interfaceC21359018iK == null) {
                return;
            }
            interfaceC21359018iK.LIZIZ(editable.toString());
        }
    }

    public static final void beforeTextChanged$1(C21524019Li c21524019Li, CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        LynxTextAreaView lynxTextAreaView = (LynxTextAreaView) c21524019Li.l0;
        if (!lynxTextAreaView.LLJJJJJIL && i3 != 0) {
            C21397018oS c21397018oS = lynxTextAreaView.LLLFFI;
            Object obj = null;
            if (c21397018oS == null) {
                c21397018oS = null;
            }
            Editable editableLLLLII = C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98hIYE2+6xAQb2wHJXw==", null));
            if (editableLLLLII != null) {
                if (C1316940kNI.LIZ()) {
                    int i4 = lynxTextAreaView.LLLI;
                    int i5 = lynxTextAreaView.LLLIIL;
                    if ((i4 & i5) == i5) {
                        int i6 = i + i2;
                        Object[] spans = editableLLLLII.getSpans(i, i6, C0GVZ.class);
                        int length = spans.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length) {
                                break;
                            }
                            Object obj2 = spans[i7];
                            if (editableLLLLII.getSpanStart(obj2) == i && editableLLLLII.getSpanEnd(obj2) == i6) {
                                if (obj2 != null) {
                                    editableLLLLII.removeSpan(obj2);
                                }
                            } else {
                                i7++;
                            }
                        }
                    }
                }
                int i8 = lynxTextAreaView.LLLI;
                int i9 = lynxTextAreaView.LLLIIIL;
                if ((i8 & i9) == i9) {
                    int i10 = i2 + i;
                    Object[] spans2 = editableLLLLII.getSpans(i, i10, C21399218oo.class);
                    int length2 = spans2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length2) {
                            break;
                        }
                        Object obj3 = spans2[i11];
                        if (editableLLLLII.getSpanStart(obj3) == i && editableLLLLII.getSpanEnd(obj3) == i10) {
                            obj = obj3;
                            break;
                        }
                        i11++;
                    }
                    C21399218oo c21399218oo = (C21399218oo) obj;
                    if (c21399218oo != null) {
                        lynxTextAreaView.LLJJJJJIL = true;
                        editableLLLLII.delete(editableLLLLII.getSpanStart(c21399218oo), editableLLLLII.getSpanEnd(c21399218oo));
                        lynxTextAreaView.LLJJJJJIL = true;
                        editableLLLLII.insert(i, c21399218oo.LIZIZ + c21399218oo.LIZ);
                    }
                }
            }
        }
    }

    public static final void beforeTextChanged$7(C21524019Li c21524019Li, CharSequence charSequence, int i, int i2, int i3) {
        InterfaceC21359018iK interfaceC21359018iK = ((C21359118iL) c21524019Li.l0).LLILZLL;
        if (interfaceC21359018iK != null) {
            interfaceC21359018iK.LIZIZ(charSequence.toString());
        }
    }

    public static final void onTextChanged$1(C21524019Li c21524019Li, CharSequence charSequence, int i, int i2, int i3) {
        LynxTextAreaView lynxTextAreaView = (LynxTextAreaView) c21524019Li.l0;
        int i4 = lynxTextAreaView.LLLI;
        int i5 = lynxTextAreaView.LLLIIIL;
        if ((i4 & i5) == i5 && lynxTextAreaView.LLLIIII && !lynxTextAreaView.LLJJJJJIL && i2 == 0 && i3 == 1 && !TextUtils.isEmpty(charSequence) && charSequence != null && (charSequence.charAt(i) == '@' || charSequence.charAt(i) == '#')) {
            LynxTextAreaView lynxTextAreaView2 = (LynxTextAreaView) c21524019Li.l0;
            lynxTextAreaView2.mContext.LLIZ.LIZIZ(new C1289960jfm(lynxTextAreaView2.getSign(), "mention"));
        }
        LynxTextAreaView lynxTextAreaView3 = (LynxTextAreaView) c21524019Li.l0;
        if (!lynxTextAreaView3.LLJJIJIIJIL && lynxTextAreaView3.LLJJJJJIL) {
            lynxTextAreaView3.LLJJJJJIL = false;
        }
    }

    public static final void onTextChanged$3(C21524019Li c21524019Li, CharSequence charSequence, int i, int i2, int i3) {
        ((AiChatMessageFeatureComponent) c21524019Li.l0).H2().Gv0();
    }

    public static final void onTextChanged$6(C21524019Li c21524019Li, CharSequence charSequence, int i, int i2, int i3) {
        String string;
        Function1<String, Unit> function1 = ((C21296918Vz) c21524019Li.l0).LLLLIL().LJI;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        function1.invoke(string);
    }

    public static final void onTextChanged$7(C21524019Li c21524019Li, CharSequence charSequence, int i, int i2, int i3) {
        ((C21359118iL) c21524019Li.l0).LLJ = charSequence.toString();
        C21359118iL c21359118iL = (C21359118iL) c21524019Li.l0;
        if (c21359118iL.LLJ == null) {
            c21359118iL.LLJ = "";
        }
    }

    public static final void onTextChanged$8(C21524019Li c21524019Li, CharSequence charSequence, int i, int i2, int i3) {
        ((C21359218iM) c21524019Li.l0).LLJ = charSequence.toString();
        C21359218iM c21359218iM = (C21359218iM) c21524019Li.l0;
        if (c21359218iM.LLJ == null) {
            c21359218iM.LLJ = "";
        }
    }

    public static final void onTextChanged$9(C21524019Li c21524019Li, CharSequence charSequence, int i, int i2, int i3) {
        ((C21358818iI) c21524019Li.l0).LLJ = charSequence.toString();
        C21358818iI c21358818iI = (C21358818iI) c21524019Li.l0;
        if (c21358818iI.LLJ == null) {
            c21358818iI.LLJ = "";
        }
    }
}
