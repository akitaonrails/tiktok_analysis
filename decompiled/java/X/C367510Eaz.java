package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Eaz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367510Eaz extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ByteBuffer LL;
    public final /* synthetic */ C367470Eav LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C367510Eaz(ByteBuffer byteBuffer, C367470Eav c367470Eav, String str, int i, int i2, int i3) {
        super(0);
        this.LL = byteBuffer;
        this.LLILLJJLI = c367470Eav;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Bitmap bitmapLIZ;
        ByteBuffer byteBuffer = this.LL;
        if (byteBuffer != null) {
            String str = this.LLILLL;
            int i = this.LLILZ;
            int i2 = this.LLILZIL;
            int i3 = this.LLILZLL;
            bitmapLIZ = C370830EgL.LIZ(new C370830EgL(), byteBuffer, str, i, i2, i3, i3, Bitmap.Config.ARGB_8888, false, 128);
        } else {
            bitmapLIZ = null;
        }
        this.LLILLJJLI.LLJLLL = bitmapLIZ;
        if (bitmapLIZ != null) {
            HashMap<String, Bitmap> map = C367470Eav.LLLLJI;
            String str2 = this.LLILLL;
            synchronized (map) {
                try {
                    map.put(str2, bitmapLIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LLILLJJLI.requestLayout();
            this.LLILLJJLI.invalidate();
        }
        this.LLILLJJLI.LLJZIJLIL = false;
        return Unit.LIZ;
    }
}
