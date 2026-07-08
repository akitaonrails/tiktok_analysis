package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS404S0200000_3;

/* JADX INFO: renamed from: X.09I4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09I4 {
    public static final void LIZ(final String str, final int[] iArr, final Function2<? super C09I6, ? super Bitmap, Unit> function2) {
        if (!TextUtils.isEmpty(str) && C2286708xd.LIZJ(str) && iArr.length >= 2) {
            final C259800zU c259800zU = new C259800zU();
            function2.invoke(C09I6.START, null);
            C15O7.LIZJ(new Callable() { // from class: X.09I3
                /* JADX WARN: Type inference failed for: r0v5, types: [T, android.graphics.Bitmap] */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("StickerResizeHelperKt@f54d.resizePropImage$1");
                    try {
                        C259800zU<Bitmap> c259800zU2 = c259800zU;
                        String str2 = str;
                        int[] iArr2 = iArr;
                        c259800zU2.element = C2475309mx.LJI(iArr2[0], iArr2[1], 0, 4, str2);
                        C0CNO.LIZLLL(0L, new AwS404S0200000_3(function2, c259800zU, 66));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C0CNO.LIZLLL(0L, new AwS404S0200000_3(function2, c259800zU, 67));
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StickerResizeHelperKt@f54d.resizePropImage$1");
                    return unit;
                }
            });
            return;
        }
        function2.invoke(C09I6.ERROR, null);
    }
}
