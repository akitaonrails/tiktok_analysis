package X;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.12YL, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YL implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) throws Throwable {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                break;
            case 1:
                onFocusChange$1(this, view, z);
                break;
            case 2:
                onFocusChange$2(this, view, z);
                break;
            case 3:
                onFocusChange$3(this, view, z);
                break;
            case 4:
                onFocusChange$4(this, view, z);
                break;
        }
    }

    public C12YL(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFocusChange$0(C12YL c12yl, View view, boolean z) {
        if (z) {
            C19604211my c19604211my = (C19604211my) c12yl.l0;
            Context context = c19604211my.getContext();
            c19604211my.getClass();
            KeyboardUtils.LIZIZ(context, view);
            return;
        }
        C19604211my c19604211my2 = (C19604211my) c12yl.l0;
        Context context2 = c19604211my2.getContext();
        c19604211my2.getClass();
        KeyboardUtils.LIZ(context2, view);
    }

    public static final void onFocusChange$1(C12YL c12yl, View view, boolean z) {
        ((C114F) c12yl.l0).LLLLIL().LIZJ.invoke(Boolean.valueOf(z));
        if (z) {
            ((C114F) c12yl.l0).LLLLLLL();
            if (((C114F) c12yl.l0).LLLLIL().LJFF.invoke() == EnumC388580FLk.PANEL_EDITOR) {
                C114F c114f = (C114F) c12yl.l0;
                if (c114f.LLLIIII) {
                    boolean z2 = false;
                    c114f.LLLIIII = false;
                    Function2<String, Boolean, Unit> function2 = c114f.LLLLIL().LJIIL;
                    C0FMR c0fmr = ((C114F) c12yl.l0).LLLFZ;
                    if (c0fmr != null && c0fmr.LIZIZ) {
                        z2 = true;
                    }
                    function2.invoke("input_box", Boolean.valueOf(z2));
                }
            }
        }
    }

    public static final void onFocusChange$2(C12YL c12yl, View view, boolean z) throws Throwable {
        if ((view instanceof EditText) && ((C123X) c12yl.l0).getEditable()) {
            if (z) {
                ((TextView) view).setHint(" ");
                return;
            }
            EditText editText = (EditText) view;
            Editable editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE/TkVLuyhLN6DI8+OhRovjHXyJt1YxLpvbQw3nHcpHEOGA=", null));
            if (editableLLJILLL != null && editableLLJILLL.length() != 0) {
                editText.setHint(" ");
            } else {
                editText.setHint(((C123X) c12yl.l0).getHintString());
            }
        }
    }

    public static final void onFocusChange$3(C12YL c12yl, View view, boolean z) {
        ((C19577711ih) c12yl.l0).LIZIZ(z);
    }

    public static final void onFocusChange$4(C12YL c12yl, View view, boolean z) {
        if (z) {
            C21285918Rt c21285918Rt = (C21285918Rt) c12yl.l0;
            c21285918Rt.LLLIIII = true;
            c21285918Rt.LLLLIL().LJII.invoke("click_prompt_input");
            C21285918Rt c21285918Rt2 = (C21285918Rt) c12yl.l0;
            c21285918Rt2.LLLLLLL().requestFocus();
            Context sceneContext = c21285918Rt2.getSceneContext();
            if (sceneContext != null) {
                KeyboardUtils.LIZIZ(sceneContext, c21285918Rt2.LLLLLLL());
                return;
            }
            return;
        }
        C21285918Rt c21285918Rt3 = (C21285918Rt) c12yl.l0;
        c21285918Rt3.LLLIIII = false;
        Context sceneContext2 = c21285918Rt3.getSceneContext();
        if (sceneContext2 == null) {
            return;
        }
        KeyboardUtils.LIZ(sceneContext2, c21285918Rt3.LLLLLLL());
    }
}
