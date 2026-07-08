package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.01dQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C377801dQ {
    public static final void LIZ(Context context, ImageView imageView) {
        if (imageView == null || context == null) {
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_play;
        c419910GdJ.LIZIZ = iLIZIZ;
        c419910GdJ.LIZJ = iLIZIZ;
        imageView.setImageDrawable(c419910GdJ.LIZ(context));
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = iLIZIZ;
            layoutParams.height = iLIZIZ;
        }
    }

    public static final C11JF LIZIZ(final Context context, final ImageView imageView) {
        if (imageView == null || context == null) {
            return null;
        }
        final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
        return (C11JF) C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.03Wy
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Drawable> c09aj) {
                C1C7U.LIZ("PlayImageViewUtilsKt@8d4f.asyncLoadTuxIcon$1");
                try {
                    int i = iLIZIZ;
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_color_play;
                    c419910GdJ.LIZIZ = i;
                    c419910GdJ.LIZJ = i;
                    c09aj.onNext(c419910GdJ.LIZ(context));
                    c09aj.onComplete();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c09aj.onError(e);
                }
                C1C7U.LIZIZ("PlayImageViewUtilsKt@8d4f.asyncLoadTuxIcon$1");
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.01dP
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PlayImageViewUtilsKt@8d4f.asyncLoadTuxIcon$2");
                imageView.setImageDrawable((Drawable) obj);
                ImageView imageView2 = imageView;
                int i = iLIZIZ;
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = i;
                }
                ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = i;
                }
                C1C7U.LIZIZ("PlayImageViewUtilsKt@8d4f.asyncLoadTuxIcon$2");
            }
        }, new C09JN() { // from class: X.00mS
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PlayImageViewUtilsKt@8d4f.asyncLoadTuxIcon$3");
                C1AF0.LJ((Throwable) obj);
                C1C7U.LIZIZ("PlayImageViewUtilsKt@8d4f.asyncLoadTuxIcon$3");
            }
        });
    }
}
