package X;

import Y.ACListenerS169S0100000_35;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1Dgs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2262401Dgs extends LinearLayout {
    public C197039127h LL;
    public C197039127h LLILLJJLI;
    public C197039127h LLILLL;
    public C197039127h LLILZ;
    public C197039127h LLILZIL;
    public C197039127h LLILZLL;
    public C197039127h LLIZ;
    public C197039127h LLIZLLLIL;
    public C197039127h LLJ;
    public C197039127h LLJI;
    public C197039127h LLJIJIL;
    public InputConnection LLJILJIL;
    public int LLJILJILJ;
    public String LLJILLL;

    public final void LIZJ() {
        InputConnection inputConnection = this.LLJILJIL;
        if (inputConnection != null) {
            String strValueOf = String.valueOf(inputConnection.getTextBeforeCursor(100, 0));
            String strValueOf2 = String.valueOf(inputConnection.getTextAfterCursor(100, 0));
            this.LLJILJILJ = strValueOf.length();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strValueOf);
            sbLIZ.append(strValueOf2);
            this.LLJILLL = C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public final C197039127h getButton0FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d6h);
            this.LL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final C197039127h getButton1FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d6i);
            this.LLILLJJLI = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final C197039127h getButton2FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d6j);
            this.LLILLL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final C197039127h getButton3FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d6k);
            this.LLILZ = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final C197039127h getButton4FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d6l);
            this.LLILZIL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final C197039127h getButton5FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d6m);
            this.LLILZLL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final C197039127h getButton6FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d6n);
            this.LLIZ = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final C197039127h getButton7FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d6o);
            this.LLIZLLLIL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final C197039127h getButton8FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d6p);
            this.LLJ = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final C197039127h getButton9FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d6q);
            this.LLJI = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final C197039127h getButtonBackFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d72);
            this.LLJIJIL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final InputConnection getInputConnection() {
        return this.LLJILJIL;
    }

    public final void LIZ(char c) {
        String strLIZIZ;
        InputConnection inputConnection = this.LLJILJIL;
        if (inputConnection == null || this.LLJILJILJ >= 20) {
            return;
        }
        inputConnection.commitText(String.valueOf(c), 1);
        int i = this.LLJILJILJ;
        this.LLJILJILJ = i + 1;
        if (i >= this.LLJILLL.length()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLJILLL);
            sbLIZ.append(c);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            String str = this.LLJILLL;
            int i2 = this.LLJILJILJ - 1;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str.substring(0, i2));
            sbLIZ2.append(c);
            sbLIZ2.append(str.substring(i2));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        this.LLJILLL = strLIZIZ;
    }

    public final synchronized void LIZIZ(char c) {
        LIZJ();
        LIZ(c);
    }

    public final void setButton0FromXml(C197039127h c197039127h) {
        this.LL = c197039127h;
    }

    public final void setButton1FromXml(C197039127h c197039127h) {
        this.LLILLJJLI = c197039127h;
    }

    public final void setButton2FromXml(C197039127h c197039127h) {
        this.LLILLL = c197039127h;
    }

    public final void setButton3FromXml(C197039127h c197039127h) {
        this.LLILZ = c197039127h;
    }

    public final void setButton4FromXml(C197039127h c197039127h) {
        this.LLILZIL = c197039127h;
    }

    public final void setButton5FromXml(C197039127h c197039127h) {
        this.LLILZLL = c197039127h;
    }

    public final void setButton6FromXml(C197039127h c197039127h) {
        this.LLIZ = c197039127h;
    }

    public final void setButton7FromXml(C197039127h c197039127h) {
        this.LLIZLLLIL = c197039127h;
    }

    public final void setButton8FromXml(C197039127h c197039127h) {
        this.LLJ = c197039127h;
    }

    public final void setButton9FromXml(C197039127h c197039127h) {
        this.LLJI = c197039127h;
    }

    public final void setButtonBackFromXml(C197039127h c197039127h) {
        this.LLJIJIL = c197039127h;
    }

    public final void setInputConnection(InputConnection inputConnection) {
        this.LLJILJIL = inputConnection;
    }

    public C2262401Dgs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJILLL = "";
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.gob, this, true);
        C786410Ut5.U8(getButton0FromXml(), new ACListenerS169S0100000_35(this, 15));
        C786410Ut5.U8(getButton1FromXml(), new ACListenerS169S0100000_35(this, 16));
        C786410Ut5.U8(getButton2FromXml(), new ACListenerS169S0100000_35(this, 17));
        C786410Ut5.U8(getButton3FromXml(), new ACListenerS169S0100000_35(this, 18));
        C786410Ut5.U8(getButton4FromXml(), new ACListenerS169S0100000_35(this, 19));
        C786410Ut5.U8(getButton5FromXml(), new ACListenerS169S0100000_35(this, 20));
        C786410Ut5.U8(getButton6FromXml(), new ACListenerS169S0100000_35(this, 21));
        C786410Ut5.U8(getButton7FromXml(), new ACListenerS169S0100000_35(this, 22));
        C786410Ut5.U8(getButton8FromXml(), new ACListenerS169S0100000_35(this, 23));
        C786410Ut5.U8(getButton9FromXml(), new ACListenerS169S0100000_35(this, 13));
        C786410Ut5.U8(getButtonBackFromXml(), new ACListenerS169S0100000_35(this, 14));
    }
}
