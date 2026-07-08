package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Window;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0kWr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322870kWr extends C09AY implements Function1<C838040WuA, Unit> {
    public final /* synthetic */ Window LL;
    public final /* synthetic */ Rect LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;
    public final /* synthetic */ PixelCopy.OnPixelCopyFinishedListener LLILZ;
    public final /* synthetic */ Handler LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1322870kWr(Window window, Rect rect, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, BPEAHandler bPEAHandler) {
        super(1);
        this.LL = window;
        this.LLILLJJLI = rect;
        this.LLILLL = bitmap;
        this.LLILZ = onPixelCopyFinishedListener;
        this.LLILZIL = bPEAHandler;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C838040WuA c838040WuA) throws Throwable {
        Window window = this.LL;
        Rect rect = this.LLILLJJLI;
        Bitmap bitmap = this.LLILLL;
        PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener = this.LLILZ;
        Handler handler = this.LLILZIL;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyGdpIIcIGkM9tlnBcBz8J0Uat9SeALkBitrIQMAwPbFTuodqcJsubFQg==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {window, rect, bitmap, onPixelCopyFinishedListener, handler};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/view/Window;Landroid/graphics/Rect;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V", c0wzx);
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
                    rect = (Rect) obj2;
                }
                Object obj3 = objArr2[2];
                if (obj3 != null) {
                    bitmap = (Bitmap) obj3;
                }
                Object obj4 = objArr2[3];
                if (obj4 != null) {
                    onPixelCopyFinishedListener = (PixelCopy.OnPixelCopyFinishedListener) obj4;
                }
                Object obj5 = objArr2[4];
                if (obj5 != null) {
                    handler = (Handler) obj5;
                }
            }
            PixelCopy.request(window, rect, bitmap, onPixelCopyFinishedListener, handler);
            c0wst.LIZ(2824, "android/view/PixelCopy", "request", null, objArr, PixelCopy.class, c0wzw, true);
        }
        return Unit.LIZ;
    }
}
