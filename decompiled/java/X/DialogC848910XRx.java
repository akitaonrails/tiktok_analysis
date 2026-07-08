package X;

import android.content.Context;
import android.os.Bundle;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0XRx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class DialogC848910XRx extends DialogC19728412Gs {
    public C1390130mHL LL;

    @Override // android.app.Dialog
    public final void onBackPressed() {
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        C1390130mHL c1390130mHL = this.LL;
        if (c1390130mHL != null) {
            C786410Ut5.LLZ(c1390130mHL, 0);
        }
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6nbZ7a1T21WL9LhwjpKPWfPT2Ubkdl17RIQ5E=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
        super.show();
        c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
    }

    public DialogC848910XRx(Context context) {
        super(context, R.style.ie);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bng);
        C1390130mHL c1390130mHL = (C1390130mHL) findViewById(R.id.g2n);
        this.LL = c1390130mHL;
        if (c1390130mHL != null) {
            c1390130mHL.setMessage(R.string.txr);
        }
        C1390130mHL c1390130mHL2 = this.LL;
        if (c1390130mHL2 != null) {
            C786410Ut5.LLZ(c1390130mHL2, 0);
        }
        setCanceledOnTouchOutside(false);
    }
}
