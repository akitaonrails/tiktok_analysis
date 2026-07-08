package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: X.04J3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04J3 extends AbstractC468201s0 {
    public final int $t;
    public Object l0;

    public static final void onFailed$0(C04J3 c04j3, Throwable th) {
    }

    public static final void onFailed$1(C04J3 c04j3, Throwable th) {
    }

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, bitmap);
                break;
            case 1:
                LIZ$1(this, bitmap);
                break;
            default:
                super.LIZ(bitmap);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, th);
                break;
            case 1:
                onFailed$1(this, th);
                break;
            default:
                super.onFailed(th);
                break;
        }
    }

    public C04J3(View view, int i) {
        this.$t = i;
        this.l0 = view;
    }

    public static final void LIZ$0(C04J3 c04j3, Bitmap bitmap) {
        ((View) c04j3.l0).setBackground(new BitmapDrawable(bitmap));
        View view = (View) c04j3.l0;
        C19ME c19me = new C19ME(((View) c04j3.l0).getWidth(), ((View) c04j3.l0).getHeight());
        c19me.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        C786410Ut5.W5(view, c19me);
    }

    public static final void LIZ$1(C04J3 c04j3, Bitmap bitmap) {
        ((View) c04j3.l0).setBackground(new BitmapDrawable(bitmap));
        View view = (View) c04j3.l0;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(((View) c04j3.l0).getWidth(), ((View) c04j3.l0).getHeight());
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        C786410Ut5.W5(view, layoutParams);
    }
}
