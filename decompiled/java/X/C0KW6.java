package X;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0KW6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KW6 extends DialogC19728412Gs {
    public ImageView LL;

    @Override // android.app.Dialog
    public final void onBackPressed() {
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhmcbMncIUB/z3xLylBinDaEZh22WKeEPKWUT8FPTMRPvyZp6v8JqpmQ==", null);
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
        LJJLIIIJLLLLLLLZ(true);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        LJJLIIIJLLLLLLLZ(false);
    }

    public C0KW6(C19GS c19gs) {
        super(c19gs, R.style.ki);
    }

    public final void LJJLIIIJLLLLLLLZ(boolean z) {
        if (z) {
            ImageView imageView = this.LL;
            if (imageView != null) {
                imageView.startAnimation(AnimationUtils.loadAnimation(imageView.getContext(), R.anim.gi));
                return;
            }
            return;
        }
        ImageView imageView2 = this.LL;
        if (imageView2 == null) {
            return;
        }
        imageView2.clearAnimation();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.d9f);
        this.LL = (ImageView) findViewById(R.id.lno);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        getWindow().setAttributes(attributes);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(null, null, null));
        shapeDrawable.getPaint().setColor(0);
        getWindow().setBackgroundDrawable(shapeDrawable);
        setCanceledOnTouchOutside(false);
    }
}
