package X;

import android.content.Intent;
import android.media.projection.MediaProjectionConfig;
import android.media.projection.MediaProjectionManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TP8, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TP8 extends C09AY implements Function1<C838040WuA, Intent> {
    public final /* synthetic */ MediaProjectionManager LL;
    public final /* synthetic */ MediaProjectionConfig LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0TP8(MediaProjectionManager mediaProjectionManager, MediaProjectionConfig mediaProjectionConfig) {
        super(1);
        this.LL = mediaProjectionManager;
        this.LLILLJJLI = mediaProjectionConfig;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [android.content.Intent, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Intent invoke(C838040WuA c838040WuA) throws Throwable {
        MediaProjectionManager mediaProjectionManager = this.LL;
        MediaProjectionConfig mediaProjectionConfig = this.LLILLJJLI;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyGdpIIcIGkM9tlnBcBz8J0Uat9SeALkRWht9g4RDbbHRGmiXIQaOLQVIgOEqsrBHret23EJmV3mQ==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {mediaProjectionConfig};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/media/projection/MediaProjectionConfig;)Landroid/content/Intent;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(102100, "android/media/projection/MediaProjectionManager", "createScreenCaptureIntent", mediaProjectionManager, objArr, "android.content.Intent", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(102100, "android/media/projection/MediaProjectionManager", "createScreenCaptureIntent", null, objArr, mediaProjectionManager, c0wzw, false);
            return c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                mediaProjectionManager = (MediaProjectionManager) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                mediaProjectionConfig = (MediaProjectionConfig) obj2;
            }
        }
        Intent intentCreateScreenCaptureIntent = mediaProjectionManager.createScreenCaptureIntent(mediaProjectionConfig);
        c0wst.LIZ(102100, "android/media/projection/MediaProjectionManager", "createScreenCaptureIntent", intentCreateScreenCaptureIntent, objArr, mediaProjectionManager, c0wzw, true);
        return intentCreateScreenCaptureIntent;
    }
}
