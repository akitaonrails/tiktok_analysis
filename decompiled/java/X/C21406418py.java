package X;

import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.18py, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21406418py extends RelativeLayout {
    public EditText LL;
    public FrameLayout LLILLJJLI;
    public RelativeLayout LLILLL;
    public TextWatcher LLILZ;
    public boolean LLILZIL;

    public final FrameLayout getConfirmIconView() {
        return this.LLILLJJLI;
    }

    public final EditText getEditText() {
        return this.LL;
    }

    public final EditText getKeyboardEt() {
        return this.LL;
    }

    public C21406418py(Context context) {
        super(context, null, 0, 0);
        try {
            View viewInflate = RelativeLayout.inflate(context, R.layout.dms, this);
            this.LLILLL = (RelativeLayout) viewInflate.findViewById(R.id.obg);
            this.LL = (EditText) viewInflate.findViewById(R.id.obh);
            this.LLILLJJLI = (FrameLayout) viewInflate.findViewById(R.id.obf);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ALog.e("KeyboardInputView", th);
            try {
                Thread.sleep(200L);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                ALog.e("KeyboardInputView", e);
            }
        }
    }

    public final void setStyle(boolean z) {
        int i;
        FrameLayout frameLayout = this.LLILLJJLI;
        if (frameLayout != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LJZ(i, frameLayout);
        }
        if (z) {
            RelativeLayout relativeLayout = this.LLILLL;
            if (relativeLayout != null) {
                relativeLayout.setBackgroundColor(0);
            }
            EditText editText = this.LL;
            if (editText != null) {
                editText.setBackgroundResource(R.drawable.cmr);
                return;
            }
            return;
        }
        RelativeLayout relativeLayout2 = this.LLILLL;
        if (relativeLayout2 != null) {
            relativeLayout2.setBackgroundColor(C20642515q3.LIZIZ(R.attr.zm));
        }
        EditText editText2 = this.LL;
        if (editText2 == null) {
            return;
        }
        editText2.setBackgroundResource(R.drawable.cmp);
    }

    public final void setTextChangedListener(TextWatcher textWatcher) {
        EditText editText;
        EditText editText2;
        TextWatcher textWatcher2 = this.LLILZ;
        if (textWatcher2 != null && (editText2 = this.LL) != null) {
            editText2.removeTextChangedListener(textWatcher2);
        }
        this.LLILZ = textWatcher;
        if (textWatcher != null && (editText = this.LL) != null) {
            editText.addTextChangedListener(textWatcher);
        }
    }
}
