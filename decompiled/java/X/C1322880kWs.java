package X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0kWs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322880kWs extends C09AY implements Function1<C838040WuA, Unit> {
    public final /* synthetic */ Window LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ PixelCopy.OnPixelCopyFinishedListener LLILLL;
    public final /* synthetic */ Handler LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1322880kWs(Window window, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
        super(1);
        this.LL = window;
        this.LLILLJJLI = bitmap;
        this.LLILLL = onPixelCopyFinishedListener;
        this.LLILZ = handler;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C838040WuA c838040WuA) throws Throwable {
        Window window = this.LL;
        Bitmap bitmap = this.LLILLJJLI;
        PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener = this.LLILLL;
        Handler handler = this.LLILZ;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyGdpIIcIGkM9tlnBcBz8J0Uat9SeALkBitrIQMAwPbFTuodqcJsubFQg==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {window, bitmap, onPixelCopyFinishedListener, handler};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/view/Window;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(2824, "android/view/PixelCopy", "request", PixelCopy.class, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(2824, "android/view/PixelCopy", "request", null, objArr, PixelCopy.class, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    window = (Window) obj;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    bitmap = (Bitmap) obj2;
                }
                Object obj3 = objArr2[2];
                if (obj3 != null) {
                    onPixelCopyFinishedListener = (PixelCopy.OnPixelCopyFinishedListener) obj3;
                }
                Object obj4 = objArr2[3];
                if (obj4 != null) {
                    handler = (Handler) obj4;
                }
            }
            PixelCopy.request(window, bitmap, onPixelCopyFinishedListener, handler);
            c0wst.LIZ(2824, "android/view/PixelCopy", "request", null, objArr, PixelCopy.class, c0wzw, true);
        }
        return Unit.LIZ;
    }
}
