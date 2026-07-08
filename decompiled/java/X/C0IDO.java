package X;

import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0IDO, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDO implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0IDO(Object obj, View view, Function0<Unit> function0) {
        this.$t = function0;
        this.l0 = obj;
        this.l1 = view;
    }

    public static final void onLayoutChange$0(C0IDO c0ido, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((View) c0ido.l0).removeOnLayoutChangeListener(c0ido);
        ((Function0) c0ido.l1).invoke();
    }

    public static final void onLayoutChange$1(C0IDO c0ido, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c0ido);
        C444880HcU c444880HcU = C0H9N.LIZ;
        View view2 = (View) c0ido.l0;
        Bitmap bitmapLIZ = null;
        if (view2 != null) {
            try {
                bitmapLIZ = C19724012Fa.LIZ(view2, Bitmap.Config.ARGB_8888);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        ((Function1) c0ido.l1).invoke(bitmapLIZ);
    }

    public static final void onLayoutChange$2(C0IDO c0ido, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((View) c0ido.l0).removeOnLayoutChangeListener(c0ido);
        ((Function0) c0ido.l1).invoke();
    }

    public static final void onLayoutChange$3(C0IDO c0ido, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c0ido);
        ((C456050HuV) c0ido.l0).LIZ(((C455920HuI) c0ido.l1).LJ());
    }

    public static final void onLayoutChange$4(C0IDO c0ido, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c0ido);
        C786410Ut5.Fd(view, ((int[]) c0ido.l0)[0] - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        C786410Ut5.Ld(view, ((((int[]) c0ido.l0)[1] - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48))) - ((int[]) c0ido.l1)[1]);
    }
}
