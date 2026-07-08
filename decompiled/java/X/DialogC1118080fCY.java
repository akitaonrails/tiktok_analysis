package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0fCY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class DialogC1118080fCY extends C19GI {
    public final boolean LLIZLLLIL;
    public DialogInterface.OnShowListener LLJ;
    public DialogInterface.OnDismissListener LLJI;
    public final DialogInterfaceOnShowListenerC1118090fCZ LLJIJIL;
    public final DialogInterfaceOnDismissListenerC1151680g4k LLJILJIL;

    @Override // X.C19GI
    public final boolean LJJZ() {
        return true;
    }

    @Override // X.C19GI, X.DialogC21505919Ej, android.app.Dialog
    public void onStart() throws JSONException {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            if (this.LLIZLLLIL) {
                window.setLayout(-1, -2);
            } else {
                window.setLayout(-2, -1);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        if (onDismissListener == this.LLJILJIL) {
            super.setOnDismissListener(onDismissListener);
        } else {
            this.LLJI = onDismissListener;
        }
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        if (onShowListener == this.LLJIJIL) {
            super.setOnShowListener(onShowListener);
        } else {
            this.LLJ = onShowListener;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0fCZ, android.content.DialogInterface$OnShowListener] */
    public DialogC1118080fCY(Context context, boolean z) {
        int i;
        if (z) {
            i = R.style.ahb;
        } else {
            i = R.style.ahg;
        }
        super(context, i);
        ?? r4 = new DialogInterface.OnShowListener() { // from class: X.0fCZ
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                DialogC1118080fCY dialogC1118080fCY = this.LL;
                dialogC1118080fCY.getClass();
                C473050Igp.LIZIZ().LIZ();
                DialogInterface.OnShowListener onShowListener = dialogC1118080fCY.LLJ;
                if (onShowListener != null) {
                    onShowListener.onShow(dialogC1118080fCY);
                }
            }
        };
        this.LLJIJIL = r4;
        DialogInterfaceOnDismissListenerC1151680g4k dialogInterfaceOnDismissListenerC1151680g4k = new DialogInterfaceOnDismissListenerC1151680g4k(this, 9);
        this.LLJILJIL = dialogInterfaceOnDismissListenerC1151680g4k;
        Window window = getWindow();
        if (window != null) {
            getWindow().requestFeature(1);
            if (z) {
                window.setGravity(80);
            } else {
                window.setGravity(8388613);
            }
        }
        this.LLIZLLLIL = z;
        setOnShowListener(r4);
        setOnDismissListener(dialogInterfaceOnDismissListenerC1151680g4k);
    }
}
