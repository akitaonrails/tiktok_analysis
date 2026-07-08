package X;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SKq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719620SKq {
    public static final void LIZ(View view, float f, final Function1<? super Bitmap, Unit> function1) {
        Object c098200Yq;
        if (view == null) {
            function1.invoke(null);
            return;
        }
        Integer numValueOf = Integer.valueOf(view.getWidth());
        if (numValueOf.intValue() > 0) {
            numValueOf.intValue();
            Integer numValueOf2 = Integer.valueOf(view.getHeight());
            if (numValueOf2.intValue() > 0) {
                numValueOf2.intValue();
                try {
                    if (view instanceof TextureView) {
                        function1.invoke(((TextureView) view).getBitmap(Bitmap.createBitmap((int) (r5.getWidth() * f), (int) (r5.getHeight() * f), Bitmap.Config.RGB_565)));
                    } else if (view instanceof SurfaceView) {
                        C1474010oSd.LIZIZ((SurfaceView) view, new InterfaceC1474030oSf() { // from class: X.0SKr
                            @Override // X.InterfaceC1474030oSf
                            public final void LIZ(Bitmap bitmap) {
                                function1.invoke(bitmap);
                            }
                        }, (int) (r5.getWidth() * f), (int) (r5.getHeight() * f), Bitmap.Config.RGB_565);
                    } else {
                        function1.invoke(C19724012Fa.LIZ(view, Bitmap.Config.RGB_565));
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    function1.invoke(null);
                    return;
                }
                return;
            }
            function1.invoke(null);
            return;
        }
        function1.invoke(null);
    }
}
