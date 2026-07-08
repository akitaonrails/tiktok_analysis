package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bPB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractDialogC972150bPB extends C19GI {
    public boolean LLIZLLLIL;
    public View LLJ;

    @Override // X.C19GI
    public final boolean LJJZ() {
        return true;
    }

    public abstract int LJJZZIII();

    public LayoutInflater LJJZZI() {
        return C786410Ut5.ne(getContext());
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLIZLLLIL = true;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLIZLLLIL = false;
    }

    public AbstractDialogC972150bPB(Context context) {
        super(context, R.style.ai5);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewSd = C786410Ut5.Sd(LJJZZIII(), LJJZZI(), null);
        this.LLJ = viewSd;
        setContentView(viewSd);
        if (getWindow() != null) {
            getWindow().setLayout(-1, -2);
            getWindow().setGravity(80);
        }
    }
}
