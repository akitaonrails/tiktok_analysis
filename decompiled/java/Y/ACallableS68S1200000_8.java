package Y;

import X.AbstractC19852312lt;
import X.C098200Yq;
import X.C0L2A;
import X.C0L45;
import X.C0L48;
import X.C189200o6;
import X.C1C7U;
import X.C23250099c;
import X.C23271099x;
import X.C578890Mn9;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import com.ss.android.ugc.aweme.social.creation.api.edit.IStoryCanvasVideoHelper;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS231S0000000_3;

/* JADX INFO: loaded from: classes9.dex */
public class ACallableS68S1200000_8 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS68S1200000_8 aCallableS68S1200000_8) {
        C1C7U.LIZ("VEMediaParserProviderV2@d09d.getBitmapAsync$1$onBitmapLoaded$1");
        C0L48 c0l48 = (C0L48) ((VEMediaParserProviderV2) aCallableS68S1200000_8.l1).LLIZ.getValue();
        String str = aCallableS68S1200000_8.s0;
        ((Bitmap) aCallableS68S1200000_8.l2).getWidth();
        ((Bitmap) aCallableS68S1200000_8.l2).getHeight();
        c0l48.LIZJ(str, new C0L45((Bitmap) aCallableS68S1200000_8.l2), AFwS231S0000000_3.get$arr$(12));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VEMediaParserProviderV2@d09d.getBitmapAsync$1$onBitmapLoaded$1");
        return unit;
    }

    public static final Object call$1(ACallableS68S1200000_8 aCallableS68S1200000_8) {
        Object c098200Yq;
        C1C7U.LIZ("VideoProcessor@449d.getCanvasVideoDataObservable$1$1");
        Object obj = null;
        try {
            c098200Yq = (CanvasVideoData) C23250099c.LJ(C23271099x.INSTANCE, new C0L2A((IStoryCanvasVideoHelper) aCallableS68S1200000_8.l2, (C578890Mn9) aCallableS68S1200000_8.l1, aCallableS68S1200000_8.s0, null));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        AbstractC19852312lt abstractC19852312ltFromNullable = AbstractC19852312lt.fromNullable(obj);
        C1C7U.LIZIZ("VideoProcessor@449d.getCanvasVideoDataObservable$1$1");
        return abstractC19852312ltFromNullable;
    }

    public static final Object call$2(ACallableS68S1200000_8 aCallableS68S1200000_8) {
        C1C7U.LIZ("VEMediaParserFrameProviderImpl@276f.getBitmapByExtractFrame$1$onBitmapLoaded$1");
        C0L48 c0l48 = (C0L48) ((VEMediaParserFrameProviderImpl) aCallableS68S1200000_8.l1).LLILZLL.getValue();
        String str = aCallableS68S1200000_8.s0;
        ((Bitmap) aCallableS68S1200000_8.l2).getWidth();
        ((Bitmap) aCallableS68S1200000_8.l2).getHeight();
        c0l48.LIZJ(str, new C0L45((Bitmap) aCallableS68S1200000_8.l2), AFwS231S0000000_3.get$arr$(188));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VEMediaParserFrameProviderImpl@276f.getBitmapByExtractFrame$1$onBitmapLoaded$1");
        return unit;
    }

    public ACallableS68S1200000_8(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
