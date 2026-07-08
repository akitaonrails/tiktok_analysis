package X;

import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.view.Surface;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TP7, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TP7 extends C09AY implements Function1<C838040WuA, VirtualDisplay> {
    public final /* synthetic */ MediaProjection LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Surface LLIZ;
    public final /* synthetic */ VirtualDisplay.Callback LLIZLLLIL;
    public final /* synthetic */ int LLILZLL = 3;
    public final /* synthetic */ Handler LLJ = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0TP7(MediaProjection mediaProjection, String str, int i, int i2, int i3, Surface surface, C0THM c0thm) {
        super(1);
        this.LL = mediaProjection;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLIZ = surface;
        this.LLIZLLLIL = c0thm;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [android.hardware.display.VirtualDisplay, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final VirtualDisplay invoke(C838040WuA c838040WuA) throws Throwable {
        VirtualDisplay.Callback callback;
        Handler handler;
        MediaProjection mediaProjection = this.LL;
        String str = this.LLILLJJLI;
        int iIntValue = this.LLILLL;
        int iIntValue2 = this.LLILZ;
        int iIntValue3 = this.LLILZIL;
        int iIntValue4 = this.LLILZLL;
        Surface surface = this.LLIZ;
        VirtualDisplay.Callback callback2 = this.LLIZLLLIL;
        Handler handler2 = this.LLJ;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyGdpIIcIGkM9tlnBcBz8J0Uat9SeALkRWht9g4RDbbHRGmiXIQaOLQVIgOEqMkHmnA", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {str, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4), surface, callback2, handler2};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;IIIILandroid/view/Surface;Landroid/hardware/display/VirtualDisplay$Callback;Landroid/os/Handler;)Landroid/hardware/display/VirtualDisplay;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(2920, "android/media/projection/MediaProjection", "createVirtualDisplay", mediaProjection, objArr, "android.hardware.display.VirtualDisplay", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(2920, "android/media/projection/MediaProjection", "createVirtualDisplay", null, objArr, mediaProjection, c0wzw, false);
            return c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                mediaProjection = (MediaProjection) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                str = (String) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
            Object obj4 = c0wsuLIZIZ.LIZJ[3];
            if (obj4 != null) {
                iIntValue2 = ((Integer) obj4).intValue();
            }
            Object obj5 = c0wsuLIZIZ.LIZJ[4];
            if (obj5 != null) {
                iIntValue3 = ((Integer) obj5).intValue();
            }
            Object obj6 = c0wsuLIZIZ.LIZJ[5];
            if (obj6 != null) {
                iIntValue4 = ((Integer) obj6).intValue();
            }
            Object[] objArr3 = c0wsuLIZIZ.LIZJ;
            Object obj7 = objArr3[6];
            if (obj7 != null) {
                surface = (Surface) obj7;
            }
            Object obj8 = objArr3[7];
            if (obj8 != null) {
                callback = (VirtualDisplay.Callback) obj8;
            } else {
                callback = callback2;
            }
            Object obj9 = objArr3[8];
            if (obj9 != null) {
                handler = (Handler) obj9;
            }
            VirtualDisplay virtualDisplayCreateVirtualDisplay = mediaProjection.createVirtualDisplay(str, iIntValue, iIntValue2, iIntValue3, iIntValue4, surface, callback, handler);
            c0wst.LIZ(2920, "android/media/projection/MediaProjection", "createVirtualDisplay", virtualDisplayCreateVirtualDisplay, objArr, mediaProjection, c0wzw, true);
            return virtualDisplayCreateVirtualDisplay;
        }
        callback = callback2;
        handler = handler2;
        VirtualDisplay virtualDisplayCreateVirtualDisplay2 = mediaProjection.createVirtualDisplay(str, iIntValue, iIntValue2, iIntValue3, iIntValue4, surface, callback, handler);
        c0wst.LIZ(2920, "android/media/projection/MediaProjection", "createVirtualDisplay", virtualDisplayCreateVirtualDisplay2, objArr, mediaProjection, c0wzw, true);
        return virtualDisplayCreateVirtualDisplay2;
    }
}
