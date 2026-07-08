package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0KW5, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KW5 extends DialogC19728412Gs {
    public C1390410mHn LL;

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() {
        Object obj;
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2w2c2sgKPyhZoiAyTucNQOC95l2Q8ry8yPe5K6yW8JuhAsS8r9mDEgA912/eGFo+PR6lzOh05HE4g==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
            super.show();
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
        }
        C1390410mHn c1390410mHn = this.LL;
        if (c1390410mHn != null) {
            c1390410mHn.LIZJ();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        C1390410mHn c1390410mHn = this.LL;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
    }

    public C0KW5(Context context) {
        super(context);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fvb);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.0f);
        }
        setCanceledOnTouchOutside(false);
        this.LL = (C1390410mHn) findViewById(R.id.gb3);
    }
}
