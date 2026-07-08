package X;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0KW4, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KW4 extends DialogC19728412Gs {
    public View LL;

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() {
        Object obj;
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8apzF2SAT85rrg3SYhCtcVgsbbhM7rH438oTPGqgbUGu07RlreedPf/sUeehRz4dmj5n+9yRDLtfLhn2/22FTIw==", null);
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
        View view = this.LL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        View view = this.LL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public C0KW4(C19EG c19eg) {
        super(c19eg, R.style.ki);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.d9h);
        this.LL = findViewById(R.id.nnp);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(null, null, null));
            shapeDrawable.getPaint().setColor(0);
            window.setBackgroundDrawable(shapeDrawable);
        }
        setCanceledOnTouchOutside(false);
    }
}
