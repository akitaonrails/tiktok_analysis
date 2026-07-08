package X;

import android.text.Spannable;
import android.text.method.MovementMethod;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0QXP, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QXP {
    public static final C0QXP LIZ = new C0QXP();
    public static final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(156));
    public static final int LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    public static final float LJI = C418440Gaw.LIZIZ(6);
    public static Integer LJII;
    public static MovementMethod LJIIIIZZ;

    public static boolean LIZIZ(TextView textView) {
        Spannable spannable;
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            spannable = (Spannable) text;
        } else {
            spannable = null;
        }
        boolean z = false;
        if (spannable == null) {
            return false;
        }
        if (((CharacterStyle[]) spannable.getSpans(0, spannable.length(), C672870QaL.class)).length == 0) {
            z = true;
        }
        return !z;
    }

    public static void LIZLLL(TextView textView) {
        Spannable spannable;
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            spannable = (Spannable) text;
        } else {
            spannable = null;
        }
        List listLJIIJJI = C1697810uHb.LJIIJJI(C672870QaL.class, ClickableSpan.class);
        if (spannable != null) {
            Iterator it2 = listLJIIJJI.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                Object[] spans = spannable.getSpans(0, spannable.length(), (Class) it2.next());
                int length = spans.length;
                int i = 0;
                while (i < length) {
                    spannable.removeSpan(spans[i]);
                    i++;
                    z = true;
                }
            }
            if (z) {
                Integer num = LJII;
                if (num != null) {
                    textView.setHighlightColor(num.intValue());
                }
                MovementMethod movementMethod = LJIIIIZZ;
                if (movementMethod != null) {
                    textView.setMovementMethod(movementMethod);
                }
            }
        }
    }

    public static final CharacterStyle LIZ(MotionEvent motionEvent, TextView textView, Class cls) {
        Spannable spannable;
        CharSequence text = textView.getText();
        if (!(text instanceof Spannable) || (spannable = (Spannable) text) == null) {
            return null;
        }
        Object[] spans = spannable.getSpans(0, textView.getText().length(), C672870QaL.class);
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
        if (((int) motionEvent.getX()) < textView.getTotalPaddingLeft()) {
            return null;
        }
        C089E c089e = new C089E(spans);
        int i = 0;
        while (c089e.hasNext()) {
            C672870QaL c672870QaL = (C672870QaL) c089e.next();
            int i2 = c672870QaL.LLILLL;
            if (x <= c672870QaL.LLILZ && i2 <= x) {
                int i3 = c672870QaL.LLILZIL;
                if (y <= c672870QaL.LLILZLL && i3 <= y) {
                    break;
                }
            }
            i++;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(0, textView.getText().length(), cls);
        if (i >= characterStyleArr.length) {
            return null;
        }
        return characterStyleArr[i];
    }

    public static void LIZJ(C20472080g c20472080g, EditText editText, ImageView imageView, boolean z) {
        int i;
        List<String> list;
        if (imageView != null) {
            C786410Ut5.LJZI(4, imageView);
        }
        if (LIZIZ(editText)) {
            LIZLLL(editText);
        }
        if (c20472080g != null && (list = c20472080g.wordList) != null && !list.isEmpty()) {
            String keyWord = c20472080g.getKeyWord();
            editText.setText(keyWord);
            c20472080g.removeAllWords();
            editText.setSelection(keyWord.length());
        }
        if (editText.getInputType() == 0 && z) {
            if (C123900dZ.LIZ()) {
                i = 1;
            } else {
                i = 524289;
            }
            editText.setInputType(i);
            editText.setCursorVisible(true);
            editText.setLongClickable(true);
            editText.setSelection(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWkPY9z6oqz6OijLIMJ2l2AsudBmLmdXQ/IwUeBRB/MAAo1Br2", null)).length());
            editText.requestFocus();
        }
    }
}
