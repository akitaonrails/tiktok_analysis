package X;

import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0J9N, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J9N extends DialogC1389100mFg {
    public final Context LLJILJIL;
    public final C0J9M LLJILJILJ;
    public final String LLJILLL;
    public LiveIconView LLJJ;
    public C0I7D LLJJI;
    public C16F5 LLJJIII;
    public C16FS LLJJIJI;
    public final ACListenerS142S0100000_7 LLJJIJIIJIL;

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() {
        Object obj;
        InputMethodManager inputMethodManager;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9WsFf6+Rmj2S6u5lIjkdBr5XcQqLJC+EbIcHEGXcBYnIhEK8c+Yt/9cdo=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
            super.show();
            c0wst.LIZ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
        }
        C0I7D c0i7d = this.LLJJI;
        if (c0i7d != null) {
            c0i7d.setFocusable(true);
            c0i7d.setFocusableInTouchMode(true);
            c0i7d.requestFocus();
            Object objH2 = C786410Ut5.H2(this.LLJILJIL, "input_method");
            if (!(objH2 instanceof InputMethodManager) || (inputMethodManager = (InputMethodManager) objH2) == null) {
                return;
            }
            inputMethodManager.showSoftInput(c0i7d, 2);
        }
    }

    @Override // X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        Integer numValueOf;
        try {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(Integer.MIN_VALUE);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        super.onCreate(bundle);
        setContentView(R.layout.gap);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setStatusBarColor(0);
        }
        this.LLJJ = (LiveIconView) findViewById(R.id.jzi);
        this.LLJJI = (C0I7D) findViewById(R.id.pv5);
        this.LLJJIII = (C16F5) findViewById(R.id.evp);
        this.LLJJIJI = (C16FS) findViewById(R.id.cpn);
        LiveIconView liveIconView = this.LLJJ;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, this.LLJJIJIIJIL);
        }
        C16FS c16fs = this.LLJJIJI;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, this.LLJJIJIIJIL);
        }
        C16FS c16fs2 = this.LLJJIJI;
        if (c16fs2 != null) {
            c16fs2.setEnabled(false);
            c16fs2.setClickable(false);
        }
        if (!TextUtils.isEmpty(this.LLJILLL)) {
            C0I7D c0i7d = this.LLJJI;
            if (c0i7d != null) {
                c0i7d.setText(this.LLJILLL);
            }
            C16F5 c16f5 = this.LLJJIII;
            if (c16f5 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                String str = this.LLJILLL;
                if (str != null) {
                    numValueOf = Integer.valueOf(str.length());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append("/200");
                c16f5.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            C16F5 c16f52 = this.LLJJIII;
            if (c16f52 != null) {
                c16f52.setText("0/200");
            }
        }
        C0I7D c0i7d2 = this.LLJJI;
        if (c0i7d2 != null) {
            c0i7d2.addTextChangedListener(new C462900IDg(this, 8));
        }
    }

    public C0J9N(Context context, C483110Ix3 c483110Ix3, String str) {
        super(context, R.style.akp);
        this.LLJILJIL = context;
        this.LLJILJILJ = c483110Ix3;
        this.LLJILLL = str;
        this.LLJJIJIIJIL = new ACListenerS142S0100000_7(this, 245);
    }
}
